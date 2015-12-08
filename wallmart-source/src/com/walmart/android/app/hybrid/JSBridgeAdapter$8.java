// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

class vaHandlerMain extends vaHandlerMain
{

    final JSBridgeAdapter this$0;

    public void handleOnMain(String s, com.walmartlabs.hybrid.ridge.JsCallback jscallback)
    {
        WLog.d(JSBridgeAdapter.access$400(), (new StringBuilder()).append("showLoadingIndicator: ").append(s).toString());
        s = (alogData)JSBridgeAdapter.access$200(JSBridgeAdapter.this, s, com/walmart/android/app/hybrid/JSBridgeAdapter$DialogData);
        JSBridgeAdapter.access$300(JSBridgeAdapter.this).onShowLoadingIndicator(s);
    }

    Callback()
    {
        this$0 = JSBridgeAdapter.this;
        super(JSBridgeAdapter.this, null);
    }
}
