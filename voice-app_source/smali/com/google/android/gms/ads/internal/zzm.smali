.class public Lcom/google/android/gms/ads/internal/zzm;
.super Lcom/google/android/gms/ads/internal/zzb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzha;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzm$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/ads/internal/zzm$3;-><init>(Lcom/google/android/gms/ads/internal/zzm;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private zzd(Lcom/google/android/gms/internal/zzha;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzm$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzm$1;-><init>(Lcom/google/android/gms/ads/internal/zzm;Lcom/google/android/gms/internal/zzha;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private zze(Lcom/google/android/gms/internal/zzha;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzm$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzm$2;-><init>(Lcom/google/android/gms/ads/internal/zzm;Lcom/google/android/gms/internal/zzha;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public pause()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resume()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public showInterstitial()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzci;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CustomRendering is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzff;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In App Purchase is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzkw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcx;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    return-void
.end method

.method public zza(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqd:Ljava/util/List;

    return-void
.end method

.method protected zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/zzha;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->zzbp()Z

    move-result v0

    return v0
.end method

.method protected zza(Lcom/google/android/gms/internal/zzha;Lcom/google/android/gms/internal/zzha;)Z
    .locals 4

    const/4 v2, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzm;->zza(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp;->zzbM()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native ad DOES NOT have custom rendering mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzFq:Lcom/google/android/gms/ads/internal/formats/zzg$zza;

    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zze;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpY:Lcom/google/android/gms/internal/zzcv;

    if-eqz v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/ads/internal/zzm;->zze(Lcom/google/android/gms/internal/zzha;)V

    :goto_0
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/zzha;Lcom/google/android/gms/internal/zzha;)Z

    move-result v0

    :goto_1
    return v0

    :cond_1
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zzd;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpX:Lcom/google/android/gms/internal/zzcu;

    if-eqz v0, :cond_2

    invoke-direct {p0, p2}, Lcom/google/android/gms/ads/internal/zzm;->zzd(Lcom/google/android/gms/internal/zzha;)V

    goto :goto_0

    :cond_2
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/zzf;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzkw;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v1, Lcom/google/android/gms/ads/internal/formats/zzf;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/formats/zzf;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/ads/internal/zzm;->zza(Lcom/google/android/gms/internal/zzha;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v0, "No matching listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/ads/internal/zzm;->zze(I)Z

    move v0, v2

    goto :goto_1
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 1

    const-string v0, "setNativeAdOptions must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqb:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzcu;)V
    .locals 1

    const-string v0, "setOnAppInstallAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpX:Lcom/google/android/gms/internal/zzcu;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzcv;)V
    .locals 1

    const-string v0, "setOnContentAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpY:Lcom/google/android/gms/internal/zzcv;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzkw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcw;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpZ:Lcom/google/android/gms/internal/zzkw;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzha$zza;)Z
    .locals 11

    const/4 v8, 0x0

    const/4 v2, 0x0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/zzha$zza;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzha;

    move-object v1, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzha;-><init>(Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzea;Lcom/google/android/gms/ads/internal/formats/zzg$zza;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzm;->zzb(Lcom/google/android/gms/internal/zzha;)V

    move v0, v8

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput v8, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbu()Lcom/google/android/gms/internal/zzft;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v7, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpI:Lcom/google/android/gms/internal/zzan;

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/zzm;->zzoq:Lcom/google/android/gms/internal/zzef;

    move-object v5, p0

    move-object v6, p1

    move-object v8, v2

    move-object v10, p0

    invoke-virtual/range {v3 .. v10}, Lcom/google/android/gms/internal/zzft;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzan;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzft$zza;)Lcom/google/android/gms/internal/zzhh;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpM:Lcom/google/android/gms/internal/zzhh;

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public zzbo()Lcom/google/android/gms/internal/zzkw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcx;",
            ">;"
        }
    .end annotation

    const-string v0, "getOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    return-object v0
.end method

.method public zzq(Ljava/lang/String;)Lcom/google/android/gms/internal/zzcw;
    .locals 1

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzm;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpZ:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzkw;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzcw;

    return-object v0
.end method
