// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUser;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            UploadProfileImageService

class ccessCallback
    implements WishApiCallback
{

    final UploadProfileImageService this$0;
    final nServiceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        UploadProfileImageService.access$002(UploadProfileImageService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        UploadProfileImageService.access$002(UploadProfileImageService.this, null);
        wishapirequest = new WishUser(wishapiresponse.getData().getJSONObject("user"));
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.nServiceFailed();
        }
_L4:
        return;
_L2:
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback == null) goto _L4; else goto _L5
_L5:
        val$failureCallback.nServiceFailed();
        return;
        wishapirequest;
        return;
        wishapirequest;
    }

    ccessCallback()
    {
        this$0 = final_uploadprofileimageservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
