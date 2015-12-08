// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import java.util.Locale;

public class WebViewSetupTask extends AsyncTask
{
    public static interface PostExecuteCallback
    {

        public abstract void onPostExecuteComplete();
    }


    private PostExecuteCallback mCallback;
    private Context mContext;

    public WebViewSetupTask(Context context, PostExecuteCallback postexecutecallback)
    {
        mContext = context;
        mCallback = postexecutecallback;
    }

    protected transient Boolean doInBackground(Void avoid[])
    {
        SystemClock.sleep(500L);
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        boolean1 = CookieManager.getInstance();
        Object obj = WishApi.getInstance().getConfig().getSessionCookie();
        if (obj != null)
        {
            obj = (new StringBuilder()).append("sweeper_session=").append(((Cookie) (obj)).getValue()).append("; domain=").append(((Cookie) (obj)).getDomain()).append("; path=").append(((Cookie) (obj)).getPath()).toString();
            boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        }
        obj = WishApi.getInstance().getConfig().getBsidCookie();
        if (obj != null)
        {
            obj = (new StringBuilder()).append("bsid=").append(((Cookie) (obj)).getValue()).append("; domain=").append(((Cookie) (obj)).getDomain()).append("; path=").append(((Cookie) (obj)).getPath()).toString();
            boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        }
        obj = (new StringBuilder()).append("_appLocale=").append(Locale.getDefault().toString()).append("; domain=").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("; path=/").toString();
        boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        obj = (new StringBuilder()).append("_mobileApp=").append(WishApplication.getAppInstance().getClient()).append("; domain=").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("; path=/").toString();
        boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        obj = (new StringBuilder()).append("_app_type=").append(WishApplication.getAppInstance().getAppType()).append("; domain=").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("; path=/").toString();
        boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        obj = WishApplication.getAppInstance().getVersionNumber();
        if (obj != null)
        {
            obj = (new StringBuilder()).append("_version=").append(((String) (obj))).append("; domain=").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("; path=/").toString();
            boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        }
        obj = (new StringBuilder()).append("_supportImageUpload=true; domain=").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("; path=/").toString();
        boolean1.setCookie(WishApi.getInstance().getConfig().getApiBaseUrlString(), ((String) (obj)));
        try
        {
            CookieSyncManager.getInstance().sync();
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            try
            {
                CookieSyncManager.createInstance(mContext);
                CookieSyncManager.getInstance().sync();
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
        }
        mCallback.onPostExecuteComplete();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
        CookieManager cookiemanager = CookieManager.getInstance();
        cookiemanager.removeSessionCookie();
        cookiemanager.setAcceptCookie(true);
        try
        {
            CookieSyncManager.createInstance(mContext);
        }
        catch (IllegalStateException illegalstateexception) { }
        super.onPreExecute();
    }
}
