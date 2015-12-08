.class Lcom/google/android/gms/internal/zzqw$5;
.super Lcom/google/android/gms/wallet/Wallet$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzqw;->notifyTransactionStatus(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaSo:Lcom/google/android/gms/internal/zzqw;

.field final synthetic zzaSt:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqw$5;->zzaSo:Lcom/google/android/gms/internal/zzqw;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzqw$5;->zzaSt:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzqx;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzqw$5;->zza(Lcom/google/android/gms/internal/zzqx;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzqx;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqw$5;->zzaSt:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzqx;->zza(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzXP:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzqw$5;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
