// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.registry;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.registry:
//            RegistryDisabledPresenter

class this._cls0 extends OnSingleClickListener
{

    final RegistryDisabledPresenter this$0;

    public void onSingleClick(View view)
    {
        MessageBus.getBus().post(new CloseFragmentEvent());
    }

    (Presenter presenter)
    {
        this$0 = RegistryDisabledPresenter.this;
        super(presenter);
    }
}
