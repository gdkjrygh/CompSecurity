.class Lcom/google/android/gms/ads/internal/zzm$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/zzm;->zza(Lcom/google/android/gms/internal/zzha;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzpd:Lcom/google/android/gms/internal/zzha;

.field final synthetic zzpe:Lcom/google/android/gms/ads/internal/zzm;

.field final synthetic zzpf:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzm;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpe:Lcom/google/android/gms/ads/internal/zzm;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpf:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpd:Lcom/google/android/gms/internal/zzha;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpe:Lcom/google/android/gms/ads/internal/zzm;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpf:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzkw;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzcx;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzm$3;->zzpd:Lcom/google/android/gms/internal/zzha;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzha;->zzFq:Lcom/google/android/gms/ads/internal/formats/zzg$zza;

    check-cast v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzcx;->zza(Lcom/google/android/gms/internal/zzcs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
