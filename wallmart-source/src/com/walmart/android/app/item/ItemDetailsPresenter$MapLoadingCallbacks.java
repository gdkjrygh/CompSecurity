// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.MappedSections;
import com.walmart.android.app.shop.map.SourceDataMapper;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

private class <init>
    implements com.walmart.android.app.shop.map.t>
{

    final ItemDetailsPresenter this$0;

    private void updateAnalyticsEvent()
    {
        if (ItemDetailsPresenter.access$2200(ItemDetailsPresenter.this).getSourceDataMapper().hasAllData() && ItemDetailsPresenter.access$2200(ItemDetailsPresenter.this).isMapLoaded())
        {
            Object obj = ItemDetailsPresenter.access$2200(ItemDetailsPresenter.this).getSourceDataMapper().getMappedSections().getAnalyticsMappedLocations();
            ventController ventcontroller = ItemDetailsPresenter.access$3400(ItemDetailsPresenter.this);
            if (!((List) (obj)).isEmpty())
            {
                obj = (String)((List) (obj)).get(0);
            } else
            {
                obj = null;
            }
            ventcontroller.setAisles(((String) (obj)), ItemDetailsPresenter.access$2200(ItemDetailsPresenter.this).getSourceDataMapper().getMappedSections().getAnalyticsMissingLocations());
        }
    }

    public void onAislesLoaded()
    {
        updateAnalyticsEvent();
    }

    public void onMapFail()
    {
        ItemDetailsPresenter.access$3400(ItemDetailsPresenter.this).setAisles(null, null);
    }

    public void onMapLoaded()
    {
        updateAnalyticsEvent();
    }

    public void onStoreDataSourceChanged()
    {
        updateAnalyticsEvent();
    }

    private ventController()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
