// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient

class KatanaProxyLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel)
        {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public KatanaProxyLoginMethodHandler[] newArray(int i)
        {
            return new KatanaProxyLoginMethodHandler[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };

    KatanaProxyLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    private String getError(Bundle bundle)
    {
        String s1 = bundle.getString("error");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_type");
        }
        return s;
    }

    private String getErrorMessage(Bundle bundle)
    {
        String s1 = bundle.getString("error_message");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_description");
        }
        return s;
    }

    private LoginClient.Result handleResultCancel(LoginClient.Request request, Intent intent)
    {
        intent = intent.getExtras();
        String s = getError(intent);
        String s1 = intent.getString("error_code");
        if ("CONNECTION_FAILURE".equals(s1))
        {
            return LoginClient.Result.createErrorResult(request, s, getErrorMessage(intent), s1);
        } else
        {
            return LoginClient.Result.createCancelResult(request, s);
        }
    }

    private LoginClient.Result handleResultOk(LoginClient.Request request, Intent intent)
    {
        Object obj = null;
        intent = intent.getExtras();
        String s = getError(intent);
        String s1 = intent.getString("error_code");
        String s2 = getErrorMessage(intent);
        String s3 = intent.getString("e2e");
        if (!Utility.isNullOrEmpty(s3))
        {
            logWebLoginCompleted(s3);
        }
        if (s == null && s1 == null && s2 == null)
        {
            try
            {
                intent = LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(request.getPermissions(), intent, AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.getApplicationId()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return LoginClient.Result.createErrorResult(request, null, intent.getMessage());
            }
        } else
        {
            intent = obj;
            if (!ServerProtocol.errorsProxyAuthDisabled.contains(s))
            {
                if (ServerProtocol.errorsUserCanceled.contains(s))
                {
                    return LoginClient.Result.createCancelResult(request, null);
                } else
                {
                    return LoginClient.Result.createErrorResult(request, s, s2, s1);
                }
            }
        }
        return intent;
    }

    public int describeContents()
    {
        return 0;
    }

    String getNameForLogging()
    {
        return "katana_proxy_auth";
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        LoginClient.Request request = loginClient.getPendingRequest();
        if (intent == null)
        {
            intent = LoginClient.Result.createCancelResult(request, "Operation canceled");
        } else
        if (j == 0)
        {
            intent = handleResultCancel(request, intent);
        } else
        if (j != -1)
        {
            intent = LoginClient.Result.createErrorResult(request, "Unexpected resultCode from authorization.", null);
        } else
        {
            intent = handleResultOk(request, intent);
        }
        if (intent != null)
        {
            loginClient.completeAndValidate(intent);
        } else
        {
            loginClient.tryNextHandler();
        }
        return true;
    }

    boolean tryAuthorize(LoginClient.Request request)
    {
        String s = LoginClient.getE2E();
        request = NativeProtocol.createProxyAuthIntent(loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), s, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience());
        addLoggingExtra("e2e", s);
        return tryIntent(request, LoginClient.getLoginRequestCode());
    }

    protected boolean tryIntent(Intent intent, int i)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            loginClient.getFragment().startActivityForResult(intent, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
    }

}
