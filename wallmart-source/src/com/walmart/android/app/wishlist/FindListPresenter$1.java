// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListPresenter, FindListResultsPresenter

class this._cls0 extends OnSingleClickListener
{

    final FindListPresenter this$0;

    public void onSingleClick(View view)
    {
        if (FindListPresenter.access$000(FindListPresenter.this))
        {
            ViewUtil.hideKeyboard(FindListPresenter.access$100(FindListPresenter.this));
            view = FindListPresenter.access$200(FindListPresenter.this);
            FindListPresenter.access$400(FindListPresenter.this, new FindListResultsPresenter(FindListPresenter.access$300(FindListPresenter.this), view));
            MessageBus.getBus().post(new com.walmartlabs.anivia.ilder("findListFinalTap"));
        }
    }

    nter(Presenter presenter)
    {
        this$0 = FindListPresenter.this;
        super(presenter);
    }
}
