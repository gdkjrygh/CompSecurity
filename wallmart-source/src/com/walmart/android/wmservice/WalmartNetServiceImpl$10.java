// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.os.Handler;
import com.walmart.android.data.SlapResponse;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class > extends AsyncCallbackOnThread
{

    final WalmartNetServiceImpl this$0;
    final AsyncCallback val$asyncCallback;

    public void onFailureSameThread(Integer integer, SlapResponse aslapresponse[])
    {
        val$asyncCallback.onFailure(integer, null);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (SlapResponse[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((SlapResponse[])obj);
    }

    public void onSuccessSameThread(SlapResponse aslapresponse[])
    {
        StoreAvailabilityData astoreavailabilitydata[] = new StoreAvailabilityData[0];
        Object aobj[] = astoreavailabilitydata;
        if (aslapresponse != null)
        {
            aobj = astoreavailabilitydata;
            if (aslapresponse.length > 0)
            {
                SlapResponse slapresponse = aslapresponse[0];
                com.walmart.android.data.l._cls10 a_lcls10[] = slapresponse.stores;
                aobj = astoreavailabilitydata;
                if (a_lcls10 != null)
                {
                    aslapresponse = new StoreAvailabilityData[a_lcls10.length];
                    int i = 0;
                    do
                    {
                        aobj = aslapresponse;
                        if (i >= a_lcls10.length)
                        {
                            break;
                        }
                        aslapresponse[i] = new StoreAvailabilityData(a_lcls10[i], slapresponse.item);
                        i++;
                    } while (true);
                }
            }
        }
        val$asyncCallback.onSuccess(((Object) (aobj)));
    }

    (AsyncCallback asynccallback)
    {
        this$0 = final_walmartnetserviceimpl;
        val$asyncCallback = asynccallback;
        super(Handler.this);
    }
}
