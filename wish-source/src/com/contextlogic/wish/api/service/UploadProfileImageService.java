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
import com.contextlogic.wish.api.data.WishUser;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class UploadProfileImageService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishUser wishuser);
    }


    private WishApiRequest apiRequest;

    public UploadProfileImageService()
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

    public void requestService(Bitmap bitmap, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().uploadProfileImage(bitmap, new WishApiCallback() {

            final UploadProfileImageService this$0;
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
                wishapirequest = new WishUser(wishapiresponse.getData().getJSONObject("user"));
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
_L4:
                return;
_L2:
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest);
                return;
                wishapirequest;
                if (failureCallback == null) goto _L4; else goto _L5
_L5:
                failureCallback.onServiceFailed();
                return;
                wishapirequest;
                return;
                wishapirequest;
            }

            
            {
                this$0 = UploadProfileImageService.this;
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
    static WishApiRequest access$002(UploadProfileImageService uploadprofileimageservice, WishApiRequest wishapirequest)
    {
        uploadprofileimageservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
