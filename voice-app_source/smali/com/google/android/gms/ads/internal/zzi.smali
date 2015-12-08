.class public Lcom/google/android/gms/ads/internal/zzi;
.super Lcom/google/android/gms/ads/internal/client/zzp$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

.field private zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final zzoL:Ljava/lang/String;

.field private final zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private zzoP:Lcom/google/android/gms/internal/zzcu;

.field private zzoQ:Lcom/google/android/gms/internal/zzcv;

.field private zzoR:Lcom/google/android/gms/internal/zzkw;
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

.field private zzoS:Lcom/google/android/gms/internal/zzkw;
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

.field private final zzoq:Lcom/google/android/gms/internal/zzef;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzp$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoL:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoq:Lcom/google/android/gms/internal/zzef;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/zzkw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzkw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoS:Lcom/google/android/gms/internal/zzkw;

    new-instance v0, Lcom/google/android/gms/internal/zzkw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzkw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoR:Lcom/google/android/gms/internal/zzkw;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzcu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoP:Lcom/google/android/gms/internal/zzcu;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzcv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoQ:Lcom/google/android/gms/internal/zzcv;

    return-void
.end method

.method public zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzcx;Lcom/google/android/gms/internal/zzcw;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Custom template ID for native custom template ad is empty. Please provide a valid template id."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoS:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzkw;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoR:Lcom/google/android/gms/internal/zzkw;

    invoke-virtual {v0, p1, p3}, Lcom/google/android/gms/internal/zzkw;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/ads/internal/client/zzn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

    return-void
.end method

.method public zzbi()Lcom/google/android/gms/ads/internal/client/zzo;
    .locals 11

    new-instance v0, Lcom/google/android/gms/ads/internal/zzh;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzi;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoL:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoq:Lcom/google/android/gms/internal/zzef;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoM:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoE:Lcom/google/android/gms/ads/internal/client/zzn;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoP:Lcom/google/android/gms/internal/zzcu;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoQ:Lcom/google/android/gms/internal/zzcv;

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoS:Lcom/google/android/gms/internal/zzkw;

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoR:Lcom/google/android/gms/internal/zzkw;

    iget-object v10, p0, Lcom/google/android/gms/ads/internal/zzi;->zzoJ:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/ads/internal/zzh;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/client/zzn;Lcom/google/android/gms/internal/zzcu;Lcom/google/android/gms/internal/zzcv;Lcom/google/android/gms/internal/zzkw;Lcom/google/android/gms/internal/zzkw;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V

    return-object v0
.end method
