.class public Lcom/crashlytics/android/answers/Answers;
.super Lio/fabric/sdk/android/Kit;
.source "Answers.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/Kit",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field static final CRASHLYTICS_API_ENDPOINT:Ljava/lang/String; = "com.crashlytics.ApiEndpoint"

.field static final FIRST_LAUNCH_INTERVAL_IN_MS:J = 0x36ee80L

.field static final PREF_STORE_NAME:Ljava/lang/String; = "settings"

.field public static final TAG:Ljava/lang/String; = "Answers"


# instance fields
.field analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

.field private installedAt:J

.field lifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

.field preferenceManager:Lcom/crashlytics/android/answers/AnswersPreferenceManager;

.field private versionCode:Ljava/lang/String;

.field private versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lio/fabric/sdk/android/Kit;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/crashlytics/android/answers/Answers;
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/crashlytics/android/answers/Answers;

    invoke-static {v0}, Lio/fabric/sdk/android/Fabric;->getKit(Ljava/lang/Class;)Lio/fabric/sdk/android/Kit;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/answers/Answers;

    return-object v0
.end method

.method private initializeSessionAnalytics(Landroid/content/Context;)V
    .locals 10
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 423
    :try_start_0
    new-instance v4, Lcom/crashlytics/android/answers/SessionMetadataCollector;

    invoke-virtual {p0}, Lcom/crashlytics/android/answers/Answers;->getIdManager()Lio/fabric/sdk/android/services/common/IdManager;

    move-result-object v1

    iget-object v2, p0, Lcom/crashlytics/android/answers/Answers;->versionCode:Ljava/lang/String;

    iget-object v5, p0, Lcom/crashlytics/android/answers/Answers;->versionName:Ljava/lang/String;

    invoke-direct {v4, p1, v1, v2, v5}, Lcom/crashlytics/android/answers/SessionMetadataCollector;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/common/IdManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .local v4, "metadataCollector":Lcom/crashlytics/android/answers/SessionMetadataCollector;
    new-instance v3, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

    new-instance v1, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/services/persistence/FileStoreImpl;-><init>(Lio/fabric/sdk/android/Kit;)V

    invoke-direct {v3, p1, v1}, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/persistence/FileStore;)V

    .line 427
    .local v3, "filesManagerProvider":Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler;

    new-instance v5, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;

    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    invoke-direct {v5, v1}, Lio/fabric/sdk/android/services/network/DefaultHttpRequestFactory;-><init>(Lio/fabric/sdk/android/Logger;)V

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/answers/AnswersEventsHandler;-><init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;Lcom/crashlytics/android/answers/SessionMetadataCollector;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V

    .line 431
    .local v0, "answersEventsHandler":Lcom/crashlytics/android/answers/AnswersEventsHandler;
    invoke-virtual {v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->enable()V

    .line 432
    new-instance v1, Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;)V

    iput-object v1, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    .line 433
    iget-object v1, p0, Lcom/crashlytics/android/answers/Answers;->lifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    new-instance v2, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;

    iget-object v5, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-direct {v2, v5}, Lcom/crashlytics/android/answers/AnswersLifecycleCallbacks;-><init>(Lcom/crashlytics/android/answers/SessionAnalyticsManager;)V

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/ActivityLifecycleManager;->registerCallbacks(Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;)Z

    .line 435
    iget-wide v8, p0, Lcom/crashlytics/android/answers/Answers;->installedAt:J

    invoke-virtual {p0, v8, v9}, Lcom/crashlytics/android/answers/Answers;->isFirstLaunch(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 436
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    const-string v5, "New app install detected"

    invoke-interface {v1, v2, v5}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    iget-object v1, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onInstall()V

    .line 438
    iget-object v1, p0, Lcom/crashlytics/android/answers/Answers;->preferenceManager:Lcom/crashlytics/android/answers/AnswersPreferenceManager;

    invoke-virtual {v1}, Lcom/crashlytics/android/answers/AnswersPreferenceManager;->setAnalyticsLaunched()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 444
    .end local v0    # "answersEventsHandler":Lcom/crashlytics/android/answers/AnswersEventsHandler;
    .end local v3    # "filesManagerProvider":Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    .end local v4    # "metadataCollector":Lcom/crashlytics/android/answers/SessionMetadataCollector;
    :cond_0
    :goto_0
    return-void

    .line 441
    :catch_0
    move-exception v6

    .line 442
    .local v6, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    const-string v5, "Failed to initialize"

    invoke-interface {v1, v2, v5, v6}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method protected doInBackground()Ljava/lang/Boolean;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 388
    :try_start_0
    invoke-static {}, Lio/fabric/sdk/android/services/settings/Settings;->getInstance()Lio/fabric/sdk/android/services/settings/Settings;

    move-result-object v2

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/settings/Settings;->awaitSettingsData()Lio/fabric/sdk/android/services/settings/SettingsData;

    move-result-object v1

    .line 389
    .local v1, "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    if-nez v1, :cond_0

    .line 390
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Answers"

    const-string v4, "Failed to retrieve settings"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 408
    .end local v1    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :goto_0
    return-object v2

    .line 394
    .restart local v1    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :cond_0
    iget-object v2, v1, Lio/fabric/sdk/android/services/settings/SettingsData;->featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    iget-boolean v2, v2, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectAnalytics:Z

    if-eqz v2, :cond_1

    .line 395
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Answers"

    const-string v4, "Analytics collection enabled"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    iget-object v2, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    iget-object v3, v1, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    invoke-virtual {p0}, Lcom/crashlytics/android/answers/Answers;->getOverridenSpiEndpoint()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V

    .line 398
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    .line 400
    :cond_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Answers"

    const-string v4, "Analytics collection disabled"

    invoke-interface {v2, v3, v4}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    iget-object v2, p0, Lcom/crashlytics/android/answers/Answers;->lifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    invoke-virtual {v2}, Lio/fabric/sdk/android/ActivityLifecycleManager;->resetCallbacks()V

    .line 402
    iget-object v2, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v2}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->disable()V

    .line 403
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 405
    .end local v1    # "settingsData":Lio/fabric/sdk/android/services/settings/SettingsData;
    :catch_0
    move-exception v0

    .line 406
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Answers"

    const-string v4, "Error dealing with settings"

    invoke-interface {v2, v3, v4, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0
.end method

.method protected bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/crashlytics/android/answers/Answers;->doInBackground()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 413
    const-string v0, "com.crashlytics.sdk.android:answers"

    return-object v0
.end method

.method getOverridenSpiEndpoint()Ljava/lang/String;
    .locals 2

    .prologue
    .line 449
    invoke-virtual {p0}, Lcom/crashlytics/android/answers/Answers;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/common/CommonUtils;->getStringsFileValue(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 418
    const-string v0, "1.3.1.74"

    return-object v0
.end method

.method installedRecently(J)Z
    .locals 5
    .param p1, "installedAt"    # J

    .prologue
    .line 472
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, p1

    .line 473
    .local v0, "timeDifferenceInMilliseconds":J
    const-wide/32 v2, 0x36ee80

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    const/4 v2, 0x1

    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method isFirstLaunch(J)Z
    .locals 1
    .param p1, "installedAt"    # J

    .prologue
    .line 462
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->preferenceManager:Lcom/crashlytics/android/answers/AnswersPreferenceManager;

    invoke-virtual {v0}, Lcom/crashlytics/android/answers/AnswersPreferenceManager;->hasAnalyticsLaunched()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/crashlytics/android/answers/Answers;->installedRecently(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public logAddToCart(Lcom/crashlytics/android/answers/AddToCartEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/AddToCartEvent;

    .prologue
    .line 242
    if-nez p1, :cond_0

    .line 243
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 248
    :cond_1
    return-void
.end method

.method public logContentView(Lcom/crashlytics/android/answers/ContentViewEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/ContentViewEvent;

    .prologue
    .line 310
    if-nez p1, :cond_0

    .line 311
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 313
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 316
    :cond_1
    return-void
.end method

.method public logCustom(Lcom/crashlytics/android/answers/CustomEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/CustomEvent;

    .prologue
    .line 64
    if-nez p1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onCustom(Lcom/crashlytics/android/answers/CustomEvent;)V

    .line 70
    :cond_1
    return-void
.end method

.method public logInvite(Lcom/crashlytics/android/answers/InviteEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/InviteEvent;

    .prologue
    .line 154
    if-nez p1, :cond_0

    .line 155
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 160
    :cond_1
    return-void
.end method

.method public logLevelEnd(Lcom/crashlytics/android/answers/LevelEndEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/LevelEndEvent;

    .prologue
    .line 217
    if-nez p1, :cond_0

    .line 218
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 221
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 223
    :cond_1
    return-void
.end method

.method public logLevelStart(Lcom/crashlytics/android/answers/LevelStartEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/LevelStartEvent;

    .prologue
    .line 195
    if-nez p1, :cond_0

    .line 196
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 201
    :cond_1
    return-void
.end method

.method public logLogin(Lcom/crashlytics/android/answers/LoginEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/LoginEvent;

    .prologue
    .line 111
    if-nez p1, :cond_0

    .line 112
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 117
    :cond_1
    return-void
.end method

.method public logPurchase(Lcom/crashlytics/android/answers/PurchaseEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/PurchaseEvent;

    .prologue
    .line 90
    if-nez p1, :cond_0

    .line 91
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 94
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 96
    :cond_1
    return-void
.end method

.method public logRating(Lcom/crashlytics/android/answers/RatingEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/RatingEvent;

    .prologue
    .line 288
    if-nez p1, :cond_0

    .line 289
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 292
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 294
    :cond_1
    return-void
.end method

.method public logSearch(Lcom/crashlytics/android/answers/SearchEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/SearchEvent;

    .prologue
    .line 330
    if-nez p1, :cond_0

    .line 331
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 336
    :cond_1
    return-void
.end method

.method public logShare(Lcom/crashlytics/android/answers/ShareEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/ShareEvent;

    .prologue
    .line 134
    if-nez p1, :cond_0

    .line 135
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 140
    :cond_1
    return-void
.end method

.method public logSignUp(Lcom/crashlytics/android/answers/SignUpEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/SignUpEvent;

    .prologue
    .line 175
    if-nez p1, :cond_0

    .line 176
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 181
    :cond_1
    return-void
.end method

.method public logStartCheckout(Lcom/crashlytics/android/answers/StartCheckoutEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/crashlytics/android/answers/StartCheckoutEvent;

    .prologue
    .line 265
    if-nez p1, :cond_0

    .line 266
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "event must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_1

    .line 269
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onPredefined(Lcom/crashlytics/android/answers/PredefinedEvent;)V

    .line 271
    :cond_1
    return-void
.end method

.method public onException(Lio/fabric/sdk/android/services/common/Crash$FatalException;)V
    .locals 2
    .param p1, "exception"    # Lio/fabric/sdk/android/services/common/Crash$FatalException;

    .prologue
    .line 345
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {p1}, Lio/fabric/sdk/android/services/common/Crash$FatalException;->getSessionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onCrash(Ljava/lang/String;)V

    .line 348
    :cond_0
    return-void
.end method

.method public onException(Lio/fabric/sdk/android/services/common/Crash$LoggedException;)V
    .locals 2
    .param p1, "exception"    # Lio/fabric/sdk/android/services/common/Crash$LoggedException;

    .prologue
    .line 339
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/crashlytics/android/answers/Answers;->analyticsManager:Lcom/crashlytics/android/answers/SessionAnalyticsManager;

    invoke-virtual {p1}, Lio/fabric/sdk/android/services/common/Crash$LoggedException;->getSessionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/answers/SessionAnalyticsManager;->onError(Ljava/lang/String;)V

    .line 342
    :cond_0
    return-void
.end method

.method protected onPreExecute()Z
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 354
    :try_start_0
    invoke-virtual {p0}, Lcom/crashlytics/android/answers/Answers;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 355
    .local v1, "context":Landroid/content/Context;
    new-instance v6, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;

    const-string v8, "settings"

    invoke-direct {v6, v1, v8}, Lio/fabric/sdk/android/services/persistence/PreferenceStoreImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 357
    .local v6, "prefStore":Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    new-instance v8, Lcom/crashlytics/android/answers/AnswersPreferenceManager;

    invoke-direct {v8, v6}, Lcom/crashlytics/android/answers/AnswersPreferenceManager;-><init>(Lio/fabric/sdk/android/services/persistence/PreferenceStore;)V

    iput-object v8, p0, Lcom/crashlytics/android/answers/Answers;->preferenceManager:Lcom/crashlytics/android/answers/AnswersPreferenceManager;

    .line 358
    new-instance v8, Lio/fabric/sdk/android/ActivityLifecycleManager;

    invoke-direct {v8, v1}, Lio/fabric/sdk/android/ActivityLifecycleManager;-><init>(Landroid/content/Context;)V

    iput-object v8, p0, Lcom/crashlytics/android/answers/Answers;->lifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    .line 360
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 361
    .local v4, "packageManager":Landroid/content/pm/PackageManager;
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 362
    .local v5, "packageName":Ljava/lang/String;
    const/4 v8, 0x0

    invoke-virtual {v4, v5, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 364
    .local v3, "packageInfo":Landroid/content/pm/PackageInfo;
    iget v8, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, p0, Lcom/crashlytics/android/answers/Answers;->versionCode:Ljava/lang/String;

    .line 365
    iget-object v8, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v8, :cond_0

    const-string v8, "0.0"

    :goto_0
    iput-object v8, p0, Lcom/crashlytics/android/answers/Answers;->versionName:Ljava/lang/String;

    .line 368
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x9

    if-lt v8, v9, :cond_1

    .line 369
    iget-wide v8, v3, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v8, p0, Lcom/crashlytics/android/answers/Answers;->installedAt:J

    .line 376
    :goto_1
    invoke-direct {p0, v1}, Lcom/crashlytics/android/answers/Answers;->initializeSessionAnalytics(Landroid/content/Context;)V

    .line 378
    const/4 v7, 0x1

    .line 382
    .end local v1    # "context":Landroid/content/Context;
    .end local v3    # "packageInfo":Landroid/content/pm/PackageInfo;
    .end local v4    # "packageManager":Landroid/content/pm/PackageManager;
    .end local v5    # "packageName":Ljava/lang/String;
    .end local v6    # "prefStore":Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    :goto_2
    return v7

    .line 365
    .restart local v1    # "context":Landroid/content/Context;
    .restart local v3    # "packageInfo":Landroid/content/pm/PackageInfo;
    .restart local v4    # "packageManager":Landroid/content/pm/PackageManager;
    .restart local v5    # "packageName":Ljava/lang/String;
    .restart local v6    # "prefStore":Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    :cond_0
    iget-object v8, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    goto :goto_0

    .line 371
    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 373
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    new-instance v8, Ljava/io/File;

    iget-object v9, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    iput-wide v8, p0, Lcom/crashlytics/android/answers/Answers;->installedAt:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 379
    .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .end local v1    # "context":Landroid/content/Context;
    .end local v3    # "packageInfo":Landroid/content/pm/PackageInfo;
    .end local v4    # "packageManager":Landroid/content/pm/PackageManager;
    .end local v5    # "packageName":Ljava/lang/String;
    .end local v6    # "prefStore":Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    :catch_0
    move-exception v2

    .line 380
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v8

    const-string v9, "Answers"

    const-string v10, "Error retrieving app properties"

    invoke-interface {v8, v9, v10, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method
