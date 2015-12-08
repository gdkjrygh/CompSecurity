// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.HttpResponseConflictException;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.ups.ui:
//            Liveable

class SaveDemographicsInfoTask extends AsyncTask
{

    private static final int CLEANUP_FAILURE = 4;
    private static final int CONFLICT = 3;
    private static final int FAILURE = 2;
    private static final int SUCCESS = 1;
    private static final String TAG = "SaveDemographicsInfoTask";
    private final AccountManager accountManager;
    private final Activity activity;
    private final ProgressDialog progressDialog;
    private EditText username;

    public SaveDemographicsInfoTask(Activity activity1, ProgressDialog progressdialog)
    {
        accountManager = AccountManager.getInstance();
        progressDialog = progressdialog;
        activity = (Activity)Preconditions.checkNotNull(activity1);
    }

    public SaveDemographicsInfoTask(Activity activity1, ProgressDialog progressdialog, EditText edittext)
    {
        accountManager = AccountManager.getInstance();
        progressDialog = progressdialog;
        activity = (Activity)Preconditions.checkNotNull(activity1);
        username = (EditText)Preconditions.checkNotNull(edittext);
    }

    protected transient Integer doInBackground(Demographics ademographics[])
    {
        accountManager.saveDemographicsInfo(ademographics[0]);
        int i = 1;
_L2:
        return Integer.valueOf(i);
        ademographics;
        i = 3;
        continue; /* Loop/switch isn't completed */
        ademographics;
        Log.e("SaveDemographicsInfoTask", ademographics.getMessage(), ademographics);
        i = 2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Demographics[])aobj);
    }

    protected void onPostExecute(Integer integer)
    {
        if (!activity.isFinishing() && (!(activity instanceof Liveable) || ((Liveable)activity).isAlive())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (progressDialog != null && progressDialog.isShowing())
        {
            progressDialog.dismiss();
        }
        switch (integer.intValue())
        {
        case 2: // '\002'
        default:
            Toast.makeText(activity.getApplicationContext(), activity.getString(com.weather.commons.R.string.account_setting_saving_failure_msg), 1).show();
            return;

        case 1: // '\001'
            Toast.makeText(activity, activity.getString(com.weather.commons.R.string.account_setting_saving_success_msg), 1).show();
            return;

        case 3: // '\003'
            if (username != null)
            {
                username.setError(activity.getString(com.weather.commons.R.string.username_already_used_msg));
                return;
            }
            break;

        case 4: // '\004'
            Toast.makeText(activity.getApplicationContext(), activity.getString(com.weather.commons.R.string.account_setting_saving_failure_msg), 1).show();
            activity.finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }

    protected void onPreExecute()
    {
        try
        {
            if (progressDialog != null && !progressDialog.isShowing())
            {
                progressDialog.setMessage(activity.getString(com.weather.commons.R.string.saving_account_settings_msg));
                progressDialog.show();
            }
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("SaveDemographicsInfoTask", throwable.getMessage(), throwable);
        }
    }
}
