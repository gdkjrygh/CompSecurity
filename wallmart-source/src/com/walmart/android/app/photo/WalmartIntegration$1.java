// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.photo;


// Referenced classes of package com.walmart.android.app.photo:
//            WalmartIntegration

class reshCallback
    implements com.walmart.android.wmservice.llback
{

    final WalmartIntegration this$0;
    final com.walmartlabs.android.photo.util.integration.nRefreshCallback val$callback;

    public void onFailure(int i)
    {
        if (val$callback != null)
        {
            boolean flag;
            if (i == 4 || i == 2 || i == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            val$callback.onFailure(flag);
        }
    }

    public void onSuccess()
    {
        if (val$callback != null)
        {
            val$callback.onSuccess();
        }
    }

    reshCallback()
    {
        this$0 = final_walmartintegration;
        val$callback = com.walmartlabs.android.photo.util.integration.nRefreshCallback.this;
        super();
    }
}
