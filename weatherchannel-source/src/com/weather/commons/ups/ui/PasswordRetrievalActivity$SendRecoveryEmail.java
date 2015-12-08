// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.weather.commons.ups.backend.AccountManager;

// Referenced classes of package com.weather.commons.ups.ui:
//            PasswordRetrievalActivity

private static class <init> extends AsyncTask
{
    static final class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result FAILURE;
        public static final Result SUCCESS;
        public static final Result UNKNOWN_PASSWORD;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/weather/commons/ups/ui/PasswordRetrievalActivity$SendRecoveryEmail$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Result("SUCCESS", 0);
            UNKNOWN_PASSWORD = new Result("UNKNOWN_PASSWORD", 1);
            FAILURE = new Result("FAILURE", 2);
            $VALUES = (new Result[] {
                SUCCESS, UNKNOWN_PASSWORD, FAILURE
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }


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
        switch (eather.commons.ups.ui.PasswordRetrievalActivity.SendRecoveryEmail.Result[result.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Toast.makeText(activity, com.weather.commons.yEmail.activity, 1).show();
            activity.finish();
            return;

        case 2: // '\002'
            instructionText.setText(com.weather.commons.yEmail.instructionText);
            instructionText.setTextColor(0xffff0000);
            return;

        case 3: // '\003'
            Toast.makeText(activity, com.weather.commons.yEmail.activity, 1).show();
            break;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Result)obj);
    }

    private Result(Activity activity1, TextView textview)
    {
        accountManager = AccountManager.getInstance();
        activity = activity1;
        instructionText = textview;
    }

    instructionText(Activity activity1, TextView textview, instructionText instructiontext)
    {
        this(activity1, textview);
    }
}
