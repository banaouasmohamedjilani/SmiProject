var vform = angular.module("myForm", []);

vform.controller('vform', function ($scope,$http) {

$http.get("https://jsonplaceholder.typicode.com/users").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
  });
  $http.get("https://jsonplaceholder.typicode.com/users?id=1").then(function(response){
        $scope.Obbj = response.data;
        
      console.log($scope.Obbj);
  });
    $scope.checkErr = function (startDate, endDate) {
        console.log("aaaa");
        $scope.errMessage = "";
        var curDate = new Date();
        console.log(curDate);

        if (startDate > endDate) {
            $scope.errMessage = "End Date should be greater than start date";
            angular.element('#endDate').css('background-color', 'pink');
            return false;
        }
        if (startDate < curDate.setDate(curDate.getDate() - 1)) {
            $scope.errMessage = 'Start date should not be before today.';
            angular.element('#startDate').css('background-color', 'pink');
            return false;
        }
        angular.element('#startDate').css('background-color', 'lightgreen');
        angular.element('#endDate').css('background-color', 'lightgreen');
        return true;
    };

});

vform.controller('fessCntrl', function ($scope) {

});

vform.$inject = ['$scope'];


vform.directive('format', ['$filter', function ($filter) {
        return {
            require: '?ngModel',
            link: function (scope, elem, attrs, ctrl) {
                if (!ctrl)
                    return;


                ctrl.$formatters.unshift(function (a) {
                    return $filter(attrs.format)(ctrl.$modelValue);
                });


                ctrl.$parsers.unshift(function (viewValue) {
                    var plainNumber = viewValue.replace(/[^\d|\-+|\.+]/g, '');
                    elem.val($filter(attrs.format)(plainNumber));
                    return plainNumber;
                });
            }
        };
    }]);