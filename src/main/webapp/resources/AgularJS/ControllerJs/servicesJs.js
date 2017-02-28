var services = angular.module('ngdemo.services', ['ngResource']);

services.factory('UserFactory', function ($resource) {
    return $resource('http://169.254.223.24:1111/STB_Serveur/ref/allDeviseQ', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    });
});

