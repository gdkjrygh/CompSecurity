// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.shared.APIListener;
import com.weather.commons.ups.backend.location.AmazonLoginListener;
import com.weather.dal2.ups.UserDetails;

// Referenced classes of package com.weather.commons.ups.backend:
//            AmazonLoginManager

class val.profileBundle
    implements APIListener
{

    final IED this$0;
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
        if (bundle != null && val$profileBundle != null && AmazonLoginManager.access$500() != null)
        {
            String s = val$profileBundle.getString(com.amazon.identity.auth.device.authorization.api..);
            UserDetails userdetails = new UserDetails(s, val$profileBundle.getString(com.amazon.identity.auth.device.authorization.api..), null, val$profileBundle.getString(com.amazon.identity.auth.device.authorization.api..));
            Log.i("AmazonLoginManager", (new StringBuilder()).append("user ID ").append(s).toString());
            Log.i("AmazonLoginManager", (new StringBuilder()).append("access token ").append(bundle).toString());
            AmazonLoginManager.access$500().onLoginSuccess(userdetails, bundle);
        } else
        if (AmazonLoginManager.access$500() != null)
        {
            AmazonLoginManager.access$500().onLoginError(new AuthError((new StringBuilder()).append("Profile bundle ").append(val$profileBundle).toString(), com.amazon.identity.auth.device.IED));
            return;
        }
    }

    ILE_KEY()
    {
        this$0 = final_ile_key;
        val$profileBundle = Bundle.this;
        super();
    }
}
