var Donkey = {

    getDonkeys : function() {
    	
    	$.ajax({
    	    
    	    //GET JSON FROM SERVER
    		url : "/handle/stable",
    		
    	}).done(function(data) {
    	    //GET THE TEMPLATE
    		var stableTemplateSource = $("#stable-template").html();
    		
    		//COMPILE THE HTML TEMPLATE
    		var template = Handlebars.compile(stableTemplateSource);
    		
    		//MARRY the JSON received from the server with the HTML TEMPLATE
    		//In other words: Populate the template with the dynamic data to produce the final HTML
    		var populatedTemplateHtml = template(data);
    		
    		//DISPLAY the populated html to the user
    		$("#stable-template-populated").html(populatedTemplateHtml);
    		
    	}).fail(function(xhr, textStatus, errorThrown) {
    		alert("Hey there donkey, error happened.\nResponseText: " + xhr.responseText + "\nStatus: " + textStatus + "\nError: " + errorThrown);
    	});
    		
     }
}

