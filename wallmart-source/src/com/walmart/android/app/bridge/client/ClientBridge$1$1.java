// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import com.walmart.android.app.bridge.ResultCallback;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.JsonTransformer;
import io.theholygrail.jsbridge.JSValue;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.walmart.android.app.bridge.client:
//            ClientBridge, SignIn, ClientBridgeCallback

class this._cls1
    implements ResultCallback
{

    final onResult this$1;

    public void onResult(SignIn signin)
    {
        WLog.d(ClientBridge.access$000(), "Sign in done");
        if (signin != null && signin.customer != null)
        {
            try
            {
                JSONObject jsonobject = new JSONObject(mJsonTransformer.toJson(signin.customer));
                successValue.callFunction(mWebView, new Object[] {
                    jsonobject, Boolean.valueOf(signin.accountCreated)
                }, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SignIn signin)
            {
                return;
            }
        } else
        {
            cancelValue.callFunction(mWebView, new Object[] {
                ""
            }, null);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((SignIn)obj);
    }

    l.cancelValue()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/bridge/client/ClientBridge$1

/* anonymous class */
    class ClientBridge._cls1
        implements Runnable
    {

        final ClientBridge this$0;
        final JSValue val$cancelValue;
        final String val$mergeType;
        final JSValue val$successValue;

        public void run()
        {
            mCallback.signin(mergeType, new ClientBridge._cls1._cls1());
        }

            
            {
                this$0 = final_clientbridge;
                mergeType = s;
                successValue = jsvalue;
                cancelValue = JSValue.this;
                super();
            }
    }

}
