.class abstract Lcom/google/android/gms/auth/api/credentials/internal/zzd;
.super Lcom/google/android/gms/common/api/zza$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Lcom/google/android/gms/common/api/zza$zza",
        "<TR;",
        "Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CLIENT_KEY_CREDENTIALS_API:Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/zza$zza;-><init>(Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected abstract zza(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;,
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method protected final zza(Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/auth/api/credentials/internal/zzd;->zza(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;)V

    return-void
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/zzd;->zza(Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;)V

    return-void
.end method
