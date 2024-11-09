





var tablestatut = document.querySelectorAll(".tableau");
var titre = [];
var selectElement = [];
var idDivStatut = [];
for( p = 0; p < tablestatut.length; p++){
    titre[p]= tablestatut[p].title;
    selectElement[p] = document.getElementById("users,"+titre[p]);
    idDivStatut[p] = document.getElementById("id"+titre[p]).textContent;
    console.log(selectElement[p]);
    if(idDivStatut[p] == 1){
        selectElement[p].value = "1";
    } else if(idDivStatut[p] == 2){
        selectElement[p].value = "2";
    } else if(idDivStatut[p] == 3){
        selectElement[p].value = "3";
    } else if(idDivStatut[p] == 4){
        selectElement[p].value = "4";
    }
}
// Envoyer automatiquement les données du formulaire à la servlet lorsqu'elles sont entrées

// document.getElementById("monFormulaireTicket").addEventListener("input", function(){
// document.getElementById("monFormulaireTicket").submit();
// });

// document.getElementById("monFormulaireComment").addEventListener("input", function(){
// document.getElementById("monFormulaireComment").submit();
// });

function handleClick(event) {
  // récupération de l'id de l'utilisateur à supprimer
  var idUser = event.target.title;

  // récupération de l'id du tableau à supprimer
  var idligne = idUser.split(",");
  var idnumber = idligne[1]; // user5 => u s e r 5

  var tableau = document.getElementById("ligne" + idnumber);

  // récupération date, site, ds, plateform, statut
  console.log(tableau.length);

  // affichage du nom de l'utilisateur qui prend un site
  event.target.onchange = function() {
    var selectedValue = event.target.value;
    var user = document.getElementById(idUser);
    var getuser = document.getElementById("user").innerHTML;
    var ticket = document.getElementById("ticket" + idnumber).value;
    var comment = document.getElementById("coms" + idnumber).value;
    var idUsersession = idUserJs;

    switch (selectedValue) {
      case "1":
        user.innerHTML = "";

        var xhrstatut = new XMLHttpRequest();
        xhrstatut.open("POST", "ServletModifStatut", true);
        xhrstatut.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhrstatut.onreadystatechange = function() {
          if (xhrstatut.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhrstatut.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue));
        break;

      case "2":
        user.innerHTML = getuser;

        var xhr = new XMLHttpRequest();
        xhr.open("POST", "SaveItemServlet", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhr.onreadystatechange = function() {
          if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhr.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&ticket=" + encodeURIComponent(ticket) + "&comment=" + encodeURIComponent(comment) + "&idUser=" + encodeURIComponent(idUsersession));

        var xhrstatut = new XMLHttpRequest();
        xhrstatut.open("POST", "ServletModifStatut", true);
        xhrstatut.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhrstatut.onreadystatechange = function() {
          if (xhrstatut.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhrstatut.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&idUser=" + encodeURIComponent(idUsersession));

        break;

      case "3":
        user.innerHTML = getuser;

        var xhr = new XMLHttpRequest();
        xhr.open("POST", "SaveItemServlet", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhr.onreadystatechange = function() {
          if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhr.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&ticket=" + encodeURIComponent(ticket) + "&comment=" + encodeURIComponent(comment) + "&idUser=" + encodeURIComponent(idUsersession));

        var xhrstatut = new XMLHttpRequest();
        xhrstatut.open("POST", "ServletModifStatut", true);
        xhrstatut.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhrstatut.onreadystatechange = function() {
          if (xhrstatut.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhrstatut.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&idUser=" + encodeURIComponent(idUsersession));

        break;

      case "4":
        var bool = 1;
        user.innerHTML = getuser;

        var xhr = new XMLHttpRequest();
        xhr.open("POST", "SaveItemServlet", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhr.onreadystatechange = function() {
          if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhr.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&ticket=" + encodeURIComponent(ticket) + "&comment=" + encodeURIComponent(comment) + "&idUser=" + encodeURIComponent(idUsersession) + "&boolstatut=" + encodeURIComponent(bool));

        var xhrstatut = new XMLHttpRequest();
        xhrstatut.open("POST", "ServletModifStatut", true);
        xhrstatut.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        xhrstatut.onreadystatechange = function() {
          if (xhrstatut.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log("Réponse du serveur : " + xhr.responseText);
            location.reload(); // Actualisation de la page
          }
        };
        xhrstatut.send("idsite=" + encodeURIComponent(idnumber) + "&idstatut=" + encodeURIComponent(selectedValue) + "&idUser=" + encodeURIComponent(idUsersession));

        tableau.remove();
        break;
    }
  }
}


// Recharge la page après 30 minute
setTimeout(function() {
  location.reload();
}, 15 * 60 * 1000);







