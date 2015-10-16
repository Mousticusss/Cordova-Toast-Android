/**
 * Created by Marcus on 16/10/2015.
 */
Plugin.alert = function(content){
  var onSuccess = function(){};
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'AlertPlugin', 'alert', [content]);
};

var exec = require('cordova/exec');

var toast = {

  short:function(msg) {
    exec(null, null, "Toast", "short", [msg]);
  },
  long:function(msg) {
    exec(null, null, "Toast", "long", [msg]);
  }
};

module.exports = toast;
