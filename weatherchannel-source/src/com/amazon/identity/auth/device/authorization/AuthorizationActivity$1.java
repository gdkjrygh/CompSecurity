// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.utils.MAPLog;

// Referenced classes of package com.amazon.identity.auth.device.authorization:
//            AuthorizationActivity, CallbackInfo

class val.callbackIntentInfo
    implements AuthorizationListener
{

    final AuthorizationActivity this$0;
    final CallbackInfo val$callbackIntentInfo;

    public void onCancel(Bundle bundle)
    {
        MAPLog.w(AuthorizationActivity.access$000(), "Code for Token Exchange Cancel");
        if (val$callbackIntentInfo.mlistener != null)
        {
            val$callbackIntentInfo.mlistener.onCancel(bundle);
        }
    }

    public void onError(AuthError autherror)
    {
        MAPLog.w(AuthorizationActivity.access$000(), (new StringBuilder()).append("Code for Token Exchange Error. ").append(autherror.getMessage()).toString());
        if (val$callbackIntentInfo.mlistener != null)
        {
            val$callbackIntentInfo.mlistener.onError(autherror);
        }
    }

    public void onSuccess(Bundle bundle)
    {
        MAPLog.w(AuthorizationActivity.access$000(), "Code for Token Exchange success");
        if (val$callbackIntentInfo.mlistener != null)
        {
            val$callbackIntentInfo.mlistener.onSuccess(bundle);
        }
    }

    r()
    {
        this$0 = final_authorizationactivity;
        val$callbackIntentInfo = CallbackInfo.this;
        super();
    }
}
