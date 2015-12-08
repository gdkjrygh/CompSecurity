.class public Lcom/google/android/gms/ads/internal/zzh;
.super Lcom/google/android/gms/ads/internal/client/zzo$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

.field private final zzoF:Lcom/google/android/gms/internal/zzcu;

.field private final zzoG:Lcom/google/android/gms/internal/zzcv;

.field private final zzoH:Lcom/google/android/gms/internal/zzkw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcx;",
            ">;"
        }
    .end annotation
.end field

.field private final zzoI:Lcom/google/android/gms/internal/zzkw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcw;",
            ">;"
        }
    .end annotation
.end field

.field private final zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final zzoK:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzoL:Ljava/lang/String;

.field private final zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzoq:Lcom/google/android/gms/internal/zzef;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/client/zzn;Lcom/google/android/gms/internal/zzcu;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzkw;Lcom/google/android/gms/internal/zzkw;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzef;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Lcom/google/android/gms/ads/internal/client/zzn;",
            "Lcom/google/android/gms/internal/zzcu;",
            "Lcom/google/android/gms/internal/zzcv;",
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcx;",
            ">;",
            "Lcom/google/android/gms/internal/zzkw",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzcw;",
            ">;",
            "Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzo$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzh;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoL:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoq:Lcom/google/android/gms/internal/zzef;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoG:Lcom/google/android/gms/internal/zzcv;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoF:Lcom/google/android/gms/internal/zzcu;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoH:Lcom/google/android/gms/internal/zzkw;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoI:Lcom/google/android/gms/internal/zzkw;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzh;->zzbg()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoK:Ljava/util/List;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzcu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoF:Lcom/google/android/gms/internal/zzcu;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzcv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoG:Lcom/google/android/gms/internal/zzcv;

    return-object v0
.end method

.method private zzbg()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoG:Lcom/google/android/gms/internal/zzcv;

    if-eqz v1, :cond_0

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoF:Lcom/google/android/gms/internal/zzcu;

    if-eqz v1, :cond_1

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoH:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzkw;->size()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzkw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoH:Lcom/google/android/gms/internal/zzkw;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/ads/internal/client/zzn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/internal/zzkw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoI:Lcom/google/android/gms/internal/zzkw;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/ads/internal/zzh;)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzh;->zzbg()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/ads/internal/zzh;)Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-object v0
.end method


# virtual methods
.method protected runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/zzhl;->zzGk:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected zzbh()Lcom/google/android/gms/ads/internal/zzm;
    .locals 6

    new-instance v0, Lcom/google/android/gms/ads/internal/zzm;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzh;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzh;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzs(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoL:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoq:Lcom/google/android/gms/internal/zzef;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzh;->zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zzm;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    return-object v0
.end method

.method public zze(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzh$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/zzh$1;-><init>(Lcom/google/android/gms/ads/internal/zzh;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzh;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
