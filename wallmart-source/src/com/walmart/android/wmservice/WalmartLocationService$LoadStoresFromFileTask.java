// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.JsonMapper;
import com.walmartlabs.utils.LocationMath;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

private static class mCallback extends AsyncTask
{

    private final onPostExecute mCallback;
    private final Context mContext;

    protected transient mCallback doInBackground(LatLng alatlng[])
    {
        LatLng latlng;
        latlng = alatlng[0];
        alatlng = null;
        Object obj;
        obj = new File(mContext.getCacheDir(), "last_store_result.json");
        obj = (mContext)WalmartLocationService.access$900().readValue(((File) (obj)), com/walmart/android/wmservice/WalmartLocationService$StoreResult);
        alatlng = ((LatLng []) (obj));
_L2:
        mCallback mcallback = alatlng;
        if (alatlng != null)
        {
            if (System.currentTimeMillis() - (alatlng) <= 0x5265c00L)
            {
                break; /* Loop/switch isn't completed */
            }
            WLog.d(WalmartLocationService.TAG, "cached response no longer valid");
            mcallback = null;
        }
        return mcallback;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        if (LocationMath.computeDistance(latlng, alatlng.(), 'M') < 75D)
        {
            WalmartStore awalmartstore[] = (alatlng);
            int j = awalmartstore.length;
            for (int i = 0; i < j; i++)
            {
                awalmartstore[i].setSourceCoordinates(latlng.latitude, latlng.longitude);
            }

            Arrays.sort((alatlng), new Comparator() {

                final WalmartLocationService.LoadStoresFromFileTask this$0;

                public int compare(WalmartStore walmartstore, WalmartStore walmartstore1)
                {
                    if (walmartstore.distanceFromSource < walmartstore1.distanceFromSource)
                    {
                        return -1;
                    }
                    return walmartstore.distanceFromSource <= walmartstore1.distanceFromSource ? 0 : 1;
                }

                public volatile int compare(Object obj1, Object obj2)
                {
                    return compare((WalmartStore)obj1, (WalmartStore)obj2);
                }

            
            {
                this$0 = WalmartLocationService.LoadStoresFromFileTask.this;
                super();
            }
            });
            return alatlng;
        } else
        {
            return null;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((LatLng[])aobj);
    }

    protected void onPostExecute(doInBackground doinbackground)
    {
        mCallback.onStoresLoaded(doinbackground);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((onPostExecute)obj);
    }

    public _cls1.this._cls0(Context context, _cls1.this._cls0 _pcls0)
    {
        mContext = context;
        mCallback = _pcls0;
    }
}
