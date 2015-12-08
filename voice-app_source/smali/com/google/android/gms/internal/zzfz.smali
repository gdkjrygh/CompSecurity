.class public Lcom/google/android/gms/internal/zzfz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzfy$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzfy$zza",
        "<",
        "Lcom/google/android/gms/ads/internal/formats/zzd;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzBY:Z

.field private final zzBZ:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzfz;->zzBY:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzfz;->zzBZ:Z

    return-void
.end method


# virtual methods
.method public synthetic zza(Lcom/google/android/gms/internal/zzfy;Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/formats/zzg$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzfz;->zzb(Lcom/google/android/gms/internal/zzfy;Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/formats/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzfy;Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/formats/zzd;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    const/4 v3, 0x1

    const-string v2, "images"

    iget-boolean v4, p0, Lcom/google/android/gms/internal/zzfz;->zzBY:Z

    iget-boolean v5, p0, Lcom/google/android/gms/internal/zzfz;->zzBZ:Z

    move-object v0, p1

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/zzfy;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;

    move-result-object v0

    const-string v1, "app_icon"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzfz;->zzBY:Z

    invoke-virtual {p1, p2, v1, v3, v2}, Lcom/google/android/gms/internal/zzfy;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/zzhv;

    move-result-object v4

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzfy;->zze(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzhv;

    move-result-object v10

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzhv;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzhv;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/internal/formats/zzd;

    const-string v1, "headline"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "body"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/ads/internal/formats/zzc;

    const-string v5, "call_to_action"

    invoke-virtual {p2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "rating"

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    invoke-virtual {p2, v6, v8, v9}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v6

    const-string v8, "store"

    invoke-virtual {p2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "price"

    invoke-virtual {p2, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/ads/internal/formats/zza;

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/ads/internal/formats/zzd;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zzc;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/zza;)V

    return-object v0
.end method
