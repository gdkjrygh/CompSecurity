// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import com.walmart.android.wmservice.Util;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.view.ViewBridgeCallback;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController, NavigationStack, Page

class this._cls0
    implements ViewBridgeCallback
{

    final BridgeController this$0;

    public void setOnAppear(io.theholygrail.dingo.view.OnAppearListener onappearlistener)
    {
        Page page = BridgeController.access$400(BridgeController.this).getCurrentPageOrModal();
        WLog.d(BridgeController.access$100(), (new StringBuilder()).append("setOnAppear(): ").append(page.getTitle()).toString());
        page.setOnAppearListener(onappearlistener);
    }

    public void setOnDisappear(io.theholygrail.dingo.view.OnDisappearListener ondisappearlistener)
    {
        Page page = BridgeController.access$400(BridgeController.this).getCurrentPageOrModal();
        WLog.d(BridgeController.access$100(), (new StringBuilder()).append("setOnDisappear(): ").append(page.getTitle()).toString());
        page.setOnDisappearListener(ondisappearlistener);
    }

    public void show()
    {
        WLog.d(BridgeController.access$100(), "view.show()");
        BridgeController.access$1600(BridgeController.this, true);
        if (!BridgeController.access$1700(BridgeController.this))
        {
            BridgeController.access$000(BridgeController.this).updateLoadingView(false);
        }
        Util.passCookiesToNative();
    }

    sappearListener()
    {
        this$0 = BridgeController.this;
        super();
    }
}
