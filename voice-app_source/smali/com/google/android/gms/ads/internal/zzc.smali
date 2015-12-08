.class public abstract Lcom/google/android/gms/ads/internal/zzc;
.super Lcom/google/android/gms/ads/internal/zzb;

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzf;
.implements Lcom/google/android/gms/internal/zzev;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    return-void
.end method


# virtual methods
.method public recordClick()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->onAdClicked()V

    return-void
.end method

.method public recordImpression()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzc;->zza(Lcom/google/android/gms/internal/zzha;Z)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/zzid;
    .locals 14

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp$zza;->getNextView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzid;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/zzid;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzid;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    :cond_0
    :goto_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v4

    const/4 v11, 0x0

    move-object v5, p0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p0

    move v9, v3

    move-object v10, p0

    move-object v12, p1

    move-object v13, p0

    invoke-virtual/range {v4 .. v13}, Lcom/google/android/gms/internal/zzie;->zzb(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzf;Lcom/google/android/gms/internal/zzde;Lcom/google/android/gms/ads/internal/overlay/zzk;ZLcom/google/android/gms/internal/zzdi;Lcom/google/android/gms/internal/zzdk;Lcom/google/android/gms/ads/internal/zzd;Lcom/google/android/gms/internal/zzev;)V

    return-object v0

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzp$zza;->removeView(Landroid/view/View;)V

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbw()Lcom/google/android/gms/internal/zzif;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpI:Lcom/google/android/gms/internal/zzan;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move v4, v3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzif;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/zzan;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/zzid;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzso:[Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/internal/zzc;->zzb(Landroid/view/View;)V

    goto :goto_0
.end method

.method public zza(IIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->zzaS()Z

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzci;)V
    .locals 1

    const-string v0, "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqc:Lcom/google/android/gms/internal/zzci;

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzha;Lcom/google/android/gms/internal/zzha;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp;->zzbM()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp$zza;->zzbP()Lcom/google/android/gms/internal/zzhn;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzCP:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhn;->zzaw(Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/zzha;Lcom/google/android/gms/internal/zzha;)Z

    move-result v0

    return v0
.end method

.method protected zzb(Lcom/google/android/gms/internal/zzha$zza;)Z
    .locals 11

    const/4 v0, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/zzd;

    invoke-direct {v1}, Lcom/google/android/gms/ads/internal/zzd;-><init>()V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/internal/zzc;->zza(Lcom/google/android/gms/ads/internal/zzd;)Lcom/google/android/gms/internal/zzid;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/ads/internal/zzd$zzb;

    invoke-direct {v4, p1, v2}, Lcom/google/android/gms/ads/internal/zzd$zzb;-><init>(Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;)V

    invoke-virtual {v1, v4}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/ads/internal/zzd$zza;)V

    new-instance v4, Lcom/google/android/gms/ads/internal/zzc$1;

    invoke-direct {v4, p0, v1}, Lcom/google/android/gms/ads/internal/zzc$1;-><init>(Lcom/google/android/gms/ads/internal/zzc;Lcom/google/android/gms/ads/internal/zzd;)V

    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/zzid;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v4, Lcom/google/android/gms/ads/internal/zzc$2;

    invoke-direct {v4, p0, v1}, Lcom/google/android/gms/ads/internal/zzc$2;-><init>(Lcom/google/android/gms/ads/internal/zzc;Lcom/google/android/gms/ads/internal/zzd;)V

    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/zzid;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, p1, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object v4, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    :cond_0
    iget v1, p1, Lcom/google/android/gms/internal/zzha$zza;->errorCode:I

    const/4 v4, -0x2

    if-eq v1, v4, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzha;

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzha;-><init>(Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzea;Lcom/google/android/gms/ads/internal/formats/zzg$zza;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzc;->zzb(Lcom/google/android/gms/internal/zzha;)V

    move v0, v8

    :goto_0
    return v0

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCK:Z

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCT:Z

    if-eqz v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzG:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzG:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/zzhl;->zzat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/zzcf;

    iget-object v4, p1, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCI:Ljava/lang/String;

    invoke-direct {v1, p0, v3, v4}, Lcom/google/android/gms/internal/zzcf;-><init>(Lcom/google/android/gms/ads/internal/zzf;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzqc:Lcom/google/android/gms/internal/zzci;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    const/4 v4, 0x1

    iput v4, v3, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzqc:Lcom/google/android/gms/internal/zzci;

    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/zzci;->zza(Lcom/google/android/gms/internal/zzch;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v8

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v3, "Could not call the onCustomRenderedAdLoadedListener."

    invoke-static {v3, v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput v8, v1, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbu()Lcom/google/android/gms/internal/zzft;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v7, v5, Lcom/google/android/gms/ads/internal/zzp;->zzpI:Lcom/google/android/gms/internal/zzan;

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/zzc;->zzoq:Lcom/google/android/gms/internal/zzef;

    move-object v5, p0

    move-object v6, p1

    move-object v8, v2

    move-object v10, p0

    invoke-virtual/range {v3 .. v10}, Lcom/google/android/gms/internal/zzft;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzan;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzft$zza;)Lcom/google/android/gms/internal/zzhh;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpM:Lcom/google/android/gms/internal/zzhh;

    goto :goto_0
.end method

.method public zzbc()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzc;->zzaQ()Z

    return-void
.end method

.method public zzc(Landroid/view/View;)V
    .locals 8

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqg:Landroid/view/View;

    new-instance v0, Lcom/google/android/gms/internal/zzha;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzc;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpP:Lcom/google/android/gms/internal/zzha$zza;

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/zzha;-><init>(Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzea;Lcom/google/android/gms/ads/internal/formats/zzg$zza;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzc;->zzb(Lcom/google/android/gms/internal/zzha;)V

    return-void
.end method
