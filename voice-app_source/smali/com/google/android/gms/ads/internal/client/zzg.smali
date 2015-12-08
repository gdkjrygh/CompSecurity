.class public Lcom/google/android/gms/ads/internal/client/zzg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# static fields
.field public static final zzsl:Lcom/google/android/gms/ads/internal/client/zzg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/zzg;->zzsl:Lcom/google/android/gms/ads/internal/client/zzg;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzcw()Lcom/google/android/gms/ads/internal/client/zzg;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/client/zzg;->zzsl:Lcom/google/android/gms/ads/internal/client/zzg;

    return-object v0
.end method


# virtual methods
.method public zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzx;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    .locals 20

    const/4 v3, 0x5

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getBirthday()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getContentUrl()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getGender()I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getKeywords()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    :goto_1
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzx;->isTestDevice(Landroid/content/Context;)Z

    move-result v9

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->zzcL()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getLocation()Landroid/location/Location;

    move-result-object v14

    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/client/zzx;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getManualImpressionsEnabled()Z

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getPublisherProvidedId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->zzcI()Lcom/google/android/gms/ads/search/SearchAdRequest;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v13, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    invoke-direct {v13, v2}, Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest;)V

    :goto_2
    new-instance v2, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->zzcK()Landroid/os/Bundle;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->getCustomTargeting()Landroid/os/Bundle;

    move-result-object v17

    new-instance v18, Ljava/util/ArrayList;

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->zzcM()Ljava/util/Set;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static/range {v18 .. v18}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v18

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/client/zzx;->zzcH()Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v2 .. v19}, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const-wide/16 v4, -0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    goto :goto_2
.end method

.method public zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzx;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;
    .locals 2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzg;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzx;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;

    invoke-direct {v1, v0, p3}, Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;-><init>(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;)V

    return-object v1
.end method
