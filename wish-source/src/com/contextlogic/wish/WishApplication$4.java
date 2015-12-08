// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;

import android.os.AsyncTask;
import com.amazon.android.adm.AmazonDeviceMessaging;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.service.PushRegistrationService;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.google.android.gms.gcm.GoogleCloudMessaging;

// Referenced classes of package com.contextlogic.wish:
//            WishApplication

class this._cls0 extends AsyncTask
{

    final WishApplication this$0;

    protected transient Boolean doInBackground(Void avoid[])
    {
        boolean flag;
        flag = false;
        avoid = null;
        if (!WishApplication.isPlayServicesAvailable()) goto _L2; else goto _L1
_L1:
        avoid = GoogleCloudMessaging.getInstance(WishApplication.getAppInstance()).register(new String[] {
            getString(0x7f0604ce)
        });
_L4:
        WishApplication.getAppInstance().setPushToken(avoid);
        if (!LoggedInUser.getInstance().isLoggedIn() || avoid == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (WishApi.getInstance().getConfig().hasSessionCookie())
        {
            (new PushRegistrationService()).requestService(avoid, null, null);
            UserPreferences.setPushToken(avoid);
        }
        flag = true;
_L5:
        return Boolean.valueOf(flag);
_L2:
        if (!WishApplication.getAppInstance().isAmazonBuild()) goto _L4; else goto _L3
_L3:
        avoid = AmazonDeviceMessaging.getInstance(WishApplication.getAppInstance()).register(new String[] {
            getString(0x7f0604b7)
        });
          goto _L4
        avoid;
          goto _L5
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    ging()
    {
        this$0 = WishApplication.this;
        super();
    }
}
