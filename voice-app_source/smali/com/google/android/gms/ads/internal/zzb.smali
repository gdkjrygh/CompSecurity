.class public abstract Lcom/google/android/gms/ads/internal/zzb;
.super Lcom/google/android/gms/ads/internal/zza;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzf;
.implements Lcom/google/android/gms/ads/internal/purchase/zzj;
.implements Lcom/google/android/gms/internal/zzdi;
.implements Lcom/google/android/gms/internal/zzdz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final mMessenger:Landroid/os/Messenger;

.field protected final zzoq:Lcom/google/android/gms/internal/zzef;

.field protected transient zzor:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/internal/zzp;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/ads/internal/zzp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, p4, v1}, Lcom/google/android/gms/ads/internal/zzb;-><init>(Lcom/google/android/gms/ads/internal/zzp;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/zzn;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/ads/internal/zzp;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/zzn;)V
    .locals 3

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/ads/internal/zza;-><init>(Lcom/google/android/gms/ads/internal/zzp;Lcom/google/android/gms/ads/internal/zzn;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzoq:Lcom/google/android/gms/internal/zzef;

    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/google/android/gms/internal/zzfc;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzfc;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->mMessenger:Landroid/os/Messenger;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzor:Z

    return-void
.end method

.method private zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Landroid/os/Bundle;)Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;
    .locals 30

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzp$zza;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v2, 0x2

    new-array v2, v2, [I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/internal/zzp$zza;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    aget v5, v2, v3

    const/4 v3, 0x1

    aget v6, v2, v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzp$zza;->getWidth()I

    move-result v9

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzp$zza;->getHeight()I

    move-result v10

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/zzp$zza;->isShown()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int v3, v5, v9

    if-lez v3, :cond_0

    add-int v3, v6, v10

    if-lez v3, :cond_0

    iget v3, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    if-gt v5, v3, :cond_0

    iget v3, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    if-gt v6, v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    new-instance v3, Landroid/os/Bundle;

    const/4 v11, 0x5

    invoke-direct {v3, v11}, Landroid/os/Bundle;-><init>(I)V

    const-string v11, "x"

    invoke-virtual {v3, v11, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "y"

    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "width"

    invoke-virtual {v3, v5, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "height"

    invoke-virtual {v3, v5, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v5, "visible"

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzhc;->zzfW()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    new-instance v5, Lcom/google/android/gms/internal/zzhb;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    invoke-direct {v5, v9, v6}, Lcom/google/android/gms/internal/zzhb;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzhb;->zzh(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v10, v10, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-virtual {v2, v5, v6, v10}, Lcom/google/android/gms/internal/zzhl;->zza(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/zzl;->zzq(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/zzl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzl;->zzbn()I

    move-result v23

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/zzl;->zzq(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/zzl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzl;->zzbl()Z

    move-result v22

    const-wide/16 v24, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpU:Lcom/google/android/gms/ads/internal/client/zzu;

    if-eqz v2, :cond_2

    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpU:Lcom/google/android/gms/ads/internal/client/zzu;

    invoke-interface {v2}, Lcom/google/android/gms/ads/internal/client/zzu;->getValue()J
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v24

    :cond_2
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    move-object/from16 v0, p0

    invoke-virtual {v2, v5, v0, v9}, Lcom/google/android/gms/internal/zzhc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzhe;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzkw;->size()I

    move-result v5

    if-ge v2, v5, :cond_3

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/zzkw;->keyAt(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v14, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :catch_0
    move-exception v2

    const/4 v8, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v2

    const-string v2, "Cannot get correlation id, default to 0."

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance v2, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/zzhc;->getSessionId()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v11, v11, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v13, v13, Lcom/google/android/gms/ads/internal/zzp;->zzqd:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/android/gms/internal/zzhc;->zzga()Z

    move-result v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzb;->mMessenger:Landroid/os/Messenger;

    move-object/from16 v17, v0

    iget v0, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v18, v0

    iget v0, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    move/from16 v19, v0

    iget v0, v4, Landroid/util/DisplayMetrics;->density:F

    move/from16 v20, v0

    invoke-static {}, Lcom/google/android/gms/internal/zzbz;->zzdb()Ljava/util/List;

    move-result-object v27

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpF:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v4, Lcom/google/android/gms/ads/internal/zzp;->zzqb:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    move-object/from16 v29, v0

    move-object/from16 v4, p1

    move-object/from16 v15, p2

    invoke-direct/range {v2 .. v29}, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;ZIJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V

    return-object v2
.end method


# virtual methods
.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzyb:Ljava/lang/String;

    goto :goto_0
.end method

.method public onAdClicked()V
    .locals 8

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-nez v0, :cond_0

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdy;->zzxF:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbG()Lcom/google/android/gms/internal/zzed;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzdy;->zzxF:Ljava/util/List;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v7, v7, Lcom/google/android/gms/internal/zzha;->zzCC:Ljava/lang/String;

    invoke-virtual {p0, v6, v7}, Lcom/google/android/gms/ads/internal/zzb;->zza(Ljava/util/List;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;Ljava/lang/String;ZLjava/util/List;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdx;->zzxx:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbG()Lcom/google/android/gms/internal/zzed;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    iget-object v6, v6, Lcom/google/android/gms/internal/zzdx;->zzxx:Ljava/util/List;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;Ljava/lang/String;ZLjava/util/List;)V

    :cond_2
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zza;->onAdClicked()V

    goto :goto_0
.end method

.method public pause()V
    .locals 2

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp;->zzbM()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbx()Lcom/google/android/gms/internal/zzhm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhm;->zza(Landroid/webkit/WebView;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzeg;->pause()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzop:Lcom/google/android/gms/internal/zzay;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzay;->zzi(Lcom/google/android/gms/internal/zzha;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->pause()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not pause mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public resume()V
    .locals 2

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp;->zzbM()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbx()Lcom/google/android/gms/internal/zzhm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzid;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhm;->zzb(Landroid/webkit/WebView;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzeg;->resume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->resume()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzop:Lcom/google/android/gms/internal/zzay;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzay;->zzj(Lcom/google/android/gms/internal/zzha;)V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not resume mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "showInterstitial is not supported for current ad type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzff;)V
    .locals 1

    const-string v0, "setInAppPurchaseListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpV:Lcom/google/android/gms/internal/zzff;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzfj;Ljava/lang/String;)V
    .locals 4

    const-string v0, "setPlayStorePurchaseParams must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzu;->zzbY(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    new-instance v1, Lcom/google/android/gms/ads/internal/purchase/zzk;

    invoke-direct {v1, p2}, Lcom/google/android/gms/ads/internal/purchase/zzk;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqe:Lcom/google/android/gms/ads/internal/purchase/zzk;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhc;->zzfZ()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/zzc;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzqe:Lcom/google/android/gms/ads/internal/purchase/zzk;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/purchase/zzc;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzfj;Lcom/google/android/gms/ads/internal/purchase/zzk;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/purchase/zzc;->zzgi()Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzha;Z)V
    .locals 7

    if-nez p1, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzc(Lcom/google/android/gms/internal/zzha;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdy;->zzxG:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbG()Lcom/google/android/gms/internal/zzed;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzdy;->zzxG:Ljava/util/List;

    iget-object v5, p1, Lcom/google/android/gms/internal/zzha;->zzCC:Ljava/lang/String;

    invoke-virtual {p0, v3, v5}, Lcom/google/android/gms/ads/internal/zzb;->zza(Ljava/util/List;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;Ljava/lang/String;ZLjava/util/List;)V

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdx;->zzxy:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbG()Lcom/google/android/gms/internal/zzed;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzha;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    iget-object v6, v3, Lcom/google/android/gms/internal/zzdx;->zzxy:Ljava/util/List;

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method

.method public zza(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/zzd;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/ads/internal/purchase/zzd;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpV:Lcom/google/android/gms/internal/zzff;

    if-nez v1, :cond_5

    const-string v1, "InAppPurchaseListener is not set. Try to launch default purchase flow."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzP(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "Google Play Service unavailable, cannot launch default purchase flow."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    if-nez v1, :cond_1

    const-string v0, "PlayStorePurchaseListener is not set."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzqe:Lcom/google/android/gms/ads/internal/purchase/zzk;

    if-nez v1, :cond_2

    const-string v0, "PlayStorePurchaseVerifier is not initialized."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzqi:Z

    if-eqz v1, :cond_3

    const-string v0, "An in-app purchase request is already in progress, abort"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/ads/internal/zzp;->zzqi:Z

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzfj;->isValidPurchase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqi:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput-boolean v3, v0, Lcom/google/android/gms/ads/internal/zzp;->zzqi:Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbF()Lcom/google/android/gms/ads/internal/purchase/zzi;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGJ:Z

    new-instance v4, Lcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/zzp;->zzqe:Lcom/google/android/gms/ads/internal/purchase/zzk;

    invoke-direct {v4, v5, v6, v0, p0}, Lcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/purchase/zzk;Lcom/google/android/gms/internal/zzfe;Lcom/google/android/gms/ads/internal/purchase/zzj;)V

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/ads/internal/purchase/zzi;->zza(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;)V

    goto :goto_0

    :cond_5
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpV:Lcom/google/android/gms/internal/zzff;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzff;->zza(Lcom/google/android/gms/internal/zzfe;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zza(Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/ads/internal/purchase/zzf;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v7, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/zzg;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/purchase/zzg;-><init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/ads/internal/purchase/zzf;)V

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/zzfj;->zza(Lcom/google/android/gms/internal/zzfi;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzb$1;

    invoke-direct {v1, p0, p4}, Lcom/google/android/gms/ads/internal/zzb$1;-><init>(Lcom/google/android/gms/ads/internal/zzb;Landroid/content/Intent;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Fail to invoke PlayStorePurchaseListener."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/zzha;Z)Z
    .locals 4

    const-wide/16 v2, 0x0

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp;->zzbM()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p2, Lcom/google/android/gms/internal/zzha;->zzxJ:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    iget-wide v2, p2, Lcom/google/android/gms/internal/zzha;->zzxJ:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/ads/internal/zzn;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;J)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->zzbp()Z

    move-result v0

    return v0

    :cond_1
    iget-object v0, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-wide v0, v0, Lcom/google/android/gms/internal/zzdy;->zzxJ:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-wide v2, v1, Lcom/google/android/gms/internal/zzdy;->zzxJ:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/ads/internal/zzn;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;J)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p2, Lcom/google/android/gms/internal/zzha;->zzCK:Z

    if-nez v0, :cond_0

    iget v0, p2, Lcom/google/android/gms/internal/zzha;->errorCode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zzn;->zzf(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    goto :goto_0
.end method

.method zza(Lcom/google/android/gms/internal/zzha;)Z
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzoo:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzoo:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzoo:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    :cond_0
    :goto_0
    invoke-virtual {p0, v1, p1, v0}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/zzha;Z)Z

    move-result v0

    return v0

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/internal/zzha;->zzCm:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    const-string v3, "_noRefresh"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method protected zza(Lcom/google/android/gms/internal/zzha;Lcom/google/android/gms/internal/zzha;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha;->zzyc:Lcom/google/android/gms/internal/zzea;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzha;->zzyc:Lcom/google/android/gms/internal/zzea;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzea;->zza(Lcom/google/android/gms/internal/zzdz;)V

    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzyc:Lcom/google/android/gms/internal/zzea;

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzyc:Lcom/google/android/gms/internal/zzea;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/zzea;->zza(Lcom/google/android/gms/internal/zzdz;)V

    :cond_1
    iget-object v1, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    if-eqz v1, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget v1, v0, Lcom/google/android/gms/internal/zzdy;->zzxM:I

    iget-object v0, p2, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget v0, v0, Lcom/google/android/gms/internal/zzdy;->zzxN:I

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzqf:Lcom/google/android/gms/internal/zzhf;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzhf;->zzf(II)V

    const/4 v0, 0x1

    return v0

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method protected zzaU()Z
    .locals 5

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.permission.INTERNET"

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzhl;->zza(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzhl;->zzG(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return v0
.end method

.method public zzaV()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzop:Lcom/google/android/gms/internal/zzay;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzay;->zzg(Lcom/google/android/gms/internal/zzha;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzor:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaQ()Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhb;->zzfR()V

    return-void
.end method

.method public zzaW()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzor:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaS()Z

    return-void
.end method

.method public zzaX()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->onAdClicked()V

    return-void
.end method

.method public zzaY()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaV()V

    return-void
.end method

.method public zzaZ()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaO()V

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzha;)V
    .locals 7

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/zzha;)V

    iget v0, p1, Lcom/google/android/gms/internal/zzha;->errorCode:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdy;->zzxH:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzay(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbG()Lcom/google/android/gms/internal/zzed;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v3, p1, Lcom/google/android/gms/internal/zzha;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iget-object v6, v3, Lcom/google/android/gms/internal/zzdy;->zzxH:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzha;Ljava/lang/String;ZLjava/util/List;)V

    :cond_0
    return-void
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaU()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzby()Lcom/google/android/gms/internal/zzhc;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzhc;->zzD(Landroid/content/Context;)Lcom/google/android/gms/internal/zzbk;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/zzbk;)Landroid/os/Bundle;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzom:Lcom/google/android/gms/ads/internal/zzn;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzn;->cancel()V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iput v0, v2, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Landroid/os/Bundle;)Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbr()Lcom/google/android/gms/ads/internal/request/zza;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzp;->zzpI:Lcom/google/android/gms/internal/zzan;

    invoke-virtual {v2, v3, v0, v4, p0}, Lcom/google/android/gms/ads/internal/request/zza;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;Lcom/google/android/gms/internal/zzan;Lcom/google/android/gms/ads/internal/request/zza$zza;)Lcom/google/android/gms/internal/zzhh;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpL:Lcom/google/android/gms/internal/zzhh;

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public zzba()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaW()V

    return-void
.end method

.method public zzbb()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mediation adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzha;->zzyb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzon:Lcom/google/android/gms/ads/internal/zzp;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/zzb;->zza(Lcom/google/android/gms/internal/zzha;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzb;->zzaT()Z

    return-void
.end method

.method protected zzc(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzc(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzb;->zzor:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
