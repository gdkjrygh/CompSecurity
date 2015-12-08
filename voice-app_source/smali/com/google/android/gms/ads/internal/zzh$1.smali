.class Lcom/google/android/gms/ads/internal/zzh$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/zzh;->zze(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzoN:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

.field final synthetic zzoO:Lcom/google/android/gms/ads/internal/zzh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzh;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoN:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzh;->zzbh()Lcom/google/android/gms/ads/internal/zzm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zza(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zzb(Lcom/google/android/gms/internal/zzcu;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zzb(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzcv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zzb(Lcom/google/android/gms/internal/zzcv;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zzc(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzkw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zza(Lcom/google/android/gms/internal/zzkw;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zzd(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/ads/internal/client/zzn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zza(Lcom/google/android/gms/ads/internal/client/zzn;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zze(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzkw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zzb(Lcom/google/android/gms/internal/zzkw;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zzf(Lcom/google/android/gms/ads/internal/zzh;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zza(Ljava/util/List;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoO:Lcom/google/android/gms/ads/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzh;->zzg(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zzb(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh$1;->zzoN:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzm;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    return-void
.end method
