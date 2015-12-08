.class public Lcom/google/android/gms/playlog/internal/zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# instance fields
.field private zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

.field private final zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

.field private zzaGO:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzoz$zza;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/playlog/internal/zzf;->zzak(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzoz$zza;->zzxl()V

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/playlog/internal/zzf;->zzak(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getResolution()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzoz$zza;->zzf(Landroid/app/PendingIntent;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGN:Lcom/google/android/gms/internal/zzoz$zza;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzoz$zza;->zzxm()V

    goto :goto_0
.end method

.method public onConnectionSuspended(I)V
    .locals 2
    .param p1, "cause"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/playlog/internal/zzf;->zzak(Z)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/playlog/internal/zzf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGD:Lcom/google/android/gms/playlog/internal/zzf;

    return-void
.end method

.method public zzaj(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/playlog/internal/zzd;->zzaGO:Z

    return-void
.end method
