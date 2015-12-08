.class final Lcom/crashlytics/android/core/NativeCrashWriter$RepeatedMessage;
.super Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
.source "NativeCrashWriter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/NativeCrashWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RepeatedMessage"
.end annotation


# instance fields
.field private final messages:[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;


# direct methods
.method public varargs constructor <init>([Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V
    .locals 2
    .param p1, "messages"    # [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    .prologue
    const/4 v1, 0x0

    .line 127
    new-array v0, v1, [Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    invoke-direct {p0, v1, v0}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;-><init>(I[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;)V

    .line 128
    iput-object p1, p0, Lcom/crashlytics/android/core/NativeCrashWriter$RepeatedMessage;->messages:[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    .line 129
    return-void
.end method


# virtual methods
.method public getSize()I
    .locals 6

    .prologue
    .line 140
    const/4 v4, 0x0

    .line 141
    .local v4, "size":I
    iget-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$RepeatedMessage;->messages:[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    .local v0, "arr$":[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 142
    .local v3, "message":Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    invoke-virtual {v3}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;->getSize()I

    move-result v5

    add-int/2addr v4, v5

    .line 141
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 144
    .end local v3    # "message":Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    :cond_0
    return v4
.end method

.method public write(Lcom/crashlytics/android/core/CodedOutputStream;)V
    .locals 4
    .param p1, "cos"    # Lcom/crashlytics/android/core/CodedOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 133
    iget-object v0, p0, Lcom/crashlytics/android/core/NativeCrashWriter$RepeatedMessage;->messages:[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;

    .local v0, "arr$":[Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 134
    .local v3, "message":Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    invoke-virtual {v3, p1}, Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;->write(Lcom/crashlytics/android/core/CodedOutputStream;)V

    .line 133
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 136
    .end local v3    # "message":Lcom/crashlytics/android/core/NativeCrashWriter$ProtobufMessage;
    :cond_0
    return-void
.end method
