package org.apache.cordova.toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.widget.Toast;

public class Toast extends CordovaPlugin {

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    final String msg = args.getString(0);
    if (action.equals("short")) {
      final String msg = args.getString(0);
      showToast(msg,Toast.LENGTH_SHORT);
    }

    if (action.equals("long")) {
      showToast(msg,Toast.LENGTH_LONG);
    }


  }

  private void showToast(String content,Int size){
  Toast.makeText(getApplicationContext(), content, size).show();
  }

}
