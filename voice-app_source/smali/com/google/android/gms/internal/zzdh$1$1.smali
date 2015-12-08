.class Lcom/google/android/gms/internal/zzdh$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzdh$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzwj:Lorg/json/JSONObject;

.field final synthetic zzwk:Lcom/google/android/gms/internal/zzdh$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdh$1;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdh$1$1;->zzwk:Lcom/google/android/gms/internal/zzdh$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdh$1$1;->zzwj:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdh$1$1;->zzwk:Lcom/google/android/gms/internal/zzdh$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdh$1;->zzwh:Lcom/google/android/gms/internal/zzid;

    const-string v1, "fetchHttpRequestCompleted"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdh$1$1;->zzwj:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzid;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v0, "Dispatched http response."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzay(Ljava/lang/String;)V

    return-void
.end method
