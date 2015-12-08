// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.AutoLoginEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

class val.auth
    implements com.walmart.android.wmservice.al.auth
{

    final val.auth this$2;
    final Authentication val$auth;

    public void onFailure(int i)
    {
        rror(i);
    }

    public void onSuccess()
    {
        esult(Boolean.valueOf(true));
        MessageBus.getBus().post(new AutoLoginEvent(val$auth.getCustomerId()));
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$auth = Authentication.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/main/StartupManager$LoginRequest$1

/* anonymous class */
    class StartupManager.LoginRequest._cls1
        implements Runnable
    {

        final StartupManager.LoginRequest this$1;

        public void run()
        {
            Authentication authentication = Services.get().getAuthentication();
            authentication.renewSession(authentication. new StartupManager.LoginRequest._cls1._cls1());
        }

            
            {
                this$1 = StartupManager.LoginRequest.this;
                super();
            }
    }

}
