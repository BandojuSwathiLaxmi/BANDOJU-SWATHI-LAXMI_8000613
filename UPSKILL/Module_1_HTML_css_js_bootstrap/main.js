console.log("Welcome to the Community Portal");

window.onload = function(){
    alert("Page Fully Loaded");
};

window.addEventListener("load",function(){
    let saved =localStorage.getItem("preferredEvent");
    if(saved){
        document.getElementById("eventType").value= saved;
    }
});
const eventname= "";
const eventdate = "";
let seats=100;
console.log(`${eventname} on ${eventdate}`);
seats--;
console.log("Seats left: "+seats);

const events = [
    {
        name: "Music Concert",date: "2026-12-20",seats: 20
    },
    {
        name: "Food Festival",date: "2024-01-10",seats: 0
    },
    {
        name: "Sports Tournament",date: "2026-08-15",seats: 15
    }
];

events.forEach(function(event){
    let today = new Date();
    let eventDate = new Date(event.date);
    if(eventDate > today && event.seats > 0){
        console.log(`${event.name} is available with ${event.seats} seats`);
    }
    else{
        console.log(`${event.name} is unavailable`);
    }
});


function enlarge(img){
    img.style.width = "400px";
    img.style.height = "400px";
}

function validatePhone(){
    let phone = document.getElementById("phone").value;
    if(phone.length != 10){
        alert("Enter valid 10 digit number");
    }
}

function showFee(){
    let fee =document.getElementById("eventType").value;
    document.getElementById("fee").innerHTML ="Event Fee: ₹" + fee;
    localStorage.setItem("preferredEvent", fee);
}

function filterCategory(){
    let category =document.getElementById("eventType").value;
    console.log("Filtering category:",category);
}

function registered(){
    document.getElementById("outputmsg").innerHTML ="Registration Successful";
}

function countCharacters(){
    let text =document.getElementById("feedback").value;
    document.getElementById("charCount").innerHTML = text.length;
}

function videoReady(){
    document.getElementById("videoMessage").innerHTML ="Video ready to play";
}

function findLocation(){
    if(navigator.geolocation){
    navigator.geolocation.getCurrentPosition(showPosition,showError,{
        enableHighAccuracy:true,
        timeout:5000
    });
    }
    else{
       alert( "Geolocation not supported");
    }
}

function showPosition(position){
    document.getElementById("location").innerHTML ="Latitude: "+ position.coords.latitude + "<br>Longitude: "+ position.coords.longitude;
}

function showError(error){
    switch(error.code){
        case error.PERMISSION_DENIED:
            alert("Permission Denied");
            break;
        case error.TIMEOUT:
            alert("Request Timed Out");
            break;
        default:alert("Location Error");
    }
}

window.onbeforeunload = function(){
    return "Are you sure you want to leave?";
}

function clr(){
    localStorage.clear();
    sessionStorage.clear();
    alert("Preferences Cleared");
}

document.getElementById("registerform").addEventListener("submit", function(event){
    event.preventDefault();
    let form = event.target;
    let name = form.elements["name"].value;
    let email = form.elements["email"].value;
    console.log("Form submission started");
    console.log("Name:",name);
    console.log("Email:",email);

    if(name === "" || email === ""){
        alert("Please Fill All Fields");
        return;
    }

    document.getElementById("outputmsg")
    .innerHTML = "Registration Successful";

    console.log("Submitting request...");
});

let eventCategories = ["Music","Food","Sports"];
eventCategories.push("Workshop");
let musicEvents =eventCategories.filter(event => event == "Music");
console.log(musicEvents);
let displayCards =eventCategories.map(event => `Workshop on ${event}`);
console.log(displayCards);

/* Fetch API */

fetch("https://jsonplaceholder.typicode.com/posts").then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.log(error));

/* Async Await */

async function fetchData(){
    try{
        let response =await fetch("https://jsonplaceholder.typicode.com/posts");
        let data = await response.json();
        console.log(data);
    }
    catch(error){
        console.log(error);
    }
}
fetchData();

function Event(name,seats){
    this.name = name;
    this.seats = seats;
}
Event.prototype.checkAvailability = function(){
    return this.seats > 0;
};
let e1 = new Event("Music",50);
console.log(e1.checkAvailability());
console.log(Object.entries(e1));

function registerEvent(eventName){
    try{
        let foundEvent = events.find(
            event => event.name === eventName
        );
        if(!foundEvent){
            throw new Error("Event Not Found");
        }
        if(foundEvent.seats <= 0){
            throw new Error("No Seats Available");
        }
        foundEvent.seats--;
        console.log(`Registration Successful for ${eventName}`);
        console.log(`Remaining Seats: ${foundEvent.seats}`);
    }
    catch(error){
        console.log("Registration Failed: " + error.message );
    }
}
registerEvent("Music Concert");

function addEvent(name, category){
    console.log(`Event Added: ${name} (${category})`);
}

function registerUser(userName, eventName){
    console.log(`${userName} registered for ${eventName}`);
}

function filterEventsByCategory(category){
    return events.filter(event =>
        event.name.toLowerCase().includes(
            category.toLowerCase()
        )
    );
}

function registrationTracker(){
    let totalRegistrations = 0;
    return function(){
        totalRegistrations++;
        console.log(`Total Registrations: ${totalRegistrations}`);
    };
}

const trackRegistrations = registrationTracker();
trackRegistrations();

function searchEvents(callback){
    callback(events);
}
searchEvents(function(eventList){
    eventList.forEach(function(event){
        console.log(`Available Event: ${event.name}`);
    });
});

addEvent("Dance Show","Cultural");
registerUser(
    "Swathi",
    "Music Concert"
);
console.log(
    filterEventsByCategory("Music")
);

let card = document.createElement("div");
card.className = "eventCard";
card.innerHTML ="<h3>Community Workshop</h3><p>New Event Added Dynamically</p>";
document.body.appendChild(card);

function createEvent(eventName = "Community Event"){
    console.log(eventName);
}
createEvent();

const {
    name,
    seats: availableSeats
} = e1;

console.log(name);
console.log(availableSeats);

let copiedEvents =
[...eventCategories];

console.log(copiedEvents);


fetch(
    "https://jsonplaceholder.typicode.com/posts",
    {
        method: "POST",
        headers:{
            "Content-Type":"application/json"
        },
        body: JSON.stringify({
            name:"Swathi",
            event:"Music Concert"
        })
    }
)
.then(response => response.json())
.then(data => {
    console.log("POST Success");
    console.log(data);
})
.catch(error => {
    console.log(error);
});

setTimeout(function(){
    console.log("Registration Successful After Delay");
},2000);

$("#registerBtn").click(function(){
    $(".eventCard").fadeOut(1000);
    setTimeout(function(){
        $(".eventCard").fadeIn(1000);
    },1500);
});

console.log(
    "React and Vue make applications easier to manage using reusable components and state management."
);