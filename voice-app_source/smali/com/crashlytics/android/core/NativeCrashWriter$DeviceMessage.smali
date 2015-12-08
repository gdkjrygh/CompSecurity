.class final Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DeviceMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0x5


# instance fields
.field private final batteryLevel:F

.field private final batteryVelocity:I

.field private final diskUsed:J

.field private final orientation:I

.field private final proximityOn:Z

.field private final ramUsed:J


# direct methods
.method public constructor <init>(FIZIJJ)V
    .locals 3
    .param p1, "batteryLevel"    # F
    .param p2, "batteryVelocity"    # I
    .param p3, "proximityOn"    # Z
    .param p4, "orientation"    # I
    .param p5, "ramUsed"    # J
    .param p7, "diskUsed"    # J

    .prologue
    .line 220
    const/4 v0, 0x5

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 222
    iput p1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryLevel:F

    .line 223
    iput p2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryVelocity:I

    .line 224
    iput-boolean p3, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->proximityOn:Z

    .line 225
    iput p4, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->orientation:I

    .line 226
    iput-wide p5, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->ramUsed:J

    .line 227
    iput-wide p7, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->diskUsed:J

    .line 228
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 4

    .prologue
    .line 232
    const/4 v0, 0x0

    .line 233
    .local v0, "size":I
    const/4 v1, 0x1

    iget v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryLevel:F

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeFloatSize(IF)I

    move-result v1

    add-int/2addr v0, v1

    .line 234
    const/4 v1, 0x2

    iget v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryVelocity:I

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeSInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 235
    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->proximityOn:Z

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBoolSize(IZ)I

    move-result v1

    add-int/2addr v0, v1

    .line 236
    const/4 v1, 0x4

    iget v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->orientation:I

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt32Size(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 237
    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->ramUsed:J

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 238
    const/4 v1, 0x6

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->diskUsed:J

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 239
    return v0
.end method

.method public writeProperties(Lcom/crashlytics/android/core/CodedOutputStream;)V
    .locals 4
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 244
    const/4 v0, 0x1

    iget v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryLevel:F

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeFloat(IF)V

    .line 245
    const/4 v0, 0x2

    iget v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->batteryVelocity:I

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeSInt32(II)V

    .line 246
    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->proximityOn:Z

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBool(IZ)V

    .line 247
    const/4 v0, 0x4

    iget v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->orientation:I

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt32(II)V

    .line 248
    const/4 v0, 0x5

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->ramUsed:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 249
    const/4 v0, 0x6

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$DeviceMessage;->diskUsed:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 250
    return-void
.end method
