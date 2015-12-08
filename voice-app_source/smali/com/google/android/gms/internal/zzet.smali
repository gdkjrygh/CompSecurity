.class public Lcom/google/android/gms/internal/zzet;
.super Lcom/google/android/gms/internal/zzeu;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzoA:Lcom/google/android/gms/internal/zzid;

.field private final zzqF:Landroid/view/WindowManager;

.field private final zzyT:Lcom/google/android/gms/internal/zzbq;

.field zzyU:Landroid/util/DisplayMetrics;

.field private zzyV:F

.field zzyW:I

.field zzyX:I

.field private zzyY:I

.field zzyZ:I

.field zzza:I

.field zzzb:I

.field zzzc:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzid;Landroid/content/Context;Lcom/google/android/gms/internal/zzbq;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzeu;-><init>(Lcom/google/android/gms/internal/zzid;)V

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyW:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyX:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyZ:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzza:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzb:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzc:I

    iput-object p1, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzqF:Landroid/view/WindowManager;

    return-void
.end method

.method private zzeh()V
    .locals 2

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzqF:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/google/android/gms/internal/zzet;->zzyV:F

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyY:I

    return-void
.end method

.method private zzem()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzid;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    const/4 v3, 0x0

    aget v3, v0, v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    const/4 v4, 0x1

    aget v0, v0, v4

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/zzet;->zze(II)V

    return-void
.end method

.method private zzep()Lcom/google/android/gms/internal/zzes;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzes$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzes$zza;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbq;->zzcQ()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzes$zza;->zzp(Z)Lcom/google/android/gms/internal/zzes$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbq;->zzcR()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzes$zza;->zzo(Z)Lcom/google/android/gms/internal/zzes$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbq;->zzcV()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzes$zza;->zzq(Z)Lcom/google/android/gms/internal/zzes$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbq;->zzcS()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzes$zza;->zzr(Z)Lcom/google/android/gms/internal/zzes$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyT:Lcom/google/android/gms/internal/zzbq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbq;->zzcT()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzes$zza;->zzs(Z)Lcom/google/android/gms/internal/zzes$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzes$zza;->zzeg()Lcom/google/android/gms/internal/zzes;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public zze(II)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzhl;->zzj(Landroid/app/Activity;)[I

    move-result-object v0

    aget v0, v0, v1

    :goto_0
    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/zzet;->zzzb:I

    iget v2, p0, Lcom/google/android/gms/internal/zzet;->zzzc:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzet;->zzc(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzie;->zzd(II)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method zzei()V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyW:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyX:I

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgB()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/zzet;->zzyW:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzyZ:I

    iget v0, p0, Lcom/google/android/gms/internal/zzet;->zzyX:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzza:I

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzhl;->zzg(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    const/4 v3, 0x0

    aget v3, v0, v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/zzet;->zzyZ:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzyU:Landroid/util/DisplayMetrics;

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzza:I

    goto :goto_0
.end method

.method zzej()V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/zzet;->zzyW:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzb:I

    iget v0, p0, Lcom/google/android/gms/internal/zzet;->zzyX:I

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzc:I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0, v1, v1}, Lcom/google/android/gms/internal/zzid;->measure(II)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzb:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzet;->zzzc:I

    goto :goto_0
.end method

.method public zzek()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzet;->zzeh()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzet;->zzei()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzet;->zzej()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzet;->zzen()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzet;->zzeo()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzet;->zzem()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzet;->zzel()V

    return-void
.end method

.method zzel()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzL(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Dispatching Ready Event."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaA(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgI()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzet;->zzaf(Ljava/lang/String;)V

    return-void
.end method

.method zzen()V
    .locals 7

    iget v1, p0, Lcom/google/android/gms/internal/zzet;->zzyW:I

    iget v2, p0, Lcom/google/android/gms/internal/zzet;->zzyX:I

    iget v3, p0, Lcom/google/android/gms/internal/zzet;->zzyZ:I

    iget v4, p0, Lcom/google/android/gms/internal/zzet;->zzza:I

    iget v5, p0, Lcom/google/android/gms/internal/zzet;->zzyV:F

    iget v6, p0, Lcom/google/android/gms/internal/zzet;->zzyY:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzet;->zza(IIIIFI)V

    return-void
.end method

.method zzeo()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzet;->zzep()Lcom/google/android/gms/internal/zzes;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzoA:Lcom/google/android/gms/internal/zzid;

    const-string v2, "onDeviceFeaturesReceived"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzes;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/zzid;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
