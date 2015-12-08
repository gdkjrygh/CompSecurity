// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import com.walmart.android.service.AsyncCallback;
import java.io.File;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

class val.callback
    implements Runnable
{

    final WalmartNetServiceImpl this$0;
    final AsyncCallback val$callback;

    public void run()
    {
        System.currentTimeMillis();
        File afile[] = WalmartNetServiceImpl.access$400(WalmartNetServiceImpl.this).getCacheDir().listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

            System.currentTimeMillis();
        }
        val$callback.onSuccess(Integer.valueOf(0));
    }

    ()
    {
        this$0 = final_walmartnetserviceimpl;
        val$callback = AsyncCallback.this;
        super();
    }
}
