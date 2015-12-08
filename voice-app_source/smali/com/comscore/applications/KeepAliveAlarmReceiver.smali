.class public Lcom/comscore/applications/KeepAliveAlarmReceiver;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final a:Ljava/lang/String;

.field protected final b:J

.field protected c:J

.field protected d:J

.field private e:Lcom/comscore/analytics/Core;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Lcom/comscore/analytics/Core;J)V
    .locals 4

    const/4 v2, 0x0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->c:J

    iput-boolean v2, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->f:Z

    iput-boolean v2, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->g:Z

    iput-wide p2, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->b:J

    iget-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->b:J

    iput-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->d:J

    iput-object p1, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a:Ljava/lang/String;

    new-instance v0, Landroid/content/IntentFilter;

    iget-object v1, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private a(Lcom/comscore/utils/Storage;)J
    .locals 4

    const-wide/16 v0, 0x0

    const-string v2, "lastTransmission"

    invoke-virtual {p1, v2}, Lcom/comscore/utils/Storage;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :cond_0
    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private a()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    invoke-static {v0, v2, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected declared-synchronized a(Landroid/content/Context;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    iget-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->c:J

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const-string v0, "alarm"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    const/4 v1, 0x0

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->b:J

    invoke-direct {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a()Landroid/app/PendingIntent;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized cancel()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "KeepAlive"

    const-string v1, "cancel()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "KeepAlive"

    const-string v1, "onReceive()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->sendKeepAlive()V
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

.method public processKeepAlive(Z)V
    .locals 9

    const/4 v8, 0x1

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->isKeepAliveEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getOfflineCache()Lcom/comscore/utils/OfflineMeasurementsCache;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a(Lcom/comscore/utils/Storage;)J

    move-result-wide v2

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-string v1, "KeepAlive"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "processKeepAlive("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ") timeSinceLastTransmission="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " currentTimeout="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-wide v6, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->d:J

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v4, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->d:J

    const-wide/16 v6, 0x3e8

    sub-long/2addr v4, v6

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const-string v1, "KeepAlive"

    const-string v2, "Sending Keep-alive"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    sget-object v1, Lcom/comscore/applications/EventType;->KEEPALIVE:Lcom/comscore/applications/EventType;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v2, v8}, Lcom/comscore/analytics/Core;->notify(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Z)V

    :goto_0
    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v0

    const-string v1, "lastTransmission"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    sget-object v1, Lcom/comscore/applications/EventType;->KEEPALIVE:Lcom/comscore/applications/EventType;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v8}, Lcom/comscore/utils/OfflineMeasurementsCache;->saveApplicationMeasurement(Lcom/comscore/applications/EventType;Ljava/util/HashMap;Z)V

    goto :goto_0
.end method

.method public reset()V
    .locals 2

    iget-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->reset(J)V

    return-void
.end method

.method public reset(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->cancel()V

    const-string v0, "KeepAlive"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reset:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->c:J

    iput-wide p1, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->d:J

    iget-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->start(I)V

    :cond_0
    return-void
.end method

.method public sendKeepAlive()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->processKeepAlive(Z)V

    return-void
.end method

.method public start(I)V
    .locals 6

    invoke-virtual {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->cancel()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->f:Z

    const-string v0, "KeepAlive"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->isKeepAliveEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->c:J

    cmp-long v1, v4, v2

    if-gez v1, :cond_2

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->c:J

    :cond_2
    invoke-virtual {p0, v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->a(Landroid/content/Context;)V

    goto :goto_0
.end method

.method public stop()V
    .locals 2

    const-string v0, "KeepAlive"

    const-string v1, "stop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/comscore/applications/KeepAliveAlarmReceiver;->f:Z

    invoke-virtual {p0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->cancel()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->processKeepAlive(Z)V

    return-void
.end method
