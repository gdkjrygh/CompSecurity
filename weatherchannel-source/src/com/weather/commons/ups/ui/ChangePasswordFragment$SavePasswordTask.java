// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import com.weather.commons.ups.backend.AccountManager;

// Referenced classes of package com.weather.commons.ups.ui:
//            ChangePasswordFragment

private class <init> extends AsyncTask
{

    private final AccountManager accountManager;
    final ChangePasswordFragment this$0;

    protected transient ssage doInBackground(Void avoid[])
    {
        avoid = currentPassword.getText().toString();
        String s = newPassword.getText().toString();
        String s1 = verifyPassword.getText().toString();
        if (avoid.isEmpty() || !accountManager.isPasswordCurrent(avoid))
        {
            return ssage.CURRENT_PASSWORD_INCORRECT;
        }
        if (s.length() < 6)
        {
            return ssage.NEW_PASSWORD_INVALID;
        }
        if (!s1.equals(s))
        {
            return ssage.VERIFY_PASSWORD_DIFFERENT;
        }
        try
        {
            accountManager.changeWxAccountPassword(s);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.e("ChangePasswordActivity", (new StringBuilder()).append("Failed to change password:").append(avoid.getMessage()).toString());
            return ssage.UNKNOWN_ERROR;
        }
        return ssage.SUCCESS;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(ssage ssage)
    {
        Activity activity = getActivity();
        if (activity == null)
        {
            return;
        }
        if (isVisible() && ssage == ssage.SUCCESS)
        {
            Toast.makeText(activity, getString(com.weather.commons.), 1).show();
            activity.onBackPressed();
            return;
        }
        if (ssage == ssage.CURRENT_PASSWORD_INCORRECT)
        {
            currentPassword.setError(getString(com.weather.commons.sword));
            return;
        }
        if (ssage == ssage.NEW_PASSWORD_INVALID)
        {
            newPassword.setError(getString(com.weather.commons.ge));
            return;
        }
        if (ssage == ssage.VERIFY_PASSWORD_DIFFERENT)
        {
            verifyPassword.setError(getString(com.weather.commons.word));
            return;
        } else
        {
            Toast.makeText(activity, getString(com.weather.commons.word), 1).show();
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ssage)obj);
    }

    private ssage()
    {
        this$0 = ChangePasswordFragment.this;
        super();
        accountManager = AccountManager.getInstance();
    }

    accountManager(accountManager accountmanager)
    {
        this();
    }
}
