// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import com.walmart.android.app.bridge.client.LoadingIndicatorBridgeCallback;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController

class this._cls0
    implements LoadingIndicatorBridgeCallback
{

    final BridgeController this$0;

    public void hide()
    {
        WLog.d(BridgeController.access$100(), "Loading indicator hide");
        BridgeController.access$1702(BridgeController.this, false);
        BridgeController.access$000(BridgeController.this).updateLoadingView(false);
        BridgeController.access$1600(BridgeController.this, true);
    }

    public void show()
    {
        WLog.d(BridgeController.access$100(), "Loading indicator show");
        BridgeController.access$1702(BridgeController.this, true);
        BridgeController.access$000(BridgeController.this).updateLoadingView(true);
    }

    esenterCallback()
    {
        this$0 = BridgeController.this;
        super();
    }
}
