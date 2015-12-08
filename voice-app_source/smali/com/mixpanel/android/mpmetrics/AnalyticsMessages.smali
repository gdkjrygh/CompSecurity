.class Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
.super Ljava/lang/Object;
.source "AnalyticsMessages.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;,
        Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;
    }
.end annotation


# static fields
.field private static final ENQUEUE_EVENTS:I = 0x1

.field private static final ENQUEUE_PEOPLE:I = 0x0

.field private static final FLUSH_QUEUE:I = 0x2

.field private static final INSTALL_DECIDE_CHECK:I = 0xc

.field private static final KILL_WORKER:I = 0x5

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Messages"

.field private static final REGISTER_FOR_GCM:I = 0xd

.field private static final sInstances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/content/Context;",
            "Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

.field private final mContext:Landroid/content/Context;

.field private final mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 598
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->sInstances:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;

    .line 47
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->getConfig(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    .line 48
    new-instance v0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;-><init>(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    .line 49
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 585
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 1

    .prologue
    .line 586
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    return-object v0
.end method

.method static synthetic access$2(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->logAboutMessageToMixpanel(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    .locals 4
    .param p0, "messageContext"    # Landroid/content/Context;

    .prologue
    .line 59
    sget-object v3, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->sInstances:Ljava/util/Map;

    monitor-enter v3

    .line 60
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 62
    .local v0, "appContext":Landroid/content/Context;
    sget-object v2, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->sInstances:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 63
    new-instance v1, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    invoke-direct {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;-><init>(Landroid/content/Context;)V

    .line 64
    .local v1, "ret":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    sget-object v2, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->sInstances:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :goto_0
    monitor-exit v3

    return-object v1

    .line 67
    .end local v1    # "ret":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    :cond_0
    sget-object v2, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->sInstances:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;

    .restart local v1    # "ret":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    goto :goto_0

    .line 59
    .end local v0    # "appContext":Landroid/content/Context;
    .end local v1    # "ret":Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private logAboutMessageToMixpanel(Ljava/lang/String;)V
    .locals 4
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 167
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "MixpanelAPI.Messages"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " (Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    :cond_0
    return-void
.end method

.method private logAboutMessageToMixpanel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 173
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/MPConfig;->DEBUG:Z

    if-eqz v0, :cond_0

    .line 174
    const-string v0, "MixpanelAPI.Messages"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " (Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 176
    :cond_0
    return-void
.end method


# virtual methods
.method public eventsMessage(Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;)V
    .locals 2
    .param p1, "eventDescription"    # Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;

    .prologue
    .line 74
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 75
    .local v0, "m":Landroid/os/Message;
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 76
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 77
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 78
    return-void
.end method

.method protected getConfig(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 131
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    return-object v0
.end method

.method protected getPoster()Lcom/mixpanel/android/util/RemoteService;
    .locals 1

    .prologue
    .line 135
    new-instance v0, Lcom/mixpanel/android/util/HttpService;

    invoke-direct {v0}, Lcom/mixpanel/android/util/HttpService;-><init>()V

    return-object v0
.end method

.method public hardKill()V
    .locals 2

    .prologue
    .line 113
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 114
    .local v0, "m":Landroid/os/Message;
    const/4 v1, 0x5

    iput v1, v0, Landroid/os/Message;->what:I

    .line 116
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 117
    return-void
.end method

.method public installDecideCheck(Lcom/mixpanel/android/mpmetrics/DecideMessages;)V
    .locals 2
    .param p1, "check"    # Lcom/mixpanel/android/mpmetrics/DecideMessages;

    .prologue
    .line 97
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 98
    .local v0, "m":Landroid/os/Message;
    const/16 v1, 0xc

    iput v1, v0, Landroid/os/Message;->what:I

    .line 99
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 101
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 102
    return-void
.end method

.method isDead()Z
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->isDead()Z

    move-result v0

    return v0
.end method

.method protected makeDbAdapter(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPDbAdapter;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 127
    new-instance v0, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;

    invoke-direct {v0, p1}, Lcom/mixpanel/android/mpmetrics/MPDbAdapter;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public peopleMessage(Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "peopleJson"    # Lorg/json/JSONObject;

    .prologue
    .line 82
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 83
    .local v0, "m":Landroid/os/Message;
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    .line 84
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 86
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 87
    return-void
.end method

.method public postToServer()V
    .locals 2

    .prologue
    .line 90
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 91
    .local v0, "m":Landroid/os/Message;
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 93
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 94
    return-void
.end method

.method public registerForGCM(Ljava/lang/String;)V
    .locals 2
    .param p1, "senderID"    # Ljava/lang/String;

    .prologue
    .line 105
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 106
    .local v0, "m":Landroid/os/Message;
    const/16 v1, 0xd

    iput v1, v0, Landroid/os/Message;->what:I

    .line 107
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 109
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;->mWorker:Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$Worker;->runMessage(Landroid/os/Message;)V

    .line 110
    return-void
.end method
