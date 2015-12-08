.class Lcom/comscore/analytics/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Z)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/j;->b:Lcom/comscore/analytics/Core;

    iput-boolean p2, p0, Lcom/comscore/analytics/j;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/j;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->isSecure()Z

    move-result v0

    iget-boolean v1, p0, Lcom/comscore/analytics/j;->a:Z

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/comscore/analytics/j;->b:Lcom/comscore/analytics/Core;

    iget-boolean v1, p0, Lcom/comscore/analytics/j;->a:Z

    iput-boolean v1, v0, Lcom/comscore/analytics/Core;->aj:Z

    :cond_0
    return-void
.end method
