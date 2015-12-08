// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.EditText;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.backend.location.LocationEndSyncService;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountLinkingTask

public class AccountCreator
{
    private class SyncTaskResultReceiver extends BroadcastReceiver
    {

        final AccountCreator this$0;

        public void onReceive(Context context, Intent intent)
        {
            activity.unregisterReceiver(this);
            (new AccountLinkingTask(account, demographics, progressDialog, activity)).execute(new Void[0]);
        }

        private SyncTaskResultReceiver()
        {
            this$0 = AccountCreator.this;
            super();
        }

    }


    private final DsxAccount account;
    private final Activity activity;
    private final Demographics demographics;
    private final ProgressDialog progressDialog;
    private EditText username;

    public AccountCreator(Activity activity1, ProgressDialog progressdialog, DsxAccount dsxaccount, Demographics demographics1)
    {
        demographics = (Demographics)Preconditions.checkNotNull(demographics1);
        activity = (Activity)Preconditions.checkNotNull(activity1);
        progressDialog = progressdialog;
        account = (DsxAccount)Preconditions.checkNotNull(dsxaccount);
    }

    public AccountCreator(Activity activity1, ProgressDialog progressdialog, DsxAccount dsxaccount, Demographics demographics1, EditText edittext)
    {
        username = (EditText)Preconditions.checkNotNull(edittext);
        demographics = (Demographics)Preconditions.checkNotNull(demographics1);
        activity = (Activity)Preconditions.checkNotNull(activity1);
        progressDialog = progressdialog;
        account = (DsxAccount)Preconditions.checkNotNull(dsxaccount);
    }

    public void linkDsxAccount()
    {
        if (progressDialog != null)
        {
            progressDialog.setMessage(activity.getString(com.weather.commons.R.string.creating_account_msg));
            progressDialog.show();
        }
        activity.startService(new Intent(activity, com/weather/commons/ups/backend/location/LocationEndSyncService));
        SyncTaskResultReceiver synctaskresultreceiver = new SyncTaskResultReceiver();
        IntentFilter intentfilter = new IntentFilter(activity.getString(com.weather.commons.R.string.sync_task_result));
        activity.registerReceiver(synctaskresultreceiver, intentfilter);
    }




}
