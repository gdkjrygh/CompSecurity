.class Lcom/google/android/gms/ads/internal/request/zzb$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/request/zzb;->zzdP()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzCg:Lcom/google/android/gms/ads/internal/request/zzb;

.field final synthetic zzCh:Lcom/google/android/gms/internal/zzha$zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzb;Lcom/google/android/gms/internal/zzha$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzb$2;->zzCg:Lcom/google/android/gms/ads/internal/request/zzb;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/zzb$2;->zzCh:Lcom/google/android/gms/internal/zzha$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb$2;->zzCg:Lcom/google/android/gms/ads/internal/request/zzb;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/request/zzb;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzb$2;->zzCg:Lcom/google/android/gms/ads/internal/request/zzb;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzb;->zza(Lcom/google/android/gms/ads/internal/request/zzb;)Lcom/google/android/gms/ads/internal/request/zza$zza;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzb$2;->zzCh:Lcom/google/android/gms/internal/zzha$zza;

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/request/zza$zza;->zza(Lcom/google/android/gms/internal/zzha$zza;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
