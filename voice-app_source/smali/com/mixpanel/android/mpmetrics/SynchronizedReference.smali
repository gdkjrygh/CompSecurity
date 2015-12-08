.class Lcom/mixpanel/android/mpmetrics/SynchronizedReference;
.super Ljava/lang/Object;
.source "SynchronizedReference.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mContents:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    .local p0, "this":Lcom/mixpanel/android/mpmetrics/SynchronizedReference;, "Lcom/mixpanel/android/mpmetrics/SynchronizedReference<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/SynchronizedReference;->mContents:Ljava/lang/Object;

    .line 10
    return-void
.end method


# virtual methods
.method public declared-synchronized get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 23
    .local p0, "this":Lcom/mixpanel/android/mpmetrics/SynchronizedReference;, "Lcom/mixpanel/android/mpmetrics/SynchronizedReference<TT;>;"
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/SynchronizedReference;->mContents:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getAndClear()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 17
    .local p0, "this":Lcom/mixpanel/android/mpmetrics/SynchronizedReference;, "Lcom/mixpanel/android/mpmetrics/SynchronizedReference<TT;>;"
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/SynchronizedReference;->mContents:Ljava/lang/Object;

    .line 18
    .local v0, "ret":Ljava/lang/Object;, "TT;"
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/SynchronizedReference;->mContents:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    return-object v0

    .line 17
    .end local v0    # "ret":Ljava/lang/Object;, "TT;"
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 13
    .local p0, "this":Lcom/mixpanel/android/mpmetrics/SynchronizedReference;, "Lcom/mixpanel/android/mpmetrics/SynchronizedReference<TT;>;"
    .local p1, "contents":Ljava/lang/Object;, "TT;"
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/SynchronizedReference;->mContents:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit p0

    return-void

    .line 13
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
