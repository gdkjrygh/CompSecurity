// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.GuestCheckoutTapEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.account:
//            LoginPresenter

class this._cls0
    implements android.view.ner
{

    final LoginPresenter this$0;

    public void onClick(View view)
    {
        LoginPresenter.access$500(LoginPresenter.this);
        MessageBus.getBus().post(new GuestCheckoutTapEvent());
    }

    tTapEvent()
    {
        this$0 = LoginPresenter.this;
        super();
    }
}
