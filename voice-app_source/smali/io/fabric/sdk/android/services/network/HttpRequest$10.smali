.class Lio/fabric/sdk/android/services/network/HttpRequest$10;
.super Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;->send(Ljava/io/Reader;)Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation",
        "<",
        "Lio/fabric/sdk/android/services/network/HttpRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

.field final synthetic val$input:Ljava/io/Reader;

.field final synthetic val$writer:Ljava/io/Writer;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/network/HttpRequest;Ljava/io/Flushable;Ljava/io/Reader;Ljava/io/Writer;)V
    .locals 0
    .param p2, "x0"    # Ljava/io/Flushable;

    .prologue
    .line 2793
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iput-object p3, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->val$input:Ljava/io/Reader;

    iput-object p4, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->val$writer:Ljava/io/Writer;

    invoke-direct {p0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;-><init>(Ljava/io/Flushable;)V

    return-void
.end method


# virtual methods
.method protected run()Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2797
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->this$0:Lio/fabric/sdk/android/services/network/HttpRequest;

    iget-object v1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->val$input:Ljava/io/Reader;

    iget-object v2, p0, Lio/fabric/sdk/android/services/network/HttpRequest$10;->val$writer:Ljava/io/Writer;

    invoke-virtual {v0, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->copy(Ljava/io/Reader;Ljava/io/Writer;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 2793
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$10;->run()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    return-object v0
.end method
