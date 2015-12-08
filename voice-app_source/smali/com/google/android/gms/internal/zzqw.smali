.class public Lcom/google/android/gms/internal/zzqw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wallet/Payments;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "googleTransactionId"    # Ljava/lang/String;
    .param p3, "merchantTransactionId"    # Ljava/lang/String;
    .param p4, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzqw$4;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method

.method public checkForPreAuthorization(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzqw$1;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method

.method public isNewUser(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzqw$6;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method

.method public loadFullWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/FullWalletRequest;
    .param p3, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzqw$3;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method

.method public loadMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .param p3, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzqw$2;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method

.method public notifyTransactionStatus(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzqw$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/zzqw$5;-><init>(Lcom/google/android/gms/internal/zzqw;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    return-void
.end method
