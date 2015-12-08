.class Lcom/comscore/analytics/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/comscore/utils/TransmissionMode;

.field final synthetic b:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/i;->b:Lcom/comscore/analytics/Core;

    iput-object p2, p0, Lcom/comscore/analytics/i;->a:Lcom/comscore/utils/TransmissionMode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/i;->b:Lcom/comscore/analytics/Core;

    iget-object v1, p0, Lcom/comscore/analytics/i;->a:Lcom/comscore/utils/TransmissionMode;

    invoke-static {v0, v1}, Lcom/comscore/analytics/Core;->b(Lcom/comscore/analytics/Core;Lcom/comscore/utils/TransmissionMode;)V

    return-void
.end method
