.class public final Lcom/google/android/gms/internal/zzcf;
.super Lcom/google/android/gms/internal/zzch$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzuS:Lcom/google/android/gms/ads/internal/zzf;

.field private final zzuT:Ljava/lang/String;

.field private final zzuU:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzf;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzch$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzcf;->zzuS:Lcom/google/android/gms/ads/internal/zzf;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzcf;->zzuT:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzcf;->zzuU:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcf;->zzuU:Ljava/lang/String;

    return-object v0
.end method

.method public recordClick()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcf;->zzuS:Lcom/google/android/gms/ads/internal/zzf;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/zzf;->recordClick()V

    return-void
.end method

.method public recordImpression()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcf;->zzuS:Lcom/google/android/gms/ads/internal/zzf;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/zzf;->recordImpression()V

    return-void
.end method

.method public zza(Lcom/google/android/gms/dynamic/zzd;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzcf;->zzuS:Lcom/google/android/gms/ads/internal/zzf;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzn(Lcom/google/android/gms/dynamic/zzd;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/zzf;->zzc(Landroid/view/View;)V

    goto :goto_0
.end method

.method public zzdt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzcf;->zzuT:Ljava/lang/String;

    return-object v0
.end method
