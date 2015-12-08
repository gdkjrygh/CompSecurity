.class Lcom/comscore/analytics/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/f;->c:Lcom/comscore/analytics/Core;

    iput-object p2, p0, Lcom/comscore/analytics/f;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/comscore/analytics/f;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/comscore/analytics/f;->c:Lcom/comscore/analytics/Core;

    iget-object v1, p0, Lcom/comscore/analytics/f;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/comscore/analytics/f;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/comscore/analytics/Core;->a(Lcom/comscore/analytics/Core;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
