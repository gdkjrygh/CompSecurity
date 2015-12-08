.class public final Lcom/google/android/gms/ads/internal/zzp;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/internal/zzp$zza;
    }
.end annotation


# instance fields
.field zzoU:Z

.field final zzpF:Ljava/lang/String;

.field public zzpG:Ljava/lang/String;

.field public final zzpH:Landroid/content/Context;

.field final zzpI:Lcom/google/android/gms/internal/zzan;

.field public final zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

.field public zzpL:Lcom/google/android/gms/internal/zzhh;

.field public zzpM:Lcom/google/android/gms/internal/zzhh;

.field public zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field public zzpO:Lcom/google/android/gms/internal/zzha;

.field public zzpP:Lcom/google/android/gms/internal/zzha$zza;

.field public zzpQ:Lcom/google/android/gms/internal/zzhb;

.field zzpR:Lcom/google/android/gms/ads/internal/client/zzm;

.field zzpS:Lcom/google/android/gms/ads/internal/client/zzn;

.field zzpT:Lcom/google/android/gms/ads/internal/client/zzt;

.field zzpU:Lcom/google/android/gms/ads/internal/client/zzu;

.field zzpV:Lcom/google/android/gms/internal/zzff;

.field zzpW:Lcom/google/android/gms/internal/zzfj;

.field zzpX:Lcom/google/android/gms/internal/zzcu;

.field zzpY:Lcom/google/android/gms/internal/zzcv;

.field zzpZ:Lcom/google/android/gms/internal/zzkw;
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

.field zzqa:Lcom/google/android/gms/internal/zzkw;
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

.field zzqb:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field zzqc:Lcom/google/android/gms/internal/zzci;

.field zzqd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field zzqe:Lcom/google/android/gms/ads/internal/purchase/zzk;

.field public zzqf:Lcom/google/android/gms/internal/zzhf;

.field zzqg:Landroid/view/View;

.field public zzqh:I

.field zzqi:Z

.field private zzqj:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/zzhb;",
            ">;"
        }
    .end annotation
.end field

.field private zzqk:I

.field private zzql:I

.field private zzqm:Lcom/google/android/gms/internal/zzhq;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zzp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzan;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/zzan;)V
    .locals 4

    const/4 v2, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqf:Lcom/google/android/gms/internal/zzhf;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqg:Landroid/view/View;

    iput v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqi:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzoU:Z

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqj:Ljava/util/HashSet;

    iput v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqk:I

    iput v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzql:I

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbz;->zzw(Landroid/content/Context;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpF:Ljava/lang/String;

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-nez v0, :cond_0

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsp:Z

    if-eqz v0, :cond_2

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    :goto_0
    if-eqz p1, :cond_1

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0, p0}, Lcom/google/android/gms/internal/zzhl;->zza(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0, p0}, Lcom/google/android/gms/internal/zzhl;->zza(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_1
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpG:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    if-eqz p5, :cond_3

    :goto_1
    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpI:Lcom/google/android/gms/internal/zzan;

    new-instance v0, Lcom/google/android/gms/internal/zzhq;

    const-wide/16 v2, 0xc8

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/zzhq;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqm:Lcom/google/android/gms/internal/zzhq;

    new-instance v0, Lcom/google/android/gms/internal/zzkw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzkw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqa:Lcom/google/android/gms/internal/zzkw;

    return-void

    :cond_2
    new-instance v0, Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/zzp$zza;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzp$zza;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzp$zza;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzp$zza;->setVisibility(I)V

    goto :goto_0

    :cond_3
    new-instance p5, Lcom/google/android/gms/internal/zzan;

    new-instance v0, Lcom/google/android/gms/ads/internal/zzg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/zzg;-><init>(Lcom/google/android/gms/ads/internal/zzp;)V

    invoke-direct {p5, v0}, Lcom/google/android/gms/internal/zzan;-><init>(Lcom/google/android/gms/internal/zzaj;)V

    goto :goto_1
.end method

.method private zze(Z)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzie;->zzbU()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqm:Lcom/google/android/gms/internal/zzhq;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzhq;->tryAcquire()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    const/4 v2, 0x2

    new-array v2, v2, [I

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/internal/zzp$zza;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    aget v5, v2, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzk;->zzcA()Lcom/google/android/gms/ads/internal/util/client/zza;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    aget v2, v2, v0

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/ads/internal/util/client/zza;->zzc(Landroid/content/Context;I)I

    move-result v2

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqk:I

    if-ne v3, v4, :cond_3

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzp;->zzql:I

    if-eq v2, v4, :cond_0

    :cond_3
    iput v3, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqk:I

    iput v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzql:I

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqk:I

    iget v4, p0, Lcom/google/android/gms/ads/internal/zzp;->zzql:I

    if-nez p1, :cond_4

    :goto_1
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/internal/zzie;->zza(IIZ)V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public destroy()V
    .locals 3

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpS:Lcom/google/android/gms/ads/internal/client/zzn;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpT:Lcom/google/android/gms/ads/internal/client/zzt;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpW:Lcom/google/android/gms/internal/zzfj;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpV:Lcom/google/android/gms/internal/zzff;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqc:Lcom/google/android/gms/internal/zzci;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpU:Lcom/google/android/gms/ads/internal/client/zzu;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbx()Lcom/google/android/gms/internal/zzhm;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0, p0}, Lcom/google/android/gms/internal/zzhm;->zzb(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpH:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0, p0}, Lcom/google/android/gms/internal/zzhl;->zzb(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zzp;->zzf(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpK:Lcom/google/android/gms/ads/internal/zzp$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzp$zza;->removeAllViews()V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzp;->zzbJ()V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzp;->zzbL()V

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzp;->zze(Z)V

    return-void
.end method

.method public onScrollChanged()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzp;->zze(Z)V

    return-void
.end method

.method public zza(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/zzhb;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqj:Ljava/util/HashSet;

    return-void
.end method

.method public zzbI()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/zzhb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqj:Ljava/util/HashSet;

    return-object v0
.end method

.method public zzbJ()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->destroy()V

    :cond_0
    return-void
.end method

.method public zzbK()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzzE:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->stopLoading()V

    :cond_0
    return-void
.end method

.method public zzbL()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha;->zzya:Lcom/google/android/gms/internal/zzeg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzeg;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zzbM()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzbN()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzbO()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-wide v2, v1, Lcom/google/android/gms/internal/zzha;->zzFo:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzhb;->zzl(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-wide v2, v1, Lcom/google/android/gms/internal/zzha;->zzFp:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzhb;->zzm(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhb;->zzy(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpQ:Lcom/google/android/gms/internal/zzhb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/zzha;->zzCK:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzhb;->zzz(Z)V

    return-void
.end method

.method public zzf(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzqh:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzp;->zzbK()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpL:Lcom/google/android/gms/internal/zzhh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpL:Lcom/google/android/gms/internal/zzhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhh;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpM:Lcom/google/android/gms/internal/zzhh;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpM:Lcom/google/android/gms/internal/zzhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhh;->cancel()V

    :cond_2
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzp;->zzpO:Lcom/google/android/gms/internal/zzha;

    :cond_3
    return-void
.end method
