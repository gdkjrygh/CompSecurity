.class final Lcom/adobe/mobile/MobileConfig;
.super Ljava/lang/Object;
.source "MobileConfig.java"


# static fields
.field private static final CONFIG_FILE_NAME:Ljava/lang/String; = "ADBMobileConfig.json"

.field private static final CONFIG_PRIVACY_OPTED_IN:Ljava/lang/String; = "optedin"

.field private static final CONFIG_PRIVACY_OPTED_OUT:Ljava/lang/String; = "optedout"

.field private static final CONFIG_PRIVACY_UNKNOWN:Ljava/lang/String; = "optunknown"

.field private static final DEFAULT_BATCH_LIMIT:I = 0x0

.field private static final DEFAULT_CHARSET:Ljava/lang/String; = "UTF-8"

.field private static final DEFAULT_LIFECYCLE_TIMEOUT:I = 0x12c

.field private static final DEFAULT_LOCATION_TIMEOUT:I = 0x2

.field private static final DEFAULT_OFFLINE_TRACKING:Z = false

.field private static final DEFAULT_PRIVACY_STATUS:Lcom/adobe/mobile/MobilePrivacyStatus;

.field private static final DEFAULT_REFERRER_TIMEOUT:I = 0x0

.field private static final DEFAULT_SSL:Z = false

.field private static final JSON_CONFIG_AAM_KEY:Ljava/lang/String; = "audienceManager"

.field private static final JSON_CONFIG_ANALYTICS_KEY:Ljava/lang/String; = "analytics"

.field private static final JSON_CONFIG_BATCH_LIMIT_KEY:Ljava/lang/String; = "batchLimit"

.field private static final JSON_CONFIG_CHAR_SET_KEY:Ljava/lang/String; = "charset"

.field private static final JSON_CONFIG_CLIENT_CODE_KEY:Ljava/lang/String; = "clientCode"

.field private static final JSON_CONFIG_LIFECYCLE_TIMEOUT_KEY:Ljava/lang/String; = "lifecycleTimeout"

.field private static final JSON_CONFIG_MARKETINGCLOUD_KEY:Ljava/lang/String; = "marketingCloud"

.field private static final JSON_CONFIG_MESSAGES_KEY:Ljava/lang/String; = "messages"

.field private static final JSON_CONFIG_MESSAGES_URL_KEY:Ljava/lang/String; = "messages"

.field private static final JSON_CONFIG_OFFLINE_TRACKING_KEY:Ljava/lang/String; = "offlineEnabled"

.field private static final JSON_CONFIG_ORGID_KEY:Ljava/lang/String; = "org"

.field private static final JSON_CONFIG_POINTS_OF_INTEREST_KEY:Ljava/lang/String; = "poi"

.field private static final JSON_CONFIG_POI_REMOTES_KEY:Ljava/lang/String; = "analytics.poi"

.field private static final JSON_CONFIG_PRIVACY_DEFAULT_KEY:Ljava/lang/String; = "privacyDefault"

.field private static final JSON_CONFIG_REFERRER_TIMEOUT_KEY:Ljava/lang/String; = "referrerTimeout"

.field private static final JSON_CONFIG_REMOTES_KEY:Ljava/lang/String; = "remotes"

.field private static final JSON_CONFIG_REPORT_SUITES_KEY:Ljava/lang/String; = "rsids"

.field private static final JSON_CONFIG_SERVER_KEY:Ljava/lang/String; = "server"

.field private static final JSON_CONFIG_SSL_KEY:Ljava/lang/String; = "ssl"

.field private static final JSON_CONFIG_TARGET_KEY:Ljava/lang/String; = "target"

.field private static final JSON_CONFIG_TIMEOUT_KEY:Ljava/lang/String; = "timeout"

.field private static _instance:Lcom/adobe/mobile/MobileConfig;

.field private static final _instanceMutex:Ljava/lang/Object;

.field private static _userDefinedInputStream:Ljava/io/InputStream;

.field private static final _userDefinedInputStreamMutex:Ljava/lang/Object;

.field private static final _usingAnalyticsMutex:Ljava/lang/Object;

.field private static final _usingAudienceManagerMutex:Ljava/lang/Object;

.field private static final _usingGooglePlayServicesMutex:Ljava/lang/Object;

.field private static final _usingTargetMutex:Ljava/lang/Object;


# instance fields
.field private _aamServer:Ljava/lang/String;

.field private _batchLimit:I

.field private _characterSet:Ljava/lang/String;

.field private _clientCode:Ljava/lang/String;

.field private _defaultLocationTimeout:I

.field private _inAppMessages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/adobe/mobile/Message;",
            ">;"
        }
    .end annotation
.end field

.field private _lifecycleTimeout:I

.field private _marketingCloudOrganizationId:Ljava/lang/String;

.field private _messagesURL:Ljava/lang/String;

.field private _offlineTrackingEnabled:Z

.field private _pointsOfInterest:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private _pointsOfInterestURL:Ljava/lang/String;

.field private _privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;

.field private _referrerTimeout:I

.field private _reportSuiteIds:Ljava/lang/String;

.field private _ssl:Z

.field private _trackingServer:Ljava/lang/String;

.field private _usingAnalytics:Ljava/lang/Boolean;

.field private _usingAudienceManager:Ljava/lang/Boolean;

.field private _usingGooglePlayServices:Ljava/lang/Boolean;

.field private _usingTarget:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 78
    sget-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->DEFAULT_PRIVACY_STATUS:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 121
    sput-object v1, Lcom/adobe/mobile/MobileConfig;->_instance:Lcom/adobe/mobile/MobileConfig;

    .line 122
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_instanceMutex:Ljava/lang/Object;

    .line 331
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_usingAnalyticsMutex:Ljava/lang/Object;

    .line 350
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServicesMutex:Ljava/lang/Object;

    .line 361
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManagerMutex:Ljava/lang/Object;

    .line 382
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_usingTargetMutex:Ljava/lang/Object;

    .line 733
    sput-object v1, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStream:Ljava/io/InputStream;

    .line 734
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStreamMutex:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 15

    .prologue
    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_reportSuiteIds:Ljava/lang/String;

    .line 85
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_trackingServer:Ljava/lang/String;

    .line 86
    const-string v11, "UTF-8"

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_characterSet:Ljava/lang/String;

    .line 87
    const/4 v11, 0x0

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_ssl:Z

    .line 88
    const/4 v11, 0x0

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_offlineTrackingEnabled:Z

    .line 89
    const/16 v11, 0x12c

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_lifecycleTimeout:I

    .line 90
    const/4 v11, 0x0

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_referrerTimeout:I

    .line 91
    const/4 v11, 0x0

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_batchLimit:I

    .line 92
    sget-object v11, Lcom/adobe/mobile/MobileConfig;->DEFAULT_PRIVACY_STATUS:Lcom/adobe/mobile/MobilePrivacyStatus;

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 93
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterest:Ljava/util/List;

    .line 94
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    .line 99
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_clientCode:Ljava/lang/String;

    .line 100
    const/4 v11, 0x2

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_defaultLocationTimeout:I

    .line 105
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_aamServer:Ljava/lang/String;

    .line 110
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    .line 111
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    .line 116
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;

    .line 330
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_usingAnalytics:Ljava/lang/Boolean;

    .line 349
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServices:Ljava/lang/Boolean;

    .line 360
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManager:Ljava/lang/Boolean;

    .line 381
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_usingTarget:Ljava/lang/Boolean;

    .line 139
    invoke-direct {p0}, Lcom/adobe/mobile/MobileConfig;->loadBundleConfig()Lorg/json/JSONObject;

    move-result-object v2

    .line 142
    .local v2, "configSettings":Lorg/json/JSONObject;
    if-nez v2, :cond_1

    .line 328
    :cond_0
    :goto_0
    return-void

    .line 146
    :cond_1
    const/4 v1, 0x0

    .line 148
    .local v1, "analyticsSettings":Lorg/json/JSONObject;
    :try_start_0
    const-string v11, "analytics"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 154
    :goto_1
    if-eqz v1, :cond_2

    .line 156
    :try_start_1
    const-string v11, "server"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_trackingServer:Ljava/lang/String;

    .line 157
    const-string v11, "rsids"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_reportSuiteIds:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 165
    :goto_2
    :try_start_2
    const-string v11, "charset"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_characterSet:Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 171
    :goto_3
    :try_start_3
    const-string v11, "ssl"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_ssl:Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 177
    :goto_4
    :try_start_4
    const-string v11, "offlineEnabled"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_offlineTrackingEnabled:Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 183
    :goto_5
    :try_start_5
    const-string v11, "lifecycleTimeout"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_lifecycleTimeout:I
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 189
    :goto_6
    :try_start_6
    const-string v11, "referrerTimeout"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_referrerTimeout:I
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6

    .line 195
    :goto_7
    :try_start_7
    const-string v11, "batchLimit"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_batchLimit:I
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    .line 202
    :goto_8
    :try_start_8
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v11

    const-string v12, "PrivacyStatus"

    invoke-interface {v11, v12}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 203
    invoke-static {}, Lcom/adobe/mobile/MobilePrivacyStatus;->values()[Lcom/adobe/mobile/MobilePrivacyStatus;

    move-result-object v11

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v12

    const-string v13, "PrivacyStatus"

    const/4 v14, 0x0

    invoke-interface {v12, v13, v14}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v12

    aget-object v11, v11, v12

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;
    :try_end_8
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_8 .. :try_end_8} :catch_8

    .line 222
    :goto_9
    :try_start_9
    const-string v11, "poi"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 223
    .local v7, "poiArray":Lorg/json/JSONArray;
    invoke-direct {p0, v7}, Lcom/adobe/mobile/MobileConfig;->loadPoiFromJsonArray(Lorg/json/JSONArray;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_a

    .line 231
    .end local v7    # "poiArray":Lorg/json/JSONArray;
    :cond_2
    :goto_a
    const/4 v10, 0x0

    .line 233
    .local v10, "targetSettings":Lorg/json/JSONObject;
    :try_start_a
    const-string v11, "target"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_b

    move-result-object v10

    .line 238
    :goto_b
    if-eqz v10, :cond_3

    .line 240
    :try_start_b
    const-string v11, "clientCode"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_clientCode:Ljava/lang/String;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_c

    .line 247
    :goto_c
    :try_start_c
    const-string v11, "timeout"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_defaultLocationTimeout:I
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_d

    .line 254
    :cond_3
    :goto_d
    const/4 v0, 0x0

    .line 257
    .local v0, "aamSettings":Lorg/json/JSONObject;
    :try_start_d
    const-string v11, "audienceManager"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_e

    move-result-object v0

    .line 262
    :goto_e
    if-eqz v0, :cond_4

    .line 264
    :try_start_e
    const-string v11, "server"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_aamServer:Ljava/lang/String;
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_f

    .line 272
    :cond_4
    :goto_f
    const/4 v9, 0x0

    .line 274
    .local v9, "remoteURLs":Lorg/json/JSONObject;
    :try_start_f
    const-string v11, "remotes"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_10

    move-result-object v9

    .line 280
    :goto_10
    if-eqz v9, :cond_5

    .line 282
    :try_start_10
    const-string v11, "messages"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_11

    .line 288
    :goto_11
    :try_start_11
    const-string v11, "analytics.poi"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_12

    .line 295
    :cond_5
    :goto_12
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v11

    if-nez v11, :cond_6

    .line 296
    const/4 v5, 0x0

    .line 298
    .local v5, "jsonMessages":Lorg/json/JSONArray;
    :try_start_12
    const-string v11, "messages"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_13

    move-result-object v5

    .line 303
    :goto_13
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-lez v11, :cond_6

    .line 304
    invoke-direct {p0, v5}, Lcom/adobe/mobile/MobileConfig;->loadMessagesFromJsonArray(Lorg/json/JSONArray;)V

    .line 308
    .end local v5    # "jsonMessages":Lorg/json/JSONArray;
    :cond_6
    const/4 v6, 0x0

    .line 310
    .local v6, "marketingCloudSettings":Lorg/json/JSONObject;
    :try_start_13
    const-string v11, "marketingCloud"

    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_14

    move-result-object v6

    .line 315
    :goto_14
    if-eqz v6, :cond_7

    .line 317
    :try_start_14
    const-string v11, "org"

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_15

    .line 325
    :cond_7
    :goto_15
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v11

    if-nez v11, :cond_0

    .line 326
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->loadCachedRemotes()V

    goto/16 :goto_0

    .line 149
    .end local v0    # "aamSettings":Lorg/json/JSONObject;
    .end local v6    # "marketingCloudSettings":Lorg/json/JSONObject;
    .end local v9    # "remoteURLs":Lorg/json/JSONObject;
    .end local v10    # "targetSettings":Lorg/json/JSONObject;
    :catch_0
    move-exception v4

    .line 150
    .local v4, "ex":Lorg/json/JSONException;
    const-string v11, "Analytics - Not configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 158
    .end local v4    # "ex":Lorg/json/JSONException;
    :catch_1
    move-exception v3

    .line 159
    .local v3, "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_trackingServer:Ljava/lang/String;

    .line 160
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_reportSuiteIds:Ljava/lang/String;

    .line 161
    const-string v11, "Analytics - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 166
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v3

    .line 167
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "UTF-8"

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_characterSet:Ljava/lang/String;

    goto/16 :goto_3

    .line 172
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v3

    .line 173
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_ssl:Z

    goto/16 :goto_4

    .line 178
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_4
    move-exception v3

    .line 179
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-boolean v11, p0, Lcom/adobe/mobile/MobileConfig;->_offlineTrackingEnabled:Z

    goto/16 :goto_5

    .line 184
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_5
    move-exception v3

    .line 185
    .restart local v3    # "e":Lorg/json/JSONException;
    const/16 v11, 0x12c

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_lifecycleTimeout:I

    goto/16 :goto_6

    .line 190
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_6
    move-exception v3

    .line 191
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_referrerTimeout:I

    goto/16 :goto_7

    .line 196
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_7
    move-exception v3

    .line 197
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_batchLimit:I

    goto/16 :goto_8

    .line 208
    .end local v3    # "e":Lorg/json/JSONException;
    :cond_8
    :try_start_15
    const-string v11, "privacyDefault"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_9
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_15 .. :try_end_15} :catch_8

    move-result-object v8

    .line 213
    .local v8, "privacyString":Ljava/lang/String;
    :goto_16
    if-eqz v8, :cond_9

    :try_start_16
    invoke-direct {p0, v8}, Lcom/adobe/mobile/MobileConfig;->privacyStatusFromString(Ljava/lang/String;)Lcom/adobe/mobile/MobilePrivacyStatus;

    move-result-object v11

    :goto_17
    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;
    :try_end_16
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_16 .. :try_end_16} :catch_8

    goto/16 :goto_9

    .line 216
    .end local v8    # "privacyString":Ljava/lang/String;
    :catch_8
    move-exception v3

    .line 217
    .local v3, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v11, "Config - Error pulling privacy from shared preferences. (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v3}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 209
    .end local v3    # "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    :catch_9
    move-exception v3

    .line 210
    .local v3, "e":Lorg/json/JSONException;
    const/4 v8, 0x0

    .restart local v8    # "privacyString":Ljava/lang/String;
    goto :goto_16

    .line 213
    .end local v3    # "e":Lorg/json/JSONException;
    :cond_9
    :try_start_17
    sget-object v11, Lcom/adobe/mobile/MobileConfig;->DEFAULT_PRIVACY_STATUS:Lcom/adobe/mobile/MobilePrivacyStatus;
    :try_end_17
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_17 .. :try_end_17} :catch_8

    goto :goto_17

    .line 224
    .end local v8    # "privacyString":Ljava/lang/String;
    :catch_a
    move-exception v3

    .line 225
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "Analytics - Malformed POI List(%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v3}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_a

    .line 234
    .end local v3    # "e":Lorg/json/JSONException;
    .restart local v10    # "targetSettings":Lorg/json/JSONObject;
    :catch_b
    move-exception v4

    .line 235
    .restart local v4    # "ex":Lorg/json/JSONException;
    const-string v11, "Target - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 241
    .end local v4    # "ex":Lorg/json/JSONException;
    :catch_c
    move-exception v3

    .line 242
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_clientCode:Ljava/lang/String;

    .line 243
    const-string v11, "Target - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_c

    .line 248
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_d
    move-exception v3

    .line 249
    .restart local v3    # "e":Lorg/json/JSONException;
    const/4 v11, 0x2

    iput v11, p0, Lcom/adobe/mobile/MobileConfig;->_defaultLocationTimeout:I

    goto/16 :goto_d

    .line 258
    .end local v3    # "e":Lorg/json/JSONException;
    .restart local v0    # "aamSettings":Lorg/json/JSONObject;
    :catch_e
    move-exception v3

    .line 259
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "Audience Manager - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_e

    .line 265
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_f
    move-exception v4

    .line 266
    .restart local v4    # "ex":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_aamServer:Ljava/lang/String;

    .line 267
    const-string v11, "Audience Manager - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_f

    .line 276
    .end local v4    # "ex":Lorg/json/JSONException;
    .restart local v9    # "remoteURLs":Lorg/json/JSONObject;
    :catch_10
    move-exception v3

    .line 277
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "Remotes - Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 283
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_11
    move-exception v3

    .line 284
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "Config - No in-app messages remote url loaded (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v3}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_11

    .line 289
    .end local v3    # "e":Lorg/json/JSONException;
    :catch_12
    move-exception v3

    .line 290
    .restart local v3    # "e":Lorg/json/JSONException;
    const-string v11, "Config - No points of interest remote url loaded (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v3}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_12

    .line 299
    .end local v3    # "e":Lorg/json/JSONException;
    .restart local v5    # "jsonMessages":Lorg/json/JSONArray;
    :catch_13
    move-exception v4

    .line 300
    .restart local v4    # "ex":Lorg/json/JSONException;
    const-string v11, "Messages - Not configured locally."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_13

    .line 311
    .end local v4    # "ex":Lorg/json/JSONException;
    .end local v5    # "jsonMessages":Lorg/json/JSONArray;
    .restart local v6    # "marketingCloudSettings":Lorg/json/JSONObject;
    :catch_14
    move-exception v4

    .line 312
    .restart local v4    # "ex":Lorg/json/JSONException;
    const-string v11, "Marketing Cloud - Not configured locally."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_14

    .line 318
    .end local v4    # "ex":Lorg/json/JSONException;
    :catch_15
    move-exception v4

    .line 319
    .restart local v4    # "ex":Lorg/json/JSONException;
    const/4 v11, 0x0

    iput-object v11, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;

    .line 320
    const-string v11, "Visitor - ID Service Not Configured."

    const/4 v12, 0x0

    new-array v12, v12, [Ljava/lang/Object;

    invoke-static {v11, v12}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_15
.end method

.method static synthetic access$000(Lcom/adobe/mobile/MobileConfig;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/MobileConfig;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/adobe/mobile/MobileConfig;)V
    .locals 0
    .param p0, "x0"    # Lcom/adobe/mobile/MobileConfig;

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/adobe/mobile/MobileConfig;->loadMessageImages()V

    return-void
.end method

.method static synthetic access$200(Lcom/adobe/mobile/MobileConfig;)Ljava/util/ArrayList;
    .locals 1
    .param p0, "x0"    # Lcom/adobe/mobile/MobileConfig;

    .prologue
    .line 34
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected static getInstance()Lcom/adobe/mobile/MobileConfig;
    .locals 2

    .prologue
    .line 124
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_instanceMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 125
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/MobileConfig;->_instance:Lcom/adobe/mobile/MobileConfig;

    if-nez v0, :cond_0

    .line 126
    new-instance v0, Lcom/adobe/mobile/MobileConfig;

    invoke-direct {v0}, Lcom/adobe/mobile/MobileConfig;-><init>()V

    sput-object v0, Lcom/adobe/mobile/MobileConfig;->_instance:Lcom/adobe/mobile/MobileConfig;

    .line 129
    :cond_0
    sget-object v0, Lcom/adobe/mobile/MobileConfig;->_instance:Lcom/adobe/mobile/MobileConfig;

    monitor-exit v1

    return-object v0

    .line 130
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private loadBundleConfig()Lorg/json/JSONObject;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 647
    const/4 v1, 0x0

    .line 651
    .local v1, "jsonData":Lorg/json/JSONObject;
    sget-object v4, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStreamMutex:Ljava/lang/Object;

    monitor-enter v4

    .line 652
    :try_start_0
    sget-object v2, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStream:Ljava/io/InputStream;

    .line 653
    .local v2, "userPath":Ljava/io/InputStream;
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 657
    if-eqz v2, :cond_0

    .line 658
    :try_start_1
    const-string v3, "Config - Attempting to load config file from override stream"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    sget-object v3, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStream:Ljava/io/InputStream;

    invoke-direct {p0, v3}, Lcom/adobe/mobile/MobileConfig;->loadConfigFromStream(Ljava/io/InputStream;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 668
    :cond_0
    :goto_0
    if-nez v1, :cond_2

    .line 669
    if-eqz v2, :cond_1

    .line 670
    const-string v3, "Config - Failed attempting to load custom config, will fall back to standard config location."

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    :cond_1
    const-string v3, "Config - Attempting to load config file from default location"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    :try_start_2
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "ADBMobileConfig.json"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/adobe/mobile/MobileConfig;->loadConfigFromStream(Ljava/io/InputStream;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v1

    .line 686
    :cond_2
    :goto_1
    return-object v1

    .line 653
    .end local v2    # "userPath":Ljava/io/InputStream;
    :catchall_0
    move-exception v3

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v3

    .line 661
    .restart local v2    # "userPath":Ljava/io/InputStream;
    :catch_0
    move-exception v0

    .line 662
    .local v0, "e":Ljava/io/IOException;
    const-string v3, "Config - Error loading user defined config (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 663
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 664
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Config - Error parsing user defined config (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 677
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v0

    .line 678
    .local v0, "e":Ljava/io/IOException;
    const-string v3, "Config - Exception loading config file (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 679
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 680
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "Config - Exception parsing config file (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 681
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_4
    move-exception v0

    .line 682
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v3, "Config - Null context when attempting to read config file (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method private loadConfigFromStream(Ljava/io/InputStream;)Lorg/json/JSONObject;
    .locals 9
    .param p1, "stream"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 703
    if-nez p1, :cond_0

    .line 704
    const/4 v3, 0x0

    .line 730
    :goto_0
    return-object v3

    .line 709
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v3

    new-array v0, v3, [B

    .line 710
    .local v0, "data":[B
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 713
    new-instance v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 714
    .local v2, "jsonString":Ljava/lang/String;
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 724
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 725
    :catch_0
    move-exception v1

    .line 726
    .local v1, "e":Ljava/io/IOException;
    const-string v4, "Config - Unable to close stream (%s)"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 716
    .end local v0    # "data":[B
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "jsonString":Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 717
    .restart local v1    # "e":Ljava/io/IOException;
    :try_start_2
    const-string v3, "Config - Exception when reading config (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 724
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 730
    .end local v1    # "e":Ljava/io/IOException;
    :goto_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    goto :goto_0

    .line 725
    .restart local v1    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v1

    .line 726
    const-string v3, "Config - Unable to close stream (%s)"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 719
    .end local v1    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v1

    .line 720
    .local v1, "e":Ljava/lang/NullPointerException;
    :try_start_4
    const-string v3, "Config - Stream closed when attempting to load config (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 724
    :try_start_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_1

    .line 725
    :catch_4
    move-exception v1

    .line 726
    .local v1, "e":Ljava/io/IOException;
    const-string v3, "Config - Unable to close stream (%s)"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 723
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v3

    .line 724
    :try_start_6
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 727
    :goto_2
    throw v3

    .line 725
    :catch_5
    move-exception v1

    .line 726
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v4, "Config - Unable to close stream (%s)"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method private loadMessageImages()V
    .locals 2

    .prologue
    .line 839
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessageImageCachingExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/MobileConfig$6;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/MobileConfig$6;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 880
    return-void
.end method

.method private loadMessagesDataFromRemote(Lorg/json/JSONObject;)V
    .locals 5
    .param p1, "jsonData"    # Lorg/json/JSONObject;

    .prologue
    const/4 v4, 0x0

    .line 790
    if-nez p1, :cond_0

    .line 791
    const-string v2, "Messages - Remote messages config was null, falling back to bundled messages"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 792
    const-string v2, "messageImages"

    invoke-static {v2}, Lcom/adobe/mobile/RemoteDownload;->deleteFilesInDirectory(Ljava/lang/String;)V

    .line 815
    :goto_0
    return-void

    .line 797
    :cond_0
    const/4 v1, 0x0

    .line 799
    .local v1, "jsonMessages":Lorg/json/JSONArray;
    :try_start_0
    const-string v2, "messages"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 805
    :goto_1
    const-string v2, "Messages - Using remote definition for messages"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-gtz v2, :cond_2

    .line 809
    :cond_1
    const-string v2, "messageImages"

    invoke-static {v2}, Lcom/adobe/mobile/RemoteDownload;->deleteFilesInDirectory(Ljava/lang/String;)V

    .line 810
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    goto :goto_0

    .line 801
    :catch_0
    move-exception v0

    .line 802
    .local v0, "ex":Lorg/json/JSONException;
    const-string v2, "Messages - Remote messages not configured, falling back to bundled messages"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 814
    .end local v0    # "ex":Lorg/json/JSONException;
    :cond_2
    invoke-direct {p0, v1}, Lcom/adobe/mobile/MobileConfig;->loadMessagesFromJsonArray(Lorg/json/JSONArray;)V

    goto :goto_0
.end method

.method private loadMessagesFromJsonArray(Lorg/json/JSONArray;)V
    .locals 11
    .param p1, "messages"    # Lorg/json/JSONArray;

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 819
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    .line 820
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 822
    .local v3, "messageCount":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v3, :cond_1

    .line 823
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 825
    .local v4, "messageJson":Lorg/json/JSONObject;
    invoke-static {v4}, Lcom/adobe/mobile/Message;->messageWithJsonObject(Lorg/json/JSONObject;)Lcom/adobe/mobile/Message;

    move-result-object v2

    .line 826
    .local v2, "message":Lcom/adobe/mobile/Message;
    if-eqz v2, :cond_0

    .line 827
    const-string v5, "Messages - loaded message - %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v2}, Lcom/adobe/mobile/Message;->description()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v5, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 822
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 832
    .end local v1    # "i":I
    .end local v2    # "message":Lcom/adobe/mobile/Message;
    .end local v3    # "messageCount":I
    .end local v4    # "messageJson":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 833
    .local v0, "e":Lorg/json/JSONException;
    const-string v5, "Messages - Unable to parse messages JSON (%s)"

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v9

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    return-void
.end method

.method private loadPoiFromJsonArray(Lorg/json/JSONArray;)V
    .locals 10
    .param p1, "poiArray"    # Lorg/json/JSONArray;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 763
    if-nez p1, :cond_1

    .line 783
    :cond_0
    :goto_0
    return-void

    .line 767
    :cond_1
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterest:Ljava/util/List;

    .line 768
    const/4 v2, 0x0

    .local v2, "i":I
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    .local v0, "count":I
    :goto_1
    if-ge v2, v0, :cond_0

    .line 769
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v3

    .line 770
    .local v3, "singlePOI":Lorg/json/JSONArray;
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 772
    .local v4, "singlePoint":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Object;>;"
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 774
    const/4 v5, 0x2

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    const/4 v5, 0x3

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    iget-object v5, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterest:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 768
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 780
    .end local v0    # "count":I
    .end local v2    # "i":I
    .end local v3    # "singlePOI":Lorg/json/JSONArray;
    .end local v4    # "singlePoint":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Object;>;"
    :catch_0
    move-exception v1

    .line 781
    .local v1, "ex":Lorg/json/JSONException;
    const-string v5, "Messages - Unable to parse remote points of interest JSON (%s)"

    new-array v6, v9, [Ljava/lang/Object;

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private privacyStatusFromString(Ljava/lang/String;)Lcom/adobe/mobile/MobilePrivacyStatus;
    .locals 1
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    .line 744
    if-eqz p1, :cond_2

    .line 745
    const-string v0, "optedin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 746
    sget-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 756
    :goto_0
    return-object v0

    .line 748
    :cond_0
    const-string v0, "optedout"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 749
    sget-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

    goto :goto_0

    .line 751
    :cond_1
    const-string v0, "optunknown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 752
    sget-object v0, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_UNKNOWN:Lcom/adobe/mobile/MobilePrivacyStatus;

    goto :goto_0

    .line 756
    :cond_2
    sget-object v0, Lcom/adobe/mobile/MobileConfig;->DEFAULT_PRIVACY_STATUS:Lcom/adobe/mobile/MobilePrivacyStatus;

    goto :goto_0
.end method

.method public static setUserDefinedConfigPath(Ljava/io/InputStream;)V
    .locals 2
    .param p0, "stream"    # Ljava/io/InputStream;

    .prologue
    .line 736
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStreamMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 737
    :try_start_0
    sget-object v0, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStream:Ljava/io/InputStream;

    if-nez v0, :cond_0

    .line 738
    sput-object p0, Lcom/adobe/mobile/MobileConfig;->_userDefinedInputStream:Ljava/io/InputStream;

    .line 740
    :cond_0
    monitor-exit v1

    .line 741
    return-void

    .line 740
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected downloadRemoteConfigs()V
    .locals 2

    .prologue
    .line 519
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessagesExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/MobileConfig$4;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/MobileConfig$4;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 537
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 538
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    new-instance v1, Lcom/adobe/mobile/MobileConfig$5;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/MobileConfig$5;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-static {v0, v1}, Lcom/adobe/mobile/RemoteDownload;->remoteDownloadAsync(Ljava/lang/String;Lcom/adobe/mobile/RemoteDownload$RemoteDownloadBlock;)V

    .line 553
    :cond_0
    return-void
.end method

.method protected getAamServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_aamServer:Ljava/lang/String;

    return-object v0
.end method

.method protected getBatchLimit()I
    .locals 1

    .prologue
    .line 430
    iget v0, p0, Lcom/adobe/mobile/MobileConfig;->_batchLimit:I

    return v0
.end method

.method protected getCharacterSet()Ljava/lang/String;
    .locals 1

    .prologue
    .line 414
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_characterSet:Ljava/lang/String;

    return-object v0
.end method

.method protected getClientCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 501
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_clientCode:Ljava/lang/String;

    return-object v0
.end method

.method protected getDefaultLocationTimeout()I
    .locals 1

    .prologue
    .line 505
    iget v0, p0, Lcom/adobe/mobile/MobileConfig;->_defaultLocationTimeout:I

    return v0
.end method

.method protected getInAppMessageURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 629
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    return-object v0
.end method

.method protected getInAppMessages()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/adobe/mobile/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 625
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_inAppMessages:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected getLifecycleTimeout()I
    .locals 1

    .prologue
    .line 426
    iget v0, p0, Lcom/adobe/mobile/MobileConfig;->_lifecycleTimeout:I

    return v0
.end method

.method protected getMarketingCloudOrganizationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 636
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;

    return-object v0
.end method

.method protected getOfflineTrackingEnabled()Z
    .locals 1

    .prologue
    .line 422
    iget-boolean v0, p0, Lcom/adobe/mobile/MobileConfig;->_offlineTrackingEnabled:Z

    return v0
.end method

.method protected getPointsOfInterest()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 490
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterest:Ljava/util/List;

    return-object v0
.end method

.method protected getPointsOfInterestURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 586
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    return-object v0
.end method

.method protected getPrivacyStatus()Lcom/adobe/mobile/MobilePrivacyStatus;
    .locals 1

    .prologue
    .line 486
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;

    return-object v0
.end method

.method protected getReferrerTimeout()I
    .locals 1

    .prologue
    .line 494
    iget v0, p0, Lcom/adobe/mobile/MobileConfig;->_referrerTimeout:I

    return v0
.end method

.method protected getReportSuiteIds()Ljava/lang/String;
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_reportSuiteIds:Ljava/lang/String;

    return-object v0
.end method

.method protected getSSL()Z
    .locals 1

    .prologue
    .line 418
    iget-boolean v0, p0, Lcom/adobe/mobile/MobileConfig;->_ssl:Z

    return v0
.end method

.method protected getTrackingServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_trackingServer:Ljava/lang/String;

    return-object v0
.end method

.method protected getVisitorIdServiceEnabled()Z
    .locals 1

    .prologue
    .line 640
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_marketingCloudOrganizationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected loadCachedRemotes()V
    .locals 1

    .prologue
    .line 690
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 691
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_messagesURL:Ljava/lang/String;

    invoke-static {v0}, Lcom/adobe/mobile/RemoteDownload;->getFileForCachedURL(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MobileConfig;->updateMessagesData(Ljava/io/File;)V

    .line 694
    :cond_0
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 695
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_pointsOfInterestURL:Ljava/lang/String;

    invoke-static {v0}, Lcom/adobe/mobile/RemoteDownload;->getFileForCachedURL(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/adobe/mobile/MobileConfig;->updatePOIData(Ljava/io/File;)V

    .line 697
    :cond_1
    return-void
.end method

.method protected mobileUsingAnalytics()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 333
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_usingAnalyticsMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 334
    :try_start_0
    iget-object v2, p0, Lcom/adobe/mobile/MobileConfig;->_usingAnalytics:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    .line 336
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getReportSuiteIds()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 337
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getReportSuiteIds()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 338
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getTrackingServer()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 339
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getTrackingServer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x1

    .line 336
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAnalytics:Ljava/lang/Boolean;

    .line 341
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAnalytics:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 342
    const-string v0, "Analytics - Your config file is not set up to use Analytics(missing report suite id(s) or tracking server information)"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :cond_1
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAnalytics:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    monitor-exit v1

    return v0

    .line 346
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected mobileUsingAudienceManager()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 363
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 377
    :goto_0
    return v0

    .line 366
    :cond_0
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManagerMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 367
    :try_start_0
    iget-object v2, p0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManager:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    .line 369
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getAamServer()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 370
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getAamServer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v0, 0x1

    .line 369
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManager:Ljava/lang/Boolean;

    .line 372
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManager:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 373
    const-string v0, "Audience Manager - Your config file is not set up to use Audience Manager(missing audience manager server information)"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_2
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingAudienceManager:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected mobileUsingGooglePlayServices()Z
    .locals 2

    .prologue
    .line 352
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServicesMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 353
    :try_start_0
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServices:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 354
    invoke-static {}, Lcom/adobe/mobile/WearableFunctionBridge;->isGooglePlayServicesEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServices:Ljava/lang/Boolean;

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingGooglePlayServices:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    monitor-exit v1

    return v0

    .line 357
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected mobileUsingTarget()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 384
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 398
    :goto_0
    return v0

    .line 387
    :cond_0
    sget-object v1, Lcom/adobe/mobile/MobileConfig;->_usingTargetMutex:Ljava/lang/Object;

    monitor-enter v1

    .line 388
    :try_start_0
    iget-object v2, p0, Lcom/adobe/mobile/MobileConfig;->_usingTarget:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    .line 390
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getClientCode()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 391
    invoke-virtual {p0}, Lcom/adobe/mobile/MobileConfig;->getClientCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    const/4 v0, 0x1

    .line 390
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingTarget:Ljava/lang/Boolean;

    .line 393
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingTarget:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 394
    const-string v0, "TargetWorker - Your config file is not set up to use Target(missing client code information)"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    :cond_2
    iget-object v0, p0, Lcom/adobe/mobile/MobileConfig;->_usingTarget:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 399
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected setPrivacyStatus(Lcom/adobe/mobile/MobilePrivacyStatus;)V
    .locals 6
    .param p1, "status"    # Lcom/adobe/mobile/MobilePrivacyStatus;

    .prologue
    const/4 v5, 0x0

    .line 435
    if-nez p1, :cond_0

    .line 483
    :goto_0
    return-void

    .line 440
    :cond_0
    sget-object v2, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_UNKNOWN:Lcom/adobe/mobile/MobilePrivacyStatus;

    if-ne p1, v2, :cond_1

    iget-boolean v2, p0, Lcom/adobe/mobile/MobileConfig;->_offlineTrackingEnabled:Z

    if-nez v2, :cond_1

    .line 441
    const-string v2, "Analytics - Cannot set privacy status to unknown when offline tracking is disabled"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 446
    :cond_1
    sget-object v2, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_IN:Lcom/adobe/mobile/MobilePrivacyStatus;

    if-ne p1, v2, :cond_2

    .line 447
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/adobe/mobile/MobileConfig$1;

    invoke-direct {v3, p0}, Lcom/adobe/mobile/MobileConfig$1;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 457
    :cond_2
    sget-object v2, Lcom/adobe/mobile/MobilePrivacyStatus;->MOBILE_PRIVACY_STATUS_OPT_OUT:Lcom/adobe/mobile/MobilePrivacyStatus;

    if-ne p1, v2, :cond_3

    .line 458
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/adobe/mobile/MobileConfig$2;

    invoke-direct {v3, p0}, Lcom/adobe/mobile/MobileConfig$2;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 464
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAudienceExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/adobe/mobile/MobileConfig$3;

    invoke-direct {v3, p0}, Lcom/adobe/mobile/MobileConfig$3;-><init>(Lcom/adobe/mobile/MobileConfig;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 473
    :cond_3
    iput-object p1, p0, Lcom/adobe/mobile/MobileConfig;->_privacyStatus:Lcom/adobe/mobile/MobilePrivacyStatus;

    .line 475
    invoke-virtual {p1}, Lcom/adobe/mobile/MobilePrivacyStatus;->getValue()I

    move-result v2

    invoke-static {v2}, Lcom/adobe/mobile/WearableFunctionBridge;->syncPrivacyStatusToWearable(I)V

    .line 477
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 478
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v2, "PrivacyStatus"

    invoke-virtual {p1}, Lcom/adobe/mobile/MobilePrivacyStatus;->getValue()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 479
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 480
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    :catch_0
    move-exception v0

    .line 481
    .local v0, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v2, "Config - Error persisting privacy status (%s)."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected updateMessagesData(Ljava/io/File;)V
    .locals 10
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 557
    const/4 v1, 0x0

    .line 560
    .local v1, "fis":Ljava/io/FileInputStream;
    if-nez p1, :cond_1

    .line 576
    if-eqz v1, :cond_0

    .line 577
    :try_start_0
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 584
    :cond_0
    :goto_0
    return-void

    .line 580
    :catch_0
    move-exception v0

    .line 581
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "Messages - Unable to close file stream (%s)"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 564
    .end local v0    # "e":Ljava/io/IOException;
    :cond_1
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 565
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .local v2, "fis":Ljava/io/FileInputStream;
    :try_start_2
    invoke-direct {p0, v2}, Lcom/adobe/mobile/MobileConfig;->loadConfigFromStream(Ljava/io/InputStream;)Lorg/json/JSONObject;

    move-result-object v3

    .line 566
    .local v3, "jsonData":Lorg/json/JSONObject;
    invoke-direct {p0, v3}, Lcom/adobe/mobile/MobileConfig;->loadMessagesDataFromRemote(Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 576
    if-eqz v2, :cond_2

    .line 577
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_2
    move-object v1, v2

    .line 582
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    goto :goto_0

    .line 580
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :catch_1
    move-exception v0

    .line 581
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v4, "Messages - Unable to close file stream (%s)"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v2

    .line 583
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    goto :goto_0

    .line 568
    .end local v0    # "e":Ljava/io/IOException;
    .end local v3    # "jsonData":Lorg/json/JSONObject;
    :catch_2
    move-exception v0

    .line 569
    .local v0, "e":Lorg/json/JSONException;
    :goto_1
    :try_start_4
    const-string v4, "Messages - Unable to read messages remote config file, falling back to bundled messages (%s)"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v0}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 576
    if-eqz v1, :cond_0

    .line 577
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_0

    .line 580
    :catch_3
    move-exception v0

    .line 581
    .local v0, "e":Ljava/io/IOException;
    const-string v4, "Messages - Unable to close file stream (%s)"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 571
    .end local v0    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v0

    .line 572
    .restart local v0    # "e":Ljava/io/IOException;
    :goto_2
    :try_start_6
    const-string v4, "Messages - Unable to open messages config file, falling back to bundled messages (%s)"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 576
    if-eqz v1, :cond_0

    .line 577
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_0

    .line 580
    :catch_5
    move-exception v0

    .line 581
    const-string v4, "Messages - Unable to close file stream (%s)"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 575
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 576
    :goto_3
    if-eqz v1, :cond_3

    .line 577
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 582
    :cond_3
    :goto_4
    throw v4

    .line 580
    :catch_6
    move-exception v0

    .line 581
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v5, "Messages - Unable to close file stream (%s)"

    new-array v6, v9, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 575
    .end local v0    # "e":Ljava/io/IOException;
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :catchall_1
    move-exception v4

    move-object v1, v2

    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    goto :goto_3

    .line 571
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :catch_7
    move-exception v0

    move-object v1, v2

    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    goto :goto_2

    .line 568
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :catch_8
    move-exception v0

    move-object v1, v2

    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    goto :goto_1
.end method

.method protected updatePOIData(Ljava/io/File;)V
    .locals 13
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 591
    const/4 v3, 0x0

    .line 594
    .local v3, "fis":Ljava/io/FileInputStream;
    if-nez p1, :cond_1

    .line 614
    if-eqz v3, :cond_0

    .line 615
    :try_start_0
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 622
    :cond_0
    :goto_0
    return-void

    .line 618
    :catch_0
    move-exception v1

    .line 619
    .local v1, "e":Ljava/io/IOException;
    const-string v7, "Config - Unable to close file stream (%s)"

    new-array v8, v12, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 598
    .end local v1    # "e":Ljava/io/IOException;
    :cond_1
    :try_start_1
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 599
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .local v4, "fis":Ljava/io/FileInputStream;
    :try_start_2
    invoke-direct {p0, v4}, Lcom/adobe/mobile/MobileConfig;->loadConfigFromStream(Ljava/io/InputStream;)Lorg/json/JSONObject;

    move-result-object v5

    .line 600
    .local v5, "jsonData":Lorg/json/JSONObject;
    if-eqz v5, :cond_2

    .line 601
    const-string v7, "analytics"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 602
    .local v0, "analytics":Lorg/json/JSONObject;
    const-string v7, "poi"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 603
    .local v6, "poiArray":Lorg/json/JSONArray;
    invoke-direct {p0, v6}, Lcom/adobe/mobile/MobileConfig;->loadPoiFromJsonArray(Lorg/json/JSONArray;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 614
    .end local v0    # "analytics":Lorg/json/JSONObject;
    .end local v6    # "poiArray":Lorg/json/JSONArray;
    :cond_2
    if-eqz v4, :cond_3

    .line 615
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_3
    move-object v3, v4

    .line 620
    .end local v4    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    goto :goto_0

    .line 618
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v4    # "fis":Ljava/io/FileInputStream;
    :catch_1
    move-exception v1

    .line 619
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v7, "Config - Unable to close file stream (%s)"

    new-array v8, v12, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v3, v4

    .line 621
    .end local v4    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    goto :goto_0

    .line 606
    .end local v1    # "e":Ljava/io/IOException;
    .end local v5    # "jsonData":Lorg/json/JSONObject;
    :catch_2
    move-exception v2

    .line 607
    .local v2, "ex":Lorg/json/JSONException;
    :goto_1
    :try_start_4
    const-string v7, "Config - Unable to read points of interest remote config file, falling back to bundled poi (%s)"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 614
    if-eqz v3, :cond_0

    .line 615
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_0

    .line 618
    :catch_3
    move-exception v1

    .line 619
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v7, "Config - Unable to close file stream (%s)"

    new-array v8, v12, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 609
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "ex":Lorg/json/JSONException;
    :catch_4
    move-exception v2

    .line 610
    .local v2, "ex":Ljava/io/IOException;
    :goto_2
    :try_start_6
    const-string v7, "Config - Unable to open points of interest config file, falling back to bundled poi (%s)"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 614
    if-eqz v3, :cond_0

    .line 615
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_0

    .line 618
    :catch_5
    move-exception v1

    .line 619
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v7, "Config - Unable to close file stream (%s)"

    new-array v8, v12, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 613
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "ex":Ljava/io/IOException;
    :catchall_0
    move-exception v7

    .line 614
    :goto_3
    if-eqz v3, :cond_4

    .line 615
    :try_start_8
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 620
    :cond_4
    :goto_4
    throw v7

    .line 618
    :catch_6
    move-exception v1

    .line 619
    .restart local v1    # "e":Ljava/io/IOException;
    const-string v8, "Config - Unable to close file stream (%s)"

    new-array v9, v12, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v11

    invoke-static {v8, v9}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 613
    .end local v1    # "e":Ljava/io/IOException;
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v4    # "fis":Ljava/io/FileInputStream;
    :catchall_1
    move-exception v7

    move-object v3, v4

    .end local v4    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    goto :goto_3

    .line 609
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v4    # "fis":Ljava/io/FileInputStream;
    :catch_7
    move-exception v2

    move-object v3, v4

    .end local v4    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    goto :goto_2

    .line 606
    .end local v3    # "fis":Ljava/io/FileInputStream;
    .restart local v4    # "fis":Ljava/io/FileInputStream;
    :catch_8
    move-exception v2

    move-object v3, v4

    .end local v4    # "fis":Ljava/io/FileInputStream;
    .restart local v3    # "fis":Ljava/io/FileInputStream;
    goto :goto_1
.end method
