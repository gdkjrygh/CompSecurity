// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.SimpleItemPagerAdapter;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.shop:
//            SimpleItemDetailsPresenter

class this._cls0 extends OnSingleClickListener
{

    final SimpleItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        if (SimpleItemDetailsPresenter.access$700(SimpleItemDetailsPresenter.this) != null)
        {
            view = new SimpleItemPagerAdapter();
            android.text.Spanned spanned = SimpleItemDetailsPresenter.access$800(SimpleItemDetailsPresenter.this);
            String s = SimpleItemDetailsPresenter.access$400(SimpleItemDetailsPresenter.this);
            String s1 = SimpleItemDetailsPresenter.access$900(SimpleItemDetailsPresenter.this);
            String s2 = SimpleItemDetailsPresenter.access$1000(SimpleItemDetailsPresenter.this);
            boolean flag;
            if (SimpleItemDetailsPresenter.access$1100(SimpleItemDetailsPresenter.this) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setItemData(spanned, s, s1, s2, flag, SimpleItemDetailsPresenter.access$1200(SimpleItemDetailsPresenter.this), SimpleItemDetailsPresenter.access$1300(SimpleItemDetailsPresenter.this), SimpleItemDetailsPresenter.access$700(SimpleItemDetailsPresenter.this).stockStatus);
            SimpleItemDetailsPresenter.access$1500(SimpleItemDetailsPresenter.this, new InStoreMapFullScreenPresenter(SimpleItemDetailsPresenter.access$500(SimpleItemDetailsPresenter.this), getTitleText(), SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).getSourceDataMapper(), view, null));
        }
    }

    er(Presenter presenter)
    {
        this$0 = SimpleItemDetailsPresenter.this;
        super(presenter);
    }
}
