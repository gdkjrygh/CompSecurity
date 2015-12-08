.class Lcom/google/android/gms/cast/internal/zze$zzb;
.super Lcom/google/android/gms/cast/internal/zzj$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/internal/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "zzb"
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private final zzUI:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Lcom/google/android/gms/cast/internal/zze;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/internal/zze;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/internal/zzj$zza;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/zze;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method private zza(Lcom/google/android/gms/cast/internal/zze;JI)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/zze;->zzg(Lcom/google/android/gms/cast/internal/zze;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/cast/internal/zze;->zzg(Lcom/google/android/gms/cast/internal/zze;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/zza$zzb;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private zza(Lcom/google/android/gms/cast/internal/zze;I)Z
    .locals 3

    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlV()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/cast/internal/zze;->zzh(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/zze;->zzh(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/cast/internal/zze;->zzb(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/common/api/zza$zzb;)Lcom/google/android/gms/common/api/zza$zzb;

    const/4 v0, 0x1

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    monitor-exit v1

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onApplicationDisconnected(I)V
    .locals 3
    .param p1, "statusCode"    # I

    .prologue
    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/zze;->zzb(Lcom/google/android/gms/cast/internal/zze;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb;->zza(Lcom/google/android/gms/cast/internal/zze;I)Z

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzd(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->mHandler:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/cast/internal/zze$zzb$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb$1;-><init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/cast/internal/zze;

    if-nez v6, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {v6, p1}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/ApplicationMetadata;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v6, p3}, Lcom/google/android/gms/cast/internal/zze;->zzb(Lcom/google/android/gms/cast/internal/zze;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlU()Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    :try_start_0
    invoke-static {v6}, Lcom/google/android/gms/cast/internal/zze;->zzc(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v6}, Lcom/google/android/gms/cast/internal/zze;->zzc(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v8

    new-instance v0, Lcom/google/android/gms/cast/internal/zze$zza;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/internal/zze$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v8, v0}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v6, v0}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/common/api/zza$zzb;)Lcom/google/android/gms/common/api/zza$zzb;

    :cond_1
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Ljava/lang/String;DZ)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "Deprecated callback: \"onStatusreceived\""

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public zza(Ljava/lang/String;JI)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v0, p2, p3, p4}, Lcom/google/android/gms/cast/internal/zze$zzb;->zza(Lcom/google/android/gms/cast/internal/zze;JI)V

    goto :goto_0
.end method

.method public zzaM(I)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/zze$zzb;->zzlW()Lcom/google/android/gms/cast/internal/zze;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v1

    const-string v2, "ICastDeviceControllerListener.onDisconnected: %d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/zze;->zzbs(I)V

    goto :goto_0
.end method

.method public zzaN(I)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlU()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzc(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzc(Lcom/google/android/gms/cast/internal/zze;)Lcom/google/android/gms/common/api/zza$zzb;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/cast/internal/zze$zza;

    new-instance v4, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v4, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v3, v4}, Lcom/google/android/gms/cast/internal/zze$zza;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/common/api/zza$zzb;->zzm(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/common/api/zza$zzb;)Lcom/google/android/gms/common/api/zza$zzb;

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzaO(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb;->zza(Lcom/google/android/gms/cast/internal/zze;I)Z

    goto :goto_0
.end method

.method public zzaP(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb;->zza(Lcom/google/android/gms/cast/internal/zze;I)Z

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v1

    const-string v2, "onApplicationStatusChanged"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->mHandler:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/cast/internal/zze$zzb$3;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb$3;-><init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/ApplicationStatus;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v1

    const-string v2, "onDeviceStatusChanged"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->mHandler:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/cast/internal/zze$zzb$2;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/cast/internal/zze$zzb$2;-><init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/DeviceStatus;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public zzb(Ljava/lang/String;[B)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "IGNORING: Receive (type=binary, ns=%s) <%d bytes>"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    array-length v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public zzd(Ljava/lang/String;J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-direct {p0, v0, p2, p3, v1}, Lcom/google/android/gms/cast/internal/zze$zzb;->zza(Lcom/google/android/gms/cast/internal/zze;JI)V

    goto :goto_0
.end method

.method public zzlW()Lcom/google/android/gms/cast/internal/zze;
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/cast/internal/zze;->zzb(Lcom/google/android/gms/cast/internal/zze;)V

    goto :goto_0
.end method

.method public zzq(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->zzUI:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/zze;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/internal/zze;->zzlT()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v1

    const-string v2, "Receive (type=text, ns=%s) %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb;->mHandler:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/cast/internal/zze$zzb$4;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/google/android/gms/cast/internal/zze$zzb$4;-><init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
