$(document).ready(function() {
    
    $('#get-donkeys-button').click(function() {
        Donkey.getDonkeys();
    });
    
    $('#reset-stable-template-populated').click(function() {
        $('#stable-template-populated').html('');
    });
    
    Handlebars.registerHelper('fullName', function(data) {
        return data.firstName + " " + data.lastName;
    });
});