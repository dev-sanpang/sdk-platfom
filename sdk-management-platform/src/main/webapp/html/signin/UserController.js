/**
 * Created by liuyang on 16-9-21.
 */
'use strict';
angular.module("UserController", [])
    .controller("userCtrl", ['$scope', '$state', 'userService', function ($scope, $state, userService) {
        $("body").addClass("signin");
        $scope.msgshow = false;
        // 取消
        $scope.msgcancel = function () {
            $scope.msgshow = false;
        }
        // 账户名字符验证
        jQuery.validator.addMethod("stringCheck", function (value, element) {
            return this.optional(element) || /^[a-zA-Z0-9]+$/.test(value);
        }, "只能输入英文字母和数字");

        $("#signinForm").validate({
            rules: {
                userName: {
                    required: true,
                    stringCheck: true
                },
                password: {
                    required: true
                }
            },
            messages: {
                userName: {
                    required: "用户名必须填写"
                },
                password: {
                    required: "密码必须填写"
                }
            },
            errorLabelContainer: $(".errorForm")
        });

        // enter事件
        $scope.myKeyup = function (e) {
            var keycode = window.event ? e.keyCode : e.which;
            if (keycode == 13) {
                $scope.signin();
            }
        };

        //登陆
        $scope.signin = function () {
            if (!$('#signinForm').valid()) {
                return;
            } else {
                userService.login($scope.userDto).then(function (result) {
                    console.log('login',result);
                    if (result.code == 200) {
                        $state.go("main");
                    } else {
                        $scope.msgshow = true;
                        $scope.msg = result.msg;
                    }
                })
            }
        }

        //注册
        $scope.signout = function () {
            if (!$('#signinForm').valid()) {
                return;
            } else {
                userService.saveUser($scope.userDto).then(function (result) {
                    console.log("saveUser", result)
                    if (result.code == 200) {
                         console.log("注册成功",result);
                        $state.go("signin");
                    } else {
                        $scope.msgshow = true;
                        $scope.msg = result.msg;
                    }
                })
            }
        }
    }]);