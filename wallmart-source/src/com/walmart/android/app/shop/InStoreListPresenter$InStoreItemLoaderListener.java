// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.walmart.android.analytics.events.StoreSearchResultEvent;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter, InStoreSearchAdapter

private class <init>
    implements <init>
{

    final InStoreListPresenter this$0;

    public void onFirstBatchLoaded()
    {
        InStoreListPresenter.access$1000(InStoreListPresenter.this).setVisibility(8);
        int i = InStoreListPresenter.access$1100(InStoreListPresenter.this).getDataItemCount();
        if (i == 0)
        {
            String s = InStoreListPresenter.access$200(InStoreListPresenter.this).getResources().getString(0x7f09056f, new Object[] {
                InStoreListPresenter.access$1200(InStoreListPresenter.this)
            });
            InStoreListPresenter.access$1300(InStoreListPresenter.this, s);
        } else
        {
            InStoreListPresenter.access$1400(InStoreListPresenter.this).setVisibility(0);
        }
        if (!InStoreListPresenter.access$1500(InStoreListPresenter.this))
        {
            InStoreListPresenter.access$1502(InStoreListPresenter.this, true);
            if (i > 0)
            {
                InStoreListPresenter.access$1600(InStoreListPresenter.this).resultNumber = i;
            }
            InStoreListPresenter.access$1700(InStoreListPresenter.this);
        }
    }

    public void onLoadingFailed(Integer integer)
    {
        WLog.e(InStoreListPresenter.access$1800(), (new StringBuilder()).append("getInStoreSearchResults failed with error ").append(integer).toString());
        if (!isPopped())
        {
            DialogFactory.showErrorDialog(InStoreListPresenter.access$200(InStoreListPresenter.this), integer.intValue());
        }
    }

    private Q()
    {
        this$0 = InStoreListPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
