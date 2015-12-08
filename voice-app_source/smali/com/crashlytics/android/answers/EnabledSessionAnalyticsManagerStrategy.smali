.class Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;
.super Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;
.source "EnabledSessionAnalyticsManagerStrategy.java"

# interfaces
.implements Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy",
        "<",
        "Lcom/crashlytics/android/answers/SessionEvent;",
        ">;",
        "Lcom/crashlytics/android/answers/SessionAnalyticsManagerStrategy",
        "<",
        "Lcom/crashlytics/android/answers/SessionEvent;",
        ">;"
    }
.end annotation


# instance fields
.field apiKey:Lio/fabric/sdk/android/services/common/ApiKey;

.field customEventsEnabled:Z

.field eventFilter:Lcom/crashlytics/android/answers/EventFilter;

.field filesSender:Lio/fabric/sdk/android/services/events/FilesSender;

.field private final httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

.field private final kit:Lio/fabric/sdk/android/Kit;

.field final metadata:Lcom/crashlytics/android/answers/SessionEventMetadata;

.field predefinedEventsEnabled:Z


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lcom/crashlytics/android/answers/SessionEventMetadata;)V
    .locals 2
    .param p1, "kit"    # Lio/fabric/sdk/android/Kit;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "executor"    # Ljava/util/concurrent/ScheduledExecutorService;
    .param p4, "filesManager"    # Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;
    .param p5, "httpRequestFactory"    # Lio/fabric/sdk/android/services/network/HttpRequestFactory;
    .param p6, "metadata"    # Lcom/crashlytics/android/answers/SessionEventMetadata;

    .prologue
    const/4 v1, 0x1

    .line 40
    invoke-direct {p0, p2, p3, p4}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lio/fabric/sdk/android/services/events/EventsFilesManager;)V

    .line 30
    new-instance v0, Lcom/crashlytics/android/answers/KeepAllEventFilter;

    invoke-direct {v0}, Lcom/crashlytics/android/answers/KeepAllEventFilter;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->eventFilter:Lcom/crashlytics/android/answers/EventFilter;

    .line 32
    new-instance v0, Lio/fabric/sdk/android/services/common/ApiKey;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/common/ApiKey;-><init>()V

    iput-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->apiKey:Lio/fabric/sdk/android/services/common/ApiKey;

    .line 33
    iput-boolean v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->customEventsEnabled:Z

    .line 34
    iput-boolean v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->predefinedEventsEnabled:Z

    .line 41
    iput-object p1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->kit:Lio/fabric/sdk/android/Kit;

    .line 42
    iput-object p5, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    .line 43
    iput-object p6, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->metadata:Lcom/crashlytics/android/answers/SessionEventMetadata;

    .line 44
    return-void
.end method


# virtual methods
.method public getFilesSender()Lio/fabric/sdk/android/services/events/FilesSender;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->filesSender:Lio/fabric/sdk/android/services/events/FilesSender;

    return-object v0
.end method

.method public processEvent(Lcom/crashlytics/android/answers/SessionEvent$Builder;)V
    .locals 5
    .param p1, "builder"    # Lcom/crashlytics/android/answers/SessionEvent$Builder;

    .prologue
    .line 78
    iget-object v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->metadata:Lcom/crashlytics/android/answers/SessionEventMetadata;

    invoke-virtual {p1, v1}, Lcom/crashlytics/android/answers/SessionEvent$Builder;->build(Lcom/crashlytics/android/answers/SessionEventMetadata;)Lcom/crashlytics/android/answers/SessionEvent;

    move-result-object v0

    .line 80
    .local v0, "event":Lcom/crashlytics/android/answers/SessionEvent;
    iget-boolean v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->customEventsEnabled:Z

    if-nez v1, :cond_0

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->CUSTOM:Lcom/crashlytics/android/answers/SessionEvent$Type;

    iget-object v2, v0, Lcom/crashlytics/android/answers/SessionEvent;->type:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v1, v2}, Lcom/crashlytics/android/answers/SessionEvent$Type;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Custom events tracking disabled - skipping event: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-boolean v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->predefinedEventsEnabled:Z

    if-nez v1, :cond_1

    sget-object v1, Lcom/crashlytics/android/answers/SessionEvent$Type;->PREDEFINED:Lcom/crashlytics/android/answers/SessionEvent$Type;

    iget-object v2, v0, Lcom/crashlytics/android/answers/SessionEvent;->type:Lcom/crashlytics/android/answers/SessionEvent$Type;

    invoke-virtual {v1, v2}, Lcom/crashlytics/android/answers/SessionEvent$Type;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 87
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Predefined events tracking disabled - skipping event: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->eventFilter:Lcom/crashlytics/android/answers/EventFilter;

    invoke-interface {v1, v0}, Lcom/crashlytics/android/answers/EventFilter;->skipEvent(Lcom/crashlytics/android/answers/SessionEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skipping filtered event: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0, v0}, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->recordEvent(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Ljava/lang/String;)V
    .locals 6
    .param p1, "analyticsSettingsData"    # Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    .param p2, "protocolAndHostOverride"    # Ljava/lang/String;

    .prologue
    .line 54
    new-instance v0, Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;

    iget-object v1, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->kit:Lio/fabric/sdk/android/Kit;

    iget-object v3, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->analyticsURL:Ljava/lang/String;

    iget-object v4, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->httpRequestFactory:Lio/fabric/sdk/android/services/network/HttpRequestFactory;

    iget-object v2, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->apiKey:Lio/fabric/sdk/android/services/common/ApiKey;

    iget-object v5, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->context:Landroid/content/Context;

    invoke-virtual {v2, v5}, Lio/fabric/sdk/android/services/common/ApiKey;->getValue(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->build(Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;)Lcom/crashlytics/android/answers/AnswersRetryFilesSender;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->filesSender:Lio/fabric/sdk/android/services/events/FilesSender;

    .line 57
    iget-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->filesManager:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    check-cast v0, Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;->setAnalyticsSettingsData(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;)V

    .line 60
    iget-boolean v0, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->trackCustomEvents:Z

    iput-boolean v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->customEventsEnabled:Z

    .line 61
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Custom event tracking "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->customEventsEnabled:Z

    if-eqz v0, :cond_1

    const-string v0, "enabled"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-boolean v0, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->trackPredefinedEvents:Z

    iput-boolean v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->predefinedEventsEnabled:Z

    .line 65
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Answers"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Predefined event tracking "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->predefinedEventsEnabled:Z

    if-eqz v0, :cond_2

    const-string v0, "enabled"

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget v0, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->samplingRate:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 69
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Answers"

    const-string v2, "Event sampling enabled"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lcom/crashlytics/android/answers/SamplingEventFilter;

    iget v1, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->samplingRate:I

    invoke-direct {v0, v1}, Lcom/crashlytics/android/answers/SamplingEventFilter;-><init>(I)V

    iput-object v0, p0, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->eventFilter:Lcom/crashlytics/android/answers/EventFilter;

    .line 73
    :cond_0
    iget v0, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->flushIntervalSeconds:I

    invoke-virtual {p0, v0}, Lcom/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;->configureRollover(I)V

    .line 74
    return-void

    .line 61
    :cond_1
    const-string v0, "disabled"

    goto :goto_0

    .line 65
    :cond_2
    const-string v0, "disabled"

    goto :goto_1
.end method
