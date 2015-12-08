.class Lcom/crashlytics/android/answers/AnswersRetryFilesSender;
.super Ljava/lang/Object;
.source "AnswersRetryFilesSender.java"

# interfaces
.implements Lio/fabric/sdk/android/services/events/FilesSender;


# static fields
.field private static final BACKOFF_MS:I = 0x3e8

.field private static final BACKOFF_POWER:I = 0x8

.field private static final JITTER_PERCENT:D = 0.1

.field private static final MAX_RETRIES:I = 0x5


# instance fields
.field private final filesSender:Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;

.field private final retryManager:Lcom/crashlytics/android/answers/RetryManager;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;Lcom/crashlytics/android/answers/RetryManager;)V
    .locals 0
    .param p1, "filesSender"    # Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;
    .param p2, "retryManager"    # Lcom/crashlytics/android/answers/RetryManager;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->filesSender:Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;

    .line 42
    iput-object p2, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->retryManager:Lcom/crashlytics/android/answers/RetryManager;

    .line 43
    return-void
.end method

.method public static build(Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;)Lcom/crashlytics/android/answers/AnswersRetryFilesSender;
    .locals 8
    .param p0, "filesSender"    # Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;

    .prologue
    .line 31
    new-instance v0, Lcom/crashlytics/android/answers/RandomBackoff;

    new-instance v4, Lio/fabric/sdk/android/services/concurrency/internal/ExponentialBackoff;

    const-wide/16 v6, 0x3e8

    const/16 v5, 0x8

    invoke-direct {v4, v6, v7, v5}, Lio/fabric/sdk/android/services/concurrency/internal/ExponentialBackoff;-><init>(JI)V

    const-wide v6, 0x3fb999999999999aL    # 0.1

    invoke-direct {v0, v4, v6, v7}, Lcom/crashlytics/android/answers/RandomBackoff;-><init>(Lio/fabric/sdk/android/services/concurrency/internal/Backoff;D)V

    .line 33
    .local v0, "backoff":Lio/fabric/sdk/android/services/concurrency/internal/Backoff;
    new-instance v2, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;

    const/4 v4, 0x5

    invoke-direct {v2, v4}, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;-><init>(I)V

    .line 34
    .local v2, "retryPolicy":Lio/fabric/sdk/android/services/concurrency/internal/RetryPolicy;
    new-instance v3, Lio/fabric/sdk/android/services/concurrency/internal/RetryState;

    invoke-direct {v3, v0, v2}, Lio/fabric/sdk/android/services/concurrency/internal/RetryState;-><init>(Lio/fabric/sdk/android/services/concurrency/internal/Backoff;Lio/fabric/sdk/android/services/concurrency/internal/RetryPolicy;)V

    .line 35
    .local v3, "retryState":Lio/fabric/sdk/android/services/concurrency/internal/RetryState;
    new-instance v1, Lcom/crashlytics/android/answers/RetryManager;

    invoke-direct {v1, v3}, Lcom/crashlytics/android/answers/RetryManager;-><init>(Lio/fabric/sdk/android/services/concurrency/internal/RetryState;)V

    .line 36
    .local v1, "retryManager":Lcom/crashlytics/android/answers/RetryManager;
    new-instance v4, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;

    invoke-direct {v4, p0, v1}, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;-><init>(Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;Lcom/crashlytics/android/answers/RetryManager;)V

    return-object v4
.end method


# virtual methods
.method public send(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "files":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    const/4 v1, 0x0

    .line 47
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 48
    .local v2, "currentNanoTime":J
    iget-object v4, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->retryManager:Lcom/crashlytics/android/answers/RetryManager;

    invoke-virtual {v4, v2, v3}, Lcom/crashlytics/android/answers/RetryManager;->canRetry(J)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 49
    iget-object v4, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->filesSender:Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;

    invoke-virtual {v4, p1}, Lcom/crashlytics/android/answers/SessionAnalyticsFilesSender;->send(Ljava/util/List;)Z

    move-result v0

    .line 50
    .local v0, "cleanup":Z
    if-eqz v0, :cond_1

    .line 51
    iget-object v1, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->retryManager:Lcom/crashlytics/android/answers/RetryManager;

    invoke-virtual {v1}, Lcom/crashlytics/android/answers/RetryManager;->reset()V

    .line 52
    const/4 v1, 0x1

    .line 58
    .end local v0    # "cleanup":Z
    :cond_0
    :goto_0
    return v1

    .line 54
    .restart local v0    # "cleanup":Z
    :cond_1
    iget-object v4, p0, Lcom/crashlytics/android/answers/AnswersRetryFilesSender;->retryManager:Lcom/crashlytics/android/answers/RetryManager;

    invoke-virtual {v4, v2, v3}, Lcom/crashlytics/android/answers/RetryManager;->recordRetry(J)V

    goto :goto_0
.end method
