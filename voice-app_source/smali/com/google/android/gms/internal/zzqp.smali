.class public Lcom/google/android/gms/internal/zzqp;
.super Ljava/lang/Object;


# instance fields
.field private mClosed:Z

.field private zzaLc:Ljava/lang/String;

.field private final zzaMX:Ljava/util/concurrent/ScheduledExecutorService;

.field private zzaMZ:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzqp;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzqp;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqp;->zzaLc:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqp;->zzaMZ:Ljava/util/concurrent/ScheduledFuture;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqp;->zzaLc:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqp;->zzaMX:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzqp;->mClosed:Z

    return-void
.end method


# virtual methods
.method public zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzqd;JLcom/google/android/gms/internal/zzqn;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "ResourceLoaderScheduler: Loading new resource."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqp;->zzaMZ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    monitor-exit p0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzqp;->zzaLc:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzqo;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzqp;->zzaLc:Ljava/lang/String;

    invoke-direct {v0, p1, p2, p5, v1}, Lcom/google/android/gms/internal/zzqo;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzqd;Lcom/google/android/gms/internal/zzqn;Ljava/lang/String;)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzqp;->zzaMX:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, p3, p4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqp;->zzaMZ:Ljava/util/concurrent/ScheduledFuture;

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/zzqo;

    invoke-direct {v0, p1, p2, p5}, Lcom/google/android/gms/internal/zzqo;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzqd;Lcom/google/android/gms/internal/zzqn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method
