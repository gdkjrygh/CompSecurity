.class public Lcom/google/android/gms/ads/internal/request/zzl;
.super Lcom/google/android/gms/internal/zzhh;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/internal/request/zzl$zza;,
        Lcom/google/android/gms/ads/internal/request/zzl$zzb;,
        Lcom/google/android/gms/ads/internal/request/zzl$zzc;
    }
.end annotation


# static fields
.field static final zzDf:J

.field private static zzDg:Z

.field private static zzDh:Lcom/google/android/gms/internal/zzdt;

.field private static zzDi:Lcom/google/android/gms/internal/zzdh;

.field private static zzDj:Lcom/google/android/gms/internal/zzdl;

.field private static zzDk:Lcom/google/android/gms/internal/zzdg;

.field private static final zzoW:Ljava/lang/Object;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzBr:Ljava/lang/Object;

.field private final zzCd:Lcom/google/android/gms/ads/internal/request/zza$zza;

.field private final zzCe:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

.field private zzDl:Lcom/google/android/gms/internal/zzdt$zzd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDf:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzoW:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDg:Z

    sput-object v4, Lcom/google/android/gms/ads/internal/request/zzl;->zzDh:Lcom/google/android/gms/internal/zzdt;

    sput-object v4, Lcom/google/android/gms/ads/internal/request/zzl;->zzDi:Lcom/google/android/gms/internal/zzdh;

    sput-object v4, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    sput-object v4, Lcom/google/android/gms/ads/internal/request/zzl;->zzDk:Lcom/google/android/gms/internal/zzdg;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;Lcom/google/android/gms/ads/internal/request/zza$zza;)V
    .locals 7

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzhh;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzBr:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzCd:Lcom/google/android/gms/ads/internal/request/zza$zza;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzCe:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    sget-object v6, Lcom/google/android/gms/ads/internal/request/zzl;->zzoW:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDg:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzdl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdl;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    new-instance v0, Lcom/google/android/gms/internal/zzdh;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzdh;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDi:Lcom/google/android/gms/internal/zzdh;

    new-instance v0, Lcom/google/android/gms/ads/internal/request/zzl$zzc;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/request/zzl$zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDk:Lcom/google/android/gms/internal/zzdg;

    new-instance v0, Lcom/google/android/gms/internal/zzdt;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzCe:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;->zzpJ:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    sget-object v3, Lcom/google/android/gms/internal/zzbz;->zztD:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/ads/internal/request/zzl$zzb;

    invoke-direct {v4}, Lcom/google/android/gms/ads/internal/request/zzl$zzb;-><init>()V

    new-instance v5, Lcom/google/android/gms/ads/internal/request/zzl$zza;

    invoke-direct {v5}, Lcom/google/android/gms/ads/internal/request/zzl$zza;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzdt;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/internal/zzdt$zzb;Lcom/google/android/gms/internal/zzdt$zzb;)V

    sput-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDh:Lcom/google/android/gms/internal/zzdt;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDg:Z

    :cond_0
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic zza(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/ads/internal/request/zza$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzCd:Lcom/google/android/gms/ads/internal/request/zza$zza;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/ads/internal/request/zzl;Lcom/google/android/gms/internal/zzdt$zzd;)Lcom/google/android/gms/internal/zzdt$zzd;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDl:Lcom/google/android/gms/internal/zzdt$zzd;

    return-object p1
.end method

.method private zza(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    const/4 v2, 0x0

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzCm:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    const-string v1, "sdk_less_server_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzCm:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->extras:Landroid/os/Bundle;

    const-string v1, "sdk_less_network_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v7, :cond_1

    :cond_0
    :goto_0
    return-object v2

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbB()Lcom/google/android/gms/internal/zzgl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzgl;->zzC(Landroid/content/Context;)Lcom/google/android/gms/internal/zzgk;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/zzbr;

    sget-object v0, Lcom/google/android/gms/internal/zzbz;->zztD:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/zzbr;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p1

    move-object v4, v2

    move-object v5, v2

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/zzgg;->zza(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/zzgk;Landroid/location/Location;Lcom/google/android/gms/internal/zzbr;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "request_id"

    invoke-virtual {v3, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "network_id"

    invoke-virtual {v3, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "request_param"

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "data"

    invoke-virtual {v3, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_2

    const-string v1, "adid"

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "lat"

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzhl;->zzy(Ljava/util/Map;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_3
    const-string v3, "Cannot get advertising id info"

    invoke-static {v3, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_3
.end method

.method static synthetic zzb(Lcom/google/android/gms/ads/internal/request/zzl;)Lcom/google/android/gms/internal/zzdt$zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDl:Lcom/google/android/gms/internal/zzdt$zzd;

    return-object v0
.end method

.method protected static zzc(Lcom/google/android/gms/internal/zzbb;)V
    .locals 2

    const-string v0, "/loadAd"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/fetchHttpRequest"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDi:Lcom/google/android/gms/internal/zzdh;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/invalidRequest"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDk:Lcom/google/android/gms/internal/zzdg;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    return-void
.end method

.method protected static zzd(Lcom/google/android/gms/internal/zzbb;)V
    .locals 2

    const-string v0, "/loadAd"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/fetchHttpRequest"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDi:Lcom/google/android/gms/internal/zzdh;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    const-string v0, "/invalidRequest"

    sget-object v1, Lcom/google/android/gms/ads/internal/request/zzl;->zzDk:Lcom/google/android/gms/internal/zzdg;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/zzbb;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzdg;)V

    return-void
.end method

.method private zzf(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    .locals 10

    const/4 v9, 0x0

    const/4 v8, -0x1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/ads/internal/request/zzl;->zza(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-direct {v0, v9}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbz()Lcom/google/android/gms/internal/zzlb;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/zzdl;->zzU(Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/ads/internal/util/client/zza;->zzGF:Landroid/os/Handler;

    new-instance v6, Lcom/google/android/gms/ads/internal/request/zzl$2;

    invoke-direct {v6, p0, v1, v0}, Lcom/google/android/gms/ads/internal/request/zzl$2;-><init>(Lcom/google/android/gms/ads/internal/request/zzl;Lorg/json/JSONObject;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDf:J

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbz()Lcom/google/android/gms/internal/zzlb;

    move-result-object v5

    invoke-interface {v5}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v6

    sub-long v2, v6, v2

    sub-long/2addr v0, v2

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v4, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-direct {v0, v8}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_1
    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-direct {v0, v8}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto :goto_0

    :catch_2
    move-exception v0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-direct {v0, v9}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/internal/zzgg;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCI:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;-><init>(I)V

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method static synthetic zzfA()Lcom/google/android/gms/internal/zzdt;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDh:Lcom/google/android/gms/internal/zzdt;

    return-object v0
.end method

.method static synthetic zzfz()Lcom/google/android/gms/internal/zzdl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/request/zzl;->zzDj:Lcom/google/android/gms/internal/zzdl;

    return-object v0
.end method


# virtual methods
.method public onStop()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzBr:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/ads/internal/util/client/zza;->zzGF:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/request/zzl$3;

    invoke-direct {v2, p0}, Lcom/google/android/gms/ads/internal/request/zzl$3;-><init>(Lcom/google/android/gms/ads/internal/request/zzl;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzdP()V
    .locals 11

    const/4 v3, 0x0

    const-string v0, "SdkLessAdLoaderBackgroundTask started."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzay(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/zzl;->zzCe:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;

    invoke-direct {v1, v0, v3, v3}, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/ads/internal/request/zzl;->zzf(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbz()Lcom/google/android/gms/internal/zzlb;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzlb;->elapsedRealtime()J

    move-result-wide v6

    new-instance v0, Lcom/google/android/gms/internal/zzha$zza;

    iget v5, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    iget-wide v8, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCO:J

    move-object v4, v3

    move-object v10, v3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/zzha$zza;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/zzdy;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V

    sget-object v1, Lcom/google/android/gms/ads/internal/util/client/zza;->zzGF:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/request/zzl$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/ads/internal/request/zzl$1;-><init>(Lcom/google/android/gms/ads/internal/request/zzl;Lcom/google/android/gms/internal/zzha$zza;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
