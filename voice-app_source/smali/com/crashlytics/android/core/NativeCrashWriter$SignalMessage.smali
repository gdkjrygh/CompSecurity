.class final Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SignalMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0x3


# instance fields
.field private final sigAddr:J

.field private final sigCode:Ljava/lang/String;

.field private final sigName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/internal/models/SignalData;)V
    .locals 2
    .param p1, "signalData"    # Lcom/crashlytics/android/core/internal/models/SignalData;

    .prologue
    .line 391
    const/4 v0, 0x3

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 392
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/SignalData;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigName:Ljava/lang/String;

    .line 393
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/SignalData;->code:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigCode:Ljava/lang/String;

    .line 394
    iget-wide v0, p1, Lcom/crashlytics/android/core/internal/models/SignalData;->faultAddress:J

    iput-wide v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigAddr:J

    .line 395
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 4

    .prologue
    .line 399
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigName:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v0

    .line 400
    .local v0, "size":I
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigCode:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 401
    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigAddr:J

    invoke-static {v1, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 402
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
    .line 407
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigName:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 408
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigCode:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 409
    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$SignalMessage;->sigAddr:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 410
    return-void
.end method
