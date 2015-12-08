.class Lcom/google/android/gms/internal/zzjs$3;
.super Lcom/google/android/gms/internal/zzjs$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzjs;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzTB:Lcom/google/android/gms/internal/zzjs;

.field final synthetic zzTE:Ljava/lang/String;

.field final synthetic zzTF:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzjs;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTB:Lcom/google/android/gms/internal/zzjs;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTE:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTF:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzjs$zza;-><init>(Lcom/google/android/gms/internal/zzjs;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTB:Lcom/google/android/gms/internal/zzjs;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTE:Ljava/lang/String;

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/google/android/gms/internal/zzjs$3;->zzTF:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjs$3;->zzlA()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzjs;->zza(Lcom/google/android/gms/internal/zzjs;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/zzo;)V

    return-void
.end method
