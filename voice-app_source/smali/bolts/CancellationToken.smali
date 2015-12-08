.class public Lbolts/CancellationToken;
.super Ljava/lang/Object;
.source "CancellationToken.java"


# instance fields
.field private cancellationRequested:Z

.field private final lock:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbolts/CancellationToken;->lock:Ljava/lang/Object;

    .line 35
    return-void
.end method


# virtual methods
.method public isCancellationRequested()Z
    .locals 2

    .prologue
    .line 41
    iget-object v1, p0, Lbolts/CancellationToken;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 42
    :try_start_0
    iget-boolean v0, p0, Lbolts/CancellationToken;->cancellationRequested:Z

    monitor-exit v1

    return v0

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public throwIfCancellationRequested()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/CancellationException;
        }
    .end annotation

    .prologue
    .line 51
    iget-object v1, p0, Lbolts/CancellationToken;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 52
    :try_start_0
    iget-boolean v0, p0, Lbolts/CancellationToken;->cancellationRequested:Z

    if-eqz v0, :cond_0

    .line 53
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0

    .line 55
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 71
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s@%s[cancellationRequested=%s]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-boolean v4, p0, Lbolts/CancellationToken;->cancellationRequested:Z

    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method tryCancel()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 59
    iget-object v1, p0, Lbolts/CancellationToken;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 60
    :try_start_0
    iget-boolean v2, p0, Lbolts/CancellationToken;->cancellationRequested:Z

    if-eqz v2, :cond_0

    .line 61
    const/4 v0, 0x0

    monitor-exit v1

    .line 66
    :goto_0
    return v0

    .line 64
    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lbolts/CancellationToken;->cancellationRequested:Z

    .line 65
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
