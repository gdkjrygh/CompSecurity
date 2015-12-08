// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import android.graphics.Bitmap;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class UploadImageService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s, String s1);
    }


    private WishApiRequest apiRequest;

    public UploadImageService()
    {
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null;
    }

    public void requestService(Bitmap bitmap, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().uploadImage(bitmap, s, new WishApiCallback() {

            final UploadImageService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    try
                    {
                        wishapirequest = wishapiresponse.getData().getString("image_url");
                        wishapiresponse = wishapiresponse.getData().getString("image_name");
                        if (successCallback != null)
                        {
                            successCallback.onServiceSucceeded(wishapirequest, wishapiresponse);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = UploadImageService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
_L1:
        return;
        bitmap;
        if (failureCallback != null)
        {
            failureCallback.onServiceFailed();
            return;
        }
          goto _L1
    }


/*
    static WishApiRequest access$002(UploadImageService uploadimageservice, WishApiRequest wishapirequest)
    {
        uploadimageservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
