// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.restclient:
//            Request, AsyncHandler

class val.r
    implements Runnable
{

    final Request this$0;
    final AsyncHandler val$asyncHandler;
    final Request val$r;

    public void run()
    {
        try
        {
            (new ckgroundRequest(Request.this, val$asyncHandler)).execute(new Request[] {
                val$r
            });
            return;
        }
        catch (Exception exception)
        {
            Logger.error("Unable to execute request.", exception);
        }
    }

    er()
    {
        this$0 = final_request;
        val$asyncHandler = asynchandler;
        val$r = Request.this;
        super();
    }
}
