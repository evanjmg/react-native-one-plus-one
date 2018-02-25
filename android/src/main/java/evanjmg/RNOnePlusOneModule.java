
package evanjmg;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.util.Log;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNOnePlusOneModule extends ReactContextBaseJavaModule {
  public final int count = 0;
  public final String ON_COUNT_CHANGE = "ON_COUNT_CHANGE";
  private final ReactApplicationContext reactContext;
  public RNOnePlusOneModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }
  @ReactMethod
  public int addOne() {
    int count = this.count++;
    this.sendEvent(ON_COUNT_CHANGE, count);
    return count;
  }
  private static void sendEvent(String eventName, int count) {
    try {
     this.reactContext
      .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
      .emit(eventName, count);
    } catch (Exception e) {
       Log.e(eventName, "sendEvent called before bundle loaded");
    }
  }
  @Override
  public String getName() {
    return "RNOnePlusOne";
  }
}