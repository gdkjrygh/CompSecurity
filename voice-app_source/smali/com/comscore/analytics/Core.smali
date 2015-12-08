.class public Lcom/comscore/analytics/Core;
.super Ljava/lang/Object;


# static fields
.field protected static final y:J = 0x12cL


# instance fields
.field protected A:Ljava/util/concurrent/atomic/AtomicInteger;

.field protected B:Ljava/util/concurrent/atomic/AtomicInteger;

.field protected C:Ljava/util/concurrent/atomic/AtomicInteger;

.field protected D:J

.field protected E:J

.field protected F:J

.field protected G:J

.field protected H:J

.field protected I:J

.field protected J:J

.field protected K:J

.field protected L:J

.field protected M:Lcom/comscore/analytics/SessionState;

.field protected N:J

.field protected O:J

.field protected P:J

.field protected Q:I

.field protected R:I

.field protected S:I

.field protected T:J

.field protected U:J

.field protected V:J

.field protected W:I

.field protected X:J

.field protected Y:J

.field protected Z:Ljava/util/Timer;

.field a:Lcom/comscore/utils/OfflineMeasurementsCache;

.field protected aa:Ljava/lang/String;

.field ab:Ljava/lang/String;

.field ac:Landroid/content/Context;

.field protected final ad:Ljava/util/HashMap;

.field protected final ae:Ljava/util/HashMap;

.field af:Z

.field protected ag:J

.field protected ah:Z

.field protected ai:Ljava/lang/Thread$UncaughtExceptionHandler;

.field aj:Z

.field ak:Lcom/comscore/utils/TransmissionMode;

.field al:Lcom/comscore/utils/TransmissionMode;

.field am:[Ljava/lang/String;

.field private an:Lcom/comscore/utils/id/IdHelper;

.field b:Lcom/comscore/utils/Storage;

.field c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

.field d:Lcom/comscore/utils/CacheFlusher;

.field e:Lcom/comscore/utils/DispatchQueue;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field f:Lcom/comscore/utils/task/TaskExecutor;

.field g:Lcom/comscore/measurement/MeasurementDispatcher;

.field h:Lcom/comscore/utils/ConnectivityChangeReceiver;

.field protected i:Ljava/util/Timer;

.field protected j:Ljava/util/Timer;

.field protected k:Ljava/util/TimerTask;

.field protected l:J

.field protected m:Z

.field protected n:Z

.field o:Z

.field p:Ljava/util/concurrent/atomic/AtomicInteger;

.field q:J

.field r:Ljava/util/concurrent/atomic/AtomicInteger;

.field s:J

.field t:J

.field u:Ljava/lang/String;

.field v:Ljava/lang/String;

.field w:Z

.field x:Ljava/lang/String;

.field protected z:Lcom/comscore/analytics/ApplicationState;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v3, p0, Lcom/comscore/analytics/Core;->m:Z

    iput-boolean v3, p0, Lcom/comscore/analytics/Core;->n:Z

    iput-boolean v2, p0, Lcom/comscore/analytics/Core;->o:Z

    iput-boolean v3, p0, Lcom/comscore/analytics/Core;->w:Z

    sget-object v0, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    sget-object v0, Lcom/comscore/analytics/SessionState;->INACTIVE:Lcom/comscore/analytics/SessionState;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->ag:J

    iput-boolean v2, p0, Lcom/comscore/analytics/Core;->ah:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ai:Ljava/lang/Thread$UncaughtExceptionHandler;

    iput-boolean v3, p0, Lcom/comscore/analytics/Core;->af:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ad:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->reset()V

    return-void
.end method

.method private A()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "lastApplicationAccumulationTimestamp"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "lastSessionAccumulationTimestamp"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "lastActivityTime"

    invoke-virtual {p0, v1, v0}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "ns_ap_fg"

    const-string v1, "foregroundTransitionsCount"

    invoke-virtual {p0, v0, v1}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "installTime"

    const-string v1, "installId"

    invoke-virtual {p0, v0, v1}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ns_ap_ver"

    const-string v1, "previousVersion"

    invoke-virtual {p0, v0, v1}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v1, p1, v0}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    if-eqz p3, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v0, p1}, Lcom/comscore/utils/Storage;->has(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v0, p1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/utils/TransmissionMode;)V

    return-void
.end method

.method static synthetic a(Lcom/comscore/analytics/Core;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/comscore/analytics/Core;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/comscore/analytics/Core;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/comscore/utils/TransmissionMode;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/Core;->ak:Lcom/comscore/utils/TransmissionMode;

    return-void
.end method

.method static synthetic b(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->b(Lcom/comscore/utils/TransmissionMode;)V

    return-void
.end method

.method static synthetic b(Lcom/comscore/analytics/Core;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->c(Ljava/lang/String;)V

    return-void
.end method

.method private b(Lcom/comscore/utils/TransmissionMode;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/Core;->al:Lcom/comscore/utils/TransmissionMode;

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0, p1}, Lcom/comscore/utils/id/IdHelper;->setPublisherSecret(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0}, Lcom/comscore/utils/id/IdHelper;->generateIds()V

    goto :goto_0
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->ad:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/comscore/analytics/Core;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->d(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "appName"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->isSecure()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "https://sb.scorecardresearch.com/p2?"

    :goto_0
    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-direct {p0, v0, p1}, Lcom/comscore/analytics/Core;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "http://b.scorecardresearch.com/p2?"

    goto :goto_0
.end method

.method public static getInstance()Lcom/comscore/analytics/Core;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/comscore/analytics/comScore;->getCore()Lcom/comscore/analytics/Core;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Ljava/lang/String;)Lcom/comscore/measurement/Measurement;
    .locals 1

    invoke-static {p0, p1, p2, p3}, Lcom/comscore/applications/ApplicationMeasurement;->newApplicationMeasurement(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/util/HashMap;Ljava/lang/String;)Lcom/comscore/applications/ApplicationMeasurement;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/content/Context;Lcom/comscore/utils/Storage;)Lcom/comscore/utils/id/IdHelper;
    .locals 1

    new-instance v0, Lcom/comscore/utils/id/IdHelper;

    invoke-direct {v0, p1, p2}, Lcom/comscore/utils/id/IdHelper;-><init>(Landroid/content/Context;Lcom/comscore/utils/Storage;)V

    return-object v0
.end method

.method protected a()V
    .locals 2

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->b()Lcom/comscore/utils/Storage;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->e()Lcom/comscore/measurement/MeasurementDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->g:Lcom/comscore/measurement/MeasurementDispatcher;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/utils/Storage;)V

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->c()Lcom/comscore/utils/DispatchQueue;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->e:Lcom/comscore/utils/DispatchQueue;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->f()Lcom/comscore/applications/KeepAliveAlarmReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->g()Lcom/comscore/utils/OfflineMeasurementsCache;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->h()Lcom/comscore/utils/CacheFlusher;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->i()Lcom/comscore/utils/ConnectivityChangeReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->j()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {p0, v0, v1}, Lcom/comscore/analytics/Core;->a(Landroid/content/Context;Lcom/comscore/utils/Storage;)Lcom/comscore/utils/id/IdHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    return-void
.end method

.method declared-synchronized a(IZ)V
    .locals 2

    const/16 v0, 0x3c

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    if-ge p1, v0, :cond_0

    move p1, v0

    :cond_0
    iput-boolean p2, p0, Lcom/comscore/analytics/Core;->m:Z

    mul-int/lit16 v0, p1, 0x3e8

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->l:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    sget-object v1, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    sget-object v1, Lcom/comscore/analytics/ApplicationState;->BACKGROUND_UX_ACTIVE:Lcom/comscore/analytics/ApplicationState;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->v()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Lcom/comscore/analytics/ApplicationState;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Leaving application state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/comscore/analytics/z;->a:[I

    invoke-virtual {p1}, Lcom/comscore/analytics/ApplicationState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-virtual {v0}, Lcom/comscore/utils/ConnectivityChangeReceiver;->start()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    const/16 v1, 0xbb8

    invoke-virtual {v0, v1}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->start(I)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    invoke-virtual {v0}, Lcom/comscore/utils/CacheFlusher;->start()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->setCurrentActivityName(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected a(Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/ApplicationState;)V
    .locals 3

    sget-object v0, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    if-eq p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->isAutoStartEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->o:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->notify(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Z)V

    :cond_0
    return-void
.end method

.method protected a(Lcom/comscore/analytics/SessionState;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Leaving session state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    sget-object v2, Lcom/comscore/analytics/z;->b:[I

    invoke-virtual {p1}, Lcom/comscore/analytics/SessionState;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v2, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    :cond_1
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->V:J

    :pswitch_1
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->U:J

    :pswitch_2
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->p()Z

    move-result v2

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->N:J

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->Y:J

    sub-long/2addr v0, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected a(Lcom/comscore/analytics/SessionState;Lcom/comscore/analytics/SessionState;)V
    .locals 0

    return-void
.end method

.method a(Lcom/comscore/applications/EventType;Ljava/util/HashMap;)V
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->x()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->y()V

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->o:Z

    if-nez v0, :cond_2

    sget-object v0, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->g:Lcom/comscore/measurement/MeasurementDispatcher;

    sget-object v1, Lcom/comscore/applications/EventType;->START:Lcom/comscore/applications/EventType;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    invoke-virtual {p0, v1, v2, v3}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Ljava/lang/String;)Lcom/comscore/measurement/Measurement;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/comscore/measurement/MeasurementDispatcher;->sendMeasurmement(Lcom/comscore/measurement/Measurement;Z)Z

    :cond_2
    sget-object v0, Lcom/comscore/applications/EventType;->CLOSE:Lcom/comscore/applications/EventType;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->g:Lcom/comscore/measurement/MeasurementDispatcher;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    invoke-virtual {p0, p1, p2, v1}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Ljava/lang/String;)Lcom/comscore/measurement/Measurement;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/comscore/measurement/MeasurementDispatcher;->sendMeasurmement(Lcom/comscore/measurement/Measurement;Z)Z

    goto :goto_0
.end method

.method protected a(Lcom/comscore/utils/Storage;)V
    .locals 1

    invoke-direct {p0}, Lcom/comscore/analytics/Core;->A()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->g:Lcom/comscore/measurement/MeasurementDispatcher;

    invoke-virtual {v0}, Lcom/comscore/measurement/MeasurementDispatcher;->loadEventData()V

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 9

    const/16 v3, 0x3f

    const/4 v8, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v2, v0, :cond_3

    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "&"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_2

    aget-object v5, v3, v0

    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    aget-object v6, v5, v1

    aget-object v5, v5, v8

    invoke-virtual {p0, v6, v5, v1}, Lcom/comscore/analytics/Core;->setLabel(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    array-length v6, v5

    if-ne v6, v8, :cond_0

    const-string v6, "name"

    aget-object v5, v5, v1

    invoke-virtual {p0, v6, v5, v1}, Lcom/comscore/analytics/Core;->setLabel(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_3
    :goto_2
    iput-object p1, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, v0}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 5

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v2, p1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v3, v0}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lcom/comscore/utils/Utils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Lcom/comscore/utils/Utils;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v3, v0, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v0, p1}, Lcom/comscore/utils/Storage;->remove(Ljava/lang/String;)V

    return-void
.end method

.method protected a(Z)V
    .locals 6

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->L:J

    sub-long v2, v0, v2

    sget-object v4, Lcom/comscore/analytics/z;->a:[I

    iget-object v5, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    invoke-virtual {v5}, Lcom/comscore/analytics/ApplicationState;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    :goto_0
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->L:J

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationAccumulationTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->L:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "foregroundTransitionsCount"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedForegroundTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->H:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedBackgroundTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->G:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedInactiveTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->I:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalForegroundTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->D:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalBackgroundTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->E:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalInactiveTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->F:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_0
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->H:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->H:J

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->D:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->D:J

    goto :goto_0

    :pswitch_1
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->G:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->G:J

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->E:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->E:J

    goto/16 :goto_0

    :pswitch_2
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->I:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->I:J

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->F:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->F:J

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public allowLiveTransmission(Lcom/comscore/utils/TransmissionMode;Z)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/utils/TransmissionMode;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getLiveTransmissionMode()Lcom/comscore/utils/TransmissionMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/h;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/h;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public allowOfflineTransmission(Lcom/comscore/utils/TransmissionMode;Z)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->b(Lcom/comscore/utils/TransmissionMode;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getOfflineTransmissionMode()Lcom/comscore/utils/TransmissionMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/i;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/i;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method protected b()Lcom/comscore/utils/Storage;
    .locals 2

    new-instance v0, Lcom/comscore/utils/Storage;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/comscore/utils/Storage;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected b(Lcom/comscore/analytics/ApplicationState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Entering application state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/comscore/analytics/z;->a:[I

    invoke-virtual {p1}, Lcom/comscore/analytics/ApplicationState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-virtual {v0}, Lcom/comscore/utils/ConnectivityChangeReceiver;->stop()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    invoke-virtual {v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->stop()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    invoke-virtual {v0}, Lcom/comscore/utils/CacheFlusher;->stop()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    goto :goto_0

    :pswitch_1
    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->m:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->v()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->v()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected b(Lcom/comscore/analytics/SessionState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Entering session state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/comscore/analytics/z;->b:[I

    invoke-virtual {p1}, Lcom/comscore/analytics/SessionState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->q()V

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->o()V

    :pswitch_1
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->r()V

    :pswitch_2
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->p()Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected b(Z)V
    .locals 6

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->Y:J

    sub-long v2, v0, v2

    sget-object v4, Lcom/comscore/analytics/z;->b:[I

    iget-object v5, p0, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    invoke-virtual {v5}, Lcom/comscore/analytics/SessionState;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    :goto_0
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->Y:J

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastSessionAccumulationTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->Y:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationSessionTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastUserSessionTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->U:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastActiveUserSessionTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->V:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedApplicationSessionTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->N:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedActiveUserSessionTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->P:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedUserSessionTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->O:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "activeUserSessionCount"

    iget v2, p0, Lcom/comscore/analytics/Core;->S:I

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "userSessionCount"

    iget v2, p0, Lcom/comscore/analytics/Core;->R:I

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastUserInteractionTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->X:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "userInteractionCount"

    iget v2, p0, Lcom/comscore/analytics/Core;->W:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousGenesis"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->K:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "genesis"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->J:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "applicationSessionCountKey"

    iget v2, p0, Lcom/comscore/analytics/Core;->Q:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_0
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->P:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->P:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->V:J

    :pswitch_1
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->O:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->O:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->U:J

    :pswitch_2
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->N:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->N:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected c()Lcom/comscore/utils/DispatchQueue;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/comscore/utils/DispatchQueue;

    invoke-direct {v0, p0}, Lcom/comscore/utils/DispatchQueue;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/comscore/analytics/Core;->af:Z

    return-void
.end method

.method protected d()Lcom/comscore/utils/task/TaskExecutor;
    .locals 1

    new-instance v0, Lcom/comscore/utils/task/TaskExecutor;

    invoke-direct {v0, p0}, Lcom/comscore/utils/task/TaskExecutor;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method protected d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/comscore/analytics/Core;->o:Z

    return-void
.end method

.method public declared-synchronized disableAutoUpdate()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->m:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected e()Lcom/comscore/measurement/MeasurementDispatcher;
    .locals 1

    new-instance v0, Lcom/comscore/measurement/MeasurementDispatcher;

    invoke-direct {v0, p0}, Lcom/comscore/measurement/MeasurementDispatcher;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method public enableAutoUpdate(IZZ)V
    .locals 2

    if-nez p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/comscore/analytics/Core;->a(IZ)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/v;

    invoke-direct {v1, p0, p1, p2}, Lcom/comscore/analytics/v;-><init>(Lcom/comscore/analytics/Core;IZ)V

    invoke-virtual {v0, v1, p3}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method protected f()Lcom/comscore/applications/KeepAliveAlarmReceiver;
    .locals 4

    new-instance v0, Lcom/comscore/applications/KeepAliveAlarmReceiver;

    const-wide/32 v2, 0x5265c00

    invoke-direct {v0, p0, v2, v3}, Lcom/comscore/applications/KeepAliveAlarmReceiver;-><init>(Lcom/comscore/analytics/Core;J)V

    return-object v0
.end method

.method public flush(Z)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/u;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/u;-><init>(Lcom/comscore/analytics/Core;)V

    invoke-virtual {v0, v1, p1}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method protected g()Lcom/comscore/utils/OfflineMeasurementsCache;
    .locals 1

    new-instance v0, Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-direct {v0, p0}, Lcom/comscore/utils/OfflineMeasurementsCache;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method public declared-synchronized getActiveUserSessionCountDelta(Z)I
    .locals 4

    monitor-enter p0

    const/4 v0, -0x1

    :try_start_0
    iget v1, p0, Lcom/comscore/analytics/Core;->S:I

    if-ltz v1, :cond_0

    iget v0, p0, Lcom/comscore/analytics/Core;->S:I

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lcom/comscore/analytics/Core;->S:I

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "activeUserSessionCount"

    iget v3, p0, Lcom/comscore/analytics/Core;->S:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getActiveUserSessionTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->P:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->P:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedActiveUserSessionTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->P:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getAppContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/comscore/analytics/Core;->setAppName(Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    return-object v0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "appName"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ab:Ljava/lang/String;

    goto :goto_0
.end method

.method public declared-synchronized getApplicationSessionCountDelta(Z)I
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/comscore/analytics/Core;->Q:I

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lcom/comscore/analytics/Core;->Q:I

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "applicationSessionCountKey"

    iget v3, p0, Lcom/comscore/analytics/Core;->Q:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getApplicationSessionTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->N:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedApplicationSessionTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->N:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getApplicationState()Lcom/comscore/analytics/ApplicationState;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    return-object v0
.end method

.method public getAutoStartLabel(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAutoStartLabels()Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    return-object v0
.end method

.method public declared-synchronized getAutoUpdateInterval()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getBackgroundTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->G:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->G:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedBackgroundTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->G:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getBackgroundTotalTime(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->E:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->E:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "totalBackgroundTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->E:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getCacheFlusher()Lcom/comscore/utils/CacheFlusher;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    return-object v0
.end method

.method public getCacheFlushingInterval()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->ag:J

    return-wide v0
.end method

.method public getCacheMaxBatchFiles()I
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->getCacheMaxBatchFiles()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0x64

    goto :goto_0
.end method

.method public getCacheMaxFlushesInARow()I
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->getCacheMaxPosts()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public getCacheMaxMeasurements()I
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->getCacheMaxMeasurements()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0x7d0

    goto :goto_0
.end method

.method public getCacheMeasurementExpiry()J
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->getCacheMeasurementExpiry()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x1f

    goto :goto_0
.end method

.method public getCacheMinutesToRetry()J
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->getCacheWaitMinutes()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x1e

    goto :goto_0
.end method

.method public getColdStartCount()I
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public getColdStartId()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->q:J

    return-wide v0
.end method

.method public getConnectivityReceiver()Lcom/comscore/utils/ConnectivityChangeReceiver;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->h:Lcom/comscore/utils/ConnectivityChangeReceiver;

    return-object v0
.end method

.method public getCrossPublisherId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0}, Lcom/comscore/utils/id/IdHelper;->getCrossPublisherId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getCurrentActivityName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->x:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerC2()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getLabels()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "c2"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getErrorHandlingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->ah:Z

    return v0
.end method

.method public getFirstInstallId()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    return-wide v0
.end method

.method public declared-synchronized getForegroundTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->H:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->H:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedForegroundTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->H:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getForegroundTotalTime(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->D:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->D:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "totalForegroundTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->D:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getForegroundTransitionsCountDelta(Z)I
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "foregroundTransitionsCount"

    iget-object v3, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    int-to-long v4, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getGenesis()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    return-wide v0
.end method

.method public getIdHelper()Lcom/comscore/utils/id/IdHelper;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    return-object v0
.end method

.method public declared-synchronized getInactiveTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->I:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->I:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedInactiveTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->I:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getInactiveTotalTime(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->F:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->F:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "totalInactiveTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->F:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getInstallId()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    return-wide v0
.end method

.method public getKeepAliveAlarmReceiver()Lcom/comscore/applications/KeepAliveAlarmReceiver;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    return-object v0
.end method

.method public getLabel(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ad:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLabels()Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ad:Ljava/util/HashMap;

    return-object v0
.end method

.method public getLiveTransmissionMode()Lcom/comscore/utils/TransmissionMode;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ak:Lcom/comscore/utils/TransmissionMode;

    return-object v0
.end method

.method public getMeasurementDispatcher()Lcom/comscore/measurement/MeasurementDispatcher;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->g:Lcom/comscore/measurement/MeasurementDispatcher;

    return-object v0
.end method

.method public getMeasurementLabelOrder()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->am:[Ljava/lang/String;

    return-object v0
.end method

.method public getOfflineCache()Lcom/comscore/utils/OfflineMeasurementsCache;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    return-object v0
.end method

.method public getOfflineTransmissionMode()Lcom/comscore/utils/TransmissionMode;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->al:Lcom/comscore/utils/TransmissionMode;

    return-object v0
.end method

.method public getPixelURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    return-object v0
.end method

.method public getPreviousGenesis()J
    .locals 2

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->K:J

    return-wide v0
.end method

.method public declared-synchronized getPreviousVersion()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "previousVersion"

    invoke-virtual {v1, v2}, Lcom/comscore/utils/Storage;->remove(Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getPublisherSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0}, Lcom/comscore/utils/id/IdHelper;->getPublisherSecret()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getQueue()Lcom/comscore/utils/DispatchQueue;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->e:Lcom/comscore/utils/DispatchQueue;

    return-object v0
.end method

.method public getRunsCount()I
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public getSalt()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->getPublisherSecret()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSessionState()Lcom/comscore/analytics/SessionState;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    return-object v0
.end method

.method public getStorage()Lcom/comscore/utils/Storage;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    return-object v0
.end method

.method public getTaskExecutor()Lcom/comscore/utils/task/TaskExecutor;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    return-object v0
.end method

.method public declared-synchronized getUserInteractionCount(Z)I
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/comscore/analytics/Core;->W:I

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lcom/comscore/analytics/Core;->W:I

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "userInteractionCount"

    iget v3, p0, Lcom/comscore/analytics/Core;->W:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getUserSessionCountDelta(Z)I
    .locals 4

    monitor-enter p0

    const/4 v0, -0x1

    :try_start_0
    iget v1, p0, Lcom/comscore/analytics/Core;->R:I

    if-ltz v1, :cond_0

    iget v0, p0, Lcom/comscore/analytics/Core;->R:I

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lcom/comscore/analytics/Core;->R:I

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "userSessionCount"

    iget v3, p0, Lcom/comscore/analytics/Core;->R:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getUserSessionTimeDelta(Z)J
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->O:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->O:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "accumulatedUserSessionTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->O:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "2.1407.28"

    return-object v0
.end method

.method public getVisitorId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0}, Lcom/comscore/utils/id/IdHelper;->getVisitorId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected h()Lcom/comscore/utils/CacheFlusher;
    .locals 1

    new-instance v0, Lcom/comscore/utils/CacheFlusher;

    invoke-direct {v0, p0}, Lcom/comscore/utils/CacheFlusher;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method public declared-synchronized handleColdStart()Z
    .locals 4

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/comscore/analytics/Core;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/comscore/analytics/Core;->o:Z

    iget-object v1, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "coldStartCount"

    iget-object v3, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected i()Lcom/comscore/utils/ConnectivityChangeReceiver;
    .locals 1

    new-instance v0, Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-direct {v0, p0}, Lcom/comscore/utils/ConnectivityChangeReceiver;-><init>(Lcom/comscore/analytics/Core;)V

    return-object v0
.end method

.method public incrementRunsCount()V
    .locals 4

    iget-object v0, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "runs"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public isAutoStartEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->w:Z

    return v0
.end method

.method public declared-synchronized isAutoUpdateEnabled()Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isKeepAliveEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->af:Z

    return v0
.end method

.method public isSecure()Z
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->aj:Z

    return v0
.end method

.method protected j()V
    .locals 10

    const/4 v4, 0x0

    const/4 v3, -0x1

    const-wide/16 v8, 0x0

    const-wide/16 v6, -0x1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationAccumulationTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->L:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastSessionAccumulationTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->Y:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationSessionTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastUserSessionTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->U:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastActiveUserSessionTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->V:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "foregroundTransitionsCount"

    invoke-virtual {v1, v2}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedForegroundTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->H:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedBackgroundTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->G:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedInactiveTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->I:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalForegroundTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->D:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalBackgroundTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->E:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "totalInactiveTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->F:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedApplicationSessionTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedActiveUserSessionTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->P:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedUserSessionTime"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->O:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "activeUserSessionCount"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/comscore/analytics/Core;->S:I

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "userSessionCount"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/comscore/analytics/Core;->R:I

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastUserInteractionTimestamp"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->X:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "userInteractionCount"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/comscore/analytics/Core;->W:I

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "applicationSessionCountKey"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/comscore/analytics/Core;->Q:I

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousGenesis"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->K:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "genesis"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    cmp-long v0, v0, v8

    if-gez v0, :cond_2

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v8, p0, Lcom/comscore/analytics/Core;->K:J

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    iget v0, p0, Lcom/comscore/analytics/Core;->Q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/comscore/analytics/Core;->Q:I

    :goto_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "firstInstallId"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    cmp-long v0, v0, v8

    if-gez v0, :cond_4

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "currentVersion"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "firstInstallId"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->t:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "installId"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->s:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "genesis"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->J:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousGenesis"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->K:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->L:J

    cmp-long v2, v2, v8

    if-ltz v2, :cond_0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->L:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->I:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/comscore/analytics/Core;->I:J

    iget-object v4, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v5, "accumulatedInactiveTime"

    iget-wide v6, p0, Lcom/comscore/analytics/Core;->I:J

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->F:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->F:J

    iget-object v2, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v3, "totalInactiveTime"

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->F:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->L:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->Y:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationAccumulationTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->L:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastSessionAccumulationTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->Y:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "lastApplicationSessionTimestamp"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "runs"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->has(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "runs"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "runs"

    invoke-virtual {v1, v2}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v2, "coldStartCount"

    invoke-virtual {v1, v2}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->p()Z

    move-result v0

    if-nez v0, :cond_3

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->Y:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "accumulatedApplicationSessionTime"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->N:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousVersion"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->has(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousVersion"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    :cond_5
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "currentVersion"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iput-object v0, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "previousVersion"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "installId"

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->s:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "currentVersion"

    iget-object v2, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_6
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    const-string v1, "installId"

    invoke-virtual {v0, v1}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    goto :goto_2
.end method

.method protected k()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v0, "0"

    :try_start_0
    iget-object v2, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected l()V
    .locals 6

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :try_start_0
    const-string v1, "comScore.properties"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Ljava/util/Properties;

    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    const-string v0, "Debug"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/comscore/utils/Constants;->DEBUG:Z

    const-string v0, "Secure"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->aj:Z

    const-string v0, "PublisherSecret"

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/comscore/analytics/Core;->b(Ljava/lang/String;)V

    :cond_0
    const-string v0, "AppName"

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lcom/comscore/analytics/Core;->c(Ljava/lang/String;)V

    :cond_1
    const-string v0, "CustomerC2"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lcom/comscore/analytics/Core;->d(Ljava/lang/String;)V

    :cond_2
    const-string v0, "PixelURL"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;)V

    :cond_3
    const-string v0, "OfflineURL"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setUrl(Ljava/lang/String;)V

    :cond_4
    const-string v0, "LiveTransmissionMode"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    if-eqz v0, :cond_5

    :try_start_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/TransmissionMode;->valueOf(Ljava/lang/String;)Lcom/comscore/utils/TransmissionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ak:Lcom/comscore/utils/TransmissionMode;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_5
    :goto_0
    :try_start_2
    const-string v0, "OfflineTransmissionMode"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    if-eqz v0, :cond_6

    :try_start_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/TransmissionMode;->valueOf(Ljava/lang/String;)Lcom/comscore/utils/TransmissionMode;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->al:Lcom/comscore/utils/TransmissionMode;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_6
    :goto_1
    :try_start_4
    const-string v0, "KeepAliveEnabled"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->af:Z

    const-string v0, "CacheMaxSize"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_7

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheMaxMeasurements(I)V

    :cond_7
    const-string v0, "CacheMaxBatchSize"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_8

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheMaxBatchFiles(I)V

    :cond_8
    const-string v0, "CacheMaxFlushesInARow"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_9

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheMaxPosts(I)V

    :cond_9
    const-string v0, "CacheMinutesToRetry"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_a

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheWaitMinutes(I)V

    :cond_a
    const-string v0, "CacheExpiryInDays"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_b

    iget-object v2, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    invoke-virtual {v2, v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheMeasurementExpiry(I)V

    :cond_b
    const-string v0, "CacheFlushingInterval"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, -0x1

    invoke-static {v0, v2, v3}, Lcom/comscore/utils/Utils;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_c

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->ag:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    invoke-virtual {v0}, Lcom/comscore/utils/CacheFlusher;->update()V

    :cond_c
    const-string v0, "ErrorHandlingEnabled"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->setErrorHandlingEnabled(Z)V

    const-string v0, "AutoStartEnabled"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->w:Z

    const-string v0, "AutoUpdateInForegroundOnly"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/comscore/utils/Utils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "AutoUpdateInterval"

    const/4 v3, 0x0

    invoke-direct {p0, v2, v1, v3}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;Ljava/util/Properties;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v1, v2}, Lcom/comscore/utils/Utils;->getInteger(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x3c

    if-lt v1, v2, :cond_d

    invoke-virtual {p0, v1, v0}, Lcom/comscore/analytics/Core;->a(IZ)V

    :cond_d
    :goto_2
    return-void

    :catch_0
    move-exception v0

    sget-object v0, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ak:Lcom/comscore/utils/TransmissionMode;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    sget-boolean v1, Lcom/comscore/utils/Constants;->DEBUG:Z

    if-eqz v1, :cond_d

    invoke-static {v0}, Lcom/comscore/utils/CSLog;->printStackTrace(Ljava/lang/Exception;)V

    goto :goto_2

    :catch_2
    move-exception v0

    :try_start_5
    sget-object v0, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->al:Lcom/comscore/utils/TransmissionMode;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_1
.end method

.method protected m()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    return-object v0
.end method

.method protected n()V
    .locals 7

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iput-object v6, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    iput-object v6, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    :cond_0
    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/comscore/analytics/Core;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-lez v2, :cond_3

    sget-object v3, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    :goto_0
    iget-wide v4, p0, Lcom/comscore/analytics/Core;->X:J

    sub-long/2addr v0, v4

    const-wide/32 v4, 0x493e0

    cmp-long v0, v0, v4

    if-gez v0, :cond_5

    sget-object v5, Lcom/comscore/analytics/SessionState;->ACTIVE_USER:Lcom/comscore/analytics/SessionState;

    :goto_1
    iget-object v2, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    iget-object v4, p0, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    if-ne v3, v2, :cond_1

    if-eq v5, v4, :cond_2

    :cond_1
    new-instance v0, Lcom/comscore/analytics/ac;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/comscore/analytics/ac;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/SessionState;Lcom/comscore/analytics/SessionState;)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->n:Z

    if-eqz v0, :cond_8

    sget-object v0, Lcom/comscore/analytics/ApplicationState;->FOREGROUND:Lcom/comscore/analytics/ApplicationState;

    if-eq v3, v0, :cond_8

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    iget-object v1, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_2
    :goto_2
    return-void

    :cond_3
    iget-object v2, p0, Lcom/comscore/analytics/Core;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-lez v2, :cond_4

    sget-object v3, Lcom/comscore/analytics/ApplicationState;->BACKGROUND_UX_ACTIVE:Lcom/comscore/analytics/ApplicationState;

    goto :goto_0

    :cond_4
    sget-object v3, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/comscore/analytics/Core;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_6

    sget-object v5, Lcom/comscore/analytics/SessionState;->USER:Lcom/comscore/analytics/SessionState;

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/comscore/analytics/Core;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_7

    sget-object v5, Lcom/comscore/analytics/SessionState;->APPLICATION:Lcom/comscore/analytics/SessionState;

    goto :goto_1

    :cond_7
    sget-object v5, Lcom/comscore/analytics/SessionState;->INACTIVE:Lcom/comscore/analytics/SessionState;

    goto :goto_1

    :cond_8
    iget-object v0, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->run()V

    iput-object v6, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    goto :goto_2
.end method

.method public notify(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Z)V
    .locals 2

    if-nez p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/applications/EventType;Ljava/util/HashMap;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/y;

    invoke-direct {v1, p0, p1, p2}, Lcom/comscore/analytics/y;-><init>(Lcom/comscore/analytics/Core;Lcom/comscore/applications/EventType;Ljava/util/HashMap;)V

    invoke-virtual {v0, v1, p3}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method protected o()V
    .locals 4

    iget-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    new-instance v1, Lcom/comscore/analytics/Core$UserInteractionTask;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/Core$UserInteractionTask;-><init>(Lcom/comscore/analytics/Core;)V

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public onEnterForeground()V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/w;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/w;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public onExitForeground()V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/aa;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/aa;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public onUserInteraction()V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/ab;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/ab;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public declared-synchronized onUxActive()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/a;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/a;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onUxInactive()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/l;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/l;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected p()Z
    .locals 8

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v2

    const/4 v0, 0x0

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->T:J

    sub-long v4, v2, v4

    const-wide/32 v6, 0x1b7740

    cmp-long v1, v4, v6

    if-lez v1, :cond_0

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->K:J

    iput-wide v2, p0, Lcom/comscore/analytics/Core;->J:J

    iget v0, p0, Lcom/comscore/analytics/Core;->Q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/comscore/analytics/Core;->Q:I

    const/4 v0, 0x1

    :cond_0
    iput-wide v2, p0, Lcom/comscore/analytics/Core;->T:J

    return v0
.end method

.method protected q()V
    .locals 6

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->V:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x493e0

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    iget v2, p0, Lcom/comscore/analytics/Core;->S:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/comscore/analytics/Core;->S:I

    :cond_0
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->V:J

    return-void
.end method

.method protected r()V
    .locals 6

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/comscore/analytics/Core;->U:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x493e0

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    iget v2, p0, Lcom/comscore/analytics/Core;->R:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/comscore/analytics/Core;->R:I

    :cond_0
    iput-wide v0, p0, Lcom/comscore/analytics/Core;->U:J

    return-void
.end method

.method public declared-synchronized reset()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->ak:Lcom/comscore/utils/TransmissionMode;

    sget-object v0, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->al:Lcom/comscore/utils/TransmissionMode;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->aj:Z

    sget-object v0, Lcom/comscore/utils/Constants;->LABELS_ORDER:[Ljava/lang/String;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->am:[Ljava/lang/String;

    sget-object v0, Lcom/comscore/analytics/ApplicationState;->INACTIVE:Lcom/comscore/analytics/ApplicationState;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    sget-object v0, Lcom/comscore/analytics/SessionState;->INACTIVE:Lcom/comscore/analytics/SessionState;

    iput-object v0, p0, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/comscore/analytics/Core;->o:Z

    iget-object v0, p0, Lcom/comscore/analytics/Core;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->q:J

    iget-object v0, p0, Lcom/comscore/analytics/Core;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->u:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->v:Ljava/lang/String;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->A:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->D:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->E:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->F:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->G:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->H:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->I:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->N:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->P:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->O:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->J:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->K:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/comscore/analytics/Core;->S:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/comscore/analytics/Core;->R:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/comscore/analytics/Core;->W:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->X:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->L:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->Y:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->T:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->U:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->V:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->s:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/analytics/Core;->t:J

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->disableAutoUpdate()V

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->c:Lcom/comscore/applications/KeepAliveAlarmReceiver;

    invoke-virtual {v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->cancel()V

    :cond_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->d:Lcom/comscore/utils/CacheFlusher;

    invoke-virtual {v0}, Lcom/comscore/utils/CacheFlusher;->stop()V

    :cond_3
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    invoke-virtual {v0}, Lcom/comscore/utils/task/TaskExecutor;->clear()V

    :cond_4
    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/comscore/analytics/Core;->b:Lcom/comscore/utils/Storage;

    invoke-virtual {v0}, Lcom/comscore/utils/Storage;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected s()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->a(Z)V

    return-void
.end method

.method public setAppContext(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->d()Lcom/comscore/utils/task/TaskExecutor;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/ad;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/ad;-><init>(Lcom/comscore/analytics/Core;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setAppName(Ljava/lang/String;Z)V
    .locals 2

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/d;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/d;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setAutoStartEnabled(ZZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/m;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/m;-><init>(Lcom/comscore/analytics/Core;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    return-void
.end method

.method public declared-synchronized setAutoStartLabel(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setAutoStartLabels(Ljava/util/HashMap;)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->ae:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setCacheFlushingInterval(JZ)V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-wide v0, p0, Lcom/comscore/analytics/Core;->ag:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/s;

    invoke-direct {v1, p0, p1, p2}, Lcom/comscore/analytics/s;-><init>(Lcom/comscore/analytics/Core;J)V

    invoke-virtual {v0, v1, p3}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCacheMaxBatchFiles(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/o;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/o;-><init>(Lcom/comscore/analytics/Core;I)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCacheMaxFlushesInARow(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/p;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/p;-><init>(Lcom/comscore/analytics/Core;I)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCacheMaxMeasurements(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/n;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/n;-><init>(Lcom/comscore/analytics/Core;I)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCacheMeasurementExpiry(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/r;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/r;-><init>(Lcom/comscore/analytics/Core;I)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCacheMinutesToRetry(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/q;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/q;-><init>(Lcom/comscore/analytics/Core;I)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setCurrentActivityName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/Core;->x:Ljava/lang/String;

    return-void
.end method

.method public setCustomerC2(Ljava/lang/String;Z)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-direct {p0, p1}, Lcom/comscore/analytics/Core;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/g;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/g;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setDebug(Z)V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/k;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/k;-><init>(Lcom/comscore/analytics/Core;Z)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    return-void
.end method

.method public setErrorHandlingEnabled(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/comscore/analytics/Core;->ah:Z

    iget-boolean v0, p0, Lcom/comscore/analytics/Core;->ah:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/comscore/utils/CustomExceptionHandler;

    invoke-direct {v0, p0}, Lcom/comscore/utils/CustomExceptionHandler;-><init>(Lcom/comscore/analytics/Core;)V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/analytics/Core;->ai:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ai:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    goto :goto_0
.end method

.method public setKeepAliveEnabled(ZZ)V
    .locals 2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/comscore/analytics/Core;->c(Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/b;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/b;-><init>(Lcom/comscore/analytics/Core;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setLabel(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/comscore/analytics/Core;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/f;

    invoke-direct {v1, p0, p1, p2}, Lcom/comscore/analytics/f;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p3}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public declared-synchronized setLabels(Ljava/util/HashMap;Z)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/e;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/e;-><init>(Lcom/comscore/analytics/Core;Ljava/util/HashMap;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setMeasurementLabelOrder([Ljava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->am:[Ljava/lang/String;

    if-eq p1, v0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/t;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/t;-><init>(Lcom/comscore/analytics/Core;[Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public declared-synchronized setOfflineURL(Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/af;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/af;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setPixelURL(Ljava/lang/String;Z)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    if-nez p2, :cond_2

    :try_start_1
    invoke-virtual {p0, p1}, Lcom/comscore/analytics/Core;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/ae;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/ae;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public setPublisherSecret(Ljava/lang/String;Z)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/c;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/c;-><init>(Lcom/comscore/analytics/Core;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method public setSecure(ZZ)V
    .locals 2

    if-nez p2, :cond_1

    iput-boolean p1, p0, Lcom/comscore/analytics/Core;->aj:Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->f:Lcom/comscore/utils/task/TaskExecutor;

    new-instance v1, Lcom/comscore/analytics/j;

    invoke-direct {v1, p0, p1}, Lcom/comscore/analytics/j;-><init>(Lcom/comscore/analytics/Core;Z)V

    invoke-virtual {v0, v1, p2}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    goto :goto_0
.end method

.method protected t()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->b(Z)V

    return-void
.end method

.method protected u()Lcom/comscore/utils/OfflineMeasurementsCache;
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    return-object v0
.end method

.method public declared-synchronized update()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/comscore/analytics/Core;->update(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized update(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/comscore/analytics/Core;->a(Z)V

    invoke-virtual {p0, p1}, Lcom/comscore/analytics/Core;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized v()V
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/comscore/analytics/Core;->w()V

    iget-wide v0, p0, Lcom/comscore/analytics/Core;->l:J

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    new-instance v0, Ljava/util/Timer;

    const-string v1, "AutoUpdateTimer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/comscore/analytics/Core;->i:Ljava/util/Timer;

    iget-object v0, p0, Lcom/comscore/analytics/Core;->i:Ljava/util/Timer;

    new-instance v1, Lcom/comscore/analytics/x;

    invoke-direct {v1, p0}, Lcom/comscore/analytics/x;-><init>(Lcom/comscore/analytics/Core;)V

    new-instance v2, Ljava/util/Date;

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/comscore/analytics/Core;->l:J

    add-long/2addr v4, v6

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    iget-wide v4, p0, Lcom/comscore/analytics/Core;->l:J

    invoke-virtual {v0, v1, v2, v4, v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;Ljava/util/Date;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized w()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core;->i:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->i:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/comscore/analytics/Core;->i:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected x()V
    .locals 0

    return-void
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method z()Z
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/Core;->ac:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->an:Lcom/comscore/utils/id/IdHelper;

    invoke-virtual {v0}, Lcom/comscore/utils/id/IdHelper;->isPublisherSecretEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core;->aa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
