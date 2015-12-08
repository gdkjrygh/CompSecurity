// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.events.CartActionClickedEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.main:
//            CartActionController

class this._cls0
    implements android.view.ionController._cls1
{

    final CartActionController this$0;

    public void onClick(View view)
    {
        switchToCart();
        MessageBus.getBus().post(new CartActionClickedEvent());
    }

    _cls9()
    {
        this$0 = CartActionController.this;
        super();
    }
}
