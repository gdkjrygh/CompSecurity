// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.analytics.events.StoreSearchResultEvent;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.MappedSections;
import com.walmart.android.app.shop.map.SourceDataMapper;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreListPresenter

private class <init>
    implements com.walmart.android.app.shop.map.t>
{

    final InStoreListPresenter this$0;

    private void updateAnalyticsEvent()
    {
        if (InStoreListPresenter.access$300(InStoreListPresenter.this).getSourceDataMapper().hasAllData() && InStoreListPresenter.access$300(InStoreListPresenter.this).isMapLoaded())
        {
            InStoreListPresenter.access$1600(InStoreListPresenter.this).numberOfItemsMapped = String.valueOf(InStoreListPresenter.access$300(InStoreListPresenter.this).getSourceDataMapper().getMappedSections().getDataCount());
            InStoreListPresenter.access$1600(InStoreListPresenter.this).numberOfAislesMapped = String.valueOf(InStoreListPresenter.access$300(InStoreListPresenter.this).getSourceDataMapper().getMappedSections().getAisleCount());
            InStoreListPresenter.access$1902(InStoreListPresenter.this, true);
        }
        InStoreListPresenter.access$1700(InStoreListPresenter.this);
    }

    public void onAislesLoaded()
    {
        updateAnalyticsEvent();
    }

    public void onMapFail()
    {
        InStoreListPresenter.access$1902(InStoreListPresenter.this, true);
        updateAnalyticsEvent();
    }

    public void onMapLoaded()
    {
        updateAnalyticsEvent();
    }

    public void onStoreDataSourceChanged()
    {
        updateAnalyticsEvent();
    }

    private ()
    {
        this$0 = InStoreListPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
