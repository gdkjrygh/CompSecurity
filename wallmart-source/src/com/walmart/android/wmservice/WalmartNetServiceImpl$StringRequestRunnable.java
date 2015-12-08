// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.service.AsyncCallback;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, MaintenanceException

private class callback
    implements Runnable
{

    private final AsyncCallback callback;
    private final HttpUriRequest request;
    final WalmartNetServiceImpl this$0;

    public void run()
    {
        String s = WalmartNetServiceImpl.access$300(WalmartNetServiceImpl.this, request);
        if (s != null)
        {
            try
            {
                callback.onSuccess(s);
                return;
            }
            catch (MaintenanceException maintenanceexception)
            {
                callback.onFailure(Integer.valueOf(0x15f93), null);
            }
            break MISSING_BLOCK_LABEL_59;
        }
        callback.onFailure(Integer.valueOf(0x15f92), null);
        return;
    }

    public (HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
        request = httpurirequest;
        callback = asynccallback;
    }
}
