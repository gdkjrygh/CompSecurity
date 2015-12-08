// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import com.weather.dal2.ups.UserDetails;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity

class val.accessToken
    implements Runnable
{

    final AbstractLoginActivity this$0;
    final String val$accessToken;
    final UserDetails val$userDetails;

    public void run()
    {
        AbstractLoginActivity.access$900(AbstractLoginActivity.this, val$userDetails, val$accessToken);
    }

    ()
    {
        this$0 = final_abstractloginactivity;
        val$userDetails = userdetails;
        val$accessToken = String.this;
        super();
    }
}
