// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

class this._cls0 extends OnSingleClickListener
{

    final ListCreatorPresenter this$0;

    public void onSingleClick(View view)
    {
        ListCreatorPresenter.access$800(ListCreatorPresenter.this);
        view = (new com.walmartlabs.anivia.er("listScanBrowse")).putString("actionTapped", "scan");
        MessageBus.getBus().post(view);
    }

    (Presenter presenter)
    {
        this$0 = ListCreatorPresenter.this;
        super(presenter);
    }
}
