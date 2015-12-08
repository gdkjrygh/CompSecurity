.class Lcom/google/android/gms/ads/internal/request/zzl$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/request/zzl;->zzdP()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzCh:Lcom/google/android/gms/internal/zzha$zza;

.field final synthetic zzDm:Lcom/google/android/gms/ads/internal/request/zzl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzl;Lcom/google/android/gms/internal/zzha$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzCh:Lcom/google/android/gms/internal/zzha$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zza(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/ads/internal/request/zza$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzCh:Lcom/google/android/gms/internal/zzha$zza;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/request/zza$zza;->zza(Lcom/google/android/gms/internal/zzha$zza;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zzb(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/internal/zzdt$zzd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zzb(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/internal/zzdt$zzd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zzd;->release()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$1;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/request/zzl;->zza(Lcom/google/android/gms/ads/internal/request/zzl;Lcom/google/android/gms/internal/zzdt$zzd;)Lcom/google/android/gms/internal/zzdt$zzd;

    :cond_0
    return-void
.end method
