.class public Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;
.super Ljava/lang/Object;
.source "DefaultRetryPolicy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/concurrency/internal/RetryPolicy;


# instance fields
.field private final maxRetries:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;-><init>(I)V

    .line 26
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "maxRetries"    # I

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;->maxRetries:I

    .line 30
    return-void
.end method


# virtual methods
.method public shouldRetry(ILjava/lang/Throwable;)Z
    .locals 1
    .param p1, "retries"    # I
    .param p2, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 33
    iget v0, p0, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;->maxRetries:I

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
