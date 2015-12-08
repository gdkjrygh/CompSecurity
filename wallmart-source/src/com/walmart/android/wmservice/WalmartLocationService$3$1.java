// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.WalmartStore;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

class this._cls1
    implements oresSavedCallback
{

    final is._cls0 this$1;

    public void onStoresSaved()
    {
        if (!WalmartLocationService.access$100(_fld0))
        {
            return;
        } else
        {
            WalmartLocationService.access$300(_fld0);
            return;
        }
    }

    tionData()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/wmservice/WalmartLocationService$3

/* anonymous class */
    class WalmartLocationService._cls3
        implements com.walmartlabs.storelocator.StoreService.GetStoresCallback
    {

        final WalmartLocationService this$0;
        final WalmartLocationService.LocationData val$locationData;

        public void onFailure(int i)
        {
            WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onFailureSameThread: ").append(i).toString());
            if (!WalmartLocationService.access$100(WalmartLocationService.this))
            {
                return;
            } else
            {
                WalmartLocationService.access$300(WalmartLocationService.this);
                return;
            }
        }

        public void onStoresReceived(WalmartStore awalmartstore[])
        {
            String s = WalmartLocationService.TAG;
            StringBuilder stringbuilder = (new StringBuilder()).append("onSuccessSameThread: ");
            Object obj;
            if (awalmartstore != null)
            {
                obj = Integer.valueOf(awalmartstore.length);
            } else
            {
                obj = "null";
            }
            WLog.d(s, stringbuilder.append(obj).toString());
            if (!WalmartLocationService.access$100(WalmartLocationService.this))
            {
                return;
            } else
            {
                WalmartLocationService.access$600(WalmartLocationService.this, awalmartstore, locationData);
                (new WalmartLocationService.SaveStoresToFileTask(WalmartLocationService.this, new WalmartLocationService._cls3._cls1())).execute(new WalmartLocationService.StoreResult[] {
                    new WalmartLocationService.StoreResult(locationData.coordinates, awalmartstore)
                });
                return;
            }
        }

        public volatile void onStoresReceived(StoreData astoredata[])
        {
            onStoresReceived((WalmartStore[])astoredata);
        }

            
            {
                this$0 = final_walmartlocationservice;
                locationData = WalmartLocationService.LocationData.this;
                super();
            }
    }

}
