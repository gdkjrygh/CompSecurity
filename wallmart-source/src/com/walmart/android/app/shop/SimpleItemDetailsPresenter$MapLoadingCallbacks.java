// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.SourceDataMapper;

// Referenced classes of package com.walmart.android.app.shop:
//            SimpleItemDetailsPresenter

private class <init>
    implements com.walmart.android.app.shop.map.t>
{

    final SimpleItemDetailsPresenter this$0;

    public void onAislesLoaded()
    {
        SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
        boolean flag;
        if (SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).getSourceDataMapper().hasAllData() && SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).isMapLoaded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SimpleItemDetailsPresenter.access$1602(simpleitemdetailspresenter, flag);
        SimpleItemDetailsPresenter.access$1700(SimpleItemDetailsPresenter.this);
    }

    public void onMapFail()
    {
        SimpleItemDetailsPresenter.access$1602(SimpleItemDetailsPresenter.this, true);
        SimpleItemDetailsPresenter.access$1700(SimpleItemDetailsPresenter.this);
    }

    public void onMapLoaded()
    {
        SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
        boolean flag;
        if (SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).getSourceDataMapper().hasAllData() && SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).isMapLoaded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SimpleItemDetailsPresenter.access$1602(simpleitemdetailspresenter, flag);
        SimpleItemDetailsPresenter.access$1700(SimpleItemDetailsPresenter.this);
    }

    public void onStoreDataSourceChanged()
    {
        SimpleItemDetailsPresenter simpleitemdetailspresenter = SimpleItemDetailsPresenter.this;
        boolean flag;
        if (SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).getSourceDataMapper().hasAllData() && SimpleItemDetailsPresenter.access$1400(SimpleItemDetailsPresenter.this).isMapLoaded())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SimpleItemDetailsPresenter.access$1602(simpleitemdetailspresenter, flag);
        SimpleItemDetailsPresenter.access$1700(SimpleItemDetailsPresenter.this);
    }

    private Q()
    {
        this$0 = SimpleItemDetailsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
