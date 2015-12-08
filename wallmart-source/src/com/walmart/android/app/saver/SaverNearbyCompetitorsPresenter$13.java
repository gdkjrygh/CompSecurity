// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class this._cls0
    implements com.walmartlabs.storelocator.
{

    final SaverNearbyCompetitorsPresenter this$0;

    public void onFailure(int i)
    {
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        if (!isPopped() && astoredata != null && astoredata.length > 0)
        {
            SaverNearbyCompetitorsPresenter.access$1602(SaverNearbyCompetitorsPresenter.this, astoredata[0].getLatitude());
            SaverNearbyCompetitorsPresenter.access$1702(SaverNearbyCompetitorsPresenter.this, astoredata[0].getLongitude());
            SaverNearbyCompetitorsPresenter.access$1500(SaverNearbyCompetitorsPresenter.this);
        }
    }

    ()
    {
        this$0 = SaverNearbyCompetitorsPresenter.this;
        super();
    }
}
