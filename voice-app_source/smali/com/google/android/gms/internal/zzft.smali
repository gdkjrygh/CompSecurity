.class public Lcom/google/android/gms/internal/zzft;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzft$zza;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzan;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzft$zza;)Lcom/google/android/gms/internal/zzhh;
    .locals 7

    iget-object v0, p3, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzsp:Z

    if-eqz v1, :cond_2

    instance-of v0, p2, Lcom/google/android/gms/ads/internal/zzm;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzfx;

    move-object v2, p2

    check-cast v2, Lcom/google/android/gms/ads/internal/zzm;

    new-instance v3, Lcom/google/android/gms/internal/zzbc;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzbc;-><init>()V

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzfx;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzm;Lcom/google/android/gms/internal/zzbc;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzan;Lcom/google/android/gms/internal/zzft$zza;)V

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhh;->zzgj()V

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid NativeAdManager type. Found: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; Required: NativeAdManager."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "null"

    goto :goto_1

    :cond_2
    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCK:Z

    if-eqz v1, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/zzfw;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzfw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzft$zza;)V

    goto :goto_0

    :cond_3
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCQ:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/zzfr;

    invoke-direct {v0, p1, p3, p5, p7}, Lcom/google/android/gms/internal/zzfr;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zzuj:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/zzlk;->zzoX()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/internal/zzlk;->isAtLeastL()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p5}, Lcom/google/android/gms/internal/zzid;->zzaN()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzsn:Z

    if-eqz v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/zzfv;

    invoke-direct {v0, p1, p3, p5, p7}, Lcom/google/android/gms/internal/zzfv;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/zzfu;

    invoke-direct {v0, p1, p3, p5, p7}, Lcom/google/android/gms/internal/zzfu;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V

    goto :goto_0
.end method
