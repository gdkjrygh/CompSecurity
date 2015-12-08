// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import android.webkit.URLUtil;
import com.weather.util.config.ConfigException;
import com.weather.util.config.DsxServerUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class DalConfig
{
    public static class AwsConfig
    {

        private final String endPoint;
        private final String path;
        private final String region;
        private final String requestMethod;
        private final String service;
        private final String user;

        public String getEndpoint()
        {
            return endPoint;
        }

        public String getMethod()
        {
            return requestMethod;
        }

        public String getPath()
        {
            return path;
        }

        public String getRegion()
        {
            return region;
        }

        public String getService()
        {
            return service;
        }

        public String getUser()
        {
            return user;
        }

        public boolean hasNullData()
        {
            return requestMethod == null || region == null || endPoint == null || path == null || service == null || user == null;
        }

        AwsConfig()
        {
            requestMethod = null;
            endPoint = null;
            path = null;
            region = null;
            service = null;
            user = null;
        }

        AwsConfig(JSONObject jsonobject)
            throws JSONException
        {
            requestMethod = jsonobject.getString("requestMethod");
            endPoint = jsonobject.getString("endPoint");
            path = jsonobject.getString("path");
            region = jsonobject.getString("region");
            service = jsonobject.getString("service");
            user = jsonobject.getString("user");
        }
    }

    public static class EventLogGroup
    {

        private final boolean isEnabled;

        public boolean isEnabled()
        {
            return isEnabled;
        }

        EventLogGroup()
        {
            isEnabled = false;
        }

        EventLogGroup(JSONObject jsonobject)
        {
            isEnabled = jsonobject.optBoolean("enabled", false);
        }
    }


    private static final String AWS_ENDPOINT = "endPoint";
    private static final String AWS_ERRORS = "awsErrors";
    private static final String AWS_LOCATION_UPDATE = "locationUpdate";
    private static final String AWS_PATH = "path";
    private static final String AWS_REGION = "region";
    private static final String AWS_REQUEST_METHOD = "requestMethod";
    private static final String AWS_SERVICE = "service";
    private static final String AWS_TIME_STAMP = "awsTimeStamp";
    private static final String AWS_USER = "user";
    private static final String AWS_WARNINGS = "awsWarnings";
    private static final String BRANDED_BACKGROUND_SERVER = "http://{DSX_SERVER}.weather.com/util/image/a/%1$s?v=%2$s&w=%3$s&h=%4$s&creativeId=%5$s";
    private static final String BRANDED_BACKGROUND_URL = "brandedBackgroundUrl";
    private static final String DSX_DATA_SERVER = "http://{DSX_SERVER}.weather.com";
    private static final String DSX_DATA_URL = "dsxDataUrl";
    private static final String DSX_SECURE_SERVER = "http://{DSX_SERVER_SECURE}.weather.com";
    private static final String DSX_SECURE_URL = "dsxSecureUrl";
    private static final String ENABLED = "enabled";
    private static final String ERROR_LOGS = "errorLogs";
    private static final String EVENT_LOGS = "eventLogs";
    private static final String FOLLOW_ME_TRACKING = "followMeTracking";
    private static final String GEOCODE_REQUESTS = "geocodeRequests";
    private static final String TAG_FILTER = "tagFilter";
    private static final String VERSION = "version";
    private static final String VERSION_1_0 = "1.0";
    private static final String WARNING_LOGS = "warningLogs";
    private final AwsConfig awsErrors;
    private final AwsConfig awsLocationUpdate;
    private final AwsConfig awsTimeStamp;
    private final AwsConfig awsWarnings;
    private final String brandedBackgroundUrl;
    private final String dsxDataServerUrl;
    private final String dsxSecureServerUrl;
    private final EventLogGroup errorLogs;
    private final EventLogGroup followMeTracking;
    private final EventLogGroup geocodeRequest;
    private final boolean isEventLoggingEnabled;
    private final String tagFilter;
    private final EventLogGroup warningLogs;

    public DalConfig()
    {
        dsxDataServerUrl = DsxServerUtil.appendDsxServer("http://{DSX_SERVER}.weather.com");
        dsxSecureServerUrl = DsxServerUtil.appendDsxServer("http://{DSX_SERVER_SECURE}.weather.com");
        brandedBackgroundUrl = DsxServerUtil.appendDsxServer("http://{DSX_SERVER}.weather.com/util/image/a/%1$s?v=%2$s&w=%3$s&h=%4$s&creativeId=%5$s");
        tagFilter = ".*";
        isEventLoggingEnabled = false;
        geocodeRequest = new EventLogGroup();
        followMeTracking = new EventLogGroup();
        warningLogs = new EventLogGroup();
        errorLogs = new EventLogGroup();
        awsLocationUpdate = new AwsConfig();
        awsWarnings = new AwsConfig();
        awsErrors = new AwsConfig();
        awsTimeStamp = new AwsConfig();
    }

    public DalConfig(String s)
        throws JSONException, ConfigException
    {
        s = new JSONObject(s);
        String s1 = s.getString("version");
        if (s1.equals("1.0"))
        {
            dsxDataServerUrl = getUrl(s, "dsxDataUrl", "http://{DSX_SERVER}.weather.com");
            dsxSecureServerUrl = getUrl(s, "dsxSecureUrl", "http://{DSX_SERVER_SECURE}.weather.com");
            brandedBackgroundUrl = getUrl(s, "brandedBackgroundUrl", "http://{DSX_SERVER}.weather.com/util/image/a/%1$s?v=%2$s&w=%3$s&h=%4$s&creativeId=%5$s");
            s = s.getJSONObject("eventLogs");
            tagFilter = s.optString("tagFilter", ".*");
            isEventLoggingEnabled = s.optBoolean("enabled");
            geocodeRequest = new EventLogGroup(s.getJSONObject("geocodeRequests"));
            followMeTracking = new EventLogGroup(s.getJSONObject("followMeTracking"));
            warningLogs = new EventLogGroup(s.getJSONObject("warningLogs"));
            errorLogs = new EventLogGroup(s.getJSONObject("errorLogs"));
            awsLocationUpdate = new AwsConfig(s.getJSONObject("locationUpdate"));
            awsWarnings = new AwsConfig(s.getJSONObject("awsWarnings"));
            awsErrors = new AwsConfig(s.getJSONObject("awsErrors"));
            awsTimeStamp = new AwsConfig(s.getJSONObject("awsTimeStamp"));
            return;
        } else
        {
            throw new ConfigException((new StringBuilder()).append("Invalid version: ").append(s1).toString());
        }
    }

    private String getUrl(JSONObject jsonobject, String s, String s1)
    {
        jsonobject = jsonobject.optString(s);
        if (!URLUtil.isValidUrl(jsonobject))
        {
            jsonobject = s1;
        }
        return DsxServerUtil.appendDsxServer(jsonobject);
    }

    public AwsConfig getAwsErrorsConfig()
    {
        return awsErrors;
    }

    public AwsConfig getAwsLocationUpdateConfig()
    {
        return awsLocationUpdate;
    }

    public AwsConfig getAwsTimesStampConfig()
    {
        return awsTimeStamp;
    }

    public AwsConfig getAwsWarningsConfig()
    {
        return awsWarnings;
    }

    public String getBrandedBackgroundUrl()
    {
        return brandedBackgroundUrl;
    }

    public String getDsxDataUrl()
    {
        return dsxDataServerUrl;
    }

    public String getDsxSecureUrl()
    {
        return dsxSecureServerUrl;
    }

    public EventLogGroup getErrorLogs()
    {
        return errorLogs;
    }

    public EventLogGroup getFollowMeTracking()
    {
        return followMeTracking;
    }

    public EventLogGroup getGeocodeRequest()
    {
        return geocodeRequest;
    }

    public String getTagFilter()
    {
        return tagFilter;
    }

    public EventLogGroup getWarningLogs()
    {
        return warningLogs;
    }

    public boolean isEventLoggingEnabled()
    {
        return isEventLoggingEnabled;
    }
}
