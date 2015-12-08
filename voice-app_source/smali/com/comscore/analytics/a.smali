.class Lcom/comscore/analytics/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    iget v0, v0, Lcom/comscore/analytics/Core;->R:I

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    const/4 v1, 0x0

    iput v1, v0, Lcom/comscore/analytics/Core;->R:I

    :cond_1
    iget-object v0, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    iget-object v0, v0, Lcom/comscore/analytics/Core;->B:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    iget-object v0, p0, Lcom/comscore/analytics/a;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->n()V

    goto :goto_0
.end method
