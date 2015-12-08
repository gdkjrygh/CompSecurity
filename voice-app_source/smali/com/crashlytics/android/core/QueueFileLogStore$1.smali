.class Lcom/crashlytics/android/core/QueueFileLogStore$1;
.super Ljava/lang/Object;
.source "QueueFileLogStore.java"

# interfaces
.implements Lio/fabric/sdk/android/services/common/QueueFile$ElementReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/QueueFileLogStore;->getLogAsByteString()Lcom/crashlytics/android/core/ByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/crashlytics/android/core/QueueFileLogStore;

.field final synthetic val$logBytes:[B

.field final synthetic val$offsetHolder:[I


# direct methods
.method constructor <init>(Lcom/crashlytics/android/core/QueueFileLogStore;[B[I)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->this$0:Lcom/crashlytics/android/core/QueueFileLogStore;

    iput-object p2, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->val$logBytes:[B

    iput-object p3, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->val$offsetHolder:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/io/InputStream;I)V
    .locals 3
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 75
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->val$logBytes:[B

    iget-object v1, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->val$offsetHolder:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    .line 76
    iget-object v0, p0, Lcom/crashlytics/android/core/QueueFileLogStore$1;->val$offsetHolder:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    add-int/2addr v2, p2

    aput v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 80
    return-void

    .line 78
    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw v0
.end method
