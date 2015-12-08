// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.plus.model.people.Person;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;
import java.io.IOException;

// Referenced classes of package com.weather.commons.ups.ui:
//            SocialSignUpFragment

class GoogleSignUp
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    private class AccessTokenFetchTask extends AsyncTask
    {

        final GoogleSignUp this$0;

        private void completeProfileForGP(Person person, String s, String s1)
        {
            s = new DsxAccount(person.getId(), s, com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS);
            person = new UserDetails(person.getId(), person.getDisplayName(), null, s1);
            SocialSignUpFragment.newInstance(activity.getFragmentManager(), s, person);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            try
            {
                avoid = googleManager.retrieveToken(activity, googleManager.getAccountName(), "oauth2:https://www.googleapis.com/auth/plus.login");
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("GoogleSignUp", avoid.toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("GoogleSignUp", avoid.toString());
                avoid = avoid.getIntent();
                activity.startActivityForResult(avoid, 0x186a0);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("GoogleSignUp", avoid.toString());
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
            super.onPostExecute(s);
            Person person = googleManager.getCurrentPerson();
            String s1 = googleManager.getAccountName();
            if (person != null && s1 != null && s != null)
            {
                completeProfileForGP(person, s, s1);
            }
        }

        private AccessTokenFetchTask()
        {
            this$0 = GoogleSignUp.this;
            super();
        }

    }


    private static final int GOOGLE_DEFAULT_STATE = -1;
    private static final int GOOGLE_STATE_IN_PROGRESS = 2;
    private static final int GOOGLE_STATE_SIGN_IN = 1;
    private static final String TAG = "GoogleSignUp";
    private final Activity activity;
    private final ProgressDialog connectionProgressDialog;
    private final GooglePlusConnectionManager googleManager = GooglePlusConnectionManager.getInstance();
    private int googleSignInProgress;

    GoogleSignUp(Activity activity1, ProgressDialog progressdialog)
    {
        connectionProgressDialog = (ProgressDialog)Preconditions.checkNotNull(progressdialog);
        activity = (Activity)Preconditions.checkNotNull(activity1);
        googleSignInProgress = -1;
    }

    private void resolveSignInError(ConnectionResult connectionresult)
    {
        if (connectionresult == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        googleSignInProgress = 2;
        connectionresult.startResolutionForResult(activity, 1);
        return;
        connectionresult;
        googleSignInProgress = 1;
        googleManager.connect();
        return;
    }

    void handleActivityResult(int i, int j)
    {
        boolean flag = true;
        if (i == 1)
        {
            if (j == -1)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = -1;
            }
            googleSignInProgress = i;
            googleManager.retryConnectionIfNotConnectedOrConnecting();
        }
    }

    public void initialize()
    {
        googleManager.initializePlusClient(activity, this, this);
    }

    public void invalidateAccount()
    {
        Log.e("APK-1491", "GoogleSignUp:invalidateAccount");
        googleManager.invalidateAccount();
    }

    void onActivityStart()
    {
        googleManager.connect();
    }

    void onActivityStop()
    {
        if (googleManager.isConnected())
        {
            googleManager.disconnect();
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

    public void signUp()
    {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity) != 0)
        {
            googleSignInProgress = -1;
            activity.showDialog(1);
        } else
        {
            googleSignInProgress = 1;
            if (googleManager.startResolutionForResultIfNotConnectedAndResultIsAvailable(activity))
            {
                connectionProgressDialog.show();
                return;
            }
        }
    }

    public void uninitialize()
    {
        googleManager.uninitializePlusClient();
    }


}
