.class Lcom/crashlytics/android/answers/RandomBackoff;
.super Ljava/lang/Object;
.source "RandomBackoff.java"

# interfaces
.implements Lio/fabric/sdk/android/services/concurrency/internal/Backoff;


# instance fields
.field final backoff:Lio/fabric/sdk/android/services/concurrency/internal/Backoff;

.field final jitterPercent:D

.field final random:Ljava/util/Random;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/concurrency/internal/Backoff;D)V
    .locals 2
    .param p1, "backoff"    # Lio/fabric/sdk/android/services/concurrency/internal/Backoff;
    .param p2, "jitterPercent"    # D

    .prologue
    .line 27
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/crashlytics/android/answers/RandomBackoff;-><init>(Lio/fabric/sdk/android/services/concurrency/internal/Backoff;DLjava/util/Random;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Lio/fabric/sdk/android/services/concurrency/internal/Backoff;DLjava/util/Random;)V
    .locals 2
    .param p1, "backoff"    # Lio/fabric/sdk/android/services/concurrency/internal/Backoff;
    .param p2, "jitterPercent"    # D
    .param p4, "random"    # Ljava/util/Random;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-ltz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p2, v0

    if-lez v0, :cond_1

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "jitterPercent must be between 0.0 and 1.0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_1
    if-nez p1, :cond_2

    .line 48
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "backoff must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_2
    if-nez p4, :cond_3

    .line 52
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "random must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_3
    iput-object p1, p0, Lcom/crashlytics/android/answers/RandomBackoff;->backoff:Lio/fabric/sdk/android/services/concurrency/internal/Backoff;

    .line 56
    iput-wide p2, p0, Lcom/crashlytics/android/answers/RandomBackoff;->jitterPercent:D

    .line 57
    iput-object p4, p0, Lcom/crashlytics/android/answers/RandomBackoff;->random:Ljava/util/Random;

    .line 58
    return-void
.end method


# virtual methods
.method public getDelayMillis(I)J
    .locals 4
    .param p1, "retries"    # I

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/crashlytics/android/answers/RandomBackoff;->randomJitter()D

    move-result-wide v0

    iget-object v2, p0, Lcom/crashlytics/android/answers/RandomBackoff;->backoff:Lio/fabric/sdk/android/services/concurrency/internal/Backoff;

    invoke-interface {v2, p1}, Lio/fabric/sdk/android/services/concurrency/internal/Backoff;->getDelayMillis(I)J

    move-result-wide v2

    long-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method randomJitter()D
    .locals 10

    .prologue
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 66
    iget-wide v6, p0, Lcom/crashlytics/android/answers/RandomBackoff;->jitterPercent:D

    sub-double v2, v8, v6

    .line 67
    .local v2, "minJitter":D
    iget-wide v6, p0, Lcom/crashlytics/android/answers/RandomBackoff;->jitterPercent:D

    add-double v0, v8, v6

    .line 68
    .local v0, "maxJitter":D
    iget-object v6, p0, Lcom/crashlytics/android/answers/RandomBackoff;->random:Ljava/util/Random;

    invoke-virtual {v6}, Ljava/util/Random;->nextDouble()D

    move-result-wide v4

    .line 69
    .local v4, "randomDouble":D
    sub-double v6, v0, v2

    mul-double/2addr v6, v4

    add-double/2addr v6, v2

    return-wide v6
.end method
