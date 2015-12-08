// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.HttpResponseConflictException;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.ups.Demographics;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.ups.ui:
//            Liveable, AlertActivationFragment

class AccountLinkingTask extends AsyncTask
{
    static final class LoginResult extends Enum
    {

        private static final LoginResult $VALUES[];
        public static final LoginResult AUTHENTICATION_ERROR;
        public static final LoginResult CLEANUP_FAILURE;
        public static final LoginResult CONFLICT;
        public static final LoginResult DUPLICATE_EMAIL_ADDRESS;
        public static final LoginResult FAILURE;
        public static final LoginResult NETWORK_ERROR;
        public static final LoginResult SUCCESS;
        private final Integer errorMessageResourceId;
        private final boolean isTerminatingError;

        public static LoginResult valueOf(String s)
        {
            return (LoginResult)Enum.valueOf(com/weather/commons/ups/ui/AccountLinkingTask$LoginResult, s);
        }

        public static LoginResult[] values()
        {
            return (LoginResult[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new LoginResult("SUCCESS", 0, null, false);
            NETWORK_ERROR = new LoginResult("NETWORK_ERROR", 1, Integer.valueOf(com.weather.commons.R.string.network_connection_error_msg), false);
            CONFLICT = new LoginResult("CONFLICT", 2, Integer.valueOf(com.weather.commons.R.string.account_already_exists_signing_in_instead_msg), true);
            AUTHENTICATION_ERROR = new LoginResult("AUTHENTICATION_ERROR", 3, Integer.valueOf(com.weather.commons.R.string.failed_to_login_to_existing_account_msg), false);
            DUPLICATE_EMAIL_ADDRESS = new LoginResult("DUPLICATE_EMAIL_ADDRESS", 4, Integer.valueOf(com.weather.commons.R.string.email_already_used_msg), false);
            CLEANUP_FAILURE = new LoginResult("CLEANUP_FAILURE", 5, Integer.valueOf(com.weather.commons.R.string.account_setting_saving_failure_msg), true);
            FAILURE = new LoginResult("FAILURE", 6, Integer.valueOf(com.weather.commons.R.string.failed_to_sign_up_msg), false);
            $VALUES = (new LoginResult[] {
                SUCCESS, NETWORK_ERROR, CONFLICT, AUTHENTICATION_ERROR, DUPLICATE_EMAIL_ADDRESS, CLEANUP_FAILURE, FAILURE
            });
        }



        private LoginResult(String s, int i, Integer integer, boolean flag)
        {
            super(s, i);
            errorMessageResourceId = integer;
            isTerminatingError = flag;
        }
    }


    private static final String TAG = "AccountLinkingTask";
    private final DsxAccount account;
    private final AccountManager accountManager;
    private final Activity activity;
    private final Demographics demographics;
    private final LocalyticsHandler localyticsHandler;
    private final ProgressDialog progressDialog;
    private final Prefs twcPrefs;

    AccountLinkingTask(DsxAccount dsxaccount, Demographics demographics1, ProgressDialog progressdialog, Activity activity1)
    {
        this(dsxaccount, demographics1, progressdialog, activity1, AccountManager.getInstance(), TwcPrefs.getInstance(), LocalyticsHandler.getInstance());
    }

    AccountLinkingTask(DsxAccount dsxaccount, Demographics demographics1, ProgressDialog progressdialog, Activity activity1, AccountManager accountmanager, Prefs prefs, LocalyticsHandler localyticshandler)
    {
        accountManager = accountmanager;
        account = dsxaccount;
        demographics = demographics1;
        progressDialog = progressdialog;
        activity = activity1;
        twcPrefs = prefs;
        localyticsHandler = localyticshandler;
    }

    private LoginResult createAccount()
    {
        LoginResult loginresult;
        try
        {
            accountManager.linkAnonAccount(account);
            twcPrefs.putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue());
            loginresult = LoginResult.SUCCESS;
        }
        catch (HttpResponseConflictException httpresponseconflictexception)
        {
            return loginAfterConflict();
        }
        catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception)
        {
            EventLog.e("AccountLinkingTask", "Unable to login", httprequestexception);
            return LoginResult.NETWORK_ERROR;
        }
        catch (Exception exception)
        {
            EventLog.e("AccountLinkingTask", "Unable to login", exception);
            return LoginResult.FAILURE;
        }
        return loginresult;
    }

    private boolean deleteAccount()
    {
        accountManager.deleteAccount();
        accountManager.createAnonAccount();
        return true;
        Object obj;
        obj;
_L2:
        EventLog.e("AccountLinkingTask", "Unable to delete account after failing to save demographics", ((Throwable) (obj)));
        return false;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private LoginResult loginAfterConflict()
    {
        publishProgress(new Integer[] {
            Integer.valueOf(0)
        });
        LoginResult loginresult;
        accountManager.switchAccount(account);
        twcPrefs.putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue());
        loginresult = LoginResult.CONFLICT;
        return loginresult;
        Object obj;
        obj;
_L2:
        try
        {
            accountManager.loginAccount(UpsCommonUtil.getAnonAccount());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("AccountLinkingTask", (new StringBuilder()).append("failed to switch back to anon account:").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return LoginResult.AUTHENTICATION_ERROR;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private LoginResult saveDemographics()
    {
        LoginResult loginresult;
        try
        {
            accountManager.saveDemographicsInfo(demographics);
            loginresult = LoginResult.SUCCESS;
        }
        catch (HttpResponseConflictException httpresponseconflictexception)
        {
            return LoginResult.DUPLICATE_EMAIL_ADDRESS;
        }
        catch (Exception exception)
        {
            Log.e("AccountLinkingTask", exception.getMessage(), exception);
            return LoginResult.FAILURE;
        }
        return loginresult;
    }

    protected transient LoginResult doInBackground(Void avoid[])
    {
        boolean flag;
        boolean flag1;
        localyticsHandler.getUpsSignupSummaryRecorder().recordAttemptStarted();
        flag1 = false;
        flag = flag1;
        avoid = createAccount();
        flag = flag1;
        LoginResult loginresult = LoginResult.SUCCESS;
        if (avoid == loginresult) goto _L2; else goto _L1
_L1:
        if (false)
        {
            LocalyticsUpsSupport.recordSignupComplete(localyticsHandler, demographics, account);
            SessionMUtils.logAction("weather_profile_signup");
            Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_account_created), null);
            KahunaEvents.getInstance().signUp();
            if (account.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
            {
                twcPrefs.putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, account.getId());
            }
        }
_L4:
        return avoid;
_L2:
        flag1 = true;
        flag = flag1;
        avoid = saveDemographics();
        flag = flag1;
        if (avoid == LoginResult.SUCCESS)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!deleteAccount())
        {
            break MISSING_BLOCK_LABEL_234;
        }
        flag = false;
        twcPrefs.putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT.getValue());
        if (false)
        {
            LocalyticsUpsSupport.recordSignupComplete(localyticsHandler, demographics, account);
            SessionMUtils.logAction("weather_profile_signup");
            Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_account_created), null);
            KahunaEvents.getInstance().signUp();
            if (account.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
            {
                twcPrefs.putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, account.getId());
            }
        }
        return avoid;
        flag = flag1;
        loginresult = LoginResult.CLEANUP_FAILURE;
        avoid = loginresult;
        if (true)
        {
            LocalyticsUpsSupport.recordSignupComplete(localyticsHandler, demographics, account);
            SessionMUtils.logAction("weather_profile_signup");
            Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_account_created), null);
            KahunaEvents.getInstance().signUp();
            avoid = loginresult;
            if (account.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
            {
                twcPrefs.putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, account.getId());
                return loginresult;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = flag1;
        loginresult = LoginResult.SUCCESS;
        avoid = loginresult;
        if (false) goto _L4; else goto _L5
_L5:
        LocalyticsUpsSupport.recordSignupComplete(localyticsHandler, demographics, account);
        SessionMUtils.logAction("weather_profile_signup");
        Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_account_created), null);
        KahunaEvents.getInstance().signUp();
        avoid = loginresult;
        if (account.getProvider() != com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL) goto _L4; else goto _L6
_L6:
        twcPrefs.putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, account.getId());
        return loginresult;
        avoid;
        if (flag)
        {
            LocalyticsUpsSupport.recordSignupComplete(localyticsHandler, demographics, account);
            SessionMUtils.logAction("weather_profile_signup");
            Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_account_created), null);
            KahunaEvents.getInstance().signUp();
            if (account.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
            {
                twcPrefs.putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, account.getId());
            }
        }
        throw avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(LoginResult loginresult)
    {
        super.onPostExecute(loginresult);
        if (!activity.isFinishing() && (!(activity instanceof Liveable) || ((Liveable)activity).isAlive()))
        {
            if (progressDialog != null && progressDialog.isShowing())
            {
                progressDialog.dismiss();
            }
            if (loginresult.errorMessageResourceId != null)
            {
                Toast.makeText(activity, activity.getString(loginresult.errorMessageResourceId.intValue()), 1).show();
            }
            if (loginresult.isTerminatingError)
            {
                activity.finish();
                return;
            }
            if (loginresult == LoginResult.SUCCESS)
            {
                AlertActivationFragment.newInstance(activity.getFragmentManager());
                return;
            }
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((LoginResult)obj);
    }

    protected transient void onProgressUpdate(Integer ainteger[])
    {
        super.onProgressUpdate(ainteger);
        if (ainteger[0].intValue() == 0 && progressDialog != null)
        {
            progressDialog.setMessage(activity.getString(com.weather.commons.R.string.account_already_exists_signing_in_instead_msg));
        }
    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Integer[])aobj);
    }
}
