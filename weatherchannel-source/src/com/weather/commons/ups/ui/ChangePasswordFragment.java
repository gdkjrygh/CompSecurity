// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.weather.commons.ups.backend.AccountManager;

public class ChangePasswordFragment extends Fragment
{
    private static final class InputValidationMessage extends Enum
    {

        private static final InputValidationMessage $VALUES[];
        public static final InputValidationMessage CURRENT_PASSWORD_INCORRECT;
        public static final InputValidationMessage NEW_PASSWORD_INVALID;
        public static final InputValidationMessage SUCCESS;
        public static final InputValidationMessage UNKNOWN_ERROR;
        public static final InputValidationMessage VERIFY_PASSWORD_DIFFERENT;

        public static InputValidationMessage valueOf(String s)
        {
            return (InputValidationMessage)Enum.valueOf(com/weather/commons/ups/ui/ChangePasswordFragment$InputValidationMessage, s);
        }

        public static InputValidationMessage[] values()
        {
            return (InputValidationMessage[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new InputValidationMessage("SUCCESS", 0);
            CURRENT_PASSWORD_INCORRECT = new InputValidationMessage("CURRENT_PASSWORD_INCORRECT", 1);
            NEW_PASSWORD_INVALID = new InputValidationMessage("NEW_PASSWORD_INVALID", 2);
            VERIFY_PASSWORD_DIFFERENT = new InputValidationMessage("VERIFY_PASSWORD_DIFFERENT", 3);
            UNKNOWN_ERROR = new InputValidationMessage("UNKNOWN_ERROR", 4);
            $VALUES = (new InputValidationMessage[] {
                SUCCESS, CURRENT_PASSWORD_INCORRECT, NEW_PASSWORD_INVALID, VERIFY_PASSWORD_DIFFERENT, UNKNOWN_ERROR
            });
        }

        private InputValidationMessage(String s, int i)
        {
            super(s, i);
        }
    }

    private class SavePasswordTask extends AsyncTask
    {

        private final AccountManager accountManager;
        final ChangePasswordFragment this$0;

        protected transient InputValidationMessage doInBackground(Void avoid[])
        {
            avoid = currentPassword.getText().toString();
            String s = newPassword.getText().toString();
            String s1 = verifyPassword.getText().toString();
            if (avoid.isEmpty() || !accountManager.isPasswordCurrent(avoid))
            {
                return InputValidationMessage.CURRENT_PASSWORD_INCORRECT;
            }
            if (s.length() < 6)
            {
                return InputValidationMessage.NEW_PASSWORD_INVALID;
            }
            if (!s1.equals(s))
            {
                return InputValidationMessage.VERIFY_PASSWORD_DIFFERENT;
            }
            try
            {
                accountManager.changeWxAccountPassword(s);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("ChangePasswordActivity", (new StringBuilder()).append("Failed to change password:").append(avoid.getMessage()).toString());
                return InputValidationMessage.UNKNOWN_ERROR;
            }
            return InputValidationMessage.SUCCESS;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(InputValidationMessage inputvalidationmessage)
        {
            Activity activity = getActivity();
            if (activity == null)
            {
                return;
            }
            if (isVisible() && inputvalidationmessage == InputValidationMessage.SUCCESS)
            {
                Toast.makeText(activity, getString(com.weather.commons.R.string.change_password_success_message), 1).show();
                activity.onBackPressed();
                return;
            }
            if (inputvalidationmessage == InputValidationMessage.CURRENT_PASSWORD_INCORRECT)
            {
                currentPassword.setError(getString(com.weather.commons.R.string.password_incorrect_message));
                return;
            }
            if (inputvalidationmessage == InputValidationMessage.NEW_PASSWORD_INVALID)
            {
                newPassword.setError(getString(com.weather.commons.R.string.password_length_too_short_message));
                return;
            }
            if (inputvalidationmessage == InputValidationMessage.VERIFY_PASSWORD_DIFFERENT)
            {
                verifyPassword.setError(getString(com.weather.commons.R.string.passwords_do_not_match_msg));
                return;
            } else
            {
                Toast.makeText(activity, getString(com.weather.commons.R.string.failed_to_change_password_msg), 1).show();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((InputValidationMessage)obj);
        }

        private SavePasswordTask()
        {
            this$0 = ChangePasswordFragment.this;
            super();
            accountManager = AccountManager.getInstance();
        }

    }


    private static final String TAG = "ChangePasswordActivity";
    EditText currentPassword;
    EditText newPassword;
    Button saveButton;
    EditText verifyPassword;

    public ChangePasswordFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.weather.commons.R.layout.ups_change_password_screen, viewgroup, false);
        viewgroup = getActivity();
        if (viewgroup == null)
        {
            return null;
        }
        bundle = viewgroup.getActionBar();
        if (bundle != null)
        {
            bundle.setTitle(viewgroup.getResources().getString(com.weather.commons.R.string.account_settings_change_password_title));
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        currentPassword = (EditText)layoutinflater.findViewById(com.weather.commons.R.id.etCurrentPassword);
        newPassword = (EditText)layoutinflater.findViewById(com.weather.commons.R.id.etNewPassword);
        verifyPassword = (EditText)layoutinflater.findViewById(com.weather.commons.R.id.etVerifyPassword);
        saveButton = (Button)layoutinflater.findViewById(com.weather.commons.R.id.btSave);
        saveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ChangePasswordFragment this$0;

            public void onClick(View view)
            {
                (new SavePasswordTask()).execute(new Void[0]);
            }

            
            {
                this$0 = ChangePasswordFragment.this;
                super();
            }
        });
        return layoutinflater;
    }
}
