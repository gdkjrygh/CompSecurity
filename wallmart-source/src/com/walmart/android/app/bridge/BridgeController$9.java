// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;


// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController

class val.interceptUrl
    implements io.theholygrail.dingo..AnimationListener
{

    final BridgeController this$0;
    final String val$interceptUrl;
    final boolean val$intercepted;

    public void onAnimationEnd()
    {
        BridgeController.access$2100(BridgeController.this);
        if (val$intercepted)
        {
            BridgeController.access$1500(BridgeController.this, BridgeController.access$700(BridgeController.this), val$interceptUrl);
            return;
        } else
        {
            BridgeController.access$1000(BridgeController.this);
            return;
        }
    }

    nListener()
    {
        this$0 = final_bridgecontroller;
        val$intercepted = flag;
        val$interceptUrl = String.this;
        super();
    }
}
