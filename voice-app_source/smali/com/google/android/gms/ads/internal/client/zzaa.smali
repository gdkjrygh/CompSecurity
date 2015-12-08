.class public Lcom/google/android/gms/ads/internal/client/zzaa;
.super Ljava/lang/Object;


# static fields
.field private static final zzoW:Ljava/lang/Object;

.field private static zzta:Lcom/google/android/gms/ads/internal/client/zzaa;


# instance fields
.field private zztb:Lcom/google/android/gms/ads/internal/client/zzv;

.field private zztc:Lcom/google/android/gms/ads/reward/RewardedVideoAd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/zzaa;->zzoW:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzcP()Lcom/google/android/gms/ads/internal/client/zzaa;
    .locals 2

    sget-object v1, Lcom/google/android/gms/ads/internal/client/zzaa;->zzoW:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/ads/internal/client/zzaa;->zzta:Lcom/google/android/gms/ads/internal/client/zzaa;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/zzaa;->zzta:Lcom/google/android/gms/ads/internal/client/zzaa;

    :cond_0
    sget-object v0, Lcom/google/android/gms/ads/internal/client/zzaa;->zzta:Lcom/google/android/gms/ads/internal/client/zzaa;

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
.method public getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    sget-object v1, Lcom/google/android/gms/ads/internal/client/zzaa;->zzoW:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztc:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztc:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzee;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzee;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcF()Lcom/google/android/gms/ads/internal/reward/client/zzf;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Lcom/google/android/gms/ads/internal/reward/client/zzf;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzee;)Lcom/google/android/gms/ads/internal/reward/client/zzb;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/ads/internal/reward/client/zzi;

    invoke-direct {v2, p1, v0}, Lcom/google/android/gms/ads/internal/reward/client/zzi;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/reward/client/zzb;)V

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztc:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztc:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzab;)V
    .locals 3

    sget-object v1, Lcom/google/android/gms/ads/internal/client/zzaa;->zzoW:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztb:Lcom/google/android/gms/ads/internal/client/zzv;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Context cannot be null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "applicationCode cannot be empty."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcD()Lcom/google/android/gms/ads/internal/client/zzac;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzac;->zzt(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/zzv;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztb:Lcom/google/android/gms/ads/internal/client/zzv;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaa;->zztb:Lcom/google/android/gms/ads/internal/client/zzv;

    if-nez p3, :cond_3

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v2, p2, v0}, Lcom/google/android/gms/ads/internal/client/zzv;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :cond_3
    :try_start_4
    new-instance v0, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;

    invoke-direct {v0, p3}, Lcom/google/android/gms/ads/internal/client/MobileAdsSettingsParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zzab;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_5
    const-string v0, "Fail to initialize mobile ads setting manager"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2
.end method
