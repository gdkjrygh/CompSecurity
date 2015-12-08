.class public Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
.super Ljava/lang/Object;
.source "MixpanelAPI.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$SupportedUpdatesListener;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesFromMixpanel;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesListener;,
        Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;
    }
.end annotation


# static fields
.field private static final APP_LINKS_LOGTAG:Ljava/lang/String; = "MixpanelAPI.AL"

.field private static final ENGAGE_DATE_FORMAT_STRING:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss"

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.API"

.field public static final VERSION:Ljava/lang/String; = "4.6.0"

.field private static final sInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Landroid/content/Context;",
            "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final sPrefsLoader:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;

.field private static sReferrerPrefs:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field

.field private static final sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;


# instance fields
.field private final mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

.field private final mContext:Landroid/content/Context;

.field private final mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

.field private final mDeviceInfo:Ljava/util/Map;
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

.field private final mEventTimings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

.field private final mPeople:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

.field private final mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

.field private final mToken:Ljava/lang/String;

.field private final mTrackingDebug:Lcom/mixpanel/android/viewcrawler/TrackingDebug;

.field private final mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

.field private final mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    .line 2110
    new-instance v0, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sPrefsLoader:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;

    .line 2111
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/Tweaks;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    .line 2116
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "token"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .local p2, "referrerPreferences":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Landroid/content/SharedPreferences;>;"
    const/4 v7, 0x0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    .line 196
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;

    .line 197
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    .line 198
    new-instance v5, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    invoke-direct {v5, p0, v7, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)V

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPeople:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    .line 199
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getConfig()Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    .line 201
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 202
    .local v1, "deviceInfo":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v5, "$android_lib_version"

    const-string v6, "4.6.0"

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    const-string v5, "$android_os"

    const-string v6, "Android"

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    const-string v6, "$android_os_version"

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    if-nez v5, :cond_2

    const-string v5, "UNKNOWN"

    :goto_0
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-string v6, "$android_manufacturer"

    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v5, :cond_3

    const-string v5, "UNKNOWN"

    :goto_1
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    const-string v6, "$android_brand"

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-nez v5, :cond_4

    const-string v5, "UNKNOWN"

    :goto_2
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v6, "$android_model"

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v5, :cond_5

    const-string v5, "UNKNOWN"

    :goto_3
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    :try_start_0
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 210
    .local v4, "manager":Landroid/content/pm/PackageManager;
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 211
    .local v3, "info":Landroid/content/pm/PackageInfo;
    const-string v5, "$android_app_version"

    iget-object v6, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const-string v5, "$android_app_version_code"

    iget v6, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    .end local v3    # "info":Landroid/content/pm/PackageInfo;
    .end local v4    # "manager":Landroid/content/pm/PackageManager;
    :goto_4
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDeviceInfo:Ljava/util/Map;

    .line 218
    invoke-virtual {p0, p1, p3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->constructUpdatesFromMixpanel(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    .line 219
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->constructTrackingDebug()Lcom/mixpanel/android/viewcrawler/TrackingDebug;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mTrackingDebug:Lcom/mixpanel/android/viewcrawler/TrackingDebug;

    .line 220
    invoke-virtual {p0, p1, p2, p3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPersistentIdentity(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    .line 221
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->constructUpdatesListener()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    .line 222
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    invoke-virtual {p0, p3, v5, v6}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->constructDecideUpdates(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/DecideMessages$OnNewResultsListener;Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;)Lcom/mixpanel/android/mpmetrics/DecideMessages;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

    .line 226
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v5}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getPeopleDistinctId()Ljava/lang/String;

    move-result-object v0

    .line 227
    .local v0, "decideId":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 228
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v5}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getEventsDistinctId()Ljava/lang/String;

    move-result-object v0

    .line 230
    :cond_0
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

    invoke-virtual {v5, v0}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->setDistinctId(Ljava/lang/String;)V

    .line 231
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getAnalyticsMessages()Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v5

    iput-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    .line 232
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    iget-object v6, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

    invoke-virtual {v5, v6}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->installDecideCheck(Lcom/mixpanel/android/mpmetrics/DecideMessages;)V

    .line 234
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerMixpanelActivityLifecycleCallbacks()V

    .line 236
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sendAppOpen()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 237
    const-string v5, "$app_open"

    invoke-virtual {p0, v5, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 240
    :cond_1
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    invoke-interface {v5}, Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;->startUpdates()V

    .line 241
    return-void

    .line 204
    .end local v0    # "decideId":Ljava/lang/String;
    :cond_2
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    goto/16 :goto_0

    .line 205
    :cond_3
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    goto/16 :goto_1

    .line 206
    :cond_4
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    goto/16 :goto_2

    .line 207
    :cond_5
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    goto/16 :goto_3

    .line 213
    :catch_0
    move-exception v2

    .line 214
    .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v5, "MixpanelAPI.API"

    const-string v6, "Exception getting app version name"

    invoke-static {v5, v6, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4
.end method

.method static synthetic access$0(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    .locals 1

    .prologue
    .line 2101
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/DecideMessages;
    .locals 1

    .prologue
    .line 2104
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

    return-object v0
.end method

.method static synthetic access$10(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    .locals 1

    .prologue
    .line 2096
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    return-object v0
.end method

.method static synthetic access$11(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONArray;)V
    .locals 0

    .prologue
    .line 2025
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sendAllPeopleRecords(Lorg/json/JSONArray;)V

    return-void
.end method

.method static synthetic access$2(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 0

    .prologue
    .line 2016
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->pushWaitingPeopleRecord()V

    return-void
.end method

.method static synthetic access$3(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 2105
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDeviceInfo:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$4(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 2008
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->recordPeopleMessage(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$5(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 1

    .prologue
    .line 2097
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    return-object v0
.end method

.method static synthetic access$6(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;
    .locals 1

    .prologue
    .line 2100
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    return-object v0
.end method

.method static synthetic access$7(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 2095
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$8(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;
    .locals 1

    .prologue
    .line 2102
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesListener:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;

    return-object v0
.end method

.method static synthetic access$9(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 2098
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;

    return-object v0
.end method

.method static allInstances(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;)V
    .locals 6
    .param p0, "processor"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;

    .prologue
    .line 1275
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    monitor-enter v3

    .line 1276
    :try_start_0
    sget-object v2, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 1275
    monitor-exit v3

    .line 1282
    return-void

    .line 1276
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1277
    .local v0, "contextInstances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 1278
    .local v1, "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-interface {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$InstanceProcessor;->process(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    goto :goto_0

    .line 1275
    .end local v0    # "contextInstances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    .end local v1    # "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static booleanTweak(Ljava/lang/String;Z)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 133
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->booleanTweak(Ljava/lang/String;Z)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method public static byteTweak(Ljava/lang/String;B)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "B)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    .prologue
    .line 187
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->byteTweak(Ljava/lang/String;B)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method private static checkIntentForInboundAppLink(Landroid/content/Context;)V
    .locals 9
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 2075
    instance-of v5, p0, Landroid/app/Activity;

    if-eqz v5, :cond_0

    .line 2077
    :try_start_0
    const-string v5, "bolts.AppLinks"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 2078
    .local v1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    move-object v5, v0

    invoke-virtual {v5}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 2079
    .local v4, "intent":Landroid/content/Intent;
    const-string v5, "getTargetUrlFromInboundIntent"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/Context;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-class v8, Landroid/content/Intent;

    aput-object v8, v6, v7

    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 2080
    .local v3, "getTargetUrlFromInboundIntent":Ljava/lang/reflect/Method;
    const/4 v5, 0x0

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p0, v6, v7

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    .line 2093
    .end local v1    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "getTargetUrlFromInboundIntent":Ljava/lang/reflect/Method;
    .end local v4    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 2081
    :catch_0
    move-exception v2

    .line 2082
    .local v2, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v5, "MixpanelAPI.AL"

    const-string v6, "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links"

    invoke-static {v5, v6, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 2083
    .end local v2    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v2

    .line 2084
    .local v2, "e":Ljava/lang/ClassNotFoundException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Please install the Bolts library >= 1.1.2 to track App Links: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2085
    .end local v2    # "e":Ljava/lang/ClassNotFoundException;
    :catch_2
    move-exception v2

    .line 2086
    .local v2, "e":Ljava/lang/NoSuchMethodException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Please install the Bolts library >= 1.1.2 to track App Links: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2087
    .end local v2    # "e":Ljava/lang/NoSuchMethodException;
    :catch_3
    move-exception v2

    .line 2088
    .local v2, "e":Ljava/lang/IllegalAccessException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Unable to detect inbound App Links: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2091
    .end local v2    # "e":Ljava/lang/IllegalAccessException;
    :cond_0
    const-string v5, "MixpanelAPI.AL"

    const-string v6, "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance."

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static doubleTweak(Ljava/lang/String;D)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .prologue
    .line 142
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Tweaks;->doubleTweak(Ljava/lang/String;D)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method public static enableFallbackServer(Landroid/content/Context;Z)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "enableIfTrue"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 323
    const-string v0, "MixpanelAPI.API"

    .line 324
    const-string v1, "MixpanelAPI.enableFallbackServer is deprecated. This call is a no-op.\n    To enable fallback in your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.DisableFallback\" android:value=\"false\" />\n    to the <application> section of your AndroidManifest.xml."

    .line 322
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 329
    return-void
.end method

.method public static floatTweak(Ljava/lang/String;F)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .prologue
    .line 151
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->floatTweak(Ljava/lang/String;F)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "token"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 270
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 295
    :cond_0
    :goto_0
    return-object v1

    .line 273
    :cond_1
    sget-object v4, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    monitor-enter v4

    .line 274
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 276
    .local v0, "appContext":Landroid/content/Context;
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sReferrerPrefs:Ljava/util/concurrent/Future;

    if-nez v3, :cond_2

    .line 277
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sPrefsLoader:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;

    const-string v5, "com.mixpanel.android.mpmetrics.ReferralInfo"

    const/4 v6, 0x0

    invoke-virtual {v3, p0, v5, v6}, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;->loadPreferences(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;)Ljava/util/concurrent/Future;

    move-result-object v3

    sput-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sReferrerPrefs:Ljava/util/concurrent/Future;

    .line 280
    :cond_2
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .line 281
    .local v2, "instances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    if-nez v2, :cond_3

    .line 282
    new-instance v2, Ljava/util/HashMap;

    .end local v2    # "instances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 283
    .restart local v2    # "instances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sInstanceMap:Ljava/util/Map;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 287
    .local v1, "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    if-nez v1, :cond_4

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/ConfigurationChecker;->checkBasicConfiguration(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 288
    new-instance v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .end local v1    # "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sReferrerPrefs:Ljava/util/concurrent/Future;

    invoke-direct {v1, v0, v3, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;-><init>(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)V

    .line 289
    .restart local v1    # "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    invoke-static {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerAppLinksListeners(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    .line 290
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    :cond_4
    invoke-static {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->checkIntentForInboundAppLink(Landroid/content/Context;)V

    .line 295
    monitor-exit v4

    goto :goto_0

    .line 273
    .end local v0    # "appContext":Landroid/content/Context;
    .end local v1    # "instance":Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .end local v2    # "instances":Ljava/util/Map;, "Ljava/util/Map<Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;>;"
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static intTweak(Ljava/lang/String;I)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 169
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->intTweak(Ljava/lang/String;I)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method public static longTweak(Ljava/lang/String;J)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 160
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Tweaks;->longTweak(Ljava/lang/String;J)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method private pushWaitingPeopleRecord()V
    .locals 2

    .prologue
    .line 2017
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->waitingPeopleRecordsForSending()Lorg/json/JSONArray;

    move-result-object v0

    .line 2018
    .local v0, "records":Lorg/json/JSONArray;
    if-eqz v0, :cond_0

    .line 2019
    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sendAllPeopleRecords(Lorg/json/JSONArray;)V

    .line 2021
    :cond_0
    return-void
.end method

.method private recordPeopleMessage(Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 2009
    const-string v0, "$distinct_id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2010
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->peopleMessage(Lorg/json/JSONObject;)V

    .line 2014
    :goto_0
    return-void

    .line 2012
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->storeWaitingPeopleRecord(Lorg/json/JSONObject;)V

    goto :goto_0
.end method

.method private static registerAppLinksListeners(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V
    .locals 9
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "mixpanel"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .prologue
    .line 2039
    :try_start_0
    const-string v5, "android.support.v4.content.LocalBroadcastManager"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 2040
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v5, "getInstance"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/Context;

    aput-object v8, v6, v7

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 2041
    .local v3, "methodGetInstance":Ljava/lang/reflect/Method;
    const-string v5, "registerReceiver"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/BroadcastReceiver;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-class v8, Landroid/content/IntentFilter;

    aput-object v8, v6, v7

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 2042
    .local v4, "methodRegisterReceiver":Ljava/lang/reflect/Method;
    const/4 v5, 0x0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p0, v6, v7

    invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2043
    .local v2, "localBroadcastManager":Ljava/lang/Object;
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    new-instance v7, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$2;

    invoke-direct {v7, p1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$2;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 2059
    new-instance v7, Landroid/content/IntentFilter;

    const-string v8, "com.parse.bolts.measurement_event"

    invoke-direct {v7, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    aput-object v7, v5, v6

    .line 2043
    invoke-virtual {v4, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    .line 2069
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v2    # "localBroadcastManager":Ljava/lang/Object;
    .end local v3    # "methodGetInstance":Ljava/lang/reflect/Method;
    .end local v4    # "methodRegisterReceiver":Ljava/lang/reflect/Method;
    :goto_0
    return-void

    .line 2060
    :catch_0
    move-exception v1

    .line 2061
    .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v5, "MixpanelAPI.AL"

    const-string v6, "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception"

    invoke-static {v5, v6, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 2062
    .end local v1    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v1

    .line 2063
    .local v1, "e":Ljava/lang/ClassNotFoundException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "To enable App Links tracking android.support.v4 must be installed: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2064
    .end local v1    # "e":Ljava/lang/ClassNotFoundException;
    :catch_2
    move-exception v1

    .line 2065
    .local v1, "e":Ljava/lang/NoSuchMethodException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "To enable App Links tracking android.support.v4 must be installed: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 2066
    .end local v1    # "e":Ljava/lang/NoSuchMethodException;
    :catch_3
    move-exception v1

    .line 2067
    .local v1, "e":Ljava/lang/IllegalAccessException;
    const-string v5, "MixpanelAPI.AL"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "App Links tracking will not be enabled due to this exception: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private sendAllPeopleRecords(Lorg/json/JSONArray;)V
    .locals 5
    .param p1, "records"    # Lorg/json/JSONArray;

    .prologue
    .line 2026
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v1, v3, :cond_0

    .line 2034
    return-void

    .line 2028
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 2029
    .local v2, "message":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    invoke-virtual {v3, v2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->peopleMessage(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2026
    .end local v2    # "message":Lorg/json/JSONObject;
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2030
    :catch_0
    move-exception v0

    .line 2031
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "MixpanelAPI.API"

    const-string v4, "Malformed people record stored pending identity, will not send it."

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public static setFlushInterval(Landroid/content/Context;J)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "milliseconds"    # J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 307
    const-string v0, "MixpanelAPI.API"

    .line 308
    const-string v1, "MixpanelAPI.setFlushInterval is deprecated. Calling is now a no-op.\n    To set a custom Mixpanel flush interval for your application, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.FlushInterval\" android:value=\"YOUR_INTERVAL\" />\n    to the <application> section of your AndroidManifest.xml."

    .line 306
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    return-void
.end method

.method public static shortTweak(Ljava/lang/String;S)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # S
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "S)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .prologue
    .line 178
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->shortTweak(Ljava/lang/String;S)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method

.method public static stringTweak(Ljava/lang/String;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p0, "tweakName"    # Ljava/lang/String;
    .param p1, "defaultValue"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 124
    sget-object v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-virtual {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->stringTweak(Ljava/lang/String;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweak;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public alias(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "alias"    # Ljava/lang/String;
    .param p2, "original"    # Ljava/lang/String;

    .prologue
    .line 343
    if-nez p2, :cond_0

    .line 344
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getDistinctId()Ljava/lang/String;

    move-result-object p2

    .line 346
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 347
    const-string v2, "MixpanelAPI.API"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Attempted to alias identical distinct_ids "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ". Alias message will not be sent."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 360
    :goto_0
    return-void

    .line 352
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 353
    .local v1, "j":Lorg/json/JSONObject;
    const-string v2, "alias"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 354
    const-string v2, "original"

    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 355
    const-string v2, "$create_alias"

    invoke-virtual {p0, v2, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    .end local v1    # "j":Lorg/json/JSONObject;
    :goto_1
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->flush()V

    goto :goto_0

    .line 356
    :catch_0
    move-exception v0

    .line 357
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "MixpanelAPI.API"

    const-string v3, "Failed to alias"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public clearSuperProperties()V
    .locals 1

    .prologue
    .line 673
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->clearSuperProperties()V

    .line 674
    return-void
.end method

.method constructDecideUpdates(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/DecideMessages$OnNewResultsListener;Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;)Lcom/mixpanel/android/mpmetrics/DecideMessages;
    .locals 1
    .param p1, "token"    # Ljava/lang/String;
    .param p2, "listener"    # Lcom/mixpanel/android/mpmetrics/DecideMessages$OnNewResultsListener;
    .param p3, "updatesFromMixpanel"    # Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    .prologue
    .line 1313
    new-instance v0, Lcom/mixpanel/android/mpmetrics/DecideMessages;

    invoke-direct {v0, p1, p2, p3}, Lcom/mixpanel/android/mpmetrics/DecideMessages;-><init>(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/DecideMessages$OnNewResultsListener;Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;)V

    return-object v0
.end method

.method constructTrackingDebug()Lcom/mixpanel/android/viewcrawler/TrackingDebug;
    .locals 1

    .prologue
    .line 1335
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    instance-of v0, v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    if-eqz v0, :cond_0

    .line 1336
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mUpdatesFromMixpanel:Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;

    check-cast v0, Lcom/mixpanel/android/viewcrawler/TrackingDebug;

    .line 1339
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructUpdatesFromMixpanel(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "token"    # Ljava/lang/String;

    .prologue
    .line 1326
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 1327
    const-string v0, "MixpanelAPI.API"

    const-string v1, "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1328
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesFromMixpanel;

    sget-object v1, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-direct {v0, p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesFromMixpanel;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/Tweaks;)V

    .line 1330
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;

    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sSharedTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    invoke-direct {v0, v1, v2, p0, v3}, Lcom/mixpanel/android/viewcrawler/ViewCrawler;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/Tweaks;)V

    goto :goto_0
.end method

.method constructUpdatesListener()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UpdatesListener;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1317
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 1318
    const-string v0, "MixpanelAPI.API"

    const-string v1, "Surveys and Notifications are not supported on this Android OS Version"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1319
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesListener;

    invoke-direct {v0, p0, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesListener;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$UnsupportedUpdatesListener;)V

    .line 1321
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$SupportedUpdatesListener;

    invoke-direct {v0, p0, v2}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$SupportedUpdatesListener;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$SupportedUpdatesListener;)V

    goto :goto_0
.end method

.method public flush()V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->postToServer()V

    .line 528
    return-void
.end method

.method getAnalyticsMessages()Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    .locals 1

    .prologue
    .line 1289
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-result-object v0

    return-object v0
.end method

.method getConfig()Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 1

    .prologue
    .line 1293
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceInfo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 718
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDeviceInfo:Ljava/util/Map;

    return-object v0
.end method

.method public getDistinctId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 557
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getEventsDistinctId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;
    .locals 1

    .prologue
    .line 697
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPeople:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    return-object v0
.end method

.method getPersistentIdentity(Landroid/content/Context;Ljava/util/concurrent/Future;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/PersistentIdentity;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p3, "token"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mixpanel/android/mpmetrics/PersistentIdentity;"
        }
    .end annotation

    .prologue
    .line 1297
    .local p2, "referrerPreferences":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Landroid/content/SharedPreferences;>;"
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$1;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$1;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    .line 1307
    .local v0, "listener":Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "com.mixpanel.android.mpmetrics.MixpanelAPI_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1308
    .local v1, "prefsName":Ljava/lang/String;
    sget-object v3, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->sPrefsLoader:Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;

    invoke-virtual {v3, p1, v1, v0}, Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader;->loadPreferences(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/SharedPreferencesLoader$OnPrefsLoadedListener;)Ljava/util/concurrent/Future;

    move-result-object v2

    .line 1309
    .local v2, "storedPreferences":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Landroid/content/SharedPreferences;>;"
    new-instance v3, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-direct {v3, p2, v2}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;-><init>(Ljava/util/concurrent/Future;Ljava/util/concurrent/Future;)V

    return-object v3
.end method

.method public getSuperProperties()Lorg/json/JSONObject;
    .locals 2

    .prologue
    .line 537
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 538
    .local v0, "ret":Lorg/json/JSONObject;
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->addSuperPropertiesToObject(Lorg/json/JSONObject;)V

    .line 539
    return-object v0
.end method

.method public identify(Ljava/lang/String;)V
    .locals 3
    .param p1, "distinctId"    # Ljava/lang/String;

    .prologue
    .line 388
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    monitor-enter v2

    .line 389
    :try_start_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v1, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->setEventsDistinctId(Ljava/lang/String;)V

    .line 390
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getPeopleDistinctId()Ljava/lang/String;

    move-result-object v0

    .line 391
    .local v0, "decideId":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 392
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getEventsDistinctId()Ljava/lang/String;

    move-result-object v0

    .line 394
    :cond_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mDecideMessages:Lcom/mixpanel/android/mpmetrics/DecideMessages;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/DecideMessages;->setDistinctId(Ljava/lang/String;)V

    .line 388
    monitor-exit v2

    .line 396
    return-void

    .line 388
    .end local v0    # "decideId":Ljava/lang/String;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public logPosts()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1236
    const-string v0, "MixpanelAPI.API"

    .line 1237
    const-string v1, "MixpanelAPI.logPosts() is deprecated.\n    To get verbose debug level logging, add\n    <meta-data android:name=\"com.mixpanel.android.MPConfig.EnableDebugLogging\" value=\"true\" />\n    to the <application> section of your AndroidManifest.xml."

    .line 1235
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1242
    return-void
.end method

.method registerMixpanelActivityLifecycleCallbacks()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 1257
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    .line 1258
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getAutoShowMixpanelUpdates()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1259
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_1

    .line 1260
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 1261
    .local v0, "app":Landroid/app/Application;
    new-instance v1, Lcom/mixpanel/android/mpmetrics/MixpanelActivityLifecycleCallbacks;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/mpmetrics/MixpanelActivityLifecycleCallbacks;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1266
    .end local v0    # "app":Landroid/app/Application;
    :cond_0
    :goto_0
    return-void

    .line 1263
    :cond_1
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Context is not an Application, Mixpanel will not automatically show surveys, in-app notifications, or A/B test experiments."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public registerSuperProperties(Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "superProperties"    # Lorg/json/JSONObject;

    .prologue
    .line 609
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->registerSuperProperties(Lorg/json/JSONObject;)V

    .line 610
    return-void
.end method

.method public registerSuperPropertiesMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 578
    .local p1, "superProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p1, :cond_0

    .line 579
    const-string v1, "MixpanelAPI.API"

    const-string v2, "registerSuperPropertiesMap does not accept null properties"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 588
    :goto_0
    return-void

    .line 584
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperProperties(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 585
    :catch_0
    move-exception v0

    .line 586
    .local v0, "e":Ljava/lang/NullPointerException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t have null keys in the properties of registerSuperPropertiesMap!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public registerSuperPropertiesOnce(Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "superProperties"    # Lorg/json/JSONObject;

    .prologue
    .line 659
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->registerSuperPropertiesOnce(Lorg/json/JSONObject;)V

    .line 660
    return-void
.end method

.method public registerSuperPropertiesOnceMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 637
    .local p1, "superProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p1, :cond_0

    .line 638
    const-string v1, "MixpanelAPI.API"

    const-string v2, "registerSuperPropertiesOnceMap does not accept null properties"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 647
    :goto_0
    return-void

    .line 643
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperPropertiesOnce(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 644
    :catch_0
    move-exception v0

    .line 645
    .local v0, "e":Ljava/lang/NullPointerException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t have null keys in the properties of registerSuperPropertiesOnce!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 708
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->clearPreferences()V

    .line 709
    return-void
.end method

.method sendAppOpen()Z
    .locals 1

    .prologue
    .line 1343
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getDisableAppOpenEvent()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public timeEvent(Ljava/lang/String;)V
    .locals 5
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 406
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 407
    .local v0, "writeTime":J
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    monitor-enter v3

    .line 408
    :try_start_0
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    monitor-exit v3

    .line 410
    return-void

    .line 407
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public track(Ljava/lang/String;)V
    .locals 1
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 512
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 513
    return-void
.end method

.method public track(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 24
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "properties"    # Lorg/json/JSONObject;

    .prologue
    .line 456
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    move-object/from16 v20, v0

    monitor-enter v20

    .line 457
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    .line 458
    .local v4, "eventBegin":Ljava/lang/Long;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mEventTimings:Ljava/util/Map;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    monitor-exit v20
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 462
    :try_start_1
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 464
    .local v9, "messageProps":Lorg/json/JSONObject;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->getReferrerProperties()Ljava/util/Map;

    move-result-object v11

    .line 465
    .local v11, "referrerProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-nez v20, :cond_3

    .line 471
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->addSuperPropertiesToObject(Lorg/json/JSONObject;)V

    .line 475
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    move-wide/from16 v0, v20

    long-to-double v0, v0

    move-wide/from16 v20, v0

    const-wide v22, 0x408f400000000000L    # 1000.0

    div-double v16, v20, v22

    .line 476
    .local v16, "timeSecondsDouble":D
    move-wide/from16 v0, v16

    double-to-long v14, v0

    .line 477
    .local v14, "timeSeconds":J
    const-string v19, "time"

    move-object/from16 v0, v19

    invoke-virtual {v9, v0, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 478
    const-string v19, "distinct_id"

    invoke-virtual/range {p0 .. p0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getDistinctId()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 480
    if-eqz v4, :cond_0

    .line 481
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    move-wide/from16 v0, v20

    long-to-double v0, v0

    move-wide/from16 v20, v0

    const-wide v22, 0x408f400000000000L    # 1000.0

    div-double v6, v20, v22

    .line 482
    .local v6, "eventBeginDouble":D
    sub-double v12, v16, v6

    .line 483
    .local v12, "secondsElapsed":D
    const-string v19, "$duration"

    move-object/from16 v0, v19

    invoke-virtual {v9, v0, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 486
    .end local v6    # "eventBeginDouble":D
    .end local v12    # "secondsElapsed":D
    :cond_0
    if-eqz p2, :cond_1

    .line 487
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v10

    .line 488
    .local v10, "propIter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_4

    .line 495
    .end local v10    # "propIter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_1
    new-instance v5, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mToken:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-direct {v5, v0, v9, v1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 496
    .local v5, "eventDescription":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mMessages:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->eventsMessage(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;)V

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mTrackingDebug:Lcom/mixpanel/android/viewcrawler/TrackingDebug;

    move-object/from16 v19, v0

    if-eqz v19, :cond_2

    .line 499
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mTrackingDebug:Lcom/mixpanel/android/viewcrawler/TrackingDebug;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lcom/mixpanel/android/viewcrawler/TrackingDebug;->reportTrack(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 504
    .end local v5    # "eventDescription":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
    .end local v9    # "messageProps":Lorg/json/JSONObject;
    .end local v11    # "referrerProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v14    # "timeSeconds":J
    .end local v16    # "timeSecondsDouble":D
    :cond_2
    :goto_2
    return-void

    .line 456
    .end local v4    # "eventBegin":Ljava/lang/Long;
    :catchall_0
    move-exception v19

    :try_start_2
    monitor-exit v20
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v19

    .line 465
    .restart local v4    # "eventBegin":Ljava/lang/Long;
    .restart local v9    # "messageProps":Lorg/json/JSONObject;
    .restart local v11    # "referrerProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_3
    :try_start_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 466
    .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 467
    .local v8, "key":Ljava/lang/String;
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 468
    .local v18, "value":Ljava/lang/String;
    move-object/from16 v0, v18

    invoke-virtual {v9, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    .line 501
    .end local v3    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v8    # "key":Ljava/lang/String;
    .end local v9    # "messageProps":Lorg/json/JSONObject;
    .end local v11    # "referrerProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18    # "value":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 502
    .local v2, "e":Lorg/json/JSONException;
    const-string v19, "MixpanelAPI.API"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "Exception tracking event "

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 489
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v9    # "messageProps":Lorg/json/JSONObject;
    .restart local v10    # "propIter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    .restart local v11    # "referrerProperties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v14    # "timeSeconds":J
    .restart local v16    # "timeSecondsDouble":D
    :cond_4
    :try_start_4
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 490
    .restart local v8    # "key":Ljava/lang/String;
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v9, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_1
.end method

.method public trackMap(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .param p1, "eventName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 427
    .local p2, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    if-nez p2, :cond_0

    .line 428
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 436
    :goto_0
    return-void

    .line 431
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, p1, v1}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 432
    :catch_0
    move-exception v0

    .line 433
    .local v0, "e":Ljava/lang/NullPointerException;
    const-string v1, "MixpanelAPI.API"

    const-string v2, "Can\'t have null keys in the properties of trackMap!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public unregisterSuperProperty(Ljava/lang/String;)V
    .locals 1
    .param p1, "superPropertyName"    # Ljava/lang/String;

    .prologue
    .line 623
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->unregisterSuperProperty(Ljava/lang/String;)V

    .line 624
    return-void
.end method

.method public updateSuperProperties(Lcom/mixpanel/android/mpmetrics/SuperPropertyUpdate;)V
    .locals 1
    .param p1, "update"    # Lcom/mixpanel/android/mpmetrics/SuperPropertyUpdate;

    .prologue
    .line 686
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->mPersistentIdentity:Lcom/mixpanel/android/mpmetrics/PersistentIdentity;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->updateSuperProperties(Lcom/mixpanel/android/mpmetrics/SuperPropertyUpdate;)V

    .line 687
    return-void
.end method
