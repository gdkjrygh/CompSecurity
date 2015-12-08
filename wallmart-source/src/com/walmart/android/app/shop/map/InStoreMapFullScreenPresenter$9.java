// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.squareup.otto.Bus;
import com.walmart.android.app.bridge.DrawerUpdateEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenPresenter

class this._cls0
    implements Runnable
{

    final InStoreMapFullScreenPresenter this$0;

    public void run()
    {
        MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
    }

    ()
    {
        this$0 = InStoreMapFullScreenPresenter.this;
        super();
    }
}
