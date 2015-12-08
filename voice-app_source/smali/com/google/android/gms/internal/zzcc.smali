.class public Lcom/google/android/gms/internal/zzcc;
.super Ljava/lang/Object;


# instance fields
.field private zzuy:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzcc;->zzuy:Z

    return-void
.end method

.method private zzb(Lcom/google/android/gms/internal/zzca;I)Lcom/google/android/gms/internal/zzcb;
    .locals 10

    new-instance v0, Lcom/google/android/gms/internal/zzcb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzbR()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdd()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzde()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdf()I

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdg()I

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdh()I

    move-result v7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdi()Ljava/util/Map;

    move-result-object v8

    move v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/zzcb;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/Map;I)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/zzcc;->zzuy:Z

    return-object v0
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzca;)Lcom/google/android/gms/internal/zzcb;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzcc;->zza(Lcom/google/android/gms/internal/zzca;I)Lcom/google/android/gms/internal/zzcb;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzca;I)Lcom/google/android/gms/internal/zzcb;
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "CSI configuration can\'t be null. "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzdc()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CsiReporterFactory: CSI is not enabled. No CSI reporter created."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaA(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context can\'t be null. Please set up context in CsiConfiguration."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzca;->zzbR()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzcc;->zzb(Lcom/google/android/gms/internal/zzca;I)Lcom/google/android/gms/internal/zzcb;

    move-result-object v0

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzca;)Lcom/google/android/gms/internal/zzcb;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzcc;->zza(Lcom/google/android/gms/internal/zzca;I)Lcom/google/android/gms/internal/zzcb;

    move-result-object v0

    return-object v0
.end method

.method public zzdc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzcc;->zzuy:Z

    return v0
.end method
