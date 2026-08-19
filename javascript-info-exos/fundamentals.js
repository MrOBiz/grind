"use strict";

//ARROW FUNCTIONS

let ask = (question, yes, no) => (question.length > 10)? yes() : no();

ask("Do you agree?", () => console.log("Agreed."), () => console.log("Nope."));

//OBJECTS

let user = {};

user.name = "John";
user.surname = "Smith";
console.log(user.name);
console.log(user.surname);


user.name = "Pete";
console.log(user.name);

delete user.name;
console.log(user.name);