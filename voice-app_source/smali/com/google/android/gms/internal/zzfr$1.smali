.class Lcom/google/android/gms/internal/zzfr$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzfr;->zzh(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzBo:Lcom/google/android/gms/internal/zzfq;

.field final synthetic zzBp:Lcom/google/android/gms/internal/zzfr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzfr;Lcom/google/android/gms/internal/zzfq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBo:Lcom/google/android/gms/internal/zzfq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    iget-object v1, v0, Lcom/google/android/gms/internal/zzfr;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfr;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->errorCode:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfr;->zzoA:Lcom/google/android/gms/internal/zzid;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzid;->zzgF()Lcom/google/android/gms/internal/zzie;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzie;->zza(Lcom/google/android/gms/internal/zzie$zza;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBo:Lcom/google/android/gms/internal/zzfq;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfr$1;->zzBp:Lcom/google/android/gms/internal/zzfr;

    iget-object v2, v2, Lcom/google/android/gms/internal/zzfr;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzfq;->zza(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
