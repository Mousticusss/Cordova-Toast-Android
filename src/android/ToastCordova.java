package org.apache.cordova.toastcordova;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.widget.Toast;
import android.content.Context;

public class ToastCordova extends CordovaPlugin {

  Context context=this.cordova.getActivity().getApplicationContext();

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    final String msg = args.getString(0);
    if (action.equals("short")) {

      showToast(msg,Toast.LENGTH_SHORT);
      return true;
    }

    if (action.equals("long")) {
      showToast(msg,Toast.LENGTH_LONG);
      return true;
    }

return false;
  }

  private void showToast(String content,int size){
  Toast.makeText(context, content, size).show();
  }

}
