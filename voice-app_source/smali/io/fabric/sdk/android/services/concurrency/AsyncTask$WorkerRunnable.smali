.class abstract Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;
.super Ljava/lang/Object;
.source "AsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/concurrency/AsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "WorkerRunnable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<TResult;>;"
    }
.end annotation


# instance fields
.field params:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TParams;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 683
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable<TParams;TResult;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/fabric/sdk/android/services/concurrency/AsyncTask$1;)V
    .locals 0
    .param p1, "x0"    # Lio/fabric/sdk/android/services/concurrency/AsyncTask$1;

    .prologue
    .line 683
    .local p0, "this":Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;, "Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable<TParams;TResult;>;"
    invoke-direct {p0}, Lio/fabric/sdk/android/services/concurrency/AsyncTask$WorkerRunnable;-><init>()V

    return-void
.end method
