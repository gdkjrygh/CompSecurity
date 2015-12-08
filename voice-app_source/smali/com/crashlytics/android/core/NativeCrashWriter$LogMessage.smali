.class final Lcom/crashlytics/android/core/NativeCrashWriter$LogMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LogMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0x6


# instance fields
.field logBytes:Lcom/crashlytics/android/core/ByteString;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/ByteString;)V
    .locals 2
    .param p1, "logBytes"    # Lcom/crashlytics/android/core/ByteString;

    .prologue
    .line 259
    const/4 v0, 0x6

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 260
    iput-object p1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$LogMessage;->logBytes:Lcom/crashlytics/android/core/ByteString;

    .line 261
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 2

    .prologue
    .line 265
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$LogMessage;->logBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-static {v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v0

    return v0
.end method

.method public writeProperties(Lcom/crashlytics/android/core/CodedOutputStream;)V
    .locals 2
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 270
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$LogMessage;->logBytes:Lcom/crashlytics/android/core/ByteString;

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 271
    return-void
.end method
