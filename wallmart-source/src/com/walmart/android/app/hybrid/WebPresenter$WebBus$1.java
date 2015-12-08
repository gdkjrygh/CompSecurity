// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter

class this._cls1
    implements android.content.issListener
{

    final this._cls1 this$1;

    public void onDismiss(DialogInterface dialoginterface)
    {
        MessageBus.getBus().post(new CloseFragmentEvent());
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
