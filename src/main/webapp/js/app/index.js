$(document).ready(function() {
    
    $('#get-donkeys-button').click(function() {
        Donkey.getDonkeys();
    });
    
    $('#reset-stable-template-populated').click(function() {
        $('#stable-template-populated').html('');
    });
    
    $('#stable-template-populated').on('click', '.donkeySiblingsLink', function(e) {
        e.preventDefault();
        e.stopPropagation();
        Donkey.getDonkeySiblings(this.id);
    });
    
    $('#stable-template-populated').on('click', '.donkeyDetails', function(e) {
        e.preventDefault();
        e.stopPropagation();
        Donkey.getDonkey(this.id);
    });

});