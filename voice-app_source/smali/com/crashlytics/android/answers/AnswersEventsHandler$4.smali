.class Lcom/crashlytics/android/answers/AnswersEventsHandler$4;
.super Ljava/lang/Object;
.source "AnswersEventsHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/answers/AnswersEventsHandler;->enable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/answers/AnswersEventsHandler;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    # getter for: Lcom/crashlytics/android/answers/AnswersEventsHandler;->metadataCollector:Lcom/crashlytics/android/answers/SessionMetadataCollector;
    invoke-static {v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->access$000(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lcom/crashlytics/android/answers/SessionMetadataCollector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/answers/SessionMetadataCollector;->getMetadata()Lcom/crashlytics/android/answers/SessionEventMetadata;

    move-result-object v6

    .line 131
    .local v6, "metadata":Lcom/crashlytics/android/answers/SessionEventMetadata;
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    # getter for: Lcom/crashlytics/android/answers/AnswersEventsHandler;->filesManagerProvider:Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
    invoke-static {v0}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->access$100(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->getAnalyticsFilesManager()Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;

    move-result-object v4

    .line 133
    .local v4, "filesManager":Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;
    iget-object v0, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    invoke-virtual {v4, v0}, Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;->registerRollOverListener(Lio/fabric/sdk/android/services/events/EventsStorageListener;)V

    .line 134
    iget-object v8, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    new-instance v0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;

    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    # getter for: Lcom/crashlytics/android/answers/AnswersEventsHandler;->kit:Lio/fabric/sdk/android/Kit;
    invoke-static {v1}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->access$200(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lio/fabric/sdk/android/Kit;

    move-result-object v1

    iget-object v2, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    # getter for: Lcom/crashlytics/android/answers/AnswersEventsHandler;->context:Landroid/content/Context;
    invoke-static {v2}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->access$300(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    iget-object v3, v3, Lcom/crashlytics/android/answers/AnswersEventsHandler;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, p0, Lcom/crashlytics/android/answers/AnswersEventsHandler$4;->this$0:Lcom/crashlytics/android/answers/AnswersEventsHandler;

    # getter for: Lcom/crashlytics/android/answers/AnswersEventsHandler;->requestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    invoke-static {v5}, Lcom/crashlytics/android/answers/AnswersEventsHandler;->access$400(Lcom/crashlytics/android/answers/AnswersEventsHandler;)Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    move-result-object v5

    invoke-direct/range {v0 .. v6}, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;-><init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lcom/crashlytics/android/answers/SessionEventMetadata;)V

    iput-object v0, v8, Lcom/crashlytics/android/answers/AnswersEventsHandler;->strategy:Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .end local v4    # "filesManager":Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;
    .end local v6    # "metadata":Lcom/crashlytics/android/answers/SessionEventMetadata;
    :goto_0
    return-void

    .line 136
    :catch_0
    move-exception v7

    .line 137
    .local v7, "e":Ljava/lang/Exception;
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Answers"

    const-string v2, "Failed to enable events"

    invoke-interface {v0, v1, v2, v7}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
