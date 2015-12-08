.class Lcom/google/android/gms/internal/zzjs$2;
.super Lcom/google/android/gms/internal/zzjs$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzjs;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzTB:Lcom/google/android/gms/internal/zzjs;

.field final synthetic zzTD:I

.field final synthetic zzTE:Ljava/lang/String;

.field final synthetic zzTF:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzjs;ILjava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTB:Lcom/google/android/gms/internal/zzjs;

    iput p2, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTD:I

    iput-object p3, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTE:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTF:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzjs$zza;-><init>(Lcom/google/android/gms/internal/zzjs;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTD:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzjv;->zzaJ(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjs$2;->zzlA()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v0

    const-wide/16 v2, -0x1

    const/16 v1, 0x7d1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lcom/google/android/gms/cast/internal/zzo;->zza(JILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzjs;->zzlz()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "sendPlayerRequest for unsupported playerState: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTD:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzf(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTB:Lcom/google/android/gms/internal/zzjs;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTE:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzjs$2;->zzTF:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjs$2;->zzlA()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/zzjs;->zza(Lcom/google/android/gms/internal/zzjs;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/zzo;)V

    goto :goto_0
.end method
