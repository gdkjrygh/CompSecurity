.class public Lcom/google/android/gms/location/internal/zzj;
.super Lcom/google/android/gms/location/internal/zzb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/internal/zzj$zzc;,
        Lcom/google/android/gms/location/internal/zzj$zza;,
        Lcom/google/android/gms/location/internal/zzj$zzd;,
        Lcom/google/android/gms/location/internal/zzj$zzb;
    }
.end annotation


# instance fields
.field private final zzayR:Lcom/google/android/gms/location/internal/zzi;

.field private final zzayS:Lcom/google/android/gms/location/copresence/internal/zzb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 7

    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->zzmx()Lcom/google/android/gms/common/internal/zze;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/zzj;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;)V
    .locals 8

    sget-object v7, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->zzayn:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/location/internal/zzj;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)V
    .locals 3

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/location/internal/zzb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;)V

    new-instance v0, Lcom/google/android/gms/location/internal/zzi;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/location/internal/zzi;-><init>(Landroid/content/Context;Lcom/google/android/gms/location/internal/zzn;)V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {p6}, Lcom/google/android/gms/common/internal/zze;->getAccountName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6}, Lcom/google/android/gms/common/internal/zze;->zzny()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzj;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    invoke-static {p1, v0, v1, v2, p7}, Lcom/google/android/gms/location/copresence/internal/zzb;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/location/internal/zzn;Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;)Lcom/google/android/gms/location/copresence/internal/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayS:Lcom/google/android/gms/location/copresence/internal/zzb;

    return-void
.end method


# virtual methods
.method public disconnect()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->isConnected()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi;->removeAllListeners()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi;->zzux()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    invoke-super {p0}, Lcom/google/android/gms/location/internal/zzb;->disconnect()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public requiresAccount()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zza(JLandroid/app/PendingIntent;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "detectionIntervalMillis must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/location/internal/zzg;->zza(JZLandroid/app/PendingIntent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/location/internal/zzg;->zza(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public zza(Landroid/app/PendingIntent;Lcom/google/android/gms/location/zze$zzb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/location/internal/zzg;->zza(Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/zzf;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/internal/zzj$zzb;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/location/internal/zzj$zzb;-><init>(Lcom/google/android/gms/location/zze$zzb;Lcom/google/android/gms/location/internal/zzj;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/zze$zza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    const-string v0, "geofencingRequest can\'t be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnAddGeofencesResultListener not provided."

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/zzf;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/internal/zzj$zzb;

    invoke-direct {v0, p3, p0}, Lcom/google/android/gms/location/internal/zzj$zzb;-><init>(Lcom/google/android/gms/location/zze$zza;Lcom/google/android/gms/location/internal/zzj;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/location/LocationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/LocationCallback;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/LocationListener;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Lcom/google/android/gms/location/LocationSettingsRequest;Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationSettingsRequest;",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/location/LocationSettingsResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "locationSettingsRequest can\'t be null nor empty."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "listener can\'t be null."

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/location/internal/zzj$zzd;

    invoke-direct {v1, p2}, Lcom/google/android/gms/location/internal/zzj$zzd;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/zzg;

    invoke-interface {v0, p1, v1, p3}, Lcom/google/android/gms/location/internal/zzg;->zza(Lcom/google/android/gms/location/LocationSettingsRequest;Lcom/google/android/gms/location/internal/zzh;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/location/internal/zzi;->zza(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/LocationCallback;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Ljava/util/List;Lcom/google/android/gms/location/zze$zzb;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/location/zze$zzb;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznL()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/zzu;->zzb(ZLjava/lang/Object;)V

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/zzu;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    if-nez p2, :cond_1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->zznM()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/zzg;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzj;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/location/internal/zzg;->zza([Ljava/lang/String;Lcom/google/android/gms/location/internal/zzf;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/location/internal/zzj$zzb;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/location/internal/zzj$zzb;-><init>(Lcom/google/android/gms/location/zze$zzb;Lcom/google/android/gms/location/internal/zzj;)V

    move-object v2, v1

    goto :goto_1
.end method

.method public zzac(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/zzi;->zzac(Z)V

    return-void
.end method

.method public zzb(Landroid/location/Location;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/zzi;->zzb(Landroid/location/Location;)V

    return-void
.end method

.method public zzb(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/internal/zzi;->zzb(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public zzd(Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/zzi;->zzd(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public zzuw()Lcom/google/android/gms/location/LocationAvailability;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zzj;->zzayR:Lcom/google/android/gms/location/internal/zzi;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/zzi;->zzuw()Lcom/google/android/gms/location/LocationAvailability;

    move-result-object v0

    return-object v0
.end method
