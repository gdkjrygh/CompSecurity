.class public Lcom/comscore/analytics/Core$UserInteractionTask;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/comscore/analytics/Core;


# direct methods
.method public constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v1, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    iget-object v0, v0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    iget-object v0, v0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/comscore/analytics/Core;->Z:Ljava/util/Timer;

    iget-object v0, p0, Lcom/comscore/analytics/Core$UserInteractionTask;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->n()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
