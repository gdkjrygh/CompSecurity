.class Lcom/google/android/gms/internal/zznb$4;
.super Lcom/google/android/gms/internal/zzlz$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zznb;->readDailyTotal(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzlz$zza",
        "<",
        "Lcom/google/android/gms/fitness/result/DailyTotalResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzalh:Lcom/google/android/gms/internal/zznb;

.field final synthetic zzalk:Lcom/google/android/gms/fitness/data/DataType;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznb;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zznb$4;->zzalh:Lcom/google/android/gms/internal/zznb;

    iput-object p3, p0, Lcom/google/android/gms/internal/zznb$4;->zzalk:Lcom/google/android/gms/fitness/data/DataType;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzlz$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zznb$4;->zzE(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DailyTotalResult;

    move-result-object v0

    return-object v0
.end method

.method protected zzE(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DailyTotalResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/DailyTotalResult;->zzK(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DailyTotalResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzlz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zznb$4;->zza(Lcom/google/android/gms/internal/zzlz;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzlz;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zznb$4$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zznb$4$1;-><init>(Lcom/google/android/gms/internal/zznb$4;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlz;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/fitness/request/DailyTotalRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zznb$4;->zzalk:Lcom/google/android/gms/fitness/data/DataType;

    invoke-direct {v2, v0, v3, v1}, Lcom/google/android/gms/fitness/request/DailyTotalRequest;-><init>(Lcom/google/android/gms/internal/zzme;Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzlz;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzmk;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzmk;->zza(Lcom/google/android/gms/fitness/request/DailyTotalRequest;)V

    return-void
.end method
