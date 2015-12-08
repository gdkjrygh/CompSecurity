.class Lcom/google/android/gms/internal/zzkb$1;
.super Lcom/google/android/gms/internal/zzke$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzkb;->zza(Lcom/google/android/gms/internal/zzkc;Lcom/google/android/gms/internal/zzke;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzVC:Lcom/google/android/gms/internal/zzke;

.field final synthetic zzVD:Lcom/google/android/gms/internal/zzkb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzkb;Lcom/google/android/gms/internal/zzke;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVD:Lcom/google/android/gms/internal/zzkb;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVC:Lcom/google/android/gms/internal/zzke;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzke$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaR(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzln()Lcom/google/android/gms/cast/internal/zzl;

    move-result-object v0

    const-string v1, "onRemoteDisplayEnded"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/zzl;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVC:Lcom/google/android/gms/internal/zzke;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVC:Lcom/google/android/gms/internal/zzke;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzke;->zzaR(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVD:Lcom/google/android/gms/internal/zzkb;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzkb;->zzb(Lcom/google/android/gms/internal/zzkb;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzkb$1;->zzVD:Lcom/google/android/gms/internal/zzkb;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzkb;->zzb(Lcom/google/android/gms/internal/zzkb;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;->onRemoteDisplayEnded(Lcom/google/android/gms/common/api/Status;)V

    :cond_1
    return-void
.end method
