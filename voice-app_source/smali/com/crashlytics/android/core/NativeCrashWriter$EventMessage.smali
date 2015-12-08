.class final Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EventMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0xa


# instance fields
.field private final crashType:Ljava/lang/String;

.field private final time:J


# direct methods
.method public varargs constructor <init>(JLjava/lang/String;[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V
    .locals 1
    .param p1, "time"    # J
    .param p3, "crashType"    # Ljava/lang/String;
    .param p4, "eventMessages"    # [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    .prologue
    .line 176
    const/16 v0, 0xa

    invoke-direct {p0, v0, p4}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 177
    iput-wide p1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->time:J

    .line 178
    iput-object p3, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->crashType:Ljava/lang/String;

    .line 179
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 6

    .prologue
    .line 183
    const/4 v2, 0x1

    iget-wide v4, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->time:J

    invoke-static {v2, v4, v5}, Lcom/crashlytics/android/core/CodedOutputStream;->computeUInt64Size(IJ)I

    move-result v0

    .line 184
    .local v0, "timeSize":I
    const/4 v2, 0x2

    iget-object v3, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->crashType:Ljava/lang/String;

    invoke-static {v3}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    .line 186
    .local v1, "typeSize":I
    add-int v2, v0, v1

    return v2
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
    .line 191
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->time:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/crashlytics/android/core/CodedOutputStream;->writeUInt64(IJ)V

    .line 192
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$EventMessage;->crashType:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 193
    return-void
.end method
