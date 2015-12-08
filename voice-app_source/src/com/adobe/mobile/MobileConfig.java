// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            MobilePrivacyStatus, StaticMethods, RemoteDownload, Message, 
//            WearableFunctionBridge, AnalyticsWorker, AudienceManagerWorker

final class MobileConfig
{

    private static final String CONFIG_FILE_NAME = "ADBMobileConfig.json";
    private static final String CONFIG_PRIVACY_OPTED_IN = "optedin";
    private static final String CONFIG_PRIVACY_OPTED_OUT = "optedout";
    private static final String CONFIG_PRIVACY_UNKNOWN = "optunknown";
    private static final int DEFAULT_BATCH_LIMIT = 0;
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final int DEFAULT_LIFECYCLE_TIMEOUT = 300;
    private static final int DEFAULT_LOCATION_TIMEOUT = 2;
    private static final boolean DEFAULT_OFFLINE_TRACKING = false;
    private static final MobilePrivacyStatus DEFAULT_PRIVACY_STATUS;
    private static final int DEFAULT_REFERRER_TIMEOUT = 0;
    private static final boolean DEFAULT_SSL = false;
    private static final String JSON_CONFIG_AAM_KEY = "audienceManager";
    private static final String JSON_CONFIG_ANALYTICS_KEY = "analytics";
    private static final String JSON_CONFIG_BATCH_LIMIT_KEY = "batchLimit";
    private static final String JSON_CONFIG_CHAR_SET_KEY = "charset";
    private static final String JSON_CONFIG_CLIENT_CODE_KEY = "clientCode";
    private static final String JSON_CONFIG_LIFECYCLE_TIMEOUT_KEY = "lifecycleTimeout";
    private static final String JSON_CONFIG_MARKETINGCLOUD_KEY = "marketingCloud";
    private static final String JSON_CONFIG_MESSAGES_KEY = "messages";
    private static final String JSON_CONFIG_MESSAGES_URL_KEY = "messages";
    private static final String JSON_CONFIG_OFFLINE_TRACKING_KEY = "offlineEnabled";
    private static final String JSON_CONFIG_ORGID_KEY = "org";
    private static final String JSON_CONFIG_POINTS_OF_INTEREST_KEY = "poi";
    private static final String JSON_CONFIG_POI_REMOTES_KEY = "analytics.poi";
    private static final String JSON_CONFIG_PRIVACY_DEFAULT_KEY = "privacyDefault";
    private static final String JSON_CONFIG_REFERRER_TIMEOUT_KEY = "referrerTimeout";
    private static final String JSON_CONFIG_REMOTES_KEY = "remotes";
    private static final String JSON_CONFIG_REPORT_SUITES_KEY = "rsids";
    private static final String JSON_CONFIG_SERVER_KEY = "server";
    private static final String JSON_CONFIG_SSL_KEY = "ssl";
    private static final String JSON_CONFIG_TARGET_KEY = "target";
    private static final String JSON_CONFIG_TIMEOUT_KEY = "timeout";
    private static MobileConfig _instance = null;
    private static final Object _instanceMutex = new Object();
    private static InputStream _userDefinedInputStream = null;
    private static final Object _userDefinedInputStreamMutex = new Object();
    private static final Object _usingAnalyticsMutex = new Object();
    private static final Object _usingAudienceManagerMutex = new Object();
    private static final Object _usingGooglePlayServicesMutex = new Object();
    private static final Object _usingTargetMutex = new Object();
    private String _aamServer;
    private int _batchLimit;
    private String _characterSet;
    private String _clientCode;
    private int _defaultLocationTimeout;
    private ArrayList _inAppMessages;
    private int _lifecycleTimeout;
    private String _marketingCloudOrganizationId;
    private String _messagesURL;
    private boolean _offlineTrackingEnabled;
    private List _pointsOfInterest;
    private String _pointsOfInterestURL;
    private MobilePrivacyStatus _privacyStatus;
    private int _referrerTimeout;
    private String _reportSuiteIds;
    private boolean _ssl;
    private String _trackingServer;
    private Boolean _usingAnalytics;
    private Boolean _usingAudienceManager;
    private Boolean _usingGooglePlayServices;
    private Boolean _usingTarget;

    private MobileConfig()
    {
        JSONObject jsonobject1;
        _reportSuiteIds = null;
        _trackingServer = null;
        _characterSet = "UTF-8";
        _ssl = false;
        _offlineTrackingEnabled = false;
        _lifecycleTimeout = 300;
        _referrerTimeout = 0;
        _batchLimit = 0;
        _privacyStatus = DEFAULT_PRIVACY_STATUS;
        _pointsOfInterest = null;
        _pointsOfInterestURL = null;
        _clientCode = null;
        _defaultLocationTimeout = 2;
        _aamServer = null;
        _messagesURL = null;
        _inAppMessages = null;
        _marketingCloudOrganizationId = null;
        _usingAnalytics = null;
        _usingGooglePlayServices = null;
        _usingAudienceManager = null;
        _usingTarget = null;
        jsonobject1 = loadBundleConfig();
        if (jsonobject1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = null;
        JSONObject jsonobject = jsonobject1.getJSONObject("analytics");
        obj = jsonobject;
_L9:
        if (obj == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        JSONException jsonexception5;
        try
        {
            _trackingServer = ((JSONObject) (obj)).getString("server");
            _reportSuiteIds = ((JSONObject) (obj)).getString("rsids");
        }
        catch (JSONException jsonexception6)
        {
            _trackingServer = null;
            _reportSuiteIds = null;
            StaticMethods.logDebugFormat("Analytics - Not Configured.", new Object[0]);
        }
        try
        {
            _characterSet = ((JSONObject) (obj)).getString("charset");
        }
        catch (JSONException jsonexception7)
        {
            _characterSet = "UTF-8";
        }
        try
        {
            _ssl = ((JSONObject) (obj)).getBoolean("ssl");
        }
        catch (JSONException jsonexception8)
        {
            _ssl = false;
        }
        try
        {
            _offlineTrackingEnabled = ((JSONObject) (obj)).getBoolean("offlineEnabled");
        }
        catch (JSONException jsonexception9)
        {
            _offlineTrackingEnabled = false;
        }
        try
        {
            _lifecycleTimeout = ((JSONObject) (obj)).getInt("lifecycleTimeout");
        }
        catch (JSONException jsonexception10)
        {
            _lifecycleTimeout = 300;
        }
        try
        {
            _referrerTimeout = ((JSONObject) (obj)).getInt("referrerTimeout");
        }
        catch (JSONException jsonexception11)
        {
            _referrerTimeout = 0;
        }
        try
        {
            _batchLimit = ((JSONObject) (obj)).getInt("batchLimit");
        }
        catch (JSONException jsonexception12)
        {
            _batchLimit = 0;
        }
        if (!StaticMethods.getSharedPreferences().contains("PrivacyStatus")) goto _L6; else goto _L5
_L5:
        _privacyStatus = MobilePrivacyStatus.values()[StaticMethods.getSharedPreferences().getInt("PrivacyStatus", 0)];
_L10:
        try
        {
            loadPoiFromJsonArray(((JSONObject) (obj)).getJSONArray("poi"));
        }
        catch (JSONException jsonexception)
        {
            StaticMethods.logErrorFormat("Analytics - Malformed POI List(%s)", new Object[] {
                jsonexception.getLocalizedMessage()
            });
        }
_L4:
        obj = null;
        obj1 = jsonobject1.getJSONObject("target");
        obj = obj1;
_L12:
        if (obj != null)
        {
            StaticMethods.NullContextException nullcontextexception;
            Object obj2;
            JSONException jsonexception13;
            try
            {
                _clientCode = ((JSONObject) (obj)).getString("clientCode");
            }
            catch (JSONException jsonexception14)
            {
                _clientCode = null;
                StaticMethods.logDebugFormat("Target - Not Configured.", new Object[0]);
            }
            try
            {
                _defaultLocationTimeout = ((JSONObject) (obj)).getInt("timeout");
            }
            catch (JSONException jsonexception1)
            {
                _defaultLocationTimeout = 2;
            }
        }
        obj = null;
        obj1 = jsonobject1.getJSONObject("audienceManager");
        obj = obj1;
_L13:
        JSONException jsonexception15;
        if (obj != null)
        {
            try
            {
                _aamServer = ((JSONObject) (obj)).getString("server");
            }
            catch (JSONException jsonexception2)
            {
                _aamServer = null;
                StaticMethods.logDebugFormat("Audience Manager - Not Configured.", new Object[0]);
            }
        }
        obj = null;
        obj1 = jsonobject1.getJSONObject("remotes");
        obj = obj1;
_L14:
        if (obj != null)
        {
            JSONException jsonexception16;
            try
            {
                _messagesURL = ((JSONObject) (obj)).getString("messages");
            }
            catch (JSONException jsonexception17)
            {
                StaticMethods.logDebugFormat("Config - No in-app messages remote url loaded (%s)", new Object[] {
                    jsonexception17.getLocalizedMessage()
                });
            }
            try
            {
                _pointsOfInterestURL = ((JSONObject) (obj)).getString("analytics.poi");
            }
            catch (JSONException jsonexception3)
            {
                StaticMethods.logDebugFormat("Config - No points of interest remote url loaded (%s)", new Object[] {
                    jsonexception3.getLocalizedMessage()
                });
            }
        }
        if (StaticMethods.isWearableApp()) goto _L8; else goto _L7
_L7:
        obj = null;
        obj1 = jsonobject1.getJSONArray("messages");
        obj = obj1;
_L15:
        if (obj != null && ((JSONArray) (obj)).length() > 0)
        {
            loadMessagesFromJsonArray(((JSONArray) (obj)));
        }
_L8:
        obj = null;
        obj1 = jsonobject1.getJSONObject("marketingCloud");
        obj = obj1;
_L16:
        JSONException jsonexception18;
        if (obj != null)
        {
            try
            {
                _marketingCloudOrganizationId = ((JSONObject) (obj)).getString("org");
            }
            catch (JSONException jsonexception4)
            {
                _marketingCloudOrganizationId = null;
                StaticMethods.logDebugFormat("Visitor - ID Service Not Configured.", new Object[0]);
            }
        }
        if (!StaticMethods.isWearableApp())
        {
            loadCachedRemotes();
            return;
        }
          goto _L1
        jsonexception5;
        StaticMethods.logDebugFormat("Analytics - Not configured.", new Object[0]);
          goto _L9
_L6:
        try
        {
            obj2 = ((JSONObject) (obj)).getString("privacyDefault");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = null;
        }
        // Misplaced declaration of an exception variable
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logErrorFormat("Config - Error pulling privacy from shared preferences. (%s)", new Object[] {
                nullcontextexception.getMessage()
            });
            return;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        obj2 = privacyStatusFromString(((String) (obj2)));
_L11:
        _privacyStatus = ((MobilePrivacyStatus) (obj2));
          goto _L10
        obj2 = DEFAULT_PRIVACY_STATUS;
          goto _L11
        jsonexception13;
        StaticMethods.logDebugFormat("Target - Not Configured.", new Object[0]);
          goto _L12
        jsonexception15;
        StaticMethods.logDebugFormat("Audience Manager - Not Configured.", new Object[0]);
          goto _L13
        jsonexception16;
        StaticMethods.logDebugFormat("Remotes - Not Configured.", new Object[0]);
          goto _L14
        jsonexception18;
        StaticMethods.logDebugFormat("Messages - Not configured locally.", new Object[0]);
          goto _L15
        jsonexception18;
        StaticMethods.logDebugFormat("Marketing Cloud - Not configured locally.", new Object[0]);
          goto _L16
    }

    protected static MobileConfig getInstance()
    {
        MobileConfig mobileconfig;
        synchronized (_instanceMutex)
        {
            if (_instance == null)
            {
                _instance = new MobileConfig();
            }
            mobileconfig = _instance;
        }
        return mobileconfig;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private JSONObject loadBundleConfig()
    {
        obj1 = null;
        InputStream inputstream;
        synchronized (_userDefinedInputStreamMutex)
        {
            inputstream = _userDefinedInputStream;
        }
        obj = obj1;
        if (inputstream != null)
        {
            try
            {
                StaticMethods.logDebugFormat("Config - Attempting to load config file from override stream", new Object[0]);
                obj = loadConfigFromStream(_userDefinedInputStream);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logDebugFormat("Config - Error loading user defined config (%s)", new Object[] {
                    ((IOException) (obj)).getMessage()
                });
                obj = obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logDebugFormat("Config - Error parsing user defined config (%s)", new Object[] {
                    ((JSONException) (obj)).getMessage()
                });
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            if (inputstream != null)
            {
                StaticMethods.logDebugFormat("Config - Failed attempting to load custom config, will fall back to standard config location.", new Object[0]);
            }
            StaticMethods.logDebugFormat("Config - Attempting to load config file from default location", new Object[0]);
            try
            {
                obj1 = loadConfigFromStream(StaticMethods.getSharedContext().getResources().getAssets().open("ADBMobileConfig.json"));
            }
            catch (IOException ioexception)
            {
                StaticMethods.logErrorFormat("Config - Exception loading config file (%s)", new Object[] {
                    ioexception.getMessage()
                });
                return ((JSONObject) (obj));
            }
            catch (JSONException jsonexception)
            {
                StaticMethods.logErrorFormat("Config - Exception parsing config file (%s)", new Object[] {
                    jsonexception.getMessage()
                });
                return ((JSONObject) (obj));
            }
            catch (StaticMethods.NullContextException nullcontextexception)
            {
                StaticMethods.logErrorFormat("Config - Null context when attempting to read config file (%s)", new Object[] {
                    nullcontextexception.getMessage()
                });
                return ((JSONObject) (obj));
            }
        }
        return ((JSONObject) (obj1));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private JSONObject loadConfigFromStream(InputStream inputstream)
        throws JSONException, IOException
    {
        if (inputstream == null)
        {
            return null;
        }
        JSONObject jsonobject;
        byte abyte0[] = new byte[inputstream.available()];
        inputstream.read(abyte0);
        jsonobject = new JSONObject(new String(abyte0, "UTF-8"));
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            StaticMethods.logErrorFormat("Config - Unable to close stream (%s)", new Object[] {
                inputstream.getMessage()
            });
            return jsonobject;
        }
        return jsonobject;
        Object obj;
        obj;
        StaticMethods.logErrorFormat("Config - Exception when reading config (%s)", new Object[] {
            ((IOException) (obj)).getMessage()
        });
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            StaticMethods.logErrorFormat("Config - Unable to close stream (%s)", new Object[] {
                inputstream.getMessage()
            });
        }
_L2:
        return new JSONObject();
        obj;
        StaticMethods.logErrorFormat("Config - Stream closed when attempting to load config (%s)", new Object[] {
            ((NullPointerException) (obj)).getMessage()
        });
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            StaticMethods.logErrorFormat("Config - Unable to close stream (%s)", new Object[] {
                inputstream.getMessage()
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            StaticMethods.logErrorFormat("Config - Unable to close stream (%s)", new Object[] {
                inputstream.getMessage()
            });
        }
        throw obj;
    }

    private void loadMessageImages()
    {
        StaticMethods.getMessageImageCachingExecutor().execute(new Runnable() {

            final MobileConfig this$0;

            public void run()
            {
                if (_inAppMessages == null || _inAppMessages.size() <= 0)
                {
                    RemoteDownload.deleteFilesInDirectory("messageImages");
                    return;
                }
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator = _inAppMessages.iterator(); iterator.hasNext();)
                {
                    Object obj = (Message)iterator.next();
                    if (((Message) (obj)).assets != null && ((Message) (obj)).assets.size() > 0)
                    {
                        obj = ((Message) (obj)).assets.iterator();
                        while (((Iterator) (obj)).hasNext()) 
                        {
                            Object obj1 = (ArrayList)((Iterator) (obj)).next();
                            if (((ArrayList) (obj1)).size() > 0)
                            {
                                obj1 = ((ArrayList) (obj1)).iterator();
                                while (((Iterator) (obj1)).hasNext()) 
                                {
                                    String s = (String)((Iterator) (obj1)).next();
                                    arraylist.add(s);
                                    RemoteDownload.remoteDownloadSync(s, 10000, 10000, null, "messageImages");
                                }
                            }
                        }
                    }
                }

                if (arraylist.size() > 0)
                {
                    RemoteDownload.deleteFilesForDirectoryNotInList("messageImages", arraylist);
                    return;
                } else
                {
                    RemoteDownload.deleteFilesInDirectory("messageImages");
                    return;
                }
            }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
        });
    }

    private void loadMessagesDataFromRemote(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            StaticMethods.logDebugFormat("Messages - Remote messages config was null, falling back to bundled messages", new Object[0]);
            RemoteDownload.deleteFilesInDirectory("messageImages");
            return;
        }
        Object obj = null;
        try
        {
            jsonobject = jsonobject.getJSONArray("messages");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logDebugFormat("Messages - Remote messages not configured, falling back to bundled messages", new Object[0]);
            jsonobject = obj;
        }
        StaticMethods.logDebugFormat("Messages - Using remote definition for messages", new Object[0]);
        if (jsonobject == null || jsonobject.length() <= 0)
        {
            RemoteDownload.deleteFilesInDirectory("messageImages");
            _inAppMessages = null;
            return;
        } else
        {
            loadMessagesFromJsonArray(jsonobject);
            return;
        }
    }

    private void loadMessagesFromJsonArray(JSONArray jsonarray)
    {
        int j;
        _inAppMessages = new ArrayList();
        j = jsonarray.length();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Message message = Message.messageWithJsonObject(jsonarray.getJSONObject(i));
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        StaticMethods.logDebugFormat("Messages - loaded message - %s", new Object[] {
            message.description()
        });
        _inAppMessages.add(message);
        i++;
        if (true) goto _L2; else goto _L1
        jsonarray;
        StaticMethods.logErrorFormat("Messages - Unable to parse messages JSON (%s)", new Object[] {
            jsonarray.getMessage()
        });
_L1:
    }

    private void loadPoiFromJsonArray(JSONArray jsonarray)
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONArray jsonarray1;
        ArrayList arraylist;
        int i;
        int j;
        try
        {
            _pointsOfInterest = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            StaticMethods.logErrorFormat("Messages - Unable to parse remote points of interest JSON (%s)", new Object[] {
                jsonarray.getMessage()
            });
            return;
        }
        i = 0;
        j = jsonarray.length();
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonarray1 = jsonarray.getJSONArray(i);
        arraylist = new ArrayList(4);
        arraylist.add(jsonarray1.getString(0));
        arraylist.add(Double.valueOf(jsonarray1.getDouble(1)));
        arraylist.add(Double.valueOf(jsonarray1.getDouble(2)));
        arraylist.add(Double.valueOf(jsonarray1.getDouble(3)));
        _pointsOfInterest.add(arraylist);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    private MobilePrivacyStatus privacyStatusFromString(String s)
    {
        if (s != null)
        {
            if (s.equalsIgnoreCase("optedin"))
            {
                return MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN;
            }
            if (s.equalsIgnoreCase("optedout"))
            {
                return MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT;
            }
            if (s.equalsIgnoreCase("optunknown"))
            {
                return MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_UNKNOWN;
            }
        }
        return DEFAULT_PRIVACY_STATUS;
    }

    public static void setUserDefinedConfigPath(InputStream inputstream)
    {
        synchronized (_userDefinedInputStreamMutex)
        {
            if (_userDefinedInputStream == null)
            {
                _userDefinedInputStream = inputstream;
            }
        }
        return;
        inputstream;
        obj;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    protected void downloadRemoteConfigs()
    {
        StaticMethods.getMessagesExecutor().execute(new Runnable() {

            final MobileConfig this$0;

            public void run()
            {
                if (_messagesURL == null || _messagesURL.length() <= 0)
                {
                    loadMessageImages();
                    return;
                } else
                {
                    RemoteDownload.remoteDownloadSync(_messagesURL, new RemoteDownload.RemoteDownloadBlock() {

                        final _cls4 this$1;

                        public void call(boolean flag, File file)
                        {
                            updateMessagesData(file);
                            loadMessageImages();
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
        });
        if (_pointsOfInterestURL != null && _pointsOfInterestURL.length() > 0)
        {
            RemoteDownload.remoteDownloadAsync(_pointsOfInterestURL, new RemoteDownload.RemoteDownloadBlock() {

                final MobileConfig this$0;

                public void call(boolean flag, File file)
                {
                    StaticMethods.getAnalyticsExecutor().execute(file. new Runnable() {

                        final _cls5 this$1;
                        final File val$file;

                        public void run()
                        {
                            if (file != null)
                            {
                                StaticMethods.logDebugFormat("Config - Using remote definition for points of interest", new Object[0]);
                                updatePOIData(file);
                            }
                        }

            
            {
                this$1 = final__pcls5;
                file = File.this;
                super();
            }
                    });
                }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
            });
        }
    }

    protected String getAamServer()
    {
        return _aamServer;
    }

    protected int getBatchLimit()
    {
        return _batchLimit;
    }

    protected String getCharacterSet()
    {
        return _characterSet;
    }

    protected String getClientCode()
    {
        return _clientCode;
    }

    protected int getDefaultLocationTimeout()
    {
        return _defaultLocationTimeout;
    }

    protected String getInAppMessageURL()
    {
        return _messagesURL;
    }

    protected ArrayList getInAppMessages()
    {
        return _inAppMessages;
    }

    protected int getLifecycleTimeout()
    {
        return _lifecycleTimeout;
    }

    protected String getMarketingCloudOrganizationId()
    {
        return _marketingCloudOrganizationId;
    }

    protected boolean getOfflineTrackingEnabled()
    {
        return _offlineTrackingEnabled;
    }

    protected List getPointsOfInterest()
    {
        return _pointsOfInterest;
    }

    protected String getPointsOfInterestURL()
    {
        return _pointsOfInterestURL;
    }

    protected MobilePrivacyStatus getPrivacyStatus()
    {
        return _privacyStatus;
    }

    protected int getReferrerTimeout()
    {
        return _referrerTimeout;
    }

    protected String getReportSuiteIds()
    {
        return _reportSuiteIds;
    }

    protected boolean getSSL()
    {
        return _ssl;
    }

    protected String getTrackingServer()
    {
        return _trackingServer;
    }

    protected boolean getVisitorIdServiceEnabled()
    {
        return _marketingCloudOrganizationId != null && _marketingCloudOrganizationId.length() > 0;
    }

    protected void loadCachedRemotes()
    {
        if (_messagesURL != null && _messagesURL.length() > 0)
        {
            updateMessagesData(RemoteDownload.getFileForCachedURL(_messagesURL));
        }
        if (_pointsOfInterestURL != null && _pointsOfInterestURL.length() > 0)
        {
            updatePOIData(RemoteDownload.getFileForCachedURL(_pointsOfInterestURL));
        }
    }

    protected boolean mobileUsingAnalytics()
    {
        boolean flag1 = false;
        Object obj = _usingAnalyticsMutex;
        obj;
        JVM INSTR monitorenter ;
        if (_usingAnalytics != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        boolean flag = flag1;
        if (getReportSuiteIds() == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag1;
        if (getReportSuiteIds().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag1;
        if (getTrackingServer() == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag1;
        if (getTrackingServer().length() > 0)
        {
            flag = true;
        }
        _usingAnalytics = Boolean.valueOf(flag);
        if (!_usingAnalytics.booleanValue())
        {
            StaticMethods.logDebugFormat("Analytics - Your config file is not set up to use Analytics(missing report suite id(s) or tracking server information)", new Object[0]);
        }
        flag = _usingAnalytics.booleanValue();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean mobileUsingAudienceManager()
    {
        boolean flag1;
        flag1 = false;
        if (StaticMethods.isWearableApp())
        {
            return false;
        }
        Object obj = _usingAudienceManagerMutex;
        obj;
        JVM INSTR monitorenter ;
        if (_usingAudienceManager != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        boolean flag = flag1;
        if (getAamServer() == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        flag = flag1;
        if (getAamServer().length() > 0)
        {
            flag = true;
        }
        _usingAudienceManager = Boolean.valueOf(flag);
        if (!_usingAudienceManager.booleanValue())
        {
            StaticMethods.logDebugFormat("Audience Manager - Your config file is not set up to use Audience Manager(missing audience manager server information)", new Object[0]);
        }
        flag = _usingAudienceManager.booleanValue();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean mobileUsingGooglePlayServices()
    {
        boolean flag;
        synchronized (_usingGooglePlayServicesMutex)
        {
            if (_usingGooglePlayServices == null)
            {
                _usingGooglePlayServices = Boolean.valueOf(WearableFunctionBridge.isGooglePlayServicesEnabled());
            }
            flag = _usingGooglePlayServices.booleanValue();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean mobileUsingTarget()
    {
        boolean flag1;
        flag1 = false;
        if (StaticMethods.isWearableApp())
        {
            return false;
        }
        Object obj = _usingTargetMutex;
        obj;
        JVM INSTR monitorenter ;
        if (_usingTarget != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        boolean flag = flag1;
        if (getClientCode() == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        flag = flag1;
        if (getClientCode().length() > 0)
        {
            flag = true;
        }
        _usingTarget = Boolean.valueOf(flag);
        if (!_usingTarget.booleanValue())
        {
            StaticMethods.logDebugFormat("TargetWorker - Your config file is not set up to use Target(missing client code information)", new Object[0]);
        }
        flag = _usingTarget.booleanValue();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void setPrivacyStatus(MobilePrivacyStatus mobileprivacystatus)
    {
        if (mobileprivacystatus == null)
        {
            return;
        }
        if (mobileprivacystatus == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_UNKNOWN && !_offlineTrackingEnabled)
        {
            StaticMethods.logWarningFormat("Analytics - Cannot set privacy status to unknown when offline tracking is disabled", new Object[0]);
            return;
        }
        if (mobileprivacystatus == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN)
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                final MobileConfig this$0;

                public void run()
                {
                    StaticMethods.logDebugFormat("Analytics - Privacy status set to opt in, attempting to send all hits in queue.", new Object[0]);
                    AnalyticsWorker.sharedInstance().kick(false);
                }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
            });
        }
        if (mobileprivacystatus == MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT)
        {
            StaticMethods.getAnalyticsExecutor().execute(new Runnable() {

                final MobileConfig this$0;

                public void run()
                {
                    StaticMethods.logDebugFormat("Analytics - Privacy status set to opt out, attempting to clear queue of all hits.", new Object[0]);
                    AnalyticsWorker.sharedInstance().clearTrackingQueue();
                }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
            });
            StaticMethods.getAudienceExecutor().execute(new Runnable() {

                final MobileConfig this$0;

                public void run()
                {
                    StaticMethods.logDebugFormat("Audience Manager - Privacy status set to opt out, clearing Audience Manager information.", new Object[0]);
                    AudienceManagerWorker.Reset();
                }

            
            {
                this$0 = MobileConfig.this;
                super();
            }
            });
        }
        _privacyStatus = mobileprivacystatus;
        WearableFunctionBridge.syncPrivacyStatusToWearable(mobileprivacystatus.getValue());
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            editor.putInt("PrivacyStatus", mobileprivacystatus.getValue());
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MobilePrivacyStatus mobileprivacystatus)
        {
            StaticMethods.logErrorFormat("Config - Error persisting privacy status (%s).", new Object[] {
                mobileprivacystatus.getMessage()
            });
        }
    }

    protected void updateMessagesData(File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        if (file != null) goto _L2; else goto _L1
_L1:
        if (true)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new NullPointerException();
_L3:
        return;
        file;
        StaticMethods.logErrorFormat("Messages - Unable to close file stream (%s)", new Object[] {
            file.getLocalizedMessage()
        });
        return;
_L2:
        file = new FileInputStream(file);
        loadMessagesDataFromRemote(loadConfigFromStream(file));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        file.close();
        return;
        file;
        StaticMethods.logErrorFormat("Messages - Unable to close file stream (%s)", new Object[] {
            file.getLocalizedMessage()
        });
        return;
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L8:
        obj = file;
        StaticMethods.logErrorFormat("Messages - Unable to read messages remote config file, falling back to bundled messages (%s)", new Object[] {
            ((JSONException) (obj1)).getLocalizedMessage()
        });
        if (file != null)
        {
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                StaticMethods.logErrorFormat("Messages - Unable to close file stream (%s)", new Object[] {
                    file.getLocalizedMessage()
                });
            }
            return;
        }
          goto _L3
        IOException ioexception;
        ioexception;
        file = obj2;
_L7:
        obj = file;
        StaticMethods.logWarningFormat("Messages - Unable to open messages config file, falling back to bundled messages (%s)", new Object[] {
            ioexception.getLocalizedMessage()
        });
        if (file == null) goto _L3; else goto _L4
_L4:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            StaticMethods.logErrorFormat("Messages - Unable to close file stream (%s)", new Object[] {
                file.getLocalizedMessage()
            });
        }
        return;
        file;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logErrorFormat("Messages - Unable to close file stream (%s)", new Object[] {
                    ((IOException) (obj)).getLocalizedMessage()
                });
            }
        }
        throw file;
        ioexception;
        obj = file;
        file = ioexception;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
        ioexception;
          goto _L8
    }

    protected void updatePOIData(File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        if (file != null) goto _L2; else goto _L1
_L1:
        if (true)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new NullPointerException();
_L3:
        return;
        file;
        StaticMethods.logErrorFormat("Config - Unable to close file stream (%s)", new Object[] {
            file.getLocalizedMessage()
        });
        return;
_L2:
        file = new FileInputStream(file);
        obj = loadConfigFromStream(file);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        loadPoiFromJsonArray(((JSONObject) (obj)).getJSONObject("analytics").getJSONArray("poi"));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        file.close();
        return;
        file;
        StaticMethods.logErrorFormat("Config - Unable to close file stream (%s)", new Object[] {
            file.getLocalizedMessage()
        });
        return;
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L8:
        obj = file;
        StaticMethods.logErrorFormat("Config - Unable to read points of interest remote config file, falling back to bundled poi (%s)", new Object[] {
            ((JSONException) (obj1)).getLocalizedMessage()
        });
        if (file != null)
        {
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                StaticMethods.logErrorFormat("Config - Unable to close file stream (%s)", new Object[] {
                    file.getLocalizedMessage()
                });
            }
            return;
        }
          goto _L3
        IOException ioexception;
        ioexception;
        file = obj2;
_L7:
        obj = file;
        StaticMethods.logWarningFormat("Config - Unable to open points of interest config file, falling back to bundled poi (%s)", new Object[] {
            ioexception.getLocalizedMessage()
        });
        if (file == null) goto _L3; else goto _L4
_L4:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            StaticMethods.logErrorFormat("Config - Unable to close file stream (%s)", new Object[] {
                file.getLocalizedMessage()
            });
        }
        return;
        file;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                StaticMethods.logErrorFormat("Config - Unable to close file stream (%s)", new Object[] {
                    ((IOException) (obj)).getLocalizedMessage()
                });
            }
        }
        throw file;
        ioexception;
        obj = file;
        file = ioexception;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
        ioexception;
          goto _L8
    }

    static 
    {
        DEFAULT_PRIVACY_STATUS = MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_IN;
    }



}
