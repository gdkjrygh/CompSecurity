.class public Lcom/google/android/gms/internal/zzes;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzes$1;,
        Lcom/google/android/gms/internal/zzes$zza;
    }
.end annotation


# instance fields
.field private final zzyO:Z

.field private final zzyP:Z

.field private final zzyQ:Z

.field private final zzyR:Z

.field private final zzyS:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzes$zza;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzes$zza;->zza(Lcom/google/android/gms/internal/zzes$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzes;->zzyO:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzes$zza;->zzb(Lcom/google/android/gms/internal/zzes$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzes;->zzyP:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzes$zza;->zzc(Lcom/google/android/gms/internal/zzes$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzes;->zzyQ:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzes$zza;->zzd(Lcom/google/android/gms/internal/zzes$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzes;->zzyR:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzes$zza;->zze(Lcom/google/android/gms/internal/zzes$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzes;->zzyS:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzes$zza;Lcom/google/android/gms/internal/zzes$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzes;-><init>(Lcom/google/android/gms/internal/zzes$zza;)V

    return-void
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 3

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "sms"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzes;->zzyO:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "tel"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzes;->zzyP:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "calendar"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzes;->zzyQ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "storePicture"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzes;->zzyR:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "inlineVideo"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzes;->zzyS:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Error occured while obtaining the MRAID capabilities."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method
