.class public abstract Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;
.super Lio/fabric/sdk/android/services/network/HttpRequest$Operation;
.source "HttpRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/network/HttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "FlushOperation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lio/fabric/sdk/android/services/network/HttpRequest$Operation",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final flushable:Ljava/io/Flushable;


# direct methods
.method protected constructor <init>(Ljava/io/Flushable;)V
    .locals 0
    .param p1, "flushable"    # Ljava/io/Flushable;

    .prologue
    .line 713
    .local p0, "this":Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;, "Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation<TV;>;"
    invoke-direct {p0}, Lio/fabric/sdk/android/services/network/HttpRequest$Operation;-><init>()V

    .line 714
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;->flushable:Ljava/io/Flushable;

    .line 715
    return-void
.end method


# virtual methods
.method protected done()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 719
    .local p0, "this":Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;, "Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation<TV;>;"
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/HttpRequest$FlushOperation;->flushable:Ljava/io/Flushable;

    invoke-interface {v0}, Ljava/io/Flushable;->flush()V

    .line 720
    return-void
.end method
