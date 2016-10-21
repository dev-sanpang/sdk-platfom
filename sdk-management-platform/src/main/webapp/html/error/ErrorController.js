/**
 * Created by liuyang on 16-9-26.
 */
var errorControllers = angular.module('ErrorController', []);
errorControllers.controller("errorCtrl", ['$scope', '$state', function ($scope, $state) {
    console.log('404');
}]);