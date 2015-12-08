// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import android.widget.AdapterView;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.data.WalmartStore;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListPresenter, StoreAvailabilityListAdapter

class this._cls0
    implements android.widget.stPresenter._cls4
{

    final StoreAvailabilityListPresenter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (WalmartStore)StoreAvailabilityListPresenter.access$400(StoreAvailabilityListPresenter.this).getItem(i);
        if (adapterview != null)
        {
            adapterview = new StoreDetailPresenter(StoreAvailabilityListPresenter.access$1000(StoreAvailabilityListPresenter.this), adapterview);
            StoreAvailabilityListPresenter.access$1600(StoreAvailabilityListPresenter.this, adapterview);
        }
    }

    ()
    {
        this$0 = StoreAvailabilityListPresenter.this;
        super();
    }
}
