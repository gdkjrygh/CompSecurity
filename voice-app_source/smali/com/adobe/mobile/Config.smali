.class public final Lcom/adobe/mobile/Config;
.super Ljava/lang/Object;
.source "Config.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/Config$ApplicationType;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public static collectLifecycleData()V
    .locals 2

    .prologue
    .line 168
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const-string v0, "Analytics - Method collectLifecycleData is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_0
    return-void

    .line 173
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$7;

    invoke-direct {v1}, Lcom/adobe/mobile/Config$7;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static collectLifecycleData(Landroid/app/Activity;)V
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 182
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const-string v0, "Analytics - Method collectLifecycleData is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    return-void

    .line 186
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$8;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Config$8;-><init>(Landroid/app/Activity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static collectLifecycleData(Landroid/app/Activity;Ljava/util/Map;)V
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 195
    .local p1, "contextData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "Analytics - Method collectLifecycleData is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_0
    return-void

    .line 199
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$9;

    invoke-direct {v1, p0, p1}, Lcom/adobe/mobile/Config$9;-><init>(Landroid/app/Activity;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static getApplicationType()Lcom/adobe/mobile/Config$ApplicationType;
    .locals 1

    .prologue
    .line 129
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getApplicaionType()Lcom/adobe/mobile/Config$ApplicationType;

    move-result-object v0

    return-object v0
.end method

.method public static getDebugLogging()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 139
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getDebugLogging()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static getLifetimeValue()Ljava/math/BigDecimal;
    .locals 6

    .prologue
    .line 149
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/Config$6;

    invoke-direct {v2}, Lcom/adobe/mobile/Config$6;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 156
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/math/BigDecimal;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 159
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/math/BigDecimal;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :goto_0
    return-object v2

    .line 160
    :catch_0
    move-exception v0

    .line 161
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Analytics - Unable to get lifetime value (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static getPrivacyStatus()Lcom/adobe/mobile/MobilePrivacyStatus;
    .locals 6

    .prologue
    .line 73
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/Config$2;

    invoke-direct {v2}, Lcom/adobe/mobile/Config$2;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 80
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Lcom/adobe/mobile/MobilePrivacyStatus;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 83
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/adobe/mobile/MobilePrivacyStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_0
    return-object v2

    .line 84
    :catch_0
    move-exception v0

    .line 85
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Analytics - Unable to get PrivacyStatus (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static getUserIdentifier()Ljava/lang/String;
    .locals 6

    .prologue
    .line 101
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/adobe/mobile/Config$4;

    invoke-direct {v2}, Lcom/adobe/mobile/Config$4;-><init>()V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 108
    .local v1, "f":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/String;>;"
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 111
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :goto_0
    return-object v2

    .line 112
    :catch_0
    move-exception v0

    .line 113
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Analytics - Unable to get UserIdentifier (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    const-string v0, "4.5.0-AN"

    return-object v0
.end method

.method public static overrideConfigStream(Ljava/io/InputStream;)V
    .locals 0
    .param p0, "stream"    # Ljava/io/InputStream;

    .prologue
    .line 248
    invoke-static {p0}, Lcom/adobe/mobile/MobileConfig;->setUserDefinedConfigPath(Ljava/io/InputStream;)V

    .line 249
    return-void
.end method

.method public static pauseCollectingLifecycleData()V
    .locals 2

    .prologue
    .line 208
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    const-string v0, "Analytics - Method pauseCollectingLifecycleData is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    :goto_0
    return-void

    .line 212
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/MessageAlert;->clearCurrentDialog()V

    .line 213
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$10;

    invoke-direct {v1}, Lcom/adobe/mobile/Config$10;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static setApplicationType(Lcom/adobe/mobile/Config$ApplicationType;)V
    .locals 0
    .param p0, "appType"    # Lcom/adobe/mobile/Config$ApplicationType;

    .prologue
    .line 134
    invoke-static {p0}, Lcom/adobe/mobile/StaticMethods;->setApplicationType(Lcom/adobe/mobile/Config$ApplicationType;)V

    .line 135
    return-void
.end method

.method public static setContext(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 50
    sget-object v0, Lcom/adobe/mobile/Config$ApplicationType;->APPLICATION_TYPE_HANDHELD:Lcom/adobe/mobile/Config$ApplicationType;

    invoke-static {p0, v0}, Lcom/adobe/mobile/Config;->setContext(Landroid/content/Context;Lcom/adobe/mobile/Config$ApplicationType;)V

    .line 52
    return-void
.end method

.method public static setContext(Landroid/content/Context;Lcom/adobe/mobile/Config$ApplicationType;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "appType"    # Lcom/adobe/mobile/Config$ApplicationType;

    .prologue
    .line 56
    invoke-static {p0}, Lcom/adobe/mobile/StaticMethods;->setSharedContext(Landroid/content/Context;)V

    .line 57
    invoke-static {p1}, Lcom/adobe/mobile/Config;->setApplicationType(Lcom/adobe/mobile/Config$ApplicationType;)V

    .line 58
    sget-object v0, Lcom/adobe/mobile/Config$ApplicationType;->APPLICATION_TYPE_WEARABLE:Lcom/adobe/mobile/Config$ApplicationType;

    if-ne p1, v0, :cond_0

    .line 59
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$1;

    invoke-direct {v1}, Lcom/adobe/mobile/Config$1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 65
    :cond_0
    return-void
.end method

.method public static setDebugLogging(Ljava/lang/Boolean;)V
    .locals 1
    .param p0, "debugLogging"    # Ljava/lang/Boolean;

    .prologue
    .line 144
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lcom/adobe/mobile/StaticMethods;->setDebugLogging(Z)V

    .line 145
    return-void
.end method

.method public static setLargeIconResourceId(I)V
    .locals 2
    .param p0, "resourceId"    # I

    .prologue
    .line 235
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const-string v0, "Analytics - Method setLargeIconResourceId is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_0
    return-void

    .line 239
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessagesExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$12;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Config$12;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static setPrivacyStatus(Lcom/adobe/mobile/MobilePrivacyStatus;)V
    .locals 2
    .param p0, "status"    # Lcom/adobe/mobile/MobilePrivacyStatus;

    .prologue
    .line 92
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$3;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Config$3;-><init>(Lcom/adobe/mobile/MobilePrivacyStatus;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 97
    return-void
.end method

.method public static setSmallIconResourceId(I)V
    .locals 2
    .param p0, "resourceId"    # I

    .prologue
    .line 222
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->isWearableApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const-string v0, "Analytics - Method setSmallIconResourceId is not available for Wearable"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/adobe/mobile/StaticMethods;->logWarningFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :goto_0
    return-void

    .line 226
    :cond_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getMessagesExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$11;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Config$11;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public static setUserIdentifier(Ljava/lang/String;)V
    .locals 2
    .param p0, "identifier"    # Ljava/lang/String;

    .prologue
    .line 120
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getAnalyticsExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/adobe/mobile/Config$5;

    invoke-direct {v1, p0}, Lcom/adobe/mobile/Config$5;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 125
    return-void
.end method
