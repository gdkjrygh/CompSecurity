// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.events.BarcodeActionClickedEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.main:
//            BarcodeActionController

class this._cls0
    implements android.view.ionController._cls1
{

    final BarcodeActionController this$0;

    public void onClick(View view)
    {
        startScanner(true);
        MessageBus.getBus().post(new BarcodeActionClickedEvent());
    }

    ()
    {
        this$0 = BarcodeActionController.this;
        super();
    }
}
