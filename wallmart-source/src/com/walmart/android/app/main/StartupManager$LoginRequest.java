// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.AutoLoginEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.main:
//            StartupManager

private class <init> extends t
{

    final StartupManager this$0;

    protected void execute(Context context, AsyncCallback asynccallback)
    {
        if (StartupManager.access$100(StartupManager.this))
        {
            asynccallback.onCancelled();
            return;
        } else
        {
            StartupManager.access$800(StartupManager.this).post(new Runnable() {

                final StartupManager.LoginRequest this$1;

                public void run()
                {
                    Authentication authentication = Services.get().getAuthentication();
                    authentication.renewSession(authentication. new com.walmart.android.wmservice.Authentication.AuthCallback() {

                        final _cls1 this$2;
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
                this$2 = final__pcls1;
                auth = Authentication.this;
                super();
            }
                    });
                }

            
            {
                this$1 = StartupManager.LoginRequest.this;
                super();
            }
            });
            return;
        }
    }

    private _cls1.this._cls1()
    {
        this$0 = StartupManager.this;
        super(null);
    }

    t(t t)
    {
        this();
    }
}
