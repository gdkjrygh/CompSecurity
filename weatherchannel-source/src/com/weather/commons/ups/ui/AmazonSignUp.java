// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import com.amazon.identity.auth.device.AuthError;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.backend.AmazonLoginManager;
import com.weather.commons.ups.backend.location.AmazonLoginListener;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;
import com.weather.util.ui.UIUtil;

// Referenced classes of package com.weather.commons.ups.ui:
//            SocialSignUpFragment

class AmazonSignUp
    implements AmazonLoginListener
{

    private final Activity activity;

    AmazonSignUp(Activity activity1)
    {
        activity = (Activity)Preconditions.checkNotNull(activity1);
    }

    public void onLoginError(AuthError autherror)
    {
    }

    public void onLoginSuccess(final UserDetails userDetails, final String accessToken)
    {
        activity.runOnUiThread(new Runnable() {

            final AmazonSignUp this$0;
            final String val$accessToken;
            final UserDetails val$userDetails;

            public void run()
            {
                DsxAccount dsxaccount = new DsxAccount(userDetails.getUserId(), accessToken, com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_AMAZON);
                SocialSignUpFragment.newInstance(activity.getFragmentManager(), dsxaccount, userDetails);
            }

            
            {
                this$0 = AmazonSignUp.this;
                userDetails = userdetails;
                accessToken = s;
                super();
            }
        });
    }

    void signUp()
    {
        if (UIUtil.isAmazon(activity))
        {
            AmazonLoginManager amazonloginmanager = AmazonLoginManager.getInstance();
            AmazonLoginManager.initializeAmazonManager(activity, this);
            amazonloginmanager.connectAmazon();
        }
    }

}
