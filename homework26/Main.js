var http=require('http');

var server=http.createServer(function(req,res){
       res.write('this is my first server');
       res.end();

});

server.listen(8080);

console.log('server is running at http://localhost:8080'); 

var expresss=require('express');