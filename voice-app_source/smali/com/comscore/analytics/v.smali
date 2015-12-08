.class Lcom/comscore/analytics/v;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/v;->c:Lcom/comscore/analytics/Core;

    iput p2, p0, Lcom/comscore/analytics/v;->a:I

    iput-boolean p3, p0, Lcom/comscore/analytics/v;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/v;->c:Lcom/comscore/analytics/Core;

    iget v1, p0, Lcom/comscore/analytics/v;->a:I

    iget-boolean v2, p0, Lcom/comscore/analytics/v;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/comscore/analytics/Core;->a(IZ)V

    return-void
.end method
