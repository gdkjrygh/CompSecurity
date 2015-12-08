// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter, FilterManager, StoreManager

class this._cls0
    implements r
{

    final StoreViewPresenter this$0;

    public void onFilterSettingsUpdated()
    {
        int i;
        toggleFilterActive(StoreViewPresenter.access$400(StoreViewPresenter.this).isFilterActive());
        i = StoreViewPresenter.access$500(StoreViewPresenter.this).size();
        StoreViewPresenter.access$500(StoreViewPresenter.this).updateFilter();
        if (StoreViewPresenter.access$500(StoreViewPresenter.this).size() <= 0) goto _L2; else goto _L1
_L1:
        StoreViewPresenter.access$600(StoreViewPresenter.this);
        adjustZoomLevelToStores();
_L4:
        StoreViewPresenter.access$700(StoreViewPresenter.this);
        return;
_L2:
        if (i > 0)
        {
            clearFilterAndShowDialog();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    r()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
