// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import com.google.common.base.Supplier;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;

// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil, AccountManager, AbnormalHttpResponseException, GooglePlusTaskRunner, 
//            GooglePlusConnectionManager

public static class progressDialog extends AsyncTask
{

    private boolean accountDeleted;
    private final AccountManager accountManager = AccountManager.getInstance();
    private final Activity activity;
    private final boolean isProfileCompletionFragment;
    private boolean permissionsRevoked;
    private final ProgressDialog progressDialog;

    private void cleanup()
    {
        if (accountDeleted && permissionsRevoked)
        {
            activity.onBackPressed();
            if (isProfileCompletionFragment)
            {
                activity.onBackPressed();
            }
        }
    }

    protected transient Boolean doInBackground(Void avoid[])
    {
        accountManager.deleteAccount();
        accountManager.logout(true);
        LocalyticsUpsSupport.recordAccountDeleted(LocalyticsHandler.getInstance());
        return Boolean.valueOf(true);
        avoid;
        Log.e("UpsCommonUtil", "network issue! Failed to delete account.");
_L2:
        return Boolean.valueOf(false);
        avoid;
        Log.e("UpsCommonUtil", "User login incorrect. Failed to delete account.");
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.e("UpsCommonUtil", "Unknown error occurred while trying to delete account");
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (progressDialog != null && progressDialog.isShowing())
        {
            progressDialog.dismiss();
        }
        if (boolean1.booleanValue() && activity != null)
        {
            accountDeleted = true;
            cleanup();
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (accountManager.getLoginType() == com.weather.commons.ups.facade.DER_GOOGLE_PLUS)
        {
            (new GooglePlusTaskRunner(new Runnable() {

                final UpsCommonUtil.DeleteAccountTask this$0;

                public void run()
                {
                    GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
                    permissionsRevoked = true;
                    cleanup();
                }

            
            {
                this$0 = UpsCommonUtil.DeleteAccountTask.this;
                super();
            }
            }, GooglePlusConnectionManager.getInstance(), new Supplier() {

                final UpsCommonUtil.DeleteAccountTask this$0;

                public Activity get()
                {
                    return activity;
                }

                public volatile Object get()
                {
                    return get();
                }

            
            {
                this$0 = UpsCommonUtil.DeleteAccountTask.this;
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
    static boolean access$002(_cls2 _pcls2, boolean flag)
    {
        _pcls2.permissionsRevoked = flag;
        return flag;
    }

*/



    public _cls2.this._cls0(Activity activity1, boolean flag, ProgressDialog progressdialog)
    {
        activity = activity1;
        isProfileCompletionFragment = flag;
        progressDialog = progressdialog;
    }
}
