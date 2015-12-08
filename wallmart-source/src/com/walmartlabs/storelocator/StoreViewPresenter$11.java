// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.location.Address;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.utils.LocationUtils;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter

class this._cls0 extends AsyncTask
{

    final StoreViewPresenter this$0;

    protected transient com.walmartlabs.utils.earchResult doInBackground(String as[])
    {
        return LocationUtils.getAddress(StoreViewPresenter.access$1500(StoreViewPresenter.this), as[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(com.walmartlabs.utils.earchResult earchresult)
    {
        if (!isPopped())
        {
            if (earchresult.hasAddress())
            {
                earchresult = earchresult.getAddress();
                earchresult = new LatLng(earchresult.getLatitude(), earchresult.getLongitude());
                if (!StoreViewPresenter.access$2100(StoreViewPresenter.this, earchresult, true, false, true))
                {
                    dismissDialog(2);
                    dismissDialog(5);
                    return;
                }
            } else
            {
                StoreViewPresenter.access$1400(StoreViewPresenter.this);
                switch (earchresult.getError())
                {
                default:
                    return;

                case 1: // '\001'
                    showDialog(600);
                    return;

                case 3: // '\003'
                    showDialog(101);
                    return;

                case 2: // '\002'
                    showDialog(100);
                    return;
                }
            }
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((com.walmartlabs.utils.earchResult)obj);
    }

    protected void onPreExecute()
    {
        showDialog(5);
    }

    sult()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
