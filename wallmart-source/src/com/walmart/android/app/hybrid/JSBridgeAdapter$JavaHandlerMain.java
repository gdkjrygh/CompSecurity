// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.os.Handler;

// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

private abstract class <init>
    implements com.walmartlabs.hybrid.ler
{

    final JSBridgeAdapter this$0;

    public Object handle(final String data, final com.walmartlabs.hybrid.ck jsCallback)
    {
        JSBridgeAdapter.access$000(JSBridgeAdapter.this).post(new Runnable() {

            final JSBridgeAdapter.JavaHandlerMain this$1;
            final String val$data;
            final com.walmartlabs.hybrid.WebViewJavascriptBridge.JsCallback val$jsCallback;

            public void run()
            {
                handleOnMain(data, jsCallback);
            }

            
            {
                this$1 = JSBridgeAdapter.JavaHandlerMain.this;
                data = s;
                jsCallback = jscallback;
                super();
            }
        });
        return null;
    }

    public abstract void handleOnMain(String s, com.walmartlabs.hybrid.ck ck);

    private _cls1.val.jsCallback()
    {
        this$0 = JSBridgeAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
