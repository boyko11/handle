$(document).ready(function() {
    
    Handlebars.registerHelper('fullName', function(data) {
        return data.firstName + " " + data.lastName;
    });
});


var HandlebarsService = {
        
        renderData : function (templateId, populatedTemplateId, data) {
            
            var stableTemplateSource = $("#" + templateId).html();
            var template = Handlebars.compile(stableTemplateSource);
            var populatedTemplateHtml = template(data);
            $("#" + populatedTemplateId).html(populatedTemplateHtml);
        }
}