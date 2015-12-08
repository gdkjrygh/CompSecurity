// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.user.UserPreferences;
import java.util.Locale;

public class WishApiConfig
{

    private String apiBaseUrlString;
    private String apiCountryCode;

    public WishApiConfig()
    {
        apiBaseUrlString = UserPreferences.getApiRootPath();
        apiCountryCode = UserPreferences.getApiCountryCode();
        if (apiBaseUrlString == null || apiBaseUrlString.contains("wishwall.me"))
        {
            apiBaseUrlString = "www.wish.com";
        }
        if (WishApplication.getAppInstance().isGooglePlusBuild())
        {
            apiBaseUrlString = "sandbox.wish.com";
        }
        if (WishApplication.getAppInstance().isTestingBuild())
        {
            apiBaseUrlString = "testing.wish.com";
        }
        if (!WishApplication.getAppInstance().isDeveloperBuild() || !apiBaseUrlString.equals("testing.wish.com")) goto _L2; else goto _L1
_L1:
        WishHttpClient.getInstance().setTestingCredentials();
_L4:
        clearSessionCookies();
        return;
_L2:
        if (apiBaseUrlString.equals("sandbox.wish.com"))
        {
            WishHttpClient.getInstance().setSandboxCredentials();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addSessionCookie(String s)
    {
        WishHttpClient.getInstance().addSessionCookie(s, getApiBaseUrlString());
    }

    public void clearSessionCookies()
    {
        WishHttpClient.getInstance().clearCookies();
        WishHttpClient.getInstance().setXsrfCookie(apiBaseUrlString);
        WishHttpClient.getInstance().setLocaleCookie(Locale.getDefault().toString(), apiBaseUrlString);
    }

    public String getApiBaseUrlString()
    {
        return apiBaseUrlString;
    }

    public String getApiCountryCode()
    {
        return apiCountryCode;
    }

    public Cookie getBsidCookie()
    {
        return WishHttpClient.getInstance().getBsidCookie();
    }

    public Cookie getSessionCookie()
    {
        return WishHttpClient.getInstance().getSessionCookie();
    }

    public boolean hasSessionCookie()
    {
        return getSessionCookie() != null;
    }

    public void resetWebViewCookies()
    {
        CookieSyncManager cookiesyncmanager = null;
        Object obj = CookieSyncManager.getInstance();
        cookiesyncmanager = ((CookieSyncManager) (obj));
_L2:
        obj = CookieManager.getInstance();
        if (obj != null && cookiesyncmanager != null)
        {
            ((CookieManager) (obj)).removeAllCookie();
            cookiesyncmanager.sync();
        }
        return;
        Object obj1;
        obj1;
        CookieSyncManager.createInstance(WishApplication.getAppInstance());
        obj1 = CookieSyncManager.getInstance();
        cookiesyncmanager = ((CookieSyncManager) (obj1));
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setApiBaseUrlString(String s)
    {
        apiBaseUrlString = s;
        UserPreferences.setApiRootPath(s);
        clearSessionCookies();
        if (WishApplication.getAppInstance().isDeveloperBuild() && s.equals("testing.wish.com"))
        {
            WishHttpClient.getInstance().setTestingCredentials();
        } else
        if (apiBaseUrlString.equals("sandbox.wish.com"))
        {
            WishHttpClient.getInstance().setSandboxCredentials();
            return;
        }
    }

    public void setApiCountryCode(String s)
    {
        apiCountryCode = s;
        UserPreferences.setApiCountryCode(s);
    }
}
