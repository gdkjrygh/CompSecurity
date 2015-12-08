// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            UploadImageService

class ccessCallback
    implements WishApiCallback
{

    final UploadImageService this$0;
    final lback val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        UploadImageService.access$002(UploadImageService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        UploadImageService.access$002(UploadImageService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
            }
        } else
        {
            try
            {
                wishapirequest = wishapiresponse.getData().getString("image_url");
                wishapiresponse = wishapiresponse.getData().getString("image_name");
                if (val$successCallback != null)
                {
                    val$successCallback.onServiceSucceeded(wishapirequest, wishapiresponse);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (WishApiRequest wishapirequest)
            {
                if (val$failureCallback != null)
                {
                    val$failureCallback.onServiceFailed();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (WishApiRequest wishapirequest)
            {
                if (val$failureCallback != null)
                {
                    val$failureCallback.onServiceFailed();
                    return;
                }
            }
        }
    }

    ccessCallback()
    {
        this$0 = final_uploadimageservice;
        val$failureCallback = lback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
