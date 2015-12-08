// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.user.UserPreferences;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService, EmailLoginService

public class EmailSignupService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }


    private WishApiRequest apiRequest;

    public EmailSignupService()
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

    public void requestService(String s, String s1, final String email, final String password, final FbLoginService.SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().emailSignup(s, s1, email, password, new WishApiCallback() {

            final EmailSignupService this$0;
            final String val$email;
            final FailureCallback val$failureCallback;
            final String val$password;
            final FbLoginService.SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                wishapirequest = null;
                apiRequest = null;
                if (failureCallback != null)
                {
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                String s2;
                s2 = null;
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    wishapirequest = s2;
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
_L3:
                return;
_L2:
                String s3;
                s3 = (String)wishapirequest.getResponseCookies().get("sweeper_session");
                if (s3 == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                WishApi.getInstance().getConfig().addSessionCookie(s3);
                String s4;
                boolean flag;
                s4 = wishapiresponse.getData().getString("user");
                flag = wishapiresponse.getData().optBoolean("new_user", false);
                s2 = "None";
                wishapirequest = s2;
                if (!wishapiresponse.getData().has("signup_flow_type"))
                {
                    break MISSING_BLOCK_LABEL_141;
                }
                wishapirequest = s2;
                if (!wishapiresponse.getData().isNull("signup_flow_type"))
                {
                    wishapirequest = wishapiresponse.getData().getString("signup_flow_type");
                }
                wishapirequest = LoginActivity.getWishSignupFlow(wishapirequest);
                EmailLoginService.serializeSession(s4, email, System.currentTimeMillis(), s3);
                UserPreferences.setLoginEmail(email);
                UserPreferences.setLoginPassword(password);
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(s4, flag, wishapirequest);
                    return;
                }
                  goto _L3
                wishapirequest;
                if (failureCallback == null) goto _L3; else goto _L4
_L4:
                failureCallback.onServiceFailed(null);
                return;
                if (failureCallback == null) goto _L3; else goto _L5
_L5:
                failureCallback.onServiceFailed(null);
                return;
            }

            
            {
                this$0 = EmailSignupService.this;
                failureCallback = failurecallback;
                email = s;
                password = s1;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(EmailSignupService emailsignupservice, WishApiRequest wishapirequest)
    {
        emailsignupservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
