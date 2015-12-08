// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;

// Referenced classes of package com.contextlogic.wish.api.service:
//            PushDeregistrationService

class ccessCallback
    implements WishApiCallback
{

    final PushDeregistrationService this$0;
    final ccessCallback.onServiceSucceeded val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        PushDeregistrationService.access$002(PushDeregistrationService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        PushDeregistrationService.access$002(PushDeregistrationService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.nServiceFailed();
            }
        } else
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded();
            return;
        }
    }

    ccessCallback()
    {
        this$0 = final_pushderegistrationservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
