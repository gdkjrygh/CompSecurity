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
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.HttpResponseConflictException;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.ups.ui:
//            ChangeEmailFragment

private class <init> extends AsyncTask
{

    private static final int CONFLICT = 3;
    private static final int FAILURE = 2;
    private static final int SUCCESS = 1;
    private final String email;
    private ProgressDialog progressDialog;
    final ChangeEmailFragment this$0;

    protected transient Integer doInBackground(Void avoid[])
    {
        avoid = new Demographics();
        avoid.setTwcAccountEmail(email);
        try
        {
            AccountManager.getInstance().saveDemographicsInfo(avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            return Integer.valueOf(3);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("ChangeEmailActivity", avoid.getMessage(), avoid);
            return Integer.valueOf(2);
        }
        return Integer.valueOf(1);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Integer integer)
    {
        Activity activity;
label0:
        {
            if (progressDialog != null && progressDialog.isShowing())
            {
                progressDialog.dismiss();
            }
            activity = getActivity();
            if (activity != null)
            {
                if (integer.intValue() != 1)
                {
                    break label0;
                }
                integer = Toast.makeText(activity, getString(com.weather.commons.essage), 1);
                integer.setGravity(17, 0, 0);
                integer.show();
                activity.onBackPressed();
            }
            return;
        }
        if (integer.intValue() == 3)
        {
            ChangeEmailFragment.access$200(ChangeEmailFragment.this).setError(getString(com.weather.commons.ng));
            return;
        } else
        {
            Toast.makeText(activity.getApplicationContext(), getString(com.weather.commons.age), 1).show();
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Integer)obj);
    }

    protected void onPreExecute()
    {
        Activity activity;
        activity = getActivity();
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        progressDialog = new ProgressDialog(activity);
        progressDialog.setMessage(getString(com.weather.commons.ng));
        progressDialog.show();
        return;
        Throwable throwable;
        throwable;
        Log.e("ChangeEmailActivity", throwable.getMessage(), throwable);
        return;
    }

    private (String s)
    {
        this$0 = ChangeEmailFragment.this;
        super();
        email = s;
    }

    email(String s, email email1)
    {
        this(s);
    }
}
