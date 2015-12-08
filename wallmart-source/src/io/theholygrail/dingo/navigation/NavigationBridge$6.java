// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.navigation;

import io.theholygrail.jsbridge.JSLog;
import io.theholygrail.jsbridge.JSValue;

// Referenced classes of package io.theholygrail.dingo.navigation:
//            NavigationBridge, NavigationBridgeCallback

class val.callback
    implements Runnable
{

    final NavigationBridge this$0;
    final String val$callback;

    public void run()
    {
        final JSValue callbackValue = new JSValue(val$callback);
        mCallback.setOnBackListener(new NavigationBridgeCallback.OnBackListener() {

            final NavigationBridge._cls6 this$1;
            final JSValue val$callbackValue;

            public void onBack()
            {
                JSLog.d(NavigationBridge.access$000(), "onBack()");
                callbackValue.callFunction(mWebView, null, null);
            }

            
            {
                this$1 = NavigationBridge._cls6.this;
                callbackValue = jsvalue;
                super();
            }
        });
    }

    _cls1.val.callbackValue()
    {
        this$0 = final_navigationbridge;
        val$callback = String.this;
        super();
    }
}
