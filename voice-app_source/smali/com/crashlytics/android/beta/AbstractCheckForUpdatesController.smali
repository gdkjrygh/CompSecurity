.class abstract Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;
.super Ljava/lang/Object;
.source "AbstractCheckForUpdatesController.java"

# interfaces
.implements Lcom/crashlytics/android/beta/UpdatesController;


# static fields
.field static final LAST_UPDATE_CHECK_DEFAULT:J = 0x0L

.field static final LAST_UPDATE_CHECK_KEY:Ljava/lang/String; = "last_update_check"

.field private static final MILLIS_PER_SECOND:J = 0x3e8L


# instance fields
.field private beta:Lcom/crashlytics/android/beta/Beta;

.field private betaSettings:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

.field private buildProps:Lcom/crashlytics/android/beta/BuildProperties;

.field private context:Landroid/content/Context;

.field private currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

.field private final externallyReady:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field private idManager:Lio/fabric/sdk/android/services/common/IdManager;

.field private final initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private lastCheckTimeMillis:J

.field private preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;-><init>(Z)V

    .line 61
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2
    .param p1, "externallyReady"    # Z

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->lastCheckTimeMillis:J

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->externallyReady:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    return-void
.end method

.method private performUpdateCheck()V
    .locals 8

    .prologue
    .line 149
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Beta"

    const-string v3, "Performing update check"

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v1, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v1}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    iget-object v2, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 152
    .local v6, "apiKey":Ljava/lang/String;
    iget-object v1, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    iget-object v2, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->buildProps:Lcom/crashlytics/android/beta/BuildProperties;

    iget-object v2, v2, Lcom/crashlytics/android/beta/BuildProperties;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v6, v2}, Lio/fabric/sdk/android/services/common/IdManager;->createIdHeaderValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 155
    .local v7, "idHeaderValue":Ljava/lang/String;
    new-instance v0, Lcom/crashlytics/android/beta/CheckForUpdatesRequest;

    iget-object v1, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->beta:Lcom/crashlytics/android/beta/Beta;

    iget-object v2, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->beta:Lcom/crashlytics/android/beta/Beta;

    invoke-virtual {v2}, Lcom/crashlytics/android/beta/Beta;->getOverridenSpiEndpoint()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->betaSettings:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    iget-object v3, v3, Lio/fabric/sdk/android/services/settings/BetaSettingsData;->updateUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    new-instance v5, Lcom/crashlytics/android/beta/CheckForUpdatesResponseTransform;

    invoke-direct {v5}, Lcom/crashlytics/android/beta/CheckForUpdatesResponseTransform;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/beta/CheckForUpdatesRequest;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lcom/crashlytics/android/beta/CheckForUpdatesResponseTransform;)V

    .line 166
    .local v0, "request":Lcom/crashlytics/android/beta/CheckForUpdatesRequest;
    iget-object v1, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->buildProps:Lcom/crashlytics/android/beta/BuildProperties;

    invoke-virtual {v0, v6, v7, v1}, Lcom/crashlytics/android/beta/CheckForUpdatesRequest;->invoke(Ljava/lang/String;Ljava/lang/String;Lcom/crashlytics/android/beta/BuildProperties;)Lcom/crashlytics/android/beta/CheckForUpdatesResponse;

    .line 167
    return-void
.end method


# virtual methods
.method protected checkForUpdates()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 118
    iget-object v7, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    monitor-enter v7

    .line 119
    :try_start_0
    iget-object v6, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v6}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->get()Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v8, "last_update_check"

    invoke-interface {v6, v8}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 120
    iget-object v6, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    iget-object v8, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v8}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    const-string v9, "last_update_check"

    invoke-interface {v8, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    invoke-interface {v6, v8}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->save(Landroid/content/SharedPreferences$Editor;)Z

    .line 122
    :cond_0
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object v6, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    invoke-interface {v6}, Lio/fabric/sdk/android/services/common/CurrentTimeProvider;->getCurrentTimeMillis()J

    move-result-wide v0

    .line 125
    .local v0, "currentTimeMillis":J
    iget-object v6, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->betaSettings:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    iget v6, v6, Lio/fabric/sdk/android/services/settings/BetaSettingsData;->updateSuspendDurationSeconds:I

    int-to-long v6, v6

    const-wide/16 v8, 0x3e8

    mul-long v4, v6, v8

    .line 128
    .local v4, "updateCheckDelayMillis":J
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "Beta"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Check for updates delay: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "Beta"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Check for updates last check time: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {p0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->getLastCheckTimeMillis()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-virtual {p0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->getLastCheckTimeMillis()J

    move-result-wide v6

    add-long v2, v6, v4

    .line 134
    .local v2, "nextCheckTimeMillis":J
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "Beta"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Check for updates current time: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ", next check time: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    cmp-long v6, v0, v2

    if-ltz v6, :cond_1

    .line 139
    :try_start_1
    invoke-direct {p0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->performUpdateCheck()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->setLastCheckTimeMillis(J)V

    .line 146
    :goto_0
    return-void

    .line 122
    .end local v0    # "currentTimeMillis":J
    .end local v2    # "nextCheckTimeMillis":J
    .end local v4    # "updateCheckDelayMillis":J
    :catchall_0
    move-exception v6

    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v6

    .line 141
    .restart local v0    # "currentTimeMillis":J
    .restart local v2    # "nextCheckTimeMillis":J
    .restart local v4    # "updateCheckDelayMillis":J
    :catchall_1
    move-exception v6

    invoke-virtual {p0, v0, v1}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->setLastCheckTimeMillis(J)V

    throw v6

    .line 144
    :cond_1
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v6

    const-string v7, "Beta"

    const-string v8, "Check for updates next check time was not passed"

    invoke-interface {v6, v7, v8}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method getLastCheckTimeMillis()J
    .locals 2

    .prologue
    .line 180
    iget-wide v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->lastCheckTimeMillis:J

    return-wide v0
.end method

.method public initialize(Landroid/content/Context;Lcom/crashlytics/android/beta/Beta;Lio/fabric/sdk/android/services/common/IdManager;Lio/fabric/sdk/android/services/settings/BetaSettingsData;Lcom/crashlytics/android/beta/BuildProperties;Lio/fabric/sdk/android/services/persistence/PreferenceStore;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "beta"    # Lcom/crashlytics/android/beta/Beta;
    .param p3, "idManager"    # Lio/fabric/sdk/android/services/common/IdManager;
    .param p4, "betaSettings"    # Lio/fabric/sdk/android/services/settings/BetaSettingsData;
    .param p5, "buildProps"    # Lcom/crashlytics/android/beta/BuildProperties;
    .param p6, "preferenceStore"    # Lio/fabric/sdk/android/services/persistence/PreferenceStore;
    .param p7, "currentTimeProvider"    # Lio/fabric/sdk/android/services/common/CurrentTimeProvider;
    .param p8, "httpRequestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .prologue
    .line 81
    iput-object p1, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->context:Landroid/content/Context;

    .line 82
    iput-object p2, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->beta:Lcom/crashlytics/android/beta/Beta;

    .line 83
    iput-object p3, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    .line 84
    iput-object p4, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->betaSettings:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    .line 85
    iput-object p5, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->buildProps:Lcom/crashlytics/android/beta/BuildProperties;

    .line 86
    iput-object p6, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->preferenceStore:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    .line 87
    iput-object p7, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->currentTimeProvider:Lio/fabric/sdk/android/services/common/CurrentTimeProvider;

    .line 88
    iput-object p8, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 90
    invoke-virtual {p0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->signalInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->checkForUpdates()V

    .line 93
    :cond_0
    return-void
.end method

.method setLastCheckTimeMillis(J)V
    .locals 1
    .param p1, "time"    # J

    .prologue
    .line 173
    iput-wide p1, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->lastCheckTimeMillis:J

    .line 174
    return-void
.end method

.method protected signalExternallyReady()Z
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->externallyReady:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    iget-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method signalInitialized()Z
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 111
    iget-object v0, p0, Lcom/crashlytics/android/beta/AbstractCheckForUpdatesController;->externallyReady:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
