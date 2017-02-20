var app=angular.module('app',[])

app.controller('emp', ['$scope', '$http',function($scope,$http){

	$scope.a=10;
	$scope.b=20;
	$scope.dosum=function(){
		//$scope.sum=parseInt($scope.a) + parseInt($scope.b);
      $http({
      	url:'http://localhost:4467/sum?a=' + $scope.a + '&b' + $scope.b,
      	method:'GET' 

      }).then(function(resp){
      	
      	$scope.sum=resp.data;
      }, function(resp){
      	alert("error occured");
      });
	};
	
}]);