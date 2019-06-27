/*Everything in JavaScript is either truthy or falsy.*/

if(function(){}) console.log("truth")//truthy
if(true) console.log("truthy") //truthy
if(false) console.log("falsy") //falsy
if("") console.log("falsy") //falsy
if(null) console.log("falsy") //falsy
if(undefined) console.log("falsy") //falsy
if(" ") console.log("truthy") //truthy
if({}) console.log("truthy") //truthy
if(0) console.log("falsy") //falsy
if(1) console.log("truthy") //truthy
if(-28) console.log("truthy") //truthy
if(NaN) console.log("falsy") //falsy

