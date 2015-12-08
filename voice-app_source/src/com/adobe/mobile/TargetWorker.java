// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig, VisitorIDService, TargetLocationRequest, 
//            AnalyticsTrackLifetimeValueIncrease, Lifecycle

final class TargetWorker
{
    protected static class SendRequestTask
        implements Runnable
    {

        private Target.TargetCallback callback;
        private BigDecimal lifetimeValue;
        private TargetLocationRequest request;

        public void run()
        {
            String s1;
            if (lifetimeValue != null)
            {
                TargetWorker.addPersistentParameter("a.ltv.amount", lifetimeValue.toString());
            }
            s1 = TargetWorker.getURLRequestString(request.name, request.parameters);
            if (s1 != null && s1.length() > 0) goto _L2; else goto _L1
_L1:
            StaticMethods.logWarningFormat("Target - LocationRequest requires a name.", new Object[0]);
            if (callback != null)
            {
                callback.call(request.defaultContent);
            }
_L5:
            return;
_L2:
            Object obj1;
            HttpGet httpget;
            obj = new StringBuilder();
            obj1 = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), MobileConfig.getInstance().getDefaultLocationTimeout() * 1000);
            HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 2000);
            obj1 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)));
            httpget = new HttpGet(s1);
            TargetWorker.loadCookies();
            synchronized (TargetWorker._cookieMutex)
            {
                if (TargetWorker._cookies != null)
                {
                    httpget.setHeader("Cookie", TargetWorker._cookies);
                }
            }
            obj2 = ((DefaultHttpClient) (obj1)).execute(httpget);
            TargetWorker.saveCookies(((DefaultHttpClient) (obj1)).getCookieStore());
            if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() != 200)
            {
                break MISSING_BLOCK_LABEL_383;
            }
            obj1 = new BufferedReader(new InputStreamReader(((HttpResponse) (obj2)).getEntity().getContent(), "UTF-8"));
_L3:
            obj2 = ((BufferedReader) (obj1)).readLine();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_283;
            }
            ((StringBuilder) (obj)).append(((String) (obj2)));
              goto _L3
            obj;
            obj2;
            JVM INSTR monitorexit ;
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logWarningFormat("Target - Unable to create HttpURLConnection", new Object[0]);
            }
            if (callback == null) goto _L5; else goto _L4
_L4:
            callback.call(request.defaultContent);
            return;
            String s;
            ((BufferedReader) (obj1)).close();
            s = ((StringBuilder) (obj)).toString();
            if (s.length() <= 0)
            {
                break MISSING_BLOCK_LABEL_340;
            }
            StaticMethods.logDebugFormat("Target - LocationRequest (%s) Result: %s", new Object[] {
                request.name, s
            });
            if (callback == null) goto _L5; else goto _L6
_L6:
            callback.call(s);
            return;
            StaticMethods.logWarningFormat("Target - LocationRequest (%s) response was empty", new Object[] {
                request.name
            });
            if (callback == null) goto _L5; else goto _L7
_L7:
            callback.call(request.defaultContent);
            return;
            StaticMethods.logWarningFormat("Target - No content found or user didn't qualify for campaign for LocationRequest (%s)", new Object[] {
                request.name
            });
            if (callback != null)
            {
                callback.call(request.defaultContent);
                return;
            }
              goto _L5
        }

        private SendRequestTask(TargetLocationRequest targetlocationrequest, Target.TargetCallback targetcallback)
        {
            request = targetlocationrequest;
            callback = targetcallback;
            lifetimeValue = AnalyticsTrackLifetimeValueIncrease.getLifetimeValue();
        }

    }


    protected static final String COOKIE_EXPIRES_KEY_SUFFIX = "_Expires";
    protected static final String COOKIE_NAME_PCID = "mboxPC";
    protected static final String COOKIE_NAME_SESSION = "mboxSession";
    protected static final String COOKIE_VALUE_KEY_SUFFIX = "_Value";
    protected static final String LOCATION_CONTENT_TYPE = "text%2Fplain%3Bcharset%3Dutf-8";
    protected static final String LOCATION_SERVER_PREFIX = "http://";
    protected static final String LOCATION_SERVER_SUFFIX = ".tt.omtrdc.net";
    protected static final String LOCATION_SESSION_STRING = "&mboxSession=%s&mboxPC=%s&mboxXDomain=disabled";
    private static final String OFFER_ENCODING = "UTF-8";
    private static final int TARGET_SOCKET_TIMEOUT = 2;
    private static final int TO_MILLI = 1000;
    private static final Object _cookieMutex = new Object();
    private static String _cookies;
    private static final Object _parameterMutex = new Object();
    private static String _pcId;
    private static final Object _pcIdMutex = new Object();
    private static HashMap _persistentParameters;
    private static String _serverURL = null;
    private static final Object _serverURLMutex = new Object();
    private static String _sessionId;
    private static final Object _sessionIdMutex = new Object();

    TargetWorker()
    {
    }

    protected static void addPersistentParameter(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return;
        }
        synchronized (_parameterMutex)
        {
            if (_persistentParameters == null)
            {
                _persistentParameters = new HashMap();
            }
            _persistentParameters.put(s, s1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected static void clearCookies()
    {
        synchronized (_cookieMutex)
        {
            _cookies = null;
        }
        deleteCookie("mboxSession");
        deleteCookie("mboxPC");
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void deleteCookie(String s)
    {
        if (s.equals("mboxSession"))
        {
            synchronized (_sessionIdMutex)
            {
                _sessionId = null;
            }
        } else
        if (s.equals("mboxPC"))
        {
            synchronized (_pcIdMutex)
            {
                _pcId = null;
            }
        }
        try
        {
            obj = StaticMethods.getSharedPreferencesEditor();
            ((android.content.SharedPreferences.Editor) (obj)).remove((new StringBuilder()).append(s).append("_Value").toString());
            ((android.content.SharedPreferences.Editor) (obj)).remove((new StringBuilder()).append(s).append("_Expires").toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Target - Error persisting cookies (%s)", new Object[] {
                s.getMessage()
            });
        }
        break MISSING_BLOCK_LABEL_136;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static String getParamsString(Map map)
    {
        if (map == null || map.size() == 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (s != null && s.length() > 0 && obj != null && obj.toString().length() > 0)
            {
                stringbuilder.append("&");
                stringbuilder.append(StaticMethods.URLEncode(s));
                stringbuilder.append("=");
                stringbuilder.append(StaticMethods.URLEncode(obj.toString()));
            }
        } while (true);
        return stringbuilder.toString();
    }

    protected static String getPcID()
    {
        String s;
        synchronized (_pcIdMutex)
        {
            s = _pcId;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String getServerURL(String s)
    {
        Object obj = _serverURLMutex;
        obj;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        if (_serverURL != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        stringbuilder = new StringBuilder();
        String s1;
        if (MobileConfig.getInstance().getSSL())
        {
            s1 = "https://";
        } else
        {
            s1 = "http://";
        }
        _serverURL = stringbuilder.append(s1).append(s).append(".tt.omtrdc.net").toString();
        s = _serverURL;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected static String getSessionID()
    {
        String s;
        synchronized (_sessionIdMutex)
        {
            s = _sessionId;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String getSessionString()
    {
        String s;
        synchronized (_pcIdMutex)
        {
            s = _pcId;
        }
        String s1;
        synchronized (_sessionIdMutex)
        {
            s1 = _sessionId;
        }
        if (s1 != null && s1.trim().length() > 0 && s != null && s.trim().length() > 0)
        {
            return String.format("&mboxSession=%s&mboxPC=%s&mboxXDomain=disabled", new Object[] {
                s1, s
            });
        } else
        {
            return "";
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private static String getURLRequestString(String s, Map map)
    {
        Object obj1;
        String s1;
        if (s == null || s.length() <= 0 || !MobileConfig.getInstance().mobileUsingTarget())
        {
            return null;
        }
        synchronized (_parameterMutex)
        {
            s1 = getParamsString(_persistentParameters);
        }
        obj1 = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public HashMap call()
                throws Exception
            {
                return Lifecycle.getContextData();
            }

        });
        StaticMethods.getAnalyticsExecutor().execute(((Runnable) (obj1)));
        obj = null;
        obj1 = (HashMap)((FutureTask) (obj1)).get();
        obj = obj1;
_L1:
        StringBuilder stringbuilder = (new StringBuilder()).append(getServerURL(MobileConfig.getInstance().getClientCode())).append("/m2/").append(MobileConfig.getInstance().getClientCode()).append("/ubox/raw?mboxContentType=").append("text%2Fplain%3Bcharset%3Dutf-8").append("&t=").append(StaticMethods.getTimeSince1970()).append(getSessionString()).append("&mboxDefault=none&mbox=").append(s);
        Object obj2;
        if (MobileConfig.getInstance().getVisitorIdServiceEnabled())
        {
            obj2 = VisitorIDService.sharedInstance().getTargetParameterString();
        } else
        {
            obj2 = "";
        }
        map = stringbuilder.append(((String) (obj2))).append(getParamsString(map)).append(getParamsString(((Map) (obj)))).append(s1).toString();
        StaticMethods.logDebugFormat("Target - LocationRequest (%s) loading URL: %s", new Object[] {
            s, map
        });
        return map;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj2;
        StaticMethods.logDebugFormat("Target - Unable to get lifecycle data (%s)", new Object[] {
            ((Exception) (obj2)).getMessage()
        });
          goto _L1
    }

    private static void loadCookie(String s)
    {
        long l = StaticMethods.getSharedPreferences().getLong((new StringBuilder()).append(s).append("_Expires").toString(), 0L);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        String s1;
        if (l <= System.currentTimeMillis())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        s1 = StaticMethods.getSharedPreferences().getString((new StringBuilder()).append(s).append("_Value").toString(), "");
        Object obj = _cookieMutex;
        obj;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        if (_cookies == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        stringbuilder = new StringBuilder(_cookies);
        stringbuilder.append("; ");
_L2:
        stringbuilder.append(s);
        stringbuilder.append("=");
        stringbuilder.append(s1);
        _cookies = stringbuilder.toString();
        return;
        stringbuilder = new StringBuilder();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Target - Error loading cookie data (%s)", new Object[] {
                s.getMessage()
            });
        }
        return;
        deleteCookie(s);
        return;
    }

    protected static void loadCookies()
    {
        synchronized (_cookieMutex)
        {
            _cookies = null;
        }
        loadCookie("mboxPC");
        loadCookie("mboxSession");
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static void loadRequest(TargetLocationRequest targetlocationrequest, Target.TargetCallback targetcallback)
    {
        if (targetlocationrequest == null)
        {
            StaticMethods.logWarningFormat("Target - LocationRequest parameter is null", new Object[0]);
            if (targetcallback != null)
            {
                targetcallback.call(null);
            }
            return;
        } else
        {
            (new Thread(new SendRequestTask(targetlocationrequest, targetcallback))).start();
            return;
        }
    }

    protected static void removePersistentParameter(String s)
    {
        if (s == null)
        {
            return;
        }
        synchronized (_parameterMutex)
        {
            if (_persistentParameters != null)
            {
                _persistentParameters.remove(s);
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void saveCookies(CookieStore cookiestore)
    {
        cookiestore = cookiestore.getCookies().iterator();
_L2:
        if (!cookiestore.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Cookie cookie = (Cookie)cookiestore.next();
        String s = cookie.getName();
        if (s.equals("mboxSession"))
        {
            synchronized (_sessionIdMutex)
            {
                _sessionId = cookie.getValue();
            }
            storeCookie(s, cookie);
        } else
        if (s.equals("mboxPC"))
        {
            synchronized (_pcIdMutex)
            {
                _pcId = cookie.getValue();
            }
            storeCookie(s, cookie);
        }
        continue; /* Loop/switch isn't completed */
        cookiestore;
        obj;
        JVM INSTR monitorexit ;
        throw cookiestore;
        if (true) goto _L2; else goto _L1
        cookiestore;
        obj1;
        JVM INSTR monitorexit ;
        throw cookiestore;
_L1:
    }

    private static void storeCookie(String s, Cookie cookie)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            editor.putString((new StringBuilder()).append(s).append("_Value").toString(), cookie.getValue());
            editor.putLong((new StringBuilder()).append(s).append("_Expires").toString(), cookie.getExpiryDate().getTime());
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Target - Error persisting cookie (%s)", new Object[] {
                s.getMessage()
            });
        }
    }





}
