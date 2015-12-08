.class Lcom/crashlytics/android/answers/AnswersEventsHandler;
.super Ljava/lang/Object;
.source "AnswersEventsHandler.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/EventsStorageListener;


# static fields
.field private static final EXECUTOR_SERVICE:Ljava/lang/String; = "Answers Events Handler"


# instance fields
.field private final context:Landroid/content/Context;

.field final executor:Ljava/util/concurrent/ScheduledExecutorService;

.field private final filesManagerProvider:Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

.field private final kit:Lio/fabric/sdk/android/Kit;

.field private final metadataCollector:Lcom/crashlytics/android/answers/SessionMetadataCollector;

.field private final requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field strategy:Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;Lcom/crashlytics/android/answers/SessionMetadataCollector;Lio/fabric/sdk/android/services/network/HttpRequestFactory;)V
    .locals 7
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "filesManagerProvider"    # Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    .param p4, "metadataCollector"    # Lcom/crashlytics/android/answers/SessionMetadataCollector;
    .param p5, "requestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .prologue
    .line 35
    const-string v0, "Answers Events Handler"

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/ExecutorUtils;->buildSingleThreadScheduledExecutorService(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/crashlytics/android/answers/AnswersEventsHandler;-><init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;Lcom/crashlytics/android/answers/SessionMetadataCollector;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 37
    return-void
.end method

.method constructor <init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;Lcom/crashlytics/android/answers/SessionMetadataCollector;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "filesManagerProvider"    # Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    .param p4, "metadataCollector"    # Lcom/crashlytics/android/answers/SessionMetadataCollector;
    .param p5, "requestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    .param p6, "executor"    # Ljava/util/concurrent/ScheduledExecutorService;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/crashlytics/android/answers/DisabledSessionAnalyticsManagerStrategy;

    invoke-direct {v0}, Lcom/crashlytics/android/answers/DisabledSessionAnalyticsManagerStrategy;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->strategy:Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;

    .line 43
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->kit:Lio/fabric/sdk/android/Kit;

    .line 44
    iput-object p2, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->context:Landroid/content/Context;

    .line 45
    iput-object p3, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->filesManagerProvider:Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

    .line 46
    iput-object p4, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->metadataCollector:Lcom/crashlytics/android/answers/SessionMetadataCollector;

    .line 47
    iput-object p5, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 48
    iput-object p6, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    return-void
.end method

.method static synthetic access$000(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lcom/crashlytics/android/answers/SessionMetadataCollector;
    .locals 1
    .param p0, "x0"    # Lcom/crashlytics/android/answers/AnswersEventsHandler;

    .prologue
    .line 17
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->metadataCollector:Lcom/crashlytics/android/answers/SessionMetadataCollector;

    return-object v0
.end method

.method static synthetic access$100(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    .locals 1
    .param p0, "x0"    # Lcom/crashlytics/android/answers/AnswersEventsHandler;

    .prologue
    .line 17
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->filesManagerProvider:Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

    return-object v0
.end method

.method static synthetic access$200(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lio/fabric/sdk/android/Kit;
    .locals 1
    .param p0, "x0"    # Lcom/crashlytics/android/answers/AnswersEventsHandler;

    .prologue
    .line 17
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->kit:Lio/fabric/sdk/android/Kit;

    return-object v0
.end method

.method static synthetic access$300(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/crashlytics/android/answers/AnswersEventsHandler;

    .prologue
    .line 17
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$400(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    .locals 1
    .param p0, "x0"    # Lcom/crashlytics/android/answers/AnswersEventsHandler;

    .prologue
    .line 17
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    return-object v0
.end method

.method private executeAsync(Ljava/lang/Runnable;)V
    .locals 4
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    .line 176
    :try_start_0
    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :goto_0
    return-void

    .line 177
    :catch_0
    move-exception v0

    .line 178
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to submit events task"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private executeSync(Ljava/lang/Runnable;)V
    .locals 4
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    .line 168
    :try_start_0
    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    :goto_0
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 170
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to run events task"

    invoke-interface {v1, v2, v3, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public disable()V
    .locals 1

    .prologue
    .line 94
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler$2;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/answers/AnswersEventsHandler$2;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;)V

    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeAsync(Ljava/lang/Runnable;)V

    .line 106
    return-void
.end method

.method public enable()V
    .locals 1

    .prologue
    .line 126
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;)V

    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeAsync(Ljava/lang/Runnable;)V

    .line 141
    return-void
.end method

.method public onRollOver(Ljava/lang/String;)V
    .locals 1
    .param p1, "rolledOverFile"    # Ljava/lang/String;

    .prologue
    .line 110
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler$3;

    invoke-direct {v0, p0}, Lcom/crashlytics/android/answers/AnswersEventsHandler$3;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;)V

    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeAsync(Ljava/lang/Runnable;)V

    .line 120
    return-void
.end method

.method processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;ZZ)V
    .locals 1
    .param p1, "eventBuilder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;
    .param p2, "sync"    # Z
    .param p3, "flush"    # Z

    .prologue
    .line 144
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;

    invoke-direct {v0, p0, p1, p3}, Lcom/crashlytics/android/answers/AnswersEventsHandler$5;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;Lcom/crashlytics/android/answers/SessionEvent$Builder;Z)V

    .line 159
    .local v0, "runnable":Ljava/lang/Runnable;
    if-eqz p2, :cond_0

    .line 160
    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeSync(Ljava/lang/Runnable;)V

    .line 164
    :goto_0
    return-void

    .line 162
    :cond_0
    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeAsync(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public processEventAsync(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
    .locals 1
    .param p1, "eventBuilder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;

    .prologue
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, p1, v0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;ZZ)V

    .line 56
    return-void
.end method

.method public processEventAsyncAndFlush(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
    .locals 2
    .param p1, "eventBuilder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;

    .prologue
    .line 62
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;ZZ)V

    .line 63
    return-void
.end method

.method public processEventSync(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
    .locals 2
    .param p1, "eventBuilder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;

    .prologue
    .line 69
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;ZZ)V

    .line 70
    return-void
.end method

.method public setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V
    .locals 1
    .param p1, "analyticsSettingsData"    # Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    .param p2, "protocolAndHostOverride"    # Ljava/lang/String;

    .prologue
    .line 77
    new-instance v0, Lcom/crashlytics/android/answers/AnswersEventsHandler$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/crashlytics/android/answers/AnswersEventsHandler$1;-><init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executeAsync(Ljava/lang/Runnable;)V

    .line 88
    return-void
.end method
