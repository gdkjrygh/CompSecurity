// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController

class this._cls0
    implements Runnable
{

    final BridgeController this$0;

    public void run()
    {
        if (BridgeController.access$000(BridgeController.this) != null)
        {
            BridgeController.access$000(BridgeController.this).pageError(1, null, null);
            WLog.e(BridgeController.access$100(), "Bridge error", new Exception());
        }
    }

    esenterCallback()
    {
        this$0 = BridgeController.this;
        super();
    }
}
