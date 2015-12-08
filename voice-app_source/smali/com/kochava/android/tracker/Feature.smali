.class public Lcom/kochava/android/tracker/Feature;
.super Ljava/lang/Object;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;,
        Lcom/kochava/android/tracker/Feature$MemoryBoss;,
        Lcom/kochava/android/tracker/Feature$LifeCycleTracker;,
        Lcom/kochava/android/tracker/Feature$WHITELISTITEMS;,
        Lcom/kochava/android/tracker/Feature$WATCHLIST;,
        Lcom/kochava/android/tracker/Feature$PRIVATEINPUTITEMS;,
        Lcom/kochava/android/tracker/Feature$INPUTITEMS;,
        Lcom/kochava/android/tracker/Feature$PARAMS;,
        Lcom/kochava/android/tracker/Feature$CURRENCIES;,
        Lcom/kochava/android/tracker/Feature$TrackTask;
    }
.end annotation


# static fields
.field protected static final ADLOGTAG:Ljava/lang/String; = "KochavaAds"

.field private static final AD_CLICK_RESET_TIME:I = 0x9c4

.field private static final AD_UNAVAILABLE_CLICK_RESET_TIME:I = 0x9c4

.field public static final ATTRIBUTION_DATA:Ljava/lang/String; = "attributionData"

.field private static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"

.field private static final ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

.field protected static final ATTRIBUTION_PREF_DATA:Ljava/lang/String; = "attributionData"

.field protected static final ATTRIBUTION_PREF_NAME:Ljava/lang/String; = "attributionPref"

.field private static final BAD_INIT_MESSAGE:Ljava/lang/String; = "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

.field private static final BIDDER_DEFAULT_HOST:Ljava/lang/String; = "bidder.kochava.com"

.field private static final BIDDER_ENDPOINT:Ljava/lang/String; = "/adserver/request/"

.field private static final BULK_UPLOAD_LIMIT:I = 0x32

.field private static final CONTROL_DEFAULT_HOST:Ljava/lang/String; = "control.kochava.com"

.field private static final DEVICE_ID_GENERATED:Ljava/lang/String; = "kochava_app_id_generated"

.field private static final EVENT_FLUSH_TIME:I = 0xea60

.field private static final EXIT:Ljava/lang/String; = "exit"

.field private static final FLUSH_RATE_MAX_MINS:I = 0x168

.field private static final HTML_FORMAT:Ljava/lang/String; = "<html><body style=\"text-align: center; background-color: black; vertical-align: center;\"><img src = \"%s\" /></body></html>"

.field private static final HTTPS_STRING:Ljava/lang/String; = "https://"

.field private static final HTTP_STRING:Ljava/lang/String; = "http://"

.field private static final INIT_ENDPOINT:Ljava/lang/String; = "/track/kvinit"

.field private static final INIT_FORCE_TIME:I = 0x927c0

.field private static final KOCHAVA_APP_ID:Ljava/lang/String; = "kochava_app_id"

.field private static final KVQUERY_ENDPOINT:Ljava/lang/String; = "/track/kvquery"

.field private static final KV_QUERY_DEFAULT_RERUN:I = 0x3c

.field private static final KV_QUERY_FIRST_RUN:I = 0x7

.field private static final LAUNCH:Ljava/lang/String; = "launch"

.field public static final LINKIDENTITYBOOL:Ljava/lang/String; = "linkIdentityBool"

.field protected static final LOGTAG:Ljava/lang/String; = "KochavaTracker"

.field private static final MAX_ADID_DELAY:I = 0x258

.field private static final OPTIONS_ENDPOINT:Ljava/lang/String; = "/track/kv_options.php"

.field protected static final PREF_APPDATA:Ljava/lang/String; = "kochavaappdata"

.field protected static final PREF_CUR:Ljava/lang/String; = "currency"

.field protected static final PREF_INIT:Ljava/lang/String; = "initBool"

.field protected static final PREF_INIT_DATA:Ljava/lang/String; = "initData"

.field protected static final PREF_LAT:Ljava/lang/String; = "mylat"

.field protected static final PREF_LONG:Ljava/lang/String; = "mylong"

.field protected static final PREF_NAME:Ljava/lang/String; = "initPrefs"

.field protected static final PREF_TIMESTOPPED:Ljava/lang/String; = "timeStampStopped"

.field protected static final REQLOGTAG:Ljava/lang/String; = "KochavaRequirements"

.field private static final SENDONSTART:Ljava/lang/String; = "sendonstart"

.field private static final STRING_FALSE:Ljava/lang/String; = "false"

.field private static final STRING_TRUE:Ljava/lang/String; = "true"

.field private static final TRACKER_ENDPOINT:Ljava/lang/String; = "/track/kvTracker.php"

.field private static adid:Ljava/lang/String;

.field private static advertisingID:Ljava/lang/String;

.field protected static appContext:Landroid/content/Context;

.field private static attributionDataHandler:Landroid/os/Handler;

.field private static attributionDataPrefs:Landroid/content/SharedPreferences;

.field private static badInit:Z

.field private static canSendSession:Z

.field private static device_limit_tracking:Z

.field private static event_flush_triggered:Z

.field private static eventnameBlacklist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static flush_rate:I

.field private static hostBidder:Ljava/lang/String;

.field private static hostControl:Ljava/lang/String;

.field private static identityLinkMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static identityLinkMapJSON:Lorg/json/JSONObject;

.field private static is_in_background:Z

.field private static kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

.field private static lastCallTime:J

.field private static mAppId:Ljava/lang/String;

.field private static mEnvDeviceID:Ljava/lang/String;

.field private static mIMEI:Ljava/lang/String;

.field private static mKochDevIDStrategy:Ljava/lang/String;

.field private static mMacAddr:Ljava/lang/String;

.field private static mSuperProperties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mTimer:Ljava/util/Timer;

.field private static mUserAgent:Ljava/lang/String;

.field protected static overrideAutomaticSessions:Z

.field private static paramRestrictions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static prefs:Landroid/content/SharedPreferences;

.field private static referrerDelayFromInit:I

.field private static requestAttributionData:Z

.field private static sendEmails:Z

.field private static sendKVQuery:Ljava/lang/Runnable;

.field private static should_flush_in_background:Z

.field private static startTime:J

.field private static suppress_adid:Z

.field protected static versionExtension:Ljava/lang/String;

.field public static webStates:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public static webViews:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field

.field private static final worker:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private adTimer:Ljava/util/Timer;

.field private app_limit_tracking:Z

.field private clickData:Ljava/lang/String;

.field private eventFlushTimer:Ljava/util/Timer;

.field private initHandler:Landroid/os/Handler;

.field private initTimer:Ljava/util/Timer;

.field private initialObject:Lorg/json/JSONObject;

.field private initialPropertiesObject:Lorg/json/JSONObject;

.field protected kvinitdata:Lorg/json/JSONObject;

.field protected kvinitdataholder:Lorg/json/JSONObject;

.field protected kvinitorigdata:Lorg/json/JSONObject;

.field private mAndroidID:Ljava/lang/String;

.field private mAppName:Ljava/lang/String;

.field private mAppPackageName:Ljava/lang/String;

.field private mAppVersionCode:Ljava/lang/String;

.field private mAppVersionName:Ljava/lang/String;

.field private mCarrier:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mDeviceId:Ljava/lang/String;

.field private mDisplayHeight:I

.field private mDisplayWidth:I

.field private mFbId:Ljava/lang/String;

.field private mIsStartOfLife:Z

.field private mModel:Ljava/lang/String;

.field private mOSVersion:Ljava/lang/String;

.field private mTimerSendOnBegin:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 144
    const-string v0, ""

    sput-object v0, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    .line 145
    const-string v0, ""

    sput-object v0, Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;

    .line 147
    const-string v0, ""

    sput-object v0, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    .line 148
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    .line 153
    const v0, 0xea60

    sput v0, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    .line 212
    const/16 v0, 0x3c

    sput v0, Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I

    .line 215
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z

    .line 217
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->suppress_adid:Z

    .line 221
    sput-wide v4, Lcom/kochava/android/tracker/Feature;->lastCallTime:J

    .line 222
    sput-wide v4, Lcom/kochava/android/tracker/Feature;->startTime:J

    .line 226
    const-string v0, ""

    sput-object v0, Lcom/kochava/android/tracker/Feature;->adid:Ljava/lang/String;

    .line 240
    sput-boolean v2, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    .line 241
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->event_flush_triggered:Z

    .line 242
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->is_in_background:Z

    .line 245
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->badInit:Z

    .line 247
    sput-boolean v2, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    .line 248
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->sendEmails:Z

    .line 250
    sput-boolean v1, Lcom/kochava/android/tracker/Feature;->requestAttributionData:Z

    .line 259
    invoke-static {v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->executor:Ljava/util/concurrent/ExecutorService;

    .line 265
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->worker:Ljava/util/concurrent/ScheduledExecutorService;

    .line 270
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    .line 271
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    .line 275
    new-instance v0, Lcom/kochava/android/tracker/Feature$1;

    invoke-direct {v0}, Lcom/kochava/android/tracker/Feature$1;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    .line 286
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->eventnameBlacklist:Ljava/util/ArrayList;

    .line 1209
    new-instance v0, Lcom/kochava/android/tracker/Feature$4;

    invoke-direct {v0}, Lcom/kochava/android/tracker/Feature$4;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->sendKVQuery:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appID"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    iput-boolean v2, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 330
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 332
    .local v0, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 333
    const-string v1, "kochava_app_id"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    :cond_0
    invoke-direct {p0, p1, v2, v0}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 336
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appID"    # Ljava/lang/String;
    .param p3, "currency"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    iput-boolean v2, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 316
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 318
    .local v0, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 319
    const-string v1, "kochava_app_id"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    .line 322
    const-string v1, "currency"

    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    :cond_1
    invoke-direct {p0, p1, v2, v0}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 325
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appID"    # Ljava/lang/String;
    .param p3, "sendOnStart"    # Z

    .prologue
    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 305
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 307
    .local v0, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 308
    const-string v1, "kochava_app_id"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    :cond_0
    invoke-direct {p0, p1, p3, v0}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 311
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appID"    # Ljava/lang/String;
    .param p3, "sendOnStart"    # Z
    .param p4, "currency"    # Ljava/lang/String;

    .prologue
    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 292
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 294
    .local v0, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 295
    const-string v1, "kochava_app_id"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    .line 298
    const-string v1, "currency"

    invoke-virtual {v0, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    :cond_1
    invoke-direct {p0, p1, p3, v0}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 301
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/HashMap;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v1, 0x1

    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    iput-boolean v1, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 347
    invoke-direct {p0, p1, v1, p2}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 348
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLjava/util/HashMap;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sendOnStart"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Z",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 340
    .local p3, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 234
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    .line 2431
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 341
    invoke-direct {p0, p1, p2, p3}, Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V

    .line 342
    return-void
.end method

.method static synthetic access$000(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getAdvertisingId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1000()I
    .locals 1

    .prologue
    .line 115
    sget v0, Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I

    return v0
.end method

.method static synthetic access$1002(I)I
    .locals 0
    .param p0, "x0"    # I

    .prologue
    .line 115
    sput p0, Lcom/kochava/android/tracker/Feature;->referrerDelayFromInit:I

    return p0
.end method

.method static synthetic access$102(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 115
    sput-object p0, Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic access$1202(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 115
    sput-boolean p0, Lcom/kochava/android/tracker/Feature;->sendEmails:Z

    return p0
.end method

.method static synthetic access$1300()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->eventnameBlacklist:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1402(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 115
    sput-boolean p0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    return p0
.end method

.method static synthetic access$1500(Ljava/lang/Exception;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/Exception;

    .prologue
    .line 115
    invoke-static {p0}, Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$1600()Z
    .locals 1

    .prologue
    .line 115
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->suppress_adid:Z

    return v0
.end method

.method static synthetic access$1700(Lcom/kochava/android/tracker/Feature;)Landroid/os/Handler;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1800()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1900()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic access$200(Z)Lorg/apache/http/client/HttpClient;
    .locals 1
    .param p0, "x0"    # Z

    .prologue
    .line 115
    invoke-static {p0}, Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2000()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->attributionDataHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2200(Lcom/kochava/android/tracker/Feature;)Z
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-boolean v0, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    return v0
.end method

.method static synthetic access$2300(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2400()Z
    .locals 1

    .prologue
    .line 115
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z

    return v0
.end method

.method static synthetic access$2500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2600()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mKochDevIDStrategy:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2700(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1
    .param p0, "x0"    # Lorg/json/JSONObject;

    .prologue
    .line 115
    invoke-static {p0}, Lcom/kochava/android/tracker/Feature;->addGlobalProperties(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2800()Ljava/util/Map;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2900()Lcom/kochava/android/tracker/DbAdapter;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$3000()Z
    .locals 1

    .prologue
    .line 115
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->is_in_background:Z

    return v0
.end method

.method static synthetic access$3002(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 115
    sput-boolean p0, Lcom/kochava/android/tracker/Feature;->is_in_background:Z

    return p0
.end method

.method static synthetic access$3102(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 115
    sput-boolean p0, Lcom/kochava/android/tracker/Feature;->event_flush_triggered:Z

    return p0
.end method

.method static synthetic access$3300(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->initialHandlerActions()V

    return-void
.end method

.method static synthetic access$3400(Lcom/kochava/android/tracker/Feature;Z)V
    .locals 0
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;
    .param p1, "x1"    # Z

    .prologue
    .line 115
    invoke-direct {p0, p1}, Lcom/kochava/android/tracker/Feature;->queInitial(Z)V

    return-void
.end method

.method static synthetic access$3500(Lcom/kochava/android/tracker/Feature;)Ljava/util/Timer;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->initTimer:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$3600(Lcom/kochava/android/tracker/Feature;)Ljava/util/Timer;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mTimerSendOnBegin:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$3602(Lcom/kochava/android/tracker/Feature;Ljava/util/Timer;)Ljava/util/Timer;
    .locals 0
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;
    .param p1, "x1"    # Ljava/util/Timer;

    .prologue
    .line 115
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature;->mTimerSendOnBegin:Ljava/util/Timer;

    return-object p1
.end method

.method static synthetic access$3700(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3800()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$3802(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 115
    sput-object p0, Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3900(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getOdin()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4000()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->postEvent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$402(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 115
    sput-object p0, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4100()V
    .locals 0

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->startAppSession()V

    return-void
.end method

.method static synthetic access$4200()V
    .locals 0

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->endAppSession()V

    return-void
.end method

.method static synthetic access$4300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getModel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$4400()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getCarrier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$502(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 115
    sput-object p0, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$602(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 115
    sput-boolean p0, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    return p0
.end method

.method static synthetic access$700(Lcom/kochava/android/tracker/Feature;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 115
    invoke-direct {p0, p1}, Lcom/kochava/android/tracker/Feature;->setCurrency(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic access$802(Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;
    .locals 0
    .param p0, "x0"    # Landroid/content/SharedPreferences;

    .prologue
    .line 115
    sput-object p0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic access$900(Lcom/kochava/android/tracker/Feature;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private static addGlobalProperties(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 8
    .param p0, "map"    # Lorg/json/JSONObject;

    .prologue
    .line 1622
    if-eqz p0, :cond_0

    .line 1627
    :try_start_0
    const-string v1, "usertime"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1630
    const-string v1, "uptime"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    sget-wide v6, Lcom/kochava/android/tracker/Feature;->startTime:J

    sub-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1633
    sget-wide v2, Lcom/kochava/android/tracker/Feature;->lastCallTime:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_1

    .line 1634
    const-string v1, "updelta"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    sget-wide v6, Lcom/kochava/android/tracker/Feature;->lastCallTime:J

    sub-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1638
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    sput-wide v2, Lcom/kochava/android/tracker/Feature;->lastCallTime:J

    .line 1641
    sget-object v1, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    const-string v2, "initPrefs"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    sput-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 1644
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "mylat"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1646
    const-string v1, "geo_lat"

    sget-object v2, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "mylat"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1647
    const-string v1, "geo_lon"

    sget-object v2, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "mylong"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1658
    :cond_0
    :goto_1
    return-object p0

    .line 1636
    :cond_1
    const-string v1, "updelta"

    const-string v2, "0"

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1652
    :catch_0
    move-exception v0

    .line 1654
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error adding time properties to a JSON object "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private createAppData()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1608
    const-string v0, ""

    .line 1609
    .local v0, "data":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1610
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1611
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getCarrier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1612
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getIMEI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1613
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1614
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1615
    return-object v0
.end method

.method private static createHttpClient(Z)Lorg/apache/http/client/HttpClient;
    .locals 9
    .param p0, "setTimeOut"    # Z

    .prologue
    .line 3051
    const-string v5, "Creating secure https client."

    invoke-static {v5}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3053
    sget-object v1, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 3055
    .local v1, "hostnameVerifier":Ljavax/net/ssl/HostnameVerifier;
    new-instance v2, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 3056
    .local v2, "params":Lorg/apache/http/params/HttpParams;
    sget-object v5, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v2, v5}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 3057
    const-string v5, "ISO-8859-1"

    invoke-static {v2, v5}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 3058
    const/4 v5, 0x1

    invoke-static {v2, v5}, Lorg/apache/http/params/HttpProtocolParams;->setUseExpectContinue(Lorg/apache/http/params/HttpParams;Z)V

    .line 3060
    if-eqz p0, :cond_0

    .line 3061
    const/16 v5, 0x2710

    invoke-static {v2, v5}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 3063
    :cond_0
    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v4

    .local v4, "socketFactory":Lorg/apache/http/conn/ssl/SSLSocketFactory;
    move-object v5, v1

    .line 3064
    check-cast v5, Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v4, v5}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 3066
    new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 3067
    .local v3, "schReg":Lorg/apache/http/conn/scheme/SchemeRegistry;
    new-instance v5, Lorg/apache/http/conn/scheme/Scheme;

    const-string v6, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v7

    const/16 v8, 0x50

    invoke-direct {v5, v6, v7, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v3, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 3068
    new-instance v5, Lorg/apache/http/conn/scheme/Scheme;

    const-string v6, "https"

    const/16 v7, 0x1bb

    invoke-direct {v5, v6, v4, v7}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v3, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 3069
    new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 3071
    .local v0, "conMgr":Lorg/apache/http/conn/ClientConnectionManager;
    invoke-static {v1}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 3073
    new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v5, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-object v5
.end method

.method public static enableDebug(Z)V
    .locals 3
    .param p0, "flag"    # Z

    .prologue
    .line 3078
    const-string v0, "KochavaTracker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enableDebug to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3079
    sput-boolean p0, Lcom/kochava/android/tracker/Global;->DEBUG:Z

    .line 3080
    return-void
.end method

.method private static endAppSession()V
    .locals 2

    .prologue
    .line 1874
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    if-nez v0, :cond_0

    .line 1876
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_1

    .line 1878
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1908
    :cond_0
    :goto_0
    return-void

    .line 1882
    :cond_1
    const-string v0, "Automatic Session End"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1884
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_2

    .line 1886
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_3

    .line 1888
    const-string v0, "Session end, flush timer was on, canceling timer and flushing current events."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1889
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 1890
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1891
    const/4 v0, 0x0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    .line 1899
    :cond_2
    :goto_1
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    if-eqz v0, :cond_4

    .line 1901
    const-string v0, "exit"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->eventSession(Ljava/lang/String;)V

    goto :goto_0

    .line 1895
    :cond_3
    const-string v0, "Session end, flush timer was already off."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_1

    .line 1905
    :cond_4
    const-string v0, "Session events disabled by server."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static eventSession(Ljava/lang/String;)V
    .locals 1
    .param p0, "state"    # Ljava/lang/String;

    .prologue
    .line 2047
    new-instance v0, Lcom/kochava/android/tracker/Feature$8;

    invoke-direct {v0, p0}, Lcom/kochava/android/tracker/Feature$8;-><init>(Ljava/lang/String;)V

    .line 2111
    .local v0, "evenSessionThread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 2113
    return-void
.end method

.method private fireEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 16
    .param p1, "eventAction"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2143
    .local p2, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v11, "initial"

    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 2145
    sget-boolean v11, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v11, :cond_0

    sget-boolean v11, Lcom/kochava/android/tracker/Feature;->is_in_background:Z

    if-eqz v11, :cond_0

    sget-boolean v11, Lcom/kochava/android/tracker/Feature;->event_flush_triggered:Z

    if-nez v11, :cond_0

    .line 2147
    const/4 v11, 0x1

    sput-boolean v11, Lcom/kochava/android/tracker/Feature;->event_flush_triggered:Z

    .line 2148
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->eventFlushTimer:Ljava/util/Timer;

    new-instance v12, Lcom/kochava/android/tracker/Feature$9;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lcom/kochava/android/tracker/Feature$9;-><init>(Lcom/kochava/android/tracker/Feature;)V

    const-wide/32 v14, 0xea60

    invoke-virtual {v11, v12, v14, v15}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 2161
    :cond_0
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "FIRE EVENT*** action:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2162
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "FIRE EVENT*** properties:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2163
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2168
    .local v3, "dataObj":Lorg/json/JSONObject;
    :try_start_0
    const-string v11, "kochava_app_id"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2169
    const-string v11, "kochava_device_id"

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2170
    const-string v11, "action"

    move-object/from16 v0, p1

    invoke-virtual {v3, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2171
    const-string v11, "dev_id_strategy"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->mKochDevIDStrategy:Ljava/lang/String;

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2172
    const-string v11, "last_post_time"

    const/4 v12, 0x0

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2173
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v12, "initPrefs"

    const/4 v13, 0x0

    invoke-virtual {v11, v12, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v11

    sput-object v11, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 2174
    const-string v11, "currency"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v13, "currency"

    const-string v14, "USD"

    invoke-interface {v12, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2175
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v11}, Lcom/kochava/android/tracker/Feature;->addGlobalProperties(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v9

    .line 2179
    .local v9, "propertiesObj":Lorg/json/JSONObject;
    const-string v11, "initial"

    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 2181
    const-string v11, "Event is initial, or initial did not get que\'d on first load"

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2185
    :try_start_1
    const-string v11, "sdk_version"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Android20150511"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    sget-object v13, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2186
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "adid"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_1

    const-string v11, "adid"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2187
    :cond_1
    const-string v11, "device"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getModel()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "-"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getCarrier()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2188
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "imei"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_2

    const-string v11, "imei"

    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getIMEI()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2189
    :cond_2
    const-string v11, "disp_h"

    move-object/from16 v0, p0

    iget v12, v0, Lcom/kochava/android/tracker/Feature;->mDisplayHeight:I

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2190
    const-string v11, "disp_w"

    move-object/from16 v0, p0

    iget v12, v0, Lcom/kochava/android/tracker/Feature;->mDisplayWidth:I

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2191
    const-string v11, "package_name"

    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getAppPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2192
    const-string v11, "app_version"

    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getAppVersion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2193
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    const-string v12, ""

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    const-string v11, "app_short_string"

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2194
    :cond_3
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "android_id"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_4

    const-string v11, "android_id"

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2195
    :cond_4
    const-string v11, "os_version"

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getOSVersion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2196
    const-string v11, "app_limit_tracking"

    move-object/from16 v0, p0

    iget-boolean v12, v0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 2197
    const-string v11, "device_limit_tracking"

    sget-boolean v12, Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 2199
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 2201
    .local v7, "idsObj":Lorg/json/JSONObject;
    sget-boolean v11, Lcom/kochava/android/tracker/Feature;->sendEmails:Z

    if-eqz v11, :cond_5

    .line 2203
    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getEmailAccounts()Ljava/lang/String;

    move-result-object v5

    .line 2204
    .local v5, "emails":Ljava/lang/String;
    const-string v11, "[]"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    .line 2205
    const-string v11, "email"

    invoke-virtual {v7, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2208
    .end local v5    # "emails":Ljava/lang/String;
    :cond_5
    invoke-virtual {v7}, Lorg/json/JSONObject;->length()I

    move-result v11

    if-lez v11, :cond_6

    .line 2209
    const-string v11, "ids"

    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2211
    :cond_6
    sget-object v11, Lcom/kochava/android/tracker/Feature;->identityLinkMapJSON:Lorg/json/JSONObject;

    if-eqz v11, :cond_7

    .line 2213
    const-string v11, "identity_link"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->identityLinkMapJSON:Lorg/json/JSONObject;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2216
    :cond_7
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "odin"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_8

    const-string v11, "odin"

    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getOdin()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2217
    :cond_8
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "mac"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_9

    const-string v11, "mac"

    sget-object v12, Lcom/kochava/android/tracker/Feature;->mMacAddr:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2219
    :cond_9
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->clickData:Ljava/lang/String;

    if-eqz v11, :cond_a

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->clickData:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_a

    const-string v11, "clickData"

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kochava/android/tracker/Feature;->clickData:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2221
    :cond_a
    sget-object v11, Lcom/kochava/android/tracker/Feature;->paramRestrictions:Ljava/util/HashMap;

    const-string v12, "fb_attribution_id"

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_b

    .line 2223
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/tracker/Feature;->getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v0, p0

    iput-object v11, v0, Lcom/kochava/android/tracker/Feature;->mFbId:Ljava/lang/String;

    .line 2224
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->mFbId:Ljava/lang/String;

    if-nez v11, :cond_d

    .line 2225
    const-string v11, "fb_attribution_id"

    const-string v12, ""

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2230
    :cond_b
    :goto_0
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v12, "window"

    invoke-virtual {v11, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/WindowManager;

    .line 2231
    .local v10, "wm":Landroid/view/WindowManager;
    new-instance v8, Landroid/util/DisplayMetrics;

    invoke-direct {v8}, Landroid/util/DisplayMetrics;-><init>()V

    .line 2232
    .local v8, "metrics":Landroid/util/DisplayMetrics;
    invoke-interface {v10}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v11

    invoke-virtual {v11, v8}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 2234
    move-object/from16 v0, p0

    iput-object v9, v0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    .line 2235
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/kochava/android/tracker/Feature;->initialObject:Lorg/json/JSONObject;

    .line 2237
    const-string v11, "Initial Event, saving until next event. "

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2291
    .end local v7    # "idsObj":Lorg/json/JSONObject;
    .end local v8    # "metrics":Landroid/util/DisplayMetrics;
    .end local v9    # "propertiesObj":Lorg/json/JSONObject;
    .end local v10    # "wm":Landroid/view/WindowManager;
    :cond_c
    :goto_1
    return-void

    .line 2227
    .restart local v7    # "idsObj":Lorg/json/JSONObject;
    .restart local v9    # "propertiesObj":Lorg/json/JSONObject;
    :cond_d
    const-string v11, "fb_attribution_id"

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/kochava/android/tracker/Feature;->mFbId:Ljava/lang/String;

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 2241
    .end local v7    # "idsObj":Lorg/json/JSONObject;
    :catch_0
    move-exception v4

    .line 2243
    .local v4, "e":Lorg/json/JSONException;
    :try_start_2
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 2244
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "event "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 2274
    .end local v4    # "e":Lorg/json/JSONException;
    .end local v9    # "propertiesObj":Lorg/json/JSONObject;
    :catch_1
    move-exception v4

    .line 2276
    .restart local v4    # "e":Lorg/json/JSONException;
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 2277
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "event "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_1

    .line 2249
    .end local v4    # "e":Lorg/json/JSONException;
    .restart local v9    # "propertiesObj":Lorg/json/JSONObject;
    :catch_2
    move-exception v4

    .line 2251
    .local v4, "e":Ljava/lang/Exception;
    :try_start_3
    const-string v11, "Error during fireEvent - Please review stack trace"

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2252
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 2255
    .end local v4    # "e":Ljava/lang/Exception;
    :cond_e
    :goto_2
    sget-object v11, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    if-eqz v11, :cond_f

    .line 2257
    sget-object v11, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 2259
    .local v6, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v9, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 2263
    .end local v6    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_f
    if-eqz p2, :cond_10

    .line 2265
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 2267
    .restart local v6    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v9, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_4

    .line 2270
    .end local v6    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_10
    const-string v11, "data"

    invoke-virtual {v3, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2272
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "fireEvent with properties: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 2282
    const/4 v11, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/kochava/android/tracker/Feature;->queInitial(Z)V

    .line 2285
    sget-object v11, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    const/4 v12, 0x0

    invoke-virtual {v11, v3, v12}, Lcom/kochava/android/tracker/DbAdapter;->addEvent(Lorg/json/JSONObject;Z)I

    move-result v2

    .line 2289
    .local v2, "count":I
    const/16 v11, 0x32

    if-lt v2, v11, :cond_c

    .line 2290
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    goto/16 :goto_1

    .line 2248
    .end local v2    # "count":I
    :catch_3
    move-exception v11

    goto :goto_2

    .line 2247
    :catch_4
    move-exception v11

    goto :goto_2
.end method

.method private fireEventBlacklist(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .param p1, "eventAction"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2119
    .local p2, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "event_name"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2121
    .local v0, "event_name":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 2123
    sget-object v1, Lcom/kochava/android/tracker/Feature;->eventnameBlacklist:Ljava/util/ArrayList;

    const-string v2, "event_name"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2124
    invoke-direct {p0, p1, p2}, Lcom/kochava/android/tracker/Feature;->fireEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 2130
    :goto_0
    return-void

    .line 2126
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fireEvent - Events under the key \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" are blocked!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_0

    .line 2129
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/kochava/android/tracker/Feature;->fireEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public static flush()V
    .locals 3

    .prologue
    .line 2295
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_0

    .line 2297
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2302
    :goto_0
    return-void

    .line 2300
    :cond_0
    const-string v0, "flush"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2301
    sget-object v0, Lcom/kochava/android/tracker/Feature;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kochava/android/tracker/Feature$TrackTask;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/kochava/android/tracker/Feature$TrackTask;-><init>(Lcom/kochava/android/tracker/Feature$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method private getAd(Landroid/webkit/WebView;Landroid/app/Activity;II)V
    .locals 9
    .param p1, "adWebview"    # Landroid/webkit/WebView;
    .param p2, "context"    # Landroid/app/Activity;
    .param p3, "height"    # I
    .param p4, "width"    # I

    .prologue
    .line 2829
    sget-boolean v1, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v1, :cond_0

    .line 2831
    const-string v1, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3047
    :goto_0
    return-void

    .line 2835
    :cond_0
    new-instance v7, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-class v2, Lcom/kochava/android/tracker/WebAdView;

    invoke-direct {v7, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2838
    .local v7, "cn":Landroid/content/ComponentName;
    :try_start_0
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v7, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v6

    .line 2839
    .local v6, "ai":Landroid/content/pm/ActivityInfo;
    const-string v1, "Ad activity registered."

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2848
    .end local v6    # "ai":Landroid/content/pm/ActivityInfo;
    :goto_1
    new-instance v0, Lcom/kochava/android/tracker/Feature$12;

    move-object v1, p0

    move-object v2, p2

    move v3, p4

    move v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/kochava/android/tracker/Feature$12;-><init>(Lcom/kochava/android/tracker/Feature;Landroid/app/Activity;IILandroid/webkit/WebView;)V

    .line 3044
    .local v0, "getResponse":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 2841
    .end local v0    # "getResponse":Ljava/lang/Thread;
    :catch_0
    move-exception v8

    .line 2844
    .local v8, "e1":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v1, "WEBADVIEW ACTIVITY REGISTRATION MISSING: com.kochava.android.tracker.WebAdView"

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->LogRequirementsError(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private getAdvertisingId()Ljava/lang/String;
    .locals 6

    .prologue
    .line 3255
    :try_start_0
    iget-object v4, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v2

    .line 3256
    .local v2, "availableCode":I
    if-eqz v2, :cond_0

    .line 3259
    packed-switch v2, :pswitch_data_0

    .line 3271
    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned unknown error code ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3275
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Problem getting Advertising ID "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v2}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getErrorString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3279
    :cond_0
    const/4 v0, 0x0

    .line 3282
    .local v0, "adInfo":Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    iget-object v4, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-static {v4}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    .line 3283
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v1

    .line 3284
    .local v1, "adid":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v4

    sput-boolean v4, Lcom/kochava/android/tracker/Feature;->device_limit_tracking:Z

    .line 3293
    .end local v0    # "adInfo":Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .end local v1    # "adid":Ljava/lang/String;
    .end local v2    # "availableCode":I
    :goto_1
    return-object v1

    .line 3261
    .restart local v2    # "availableCode":I
    :pswitch_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned ConnectionResult.SUCCESS ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3288
    .end local v2    # "availableCode":I
    :catch_0
    move-exception v3

    .line 3290
    .local v3, "e":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Problem getting Advertising ID (catch): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3293
    const-string v1, ""

    goto :goto_1

    .line 3263
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v2    # "availableCode":I
    :pswitch_2
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned ConnectionResult.SERVICE_MISSING ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3265
    :pswitch_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3267
    :pswitch_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned ConnectionResult.SERVICE_DISABLED ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3269
    :pswitch_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Google Play Services check returned ConnectionResult.SERVICE_INVALID ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 3259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private getAppPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2349
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppPackageName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2351
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppPackageName:Ljava/lang/String;

    .line 2353
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "Unknown"

    goto :goto_0
.end method

.method private getAppVersion()Ljava/lang/String;
    .locals 2

    .prologue
    .line 2362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mAppName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAttributionData()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1574
    sget-object v0, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 1575
    sget-object v0, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    const-string v1, "attributionData"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1577
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method protected static getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 10
    .param p0, "contentResolver"    # Landroid/content/ContentResolver;

    .prologue
    const/4 v9, 0x0

    .line 3183
    const/4 v6, 0x0

    .line 3184
    .local v6, "attributionId":Ljava/lang/String;
    const/4 v7, 0x0

    .line 3187
    .local v7, "c":Landroid/database/Cursor;
    const/4 v0, 0x1

    :try_start_0
    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "aid"

    aput-object v1, v2, v0

    .line 3188
    .local v2, "projection":[Ljava/lang/String;
    sget-object v1, Lcom/kochava/android/tracker/Feature;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 3190
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 3203
    :cond_0
    if-eqz v7, :cond_1

    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    :cond_1
    :goto_0
    move-object v0, v9

    .line 3209
    .end local v2    # "projection":[Ljava/lang/String;
    :goto_1
    return-object v0

    .line 3193
    .restart local v2    # "projection":[Ljava/lang/String;
    :cond_2
    :try_start_2
    const-string v0, "aid"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v6

    .line 3203
    if-eqz v7, :cond_3

    :try_start_3
    invoke-interface {v7}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_3

    .line 3204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .end local v2    # "projection":[Ljava/lang/String;
    :cond_3
    :goto_2
    move-object v0, v6

    .line 3209
    goto :goto_1

    .line 3195
    :catch_0
    move-exception v8

    .line 3197
    .local v8, "e":Ljava/lang/Exception;
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Problem getting FB attribution ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 3203
    if-eqz v7, :cond_3

    :try_start_5
    invoke-interface {v7}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_3

    .line 3204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    .line 3206
    :catch_1
    move-exception v0

    goto :goto_2

    .line 3201
    .end local v8    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v0

    .line 3203
    if-eqz v7, :cond_4

    :try_start_6
    invoke-interface {v7}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_4

    .line 3204
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 3206
    :cond_4
    :goto_3
    throw v0

    :catch_2
    move-exception v1

    goto :goto_3

    .restart local v2    # "projection":[Ljava/lang/String;
    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method private static getCarrier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2311
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    return-object v0
.end method

.method private static getDeviceId()Ljava/lang/String;
    .locals 4

    .prologue
    .line 2374
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochava_app_id_generated"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochava_app_id_generated"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2375
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochava_app_id_generated"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2385
    .local v0, "result":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 2378
    .end local v0    # "result":Ljava/lang/String;
    :cond_0
    const-string v0, ""

    .line 2380
    .restart local v0    # "result":Ljava/lang/String;
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "-"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2382
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KA"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2384
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "kochava_app_id_generated"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method private getEmailAccounts()Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 3301
    const-string v4, ""

    .line 3302
    .local v4, "email":Ljava/lang/String;
    iget-object v5, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v7, "android.permission.GET_ACCOUNTS"

    invoke-virtual {v5, v7}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v3

    .line 3304
    .local v3, "check":I
    const-string v1, ""

    .line 3307
    .local v1, "accountHolder":Ljava/lang/String;
    if-nez v3, :cond_3

    .line 3309
    iget-object v5, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-static {v5}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v2

    .line 3310
    .local v2, "accounts":[Landroid/accounts/Account;
    array-length v7, v2

    move v5, v6

    :goto_0
    if-ge v5, v7, :cond_1

    aget-object v0, v2, v5

    .line 3312
    .local v0, "account":Landroid/accounts/Account;
    iget-object v8, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-static {v8}, Lcom/kochava/android/tracker/Feature;->isEmailValid(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 3317
    iget-object v8, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 3318
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 3310
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3324
    .end local v0    # "account":Landroid/accounts/Account;
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 3325
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 3338
    .end local v2    # "accounts":[Landroid/accounts/Account;
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 3339
    return-object v4

    .line 3327
    .restart local v2    # "accounts":[Landroid/accounts/Account;
    :cond_2
    const-string v4, ""

    goto :goto_1

    .line 3331
    .end local v2    # "accounts":[Landroid/accounts/Account;
    :cond_3
    const-string v4, ""

    .line 3332
    const-string v5, "****NOTICE**** Gathering of emails was whitelisted, but android.permission.GET_ACCOUNTS declaration was missing from manifest."

    invoke-static {v5}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private getIMEI()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2367
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mIMEI:Ljava/lang/String;

    return-object v0
.end method

.method public static getKochavaDeviceId()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1584
    :try_start_0
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1586
    .local v1, "kochava_device_id":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 1596
    .end local v1    # "kochava_device_id":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 1591
    :catch_0
    move-exception v0

    .line 1593
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1596
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_0
    const-string v1, ""

    goto :goto_0
.end method

.method private static getModel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2320
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method private static getOSVersion()Ljava/lang/String;
    .locals 2

    .prologue
    .line 2329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getOdin()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 2393
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    if-eqz v8, :cond_2

    const-string v8, ""

    iget-object v9, p0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 2395
    const-string v4, ""

    .line 2399
    .local v4, "odin":Ljava/lang/String;
    const-string v8, "SHA-1"

    invoke-static {v8}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 2400
    .local v3, "md":Ljava/security/MessageDigest;
    const/16 v8, 0x28

    new-array v5, v8, [B

    .line 2401
    .local v5, "sha1hash":[B
    iget-object v8, p0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    const-string v9, "iso-8859-1"

    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v8

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v3, v8, v9, v10}, Ljava/security/MessageDigest;->update([BII)V

    .line 2402
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    .line 2406
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2407
    .local v0, "buf":Ljava/lang/StringBuffer;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v8, v5

    if-ge v2, v8, :cond_1

    .line 2409
    aget-byte v8, v5, v2

    ushr-int/lit8 v8, v8, 0x4

    and-int/lit8 v1, v8, 0xf

    .line 2410
    .local v1, "halfbyte":I
    const/4 v6, 0x0

    .local v6, "two_halfs":I
    move v7, v6

    .line 2413
    .end local v6    # "two_halfs":I
    .local v7, "two_halfs":I
    :goto_1
    if-ltz v1, :cond_0

    const/16 v8, 0x9

    if-gt v1, v8, :cond_0

    .line 2414
    add-int/lit8 v8, v1, 0x30

    int-to-char v8, v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 2418
    :goto_2
    aget-byte v8, v5, v2

    and-int/lit8 v1, v8, 0xf

    .line 2419
    add-int/lit8 v6, v7, 0x1

    .end local v7    # "two_halfs":I
    .restart local v6    # "two_halfs":I
    const/4 v8, 0x1

    if-lt v7, v8, :cond_3

    .line 2407
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2416
    .end local v6    # "two_halfs":I
    .restart local v7    # "two_halfs":I
    :cond_0
    add-int/lit8 v8, v1, -0xa

    add-int/lit8 v8, v8, 0x61

    int-to-char v8, v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 2422
    .end local v1    # "halfbyte":I
    .end local v7    # "two_halfs":I
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2428
    .end local v0    # "buf":Ljava/lang/StringBuffer;
    .end local v2    # "i":I
    .end local v3    # "md":Ljava/security/MessageDigest;
    .end local v4    # "odin":Ljava/lang/String;
    .end local v5    # "sha1hash":[B
    :goto_3
    return-object v4

    :cond_2
    const-string v4, ""

    goto :goto_3

    .restart local v0    # "buf":Ljava/lang/StringBuffer;
    .restart local v1    # "halfbyte":I
    .restart local v2    # "i":I
    .restart local v3    # "md":Ljava/security/MessageDigest;
    .restart local v4    # "odin":Ljava/lang/String;
    .restart local v5    # "sha1hash":[B
    .restart local v6    # "two_halfs":I
    :cond_3
    move v7, v6

    .end local v6    # "two_halfs":I
    .restart local v7    # "two_halfs":I
    goto :goto_1
.end method

.method private getUserAgent()Ljava/lang/String;
    .locals 17

    .prologue
    .line 3099
    const-string v11, ""

    .line 3100
    .local v11, "userAgent":Ljava/lang/String;
    const-string v12, ""

    .line 3102
    .local v12, "userAgentResult":Ljava/lang/String;
    const/4 v5, 0x1

    .line 3103
    .local v5, "methodOneSuccess":Z
    const/4 v6, 0x1

    .line 3107
    .local v6, "methodTwoSuccess":Z
    :try_start_0
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nTrying user agent method 1"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 3108
    const-string v13, "http.agent"

    invoke-static {v13}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    .line 3120
    :goto_0
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_0

    .line 3121
    const/4 v5, 0x0

    .line 3124
    :cond_0
    if-nez v5, :cond_1

    .line 3128
    :try_start_1
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nTrying user agent method 2"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 3129
    new-instance v13, Landroid/webkit/WebView;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-direct {v13, v14}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v13}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v13

    invoke-virtual {v13}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v11

    .line 3130
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nMethod 2 successful"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v12

    .line 3143
    :cond_1
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_2

    .line 3144
    const/4 v6, 0x0

    .line 3146
    :cond_2
    if-nez v6, :cond_3

    .line 3148
    const/4 v1, 0x0

    .line 3151
    .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;"
    :try_start_2
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nTrying user agent method 3"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 3152
    const-class v13, Landroid/webkit/WebSettings;

    const/4 v14, 0x2

    new-array v14, v14, [Ljava/lang/Class;

    const/4 v15, 0x0

    const-class v16, Landroid/content/Context;

    aput-object v16, v14, v15

    const/4 v15, 0x1

    const-class v16, Landroid/webkit/WebView;

    aput-object v16, v14, v15

    invoke-virtual {v13, v14}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 3153
    const/4 v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 3154
    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    aput-object v15, v13, v14

    const/4 v14, 0x1

    const/4 v15, 0x0

    aput-object v15, v13, v14

    invoke-virtual {v1, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/webkit/WebSettings;

    .line 3155
    .local v7, "settings":Landroid/webkit/WebSettings;
    invoke-virtual {v7}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v11

    .line 3156
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nMethod 3 successful."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v12

    .line 3167
    if-eqz v1, :cond_3

    .line 3168
    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 3174
    .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;"
    .end local v7    # "settings":Landroid/webkit/WebSettings;
    :cond_3
    :goto_2
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "user agent result: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3176
    return-object v11

    .line 3110
    :catch_0
    move-exception v2

    .line 3113
    .local v2, "e":Ljava/lang/Exception;
    new-instance v8, Ljava/io/StringWriter;

    invoke-direct {v8}, Ljava/io/StringWriter;-><init>()V

    .line 3114
    .local v8, "sw":Ljava/io/StringWriter;
    new-instance v13, Ljava/io/PrintWriter;

    invoke-direct {v13, v8}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v2, v13}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 3115
    invoke-virtual {v8}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3116
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nError with user agent first method: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\n"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v8}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_0

    .line 3132
    .end local v2    # "e":Ljava/lang/Exception;
    .end local v8    # "sw":Ljava/io/StringWriter;
    :catch_1
    move-exception v3

    .line 3135
    .local v3, "ex":Ljava/lang/Exception;
    new-instance v9, Ljava/io/StringWriter;

    invoke-direct {v9}, Ljava/io/StringWriter;-><init>()V

    .line 3136
    .local v9, "sw2":Ljava/io/StringWriter;
    new-instance v13, Ljava/io/PrintWriter;

    invoke-direct {v13, v9}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v3, v13}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 3137
    invoke-virtual {v9}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3138
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nError with user agent second method: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\n"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v9}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\n userAgent = error."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_1

    .line 3158
    .end local v3    # "ex":Ljava/lang/Exception;
    .end local v9    # "sw2":Ljava/io/StringWriter;
    .restart local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;"
    :catch_2
    move-exception v4

    .line 3160
    .local v4, "ex2":Ljava/lang/Exception;
    :try_start_3
    new-instance v10, Ljava/io/StringWriter;

    invoke-direct {v10}, Ljava/io/StringWriter;-><init>()V

    .line 3161
    .local v10, "sw3":Ljava/io/StringWriter;
    new-instance v13, Ljava/io/PrintWriter;

    invoke-direct {v13, v10}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v4, v13}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 3162
    invoke-virtual {v10}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 3163
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\nError with user agent third method: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\n"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v10}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "\n userAgent = error."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v12

    .line 3167
    if-eqz v1, :cond_3

    .line 3168
    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    goto/16 :goto_2

    .line 3167
    .end local v4    # "ex2":Ljava/lang/Exception;
    .end local v10    # "sw3":Ljava/io/StringWriter;
    :catchall_0
    move-exception v13

    if-eqz v1, :cond_4

    .line 3168
    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    :cond_4
    throw v13
.end method

.method private static haveAttributionData()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2334
    sget-object v1, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_0

    .line 2336
    sget-object v1, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 2339
    :cond_0
    return v0
.end method

.method private static httpsError(Ljava/lang/Exception;)V
    .locals 1
    .param p0, "e"    # Ljava/lang/Exception;

    .prologue
    .line 3587
    new-instance v0, Lcom/kochava/android/tracker/Feature$13;

    invoke-direct {v0, p0}, Lcom/kochava/android/tracker/Feature$13;-><init>(Ljava/lang/Exception;)V

    .line 3645
    .local v0, "sendHttpsError":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3646
    return-void
.end method

.method private init(Landroid/content/Context;ZLjava/util/HashMap;)V
    .locals 33
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sendOnStart"    # Z
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Z",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 355
    .local p3, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    if-eqz p1, :cond_1a

    .line 356
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    .line 364
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Feature initialization. Library version: Android20150511"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    sget-object v29, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 366
    sget-object v28, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    if-nez v28, :cond_0

    .line 367
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    .line 369
    :cond_0
    new-instance v28, Ljava/util/Timer;

    invoke-direct/range {v28 .. v28}, Ljava/util/Timer;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->eventFlushTimer:Ljava/util/Timer;

    .line 371
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    const-string v29, "initPrefs"

    const/16 v30, 0x0

    invoke-virtual/range {v28 .. v30}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 374
    new-instance v28, Lcom/kochava/android/tracker/DbAdapter;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v29, v0

    invoke-direct/range {v28 .. v29}, Lcom/kochava/android/tracker/DbAdapter;-><init>(Landroid/content/Context;)V

    sput-object v28, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    .line 377
    if-eqz p3, :cond_5

    .line 379
    const-string v28, "debug"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_1

    const-string v28, "debug"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1

    .line 381
    const-string v28, "debug"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    .line 382
    .local v16, "ed":Z
    invoke-static/range {v16 .. v16}, Lcom/kochava/android/tracker/Feature;->enableDebug(Z)V

    .line 383
    invoke-static/range {v16 .. v16}, Lcom/kochava/android/tracker/Feature;->setErrorDebug(Z)V

    .line 386
    .end local v16    # "ed":Z
    :cond_1
    const-string v28, "version_extension"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_2

    const-string v28, "version_extension"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_2

    .line 388
    const-string v28, "version_extension"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/String;

    sput-object v28, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    .line 391
    :cond_2
    const-string v28, "override_automatic_sessions"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_3

    const-string v28, "override_automatic_sessions"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_3

    .line 393
    const-string v28, "override_automatic_sessions"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v28

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    .line 396
    :cond_3
    const-string v28, "suppress_adid_gather"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_4

    const-string v28, "suppress_adid_gather"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_4

    .line 398
    const-string v28, "suppress_adid_gather"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v28

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->suppress_adid:Z

    .line 401
    :cond_4
    const-string v28, "flush_in_background"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_5

    const-string v28, "flush_in_background"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_5

    .line 403
    const-string v28, "flush_in_background"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v28

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    .line 407
    :cond_5
    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->initHandler()V

    .line 411
    sget v28, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v29, 0xe

    move/from16 v0, v28

    move/from16 v1, v29

    if-lt v0, v1, :cond_1b

    sget-boolean v28, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    if-nez v28, :cond_1b

    .line 413
    const-string v28, "KochavaTracker"

    new-instance v29, Ljava/lang/StringBuilder;

    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    const-string v30, "using automatic sessions, overrideAutomaticSessions= "

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    sget-boolean v30, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    invoke-static/range {v28 .. v29}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 415
    sget-object v28, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    check-cast v28, Landroid/app/Application;

    new-instance v29, Lcom/kochava/android/tracker/Feature$LifeCycleTracker;

    move-object/from16 v0, v29

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/kochava/android/tracker/Feature$LifeCycleTracker;-><init>(Lcom/kochava/android/tracker/Feature;)V

    invoke-virtual/range {v28 .. v29}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 416
    sget-object v28, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    new-instance v29, Lcom/kochava/android/tracker/Feature$MemoryBoss;

    move-object/from16 v0, v29

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/kochava/android/tracker/Feature$MemoryBoss;-><init>(Lcom/kochava/android/tracker/Feature;)V

    invoke-virtual/range {v28 .. v29}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 418
    const/16 v28, 0x1

    sput-boolean v28, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->active:Z

    .line 419
    const/16 v28, 0x1

    sput-boolean v28, Lcom/kochava/android/tracker/Feature$AppLifeCycleStatusManager;->resumed:Z

    .line 455
    :goto_0
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/tracker/Feature;->getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->mFbId:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 463
    :goto_1
    sget-boolean v28, Lcom/kochava/android/tracker/Feature;->suppress_adid:Z

    if-nez v28, :cond_6

    .line 466
    new-instance v24, Lcom/kochava/android/tracker/Feature$2;

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/kochava/android/tracker/Feature$2;-><init>(Lcom/kochava/android/tracker/Feature;)V

    .line 495
    .local v24, "task":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/String;>;"
    const/16 v28, 0x0

    move/from16 v0, v28

    new-array v0, v0, [Ljava/lang/Void;

    move-object/from16 v28, v0

    move-object/from16 v0, v24

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 503
    .end local v24    # "task":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/String;>;"
    :cond_6
    :try_start_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v28

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v29, v0

    invoke-virtual/range {v29 .. v29}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    invoke-virtual/range {v28 .. v30}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v28

    move-object/from16 v0, v28

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->mAppPackageName:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    .line 507
    :goto_2
    new-instance v28, Lorg/json/JSONObject;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    .line 508
    new-instance v28, Lorg/json/JSONObject;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    .line 509
    new-instance v28, Lorg/json/JSONObject;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    .line 511
    const/16 v23, 0x0

    .line 512
    .local v23, "partner_name":Ljava/lang/String;
    const/4 v8, 0x0

    .line 513
    .local v8, "app_id":Ljava/lang/String;
    const/4 v13, 0x0

    .line 514
    .local v13, "currency":Ljava/lang/String;
    const/4 v9, 0x0

    .line 515
    .local v9, "attributionBool":Ljava/lang/String;
    const/4 v10, 0x0

    .line 516
    .local v10, "bidder_host":Ljava/lang/String;
    const/4 v12, 0x0

    .line 519
    .local v12, "control_host":Ljava/lang/String;
    if-eqz p3, :cond_10

    .line 522
    const-string v28, "partner_name"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_7

    const-string v28, "partner_name"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_7

    .line 523
    const-string v28, "partner_name"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    .end local v23    # "partner_name":Ljava/lang/String;
    check-cast v23, Ljava/lang/String;

    .line 526
    .restart local v23    # "partner_name":Ljava/lang/String;
    :cond_7
    const-string v28, "kochava_app_id"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_8

    const-string v28, "kochava_app_id"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_8

    .line 527
    const-string v28, "kochava_app_id"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .end local v8    # "app_id":Ljava/lang/String;
    check-cast v8, Ljava/lang/String;

    .line 530
    .restart local v8    # "app_id":Ljava/lang/String;
    :cond_8
    const-string v28, "currency"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_9

    const-string v28, "currency"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_9

    .line 531
    const-string v28, "currency"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .end local v13    # "currency":Ljava/lang/String;
    check-cast v13, Ljava/lang/String;

    .line 534
    .restart local v13    # "currency":Ljava/lang/String;
    :cond_9
    const-string v28, "request_attribution"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_a

    .line 536
    const-string v28, "request_attribution"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1c

    .line 537
    const-string v28, "request_attribution"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .end local v9    # "attributionBool":Ljava/lang/String;
    check-cast v9, Ljava/lang/String;

    .line 544
    .restart local v9    # "attributionBool":Ljava/lang/String;
    :cond_a
    :goto_3
    const-string v28, "bidder_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_b

    const-string v28, "bidder_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_b

    .line 545
    const-string v28, "bidder_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .end local v10    # "bidder_host":Ljava/lang/String;
    check-cast v10, Ljava/lang/String;

    .line 548
    .restart local v10    # "bidder_host":Ljava/lang/String;
    :cond_b
    const-string v28, "control_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_c

    const-string v28, "control_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    .line 549
    const-string v28, "control_host"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .end local v12    # "control_host":Ljava/lang/String;
    check-cast v12, Ljava/lang/String;

    .line 551
    .restart local v12    # "control_host":Ljava/lang/String;
    :cond_c
    const-string v28, "app_limit_tracking"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_d

    const-string v28, "app_limit_tracking"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_d

    .line 553
    const-string v28, "app_limit_tracking"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 554
    .local v7, "alt":Z
    move-object/from16 v0, p0

    iput-boolean v7, v0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 557
    .end local v7    # "alt":Z
    :cond_d
    const-string v28, "identity_link"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_e

    const-string v28, "identity_link"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v0, v28

    instance-of v0, v0, Ljava/util/HashMap;

    move/from16 v28, v0

    if-eqz v28, :cond_e

    .line 561
    :try_start_2
    const-string v28, "identity_link"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/util/HashMap;

    sput-object v28, Lcom/kochava/android/tracker/Feature;->identityLinkMap:Ljava/util/Map;

    .line 562
    new-instance v28, Lorg/json/JSONObject;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONObject;-><init>()V

    sput-object v28, Lcom/kochava/android/tracker/Feature;->identityLinkMapJSON:Lorg/json/JSONObject;

    .line 564
    sget-object v28, Lcom/kochava/android/tracker/Feature;->identityLinkMap:Ljava/util/Map;

    invoke-interface/range {v28 .. v28}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v28

    invoke-interface/range {v28 .. v28}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .line 565
    .local v19, "it":Ljava/util/Iterator;
    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_e

    .line 567
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/util/Map$Entry;

    .line 568
    .local v22, "pairs":Ljava/util/Map$Entry;
    sget-object v30, Lcom/kochava/android/tracker/Feature;->identityLinkMapJSON:Lorg/json/JSONObject;

    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/String;

    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v29

    check-cast v29, Ljava/lang/String;

    move-object/from16 v0, v30

    move-object/from16 v1, v28

    move-object/from16 v2, v29

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 569
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->remove()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    .line 572
    .end local v19    # "it":Ljava/util/Iterator;
    .end local v22    # "pairs":Ljava/util/Map$Entry;
    :catch_0
    move-exception v28

    .line 578
    :cond_e
    const-string v28, "clickData"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_f

    const-string v28, "clickData"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/String;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_f

    .line 579
    const-string v28, "clickData"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/String;

    move-object/from16 v0, v28

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/kochava/android/tracker/Feature;->clickData:Ljava/lang/String;

    .line 581
    :cond_f
    const-string v28, "flush_rate"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    if-eqz v28, :cond_10

    const-string v28, "flush_rate"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Integer;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    .line 583
    const-string v28, "flush_rate"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Integer;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v26

    .line 584
    .local v26, "user_flush_rate":I
    const/16 v28, 0x1

    move/from16 v0, v26

    move/from16 v1, v28

    if-ge v0, v1, :cond_1d

    .line 586
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Trying to set flush rate to: "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, ". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 1 minute."

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 604
    .end local v26    # "user_flush_rate":I
    :cond_10
    :goto_5
    if-eqz v12, :cond_11

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_11

    .line 606
    sput-object v12, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    .line 609
    :cond_11
    if-eqz v10, :cond_12

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_12

    .line 611
    sput-object v10, Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;

    .line 618
    :cond_12
    if-eqz v13, :cond_13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_13

    .line 619
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/kochava/android/tracker/Feature;->setCurrency(Ljava/lang/String;)V

    .line 623
    :cond_13
    if-eqz v9, :cond_14

    const-string v28, "true"

    move-object/from16 v0, v28

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v28

    if-eqz v28, :cond_14

    .line 625
    const/16 v28, 0x1

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->requestAttributionData:Z

    .line 628
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    const-string v29, "attributionPref"

    const/16 v30, 0x0

    invoke-virtual/range {v28 .. v30}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->attributionDataPrefs:Landroid/content/SharedPreferences;

    .line 633
    if-eqz v8, :cond_1f

    :try_start_3
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_1f

    .line 637
    sput-object v8, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "kochava_app_id"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 639
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "kochava_app_id"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 643
    sget-object v28, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v29, "kochavaappdata"

    const-string v30, ""

    invoke-interface/range {v28 .. v30}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-string v29, ""

    invoke-virtual/range {v28 .. v29}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_15

    .line 645
    sget-object v28, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface/range {v28 .. v28}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v28

    const-string v29, "kochavaappdata"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-interface {v0, v1, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v28

    invoke-interface/range {v28 .. v28}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 680
    :cond_15
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "package"

    invoke-direct/range {p0 .. p0}, Lcom/kochava/android/tracker/Feature;->getAppPackageName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 681
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "platform"

    const-string v30, "android"

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 682
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "session_tracking"

    const-string v30, "full"

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 695
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "currency"

    sget-object v30, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v31, "currency"

    const-string v32, "USD"

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 702
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "currency"

    sget-object v30, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v31, "currency"

    const-string v32, "USD"

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 703
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "session_tracking"

    const-string v30, "full"

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 705
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "currency"

    sget-object v30, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v31, "currency"

    const-string v32, "USD"

    invoke-interface/range {v30 .. v32}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 707
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "sdk_version"

    new-instance v30, Ljava/lang/StringBuilder;

    invoke-direct/range {v30 .. v30}, Ljava/lang/StringBuilder;-><init>()V

    const-string v31, "Android20150511"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    sget-object v31, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 708
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "sdk_protocol"

    const-string v30, "3"

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 711
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "data"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v30, v0

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 713
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "data_orig"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v30, v0

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 724
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v28

    const-wide/16 v30, 0x3e8

    div-long v28, v28, v30

    sput-wide v28, Lcom/kochava/android/tracker/Feature;->startTime:J

    .line 728
    const/16 v20, 0x0

    .line 729
    .local v20, "missing":Z
    const-string v21, ""

    .line 731
    .local v21, "missingItems":Ljava/lang/String;
    new-instance v11, Landroid/content/ComponentName;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    const-class v29, Lcom/kochava/android/tracker/ReferralCapture;

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-direct {v11, v0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 734
    .local v11, "cn":Landroid/content/ComponentName;
    :try_start_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v28

    const/16 v29, 0x0

    move-object/from16 v0, v28

    move/from16 v1, v29

    invoke-virtual {v0, v11, v1}, Landroid/content/pm/PackageManager;->getReceiverInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v6

    .line 735
    .local v6, "ai":Landroid/content/pm/ActivityInfo;
    const-string v28, "Receiver registered."

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_2

    .line 758
    .end local v6    # "ai":Landroid/content/pm/ActivityInfo;
    :goto_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v28

    const-string v29, "android.permission.ACCESS_NETWORK_STATE"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v28

    if-gez v28, :cond_16

    .line 760
    const/16 v20, 0x1

    .line 761
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "\n    PERMMISION MISSING: android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 765
    :cond_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v28

    const-string v29, "android.permission.INTERNET"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v28

    if-gez v28, :cond_17

    .line 767
    const/16 v20, 0x1

    .line 768
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "\n    PERMMISION MISSING: android.permission.INTERNET"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 772
    :cond_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v28

    const-string v29, "android.permission.ACCESS_WIFI_STATE"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v30, v0

    invoke-virtual/range {v30 .. v30}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v28

    if-gez v28, :cond_18

    .line 774
    const/16 v20, 0x1

    .line 775
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "\n    PERMMISION MISSING: android.permission.ACCESS_WIFI_STATE"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 779
    :cond_18
    if-eqz v20, :cond_19

    .line 781
    const-string v28, "**NOTICE** The following items may not have been implemented correctly. Please refer to the SDK documentation to resolve these issues:"

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->LogRequirementsError(Ljava/lang/String;)V

    .line 782
    invoke-static/range {v21 .. v21}, Lcom/kochava/android/util/Logging;->LogRequirementsError(Ljava/lang/String;)V

    .line 789
    :cond_19
    :try_start_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    const-string v29, "phone"

    invoke-virtual/range {v28 .. v29}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Landroid/telephony/TelephonyManager;

    .line 790
    .local v25, "telephonyManager":Landroid/telephony/TelephonyManager;
    invoke-virtual/range {v25 .. v25}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->mIMEI:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 806
    .end local v25    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :goto_9
    :try_start_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    move-object/from16 v28, v0

    const-string v29, "wifi"

    invoke-virtual/range {v28 .. v29}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Landroid/net/wifi/WifiManager;

    .line 807
    .local v27, "wimanager":Landroid/net/wifi/WifiManager;
    invoke-virtual/range {v27 .. v27}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->mMacAddr:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 825
    .end local v27    # "wimanager":Landroid/net/wifi/WifiManager;
    :goto_a
    :try_start_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "kochava_device_id"

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v28 .. v30}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_4

    .line 835
    :goto_b
    new-instance v18, Lcom/kochava/android/tracker/Feature$3;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/kochava/android/tracker/Feature$3;-><init>(Lcom/kochava/android/tracker/Feature;Z)V

    .line 1196
    .local v18, "getKVinit":Ljava/lang/Runnable;
    sget-object v28, Lcom/kochava/android/tracker/Feature;->worker:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v30, 0x5

    sget-object v29, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v0, v28

    move-object/from16 v1, v18

    move-wide/from16 v2, v30

    move-object/from16 v4, v29

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1198
    const-string v28, "init"

    move-object/from16 v0, p0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/kochava/android/tracker/Feature;->tryUpdate(Ljava/lang/String;)V

    .line 1201
    .end local v8    # "app_id":Ljava/lang/String;
    .end local v9    # "attributionBool":Ljava/lang/String;
    .end local v10    # "bidder_host":Ljava/lang/String;
    .end local v11    # "cn":Landroid/content/ComponentName;
    .end local v12    # "control_host":Ljava/lang/String;
    .end local v13    # "currency":Ljava/lang/String;
    .end local v18    # "getKVinit":Ljava/lang/Runnable;
    .end local v20    # "missing":Z
    .end local v21    # "missingItems":Ljava/lang/String;
    .end local v23    # "partner_name":Ljava/lang/String;
    :goto_c
    return-void

    .line 359
    :cond_1a
    const-string v28, "Context you passed was null, cannot initialize."

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 360
    const/16 v28, 0x1

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->badInit:Z

    goto :goto_c

    .line 424
    :cond_1b
    const-string v28, "KochavaTracker"

    new-instance v29, Ljava/lang/StringBuilder;

    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    const-string v30, "not using automatic sessions, overrideAutomaticSessions= "

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    sget-boolean v30, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    invoke-static/range {v28 .. v29}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 538
    .restart local v8    # "app_id":Ljava/lang/String;
    .restart local v9    # "attributionBool":Ljava/lang/String;
    .restart local v10    # "bidder_host":Ljava/lang/String;
    .restart local v12    # "control_host":Ljava/lang/String;
    .restart local v13    # "currency":Ljava/lang/String;
    .restart local v23    # "partner_name":Ljava/lang/String;
    :cond_1c
    const-string v28, "request_attribution"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v28

    const-class v29, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v29}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_a

    .line 539
    const-string v28, "request_attribution"

    move-object/from16 v0, p3

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Ljava/lang/Boolean;

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v28

    if-eqz v28, :cond_a

    .line 540
    const-string v9, "true"

    goto/16 :goto_3

    .line 588
    .restart local v26    # "user_flush_rate":I
    :cond_1d
    const/16 v28, 0x168

    move/from16 v0, v26

    move/from16 v1, v28

    if-le v0, v1, :cond_1e

    .line 590
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Trying to set flush rate to: "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, ". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 6 hours."

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 591
    const v28, 0x1499700

    sput v28, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    goto/16 :goto_5

    .line 595
    :cond_1e
    mul-int/lit8 v28, v26, 0x3c

    move/from16 v0, v28

    mul-int/lit16 v0, v0, 0x3e8

    move/from16 v28, v0

    sput v28, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    .line 596
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Flush rate set to "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, " minutes."

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 648
    .end local v26    # "user_flush_rate":I
    :cond_1f
    if-eqz v23, :cond_22

    :try_start_8
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_22

    .line 651
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "partner_name"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    move-object/from16 v2, v23

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 656
    sget-object v28, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v29, "kochavaappdata"

    const-string v30, ""

    invoke-interface/range {v28 .. v30}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-string v29, ""

    invoke-virtual/range {v28 .. v29}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_20

    .line 658
    sget-object v28, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface/range {v28 .. v28}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v28

    const-string v29, "kochavaappdata"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    move-object/from16 v2, v23

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v28

    invoke-interface/range {v28 .. v28}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 662
    :cond_20
    if-eqz v8, :cond_21

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    if-eqz v28, :cond_21

    .line 664
    sput-object v8, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    .line 665
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitdataholder:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "kochava_app_id"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 666
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature;->kvinitorigdata:Lorg/json/JSONObject;

    move-object/from16 v28, v0

    const-string v29, "kochava_app_id"

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_1

    goto/16 :goto_6

    .line 716
    :catch_1
    move-exception v14

    .line 718
    .local v14, "e":Lorg/json/JSONException;
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Error building KVinit json object: "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual {v14}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_7

    .line 670
    .end local v14    # "e":Lorg/json/JSONException;
    :cond_21
    :try_start_9
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "_p:"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    sput-object v28, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    goto/16 :goto_6

    .line 675
    :cond_22
    const-string v28, "You must pass either an app id, or a partner name into the datamap during initialization."

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 676
    const/16 v28, 0x1

    sput-boolean v28, Lcom/kochava/android/tracker/Feature;->badInit:Z
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_c

    .line 737
    .restart local v11    # "cn":Landroid/content/ComponentName;
    .restart local v20    # "missing":Z
    .restart local v21    # "missingItems":Ljava/lang/String;
    :catch_2
    move-exception v15

    .line 739
    .local v15, "e1":Landroid/content/pm/PackageManager$NameNotFoundException;
    const/16 v20, 0x1

    .line 740
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v28

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "\n    BROADCAST RECEIVER REGISTRATION MISSING: com.kochava.android.tracker.ReferralCapture"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    goto/16 :goto_8

    .line 799
    .end local v15    # "e1":Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_3
    move-exception v17

    .line 801
    .local v17, "exc":Ljava/lang/Exception;
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "Couldn\'t gather IMEI: "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_9

    .line 827
    .end local v17    # "exc":Ljava/lang/Exception;
    :catch_4
    move-exception v15

    .line 829
    .local v15, "e1":Lorg/json/JSONException;
    invoke-virtual {v15}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_b

    .line 808
    .end local v15    # "e1":Lorg/json/JSONException;
    :catch_5
    move-exception v28

    goto/16 :goto_a

    .line 505
    .end local v8    # "app_id":Ljava/lang/String;
    .end local v9    # "attributionBool":Ljava/lang/String;
    .end local v10    # "bidder_host":Ljava/lang/String;
    .end local v11    # "cn":Landroid/content/ComponentName;
    .end local v12    # "control_host":Ljava/lang/String;
    .end local v13    # "currency":Ljava/lang/String;
    .end local v20    # "missing":Z
    .end local v21    # "missingItems":Ljava/lang/String;
    .end local v23    # "partner_name":Ljava/lang/String;
    :catch_6
    move-exception v28

    goto/16 :goto_2

    .line 457
    :catch_7
    move-exception v28

    goto/16 :goto_1
.end method

.method private initHandler()V
    .locals 1

    .prologue
    .line 2435
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 2436
    new-instance v0, Lcom/kochava/android/tracker/Feature$10;

    invoke-direct {v0, p0}, Lcom/kochava/android/tracker/Feature$10;-><init>(Lcom/kochava/android/tracker/Feature;)V

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->initHandler:Landroid/os/Handler;

    .line 2483
    :cond_0
    return-void
.end method

.method private initialHandlerActions()V
    .locals 13

    .prologue
    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 2489
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->getUserAgent()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;

    .line 2492
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getCarrier()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mCarrier:Ljava/lang/String;

    .line 2493
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getModel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mModel:Ljava/lang/String;

    .line 2494
    const-string v0, "Default"

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppName:Ljava/lang/String;

    .line 2495
    const-string v0, "N/A"

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionCode:Ljava/lang/String;

    .line 2496
    const-string v0, ""

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    .line 2500
    :try_start_0
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 2504
    .local v11, "pm":Landroid/content/pm/PackageManager;
    :try_start_1
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    .line 2512
    .local v6, "ai":Landroid/content/pm/ApplicationInfo;
    :goto_0
    if-eqz v6, :cond_6

    :try_start_2
    invoke-virtual {v11, v6}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppName:Ljava/lang/String;

    .line 2514
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mAppName now: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mAppName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 2523
    .end local v6    # "ai":Landroid/content/pm/ApplicationInfo;
    .end local v11    # "pm":Landroid/content/pm/PackageManager;
    :goto_2
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionCode:Ljava/lang/String;

    .line 2524
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mAppVersionCode now: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 2533
    :goto_3
    :try_start_4
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    .line 2534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mAppVersionName now: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->mAppVersionName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 2543
    :goto_4
    :try_start_5
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/WindowManager;

    .line 2544
    .local v12, "wm":Landroid/view/WindowManager;
    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/kochava/android/tracker/Feature;->mDisplayHeight:I

    .line 2545
    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/kochava/android/tracker/Feature;->mDisplayWidth:I

    .line 2546
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/kochava/android/tracker/Feature;->mDisplayHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " | Width: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/kochava/android/tracker/Feature;->mDisplayWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 2556
    .end local v12    # "wm":Landroid/view/WindowManager;
    :goto_5
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mAndroidID:Ljava/lang/String;

    .line 2568
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->mDeviceId:Ljava/lang/String;

    .line 2575
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v1, "initPrefs"

    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 2576
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "initBool"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2578
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "initBool"

    const-string v2, "false"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2581
    :cond_0
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "kochavaappdata"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 2584
    sget-object v0, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochavaappdata"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kochava/android/tracker/DbAdapter;->getApplicationData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2586
    .local v8, "dd":Ljava/lang/String;
    invoke-direct {p0}, Lcom/kochava/android/tracker/Feature;->createAppData()Ljava/lang/String;

    move-result-object v10

    .line 2590
    .local v10, "kk":Ljava/lang/String;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stored Data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2591
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Created Data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2595
    if-nez v8, :cond_7

    .line 2597
    sget-object v0, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochavaappdata"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Lcom/kochava/android/tracker/DbAdapter;->insertApplicationData(Ljava/lang/String;Ljava/lang/String;)V

    .line 2617
    .end local v8    # "dd":Ljava/lang/String;
    .end local v10    # "kk":Ljava/lang/String;
    :goto_6
    iget-boolean v0, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "initBool"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "initBool"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "false"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2619
    :cond_1
    const-string v0, "Initial event has not yet been qued in the database, making initial call"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2620
    const-string v0, "initial"

    invoke-direct {p0, v0, v4}, Lcom/kochava/android/tracker/Feature;->fireEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 2626
    :cond_2
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_3

    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_4

    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->is_in_background:Z

    if-nez v0, :cond_4

    :cond_3
    const/4 v7, 0x1

    .line 2629
    .local v7, "can_start_initial_flush_timer":Z
    :cond_4
    if-eqz v7, :cond_5

    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    if-nez v0, :cond_5

    .line 2631
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    .line 2632
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    new-instance v1, Lcom/kochava/android/tracker/Feature$11;

    invoke-direct {v1, p0}, Lcom/kochava/android/tracker/Feature$11;-><init>(Lcom/kochava/android/tracker/Feature;)V

    const-wide/16 v2, 0x0

    sget v4, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 2644
    :cond_5
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/kochava/android/tracker/Feature;->initTimer:Ljava/util/Timer;

    .line 2645
    return-void

    .line 2506
    .end local v7    # "can_start_initial_flush_timer":Z
    .restart local v11    # "pm":Landroid/content/pm/PackageManager;
    :catch_0
    move-exception v9

    .line 2508
    .local v9, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const/4 v6, 0x0

    .line 2509
    .restart local v6    # "ai":Landroid/content/pm/ApplicationInfo;
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error gathering app name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_0

    .line 2516
    .end local v6    # "ai":Landroid/content/pm/ApplicationInfo;
    .end local v9    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    .end local v11    # "pm":Landroid/content/pm/PackageManager;
    :catch_1
    move-exception v9

    .line 2518
    .local v9, "e":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error gathering app name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 2512
    .end local v9    # "e":Ljava/lang/Exception;
    .restart local v6    # "ai":Landroid/content/pm/ApplicationInfo;
    .restart local v11    # "pm":Landroid/content/pm/PackageManager;
    :cond_6
    :try_start_7
    const-string v0, "(unknown)"
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_1

    .line 2526
    .end local v6    # "ai":Landroid/content/pm/ApplicationInfo;
    .end local v11    # "pm":Landroid/content/pm/PackageManager;
    :catch_2
    move-exception v9

    .line 2528
    .restart local v9    # "e":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error gathering app version code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 2536
    .end local v9    # "e":Ljava/lang/Exception;
    :catch_3
    move-exception v9

    .line 2538
    .restart local v9    # "e":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error gathering app version name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 2549
    .end local v9    # "e":Ljava/lang/Exception;
    :catch_4
    move-exception v9

    .line 2551
    .restart local v9    # "e":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 2599
    .end local v9    # "e":Ljava/lang/Exception;
    .restart local v8    # "dd":Ljava/lang/String;
    .restart local v10    # "kk":Ljava/lang/String;
    :cond_7
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 2601
    sget-object v0, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "kochavaappdata"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Lcom/kochava/android/tracker/DbAdapter;->updateApplicationData(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 2605
    :cond_8
    const-string v0, "Set start of life to false"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2606
    iput-boolean v7, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    goto/16 :goto_6

    .line 2611
    .end local v8    # "dd":Ljava/lang/String;
    .end local v10    # "kk":Ljava/lang/String;
    :cond_9
    iput-boolean v7, p0, Lcom/kochava/android/tracker/Feature;->mIsStartOfLife:Z

    goto/16 :goto_6
.end method

.method private static isEmailValid(Ljava/lang/String;)Z
    .locals 6
    .param p0, "email"    # Ljava/lang/String;

    .prologue
    .line 3345
    const/4 v2, 0x0

    .line 3347
    .local v2, "isValid":Z
    const-string v0, "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"

    .line 3348
    .local v0, "expression":Ljava/lang/String;
    move-object v1, p0

    .line 3350
    .local v1, "inputStr":Ljava/lang/CharSequence;
    const/4 v5, 0x2

    invoke-static {v0, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 3351
    .local v4, "pattern":Ljava/util/regex/Pattern;
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 3352
    .local v3, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 3353
    const/4 v2, 0x1

    .line 3355
    :cond_0
    return v2
.end method

.method private static postEvent()Ljava/lang/String;
    .locals 16

    .prologue
    .line 2649
    sget-object v13, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v14, "initBool"

    const-string v15, ""

    invoke-interface {v13, v14, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "true"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    .line 2651
    const-string v13, "PREF_INIT not true, waiting for initial to be queued"

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2652
    const-string v8, ""

    .line 2785
    .local v1, "data":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v8

    .line 2656
    .end local v1    # "data":Ljava/lang/String;
    :cond_1
    sget-object v13, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    invoke-virtual {v13}, Lcom/kochava/android/tracker/DbAdapter;->generateDataString()Ljava/lang/String;

    move-result-object v1

    .line 2657
    .restart local v1    # "data":Ljava/lang/String;
    if-nez v1, :cond_2

    .line 2660
    const-string v8, ""

    goto :goto_0

    .line 2662
    :cond_2
    new-instance v12, Ljava/util/StringTokenizer;

    const-string v13, "="

    invoke-direct {v12, v1, v13}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2663
    .local v12, "tok":Ljava/util/StringTokenizer;
    invoke-virtual {v12}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 2664
    .local v10, "timestamp":J
    invoke-virtual {v12}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    .line 2666
    const-string v13, "["

    invoke-virtual {v1, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 2668
    const/4 v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 2670
    :cond_3
    const-string v13, "]"

    invoke-virtual {v1, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 2672
    const/4 v13, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v14

    add-int/lit8 v14, v14, -0x1

    invoke-virtual {v1, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 2676
    :cond_4
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Post The Data 3>>>>>>"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2678
    const/4 v6, 0x0

    .line 2680
    .local v6, "isInitial":Z
    const-string v13, "\"action\":\"initial\""

    invoke-virtual {v1, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 2682
    const-string v13, "Post Data: Event is initial, look at response"

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2683
    const/4 v6, 0x1

    .line 2686
    :cond_5
    const/4 v13, 0x0

    invoke-static {v13}, Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v4

    .line 2691
    .local v4, "httpclient":Lorg/apache/http/client/HttpClient;
    invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v13

    sget-object v14, Lcom/kochava/android/tracker/Feature;->mUserAgent:Ljava/lang/String;

    invoke-static {v13, v14}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 2693
    sget-object v13, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    if-eqz v13, :cond_6

    sget-object v13, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_7

    .line 2695
    :cond_6
    const-string v13, "postEvent - hostControl was empty, using default"

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2696
    const-string v13, "control.kochava.com"

    sput-object v13, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    .line 2700
    :cond_7
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "postEvent - posting to "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "https://"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    sget-object v14, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "/track/kvTracker.php"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2701
    new-instance v5, Lorg/apache/http/client/methods/HttpPost;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "https://"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    sget-object v14, Lcom/kochava/android/tracker/Feature;->hostControl:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "/track/kvTracker.php"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v5, v13}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 2711
    .local v5, "httppost":Lorg/apache/http/client/methods/HttpPost;
    :try_start_0
    new-instance v9, Lorg/apache/http/entity/StringEntity;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "["

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "]"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v14, "UTF-8"

    invoke-direct {v9, v13, v14}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2712
    .local v9, "sentity":Lorg/apache/http/entity/StringEntity;
    new-instance v0, Lorg/apache/http/message/BasicHeader;

    const-string v13, "Content-Type"

    const-string v14, "application/xml"

    invoke-direct {v0, v13, v14}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2713
    .local v0, "basicHeader":Lorg/apache/http/message/BasicHeader;
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v13

    const-string v14, "http.protocol.expect-continue"

    const/4 v15, 0x0

    invoke-interface {v13, v14, v15}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;

    .line 2714
    invoke-virtual {v9, v0}, Lorg/apache/http/entity/StringEntity;->setContentType(Lorg/apache/http/Header;)V

    .line 2715
    invoke-virtual {v5, v9}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 2716
    const-string v13, "Trying to post an event."

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2717
    invoke-interface {v4, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v7

    .line 2718
    .local v7, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v7}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 2719
    .local v3, "entity":Lorg/apache/http/HttpEntity;
    if-nez v3, :cond_8

    .line 2720
    const-string v8, ""
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    goto/16 :goto_0

    .line 2724
    :cond_8
    :try_start_1
    const-string v13, "Grabbing Result..."

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2725
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/StringUtils;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v8

    .line 2726
    .local v8, "result":Ljava/lang/String;
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Result: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2728
    if-eqz v6, :cond_a

    .line 2730
    const-string v13, "\"success\":\"1\""

    invoke-virtual {v8, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_9

    .line 2733
    const-string v13, "Got success response, cleaning database."

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2734
    sget-object v13, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    invoke-virtual {v13, v10, v11}, Lcom/kochava/android/tracker/DbAdapter;->cleanupEvents(J)V

    .line 2738
    :cond_9
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->haveAttributionData()Z

    move-result v13

    if-nez v13, :cond_0

    sget-boolean v13, Lcom/kochava/android/tracker/Feature;->requestAttributionData:Z

    if-eqz v13, :cond_0

    .line 2740
    const-string v13, "Requesting attribution data..."

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2741
    const/4 v13, 0x7

    invoke-static {v13}, Lcom/kochava/android/tracker/Feature;->sendKVQuery(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_0

    .line 2753
    .end local v8    # "result":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 2755
    .local v2, "e":Ljava/io/IOException;
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const-class v14, Ljavax/net/ssl/SSLException;

    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    .line 2757
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "SSLException! Shutting down SDK and sending report."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2758
    invoke-static {v2}, Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V

    .line 2762
    :goto_1
    const-string v8, ""
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto/16 :goto_0

    .line 2747
    .end local v2    # "e":Ljava/io/IOException;
    .restart local v8    # "result":Ljava/lang/String;
    :cond_a
    :try_start_3
    sget-object v13, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    invoke-virtual {v13, v10, v11}, Lcom/kochava/android/tracker/DbAdapter;->cleanupEvents(J)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_0

    .line 2764
    .end local v8    # "result":Ljava/lang/String;
    :catch_1
    move-exception v2

    .line 2766
    .local v2, "e":Ljava/lang/OutOfMemoryError;
    :try_start_4
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "TrackTask "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2767
    const-string v8, ""

    goto/16 :goto_0

    .line 2761
    .local v2, "e":Ljava/io/IOException;
    :cond_b
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "TrackTask "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    .line 2771
    .end local v0    # "basicHeader":Lorg/apache/http/message/BasicHeader;
    .end local v2    # "e":Ljava/io/IOException;
    .end local v3    # "entity":Lorg/apache/http/HttpEntity;
    .end local v7    # "response":Lorg/apache/http/HttpResponse;
    .end local v9    # "sentity":Lorg/apache/http/entity/StringEntity;
    :catch_2
    move-exception v2

    .line 2773
    .local v2, "e":Lorg/apache/http/client/ClientProtocolException;
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "TrackTask "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2774
    const-string v8, ""

    goto/16 :goto_0

    .line 2776
    .end local v2    # "e":Lorg/apache/http/client/ClientProtocolException;
    :catch_3
    move-exception v2

    .line 2778
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const-class v14, Ljavax/net/ssl/SSLException;

    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    .line 2780
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "SSLException! Shutting down SDK and sending report."

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2781
    invoke-static {v2}, Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V

    .line 2785
    :goto_2
    const-string v8, ""

    goto/16 :goto_0

    .line 2784
    :cond_c
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "TrackTask "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private queInitial(Z)V
    .locals 6
    .param p1, "cancelTimer"    # Z

    .prologue
    .line 2793
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "initBool"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "false"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initialObject:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    .line 2797
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Initial properties: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2798
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Initital Oject: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/kochava/android/tracker/Feature;->initialObject:Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2799
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "initData"

    const-string v3, "noData"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "noData"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2801
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    const-string v2, "conversion_type"

    const-string v3, "gplay"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2802
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    const-string v2, "conversion_data"

    sget-object v3, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v4, "initData"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2803
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got referral, attaching: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    const-string v3, "initData"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2809
    :goto_0
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initialObject:Lorg/json/JSONObject;

    const-string v2, "data"

    iget-object v3, p0, Lcom/kochava/android/tracker/Feature;->initialPropertiesObject:Lorg/json/JSONObject;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2810
    sget-object v1, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    iget-object v2, p0, Lcom/kochava/android/tracker/Feature;->initialObject:Lorg/json/JSONObject;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/kochava/android/tracker/DbAdapter;->addEvent(Lorg/json/JSONObject;Z)I

    .line 2811
    const-string v1, "Sending Initial"

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2812
    sget-object v1, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "initBool"

    const-string v3, "true"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2813
    if-eqz p1, :cond_0

    .line 2814
    iget-object v1, p0, Lcom/kochava/android/tracker/Feature;->initTimer:Ljava/util/Timer;

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 2822
    :cond_0
    :goto_1
    return-void

    .line 2807
    :cond_1
    const-string v1, "Did not get referral data."

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2816
    :catch_0
    move-exception v0

    .line 2818
    .local v0, "e":Lorg/json/JSONException;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An error occured during que initial. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2819
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method protected static sendKVQuery(I)V
    .locals 5
    .param p0, "delay"    # I

    .prologue
    .line 1394
    sget-object v0, Lcom/kochava/android/tracker/Feature;->worker:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Lcom/kochava/android/tracker/Feature;->sendKVQuery:Ljava/lang/Runnable;

    int-to-long v2, p0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1395
    return-void
.end method

.method public static setAttributionHandler(Landroid/os/Handler;)V
    .locals 0
    .param p0, "delegate"    # Landroid/os/Handler;

    .prologue
    .line 1927
    sput-object p0, Lcom/kochava/android/tracker/Feature;->attributionDataHandler:Landroid/os/Handler;

    .line 1928
    return-void
.end method

.method private setCurrency(Ljava/lang/String;)V
    .locals 3
    .param p1, "cur"    # Ljava/lang/String;

    .prologue
    .line 1704
    if-eqz p1, :cond_0

    sget-object v0, Lcom/kochava/android/tracker/Global;->CURRENCYLIST:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1706
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v1, "initPrefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 1708
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "currency"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1714
    :goto_0
    return-void

    .line 1712
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to set currency, but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not a valid currency."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static setErrorDebug(Z)V
    .locals 3
    .param p0, "flag"    # Z

    .prologue
    .line 3084
    const-string v0, "KochavaTracker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setErrorDebug to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3085
    sput-boolean p0, Lcom/kochava/android/tracker/Global;->DEBUGERROR:Z

    .line 3086
    return-void
.end method

.method private static startAppSession()V
    .locals 6

    .prologue
    .line 1783
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    if-nez v0, :cond_0

    .line 1785
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_1

    .line 1787
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1830
    :cond_0
    :goto_0
    return-void

    .line 1791
    :cond_1
    const-string v0, "Automatic Session start"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1793
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_2

    .line 1795
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    if-nez v0, :cond_3

    .line 1797
    const-string v0, "Session start, flush timer was off and is not first launch, starting periodic flush timer."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1799
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    .line 1800
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    new-instance v1, Lcom/kochava/android/tracker/Feature$7;

    invoke-direct {v1}, Lcom/kochava/android/tracker/Feature$7;-><init>()V

    sget v2, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    int-to-long v2, v2

    sget v4, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 1814
    :cond_2
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    sput-wide v0, Lcom/kochava/android/tracker/Feature;->startTime:J

    .line 1817
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    if-eqz v0, :cond_4

    .line 1819
    const-string v0, "launch"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->eventSession(Ljava/lang/String;)V

    goto :goto_0

    .line 1810
    :cond_3
    const-string v0, "Session start, flush timer was already on."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_1

    .line 1823
    :cond_4
    const-string v0, "Session events disabled by server."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public clearSuperProperties()V
    .locals 1

    .prologue
    .line 1693
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_0

    .line 1695
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1700
    :goto_0
    return-void

    .line 1698
    :cond_0
    const-string v0, "clearSuperProperties"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1699
    const/4 v0, 0x0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    goto :goto_0
.end method

.method public deepLinkEvent(Ljava/lang/String;)V
    .locals 10
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 2006
    sget-boolean v4, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v4, :cond_1

    .line 2008
    const-string v4, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2042
    :cond_0
    :goto_0
    return-void

    .line 2014
    :cond_1
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got deep link event with uri"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2016
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 2017
    .local v2, "deepLinkChunk":Lorg/json/JSONObject;
    const-string v4, "action"

    const-string v5, "deeplink"

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2018
    const-string v4, "kochava_app_id"

    sget-object v5, Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2019
    const-string v4, "kochava_device_id"

    invoke-static {}, Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2022
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 2023
    .local v1, "dataChunk":Lorg/json/JSONObject;
    const-string v4, "uri"

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2024
    const-string v4, "usertime"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2026
    const-string v4, "data"

    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2029
    sget-object v4, Lcom/kochava/android/tracker/Feature;->kDbAdapter:Lcom/kochava/android/tracker/DbAdapter;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Lcom/kochava/android/tracker/DbAdapter;->addEvent(Lorg/json/JSONObject;Z)I

    move-result v0

    .line 2031
    .local v0, "count":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deep link event: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2033
    const/16 v4, 0x32

    if-lt v0, v4, :cond_0

    .line 2034
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 2036
    .end local v0    # "count":I
    .end local v1    # "dataChunk":Lorg/json/JSONObject;
    .end local v2    # "deepLinkChunk":Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 2039
    .local v3, "e":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error in deep link event call: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public endSession()V
    .locals 1

    .prologue
    .line 1834
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    if-eqz v0, :cond_0

    .line 1836
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_1

    .line 1838
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1870
    :cond_0
    :goto_0
    return-void

    .line 1842
    :cond_1
    const-string v0, "Manual Session End"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1844
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_2

    .line 1846
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_3

    .line 1848
    const-string v0, "Session end, flush timer was on, canceling timer and flushing current events."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1849
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 1850
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1851
    const/4 v0, 0x0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    .line 1859
    :cond_2
    :goto_1
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    if-eqz v0, :cond_4

    .line 1861
    const-string v0, "exit"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->eventSession(Ljava/lang/String;)V

    goto :goto_0

    .line 1855
    :cond_3
    const-string v0, "Session end, flush timer was already off."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_1

    .line 1865
    :cond_4
    const-string v0, "Session events disabled by server."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public event(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "eventData"    # Ljava/lang/String;

    .prologue
    .line 1952
    sget-boolean v2, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v2, :cond_0

    .line 1954
    const-string v2, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1973
    :goto_0
    return-void

    .line 1960
    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1962
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1963
    .local v1, "properties":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v2, "event_name"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1964
    const-string v2, "event_data"

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1966
    const-string v2, "event"

    invoke-direct {p0, v2, v1}, Lcom/kochava/android/tracker/Feature;->fireEventBlacklist(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1968
    .end local v1    # "properties":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    .line 1970
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error in event call: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public eventSpatial(Ljava/lang/String;DDDLjava/lang/String;)V
    .locals 6
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "x"    # D
    .param p4, "y"    # D
    .param p6, "z"    # D
    .param p8, "eventData"    # Ljava/lang/String;

    .prologue
    .line 1977
    sget-boolean v3, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v3, :cond_0

    .line 1979
    const-string v3, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v3}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2002
    :goto_0
    return-void

    .line 1985
    :cond_0
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got event "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1987
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1988
    .local v1, "properties":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "event_name"

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1990
    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "#.##"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1991
    .local v2, "twoDForm":Ljava/text/DecimalFormat;
    const-string v3, "x"

    invoke-virtual {v2, p2, p3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1992
    const-string v3, "y"

    invoke-virtual {v2, p4, p5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1993
    const-string v3, "z"

    invoke-virtual {v2, p6, p7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1994
    const-string v3, "event_data"

    invoke-virtual {v1, v3, p8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1996
    const-string v3, "spatial"

    invoke-direct {p0, v3, v1}, Lcom/kochava/android/tracker/Feature;->fireEventBlacklist(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1998
    .end local v1    # "properties":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v2    # "twoDForm":Ljava/text/DecimalFormat;
    :catch_0
    move-exception v0

    .line 2000
    .local v0, "e":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error in event call: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public linkIdentity(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1913
    .local p1, "identityMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_0

    .line 1915
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1923
    :goto_0
    return-void

    .line 1919
    :cond_0
    const-string v0, "Mapping identity"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1921
    const-string v0, "identityLink"

    invoke-direct {p0, v0, p1}, Lcom/kochava/android/tracker/Feature;->fireEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public registerSuperProperties(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1669
    .local p1, "superProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-boolean v1, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v1, :cond_1

    .line 1671
    const-string v1, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1684
    :cond_0
    :goto_0
    return-void

    .line 1675
    :cond_1
    const-string v1, "registerSuperProperties"

    invoke-static {v1}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1677
    sget-object v1, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    if-nez v1, :cond_2

    .line 1678
    sput-object p1, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    goto :goto_0

    .line 1680
    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1681
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    sget-object v2, Lcom/kochava/android/tracker/Feature;->mSuperProperties:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public setAppLimitTracking(Z)V
    .locals 1
    .param p1, "shouldLimit"    # Z

    .prologue
    .line 1205
    iput-boolean p1, p0, Lcom/kochava/android/tracker/Feature;->app_limit_tracking:Z

    .line 1206
    const-string v0, "setAppLimitTracking"

    invoke-virtual {p0, v0}, Lcom/kochava/android/tracker/Feature;->tryUpdate(Ljava/lang/String;)V

    .line 1207
    return-void
.end method

.method public setLatlong(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "lat"    # Ljava/lang/String;
    .param p2, "lon"    # Ljava/lang/String;

    .prologue
    .line 1718
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1720
    :cond_0
    const-string v0, "Trying to set lat/long, but one/both of the parameters where null."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1727
    :goto_0
    return-void

    .line 1723
    :cond_1
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature;->mContext:Landroid/content/Context;

    const-string v1, "initPrefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    .line 1724
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "mylat"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1725
    sget-object v0, Lcom/kochava/android/tracker/Feature;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "mylong"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public startSession()V
    .locals 6

    .prologue
    .line 1731
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->overrideAutomaticSessions:Z

    if-eqz v0, :cond_0

    .line 1733
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->badInit:Z

    if-eqz v0, :cond_1

    .line 1735
    const-string v0, "The library was not initialized properly or we cannot connect to our servers. Until this is fixed, this method cannot be used."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 1779
    :cond_0
    :goto_0
    return-void

    .line 1739
    :cond_1
    const-string v0, "Manual Session Start"

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1741
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->should_flush_in_background:Z

    if-nez v0, :cond_2

    .line 1743
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    if-nez v0, :cond_3

    .line 1745
    const-string v0, "Session start, flush timer was off and is not first launch, starting periodic flush timer."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 1747
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    .line 1748
    sget-object v0, Lcom/kochava/android/tracker/Feature;->mTimer:Ljava/util/Timer;

    new-instance v1, Lcom/kochava/android/tracker/Feature$6;

    invoke-direct {v1, p0}, Lcom/kochava/android/tracker/Feature$6;-><init>(Lcom/kochava/android/tracker/Feature;)V

    sget v2, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    int-to-long v2, v2

    sget v4, Lcom/kochava/android/tracker/Feature;->flush_rate:I

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 1763
    :cond_2
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    sput-wide v0, Lcom/kochava/android/tracker/Feature;->startTime:J

    .line 1766
    sget-boolean v0, Lcom/kochava/android/tracker/Feature;->canSendSession:Z

    if-eqz v0, :cond_4

    .line 1768
    const-string v0, "launch"

    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->eventSession(Ljava/lang/String;)V

    goto :goto_0

    .line 1758
    :cond_3
    const-string v0, "Session start, flush timer was already on."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_1

    .line 1772
    :cond_4
    const-string v0, "Session events disabled by server."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected tryUpdate(Ljava/lang/String;)V
    .locals 5
    .param p1, "source"    # Ljava/lang/String;

    .prologue
    .line 1399
    new-instance v0, Lcom/kochava/android/tracker/Feature$5;

    invoke-direct {v0, p0, p1}, Lcom/kochava/android/tracker/Feature$5;-><init>(Lcom/kochava/android/tracker/Feature;Ljava/lang/String;)V

    .line 1567
    .local v0, "checkWatchlistTryUpdate":Ljava/lang/Runnable;
    sget-object v1, Lcom/kochava/android/tracker/Feature;->worker:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v2, 0xa

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1568
    return-void
.end method
