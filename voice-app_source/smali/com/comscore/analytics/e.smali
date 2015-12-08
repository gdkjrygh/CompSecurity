.class Lcom/comscore/analytics/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/HashMap;

.field final synthetic b:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/e;->b:Lcom/comscore/analytics/Core;

    iput-object p2, p0, Lcom/comscore/analytics/e;->a:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/e;->b:Lcom/comscore/analytics/Core;

    iget-object v0, v0, Lcom/comscore/analytics/Core;->ad:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/comscore/analytics/e;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method
