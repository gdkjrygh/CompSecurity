// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;

import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback

class val.callbackValue
    implements ack.OnBackListener
{

    final View this$1;
    final JSValue val$callbackValue;

    public void onBack()
    {
        JSLog.d(NavigationBridge.access$000(), "onBack()");
        val$callbackValue.callFunction(mWebView, null, null);
    }

    l.callback()
    {
        this$1 = final_callback;
        val$callbackValue = JSValue.this;
        super();
    }

    // Unreferenced inner class io/theholygrail/dingo/navigation/NavigationBridge$6

/* anonymous class */
    class NavigationBridge._cls6
        implements Runnable
    {

        final NavigationBridge this$0;
        final String val$callback;

        public void run()
        {
            JSValue jsvalue = new JSValue(callback);
            mCallback.setOnBackListener(jsvalue. new NavigationBridge._cls6._cls1());
        }

            
            {
                this$0 = final_navigationbridge;
                callback = String.this;
                super();
            }
    }

}
