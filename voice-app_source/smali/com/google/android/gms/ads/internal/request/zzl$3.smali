.class Lcom/google/android/gms/ads/internal/request/zzl$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/request/zzl;->onStop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzDm:Lcom/google/android/gms/ads/internal/request/zzl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/request/zzl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzl$3;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$3;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zzb(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/internal/zzdt$zzd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$3;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zzb(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/internal/zzdt$zzd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdt$zzd;->release()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl$3;->zzDm:Lcom/google/android/gms/ads/internal/request/zzl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/request/zzl;->zza(Lcom/google/android/gms/ads/internal/request/zzl;Lcom/google/android/gms/internal/zzdt$zzd;)Lcom/google/android/gms/internal/zzdt$zzd;

    :cond_0
    return-void
.end method
