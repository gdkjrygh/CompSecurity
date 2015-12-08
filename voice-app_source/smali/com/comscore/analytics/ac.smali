.class Lcom/comscore/analytics/ac;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/comscore/analytics/ApplicationState;

.field final synthetic b:Lcom/comscore/analytics/ApplicationState;

.field final synthetic c:Lcom/comscore/analytics/SessionState;

.field final synthetic d:Lcom/comscore/analytics/SessionState;

.field final synthetic e:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/SessionState;Lcom/comscore/analytics/SessionState;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iput-object p2, p0, Lcom/comscore/analytics/ac;->a:Lcom/comscore/analytics/ApplicationState;

    iput-object p3, p0, Lcom/comscore/analytics/ac;->b:Lcom/comscore/analytics/ApplicationState;

    iput-object p4, p0, Lcom/comscore/analytics/ac;->c:Lcom/comscore/analytics/SessionState;

    iput-object p5, p0, Lcom/comscore/analytics/ac;->d:Lcom/comscore/analytics/SessionState;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    monitor-enter v3

    :try_start_0
    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v2, v2, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v2, v2, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    const/4 v4, 0x0

    iput-object v4, v2, Lcom/comscore/analytics/Core;->k:Ljava/util/TimerTask;

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    const/4 v4, 0x0

    iput-object v4, v2, Lcom/comscore/analytics/Core;->j:Ljava/util/Timer;

    :cond_0
    iget-object v2, p0, Lcom/comscore/analytics/ac;->a:Lcom/comscore/analytics/ApplicationState;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->b:Lcom/comscore/analytics/ApplicationState;

    if-eq v2, v4, :cond_4

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, v4, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    invoke-virtual {v2, v4}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/analytics/ApplicationState;)V

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->b:Lcom/comscore/analytics/ApplicationState;

    invoke-virtual {v2, v4}, Lcom/comscore/analytics/Core;->b(Lcom/comscore/analytics/ApplicationState;)V

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v2}, Lcom/comscore/analytics/Core;->s()V

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->b:Lcom/comscore/analytics/ApplicationState;

    iput-object v4, v2, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    move v2, v0

    :goto_0
    iget-object v4, p0, Lcom/comscore/analytics/ac;->c:Lcom/comscore/analytics/SessionState;

    iget-object v5, p0, Lcom/comscore/analytics/ac;->d:Lcom/comscore/analytics/SessionState;

    if-eq v4, v5, :cond_3

    iget-object v1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, v4, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    invoke-virtual {v1, v4}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/analytics/SessionState;)V

    iget-object v1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->d:Lcom/comscore/analytics/SessionState;

    invoke-virtual {v1, v4}, Lcom/comscore/analytics/Core;->b(Lcom/comscore/analytics/SessionState;)V

    iget-object v1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->t()V

    iget-object v1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->d:Lcom/comscore/analytics/SessionState;

    iput-object v4, v1, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    :goto_1
    if-eqz v2, :cond_1

    iget-object v1, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v2, p0, Lcom/comscore/analytics/ac;->a:Lcom/comscore/analytics/ApplicationState;

    iget-object v4, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v4, v4, Lcom/comscore/analytics/Core;->z:Lcom/comscore/analytics/ApplicationState;

    invoke-virtual {v1, v2, v4}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/analytics/ApplicationState;Lcom/comscore/analytics/ApplicationState;)V

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v1, p0, Lcom/comscore/analytics/ac;->c:Lcom/comscore/analytics/SessionState;

    iget-object v2, p0, Lcom/comscore/analytics/ac;->e:Lcom/comscore/analytics/Core;

    iget-object v2, v2, Lcom/comscore/analytics/Core;->M:Lcom/comscore/analytics/SessionState;

    invoke-virtual {v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/analytics/SessionState;Lcom/comscore/analytics/SessionState;)V

    :cond_2
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    move v0, v1

    goto :goto_1

    :cond_4
    move v2, v1

    goto :goto_0
.end method
