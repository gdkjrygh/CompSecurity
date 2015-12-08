// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.bridge.client:
//            LoadingIndicatorBridge, LoadingIndicatorBridgeCallback

class this._cls0
    implements Runnable
{

    final LoadingIndicatorBridge this$0;

    public void run()
    {
        WLog.i(LoadingIndicatorBridge.access$000(), "hide()");
        if (mCallback != null)
        {
            mCallback.hide();
        }
    }

    lback()
    {
        this$0 = LoadingIndicatorBridge.this;
        super();
    }
}
