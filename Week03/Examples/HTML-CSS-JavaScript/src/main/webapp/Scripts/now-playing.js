function get(url){
	let divvy = document.getElementById("apiDiv");
	
	let xhr = new XMLHttpRequest(); //Ready State 0
	
	/*
	 * An XMLHttpRequest has a property called "onreadystatechange".
	 * This property takes a callback function. A callback function is
	 * a function that is passed to another function and/or called from
	 * within another function.
	 * 
	 * Each time the ready state changes, this "onreadystatechange"
	 * property's callback function is executed.
	 */
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState === 4 && xhr.status === 200){
			/*
			 * At this point, we will grab the JSON that was fetched
			 * from the API and do some DOM manipulation using the
			 * information that was returned.
			 */
			
			let movies = JSON.parse(xhr.responseText);
			console.log(movies);
			
			for(let m in movies["Search"]){
				let img = document.createElement("img");
				img.src = movies["Search"][m]["Poster"];
				img.style.borderRadius = "5px";
				divvy.append(img);
			}
		}
	}
	
	xhr.open("GET", url); //Ready State 1
	/*
	 * In order to get any resources from this API we're using, we have to
	 * set some request headers in order to be authenticated.
	 */
	xhr.setRequestHeader("", "");
	xhr.setRequestHeader("", "");
	xhr.send(); //Ready State 2
}

function propagateAPIMovies(searchTerm){
	let url = "https://movie-database-imdb-alternative.p.rapidapi.com/?s="+searchTerm;
	this.get(url);
}

window.onload = function() {
	this.propagateAPIMovies('south park');
}
