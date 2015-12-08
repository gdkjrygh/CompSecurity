// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.ups.backend.AccountManager;

public class PasswordRetrievalActivity extends TWCBaseActivity
{
    private static class SendRecoveryEmail extends AsyncTask
    {

        private final AccountManager accountManager;
        private final Activity activity;
        private final TextView instructionText;

        protected transient Result doInBackground(String as[])
        {
            as = as[0];
            try
            {
                if (accountManager.sendPasswordRecoveryEmail(as))
                {
                    return Result.SUCCESS;
                }
                as = Result.UNKNOWN_PASSWORD;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Log.e("ForgotPasswordActivity", (new StringBuilder()).append("Unable to send password recovery Email ").append(as.getMessage()).toString());
                return Result.FAILURE;
            }
            return as;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Result result)
        {
            static class _cls2
            {

                static final int $SwitchMap$com$weather$commons$ups$ui$PasswordRetrievalActivity$SendRecoveryEmail$Result[];

                static 
                {
                    $SwitchMap$com$weather$commons$ups$ui$PasswordRetrievalActivity$SendRecoveryEmail$Result = new int[SendRecoveryEmail.Result.values().length];
                    try
                    {
                        $SwitchMap$com$weather$commons$ups$ui$PasswordRetrievalActivity$SendRecoveryEmail$Result[SendRecoveryEmail.Result.SUCCESS.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$ups$ui$PasswordRetrievalActivity$SendRecoveryEmail$Result[SendRecoveryEmail.Result.UNKNOWN_PASSWORD.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$commons$ups$ui$PasswordRetrievalActivity$SendRecoveryEmail$Result[SendRecoveryEmail.Result.FAILURE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2..SwitchMap.com.weather.commons.ups.ui.PasswordRetrievalActivity.SendRecoveryEmail.Result[result.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                Toast.makeText(activity, com.weather.commons.R.string.email_successfully_sent_msg, 1).show();
                activity.finish();
                return;

            case 2: // '\002'
                instructionText.setText(com.weather.commons.R.string.email_address_not_found_msg);
                instructionText.setTextColor(0xffff0000);
                return;

            case 3: // '\003'
                Toast.makeText(activity, com.weather.commons.R.string.failed_to_send_email_msg, 1).show();
                break;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Result)obj);
        }

        private SendRecoveryEmail(Activity activity1, TextView textview)
        {
            accountManager = AccountManager.getInstance();
            activity = activity1;
            instructionText = textview;
        }

    }

    static final class SendRecoveryEmail.Result extends Enum
    {

        private static final SendRecoveryEmail.Result $VALUES[];
        public static final SendRecoveryEmail.Result FAILURE;
        public static final SendRecoveryEmail.Result SUCCESS;
        public static final SendRecoveryEmail.Result UNKNOWN_PASSWORD;

        public static SendRecoveryEmail.Result valueOf(String s)
        {
            return (SendRecoveryEmail.Result)Enum.valueOf(com/weather/commons/ups/ui/PasswordRetrievalActivity$SendRecoveryEmail$Result, s);
        }

        public static SendRecoveryEmail.Result[] values()
        {
            return (SendRecoveryEmail.Result[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new SendRecoveryEmail.Result("SUCCESS", 0);
            UNKNOWN_PASSWORD = new SendRecoveryEmail.Result("UNKNOWN_PASSWORD", 1);
            FAILURE = new SendRecoveryEmail.Result("FAILURE", 2);
            $VALUES = (new SendRecoveryEmail.Result[] {
                SUCCESS, UNKNOWN_PASSWORD, FAILURE
            });
        }

        private SendRecoveryEmail.Result(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String COLOR_KEY = "INSTRUCTION_COLOR";
    private static final String TAG = "ForgotPasswordActivity";
    private static final String TEXT_KEY = "INSTRUCTION_TEXT";
    private ActionBar actionBar;
    EditText etEmail;
    TextView instructionText;
    Button sendEmailButton;

    public PasswordRetrievalActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.weather.commons.R.layout.ups_password_retrieval_activity);
        actionBar = getActionBar();
        if (actionBar != null)
        {
            actionBar.setDisplayOptions(15);
        }
        etEmail = (EditText)findViewById(com.weather.commons.R.id.etEmailAddress);
        instructionText = (TextView)findViewById(com.weather.commons.R.id.tvForgotPasswordPrompt);
        sendEmailButton = (Button)findViewById(com.weather.commons.R.id.ibSendEmail);
        sendEmailButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PasswordRetrievalActivity this$0;

            public void onClick(View view)
            {
                (new SendRecoveryEmail(PasswordRetrievalActivity.this, instructionText)).execute(new String[] {
                    etEmail.getText().toString()
                });
            }

            
            {
                this$0 = PasswordRetrievalActivity.this;
                super();
            }
        });
        if (bundle != null)
        {
            instructionText.setText(bundle.getString("INSTRUCTION_TEXT"));
            instructionText.setTextColor(bundle.getInt("INSTRUCTION_COLOR", 0xff000000));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.WX_PROFILE_FORGOT_PASSWORD);
        if (actionBar != null)
        {
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.argb(255, 48, 67, 103)));
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("INSTRUCTION_TEXT", instructionText.getText().toString());
        bundle.putInt("INSTRUCTION_COLOR", instructionText.getCurrentTextColor());
    }
}
