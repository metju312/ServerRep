/**
 * Created by Metju on 2015-10-31.
 */

$(document).ready(function(){
    $.ajax({
        url: 'http://localhost:8080/list',
        type: 'GET',
        data: '', // or $('#myform').serializeArray()
        //data: 'ID=1&Name=John&Age=10', // or $('#myform').serializeArray()
        success: onUsersLoaded
    });
    function onUsersLoaded(users) {
        for (i = 0; i < users.length; i++) {
            var newRow = "<tr>" +
                "<td>" +
                users[i].login +
                "</td>" +
                "<td>" +
                users[i].password +
                "</td>" +
                "</tr>";
            $('#usersTable tr:last').after(newRow);
        }
    }
});
