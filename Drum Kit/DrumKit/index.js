var numberOfDrumButtons = document.querySelectorAll(".drum").length;

for (var i = 0; i < numberOfDrumButtons; i++) {

    /*document.querySelector("button").addEventListener("click", handleClick); 
     
    function handleClick() {
        alert("I got clicked!");
    }*/
    /*addEventLIstener --- event type listen to
     instead of calling function we are taking the name of the input so handleClick*/



    document.querySelectorAll(".drum")[i].addEventListener("click", function() {
        this.style.color = "white";
    });
    /*What to do when click detected */
}




/*
var audio = new Audio("sounds/tom-1.mp3");
audio.play();*/