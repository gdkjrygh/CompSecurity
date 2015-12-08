// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AmazonAuthorizationManager;
import com.amazon.identity.auth.device.shared.APIListener;
import com.weather.commons.ups.backend.location.AmazonLoginListener;
import com.weather.dal2.ups.UserDetails;

// Referenced classes of package com.weather.commons.ups.backend:
//            AmazonLoginManager

private static class <init>
    implements APIListener
{

    public void onError(AuthError autherror)
    {
        Log.e("AmazonLoginManager", autherror.getMessage(), autherror);
        if (AmazonLoginManager.access$500() != null)
        {
            AmazonLoginManager.access$500().onLoginError(autherror);
        }
    }

    public void onSuccess(final Bundle profileBundle)
    {
        profileBundle = profileBundle.getBundle(com.amazon.identity.auth.device.authorization.api.e.e);
        if (AmazonLoginManager.access$100() != null)
        {
            AmazonLoginManager.access$100().getToken(AmazonLoginManager.access$400(), new APIListener() {

                final AmazonLoginManager.ProfileListener this$0;
                final Bundle val$profileBundle;

                public void onError(AuthError autherror)
                {
                    Log.e("AmazonLoginManager", (new StringBuilder()).append("error in access token ").append(autherror).toString());
                    if (AmazonLoginManager.access$500() != null)
                    {
                        AmazonLoginManager.access$500().onLoginError(autherror);
                    }
                }

                public void onSuccess(Bundle bundle)
                {
                    bundle = bundle.getString("com.amazon.identity.auth.device.authorization.token");
                    if (bundle != null && profileBundle != null && AmazonLoginManager.access$500() != null)
                    {
                        String s = profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.USER_ID.val);
                        UserDetails userdetails = new UserDetails(s, profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.NAME.val), null, profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.EMAIL.val));
                        Log.i("AmazonLoginManager", (new StringBuilder()).append("user ID ").append(s).toString());
                        Log.i("AmazonLoginManager", (new StringBuilder()).append("access token ").append(bundle).toString());
                        AmazonLoginManager.access$500().onLoginSuccess(userdetails, bundle);
                    } else
                    if (AmazonLoginManager.access$500() != null)
                    {
                        AmazonLoginManager.access$500().onLoginError(new AuthError((new StringBuilder()).append("Profile bundle ").append(profileBundle).toString(), com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
                        return;
                    }
                }

            
            {
                this$0 = AmazonLoginManager.ProfileListener.this;
                profileBundle = bundle;
                super();
            }
            });
        }
    }

    private _cls1.val.profileBundle()
    {
    }

    _cls1.val.profileBundle(_cls1.val.profileBundle profilebundle)
    {
        this();
    }
}
