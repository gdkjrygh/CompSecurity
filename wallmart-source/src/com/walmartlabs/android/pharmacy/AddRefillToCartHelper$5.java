// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Dialog;
import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            AddRefillToCartHelper, PharmacyResponse

class this._cls0 extends AsyncCallbackOnThread
{

    final AddRefillToCartHelper this$0;

    private void onDelete()
    {
        try
        {
            AddRefillToCartHelper.access$100(AddRefillToCartHelper.this).dismiss();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        onDelete();
        Log.w(AddRefillToCartHelper.access$1000(), "Failed to remove prescription from cart");
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        onDelete();
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    (Handler handler)
    {
        this$0 = AddRefillToCartHelper.this;
        super(handler);
    }
}
