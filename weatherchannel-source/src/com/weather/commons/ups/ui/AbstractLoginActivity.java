// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.amazon.identity.auth.device.AuthError;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.plus.model.people.Person;
import com.google.gson.JsonParseException;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsAccountProvider;
import com.weather.commons.analytics.ups.LocalyticsUpsLoginSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.AmazonLoginManager;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.backend.UpsCommonUtil;
import com.weather.commons.ups.backend.location.AmazonLoginListener;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.dal2.ups.UserDetails;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.ups.ui:
//            PasswordRetrievalActivity, SaveDemographicsInfoTask

public abstract class AbstractLoginActivity extends TWCBaseActivity
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, AmazonLoginListener
{
    private class AccessTokenFetchTask extends AsyncTask
    {

        final AbstractLoginActivity this$0;

        private void loginGoogleUser(Person person, String s, String s1)
        {
            s = new DsxAccount(person.getId(), s, com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS);
            person = new UserDetails(person.getId(), person.getDisplayName(), null, s1);
            login(person, s);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            try
            {
                avoid = googleManager.retrieveToken(AbstractLoginActivity.this, googleManager.getAccountName(), "oauth2:https://www.googleapis.com/auth/plus.login");
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("LoginActivity", avoid.toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("LoginActivity", avoid.toString());
                avoid = avoid.getIntent();
                startActivityForResult(avoid, 0x186a0);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("LoginActivity", avoid.toString());
                return null;
            }
            return avoid;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            Person person = googleManager.getCurrentPerson();
            String s1 = googleManager.getAccountName();
            if (person != null && s1 != null)
            {
                loginGoogleUser(person, s, s1);
            }
        }

        private AccessTokenFetchTask()
        {
            this$0 = AbstractLoginActivity.this;
            super();
        }

    }

    private static final class AppEventReceiver
    {

        public void onAppEvent(AppEvent appevent)
        {
            static class _cls9
            {

                static final int $SwitchMap$com$weather$dal2$system$AppEvent$Cause[];

                static 
                {
                    $SwitchMap$com$weather$dal2$system$AppEvent$Cause = new int[com.weather.dal2.system.AppEvent.Cause.values().length];
                    try
                    {
                        $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_START.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.AppEvent.Cause.APP_STOP.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls9..SwitchMap.com.weather.dal2.system.AppEvent.Cause[appevent.getCause().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                LocalyticsHandler.getInstance().getUpsLoginSummaryRecorder().resumeTime();
                return;

            case 2: // '\002'
                LocalyticsHandler.getInstance().getUpsLoginSummaryRecorder().pauseTime();
                break;
            }
        }

        private AppEventReceiver()
        {
        }

    }

    private static class ButtonOnClickListener
        implements android.view.View.OnClickListener
    {

        private final Runnable loginTask;

        public void onClick(View view)
        {
            LocalyticsHandler.getInstance().getUpsLoginSummaryRecorder().recordAttemptStarted();
            loginTask.run();
        }

        private ButtonOnClickListener(Runnable runnable)
        {
            loginTask = runnable;
        }

    }

    private class LoginAccountTask extends AsyncTask
    {

        private DsxAccount myAccount;
        final AbstractLoginActivity this$0;
        private UserDetails userDetails;

        private void switchBackToAnon()
        {
            try
            {
                accountManager.loginAccount(UpsCommonUtil.getAnonAccount());
                return;
            }
            catch (Exception exception) { }
            try
            {
                accountManager.createAnonAccount();
                return;
            }
            catch (Exception exception1)
            {
                Log.e("LoginActivity", (new StringBuilder()).append("failed to switch back to anon account ").append(exception1.getMessage()).toString(), exception1);
            }
            accountManager.clearDsxCookie();
        }

        protected transient com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse doInBackground(Void avoid[])
        {
            avoid = com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.GENERIC_ERROR;
            if (myAccount != null)
            {
                accountManager.switchAccount(myAccount);
                avoid = com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.SUCCESS;
            }
            return avoid;
            avoid;
            return com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.NETWORK_ERROR;
            avoid;
_L2:
            switchBackToAnon();
            return com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.JSON_ERROR;
            avoid;
            switchBackToAnon();
            return com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.AUTHENTICATION_ERROR;
            avoid;
            switchBackToAnon();
            return com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.GENERIC_ERROR;
            avoid;
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse loginresponse)
        {
            if (progressDialog != null && progressDialog.isShowing())
            {
                progressDialog.dismiss();
            }
            if (loginresponse == com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.SUCCESS)
            {
                Toast.makeText(AbstractLoginActivity.this, getString(com.weather.commons.R.string.login_successful_message), 1).show();
                TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue());
                if (userDetails != null)
                {
                    (new GetDemographicsInfoTask()).execute(new Void[0]);
                }
                LocationManager.getLocationManager().setCurrentLocation();
                localyticsHandler.getUpsLoginSummaryRecorder().recordLoginComplete(LocalyticsUpsAccountProvider.valueOf(myAccount.getProvider()));
                KahunaEvents.getInstance().loggedIn(true);
                finish();
                return;
            }
            if (loginresponse == com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.NETWORK_ERROR)
            {
                Toast.makeText(AbstractLoginActivity.this, getString(com.weather.commons.R.string.network_error_message), 1).show();
                return;
            }
            if (loginresponse == com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse.AUTHENTICATION_ERROR)
            {
                if (myAccount.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
                {
                    incorrectLoginCredential.setVisibility(0);
                    return;
                }
                if (myAccount.getProvider() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS)
                {
                    googleManager.disconnectAndRevoke();
                }
                startSignupActivity();
                finish();
                return;
            } else
            {
                Toast.makeText(AbstractLoginActivity.this, getString(com.weather.commons.R.string.login_failure_message), 1).show();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((com.weather.commons.ups.backend.UpsCommonUtil.LoginResponse)obj);
        }

        protected void onPreExecute()
        {
            try
            {
                progressDialog = new ProgressDialog(AbstractLoginActivity.this);
                progressDialog.setMessage(getString(com.weather.commons.R.string.logging_in_msg));
                progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final LoginAccountTask this$1;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        cancel(true);
                    }

            
            {
                this$1 = LoginAccountTask.this;
                super();
            }
                });
                progressDialog.show();
                return;
            }
            catch (Throwable throwable)
            {
                Log.e("LoginActivity", throwable.getMessage(), throwable);
            }
        }


        private LoginAccountTask()
        {
            this$0 = AbstractLoginActivity.this;
            super();
        }

        LoginAccountTask(UserDetails userdetails, DsxAccount dsxaccount)
        {
            this$0 = AbstractLoginActivity.this;
            super();
            userDetails = userdetails;
            myAccount = dsxaccount;
        }
    }

    private class LoginAccountTask.GetDemographicsInfoTask extends AsyncTask
    {

        final LoginAccountTask this$1;

        private void saveDemographicsInfo(Demographics demographics)
        {
            ProgressDialog progressdialog = new ProgressDialog(_fld0);
            (new SaveDemographicsInfoTask(_fld0, progressdialog)).execute(new Demographics[] {
                demographics
            });
        }

        protected transient Demographics doInBackground(Void avoid[])
        {
            avoid = null;
            Demographics demographics;
            try
            {
                demographics = accountManager.getDemographics();
            }
            catch (Exception exception)
            {
                Log.e("LoginActivity", exception.getMessage());
                return avoid;
            }
            avoid = demographics;
            BasicDemographicsStorage.getInstance().write(demographics);
            return demographics;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Demographics demographics)
        {
            if (demographics == null || userDetails == null || demographics.getFirstName() != null && !demographics.getFirstName().isEmpty() || demographics.getLastName() != null && !demographics.getLastName().isEmpty() || demographics.getTwcAccountEmail() != null && !demographics.getTwcAccountEmail().isEmpty())
            {
                return;
            } else
            {
                demographics = new Demographics();
                demographics.setUserDetails(userDetails);
                saveDemographicsInfo(demographics);
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Demographics)obj);
        }

        private LoginAccountTask.GetDemographicsInfoTask()
        {
            this$1 = LoginAccountTask.this;
            super();
        }

    }


    private static final int GOOGLE_DEFAULT_STATE = -1;
    private static final int GOOGLE_STATE_IN_PROGRESS = 2;
    private static final int GOOGLE_STATE_SIGN_IN = 1;
    private static final String SAVED_GOOGLE_PROGRESS = "google_sign_in_progress";
    private static final String TAG = "LoginActivity";
    private static final AppEventReceiver appEventReceiver = new AppEventReceiver();
    final AccountManager accountManager = AccountManager.getInstance();
    private View amazonLogin;
    private ProgressDialog connectionProgressDialog;
    private View facebookLogin;
    private View googleLogin;
    private GooglePlusConnectionManager googleManager;
    private int googleSignInProgress;
    private TextView incorrectLoginCredential;
    protected LocalyticsHandler localyticsHandler;
    private EditText password;
    private TextView passwordRetrievalLink;
    private ProgressDialog progressDialog;
    private TextView signUpLink;
    private Button twcLogin;
    private EditText username;

    public AbstractLoginActivity()
    {
        localyticsHandler = LocalyticsHandler.getInstance();
    }

    private void createFacebookSession()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("email");
        Session.openActiveSession(this, true, arraylist, new com.facebook.Session.StatusCallback() {

            final AbstractLoginActivity this$0;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                if (session.isOpened())
                {
                    Request.newMeRequest(session, session. new com.facebook.Request.GraphUserCallback() {

                        final _cls8 this$1;
                        final Session val$session;

                        public void onCompleted(GraphUser graphuser, Response response)
                        {
                            if (graphuser != null)
                            {
                                if (session.getState() != SessionState.CLOSED_LOGIN_FAILED)
                                {
                                    loginFacebookUser(graphuser, session);
                                }
                                return;
                            } else
                            {
                                Toast.makeText(_fld0, getString(com.weather.commons.R.string.facebook_login_failure_message), 1).show();
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls8;
                session = Session.this;
                super();
            }
                    }).executeAsync();
                    return;
                } else
                {
                    Log.e("LoginActivity", "fb session is closed");
                    return;
                }
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        });
    }

    private void launchPasswordRetrievalPage()
    {
        startActivity(new Intent(this, com/weather/commons/ups/ui/PasswordRetrievalActivity));
    }

    private void login(UserDetails userdetails, DsxAccount dsxaccount)
    {
        (new LoginAccountTask(userdetails, dsxaccount)).execute(new Void[0]);
    }

    private void loginAmazonUser(UserDetails userdetails, String s)
    {
        login(userdetails, new DsxAccount(userdetails.getUserId(), s, com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_AMAZON));
    }

    private void loginFacebookUser(GraphUser graphuser, Session session)
    {
        String s;
        if (graphuser.getProperty("email") != null)
        {
            s = graphuser.getProperty("email").toString();
        } else
        {
            s = "";
        }
        login(new UserDetails(graphuser.getId(), graphuser.getFirstName(), graphuser.getLastName(), s), new DsxAccount(graphuser.getId(), session.getAccessToken(), com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_FACEBOOK));
    }

    private void loginToAmazon()
    {
        if (UIUtil.isAmazon(this))
        {
            AmazonLoginManager amazonloginmanager = AmazonLoginManager.getInstance();
            AmazonLoginManager.initializeAmazonManager(this, this);
            amazonloginmanager.connectAmazon();
        }
    }

    private void loginToFacebook()
    {
        createFacebookSession();
    }

    private void loginTwcAccount(UserDetails userdetails, DsxAccount dsxaccount)
    {
        if (validateLoginCredential())
        {
            login(userdetails, dsxaccount);
        }
    }

    private void loginWithGooglePlus()
    {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this) != 0)
        {
            showDialog(1);
        } else
        if (!googleManager.isConnected())
        {
            if (googleManager.getConnectionResult() == null)
            {
                connectionProgressDialog.show();
                return;
            }
            try
            {
                googleSignInProgress = 1;
                googleManager.startResolutionForResult(this, 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                googleManager.setConnectionResult(null);
            }
            googleManager.connect();
            return;
        }
    }

    private void resolveSignInError(ConnectionResult connectionresult)
    {
        if (connectionresult == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        googleSignInProgress = 2;
        connectionresult.startResolutionForResult(this, 1);
        return;
        connectionresult;
        googleSignInProgress = 1;
        googleManager.connect();
        return;
    }

    private boolean validateLoginCredential()
    {
        if (username.getText().toString().isEmpty())
        {
            username.setError(getString(com.weather.commons.R.string.enter_email_prompt));
            return false;
        }
        if (password.getText().toString().isEmpty())
        {
            password.setError(getString(com.weather.commons.R.string.enter_password_prompt));
            return false;
        } else
        {
            return true;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        int k = -1;
        super.onActivityResult(i, j, intent);
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().onActivityResult(this, i, j, intent);
            if (Session.getActiveSession().isClosed())
            {
                Session.setActiveSession(null);
            }
        }
        if (i == 1 || i == 2)
        {
            if (j == -1)
            {
                k = 1;
            }
            googleSignInProgress = k;
            if (i == 1 && !googleManager.isConnected() && !googleManager.isConnecting())
            {
                Log.e("LoginActivity", "Error occurred on Google+ connect");
                googleManager.setConnectionResult(null);
                googleManager.connect();
            }
        }
    }

    public void onConnected(Bundle bundle)
    {
        connectionProgressDialog.dismiss();
        googleSignInProgress = -1;
        (new AccessTokenFetchTask()).execute(new Void[] {
            (Void)null
        });
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (googleSignInProgress != 2)
        {
            if (googleSignInProgress == 1)
            {
                resolveSignInError(connectionresult);
            }
            googleManager.setConnectionResult(connectionresult);
        }
    }

    public void onConnectionSuspended(int i)
    {
        googleManager.connect();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.weather.commons.R.layout.ups_login_activity);
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayOptions(15);
        }
        passwordRetrievalLink = (TextView)findViewById(com.weather.commons.R.id.tv_forgot_password);
        signUpLink = (TextView)findViewById(com.weather.commons.R.id.sign_up_link);
        username = (EditText)findViewById(com.weather.commons.R.id.et_email_id);
        if (AccountManager.getInstance().getLastNonAnonymousLoginType() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
        {
            String s = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, "");
            if (s != null)
            {
                username.setText(s);
            }
        }
        password = (EditText)findViewById(com.weather.commons.R.id.et_password);
        twcLogin = (Button)findViewById(com.weather.commons.R.id.bt_twc_login);
        googleLogin = findViewById(com.weather.commons.R.id.bt_googleplus_login);
        amazonLogin = findViewById(com.weather.commons.R.id.bt_amazon_login);
        facebookLogin = findViewById(com.weather.commons.R.id.bt_facebook_login);
        incorrectLoginCredential = (TextView)findViewById(com.weather.commons.R.id.tv_password_incorrect);
        googleManager = GooglePlusConnectionManager.getInstance();
        googleManager.initializePlusClient(this, this, this);
        connectionProgressDialog = new ProgressDialog(this);
        connectionProgressDialog.setMessage(getString(com.weather.commons.R.string.logging_in_msg));
        if (UIUtil.isAmazon(this))
        {
            googleLogin.setVisibility(8);
            amazonLogin.setVisibility(0);
        }
        LocalyticsUpsSupport.recordLoginSummary(localyticsHandler);
        try
        {
            DataAccessLayer.BUS.register(appEventReceiver);
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (bundle != null)
        {
            googleSignInProgress = bundle.getInt("google_sign_in_progress", -1);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i != 1)
        {
            googleSignInProgress = -1;
            return super.onCreateDialog(i);
        }
        i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        if (i == 0)
        {
            return null;
        }
        if (GoogleApiAvailability.getInstance().isUserResolvableError(i))
        {
            googleSignInProgress = -1;
            return GoogleApiAvailability.getInstance().getErrorDialog(this, i, 2);
        } else
        {
            return (new android.app.AlertDialog.Builder(this)).setMessage(com.weather.commons.R.string.plus_generic_error).setCancelable(true).create();
        }
    }

    protected void onDestroy()
    {
        if (isFinishing())
        {
            LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.UPS_LOGIN_SUMMARY);
            try
            {
                DataAccessLayer.BUS.unregister(appEventReceiver);
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        googleManager.uninitializePlusClient();
        super.onDestroy();
    }

    public void onLoginError(AuthError autherror)
    {
    }

    public void onLoginSuccess(final UserDetails userDetails, final String accessToken)
    {
        runOnUiThread(new Runnable() {

            final AbstractLoginActivity this$0;
            final String val$accessToken;
            final UserDetails val$userDetails;

            public void run()
            {
                loginAmazonUser(userDetails, accessToken);
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                userDetails = userdetails;
                accessToken = s;
                super();
            }
        });
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
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.WX_PROFILE_LOGIN);
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("google_sign_in_progress", googleSignInProgress);
    }

    protected void onStart()
    {
        super.onStart();
        googleManager.connect();
        passwordRetrievalLink.setOnClickListener(new android.view.View.OnClickListener() {

            final AbstractLoginActivity this$0;

            public void onClick(View view)
            {
                launchPasswordRetrievalPage();
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        });
        signUpLink.setOnClickListener(new android.view.View.OnClickListener() {

            final AbstractLoginActivity this$0;

            public void onClick(View view)
            {
                startSignupActivity();
                finish();
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        });
        twcLogin.setOnClickListener(new ButtonOnClickListener(new Runnable() {

            final AbstractLoginActivity this$0;

            public void run()
            {
                DsxAccount dsxaccount = new DsxAccount(username.getText().toString(), password.getText().toString(), com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL);
                loginTwcAccount(null, dsxaccount);
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        }));
        googleLogin.setOnClickListener(new ButtonOnClickListener(new Runnable() {

            final AbstractLoginActivity this$0;

            public void run()
            {
                loginWithGooglePlus();
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        }));
        facebookLogin.setOnClickListener(new ButtonOnClickListener(new Runnable() {

            final AbstractLoginActivity this$0;

            public void run()
            {
                loginToFacebook();
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        }));
        amazonLogin.setOnClickListener(new ButtonOnClickListener(new Runnable() {

            final AbstractLoginActivity this$0;

            public void run()
            {
                loginToAmazon();
            }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
        }));
    }

    protected void onStop()
    {
        googleManager.disconnect();
        super.onStop();
    }

    protected abstract void startSignupActivity();





/*
    static ProgressDialog access$1002(AbstractLoginActivity abstractloginactivity, ProgressDialog progressdialog)
    {
        abstractloginactivity.progressDialog = progressdialog;
        return progressdialog;
    }

*/











}
