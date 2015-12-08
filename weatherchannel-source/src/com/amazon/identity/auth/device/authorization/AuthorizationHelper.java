// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.appid.AppIdentifier;
import com.amazon.identity.auth.device.appid.ThirdPartyAppIdentifier;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.dataobject.RequestedScope;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.amazon.identity.auth.device.datastore.ProfileDataSource;
import com.amazon.identity.auth.device.endpoint.TokenVendor;
import com.amazon.identity.auth.device.thread.ThreadUtils;
import com.amazon.identity.auth.device.utils.MAPLog;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

// Referenced classes of package com.amazon.identity.auth.device.authorization:
//            CallbackInfo, ScopesHelper, ThirdPartyServiceHelper, AmazonAuthorizationServiceInterface

public class AuthorizationHelper
{

    private static final String HOST_TYPE = "host.type";
    private static final String HTTPS = "https";
    private static final String LOG_TAG = com/amazon/identity/auth/device/authorization/AuthorizationHelper.getName();
    private TokenVendor mTokenVendor;

    public AuthorizationHelper()
    {
        mTokenVendor = new TokenVendor();
    }

    private void authorizeWithBrowser(Context context, String s, String s1, String as[], UUID uuid, AuthorizationListener authorizationlistener)
        throws AuthError
    {
        CallbackInfo.addCallbackInfo(new CallbackInfo(Calendar.getInstance().getTime(), uuid.toString(), s1, as, authorizationlistener));
        s = new Intent("android.intent.action.VIEW", Uri.parse(getOAuth2Url(context, s, s1, as, uuid.toString(), true)));
        s.setFlags(0x40000000);
        MAPLog.i(LOG_TAG, "Starting External Browser");
        context.startActivity(s);
    }

    private List getCommonScopesForAuthorization(Context context, String as[], List list, String s)
    {
        as = Arrays.asList(as);
        context = new ArrayList();
        context.addAll(as);
        if (list != null)
        {
            as = list.iterator();
            do
            {
                if (!as.hasNext())
                {
                    break;
                }
                list = ((RequestedScope)as.next()).getScopeValue();
                if (!context.contains(list))
                {
                    context.add(list);
                }
            } while (true);
        }
        return context;
    }

    private static String getEndPoint()
    {
        return "/ap/oa";
    }

    private static String getHost(Context context, String s)
    {
        return (new StringBuilder()).append(getHostType(context, s)).append(".amazon.com").toString();
    }

    private static String getHostType(Context context, String s)
    {
        String s1 = "www";
        Object obj = s1;
        ApplicationInfo applicationinfo;
        try
        {
            applicationinfo = context.getPackageManager().getApplicationInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MAPLog.d(LOG_TAG, (new StringBuilder()).append("No host type found in package ").append(s).toString());
            return ((String) (obj));
        }
        context = s1;
        obj = s1;
        if (applicationinfo.metaData == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        context = s1;
        obj = s1;
        if (!applicationinfo.metaData.containsKey("host.type"))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = s1;
        context = applicationinfo.metaData.getString("host.type");
        obj = context;
        MAPLog.pii(LOG_TAG, "Host Type", (new StringBuilder()).append("hostType=").append(context).append(" package=").append(s).toString());
        return context;
    }

    public static String getOAuth2Url(Context context, String s, String s1, String as[], String s2, boolean flag)
        throws AuthError
    {
        String s3 = getHost(context, s);
        context = (new StringBuilder()).append(getEndPoint()).append(getQueryString(context, s, s1, as, s2, flag)).toString();
        try
        {
            context = new URL("https", s3, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthError("MalformedURLException", context, com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
        }
        MAPLog.pii(LOG_TAG, "Generating OAUTH2 URL", (new StringBuilder()).append("url=").append(context.toString()).toString());
        return context.toString();
    }

    private static String getQueryString(Context context, String s, String s1, String as[], String s2, boolean flag)
    {
        context = new StringBuffer("?");
        s = getRedirectUri(s);
        context.append(getUrlEncodedQuery("response_type", "code"));
        context.append("&");
        context.append(getUrlEncodedQuery("redirect_uri", s));
        context.append("&");
        context.append(getUrlEncodedQuery("client_id", s1));
        context.append("&");
        if (flag)
        {
            context.append(getUrlEncodedQuery("amzn_respectRmrMeAuthState", "1"));
            context.append("&");
            context.append(getUrlEncodedQuery("amzn_showRmrMe", "1"));
            context.append("&");
            context.append(getUrlEncodedQuery("amzn_rmrMeDefaultSelected", "1"));
            context.append("&");
        }
        context.append(getUrlEncodedQuery("state", (new StringBuilder()).append("clientId=").append(s1).append("&").append("redirectUri").append("=").append(s).append("&").append("clientRequestId").append("=").append(s2.toString()).toString()));
        context.append("&");
        context.append(getUrlEncodedQuery("scope", ScopesHelper.getScopesString(as)));
        return context.toString();
    }

    private static String getRedirectUri(String s)
    {
        s = (new StringBuilder()).append("amzn://").append(s).toString();
        MAPLog.pii(LOG_TAG, "Generating Redirect URI", (new StringBuilder()).append("rediectUri=").append(s).toString());
        return s;
    }

    private Bundle getResultsFromAuthorizationService(Context context, String s, String s1, String as[], AuthorizationListener authorizationlistener)
        throws AuthError
    {
        s1 = new Bundle();
        s = s1;
        authorizationlistener = ThirdPartyServiceHelper.getRemoteAndroidService(context);
        s = s1;
        if (authorizationlistener == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        s = s1;
        s1 = authorizationlistener.authorize(null, context.getPackageName(), as);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s = s1;
        s1 = new Bundle();
        ThirdPartyServiceHelper.unbind(context);
        return s1;
        s = s1;
        s1.setClassLoader(context.getClassLoader());
        s = s1;
        ThirdPartyServiceHelper.unbind(context);
_L2:
        return s;
        s1;
        ThirdPartyServiceHelper.clearCachedService(context);
        MAPLog.i(LOG_TAG, (new StringBuilder()).append("RemoteException on authorize. ").append(s1.getMessage()).toString());
        ThirdPartyServiceHelper.unbind(context);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        ThirdPartyServiceHelper.unbind(context);
        throw s;
    }

    private static String getUrlEncodedQuery(String s, String s1)
    {
        s = new StringBuilder(s);
        s.append("=");
        s.append(URLEncoder.encode(s1));
        return s.toString();
    }

    private void startExchange(Context context, String s, String s1, String s2, String as[], AuthorizationListener authorizationlistener)
    {
        if (ThreadUtils.isRunningOnMainThread())
        {
            MAPLog.e(LOG_TAG, "code for token exchange started on main thread");
            throw new IllegalStateException("authorize started on main thread");
        }
        MAPLog.i(LOG_TAG, "Inside getToken AsyncTask - Attempting endpoint");
        String s3 = (new ThirdPartyAppIdentifier()).getAppInfo(context.getPackageName(), context).getAppFamilyId();
        try
        {
            authorizationlistener.onSuccess(mTokenVendor.vendNewTokensFromCode(s2, s, s3, s1, as, context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            authorizationlistener.onError(new AuthError("Failed to exchange code for token", context, com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_IO));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MAPLog.e(LOG_TAG, (new StringBuilder()).append("Failed doing code for token exchange ").append(context.getMessage()).toString());
        }
        authorizationlistener.onError(context);
    }

    public void authorize(Context context, String s, String s1, String as[], boolean flag, AuthorizationListener authorizationlistener)
        throws AuthError
    {
        if (ThreadUtils.isRunningOnMainThread())
        {
            MAPLog.e(LOG_TAG, "authorize started on main thread");
            throw new IllegalStateException("authorize started on main thread");
        }
        String s2 = (new ThirdPartyAppIdentifier()).getAppInfo(s, context).getAppFamilyId();
        List list = mTokenVendor.getCachedScopes(null, s2, context);
        s = getCommonScopesForAuthorization(context, as, list, s2);
        as = (String[])s.toArray(new String[s.size()]);
        s = Bundle.EMPTY;
        if (list == null || list.size() == 0)
        {
            s = getResultsFromAuthorizationService(context, s2, s1, as, authorizationlistener);
        }
        if (!s.containsKey("AUTH_ERROR_EXECEPTION") && !s.containsKey(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.AUTHORIZE.val) && !s.containsKey(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.CAUSE_ID.val))
        {
            ProfileDataSource.getInstance(context).deleteAllRows();
            s = new Handler(Looper.getMainLooper());
            UUID uuid = UUID.randomUUID();
            MAPLog.pii(LOG_TAG, "Created UUID for request", (new StringBuilder()).append("uuid=").append(uuid).toString());
            s.post(new _cls1(flag, context, s1, as, uuid, authorizationlistener));
            return;
        }
        s.setClassLoader(context.getClassLoader());
        if (s.containsKey(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.CAUSE_ID.val))
        {
            authorizationlistener.onCancel(s);
            return;
        }
        if (s.containsKey("AUTH_ERROR_EXECEPTION"))
        {
            authorizationlistener.onError(AuthError.extractError(s));
            return;
        } else
        {
            DatabaseHelper.clearAuthorizationState(context);
            context = new Bundle();
            context.putString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.AUTHORIZE.val, "authorized via service");
            authorizationlistener.onSuccess(context);
            return;
        }
    }

    void doExchange(Context context, Bundle bundle, AuthorizationListener authorizationlistener)
    {
        ThreadUtils.THREAD_POOL.execute(new _cls2(bundle, context, authorizationlistener));
    }





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
