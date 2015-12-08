// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.google.common.base.Supplier;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.backend.GooglePlusTaskRunner;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

private class <init> extends AsyncTask
{

    private boolean loggedOut;
    private boolean permissionsRevoked;
    final AccountSettingsFragment this$0;

    private void cleanup()
    {
        if (!loggedOut || !permissionsRevoked)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        AccountSettingsFragment.access$2100(AccountSettingsFragment.this).dismiss();
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.UPS_LOGOUT);
        KahunaEvents.getInstance().loggedIn(false);
        getActivity().onBackPressed();
        return;
        Exception exception;
        exception;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        AccountSettingsFragment.access$900(AccountSettingsFragment.this).logout(true);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        loggedOut = true;
        cleanup();
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (AccountSettingsFragment.access$900(AccountSettingsFragment.this).getLoginType() == com.weather.commons.ups.facade._GOOGLE_PLUS)
        {
            GooglePlusConnectionManager googleplusconnectionmanager = GooglePlusConnectionManager.getInstance();
            (new GooglePlusTaskRunner(new Runnable() {

                final AccountSettingsFragment.LogoutTask this$1;

                public void run()
                {
                    GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
                    permissionsRevoked = true;
                    cleanup();
                }

            
            {
                this$1 = AccountSettingsFragment.LogoutTask.this;
                super();
            }
            }, googleplusconnectionmanager, new Supplier() {

                final AccountSettingsFragment.LogoutTask this$1;

                public Activity get()
                {
                    return AccountSettingsFragment.access$600(this$0);
                }

                public volatile Object get()
                {
                    return get();
                }

            
            {
                this$1 = AccountSettingsFragment.LogoutTask.this;
                super();
            }
            })).execute();
            return;
        } else
        {
            permissionsRevoked = true;
            return;
        }
    }


/*
    static boolean access$1902(_cls2 _pcls2, boolean flag)
    {
        _pcls2.permissionsRevoked = flag;
        return flag;
    }

*/


    private _cls2.this._cls1()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
