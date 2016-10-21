/**
 * Created by liuyang on 16-9-21.
 */
angular.module("UserService", [])
    .factory('userService', ["$q", "$http", '$timeout', function ($q, $http, $timeout) {
        //查找所有
        var findAll = function () {
            var deferred = $q.defer();
            var promise = deferred.promise;
            $http.get("/user/findAll")
                .success(function (data) {
                    $timeout(function () {
                        deferred.resolve(data);
                    })
                })
                .error(function (error) {
                    $timeout(function () {
                        deferred.reject(error);
                    })
                });
            return promise;
        }
        //登陆
        var login = function (data) {
            console.log("login", data);
            var deferred = $q.defer();
            var promise = deferred.promise;
            $http.post('/user/login', data)
                .success(function (data) {
                    $timeout(function () {
                        deferred.resolve(data);
                    })
                })
                .error(function (error) {
                    $timeout(function () {
                        deferred.reject(error);
                    })
                });
            return promise;
        }

        //注册
        var saveUser = function (data) {
            var deferred = $q.defer();
            var promise = deferred.promise;
            $http.post('/user/saveUser', data).success(function (data) {
                $timeout(function () {
                    deferred.resolve(data);
                })
            }).error(function (error) {
                $timeout(function () {
                    deferred.reject(error);
                })
            });
            return promise;
        }

        return {
            findAll: findAll,
            login: login,
            saveUser:saveUser
        };
    }]);