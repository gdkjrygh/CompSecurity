.class Lio/fabric/sdk/android/services/network/HttpRequest$8;
.super Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation",
        "<",
        "Lio/fabric/sdk/android/services/network/HttpRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

.field final synthetic val$input:Ljava/io/InputStream;

.field final synthetic val$output:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0
    .param p2, "x0"    # Ljava/io/Closeable;
    .param p3, "x1"    # Z

    .prologue
    .line 2419
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iput-object p4, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->val$input:Ljava/io/InputStream;

    iput-object p5, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->val$output:Ljava/io/OutputStream;

    invoke-direct {p0, p2, p3}, Lio/fabric/sdk/android/services/network/HttpRequest$CloseOperation;-><init>(Ljava/io/Closeable;Z)V

    return-void
.end method


# virtual methods
.method public run()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2423
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    # getter for: Lio/fabric/sdk/android/services/network/HttpRequest;->bufferSize:I
    invoke-static {v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->access$100(Lio/fabric/sdk/android/services/network/HttpRequest;)I

    move-result v2

    new-array v0, v2, [B

    .line 2425
    .local v0, "buffer":[B
    :goto_0
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->val$input:Ljava/io/InputStream;

    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    .local v1, "read":I
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 2426
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->val$output:Ljava/io/OutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 2427
    :cond_0
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$8;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    return-object v2
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2419
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$8;->run()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method
