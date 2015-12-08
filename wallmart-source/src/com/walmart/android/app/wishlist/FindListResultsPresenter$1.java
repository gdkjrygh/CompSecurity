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
//            FindListResultsPresenter

class this._cls0 extends OnSingleClickListener
{

    final FindListResultsPresenter this$0;

    public void onSingleClick(View view)
    {
        FindListResultsPresenter.access$000(FindListResultsPresenter.this);
        MessageBus.getBus().post(new com.walmartlabs.anivia.init>("listSearchAgainTap"));
    }

    A(Presenter presenter)
    {
        this$0 = FindListResultsPresenter.this;
        super(presenter);
    }
}
