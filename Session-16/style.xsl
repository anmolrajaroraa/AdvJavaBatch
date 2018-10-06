<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<body>
			<table border="1"> 
			<tr bgcolor="ff1234">
				<th>Title</th>
				<th>Author</th>
			</tr>
			<xsl:for-each select="bookstore/book">
			<xsl:sort select="price"/>
			<!--<xsl:if test="price &gt;= 30">  -->
				<tr>
					<td><xsl:value-of select="title"/></td>
					<xsl:choose>
						<xsl:when test="price &gt; 30">
						<td bgcolor="ff00ff"><xsl:value-of select="author"/></td>
						</xsl:when>
						<xsl:otherwise>
						<td><xsl:value-of select="author"/></td>
						</xsl:otherwise>
					</xsl:choose>
				</tr>
			<!--</xsl:if>-->
			</xsl:for-each>
			</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
