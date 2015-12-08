// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenPresenter

class this._cls0 extends OnSingleClickListener
{

    final InStoreMapFullScreenPresenter this$0;

    public void onSingleClick(View view)
    {
        view = (new com.walmartlabs.anivia.("mapInteraction")).ing("action", "paginate previous");
        MessageBus.getBus().post(view);
        InStoreMapFullScreenPresenter.access$300(InStoreMapFullScreenPresenter.this).setCurrentItem(((InStoreMapFullScreenPresenter.access$300(InStoreMapFullScreenPresenter.this).getCurrentItem() - 1) + InStoreMapFullScreenPresenter.access$300(InStoreMapFullScreenPresenter.this).getAdapter().getCount()) % InStoreMapFullScreenPresenter.access$300(InStoreMapFullScreenPresenter.this).getAdapter().getCount(), false);
    }

    (Presenter presenter)
    {
        this$0 = InStoreMapFullScreenPresenter.this;
        super(presenter);
    }
}
