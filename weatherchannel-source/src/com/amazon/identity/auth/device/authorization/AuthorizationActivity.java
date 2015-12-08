// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.utils.MAPLog;

// Referenced classes of package com.amazon.identity.auth.device.authorization:
//            AuthorizationResponseParser, CallbackInfo, AuthorizationHelper

public class AuthorizationActivity extends Activity
{

    private static final String LOG_TAG = com/amazon/identity/auth/device/authorization/AuthorizationActivity.getName();

    public AuthorizationActivity()
    {
    }

    protected void onCreate(final Bundle callbackIntentInfo)
    {
        Object obj;
        AuthorizationResponseParser authorizationresponseparser;
        super.onCreate(callbackIntentInfo);
        MAPLog.w(LOG_TAG, "onCreate");
        obj = getIntent().getData();
        if (obj == null)
        {
            MAPLog.i(LOG_TAG, "uri is null onCreate - closing activity");
            finish();
            return;
        }
        authorizationresponseparser = new AuthorizationResponseParser();
        callbackIntentInfo = AuthorizationResponseParser.getCallbackInfo(((Uri) (obj)).toString());
        if (obj == null || callbackIntentInfo == null) goto _L2; else goto _L1
_L1:
        MAPLog.pii(LOG_TAG, "Received response from WebBroswer for OAuth2 flow", (new StringBuilder()).append("response=").append(((Uri) (obj)).toString()).toString());
        obj = authorizationresponseparser.extractResultsBundle(((Uri) (obj)).toString(), ((CallbackInfo) (callbackIntentInfo)).mRequestId, ((CallbackInfo) (callbackIntentInfo)).mRequestedScopes);
        if (((Bundle) (obj)).containsKey(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.CAUSE_ID.val))
        {
            ((CallbackInfo) (callbackIntentInfo)).mlistener.onCancel(((Bundle) (obj)));
            finish();
            return;
        }
          goto _L3
_L2:
        finish();
        return;
_L3:
        try
        {
            (new AuthorizationHelper()).doExchange(getApplicationContext(), ((Bundle) (obj)), new AuthorizationListener() {

                final AuthorizationActivity this$0;
                final CallbackInfo val$callbackIntentInfo;

                public void onCancel(Bundle bundle)
                {
                    MAPLog.w(AuthorizationActivity.LOG_TAG, "Code for Token Exchange Cancel");
                    if (callbackIntentInfo.mlistener != null)
                    {
                        callbackIntentInfo.mlistener.onCancel(bundle);
                    }
                }

                public void onError(AuthError autherror)
                {
                    MAPLog.w(AuthorizationActivity.LOG_TAG, (new StringBuilder()).append("Code for Token Exchange Error. ").append(autherror.getMessage()).toString());
                    if (callbackIntentInfo.mlistener != null)
                    {
                        callbackIntentInfo.mlistener.onError(autherror);
                    }
                }

                public void onSuccess(Bundle bundle)
                {
                    MAPLog.w(AuthorizationActivity.LOG_TAG, "Code for Token Exchange success");
                    if (callbackIntentInfo.mlistener != null)
                    {
                        callbackIntentInfo.mlistener.onSuccess(bundle);
                    }
                }

            
            {
                this$0 = AuthorizationActivity.this;
                callbackIntentInfo = callbackinfo;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (((CallbackInfo) (callbackIntentInfo)).mlistener != null)
            {
                ((CallbackInfo) (callbackIntentInfo)).mlistener.onError(((AuthError) (obj)));
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }


}
