.class public Lcom/google/android/gms/internal/zzca;
.super Ljava/lang/Object;


# instance fields
.field private mContext:Landroid/content/Context;

.field private zzqr:Ljava/lang/String;

.field private zzuA:I

.field private zzuB:I

.field private zzuC:I

.field private zzuD:Ljava/lang/String;

.field private zzuE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzuy:Z

.field private zzuz:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzca;->mContext:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzqr:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zztY:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzca;->zzuy:Z

    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zzua:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuD:Ljava/lang/String;

    const/16 v0, 0x1e

    iput v0, p0, Lcom/google/android/gms/internal/zzca;->zzuA:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/zzca;->zzuB:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/google/android/gms/internal/zzca;->zzuC:I

    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zztZ:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzca;->zzuz:I

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "s"

    const-string v2, "gmob_sdk"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "v"

    const-string v2, "3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "os"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "sdk"

    sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "device"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzhl;->zzgo()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public zzb(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/zzca;
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzca;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzca;->zzqr:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "ua"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/zzhl;->zzf(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "app"

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p0

    :catch_0
    move-exception v0

    const-string v0, "Cannot get the application name. Set to null."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaC(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    const-string v1, "app"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method zzbR()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzqr:Ljava/lang/String;

    return-object v0
.end method

.method zzdc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzca;->zzuy:Z

    return v0
.end method

.method zzdd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuD:Ljava/lang/String;

    return-object v0
.end method

.method zzde()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzca;->zzuA:I

    return v0
.end method

.method zzdf()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzca;->zzuB:I

    return v0
.end method

.method zzdg()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzca;->zzuC:I

    return v0
.end method

.method zzdh()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzca;->zzuz:I

    return v0
.end method

.method zzdi()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzca;->zzuE:Ljava/util/Map;

    return-object v0
.end method
