// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.NotificationManager;
import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.Session;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonParseException;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.commons.ups.backend.location.LocationStartSyncService;
import com.weather.commons.ups.backend.location.UpsLocationManager;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.commons.ups.facade.EndPoint;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.DalPrefs;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.ExceptionUtil;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.ups.backend:
//            AbnormalHttpResponseException, UpsConstants, PreConditionNotMetException, UpsCommonUtil, 
//            HttpResponseConflictException

public class AccountManager
{

    private static final AccountManager INSTANCE = new AccountManager();
    private static final int MINIMUM_COOKIE_DAYS = 5;
    private static final long MINIMUM_COOKIE_MS;
    private static final int NOTIFICATION_ID = 1;
    private static final long RENEW_TIME_BEFORE_EXPIRATION_MS;
    private static final int RENEW_TIME_HOURS = 12;
    private static final String TAG = "AccountManager";
    private static final String USER_ID = "userId";
    private com.weather.commons.ups.facade.DsxAccount.AccountProvider currentLoginType;
    private String dsxCookie;

    private AccountManager()
    {
    }

    private void cancelNotification(Context context)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(1);
    }

    private void checkAccountLoginStatus()
        throws AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        Object obj;
        HttpRequest httprequest;
        obj = getDsxCookie();
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.get(UpsConstants.ACCOUNT_LOGIN_URL).header("Cookie", ((String) (obj))).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L4:
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        httprequest = ((HttpRequest) (obj));
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        Log.i("AccountManager", (new StringBuilder()).append("User already signed in: ").append(((HttpRequest) (obj)).code()).toString());
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj = HttpRequest.get(UpsConstants.ACCOUNT_LOGIN_URL).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        if (true) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException("User not logged in.");
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    private void deactivateAlerts()
    {
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_RAIN, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.THUNDERSTORM, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_HEAT, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HIGH_WIND, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.DENSE_FOG, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_COLD, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_SNOWFALL, false);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.ICE, false);
    }

    public static AccountManager getInstance()
    {
        return INSTANCE;
    }

    private void parseAndSaveUserId(String s)
    {
        String s1 = "";
        try
        {
            s = (new JSONObject(s)).getString("userId");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e("AccountManager", LoggingMetaTags.TWC_UPS, (new StringBuilder()).append("Unable to parse p/sso response: %s ").append(s.getMessage()).toString(), new Object[0]);
            s = s1;
        }
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_USER_ID, s);
    }

    private void publishDemographics()
    {
        try
        {
            Demographics demographics = getDemographics();
            BasicDemographicsStorage.getInstance().write(demographics);
            return;
        }
        catch (Exception exception)
        {
            LogUtil.d("AccountManager", LoggingMetaTags.TWC_DAL, "failed to get demographics", new Object[] {
                exception
            });
        }
    }

    private void setLoginType(com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider)
    {
        this;
        JVM INSTR monitorenter ;
        Prefs prefs;
        com.weather.util.prefs.TwcPrefs.Keys keys;
        currentLoginType = accountprovider;
        prefs = TwcPrefs.getInstance();
        keys = com.weather.util.prefs.TwcPrefs.Keys.LOGGED_IN_ACCOUNT_TYPE;
        if (accountprovider != null) goto _L2; else goto _L1
_L1:
        String s = null;
_L4:
        prefs.putString(keys, s);
        if (accountprovider == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (accountprovider != com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_ANONYMOUS)
        {
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE, accountprovider.convert());
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = accountprovider.convert();
        if (true) goto _L4; else goto _L3
_L3:
        accountprovider;
        throw accountprovider;
    }

    private void unlinkAccount(DsxAccount dsxaccount)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[];

            static 
            {
                $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider = new int[com.weather.commons.ups.facade.DsxAccount.AccountProvider.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_FACEBOOK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_AMAZON.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_ANONYMOUS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.weather.commons.ups.facade.DsxAccount.AccountProvider[dsxaccount.getProvider().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 78
    //                   2 215
    //                   3 242
    //                   4 269
    //                   5 296;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new RuntimeException((new StringBuilder()).append("unexpected provider value ").append(dsxaccount.getProvider().convert()).toString());
_L2:
        dsxaccount = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_FB).append(dsxaccount.getId()).toString();
_L12:
        DsxAccount dsxaccount1;
        String s;
        s = getDsxCookie();
        dsxaccount1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (s == null) goto _L8; else goto _L7
_L7:
        dsxaccount = HttpRequest.delete(dsxaccount).contentType(UpsConstants.TEXT_PLAIN).readTimeout(15000).connectTimeout(15000).header("Cookie", s).trustAllHosts();
_L10:
        dsxaccount1 = dsxaccount;
        if (!dsxaccount.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        dsxaccount1 = dsxaccount;
        setDsxCookie(dsxaccount.header("Set-Cookie"));
        dsxaccount1 = dsxaccount;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully unLinked account: ").append(dsxaccount.code()).toString());
        if (dsxaccount != null)
        {
            dsxaccount.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L3:
        dsxaccount = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_AWS).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        dsxaccount = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_GP).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L5:
        dsxaccount = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_WX).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L6:
        dsxaccount = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_ANON).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L8:
        dsxaccount = HttpRequest.delete(dsxaccount).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000);
        if (true) goto _L10; else goto _L9
_L9:
        dsxaccount1 = dsxaccount;
        s = dsxaccount.body();
        dsxaccount1 = dsxaccount;
        Log.e("AccountManager", (new StringBuilder()).append("failed to unlink ").append(s).toString());
        dsxaccount1 = dsxaccount;
        if (dsxaccount.code() != 401)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        dsxaccount1 = dsxaccount;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        dsxaccount1 = dsxaccount;
        clearDsxCookie();
        dsxaccount1 = dsxaccount;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Account un-linking Response code: ").append(dsxaccount.code()).toString());
        dsxaccount;
        if (dsxaccount1 != null)
        {
            dsxaccount1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxaccount;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void changeWxAccountPassword(String s)
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, PreConditionNotMetException
    {
        String s1;
        String s2;
        String s3;
        s1 = getWxAccountId();
        if (s1 == null)
        {
            throw new PreConditionNotMetException("Changing password applies only to WX account.");
        }
        s2 = (new StringBuilder()).append(UpsConstants.CHANGE_WX_PASSWORD_URL).append(s1).toString();
        s3 = getDsxCookie();
        s1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (s3 == null) goto _L2; else goto _L1
_L1:
        s = HttpRequest.put(s2).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", s3).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(s);
_L4:
        s1 = s;
        if (!s.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        setDsxCookie(s.header("Set-Cookie"));
        s1 = s;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully changed password: ").append(s.code()).toString());
        if (s != null)
        {
            s.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        s = HttpRequest.put(s2).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(s);
        if (true) goto _L4; else goto _L3
_L3:
        s1 = s;
        if (s.code() != 401)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        s1 = s;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        s1 = s;
        clearDsxCookie();
        s1 = s;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to change password: ").append(s.code()).toString());
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public void clearDsxCookie()
    {
        this;
        JVM INSTR monitorenter ;
        setDsxCookie(null);
        setLoginType(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void createAccount(DsxAccount dsxaccount)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        Object obj;
        HttpRequest httprequest;
        createSession();
        obj = getDsxCookie();
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.post(UpsConstants.ACCOUNT_CREATION_URL).trustAllHosts().contentType("application/json").header("Cookie", ((String) (obj))).readTimeout(15000).connectTimeout(15000).send(dsxaccount.toJsonString());
_L5:
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok()) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        setLoginType(dsxaccount.getProvider());
        httprequest = ((HttpRequest) (obj));
        DalPrefs.getInstance().putString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, dsxaccount.getId());
        httprequest = ((HttpRequest) (obj));
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        Log.i("AccountManager", "Successfully created user account on UPS.");
        httprequest = ((HttpRequest) (obj));
        publishDemographics();
_L6:
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj = HttpRequest.post(UpsConstants.ACCOUNT_CREATION_URL).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000).send(dsxaccount.toJsonString());
          goto _L5
_L4:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 409)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        httprequest = ((HttpRequest) (obj));
        Log.i("AccountManager", "user already exists on server.");
        httprequest = ((HttpRequest) (obj));
        loginAccount(dsxaccount);
          goto _L6
        dsxaccount;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxaccount;
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
          goto _L6
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Create User response code: ").append(((HttpRequest) (obj)).code()).toString());
          goto _L5
    }

    public void createAnonAccount()
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException
    {
        try
        {
            loginAccount(UpsCommonUtil.getAnonAccount());
            deleteAccount();
        }
        catch (Exception exception)
        {
            Log.i("AccountManager", String.format("anon account not created yet: %s %s", new Object[] {
                exception.getClass().getSimpleName(), exception.getMessage()
            }));
        }
        createAccount(UpsCommonUtil.getAnonAccount());
    }

    public void createSession()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        HttpRequest httprequest;
        TrafficStats.setThreadStatsTag(61442);
        httprequest = null;
        HttpRequest httprequest1 = HttpRequest.post(UpsConstants.SESSION_LOGIN_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(TwcDataServer.getApiKey());
        httprequest = httprequest1;
        if (!httprequest1.ok())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        httprequest = httprequest1;
        setDsxCookie(httprequest1.header("Set-Cookie"));
        httprequest = httprequest1;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully Created Dsx Session: ").append(httprequest1.code()).toString());
        if (httprequest1 != null)
        {
            httprequest1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
        httprequest = httprequest1;
        if (httprequest1.code() != 401)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        httprequest = httprequest1;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = httprequest1;
        clearDsxCookie();
        httprequest = httprequest1;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Exception occurred during create session. ").append(httprequest1.code()).toString());
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public void deleteAccount()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        Object obj;
        HttpRequest httprequest;
        obj = getDsxCookie();
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.delete(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", ((String) (obj))).trustAllHosts().readTimeout(15000).connectTimeout(15000);
_L4:
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        Log.i("AccountManager", (new StringBuilder()).append("Account deleting successful.").append(((HttpRequest) (obj)).code()).toString());
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj = HttpRequest.delete(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000);
        if (true) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Unable to delete account. ").append(((HttpRequest) (obj)).code()).toString());
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public void enableEndPoint(Boolean boolean1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        EndPoint endpoint;
        String s;
        Object obj6;
        Object obj7;
        TrafficStats.setThreadStatsTag(61442);
        endpoint = null;
        s = null;
        obj6 = null;
        obj7 = null;
        obj = null;
        obj5 = obj;
        obj1 = endpoint;
        obj2 = s;
        obj3 = obj6;
        obj4 = obj7;
        String s1 = (new StringBuilder()).append(UpsConstants.SET_UP_ENDPOINT_URL).append(UpsConstants.getAndroidDeviceId()).toString();
        obj5 = obj;
        obj1 = endpoint;
        obj2 = s;
        obj3 = obj6;
        obj4 = obj7;
        String s2 = getDsxCookie();
        if (s2 == null) goto _L2; else goto _L1
_L1:
        obj5 = obj;
        obj1 = endpoint;
        obj2 = s;
        obj3 = obj6;
        obj4 = obj7;
        obj = HttpRequest.get(s1).accept("application/json").header("Cookie", s2).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L17:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!((HttpRequest) (obj)).ok()) goto _L4; else goto _L3
_L3:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        endpoint = new EndPoint(((HttpRequest) (obj)).body());
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!boolean1.booleanValue()) goto _L6; else goto _L5
_L5:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        endpoint.setStatus("enabled");
_L13:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        s = getDsxCookie();
        if (s == null) goto _L8; else goto _L7
_L7:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj = HttpRequest.put(s1).contentType("application/json").header("Cookie", s).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(endpoint.toJSON().toString());
_L14:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!((HttpRequest) (obj)).ok()) goto _L10; else goto _L9
_L9:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (!boolean1.booleanValue()) goto _L12; else goto _L11
_L11:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully enabled endpoint ").append(((HttpRequest) (obj)).code()).toString());
_L15:
        if (obj != null)
        {
            try
            {
                ((HttpRequest) (obj)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", boolean1);
            }
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj5 = obj;
        obj1 = endpoint;
        obj2 = s;
        obj3 = obj6;
        obj4 = obj7;
        obj = HttpRequest.get(s1).accept("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        continue; /* Loop/switch isn't completed */
_L6:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        endpoint.setStatus("disabled");
          goto _L13
_L10:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        try
        {
            throw new AbnormalHttpResponseException((new StringBuilder()).append("Enable/Disable endpoint Response code: ").append(((HttpRequest) (obj)).code()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            boolean1 = ((Boolean) (obj5));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            boolean1 = ((Boolean) (obj2));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            boolean1 = ((Boolean) (obj3));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            boolean1 = ((Boolean) (obj4));
        }
        finally
        {
            if (obj1 == null) goto _L0; else goto _L0
        }
        obj1 = boolean1;
        Log.e("AccountManager", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
        if (boolean1 != null)
        {
            try
            {
                boolean1.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", boolean1);
            }
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L8:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        obj = HttpRequest.put(s1).contentType("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).send(endpoint.toJSON().toString());
          goto _L14
_L12:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully disabled endpoint ").append(((HttpRequest) (obj)).code()).toString());
          goto _L15
_L4:
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((HttpRequest) (obj)).code() != 404)
        {
            break MISSING_BLOCK_LABEL_752;
        }
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        Log.i("AccountManager", "Endpoint not found");
          goto _L15
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_816;
        }
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        clearDsxCookie();
        obj5 = obj;
        obj1 = obj;
        obj2 = obj;
        obj3 = obj;
        obj4 = obj;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Get existing endpoint Response code: ").append(((HttpRequest) (obj)).code()).toString());
        try
        {
            ((HttpRequest) (obj1)).disconnect();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ExceptionUtil.logExceptionError("AccountManager", "Unexpected", ((Throwable) (obj)));
        }
        TrafficStats.clearThreadStatsTag();
        throw boolean1;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public void fixLoggedAccountId()
    {
        if (DalPrefs.getInstance().getString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, "").isEmpty())
        {
            Collection collection = getAccountIds().get(getLoginType());
            if (!collection.isEmpty())
            {
                String s = DalPrefs.getInstance().getString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_TYPE_ID, "");
                if (!collection.contains(s))
                {
                    s = (String)collection.iterator().next();
                }
                DalPrefs.getInstance().putString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, s);
            }
        }
    }

    public Multimap getAccountIds()
    {
        HttpRequest httprequest;
        Object obj;
        HttpRequest httprequest1;
        Object obj1;
        HashMultimap hashmultimap;
        hashmultimap = HashMultimap.create();
        TrafficStats.setThreadStatsTag(61442);
        obj1 = null;
        httprequest = null;
        httprequest1 = httprequest;
        obj = obj1;
        String s = getDsxCookie();
        if (s == null) goto _L2; else goto _L1
_L1:
        httprequest1 = httprequest;
        obj = obj1;
        httprequest = HttpRequest.get(UpsConstants.ACCOUNT_LOGIN_URL).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", s).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L8:
        httprequest1 = httprequest;
        obj = httprequest;
        if (!httprequest.ok()) goto _L4; else goto _L3
_L3:
        httprequest1 = httprequest;
        obj = httprequest;
        setDsxCookie(httprequest.header("Set-Cookie"));
        httprequest1 = httprequest;
        obj = httprequest;
        obj1 = UpsCommonUtil.parseAccountIds(httprequest.body());
_L6:
        Exception exception;
        if (httprequest != null)
        {
            try
            {
                httprequest.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", httprequestexception);
            }
        }
        TrafficStats.clearThreadStatsTag();
        return ((Multimap) (obj1));
_L2:
        httprequest1 = httprequest;
        obj = obj1;
        httprequest = HttpRequest.get(UpsConstants.ACCOUNT_LOGIN_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = hashmultimap;
        httprequest1 = httprequest;
        obj = httprequest;
        if (httprequest.code() != 401) goto _L6; else goto _L5
_L5:
        httprequest1 = httprequest;
        obj = httprequest;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest1 = httprequest;
        obj = httprequest;
        clearDsxCookie();
        obj1 = hashmultimap;
          goto _L6
        exception;
        obj = httprequest1;
        Log.i("AccountManager", (new StringBuilder()).append("failed to fetch idMap: ").append(exception.getMessage()).toString());
        if (httprequest1 != null)
        {
            try
            {
                httprequest1.disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception1)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", httprequestexception1);
            }
        }
        TrafficStats.clearThreadStatsTag();
        return hashmultimap;
        Exception exception1;
        exception1;
        if (obj != null)
        {
            try
            {
                ((HttpRequest) (obj)).disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception2)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", httprequestexception2);
            }
        }
        TrafficStats.clearThreadStatsTag();
        throw exception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Demographics getDemographics()
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = UpsConstants.DEMOGRAPHICS_SETTINGS_URL;
        obj2 = getDsxCookie();
        obj1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.get(((CharSequence) (obj))).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", ((String) (obj2))).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L4:
        obj1 = obj;
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        obj1 = obj;
        obj2 = new Demographics(((HttpRequest) (obj)).body());
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return ((Demographics) (obj2));
_L2:
        obj = HttpRequest.get(((CharSequence) (obj))).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj1 = obj;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        obj1 = obj;
        clearDsxCookie();
        obj1 = obj;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to get demographics info: ").append(((HttpRequest) (obj)).code()).toString());
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((HttpRequest) (obj1)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public String getDsxCookie()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (dsxCookie != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s1 = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_ACCOUNT_COOKIE, "");
        String s = s1;
        if (s1.isEmpty())
        {
            s = null;
        }
        dsxCookie = s;
        s = dsxCookie;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public com.weather.commons.ups.facade.DsxAccount.AccountProvider getLastNonAnonymousLoginType()
    {
        this;
        JVM INSTR monitorenter ;
        com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider = com.weather.commons.ups.facade.DsxAccount.AccountProvider.STATIC.convert(TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.LAST_NON_ANON_LOGGED_IN_ACCOUNT_TYPE, ""));
        this;
        JVM INSTR monitorexit ;
        return accountprovider;
        Exception exception;
        exception;
        throw exception;
    }

    public UpsCommonUtil.LoginStatus getLoginStatus()
    {
        Object obj;
        UpsCommonUtil.LoginStatus loginstatus;
        Object obj1;
        loginstatus = UpsCommonUtil.LoginStatus.LOGGED_OUT;
        obj1 = getDsxCookie();
        obj = loginstatus;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = UpsCommonUtil.getUnixTimestampFromCookie(((String) (obj1)));
        if (obj == null || ((Long) (obj)).longValue() - System.currentTimeMillis() <= RENEW_TIME_BEFORE_EXPIRATION_MS) goto _L4; else goto _L3
_L3:
        obj1 = getLoginType();
        obj = loginstatus;
        if (obj1 == null) goto _L2; else goto _L5
_L5:
        _cls1..SwitchMap.com.weather.commons.ups.facade.DsxAccount.AccountProvider[((com.weather.commons.ups.facade.DsxAccount.AccountProvider) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 5: default 92
    //                   1 148
    //                   2 148
    //                   3 148
    //                   4 148
    //                   5 123;
           goto _L6 _L7 _L7 _L7 _L7 _L8
_L6:
        throw new RuntimeException((new StringBuilder()).append("unexpected provider value ").append(((com.weather.commons.ups.facade.DsxAccount.AccountProvider) (obj1)).convert()).toString());
_L8:
        obj = UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT;
_L2:
        LogUtil.d("AccountManager", LoggingMetaTags.TWC_UPS, "getLoginStatus result=%s", new Object[] {
            obj
        });
        return ((UpsCommonUtil.LoginStatus) (obj));
_L7:
        obj = UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = UpsCommonUtil.LoginStatus.TOKEN_EXPIRED;
        if (true) goto _L2; else goto _L9
_L9:
    }

    public com.weather.commons.ups.facade.DsxAccount.AccountProvider getLoginType()
    {
        this;
        JVM INSTR monitorenter ;
        com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider;
        if (currentLoginType == null)
        {
            currentLoginType = com.weather.commons.ups.facade.DsxAccount.AccountProvider.STATIC.convert(TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.LOGGED_IN_ACCOUNT_TYPE, ""));
        }
        accountprovider = currentLoginType;
        this;
        JVM INSTR monitorexit ;
        return accountprovider;
        Exception exception;
        exception;
        throw exception;
    }

    public Profile getUserProfile()
        throws AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException, JSONException
    {
        Object obj;
        HttpRequest httprequest;
        obj = getDsxCookie();
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.get(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", ((String) (obj))).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L4:
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        httprequest = ((HttpRequest) (obj));
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        Profile profile = (Profile)JsonObjectMapper.fromJson(((HttpRequest) (obj)).body(), com/weather/commons/ups/facade/Profile);
        httprequest = ((HttpRequest) (obj));
        LogUtil.d("AccountManager", LoggingMetaTags.TWC_UPS, "%s", new Object[] {
            profile
        });
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return profile;
_L2:
        obj = HttpRequest.get(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        if (true) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", (new StringBuilder()).append("failed to retrieve user profile: ").append(((HttpRequest) (obj)).code()).toString());
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to retrieve user profile ").append(((HttpRequest) (obj)).code()).toString());
        Exception exception;
        exception;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public String getWxAccountId()
    {
        Collection collection = getAccountIds().get(com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL);
        if (collection.isEmpty())
        {
            return null;
        } else
        {
            return (String)collection.iterator().next();
        }
    }

    public boolean isEndPointSetup()
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException
    {
        Object obj;
        Object obj1;
        String s;
        obj = (new StringBuilder()).append(UpsConstants.SET_UP_ENDPOINT_URL).append(UpsConstants.getAndroidDeviceId()).toString();
        s = getDsxCookie();
        obj1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.get(((CharSequence) (obj))).accept("application/json").header("Cookie", s).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
_L4:
        obj1 = obj;
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        boolean flag = (new EndPoint(((HttpRequest) (obj)).body())).getStatus().equals("enabled");
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return flag;
_L2:
        obj = HttpRequest.get(((CharSequence) (obj))).accept("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return false;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((HttpRequest) (obj1)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw exception;
    }

    public boolean isPasswordCurrent(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        HttpRequest httprequest;
        Object obj3;
        TrafficStats.setThreadStatsTag(61442);
        httprequest = null;
        obj3 = null;
        obj2 = null;
        obj1 = httprequest;
        obj = obj3;
        String s1 = getWxAccountId();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        obj1 = httprequest;
        obj = obj3;
        httprequest = HttpRequest.post(UpsConstants.SESSION_LOGIN_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(TwcDataServer.getApiKey());
        obj2 = httprequest;
        obj1 = httprequest;
        obj = httprequest;
        if (!httprequest.ok()) goto _L2; else goto _L3
_L3:
        obj1 = httprequest;
        obj = httprequest;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully Created Dsx Session ").append(httprequest.code()).toString());
        obj1 = httprequest;
        obj = httprequest;
        obj2 = getDsxCookie();
        obj1 = httprequest;
        obj = httprequest;
        s = (new DsxAccount(s1, s, com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)).toJsonString();
        if (obj2 == null) goto _L5; else goto _L4
_L4:
        obj1 = httprequest;
        obj = httprequest;
        s = HttpRequest.post(UpsConstants.ACCOUNT_LOGIN_URL).contentType("application/json").header("Cookie", ((String) (obj2))).readTimeout(15000).connectTimeout(15000).trustAllHosts().send(s);
_L6:
        obj1 = s;
        obj = s;
        boolean flag = s.ok();
        obj2 = s;
        if (flag)
        {
            if (s != null)
            {
                try
                {
                    s.disconnect();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    ExceptionUtil.logExceptionError("AccountManager", "Unexpected", s);
                }
            }
            TrafficStats.clearThreadStatsTag();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        obj1 = httprequest;
        obj = httprequest;
        s = HttpRequest.post(UpsConstants.ACCOUNT_LOGIN_URL).contentType("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).send(s);
        if (true) goto _L6; else goto _L2
_L2:
        if (obj2 != null)
        {
            try
            {
                ((HttpRequest) (obj2)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", s);
            }
        }
        TrafficStats.clearThreadStatsTag();
_L8:
        return false;
        s;
        obj = obj1;
        Log.e("AccountManager", (new StringBuilder()).append("Password is invalid: ").append(s.getMessage()).toString());
        if (obj1 != null)
        {
            try
            {
                ((HttpRequest) (obj1)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", s);
            }
        }
        TrafficStats.clearThreadStatsTag();
        if (true) goto _L8; else goto _L7
_L7:
        s;
        if (obj != null)
        {
            try
            {
                ((HttpRequest) (obj)).disconnect();
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception)
            {
                ExceptionUtil.logExceptionError("AccountManager", "Unexpected", httprequestexception);
            }
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public void linkAnonAccount(DsxAccount dsxaccount)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException, HttpResponseConflictException
    {
        loginAccount(UpsCommonUtil.getAnonAccount());
        _cls1..SwitchMap.com.weather.commons.ups.facade.DsxAccount.AccountProvider[dsxaccount.getProvider().ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 86
    //                   2 174
    //                   3 201
    //                   4 228
    //                   5 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new RuntimeException((new StringBuilder()).append("unexpected provider value ").append(dsxaccount.getProvider().convert()).toString());
_L2:
        Object obj = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_FB).append(dsxaccount.getId()).toString();
_L8:
        Object obj1;
        Object obj2;
        String s;
        s = getDsxCookie();
        obj2 = null;
        TrafficStats.setThreadStatsTag(61442);
        obj1 = obj2;
        String s1 = dsxaccount.getToken();
        if (s1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        throw new com.weather.util.net.HttpRequest.HttpRequestException("signup: can't link account with null token", new RuntimeException());
        dsxaccount;
        if (obj1 != null)
        {
            ((HttpRequest) (obj1)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxaccount;
_L3:
        obj = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_AWS).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_GP).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new Demographics();
        ((Demographics) (obj)).setTwcAccountEmail(dsxaccount.getId());
        saveDemographicsInfo(((Demographics) (obj)));
        obj = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_WX).append(dsxaccount.getId()).toString();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = (new StringBuilder()).append(UpsConstants.ACCOUNT_LINKING_ANON).append(dsxaccount.getId()).toString();
        if (true) goto _L8; else goto _L7
_L7:
        if (s == null) goto _L10; else goto _L9
_L9:
        obj1 = obj2;
        obj = HttpRequest.put(((CharSequence) (obj))).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", s).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(s1);
_L12:
        obj1 = obj;
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        setLoginType(dsxaccount.getProvider());
        obj1 = obj;
        DalPrefs.getInstance().putString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, dsxaccount.getId());
        obj1 = obj;
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        obj1 = obj;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully Linked account: ").append(((HttpRequest) (obj)).code()).toString());
        obj1 = obj;
        unlinkAccount(UpsCommonUtil.getAnonAccount());
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L10:
        obj1 = obj2;
        obj = HttpRequest.put(((CharSequence) (obj))).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(s1);
        if (true) goto _L12; else goto _L11
_L11:
        obj1 = obj;
        if (((HttpRequest) (obj)).code() != 409)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj1 = obj;
        throw new HttpResponseConflictException("signup: Account already exists! Logged in instead.");
        obj1 = obj;
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        obj1 = obj;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        obj1 = obj;
        clearDsxCookie();
        obj1 = obj;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Account linking Response code: ").append(((HttpRequest) (obj)).code()).toString());
    }

    public void loginAccount(DsxAccount dsxaccount)
        throws JSONException, com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        Object obj;
        HttpRequest httprequest;
        createSession();
        DalPrefs.getInstance().putString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, dsxaccount.getId());
        obj = getDsxCookie();
        httprequest = null;
        TrafficStats.setThreadStatsTag(61442);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = HttpRequest.post(UpsConstants.ACCOUNT_LOGIN_URL).contentType("application/json").header("Cookie", ((String) (obj))).readTimeout(15000).connectTimeout(15000).trustAllHosts().send(dsxaccount.toJsonString());
_L4:
        httprequest = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break; /* Loop/switch isn't completed */
        }
        httprequest = ((HttpRequest) (obj));
        setLoginType(dsxaccount.getProvider());
        httprequest = ((HttpRequest) (obj));
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        Log.i("AccountManager", (new StringBuilder()).append("Successfully Logged in user ").append(((HttpRequest) (obj)).code()).append(", user type : ").append(dsxaccount.getProvider()).toString());
        httprequest = ((HttpRequest) (obj));
        parseAndSaveUserId(((HttpRequest) (obj)).body());
        httprequest = ((HttpRequest) (obj));
        publishDemographics();
        httprequest = ((HttpRequest) (obj));
        if (dsxaccount.getProvider() != com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        httprequest = ((HttpRequest) (obj));
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.LAST_TWC_EMAIL, dsxaccount.getId());
        if (obj != null)
        {
            ((HttpRequest) (obj)).disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        obj = HttpRequest.post(UpsConstants.ACCOUNT_LOGIN_URL).contentType("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).send(dsxaccount.toJsonString());
        if (true) goto _L4; else goto _L3
_L3:
        httprequest = ((HttpRequest) (obj));
        if (((HttpRequest) (obj)).code() != 401)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        httprequest = ((HttpRequest) (obj));
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        httprequest = ((HttpRequest) (obj));
        clearDsxCookie();
        httprequest = ((HttpRequest) (obj));
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Login User Response code: ").append(((HttpRequest) (obj)).code()).toString());
        dsxaccount;
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw dsxaccount;
    }

    public void logout(boolean flag)
    {
        LogUtil.d("AccountManager", LoggingMetaTags.TWC_UPS, "logout", new Object[0]);
        boolean flag1;
        if ((new FollowMeSnapshot()).getLocation() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            FollowMe.getInstance().setSevereNotification(false);
            FollowMe.getInstance().setRealtimeRainNotification(false);
        }
        if (!LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            FollowMe.getInstance().removeFollowMe();
        }
        if (flag)
        {
            FixedLocations.getInstance().removeAllLocations();
        }
        enableEndPoint(Boolean.valueOf(false));
        clearDsxCookie();
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().closeAndClearTokenInformation();
        }
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, UpsCommonUtil.LoginStatus.LOGGED_OUT.getValue());
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI, "");
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, true);
        deactivateAlerts();
        AbstractNotificationService.cancelNotification(AbstractTwcApplication.getRootContext());
        createAnonAccount();
        LocationManager.getLocationManager().setCurrentLocation();
        return;
        Object obj;
        obj;
_L2:
        Log.e("AccountManager", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
        return;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void saveDemographicsInfo(Demographics demographics)
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException, HttpResponseConflictException
    {
        Demographics demographics1;
        JSONObject jsonobject;
        checkAccountLoginStatus();
        jsonobject = new JSONObject();
        jsonobject.putOpt("gender", demographics.getGender());
        jsonobject.putOpt("dob", demographics.getDateOfBirth());
        jsonobject.putOpt("ageRange", demographics.getAgeRange());
        jsonobject.putOpt("email", demographics.getTwcAccountEmail());
        jsonobject.putOpt("firstName", demographics.getFirstName());
        jsonobject.putOpt("lastName", demographics.getLastName());
        jsonobject.putOpt("cableProvider", demographics.getCableProvider());
        demographics = getDsxCookie();
        demographics1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (demographics == null) goto _L2; else goto _L1
_L1:
        demographics = HttpRequest.put(UpsConstants.DEMOGRAPHICS_SETTINGS_URL).contentType("application/json").header("Cookie", demographics).trustAllHosts().readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
_L4:
        demographics1 = demographics;
        if (!demographics.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        demographics1 = demographics;
        setDsxCookie(demographics.header("Set-Cookie"));
        demographics1 = demographics;
        Log.i("AccountManager", (new StringBuilder()).append("Successfully saved demographics data ").append(demographics.code()).toString());
        demographics1 = demographics;
        publishDemographics();
        if (demographics != null)
        {
            demographics.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        demographics = HttpRequest.put(UpsConstants.DEMOGRAPHICS_SETTINGS_URL).contentType("application/json").trustAllHosts().readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
        if (true) goto _L4; else goto _L3
_L3:
        demographics1 = demographics;
        if (demographics.code() != 409)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        demographics1 = demographics;
        LogUtil.d("AccountManager", LoggingMetaTags.TWC_UPS, "Email already in use", new Object[0]);
        demographics1 = demographics;
        throw new HttpResponseConflictException((new StringBuilder()).append("Save email Response code: ").append(demographics.code()).toString());
        demographics;
        if (demographics1 != null)
        {
            demographics1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw demographics;
        demographics1 = demographics;
        if (demographics.code() != 401)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        demographics1 = demographics;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        demographics1 = demographics;
        clearDsxCookie();
        demographics1 = demographics;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Save username Response code: ").append(demographics.code()).toString());
    }

    public void saveUserId()
    {
        {
            Object obj = getDsxCookie();
            HttpRequest httprequest1 = null;
            HttpRequest httprequest = null;
            TrafficStats.setThreadStatsTag(61442);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            try
            {
                obj = HttpRequest.get(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).header("Cookie", ((String) (obj))).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
            }
            catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception)
            {
                Object obj1;
                if (httprequest != null)
                {
                    try
                    {
                        httprequest.disconnect();
                    }
                    catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception1) { }
                }
                TrafficStats.clearThreadStatsTag();
                return;
            }
            finally
            {
                if (httprequest1 == null) goto _L0; else goto _L0
            }
        }
        httprequest = ((HttpRequest) (obj));
        httprequest1 = ((HttpRequest) (obj));
        if (!((HttpRequest) (obj)).ok())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        httprequest = ((HttpRequest) (obj));
        httprequest1 = ((HttpRequest) (obj));
        setDsxCookie(((HttpRequest) (obj)).header("Set-Cookie"));
        httprequest = ((HttpRequest) (obj));
        httprequest1 = ((HttpRequest) (obj));
        parseAndSaveUserId(((HttpRequest) (obj)).body());
        if (obj != null)
        {
            try
            {
                ((HttpRequest) (obj)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        TrafficStats.clearThreadStatsTag();
        return;
        obj = HttpRequest.get(UpsConstants.ACCOUNT_CREATION_URL).contentType(UpsConstants.TEXT_PLAIN).trustAllHosts().readTimeout(15000).connectTimeout(15000).header("Cache-Control", "no-cache");
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_59;
        }
        try
        {
            httprequest1.disconnect();
        }
        catch (com.weather.util.net.HttpRequest.HttpRequestException httprequestexception2) { }
        TrafficStats.clearThreadStatsTag();
        throw obj1;
    }

    public boolean sendPasswordRecoveryEmail(String s)
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        String s1;
        TrafficStats.setThreadStatsTag(61442);
        s1 = null;
        s = HttpRequest.post((new StringBuilder()).append(UpsConstants.PASSWORD_RECOVERY_BASE_URL).append(s).toString()).contentType(UpsConstants.TEXT_PLAIN).readTimeout(15000).connectTimeout(15000);
        s1 = s;
        if (!s.ok())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = s;
        Log.i("AccountManager", (new StringBuilder()).append("Password recovery email successfully sent: ").append(s.code()).toString());
        if (s != null)
        {
            s.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return true;
        s1 = s;
        int i = s.code();
        if (i == 404)
        {
            if (s != null)
            {
                s.disconnect();
            }
            TrafficStats.clearThreadStatsTag();
            return false;
        }
        s1 = s;
        Log.d("AccountManager", (new StringBuilder()).append("Unknown password: ").append(s.code()).toString());
        s1 = s;
        if (s.code() != 401)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s1 = s;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        s1 = s;
        clearDsxCookie();
        s1 = s;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Failed to send password recovery email: ").append(s.code()).toString());
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public void setDsxCookie(String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        } else
        {
            s1 = s;
        }
        dsxCookie = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s = UpsCommonUtil.getUnixTimestampFromCookie(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        long l = s.longValue() - System.currentTimeMillis();
        if (l < MINIMUM_COOKIE_MS)
        {
            LogUtil.w("AccountManager", LoggingMetaTags.TWC_UPS, "Unexpectedly short cookie duration %s, expected more than %s", new Object[] {
                Long.valueOf(l), Long.valueOf(MINIMUM_COOKIE_MS)
            });
        }
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_ACCOUNT_COOKIE, dsxCookie);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setupEndPoint(String s, String s1, boolean flag)
        throws JSONException, com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException
    {
        JSONObject jsonobject;
        String s2;
        jsonobject = new JSONObject();
        s2 = (new StringBuilder()).append(UpsConstants.SET_UP_ENDPOINT_URL).append(UpsConstants.getAndroidDeviceId()).toString();
        jsonobject.put("addr", s);
        jsonobject.put("chan", s1);
        if (flag)
        {
            jsonobject.put("status", "enabled");
        } else
        {
            jsonobject.put("status", "disabled");
        }
        s = getDsxCookie();
        s1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (s == null) goto _L2; else goto _L1
_L1:
        s = HttpRequest.put(s2).trustAllHosts().contentType("application/json").header("Cookie", s).readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
_L4:
        s1 = s;
        if (!s.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        setDsxCookie(s.header("Set-Cookie"));
        s1 = s;
        Log.i("AccountManager", "Successfully setup endpoint");
        if (s != null)
        {
            s.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        s = HttpRequest.put(s2).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
        if (true) goto _L4; else goto _L3
_L3:
        s1 = s;
        if (s.code() != 401)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        s1 = s;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        s1 = s;
        clearDsxCookie();
        s1 = s;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Setup End Point Error code: ").append(s.code()).toString());
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw s;
    }

    public void setupLanguage(Context context)
        throws com.weather.util.net.HttpRequest.HttpRequestException, AbnormalHttpResponseException, JSONException
    {
        Context context1;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("language", UpsCommonUtil.getCurrentLocaleStringInLowerCase(context));
        context = getDsxCookie();
        context1 = null;
        TrafficStats.setThreadStatsTag(61442);
        if (context == null) goto _L2; else goto _L1
_L1:
        context = HttpRequest.put(UpsConstants.LANGUAGE_PREFERENCE_URL).trustAllHosts().contentType("application/json").header("Cookie", context).readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
_L4:
        context1 = context;
        if (!context.ok())
        {
            break; /* Loop/switch isn't completed */
        }
        context1 = context;
        setDsxCookie(context.header("Set-Cookie"));
        context1 = context;
        Log.i("AccountManager", "Successfully setup language");
        if (context != null)
        {
            context.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return;
_L2:
        context = HttpRequest.put(UpsConstants.LANGUAGE_PREFERENCE_URL).trustAllHosts().contentType("application/json").readTimeout(15000).connectTimeout(15000).send(jsonobject.toString());
        if (true) goto _L4; else goto _L3
_L3:
        context1 = context;
        if (context.code() != 401)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        context1 = context;
        Log.e("AccountManager", "Cookie is bad! Clearing cookie from cache");
        context1 = context;
        clearDsxCookie();
        context1 = context;
        throw new AbnormalHttpResponseException((new StringBuilder()).append("Setup Language Error code: ").append(context.code()).toString());
        context;
        if (context1 != null)
        {
            context1.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        throw context;
    }

    public void switchAccount(DsxAccount dsxaccount)
        throws com.weather.util.net.HttpRequest.HttpRequestException, JSONException, AbnormalHttpResponseException, JsonParseException
    {
        LogUtil.d("AccountManager", LoggingMetaTags.TWC_UPS, "switchAccount", new Object[0]);
        enableEndPoint(Boolean.valueOf(false));
        clearDsxCookie();
        cancelNotification(AbstractTwcApplication.getRootContext());
        loginAccount(dsxaccount);
        enableEndPoint(Boolean.valueOf(true));
        LocationStartSyncService.suppressSync();
        UpsLocationManager.getInstance().loadLocationsFromDsx();
    }

    static 
    {
        RENEW_TIME_BEFORE_EXPIRATION_MS = TimeUnit.HOURS.toMillis(12L);
        MINIMUM_COOKIE_MS = TimeUnit.DAYS.toMillis(5L);
    }
}
