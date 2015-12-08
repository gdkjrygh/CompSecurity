// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.HttpResponseConflictException;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.dal2.ups.Demographics;

public class ChangeEmailFragment extends PreferenceFragment
{
    private class SaveEmailTask extends AsyncTask
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
                    integer = Toast.makeText(activity, getString(com.weather.commons.R.string.change_email_successful_message), 1);
                    integer.setGravity(17, 0, 0);
                    integer.show();
                    activity.onBackPressed();
                }
                return;
            }
            if (integer.intValue() == 3)
            {
                changeEmail.setError(getString(com.weather.commons.R.string.email_address_exists));
                return;
            } else
            {
                Toast.makeText(activity.getApplicationContext(), getString(com.weather.commons.R.string.change_email_failure_message), 1).show();
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
            progressDialog.setMessage(getString(com.weather.commons.R.string.saving_email));
            progressDialog.show();
            return;
            Throwable throwable;
            throwable;
            Log.e("ChangeEmailActivity", throwable.getMessage(), throwable);
            return;
        }

        private SaveEmailTask(String s)
        {
            this$0 = ChangeEmailFragment.this;
            super();
            email = s;
        }

    }


    private static final String TAG = "ChangeEmailActivity";
    private EditText changeEmail;

    public ChangeEmailFragment()
    {
    }

    private void saveEmail()
    {
        String s = changeEmail.getText().toString();
        if (!UpsCommonUtil.isEmail(s))
        {
            changeEmail.setError(getString(com.weather.commons.R.string.invalid_email_prompt));
            return;
        } else
        {
            (new SaveEmailTask(s)).execute(new Void[0]);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.weather.commons.R.layout.ups_change_email_fragment, viewgroup, false);
        viewgroup = getActivity();
        if (viewgroup != null)
        {
            bundle = viewgroup.getActionBar();
            if (bundle != null)
            {
                bundle.setTitle(viewgroup.getResources().getString(com.weather.commons.R.string.account_settings_change_email_title));
                bundle.setDisplayHomeAsUpEnabled(true);
            }
        }
        changeEmail = (EditText)layoutinflater.findViewById(com.weather.commons.R.id.etNewEmail);
        ((Button)layoutinflater.findViewById(com.weather.commons.R.id.btSaveNewEmail)).setOnClickListener(new android.view.View.OnClickListener() {

            final ChangeEmailFragment this$0;

            public void onClick(View view)
            {
                saveEmail();
            }

            
            {
                this$0 = ChangeEmailFragment.this;
                super();
            }
        });
        return layoutinflater;
    }


}
