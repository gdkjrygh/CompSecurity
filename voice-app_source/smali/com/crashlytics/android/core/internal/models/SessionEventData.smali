.class public Lcom/crashlytics/android/core/internal/models/SessionEventData;
.super Ljava/lang/Object;
.source "SessionEventData.java"


# instance fields
.field public final binaryImages:[Lcom/crashlytics/android/core/internal/models/BinaryImageData;

.field public final customAttributes:[Lcom/crashlytics/android/core/internal/models/CustomAttributeData;

.field public final deviceData:Lcom/crashlytics/android/core/internal/models/DeviceData;

.field public final signal:Lcom/crashlytics/android/core/internal/models/SignalData;

.field public final threads:[Lcom/crashlytics/android/core/internal/models/ThreadData;

.field public final timestamp:J


# direct methods
.method public constructor <init>(JLcom/crashlytics/android/core/internal/models/SignalData;[Lcom/crashlytics/android/core/internal/models/ThreadData;[Lcom/crashlytics/android/core/internal/models/BinaryImageData;[Lcom/crashlytics/android/core/internal/models/CustomAttributeData;Lcom/crashlytics/android/core/internal/models/DeviceData;)V
    .locals 1
    .param p1, "timestamp"    # J
    .param p3, "signal"    # Lcom/crashlytics/android/core/internal/models/SignalData;
    .param p4, "threads"    # [Lcom/crashlytics/android/core/internal/models/ThreadData;
    .param p5, "binaryImages"    # [Lcom/crashlytics/android/core/internal/models/BinaryImageData;
    .param p6, "customAttributes"    # [Lcom/crashlytics/android/core/internal/models/CustomAttributeData;
    .param p7, "deviceData"    # Lcom/crashlytics/android/core/internal/models/DeviceData;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-wide p1, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->timestamp:J

    .line 47
    iput-object p3, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->signal:Lcom/crashlytics/android/core/internal/models/SignalData;

    .line 48
    iput-object p4, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->threads:[Lcom/crashlytics/android/core/internal/models/ThreadData;

    .line 49
    iput-object p5, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->binaryImages:[Lcom/crashlytics/android/core/internal/models/BinaryImageData;

    .line 50
    iput-object p6, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->customAttributes:[Lcom/crashlytics/android/core/internal/models/CustomAttributeData;

    .line 51
    iput-object p7, p0, Lcom/crashlytics/android/core/internal/models/SessionEventData;->deviceData:Lcom/crashlytics/android/core/internal/models/DeviceData;

    .line 52
    return-void
.end method
