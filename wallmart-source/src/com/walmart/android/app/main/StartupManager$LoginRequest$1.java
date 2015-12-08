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

class this._cls1
    implements Runnable
{

    final _cls1.val.auth this$1;

    public void run()
    {
        final Authentication auth = Services.get().getAuthentication();
        auth.renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

            final StartupManager.LoginRequest._cls1 this$2;
            final Authentication val$auth;

            public void onFailure(int i)
            {
                setError(i);
            }

            public void onSuccess()
            {
                setResult(Boolean.valueOf(true));
                MessageBus.getBus().post(new AutoLoginEvent(auth.getCustomerId()));
            }

            
            {
                this$2 = StartupManager.LoginRequest._cls1.this;
                auth = authentication;
                super();
            }
        });
    }

    _cls1.val.auth()
    {
        this$1 = this._cls1.this;
        super();
    }
}
