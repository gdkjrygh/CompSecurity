.class Lcom/google/android/gms/common/api/zze$zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "zzd"
.end annotation


# instance fields
.field final synthetic zzXd:Lcom/google/android/gms/common/api/zze;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/zze;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/api/zze$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/zze$zzd;-><init>(Lcom/google/android/gms/common/api/zze;)V

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zzc(Lcom/google/android/gms/common/api/zze;)Lcom/google/android/gms/internal/zzps;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/zze$zzb;

    iget-object v2, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/zze$zzb;-><init>(Lcom/google/android/gms/common/api/zze;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzps;->zza(Lcom/google/android/gms/common/internal/zzq;)V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zza(Lcom/google/android/gms/common/api/zze;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/zze;->zzb(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zzd(Lcom/google/android/gms/common/api/zze;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zze(Lcom/google/android/gms/common/api/zze;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0}, Lcom/google/android/gms/common/api/zze;->zza(Lcom/google/android/gms/common/api/zze;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/zze;->zza(Lcom/google/android/gms/common/api/zze;Lcom/google/android/gms/common/ConnectionResult;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/zze$zzd;->zzXd:Lcom/google/android/gms/common/api/zze;

    invoke-static {v1}, Lcom/google/android/gms/common/api/zze;->zza(Lcom/google/android/gms/common/api/zze;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public onConnectionSuspended(I)V
    .locals 0
    .param p1, "cause"    # I

    .prologue
    return-void
.end method
