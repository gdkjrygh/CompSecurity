.class Lcom/google/android/gms/internal/zzfu$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzfu;->zzh(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzBw:Lcom/google/android/gms/internal/zzfu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzfu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v6, v0, Lcom/google/android/gms/internal/zzfu;->zzqt:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfu;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    monitor-exit v6

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfu;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/internal/zzie$zza;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfu;->zzfn()V

    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaB(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfu;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzo;->zzbv()Lcom/google/android/gms/internal/zzhl;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzfu;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzzG:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzhl;->zzat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfu$1;->zzBw:Lcom/google/android/gms/internal/zzfu;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzfu;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCI:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzid;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
