.class public Lcom/google/android/gms/internal/zzdp;
.super Lcom/google/android/gms/internal/zzhh;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field final zzoA:Lcom/google/android/gms/internal/zzid;

.field final zzwB:Lcom/google/android/gms/internal/zzdr;

.field private final zzwC:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzid;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzhh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdp;->zzoA:Lcom/google/android/gms/internal/zzid;

    new-instance v0, Lcom/google/android/gms/internal/zzdr;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzdr;-><init>(Lcom/google/android/gms/internal/zzid;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdp;->zzwB:Lcom/google/android/gms/internal/zzdr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdp;->zzwC:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbH()Lcom/google/android/gms/internal/zzdq;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/zzdq;->zza(Lcom/google/android/gms/internal/zzdp;)V

    return-void
.end method


# virtual methods
.method public onStop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdp;->zzwB:Lcom/google/android/gms/internal/zzdr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdr;->abort()V

    return-void
.end method

.method public zzdP()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdp;->zzwB:Lcom/google/android/gms/internal/zzdr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdp;->zzwC:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzdr;->zzW(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/zzdp$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzdp$1;-><init>(Lcom/google/android/gms/internal/zzdp;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/zzdp$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zzdp$1;-><init>(Lcom/google/android/gms/internal/zzdp;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
