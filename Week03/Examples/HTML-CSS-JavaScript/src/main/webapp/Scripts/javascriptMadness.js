function daFunk(){
	return function(){
		console.log("inner function");
			function daFunkAgain(){
				console.log("inner inner function");
            }
			daFunkAgain();
    }
}

