// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.WalmartStore;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

class cationData
    implements com.walmartlabs.storelocator.lback
{

    final WalmartLocationService this$0;
    final cationData val$locationData;

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
            WalmartLocationService.access$600(WalmartLocationService.this, awalmartstore, val$locationData);
            (new veStoresToFileTask(WalmartLocationService.this, new WalmartLocationService.OnStoresSavedCallback() {

                final WalmartLocationService._cls3 this$1;

                public void onStoresSaved()
                {
                    if (!WalmartLocationService.access$100(this$0))
                    {
                        return;
                    } else
                    {
                        WalmartLocationService.access$300(this$0);
                        return;
                    }
                }

            
            {
                this$1 = WalmartLocationService._cls3.this;
                super();
            }
            })).execute(new oreResult[] {
                new oreResult(val$locationData.coordinates, awalmartstore)
            });
            return;
        }
    }

    public volatile void onStoresReceived(StoreData astoredata[])
    {
        onStoresReceived((WalmartStore[])astoredata);
    }

    cationData()
    {
        this$0 = final_walmartlocationservice;
        val$locationData = cationData.this;
        super();
    }
}
