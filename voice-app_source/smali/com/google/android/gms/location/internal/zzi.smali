.class public Lcom/google/android/gms/location/internal/zzi;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/internal/zzi$zzb;,
        Lcom/google/android/gms/location/internal/zzi$zza;,
        Lcom/google/android/gms/location/internal/zzi$zzc;
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private zzakE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/location/LocationListener;",
            "Lcom/google/android/gms/location/internal/zzi$zzc;",
            ">;"
        }
    .end annotation
.end field

.field private zzayL:Landroid/content/ContentProviderClient;

.field private zzayM:Z

.field private zzayN:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/location/LocationCallback;",
            "Lcom/google/android/gms/location/internal/zzi$zza;",
            ">;"
        }
    .end annotation
.end field

.field private final zzayq:Lcom/google/android/gms/location/internal/zzn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/location/internal/zzn",
            "<",
            "Lcom/google/android/gms/location/internal/zzg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/location/internal/zzn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/location/internal/zzn",
            "<",
            "Lcom/google/android/gms/location/internal/zzg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayL:Landroid/content/ContentProviderClient;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayM:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzi;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    return-void
.end method

.method private zza(Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)Lcom/google/android/gms/location/internal/zzi$zza;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zza;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/location/internal/zzi$zza;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/location/internal/zzi$zza;-><init>(Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private zza(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/location/internal/zzi$zzc;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zzc;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/location/internal/zzi$zzc;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/location/internal/zzi$zzc;-><init>(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public getLastLocation()Landroid/location/Location;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zzdl(Ljava/lang/String;)Landroid/location/Location;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public removeAllListeners()V
    .locals 4

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zzc;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v1}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzb(Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zza;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v1}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zza(Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void
.end method

.method public zza(Lcom/google/android/gms/location/LocationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    const-string v0, "Invalid null callback"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayN:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zza;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi$zza;->release()V

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v1}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zza(Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    :cond_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Lcom/google/android/gms/location/LocationListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    const-string v0, "Invalid null listener"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzi$zzc;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayL:Landroid/content/ContentProviderClient;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzakE:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayL:Landroid/content/ContentProviderClient;

    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->release()Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayL:Landroid/content/ContentProviderClient;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi$zzc;->release()V

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v1}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {v0}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzb(Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    :cond_1
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/location/internal/zzi$zzc;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {p1}, Lcom/google/android/gms/location/internal/LocationRequestInternal;->zzb(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/internal/LocationRequestInternal;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzb(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/zzd;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)Lcom/google/android/gms/location/internal/zzi$zza;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {p1, v1}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zza(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/zzc;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    return-void
.end method

.method public zzac(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/location/internal/zzg;->zzac(Z)V

    iput-boolean p1, p0, Lcom/google/android/gms/location/internal/zzi;->zzayM:Z

    return-void
.end method

.method public zzb(Landroid/location/Location;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/location/internal/zzg;->zzb(Landroid/location/Location;)V

    return-void
.end method

.method public zzb(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {p1}, Lcom/google/android/gms/location/internal/LocationRequestInternal;->zzb(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/internal/LocationRequestInternal;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zzb(Lcom/google/android/gms/location/internal/LocationRequestInternal;Landroid/app/PendingIntent;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    return-void
.end method

.method public zzd(Landroid/app/PendingIntent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-static {p1}, Lcom/google/android/gms/location/internal/LocationRequestUpdateData;->zze(Landroid/app/PendingIntent;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/internal/LocationRequestUpdateData;)V

    return-void
.end method

.method public zzuw()Lcom/google/android/gms/location/LocationAvailability;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznL()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/location/internal/zzn;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzi;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/location/internal/zzg;->zzdm(Ljava/lang/String;)Lcom/google/android/gms/location/LocationAvailability;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public zzux()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/location/internal/zzi;->zzayM:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/zzi;->zzac(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
