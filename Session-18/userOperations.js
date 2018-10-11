const userOperations = {
    users:[],
    validate(userid,password){
        /*if(userid === "" || password === ""){
            return false;
        }
        return true;*/
        return (userid === "" || password === "") ? false : true; 
    },
    authenticate(userid,password){
        /*var jsonObject = JSON.parse(localStorage.getItem("savedUserArray"));
        for(let i=0;i<jsonObject.length;i++){
            var tempObject = new User(jsonObject[i].userid,jsonObject[i].password);
            this.users.push(tempObject);
        }*/
        for(let i=0;i<this.users.length;i++){
            if(this.users[i].userid === userid){
                if(this.users[i].password === password){
                    return true;
                }
                else{
                    return false;
                }
            } 
            return false;
        }

        }

    }
    
    
    
    
    
    
    
    /*flag:true,
    arr:[],
    add(){
    },
    subtract(){

    }*/


//var flag = true;
//var flag2 = "true";
//flag == flag2 //false/
//true == "true" //true
//===