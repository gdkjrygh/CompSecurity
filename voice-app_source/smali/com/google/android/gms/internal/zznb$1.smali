.class Lcom/google/android/gms/internal/zznb$1;
.super Lcom/google/android/gms/internal/zzlz$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zznb;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;Z)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzalf:Lcom/google/android/gms/fitness/data/DataSet;

.field final synthetic zzalg:Z

.field final synthetic zzalh:Lcom/google/android/gms/internal/zznb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznb;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zznb$1;->zzalh:Lcom/google/android/gms/internal/zznb;

    iput-object p3, p0, Lcom/google/android/gms/internal/zznb$1;->zzalf:Lcom/google/android/gms/fitness/data/DataSet;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zznb$1;->zzalg:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzlz$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzlz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zznb$1;->zza(Lcom/google/android/gms/internal/zzlz;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzlz;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzng;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzng;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlz;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlz;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzmk;

    new-instance v3, Lcom/google/android/gms/fitness/request/DataInsertRequest;

    iget-object v4, p0, Lcom/google/android/gms/internal/zznb$1;->zzalf:Lcom/google/android/gms/fitness/data/DataSet;

    iget-boolean v5, p0, Lcom/google/android/gms/internal/zznb$1;->zzalg:Z

    invoke-direct {v3, v4, v1, v2, v5}, Lcom/google/android/gms/fitness/request/DataInsertRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSet;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;Z)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzmk;->zza(Lcom/google/android/gms/fitness/request/DataInsertRequest;)V

    return-void
.end method
