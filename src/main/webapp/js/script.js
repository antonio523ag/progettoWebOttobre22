var visualizzato;

function myFunction(name) {
  	x = document.getElementById(name);
  	y = document.getElementById("title");
  	msg = document.getElementById("msg");
  	msg.innerHTML = "";
  	if(visualizzato!=null)visualizzato.style.display = "none";
  	if (x.style.display === "none") {
    	x.style.display = "block";
    	visualizzato = x;
    	y.innerHTML=name;
  	} else {
    	x.style.display = "none";
    	visualizzato = null;
  	}
}

function myFunction2(name,msg) {
  	x = document.getElementById(name);
  	y = document.getElementById("title");
  	msg = document.getElementById("msg");
  	msg.innertext = msg;
  	if(visualizzato!=null)visualizzato.style.display = "none";
  	if (x.style.display === "none") {
    	x.style.display = "block";
    	visualizzato = x;
    	y.innerHTML=name;
  	} else {
    	x.style.display = "none";
    	visualizzato = null;
  	}
}