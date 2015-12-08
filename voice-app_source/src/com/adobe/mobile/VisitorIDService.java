// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig, RequestHandler, WearableFunctionBridge

final class VisitorIDService
{

    static final String ANALYTICS_PARAMETER_KEY_BLOB = "aamb";
    static final String ANALYTICS_PARAMETER_KEY_HINT = "aamh";
    static final String ANALYTICS_PARAMETER_KEY_MID = "mid";
    static final String ANALYTICS_PARAMETER_KEY_ORG = "mcorgid";
    static final String CID_DELIMITER = "%01";
    static final String RESPONSE_KEY_BLOB = "d_blob";
    static final String RESPONSE_KEY_ERROR = "error_msg";
    static final String RESPONSE_KEY_HINT = "dcs_region";
    static final String RESPONSE_KEY_MID = "d_mid";
    static final String RESPONSE_KEY_TTL = "id_sync_ttl";
    static final String SERVER = "dpm.demdex.net";
    static final String TARGET_PARAMETER_KEY_AID = "mboxMCAVID";
    static final String TARGET_PARAMETER_KEY_BLOB = "mboxAAMB";
    static final String TARGET_PARAMETER_KEY_HINT = "mboxMCGLH";
    static final String TARGET_PARAMETER_KEY_MID = "mboxMCGVID";
    static final int TIMEOUT = 2000;
    private static VisitorIDService _instance = null;
    private static final Object _instanceMutex = new Object();
    private String _blob;
    private long _lastSync;
    private String _locationHint;
    private String _marketingCloudID;
    private long _ttl;
    private final Executor _visitorIDExector = Executors.newSingleThreadExecutor();

    protected VisitorIDService()
    {
        resetVariablesFromSharedPreferences();
        idSync(null);
    }

    private String _generateMID()
    {
        Object obj = UUID.randomUUID();
        long l1 = ((UUID) (obj)).getMostSignificantBits();
        long l2 = ((UUID) (obj)).getLeastSignificantBits();
        obj = Locale.US;
        long l = l1;
        if (l1 < 0L)
        {
            l = -l1;
        }
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = -l2;
        }
        return String.format(((Locale) (obj)), "%019d%019d", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
    }

    public static VisitorIDService sharedInstance()
    {
        VisitorIDService visitoridservice;
        synchronized (_instanceMutex)
        {
            if (_instance == null)
            {
                _instance = new VisitorIDService();
            }
            visitoridservice = _instance;
        }
        return visitoridservice;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final String getAAMParameterString()
    {
        final StringBuilder returnValue = new StringBuilder();
        FutureTask futuretask = new FutureTask(new Callable() {

            final VisitorIDService this$0;
            final StringBuilder val$returnValue;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (_marketingCloudID != null)
                {
                    returnValue.append("&");
                    returnValue.append("d_mid");
                    returnValue.append("=");
                    returnValue.append(_marketingCloudID);
                    if (_blob != null)
                    {
                        returnValue.append("&");
                        returnValue.append("d_blob");
                        returnValue.append("=");
                        returnValue.append(_blob);
                    }
                    if (_locationHint != null)
                    {
                        returnValue.append("&");
                        returnValue.append("dcs_region");
                        returnValue.append("=");
                        returnValue.append(_locationHint);
                    }
                }
                return null;
            }

            
            {
                this$0 = VisitorIDService.this;
                returnValue = stringbuilder;
                super();
            }
        });
        _visitorIDExector.execute(futuretask);
        try
        {
            futuretask.get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("ID Service - Unable to retrieve audience manager parameters from queue(%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
        return returnValue.toString();
    }

    protected final String getAnalyticsIDRequestParameterString()
    {
        final StringBuilder returnValue = new StringBuilder();
        FutureTask futuretask = new FutureTask(new Callable() {

            final VisitorIDService this$0;
            final StringBuilder val$returnValue;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (_marketingCloudID != null)
                {
                    returnValue.append("?");
                    returnValue.append("mid");
                    returnValue.append("=");
                    returnValue.append(_marketingCloudID);
                    returnValue.append("&");
                    returnValue.append("mcorgid");
                    returnValue.append("=");
                    returnValue.append(MobileConfig.getInstance().getMarketingCloudOrganizationId());
                }
                return null;
            }

            
            {
                this$0 = VisitorIDService.this;
                returnValue = stringbuilder;
                super();
            }
        });
        _visitorIDExector.execute(futuretask);
        try
        {
            futuretask.get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("ID Service - Unable to retrieve analytics id parameters from queue(%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
        return returnValue.toString();
    }

    protected final Map getAnalyticsParameters()
    {
        final HashMap returnValue = new HashMap();
        FutureTask futuretask = new FutureTask(new Callable() {

            final VisitorIDService this$0;
            final Map val$returnValue;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (_marketingCloudID != null)
                {
                    returnValue.put("mid", _marketingCloudID);
                    if (_blob != null)
                    {
                        returnValue.put("aamb", _blob);
                    }
                    if (_locationHint != null)
                    {
                        returnValue.put("aamh", _locationHint);
                    }
                }
                return null;
            }

            
            {
                this$0 = VisitorIDService.this;
                returnValue = map;
                super();
            }
        });
        _visitorIDExector.execute(futuretask);
        try
        {
            futuretask.get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("ID Service - Unable to retrieve analytics parameters from queue(%s)", new Object[] {
                exception.getLocalizedMessage()
            });
            return returnValue;
        }
        return returnValue;
    }

    protected final String getMarketingCloudID()
    {
        Object obj = new FutureTask(new Callable() {

            final VisitorIDService this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return _marketingCloudID;
            }

            
            {
                this$0 = VisitorIDService.this;
                super();
            }
        });
        _visitorIDExector.execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("ID Service - Unable to retrieve marketing cloud id from queue(%s)", new Object[] {
                exception.getLocalizedMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    protected final String getTargetParameterString()
    {
        final StringBuilder returnValue = new StringBuilder();
        FutureTask futuretask = new FutureTask(new Callable() {

            final VisitorIDService this$0;
            final StringBuilder val$returnValue;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (_marketingCloudID != null)
                {
                    returnValue.append("&");
                    returnValue.append("mboxMCGVID");
                    returnValue.append("=");
                    returnValue.append(_marketingCloudID);
                    if (_blob != null)
                    {
                        returnValue.append("&");
                        returnValue.append("mboxAAMB");
                        returnValue.append("=");
                        returnValue.append(_blob);
                    }
                    if (_locationHint != null)
                    {
                        returnValue.append("&");
                        returnValue.append("mboxMCGLH");
                        returnValue.append("=");
                        returnValue.append(_locationHint);
                    }
                    String s = StaticMethods.getAID();
                    if (s != null)
                    {
                        returnValue.append("&");
                        returnValue.append("mboxMCAVID");
                        returnValue.append("=");
                        returnValue.append(s);
                    }
                }
                return null;
            }

            
            {
                this$0 = VisitorIDService.this;
                returnValue = stringbuilder;
                super();
            }
        });
        _visitorIDExector.execute(futuretask);
        try
        {
            futuretask.get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("ID Service - Unable to retrieve target parameters from queue(%s)", new Object[] {
                exception.getLocalizedMessage()
            });
        }
        return returnValue.toString();
    }

    protected void idSync(final Map identifiersCopy)
    {
        if (identifiersCopy != null)
        {
            identifiersCopy = new HashMap(identifiersCopy);
        } else
        {
            identifiersCopy = null;
        }
        _visitorIDExector.execute(new Runnable() {

            final VisitorIDService this$0;
            final HashMap val$identifiersCopy;

            public void run()
            {
                if (MobileConfig.getInstance().getVisitorIdServiceEnabled())
                {
                    String s = MobileConfig.getInstance().getMarketingCloudOrganizationId();
                    boolean flag;
                    boolean flag1;
                    if (StaticMethods.getTimeSince1970() - _lastSync > _ttl)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (identifiersCopy != null)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (_marketingCloudID == null || flag1 || flag)
                    {
                        Object obj;
                        if (MobileConfig.getInstance().getSSL())
                        {
                            obj = "https";
                        } else
                        {
                            obj = "http";
                        }
                        obj = new StringBuilder(((String) (obj)));
                        ((StringBuilder) (obj)).append("://");
                        ((StringBuilder) (obj)).append("dpm.demdex.net");
                        ((StringBuilder) (obj)).append("/id?d_ver=2&d_orgid=");
                        ((StringBuilder) (obj)).append(s);
                        if (_marketingCloudID != null)
                        {
                            ((StringBuilder) (obj)).append("&");
                            ((StringBuilder) (obj)).append("d_mid");
                            ((StringBuilder) (obj)).append("=");
                            ((StringBuilder) (obj)).append(_marketingCloudID);
                        }
                        if (_blob != null)
                        {
                            ((StringBuilder) (obj)).append("&");
                            ((StringBuilder) (obj)).append("d_blob");
                            ((StringBuilder) (obj)).append("=");
                            ((StringBuilder) (obj)).append(_blob);
                        }
                        if (_locationHint != null)
                        {
                            ((StringBuilder) (obj)).append("&");
                            ((StringBuilder) (obj)).append("dcs_region");
                            ((StringBuilder) (obj)).append("=");
                            ((StringBuilder) (obj)).append(_locationHint);
                        }
                        if (flag1)
                        {
                            java.util.Map.Entry entry;
                            for (Iterator iterator = identifiersCopy.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(StaticMethods.URLEncode((String)entry.getValue())))
                            {
                                entry = (java.util.Map.Entry)iterator.next();
                                ((StringBuilder) (obj)).append("&d_cid_ic=");
                                ((StringBuilder) (obj)).append(StaticMethods.URLEncode((String)entry.getKey()));
                                ((StringBuilder) (obj)).append("%01");
                            }

                        }
                        obj = ((StringBuilder) (obj)).toString();
                        StaticMethods.logDebugFormat("ID Service - Sending id sync call (%s)", new Object[] {
                            obj
                        });
                        byte abyte0[] = RequestHandler.retrieveData(((String) (obj)), null, 2000, "ID Service");
                        abyte0 = parseResponse(abyte0);
                        if (abyte0 != null && abyte0.has("d_mid") && !abyte0.has("error_msg"))
                        {
                            try
                            {
                                _marketingCloudID = abyte0.getString("d_mid");
                                if (abyte0.has("d_blob"))
                                {
                                    _blob = abyte0.getString("d_blob");
                                }
                                if (abyte0.has("dcs_region"))
                                {
                                    _locationHint = abyte0.getString("dcs_region");
                                }
                                if (abyte0.has("id_sync_ttl"))
                                {
                                    _ttl = (long)abyte0.getInt("id_sync_ttl");
                                }
                                StaticMethods.logDebugFormat("ID Service - Got ID Response (mid: %s, blob: %s, hint: %s, ttl: %d)", new Object[] {
                                    _marketingCloudID, _blob, _locationHint, Long.valueOf(_ttl)
                                });
                            }
                            // Misplaced declaration of an exception variable
                            catch (byte abyte0[])
                            {
                                StaticMethods.logDebugFormat("ID Service - Error parsing response (%s)", new Object[] {
                                    abyte0.getLocalizedMessage()
                                });
                            }
                        } else
                        {
                            if (abyte0 != null && abyte0.has("error_msg"))
                            {
                                try
                                {
                                    StaticMethods.logErrorFormat("ID Service - Service returned error (%s)", new Object[] {
                                        abyte0.getString("error_msg")
                                    });
                                }
                                catch (JSONException jsonexception)
                                {
                                    StaticMethods.logErrorFormat("ID Service - Unable to read error condition(%s)", new Object[] {
                                        jsonexception.getLocalizedMessage()
                                    });
                                }
                            }
                            _marketingCloudID = _generateMID();
                            _blob = null;
                            _locationHint = null;
                            _ttl = 600L;
                            StaticMethods.logDebugFormat("ID Service - Did not return an ID, generating one locally (mid: %s, ttl: %d)", new Object[] {
                                _marketingCloudID, Long.valueOf(_ttl)
                            });
                        }
                        _lastSync = StaticMethods.getTimeSince1970();
                        WearableFunctionBridge.syncVidServiceToWearable(_marketingCloudID, _locationHint, _blob, _ttl, _lastSync);
                        try
                        {
                            abyte0 = StaticMethods.getSharedPreferencesEditor();
                            abyte0.putString("ADBMOBILE_PERSISTED_MID", _marketingCloudID);
                            abyte0.putString("ADBMOBILE_PERSISTED_MID_HINT", _locationHint);
                            abyte0.putString("ADBMOBILE_PERSISTED_MID_BLOB", _blob);
                            abyte0.putLong("ADBMOBILE_VISITORID_TTL", _ttl);
                            abyte0.putLong("ADBMOBILE_VISITORID_SYNC", _lastSync);
                            abyte0.commit();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (byte abyte0[])
                        {
                            StaticMethods.logErrorFormat("ID Service - Unable to persist identifiers to shared preferences(%s)", new Object[] {
                                abyte0.getLocalizedMessage()
                            });
                        }
                        return;
                    }
                }
            }

            
            {
                this$0 = VisitorIDService.this;
                identifiersCopy = hashmap;
                super();
            }
        });
    }

    protected final JSONObject parseResponse(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new JSONObject(new String(abyte0, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            StaticMethods.logErrorFormat("ID Service - Unable to decode response(%s)", new Object[] {
                abyte0.getLocalizedMessage()
            });
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            StaticMethods.logDebugFormat("ID Service - Unable to parse response(%s)", new Object[] {
                abyte0.getLocalizedMessage()
            });
            return null;
        }
        return abyte0;
    }

    protected void resetVariablesFromSharedPreferences()
    {
        _visitorIDExector.execute(new Runnable() {

            final VisitorIDService this$0;

            public void run()
            {
                try
                {
                    _marketingCloudID = StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID", null);
                    _locationHint = StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID_HINT", null);
                    _blob = StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID_BLOB", null);
                    _ttl = StaticMethods.getSharedPreferences().getLong("ADBMOBILE_VISITORID_TTL", 0L);
                    _lastSync = StaticMethods.getSharedPreferences().getLong("ADBMOBILE_VISITORID_SYNC", 0L);
                    return;
                }
                catch (StaticMethods.NullContextException nullcontextexception)
                {
                    _marketingCloudID = null;
                    _locationHint = null;
                    _blob = null;
                    StaticMethods.logErrorFormat("Visitor - Unable to check for stored visitor ID due to context error (%s)", new Object[] {
                        nullcontextexception.getMessage()
                    });
                    return;
                }
            }

            
            {
                this$0 = VisitorIDService.this;
                super();
            }
        });
    }




/*
    static String access$002(VisitorIDService visitoridservice, String s)
    {
        visitoridservice._marketingCloudID = s;
        return s;
    }

*/



/*
    static String access$102(VisitorIDService visitoridservice, String s)
    {
        visitoridservice._locationHint = s;
        return s;
    }

*/



/*
    static String access$202(VisitorIDService visitoridservice, String s)
    {
        visitoridservice._blob = s;
        return s;
    }

*/



/*
    static long access$302(VisitorIDService visitoridservice, long l)
    {
        visitoridservice._ttl = l;
        return l;
    }

*/



/*
    static long access$402(VisitorIDService visitoridservice, long l)
    {
        visitoridservice._lastSync = l;
        return l;
    }

*/

}
