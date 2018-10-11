var jsonfile;
window.addEventListener("load",()=>{
    document.getElementById("submitBtn").addEventListener("click",doLogin);

    fetch("https://raw.githubusercontent.com/anmolrajaroraa/json/master/users_json")
    .then(response=>{
        response.json().then(data=>{
            console.log(data.users);
            for(let i=0; i<data.users.length; i++){
                var tempObject = new User(data.users[i].email,data.users[i].password);
                userOperations.users.push(tempObject);
            }
            console.log("UserArray " + userOperations.users);
        })
    })
    .catch(err=>{
        console.log("error is " + err);
    })
});

//()=>{
    /*var user1 = new User("tom","1234");
    var user2 = new User("bill","1234");
    var user3 = new User("andy","1234");
    var userArray = [];
    userArray.push(user1);
    userArray.push(user2);
    userArray.push(user3);
    localStorage.setItem("savedUserArray",JSON.stringify(userArray));*/
//});

function doLogin(){
    var userid = document.getElementById("userid").value;
    var password = document.querySelector("#password").value;
    //var result = userOperations.validate(userid,password);
    //if(result){ 
    if(userOperations.validate(userid,password)){
        if(userOperations.authenticate(userid,password)){
            console.log("Login successful");
            console.log("Hello " + userid);
        }
        else{
            console.log("Please enter correct userid and password");
        }
    }
    else{
        console.log("Userid or password cant be empty");
    }

    //userOperations.validate(userid,password) ? console.log("Login successful") : console.log("Login unsuccesful");
}


function runFunc(){
    var btn = document.getElementById("submitBtn");
    btn.addEventListener("click",runAnotherFunc);
    alert("hello");
}

function runAnotherFunc(){
    console.log("Inside runAnotherFunc");
}

//var student = new Student();
//student = new Teacher();

//loosely typed language - JS
//strictly typed language - Java
//Ajax - Asynchronous Javascript and xml
//Json - javascript object notation