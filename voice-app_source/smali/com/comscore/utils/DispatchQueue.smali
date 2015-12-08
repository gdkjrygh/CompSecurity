.class public Lcom/comscore/utils/DispatchQueue;
.super Ljava/util/concurrent/ConcurrentLinkedQueue;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final LIVE_TRANSMISSION_MODE:I = 0x0

.field public static final MEASUREMENT_LABEL_ORDER:I = 0x3

.field public static final OFFLINE_TRANSMISSION_MODE:I = 0x1

.field public static final SECURE_MODE:I = 0x2

.field private static final a:J = 0x1L


# instance fields
.field private b:Lcom/comscore/analytics/Core;


# direct methods
.method public constructor <init>(Lcom/comscore/analytics/Core;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    return-void
.end method


# virtual methods
.method public enqueue(Lcom/comscore/measurement/Measurement;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/comscore/utils/DispatchQueue;->offer(Lcom/comscore/measurement/Measurement;)Z

    return-void
.end method

.method public enqueueSettingChange(ILjava/lang/Object;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    check-cast p2, Lcom/comscore/utils/TransmissionMode;

    invoke-virtual {v0, p2, v2}, Lcom/comscore/analytics/Core;->allowLiveTransmission(Lcom/comscore/utils/TransmissionMode;Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    check-cast p2, Lcom/comscore/utils/TransmissionMode;

    invoke-virtual {v0, p2, v2}, Lcom/comscore/analytics/Core;->allowOfflineTransmission(Lcom/comscore/utils/TransmissionMode;Z)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1, v2}, Lcom/comscore/analytics/Core;->setSecure(ZZ)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    check-cast p2, [Ljava/lang/String;

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {v0, p2, v2}, Lcom/comscore/analytics/Core;->setMeasurementLabelOrder([Ljava/lang/String;Z)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public offer(Lcom/comscore/measurement/Measurement;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offer(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->getMeasurementLabelOrder()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/comscore/measurement/Measurement;->retrieveLabelsAsString([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getMeasurementDispatcher()Lcom/comscore/measurement/MeasurementDispatcher;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/comscore/measurement/MeasurementDispatcher;->sendMeasurmement(Lcom/comscore/measurement/Measurement;Z)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic offer(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lcom/comscore/utils/DispatchQueue;->offer(Ljava/lang/Runnable;)Z

    move-result v0

    return v0
.end method

.method public offer(Ljava/lang/Runnable;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getTaskExecutor()Lcom/comscore/utils/task/TaskExecutor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/comscore/utils/task/TaskExecutor;->execute(Ljava/lang/Runnable;Z)Z

    move-result v0

    return v0
.end method

.method public processAggregateData(Lcom/comscore/measurement/Measurement;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getMeasurementDispatcher()Lcom/comscore/measurement/MeasurementDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/comscore/measurement/MeasurementDispatcher;->addAggregateData(Lcom/comscore/measurement/Measurement;)V

    return-void
.end method

.method public processEventCounter(Lcom/comscore/measurement/Measurement;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getMeasurementDispatcher()Lcom/comscore/measurement/MeasurementDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/comscore/measurement/MeasurementDispatcher;->addEventCounter(Lcom/comscore/measurement/Measurement;)V

    return-void
.end method

.method public stop()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/comscore/utils/DispatchQueue;->b:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getTaskExecutor()Lcom/comscore/utils/task/TaskExecutor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/comscore/utils/task/TaskExecutor;->clear()V

    return-void
.end method
