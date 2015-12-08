// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.os.Handler;
import android.util.Log;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.AsyncCallbackOnThread;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter

class <init> extends AsyncCallbackOnThread
{

    final ShelfListPresenter this$0;

    private void onResponse(StoreAvailabilityData astoreavailabilitydata[], Integer integer)
    {
        if (!isPopped())
        {
            ShelfListPresenter.access$300(ShelfListPresenter.this, astoreavailabilitydata, integer.intValue());
        }
        Log.i("INSTORE_DEBUG", (new StringBuilder()).append("Got availability response: ").append(Arrays.toString(astoreavailabilitydata)).toString());
    }

    public void onFailureSameThread(Integer integer, StoreAvailabilityData astoreavailabilitydata[])
    {
        onResponse(astoreavailabilitydata, integer);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StoreAvailabilityData[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StoreAvailabilityData[])obj);
    }

    public void onSuccessSameThread(StoreAvailabilityData astoreavailabilitydata[])
    {
        onResponse(astoreavailabilitydata, Integer.valueOf(-1));
    }

    (Handler handler)
    {
        this$0 = ShelfListPresenter.this;
        super(handler);
    }
}
