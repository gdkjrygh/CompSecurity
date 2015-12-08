.class Lcom/comscore/analytics/ad;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/ad;->a:Lcom/comscore/analytics/Core;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/comscore/analytics/ad;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->a()V

    iget-object v0, p0, Lcom/comscore/analytics/ad;->a:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->l()V

    return-void
.end method
