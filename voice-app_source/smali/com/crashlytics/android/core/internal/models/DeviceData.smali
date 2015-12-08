.class public Lcom/crashlytics/android/core/internal/models/DeviceData;
.super Ljava/lang/Object;
.source "DeviceData.java"


# instance fields
.field public final availableInternalStorage:J

.field public final availablePhysicalMemory:J

.field public final batteryCapacity:I

.field public final batteryVelocity:I

.field public final orientation:I

.field public final proximity:Z

.field public final totalInternalStorage:J

.field public final totalPhysicalMemory:J


# direct methods
.method public constructor <init>(IJJJJIIZ)V
    .locals 0
    .param p1, "orientation"    # I
    .param p2, "totalPhysicalMemory"    # J
    .param p4, "totalInternalStorage"    # J
    .param p6, "availablePhysicalMemory"    # J
    .param p8, "availableInternalStorage"    # J
    .param p10, "batteryCapacity"    # I
    .param p11, "batteryVelocity"    # I
    .param p12, "proximity"    # Z

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput p1, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->orientation:I

    .line 52
    iput-wide p2, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->totalPhysicalMemory:J

    .line 53
    iput-wide p4, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->totalInternalStorage:J

    .line 54
    iput-wide p6, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->availablePhysicalMemory:J

    .line 55
    iput-wide p8, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->availableInternalStorage:J

    .line 56
    iput p10, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->batteryCapacity:I

    .line 57
    iput p11, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->batteryVelocity:I

    .line 58
    iput-boolean p12, p0, Lcom/crashlytics/android/core/internal/models/DeviceData;->proximity:Z

    .line 59
    return-void
.end method
