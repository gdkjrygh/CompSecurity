// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.location.Address;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.utils.LocationUtils;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListPresenter, StoreAvailabilityListAdapter

class this._cls0 extends AsyncTask
{

    final StoreAvailabilityListPresenter this$0;

    protected transient com.walmartlabs.utils. doInBackground(String as[])
    {
        return LocationUtils.getAddress(StoreAvailabilityListPresenter.access$1000(StoreAvailabilityListPresenter.this), as[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(com.walmartlabs.utils. )
    {
        if (.hasAddress())
        {
             = .getAddress();
             = new LatLng(.getLatitude(), .getLongitude());
            StoreAvailabilityListPresenter.access$1700(StoreAvailabilityListPresenter.this, );
            return;
        }
        switch (.getError())
        {
        default:
            return;

        case 1: // '\001'
            StoreAvailabilityListPresenter.access$1800(StoreAvailabilityListPresenter.this, 600);
            return;

        case 3: // '\003'
            StoreAvailabilityListPresenter.access$1900(StoreAvailabilityListPresenter.this, 101);
            return;

        case 2: // '\002'
            StoreAvailabilityListPresenter.access$2000(StoreAvailabilityListPresenter.this, 100);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((com.walmartlabs.utils.)obj);
    }

    protected void onPreExecute()
    {
        StoreAvailabilityListPresenter.access$400(StoreAvailabilityListPresenter.this).reset();
    }

    ()
    {
        this$0 = StoreAvailabilityListPresenter.this;
        super();
    }
}
