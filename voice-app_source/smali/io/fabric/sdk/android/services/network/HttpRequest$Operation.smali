.class public abstract Lio/fabric/sdk/android/services/network/HttpRequest$Operation;
.super Ljava/lang/Object;
.source "HttpRequest.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "Operation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<TV;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 623
    .local p0, "this":Lio/fabric/sdk/android/services/network/HttpRequest$Operation;, "Lio/fabric/sdk/android/services/network/HttpRequest$Operation<TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
        }
    .end annotation

    .prologue
    .line 642
    .local p0, "this":Lio/fabric/sdk/android/services/network/HttpRequest$Operation;, "Lio/fabric/sdk/android/services/network/HttpRequest$Operation<TV;>;"
    const/4 v1, 0x0

    .line 644
    .local v1, "thrown":Z
    :try_start_0
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$Operation;->run()Ljava/lang/Object;
    :try_end_0
    .catch Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 653
    :try_start_1
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$Operation;->done()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 657
    :cond_0
    return-object v2

    .line 654
    :catch_0
    move-exception v0

    .line 655
    .local v0, "e":Ljava/io/IOException;
    if-nez v1, :cond_0

    .line 656
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2

    .line 645
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 646
    .local v0, "e":Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
    const/4 v1, 0x1

    .line 647
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 652
    .end local v0    # "e":Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;
    :catchall_0
    move-exception v2

    .line 653
    :try_start_3
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$Operation;->done()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 657
    :cond_1
    throw v2

    .line 648
    :catch_2
    move-exception v0

    .line 649
    .local v0, "e":Ljava/io/IOException;
    const/4 v1, 0x1

    .line 650
    :try_start_4
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 654
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 655
    .restart local v0    # "e":Ljava/io/IOException;
    if-nez v1, :cond_1

    .line 656
    new-instance v2, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;

    invoke-direct {v2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;-><init>(Ljava/io/IOException;)V

    throw v2
.end method

.method protected abstract done()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected abstract run()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/fabric/sdk/android/services/network/HttpRequest$HttpRequestException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method
