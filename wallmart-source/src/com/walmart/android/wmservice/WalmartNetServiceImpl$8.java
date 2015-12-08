// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, MaintenanceException

class val.asyncCallback
    implements Runnable
{

    final WalmartNetServiceImpl this$0;
    final AsyncCallback val$asyncCallback;
    final String val$url;

    public void run()
    {
        String s = WalmartNetServiceImpl.access$300(WalmartNetServiceImpl.this, new HttpGet(val$url));
        if (!TextUtils.isEmpty(s))
        {
            val$asyncCallback.onSuccess(s);
            return;
        }
        try
        {
            val$asyncCallback.onFailure(Integer.valueOf(0x15f93), null);
            return;
        }
        catch (MaintenanceException maintenanceexception)
        {
            val$asyncCallback.onFailure(Integer.valueOf(0x15f93), null);
        }
        return;
    }

    ()
    {
        this$0 = final_walmartnetserviceimpl;
        val$url = s;
        val$asyncCallback = AsyncCallback.this;
        super();
    }
}
