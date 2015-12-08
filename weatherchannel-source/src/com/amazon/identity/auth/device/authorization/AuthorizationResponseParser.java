// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.utils.MAPLog;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazon.identity.auth.device.authorization:
//            MAPAuthzDialog, ScopesHelper, CallbackInfo

class AuthorizationResponseParser
{

    private static final String ACCESS_NOT_PERMITTED = "Access not permitted.";
    private static final String ACCESS_NOT_PERMITTED_ALT = "Access+not+permitted.";
    public static final String CLIENT_ID_STATE = "clientId";
    public static final String CLIENT_REQUEST_ID_STATE = "clientRequestId";
    public static final String CODE = "code";
    private static final String ERROR = "error";
    private static final String ERROR_DESCRIPTION = "error_description";
    private static final String LOG_TAG = com/amazon/identity/auth/device/authorization/MAPAuthzDialog.getName();
    public static final String REDIRECT_URI_STATE = "redirectUri";
    public static final String SCOPE = "scope";
    public static final String STATE = "state";

    AuthorizationResponseParser()
    {
    }

    private Bundle constructErrorBundle(Bundle bundle, String s, String s1)
        throws AuthError
    {
        if ("access_denied".equals(s) && !TextUtils.isEmpty(s1) && ("Access not permitted.".equals(s1) || "Access+not+permitted.".equals(s1)))
        {
            bundle.putInt(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.CAUSE_ID.val, 0);
            bundle.putString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.ON_CANCEL_TYPE.val, s);
            bundle.putString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.ON_CANCEL_DESCRIPTION.val, s1);
            return bundle;
        } else
        {
            throw new AuthError((new StringBuilder()).append("Error=").append(s).append("error_description=").append(s1).toString(), com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
    }

    private Bundle constructSuccessBundle(Bundle bundle, Map map, String s, String as[])
    {
        bundle.putString("clientId", (String)map.get("clientId"));
        bundle.putString("redirectUri", (String)map.get("redirectUri"));
        if (s != null)
        {
            bundle.putStringArray("scope", ScopesHelper.getScopesFromString(s));
            return bundle;
        } else
        {
            MAPLog.d(LOG_TAG, "No scopes from OAuth2 response, using requested scopes");
            bundle.putStringArray("scope", as);
            return bundle;
        }
    }

    static CallbackInfo getCallbackInfo(String s)
    {
        return CallbackInfo.getCallbackInfo((String)getStateValuesFromUri(Uri.parse(s)).get("clientRequestId"));
    }

    public static Map getStateValuesFromUri(Uri uri)
    {
        HashMap hashmap = new HashMap();
        uri = uri.getQueryParameter("state");
        if (uri != null)
        {
            uri = TextUtils.split(uri, "&");
            if (uri != null)
            {
                int j = uri.length;
                for (int i = 0; i < j; i++)
                {
                    String as[] = TextUtils.split(uri[i], "=");
                    if (as != null && as.length == 2)
                    {
                        hashmap.put(as[0], as[1]);
                    }
                }

            }
        }
        return hashmap;
    }

    Bundle extractResultsBundle(String s, String s1, String as[])
        throws AuthError
    {
        Bundle bundle = new Bundle();
        s = Uri.parse(s);
        MAPLog.pii(LOG_TAG, "Received response from WebBroswer for OAuth2 flow", (new StringBuilder()).append("response=").append(s.toString()).toString());
        String s2 = s.getQueryParameter("code");
        bundle.putString("code", s2);
        MAPLog.pii(LOG_TAG, "Code extracted from response", (new StringBuilder()).append("code=").append(s2).toString());
        Map map = getStateValuesFromUri(s);
        String s3 = (String)map.get("clientRequestId");
        if (TextUtils.isEmpty(s3))
        {
            throw new AuthError("No clientRequestId in OAuth2 response", com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
        if (!s3.equalsIgnoreCase(s1))
        {
            throw new AuthError((new StringBuilder()).append("ClientRequestIds do not match. req=").append(s3).append(" resp=").append(s1).toString(), com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        }
        s1 = s.getQueryParameter("error");
        if (!TextUtils.isEmpty(s1))
        {
            return constructErrorBundle(bundle, s1, s.getQueryParameter("error_description"));
        }
        if (TextUtils.isEmpty(s2))
        {
            throw new AuthError("No code in OAuth2 response", com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_SERVER_REPSONSE);
        } else
        {
            return constructSuccessBundle(bundle, map, s.getQueryParameter("scope"), as);
        }
    }

}
