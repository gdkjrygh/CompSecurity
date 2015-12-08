// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import java.io.IOException;

public class GooglePlusConnectionManager
{

    public static final int DIALOG_GET_GOOGLE_PLAY_SERVICES = 1;
    public static final int REQUEST_CODE_GET_SERVICES = 2;
    public static final int REQUEST_CODE_SIGN_IN = 1;
    public static final int REQUEST_CODE_TOKEN_AUTH = 0x186a0;
    private static final GooglePlusConnectionManager googlePlusConnectionManager = new GooglePlusConnectionManager();
    private GoogleApiClient apiClient;
    private ConnectionResult connectionResult;

    private GooglePlusConnectionManager()
    {
    }

    public static GooglePlusConnectionManager getInstance()
    {
        return googlePlusConnectionManager;
    }

    public void connect()
    {
        if (apiClient != null)
        {
            apiClient.connect();
        }
    }

    public void disconnect()
    {
        if (apiClient != null && apiClient.isConnected())
        {
            apiClient.disconnect();
        }
    }

    public void disconnectAndRevoke()
    {
        if (apiClient != null && apiClient.isConnected())
        {
            Plus.AccountApi.revokeAccessAndDisconnect(apiClient);
        }
    }

    public String getAccountName()
    {
        if (apiClient == null)
        {
            return null;
        } else
        {
            return Plus.AccountApi.getAccountName(apiClient);
        }
    }

    public ConnectionResult getConnectionResult()
    {
        return connectionResult;
    }

    public String getCurrentImagePath(int i)
    {
        Object obj = getCurrentPerson();
        if (obj != null)
        {
            if ((obj = ((Person) (obj)).getImage()) != null && (obj = ((com.google.android.gms.plus.model.people.Person.Image) (obj)).getUrl()) != null)
            {
                Uri uri = Uri.parse(((String) (obj)));
                String s = uri.getQueryParameter("sz");
                if (s == null)
                {
                    return uri.buildUpon().appendQueryParameter("sz", String.valueOf(i)).build().toString();
                } else
                {
                    return ((String) (obj)).replace((new StringBuilder()).append("sz=").append(s).toString(), (new StringBuilder()).append("sz=").append(i).toString());
                }
            }
        }
        return null;
    }

    public Person getCurrentPerson()
    {
        if (apiClient == null)
        {
            return null;
        } else
        {
            return Plus.PeopleApi.getCurrentPerson(apiClient);
        }
    }

    public void initializePlusClient(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        apiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(Plus.API).addConnectionCallbacks(connectioncallbacks).addOnConnectionFailedListener(onconnectionfailedlistener).addScope(Plus.SCOPE_PLUS_LOGIN).build();
    }

    public void invalidateAccount()
    {
        disconnectAndRevoke();
    }

    public boolean isConnected()
    {
        return apiClient != null && apiClient.isConnected();
    }

    public boolean isConnecting()
    {
        return apiClient != null && apiClient.isConnecting();
    }

    public String retrieveToken(Context context, String s, String s1)
        throws IOException, GoogleAuthException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return GoogleAuthUtil.getToken(context, s, s1);
        }
    }

    public void retryConnectionIfNotConnectedOrConnecting()
    {
        if (!isConnected() && !isConnecting())
        {
            setConnectionResult(null);
            connect();
        }
    }

    public void setConnectionResult(ConnectionResult connectionresult)
    {
        connectionResult = connectionresult;
    }

    public void startResolutionForResult(Activity activity, int i)
        throws android.content.IntentSender.SendIntentException
    {
        if (connectionResult != null)
        {
            connectionResult.startResolutionForResult(activity, i);
        }
    }

    public boolean startResolutionForResultIfNotConnectedAndResultIsAvailable(Activity activity)
    {
        if (!isConnected())
        {
            if (getConnectionResult() == null)
            {
                return true;
            }
            try
            {
                startResolutionForResult(activity, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                setConnectionResult(null);
                connect();
            }
        }
        return false;
    }

    public void uninitializePlusClient()
    {
        disconnect();
    }

}
