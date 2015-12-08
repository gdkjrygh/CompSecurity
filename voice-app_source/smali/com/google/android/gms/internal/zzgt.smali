.class public Lcom/google/android/gms/internal/zzgt;
.super Lcom/google/android/gms/ads/internal/reward/mediation/client/zza$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private zzEW:Lcom/google/android/gms/internal/zzgu;

.field private zzFc:Lcom/google/android/gms/internal/zzgr;

.field private zzFd:Lcom/google/android/gms/internal/zzgs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzgs;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/reward/mediation/client/zza$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzgs;->zza(Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V

    :cond_0
    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzgr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgt;->zzFc:Lcom/google/android/gms/internal/zzgr;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzgu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgt;->zzEW:Lcom/google/android/gms/internal/zzgu;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/dynamic/zzd;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFc:Lcom/google/android/gms/internal/zzgr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFc:Lcom/google/android/gms/internal/zzgr;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzgr;->zzI(I)V

    :cond_0
    return-void
.end method

.method public zzc(Lcom/google/android/gms/dynamic/zzd;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzEW:Lcom/google/android/gms/internal/zzgu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzEW:Lcom/google/android/gms/internal/zzgu;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzn(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/zzgu;->zzb(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public zze(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFc:Lcom/google/android/gms/internal/zzgr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFc:Lcom/google/android/gms/internal/zzgr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgr;->zzfO()V

    :cond_0
    return-void
.end method

.method public zzf(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzEW:Lcom/google/android/gms/internal/zzgu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzEW:Lcom/google/android/gms/internal/zzgu;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzn(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzgu;->zzap(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public zzg(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgs;->onRewardedVideoAdOpened()V

    :cond_0
    return-void
.end method

.method public zzh(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgs;->onRewardedVideoStarted()V

    :cond_0
    return-void
.end method

.method public zzi(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgs;->onRewardedVideoAdClosed()V

    :cond_0
    return-void
.end method

.method public zzj(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgs;->zzfL()V

    :cond_0
    return-void
.end method

.method public zzk(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgt;->zzFd:Lcom/google/android/gms/internal/zzgs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzgs;->onRewardedVideoAdLeftApplication()V

    :cond_0
    return-void
.end method
