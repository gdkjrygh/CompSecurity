.class Lcom/comscore/measurement/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/comscore/measurement/Measurement;

.field final synthetic b:Lcom/comscore/measurement/MeasurementDispatcher;


# direct methods
.method constructor <init>(Lcom/comscore/measurement/MeasurementDispatcher;Lcom/comscore/measurement/Measurement;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/measurement/a;->b:Lcom/comscore/measurement/MeasurementDispatcher;

    iput-object p2, p0, Lcom/comscore/measurement/a;->a:Lcom/comscore/measurement/Measurement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/measurement/a;->b:Lcom/comscore/measurement/MeasurementDispatcher;

    iget-object v1, p0, Lcom/comscore/measurement/a;->a:Lcom/comscore/measurement/Measurement;

    invoke-static {v0, v1}, Lcom/comscore/measurement/MeasurementDispatcher;->a(Lcom/comscore/measurement/MeasurementDispatcher;Lcom/comscore/measurement/Measurement;)V

    return-void
.end method
