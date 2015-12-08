.class final Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CustomAttributeMessage"
.end annotation


# static fields
.field private static final PROTOBUF_TAG:I = 0x2


# instance fields
.field private final key:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/internal/models/CustomAttributeData;)V
    .locals 2
    .param p1, "customAttributeData"    # Lcom/crashlytics/android/core/internal/models/CustomAttributeData;

    .prologue
    .line 465
    const/4 v0, 0x2

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v0, v1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 466
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/CustomAttributeData;->key:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->key:Ljava/lang/String;

    .line 467
    iget-object v0, p1, Lcom/crashlytics/android/core/internal/models/CustomAttributeData;->value:Ljava/lang/String;

    iput-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->value:Ljava/lang/String;

    .line 468
    return-void
.end method


# virtual methods
.method public getPropertiesSize()I
    .locals 3

    .prologue
    .line 472
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->key:Ljava/lang/String;

    invoke-static {v2}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v0

    .line 473
    .local v0, "size":I
    const/4 v2, 0x2

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->value:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    :goto_0
    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->computeBytesSize(ILcom/crashlytics/android/core/ByteString;)I

    move-result v1

    add-int/2addr v0, v1

    .line 475
    return v0

    .line 473
    :cond_0
    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->value:Ljava/lang/String;

    goto :goto_0
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
    .line 480
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->key:Ljava/lang/String;

    invoke-static {v1}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 481
    const/4 v1, 0x2

    iget-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->value:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    invoke-static {v0}, Lcom/crashlytics/android/core/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/crashlytics/android/core/ByteString;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/crashlytics/android/core/CodedOutputStream;->writeBytes(ILcom/crashlytics/android/core/ByteString;)V

    .line 482
    return-void

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$CustomAttributeMessage;->value:Ljava/lang/String;

    goto :goto_0
.end method
