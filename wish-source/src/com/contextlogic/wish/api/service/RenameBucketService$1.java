// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service:
//            RenameBucketService

class ccessCallback
    implements WishApiCallback
{

    final RenameBucketService this$0;
    final back val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        RenameBucketService.access$002(RenameBucketService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        RenameBucketService.access$002(RenameBucketService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
            }
        } else
        {
            LoggedInUser.getInstance().refreshProfile();
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded();
                return;
            }
        }
    }

    ccessCallback()
    {
        this$0 = final_renamebucketservice;
        val$failureCallback = back;
        val$successCallback = ccessCallback.this;
        super();
    }
}
