.class public Lcom/google/android/gms/analytics/zza;
.super Lcom/google/android/gms/internal/zznr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zznr",
        "<",
        "Lcom/google/android/gms/analytics/zza;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzIa:Lcom/google/android/gms/analytics/internal/zzf;

.field private zzIb:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/internal/zzf;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/zzf;->zzhS()Lcom/google/android/gms/internal/zzns;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/zzf;->zzhP()Lcom/google/android/gms/internal/zzlb;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zznr;-><init>(Lcom/google/android/gms/internal/zzns;Lcom/google/android/gms/internal/zzlb;)V

    iput-object p1, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    return-void
.end method


# virtual methods
.method public enableAdvertisingIdCollection(Z)V
    .locals 0
    .param p1, "enable"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/analytics/zza;->zzIb:Z

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzno;)V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/zzip;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzno;->zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/zznq;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzip;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzip;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzf;->zzih()Lcom/google/android/gms/analytics/internal/zzn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzn;->zziP()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzip;->setClientId(Ljava/lang/String;)V

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/analytics/zza;->zzIb:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzip;->zzhx()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzf;->zzig()Lcom/google/android/gms/analytics/internal/zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zza;->zzhC()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzip;->zzaO(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zza;->zzhy()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzip;->zzE(Z)V

    :cond_1
    return-void
.end method

.method public zzaI(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzcj(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/zza;->zzaJ(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/zza;->zzwb()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/zzb;

    iget-object v2, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/analytics/zzb;-><init>(Lcom/google/android/gms/analytics/internal/zzf;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zzaJ(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/analytics/zzb;->zzaK(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/zza;->zzwb()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zznu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zznu;->zzhe()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method zzhb()Lcom/google/android/gms/analytics/internal/zzf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    return-object v0
.end method

.method public zzhc()Lcom/google/android/gms/internal/zzno;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/zza;->zzwa()Lcom/google/android/gms/internal/zzno;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzno;->zzvP()Lcom/google/android/gms/internal/zzno;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzf;->zzhX()Lcom/google/android/gms/analytics/internal/zzk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzk;->zzix()Lcom/google/android/gms/internal/zznx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzno;->zzb(Lcom/google/android/gms/internal/zznq;)V

    iget-object v1, p0, Lcom/google/android/gms/analytics/zza;->zzIa:Lcom/google/android/gms/analytics/internal/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzf;->zzhY()Lcom/google/android/gms/analytics/internal/zzu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/zzu;->zzjE()Lcom/google/android/gms/internal/zznz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzno;->zzb(Lcom/google/android/gms/internal/zznq;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/zza;->zzd(Lcom/google/android/gms/internal/zzno;)V

    return-object v0
.end method
