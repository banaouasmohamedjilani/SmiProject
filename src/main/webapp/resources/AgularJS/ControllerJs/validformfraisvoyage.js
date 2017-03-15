var vform = angular.module("myForm", []);

vform.controller('vform', function ($scope) {


    $scope.checkErr = function (startDate, endDate) {
        console.log("aaaa");
        $scope.errMessage = "";
        var curDate = new Date();
        console.log(curDate);

        if (startDate > endDate) {
            $scope.errMessage = "End Date should be greater than start date";
            angular.element('#startDate').css('background-color', 'pink');
            return false;
        }
        if (startDate < curDate.setDate(curDate.getDate() - 1)) {
            $scope.errMessage = 'Start date should not be before today.';
            return false;
        }
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