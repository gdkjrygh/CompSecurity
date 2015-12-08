.class Lcom/comscore/analytics/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;I)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/n;->b:Lcom/comscore/analytics/Core;

    iput p2, p0, Lcom/comscore/analytics/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/analytics/n;->b:Lcom/comscore/analytics/Core;

    iget-object v0, v0, Lcom/comscore/analytics/Core;->a:Lcom/comscore/utils/OfflineMeasurementsCache;

    iget v1, p0, Lcom/comscore/analytics/n;->a:I

    invoke-virtual {v0, v1}, Lcom/comscore/utils/OfflineMeasurementsCache;->setCacheMaxMeasurements(I)V

    return-void
.end method
