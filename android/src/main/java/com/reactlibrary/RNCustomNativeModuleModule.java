
package com.testnativemodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCustomNativeModuleModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCustomNativeModuleModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCustomNativeModule";
  }

  @ReactMethod
   public void sqrNumber(int number, Callback cb) {
       try{
           cb.invoke(null, (number * number));
       }catch (Exception e){
           cb.invoke(e.toString(), null);
       }
   }
}
