// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;

// Referenced classes of package com.weather.commons.ups.ui:
//            AmazonSignUp, SocialSignUpFragment

class val.accessToken
    implements Runnable
{

    final AmazonSignUp this$0;
    final String val$accessToken;
    final UserDetails val$userDetails;

    public void run()
    {
        DsxAccount dsxaccount = new DsxAccount(val$userDetails.getUserId(), val$accessToken, com.weather.commons.ups.facade.untProvider.PROVIDER_AMAZON);
        SocialSignUpFragment.newInstance(AmazonSignUp.access$000(AmazonSignUp.this).getFragmentManager(), dsxaccount, val$userDetails);
    }

    gment()
    {
        this$0 = final_amazonsignup;
        val$userDetails = userdetails;
        val$accessToken = String.this;
        super();
    }
}
