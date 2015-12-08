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
//            ClientBridge, ClientBridgeCallback, SignIn

class val.cancelValue
    implements Runnable
{

    final ClientBridge this$0;
    final JSValue val$cancelValue;
    final String val$mergeType;
    final JSValue val$successValue;

    public void run()
    {
        mCallback.signin(val$mergeType, new ResultCallback() {

            final ClientBridge._cls1 this$1;

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

            
            {
                this$1 = ClientBridge._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_clientbridge;
        val$mergeType = s;
        val$successValue = jsvalue;
        val$cancelValue = JSValue.this;
        super();
    }
}
