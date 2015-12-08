// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


final class Constants
{

    protected static final String AID_IGNORE_KEY = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID";
    protected static final String AID_KEY = "ADOBEMOBILE_STOREDDEFAULTS_AID";
    protected static final String AID_SYNCED_KEY = "ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED";
    protected static final String CAMPAIGN_REFERRER_CAMPAIGN = "a.referrer.campaign.name";
    protected static final String CAMPAIGN_REFERRER_CONTENT = "a.referrer.campaign.content";
    protected static final String CAMPAIGN_REFERRER_MEDIUM = "a.referrer.campaign.medium";
    protected static final String CAMPAIGN_REFERRER_SOURCE = "a.referrer.campaign.source";
    protected static final String CAMPAIGN_REFERRER_TERM = "a.referrer.campaign.term";
    protected static final String CAMPAIGN_REFERRER_TRACKINGCODE = "a.referrer.campaign.trackingcode";
    protected static final String DATAPATH_CONFIG_PREFIX = "/abdmobile/data/config/";
    protected static final String DATAPATH_CONFIG_PRIVACY_STATUS = "/abdmobile/data/config/privacyStatus";
    protected static final String DATAPATH_CONFIG_VISITOR_ID = "/abdmobile/data/config/visitorId";
    protected static final String DATAPATH_CONFIG_VISTIOR_ID_SERVICE = "/abdmobile/data/config/vidService";
    protected static final String DATA_DAYOFWEEK = "a.DayOfWeek";
    protected static final String DATA_DAYSFIRSTLAUNCH = "a.DaysSinceFirstUse";
    protected static final String DATA_DAYSLASTLAUNCH = "a.DaysSinceLastUse";
    protected static final String DATA_DAYSUPGRADE = "a.DaysSinceLastUpgrade";
    protected static final String DATA_DROPPEDSESSIONLENGTH = "a.ignoredSessionLength";
    protected static final String DATA_HOUROFDAY = "a.HourOfDay";
    protected static final String DATA_INSTALLDATE = "a.InstallDate";
    protected static final String DATA_LAUNCHES = "a.Launches";
    protected static final String DATA_LAUNCHESUPGRADE = "a.LaunchesSinceUpgrade";
    protected static final String DATA_LOCALE = "a.locale";
    protected static final String DATA_OPERATINGSYSTEM = "a.OSVersion";
    protected static final String DATA_PREVSESSIONLENGTH = "a.PrevSessionLength";
    protected static final String DEFAULTS_KEY_BLOB = "ADBMOBILE_PERSISTED_MID_BLOB";
    protected static final String DEFAULTS_KEY_HANDHELD_APP_INSTALLDATE = "ADMS_Handheld_App_InstallDate";
    protected static final String DEFAULTS_KEY_HINT = "ADBMOBILE_PERSISTED_MID_HINT";
    protected static final String DEFAULTS_KEY_INSTALLDATE = "ADMS_InstallDate";
    protected static final String DEFAULTS_KEY_LASTUSEDDATE = "ADMS_LastDateUsed";
    protected static final String DEFAULTS_KEY_LASTVERSION = "ADMS_LastVersion";
    protected static final String DEFAULTS_KEY_LAUNCHES = "ADMS_Launches";
    protected static final String DEFAULTS_KEY_LAUNCHESAFTERUPGRADE = "ADMS_LaunchesAfterUpgrade";
    protected static final String DEFAULTS_KEY_LIFECYCLE_DATA = "ADMS_LifecycleData";
    protected static final String DEFAULTS_KEY_MID = "ADBMOBILE_PERSISTED_MID";
    protected static final String DEFAULTS_KEY_PAUSEDATE = "ADMS_PauseDate";
    protected static final String DEFAULTS_KEY_REFERRER_TRACKINGCODE = "trackingcode";
    protected static final String DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN = "utm_campaign";
    protected static final String DEFAULTS_KEY_REFERRER_UTM_CONTENT = "utm_content";
    protected static final String DEFAULTS_KEY_REFERRER_UTM_MEDIUM = "utm_medium";
    protected static final String DEFAULTS_KEY_REFERRER_UTM_SOURCE = "utm_source";
    protected static final String DEFAULTS_KEY_REFERRER_UTM_TERM = "utm_term";
    protected static final String DEFAULTS_KEY_STARTDATE = "ADMS_SessionStart";
    protected static final String DEFAULTS_KEY_SUCCESFULCLOSE = "ADMS_SuccessfulClose";
    protected static final String DEFAULTS_KEY_SYNC = "ADBMOBILE_VISITORID_SYNC";
    protected static final String DEFAULTS_KEY_TTL = "ADBMOBILE_VISITORID_TTL";
    protected static final String DEFAULTS_KEY_UPGRADEDATE = "ADMS_UpgradeDate";
    protected static final String DEFAULT_CACHE_DIR = "adbdownloadcache";
    protected static final String DYNAMIC_KEY_REFERRER_TRACKINGCODE = "D=trackingcode";
    protected static final String DYNAMIC_KEY_REFERRER_UTM_CAMPAIGN = "D=utm_campaign";
    protected static final String DYNAMIC_KEY_REFERRER_UTM_CONTENT = "D=utm_content";
    protected static final String DYNAMIC_KEY_REFERRER_UTM_MEDIUM = "D=utm_medium";
    protected static final String DYNAMIC_KEY_REFERRER_UTM_SOURCE = "D=utm_source";
    protected static final String DYNAMIC_KEY_REFERRER_UTM_TERM = "D=utm_term";
    protected static final String EVENT_CRASH = "a.CrashEvent";
    protected static final String EVENT_DAILYENGAGED = "a.DailyEngUserEvent";
    protected static final String EVENT_INSTALL = "a.InstallEvent";
    protected static final String EVENT_LAUNCH = "a.LaunchEvent";
    protected static final String EVENT_MONTHLYENGAGED = "a.MonthlyEngUserEvent";
    protected static final String EVENT_UPGRADE = "a.UpgradeEvent";
    protected static final int GOOGLE_SERVICE_CONNECTION_TIMEOUT = 15000;
    protected static final int GOOGLE_SERVICE_REQUEST_TIMEOUT = 15000;
    protected static final String HTTP_REQUEST_BODY = "Body";
    protected static final String HTTP_REQUEST_FILENAME = "FileName";
    protected static final String HTTP_REQUEST_ID = "ID";
    protected static final String HTTP_REQUEST_PATH = "/abdmobile/data/request";
    protected static final String HTTP_REQUEST_TYPE = "Type";
    protected static final String HTTP_REQUEST_TYPE_CONFIG = "Config";
    protected static final String HTTP_REQUEST_TYPE_FILE = "File";
    protected static final String HTTP_REQUEST_TYPE_GET = "GET";
    protected static final String HTTP_REQUEST_TYPE_POST = "POST";
    protected static final String HTTP_REQUEST_URL = "URL";
    protected static final String HTTP_RESPONSE_FILECONTENT = "FileContent";
    protected static final String HTTP_RESPONSE_FILE_FOUND = "FileFound";
    protected static final String HTTP_RESPONSE_PATH = "/abdmobile/data/response";
    protected static final String HTTP_RESPONSE_RESULT = "Result";
    protected static final String HTTP_RESPONSE_UPDATED = "Updated";
    protected static final String LOCAL_STORAGE_PRIVACY_STATUS_KEY = "PrivacyStatus";
    protected static final int MAX_SESSION_LENGTH = 0x93a80;
    protected static final int SECONDS_IN_DAY = 0x15180;
    protected static final int SECONDS_IN_HOUR = 3600;
    protected static final String SHARED_PREFERENCES_KEY = "APP_MEASUREMENT_CACHE";
    protected static final String VISITOR_ID_KEY = "APP_MEASUREMENT_VISITOR_ID";

    Constants()
    {
    }
}
