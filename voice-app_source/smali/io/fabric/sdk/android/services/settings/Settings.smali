.class public Lio/fabric/sdk/android/services/settings/Settings;
.super Ljava/lang/Object;
.source "Settings.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/services/settings/Settings$1;,
        Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess;,
        Lio/fabric/sdk/android/services/settings/Settings$LazyHolder;
    }
.end annotation


# static fields
.field public static final SETTINGS_CACHE_FILENAME:Ljava/lang/String; = "com.crashlytics.settings.json"

.field private static final SETTINGS_URL_FORMAT:Ljava/lang/String; = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings"


# instance fields
.field private initialized:Z

.field private settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

.field private final settingsData:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Lio/fabric/sdk/android/services/settings/SettingsData;",
            ">;"
        }
    .end annotation
.end field

.field private final settingsDataLatch:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsData:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsDataLatch:Ljava/util/concurrent/CountDownLatch;

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->initialized:Z

    .line 60
    return-void
.end method

.method synthetic constructor <init>(Lio/fabric/sdk/android/services/settings/Settings$1;)V
    .locals 0
    .param p1, "x0"    # Lio/fabric/sdk/android/services/settings/Settings$1;

    .prologue
    .line 36
    invoke-direct {p0}, Lio/fabric/sdk/android/services/settings/Settings;-><init>()V

    return-void
.end method

.method public static getInstance()Lio/fabric/sdk/android/services/settings/Settings;
    .locals 1

    .prologue
    .line 55
    # getter for: Lio/fabric/sdk/android/services/settings/Settings$LazyHolder;->INSTANCE:Lio/fabric/sdk/android/services/settings/Settings;
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings$LazyHolder;->access$100()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v0

    return-object v0
.end method

.method private setSettingsData(Lio/fabric/sdk/android/services/settings/SettingsData;)V
    .locals 1
    .param p1, "settingsData"    # Lio/fabric/sdk/android/services/settings/SettingsData;

    .prologue
    .line 179
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsData:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsDataLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 181
    return-void
.end method


# virtual methods
.method public awaitSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 4

    .prologue
    .line 142
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsDataLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 143
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsData:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fabric/sdk/android/services/settings/SettingsData;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :goto_0
    return-object v1

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Interrupted while waiting for settings data."

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public clearSettings()V
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsData:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 118
    return-void
.end method

.method public declared-synchronized initialize(Lio/fabric/sdk/android/Kit;Lio/fabric/sdk/android/services/common/IdManager;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/settings/Settings;
    .locals 25
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .param p2, "idManager"    # Lio/fabric/sdk/android/services/common/IdManager;
    .param p3, "httpRequestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    .param p4, "versionCode"    # Ljava/lang/String;
    .param p5, "versionName"    # Ljava/lang/String;
    .param p6, "urlEndpoint"    # Ljava/lang/String;

    .prologue
    .line 78
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v9, v0, Lio/fabric/sdk/android/services/settings/Settings;->initialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v9, :cond_0

    move-object/from16 v24, p0

    .line 110
    .end local p0    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    .local v24, "this":Lio/fabric/sdk/android/services/settings/Settings;
    :goto_0
    monitor-exit p0

    return-object v24

    .line 82
    .end local v24    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    .restart local p0    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    :cond_0
    :try_start_1
    move-object/from16 v0, p0

    iget-object v9, v0, Lio/fabric/sdk/android/services/settings/Settings;->settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

    if-nez v9, :cond_1

    .line 83
    invoke-virtual/range {p1 .. p1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v21

    .line 84
    .local v21, "context":Landroid/content/Context;
    invoke-virtual/range {p2 .. p2}, Lio/fabric/sdk/android/services/common/IdManager;->getAppIdentifier()Ljava/lang/String;

    move-result-object v20

    .line 85
    .local v20, "appIdentifier":Ljava/lang/String;
    new-instance v9, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v9}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    move-object/from16 v0, v21

    invoke-virtual {v9, v0}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 86
    .local v6, "apiKey":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Lio/fabric/sdk/android/services/common/IdManager;->getInstallerPackageName()Ljava/lang/String;

    move-result-object v22

    .line 87
    .local v22, "installerPackageName":Ljava/lang/String;
    new-instance v16, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;

    invoke-direct/range {v16 .. v16}, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;-><init>()V

    .line 88
    .local v16, "currentTimeProvider":Lio/fabric/sdk/android/services/common/CurrentTimeProvider;
    new-instance v17, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;

    invoke-direct/range {v17 .. v17}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;-><init>()V

    .line 89
    .local v17, "settingsJsonTransform":Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;
    new-instance v18, Lio/fabric/sdk/android/services/settings/DefaultCachedSettingsIo;

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/services/settings/DefaultCachedSettingsIo;-><init>(Lio/fabric/sdk/android/Kit;)V

    .line 90
    .local v18, "cachedSettingsIo":Lio/fabric/sdk/android/services/settings/CachedSettingsIo;
    invoke-static/range {v21 .. v21}, Lio/fabric/sdk/android/services/common/CommonUtils;->getAppIconHashOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    .line 91
    .local v12, "iconHash":Ljava/lang/String;
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings"

    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v20, v13, v14

    invoke-static {v9, v10, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    .line 93
    .local v23, "settingsUrl":Ljava/lang/String;
    new-instance v19, Lio/fabric/sdk/android/services/settings/DefaultSettingsSpiCall;

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    move-object/from16 v3, v23

    move-object/from16 v4, p3

    invoke-direct {v0, v1, v2, v3, v4}, Lio/fabric/sdk/android/services/settings/DefaultSettingsSpiCall;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V

    .line 96
    .local v19, "settingsSpiCall":Lio/fabric/sdk/android/services/settings/SettingsSpiCall;
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v6, v1}, Lio/fabric/sdk/android/services/common/IdManager;->createIdHeaderValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 97
    .local v7, "deviceId":Ljava/lang/String;
    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/String;

    const/4 v10, 0x0

    invoke-static/range {v21 .. v21}, Lio/fabric/sdk/android/services/common/CommonUtils;->resolveBuildId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    aput-object v13, v9, v10

    invoke-static {v9}, Lio/fabric/sdk/android/services/common/CommonUtils;->createInstanceIdFrom([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 99
    .local v8, "instanceId":Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lio/fabric/sdk/android/services/common/DeliveryMechanism;->determineFrom(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/DeliveryMechanism;

    move-result-object v9

    invoke-virtual {v9}, Lio/fabric/sdk/android/services/common/DeliveryMechanism;->getId()I

    move-result v11

    .line 102
    .local v11, "deliveryMechanismId":I
    new-instance v5, Lio/fabric/sdk/android/services/settings/SettingsRequest;

    move-object/from16 v9, p5

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v12}, Lio/fabric/sdk/android/services/settings/SettingsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 105
    .local v5, "settingsRequest":Lio/fabric/sdk/android/services/settings/SettingsRequest;
    new-instance v13, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;

    move-object/from16 v14, p1

    move-object v15, v5

    invoke-direct/range {v13 .. v19}, Lio/fabric/sdk/android/services/settings/DefaultSettingsController;-><init>(Lio/fabric/sdk/android/Kit;Lio/fabric/sdk/android/services/settings/SettingsRequest;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;Lio/fabric/sdk/android/services/settings/CachedSettingsIo;Lio/fabric/sdk/android/services/settings/SettingsSpiCall;)V

    move-object/from16 v0, p0

    iput-object v13, v0, Lio/fabric/sdk/android/services/settings/Settings;->settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

    .line 109
    .end local v5    # "settingsRequest":Lio/fabric/sdk/android/services/settings/SettingsRequest;
    .end local v6    # "apiKey":Ljava/lang/String;
    .end local v7    # "deviceId":Ljava/lang/String;
    .end local v8    # "instanceId":Ljava/lang/String;
    .end local v11    # "deliveryMechanismId":I
    .end local v12    # "iconHash":Ljava/lang/String;
    .end local v16    # "currentTimeProvider":Lio/fabric/sdk/android/services/common/CurrentTimeProvider;
    .end local v17    # "settingsJsonTransform":Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;
    .end local v18    # "cachedSettingsIo":Lio/fabric/sdk/android/services/settings/CachedSettingsIo;
    .end local v19    # "settingsSpiCall":Lio/fabric/sdk/android/services/settings/SettingsSpiCall;
    .end local v20    # "appIdentifier":Ljava/lang/String;
    .end local v21    # "context":Landroid/content/Context;
    .end local v22    # "installerPackageName":Ljava/lang/String;
    .end local v23    # "settingsUrl":Ljava/lang/String;
    :cond_1
    const/4 v9, 0x1

    move-object/from16 v0, p0

    iput-boolean v9, v0, Lio/fabric/sdk/android/services/settings/Settings;->initialized:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v24, p0

    .line 110
    .end local p0    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    .restart local v24    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    goto/16 :goto_0

    .line 78
    .end local v24    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    .restart local p0    # "this":Lio/fabric/sdk/android/services/settings/Settings;
    :catchall_0
    move-exception v9

    monitor-exit p0

    throw v9
.end method

.method public declared-synchronized loadSettingsData()Z
    .locals 2

    .prologue
    .line 156
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

    invoke-interface {v1}, Lio/fabric/sdk/android/services/settings/SettingsController;->loadSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v0

    .line 157
    .local v0, "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/Settings;->setSettingsData(Lio/fabric/sdk/android/services/settings/SettingsData;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :goto_0
    monitor-exit p0

    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 156
    .end local v0    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized loadSettingsSkippingCache()Z
    .locals 5

    .prologue
    .line 166
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

    sget-object v2, Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;->SKIP_CACHE_LOOKUP:Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;

    invoke-interface {v1, v2}, Lio/fabric/sdk/android/services/settings/SettingsController;->loadSettingsData(Lio/fabric/sdk/android/services/settings/SettingsCacheBehavior;)Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v0

    .line 168
    .local v0, "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/Settings;->setSettingsData(Lio/fabric/sdk/android/services/settings/SettingsData;)V

    .line 170
    if-nez v0, :cond_0

    .line 171
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Failed to force reload of settings from Crashlytics."

    const/4 v4, 0x0

    invoke-interface {v1, v2, v3, v4}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :goto_0
    monitor-exit p0

    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 166
    .end local v0    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public setSettingsController(Lio/fabric/sdk/android/services/settings/SettingsController;)V
    .locals 0
    .param p1, "settingsController"    # Lio/fabric/sdk/android/services/settings/SettingsController;

    .prologue
    .line 126
    iput-object p1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsController:Lio/fabric/sdk/android/services/settings/SettingsController;

    .line 127
    return-void
.end method

.method public withSettings(Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess",
            "<TT;>;TT;)TT;"
        }
    .end annotation

    .prologue
    .line 130
    .local p1, "access":Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess;, "Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess<TT;>;"
    .local p2, "defaultValue":Ljava/lang/Object;, "TT;"
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/Settings;->settingsData:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/settings/SettingsData;

    .line 131
    .local v0, "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    if-nez v0, :cond_0

    .end local p2    # "defaultValue":Ljava/lang/Object;, "TT;"
    :goto_0
    return-object p2

    .restart local p2    # "defaultValue":Ljava/lang/Object;, "TT;"
    :cond_0
    invoke-interface {p1, v0}, Lio/fabric/sdk/android/services/settings/Settings$SettingsAccess;->usingSettings(Lio/fabric/sdk/android/services/settings/SettingsData;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0
.end method
