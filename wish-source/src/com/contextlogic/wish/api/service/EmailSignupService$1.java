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
//            EmailSignupService, EmailLoginService

class sCallback
    implements WishApiCallback
{

    final EmailSignupService this$0;
    final String val$email;
    final ilureCallback val$failureCallback;
    final String val$password;
    final sCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        wishapirequest = null;
        EmailSignupService.access$002(EmailSignupService.this, null);
        if (val$failureCallback != null)
        {
            if (wishapiresponse != null)
            {
                wishapirequest = wishapiresponse.getMessage();
            }
            val$failureCallback.onServiceFailed(wishapirequest);
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        String s;
        s = null;
        EmailSignupService.access$002(EmailSignupService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            wishapirequest = s;
            if (wishapiresponse != null)
            {
                wishapirequest = wishapiresponse.getMessage();
            }
            val$failureCallback.onServiceFailed(wishapirequest);
        }
_L3:
        return;
_L2:
        String s1;
        s1 = (String)wishapirequest.getResponseCookies().get("sweeper_session");
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        WishApi.getInstance().getConfig().addSessionCookie(s1);
        String s2;
        boolean flag;
        s2 = wishapiresponse.getData().getString("user");
        flag = wishapiresponse.getData().optBoolean("new_user", false);
        s = "None";
        wishapirequest = s;
        if (!wishapiresponse.getData().has("signup_flow_type"))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        wishapirequest = s;
        if (!wishapiresponse.getData().isNull("signup_flow_type"))
        {
            wishapirequest = wishapiresponse.getData().getString("signup_flow_type");
        }
        wishapirequest = LoginActivity.getWishSignupFlow(wishapirequest);
        EmailLoginService.serializeSession(s2, val$email, System.currentTimeMillis(), s1);
        UserPreferences.setLoginEmail(val$email);
        UserPreferences.setLoginPassword(val$password);
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded(s2, flag, wishapirequest);
            return;
        }
          goto _L3
        wishapirequest;
        if (val$failureCallback == null) goto _L3; else goto _L4
_L4:
        val$failureCallback.onServiceFailed(null);
        return;
        if (val$failureCallback == null) goto _L3; else goto _L5
_L5:
        val$failureCallback.onServiceFailed(null);
        return;
    }

    sCallback()
    {
        this$0 = final_emailsignupservice;
        val$failureCallback = ilurecallback;
        val$email = s;
        val$password = s1;
        val$successCallback = sCallback.this;
        super();
    }
}
