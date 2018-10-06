<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<h1>Bookstore</h1>
<xsl:apply-templates />
</body>
</html>
</xsl:template>

<xsl:template match="book">
<p>
<xsl:apply-templates select="title"/>
<xsl:apply-templates select="author"/>
</p>
</xsl:template>

<xsl:template match="title">
Title: <span style="color:#ff00ff"><xsl:value-of select="."/></span>
</xsl:template>

<xsl:template match="author">
Author: <span style="color:#ff1234"><xsl:value-of select="."/></span>
</xsl:template>

</xsl:stylesheet>