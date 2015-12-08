.class Lcom/google/android/gms/internal/zzna$3;
.super Lcom/google/android/gms/internal/zzly$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzna;->disableFit(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzald:Lcom/google/android/gms/internal/zzna;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzna;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzna$3;->zzald:Lcom/google/android/gms/internal/zzna;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzly$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzly;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzna$3;->zza(Lcom/google/android/gms/internal/zzly;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzly;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzng;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzng;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzly;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzly;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzmj;

    new-instance v3, Lcom/google/android/gms/fitness/request/DisableFitRequest;

    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/fitness/request/DisableFitRequest;-><init>(Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzmj;->zza(Lcom/google/android/gms/fitness/request/DisableFitRequest;)V

    return-void
.end method
