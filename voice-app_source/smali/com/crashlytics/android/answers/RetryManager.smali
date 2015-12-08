.class Lcom/crashlytics/android/answers/RetryManager;
.super Ljava/lang/Object;
.source "RetryManager.java"


# static fields
.field private static final NANOSECONDS_IN_MS:J = 0xf4240L


# instance fields
.field lastRetry:J

.field private retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/concurrency/internal/RetryState;)V
    .locals 2
    .param p1, "retryState"    # Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    if-nez p1, :cond_0

    .line 24
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "retryState must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    .line 27
    return-void
.end method


# virtual methods
.method public canRetry(J)Z
    .locals 7
    .param p1, "timeNanos"    # J

    .prologue
    .line 33
    const-wide/32 v2, 0xf4240

    iget-object v4, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    invoke-virtual {v4}, Lio/fabric/sdk/android/services/concurrency/internal/RetryState;->getRetryDelay()J

    move-result-wide v4

    mul-long v0, v2, v4

    .line 34
    .local v0, "delayInNanos":J
    iget-wide v2, p0, Lcom/crashlytics/android/answers/RetryManager;->lastRetry:J

    sub-long v2, p1, v2

    cmp-long v2, v2, v0

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public recordRetry(J)V
    .locals 1
    .param p1, "timeNanos"    # J

    .prologue
    .line 41
    iput-wide p1, p0, Lcom/crashlytics/android/answers/RetryManager;->lastRetry:J

    .line 42
    iget-object v0, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/concurrency/internal/RetryState;->nextRetryState()Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    .line 43
    return-void
.end method

.method public reset()V
    .locals 2

    .prologue
    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/crashlytics/android/answers/RetryManager;->lastRetry:J

    .line 50
    iget-object v0, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/concurrency/internal/RetryState;->initialRetryState()Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    move-result-object v0

    iput-object v0, p0, Lcom/crashlytics/android/answers/RetryManager;->retryState:Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    .line 51
    return-void
.end method
