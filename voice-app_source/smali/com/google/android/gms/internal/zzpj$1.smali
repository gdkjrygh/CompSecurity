.class Lcom/google/android/gms/internal/zzpj$1;
.super Lcom/google/android/gms/internal/zzpj$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzpj;->attest(Lcom/google/android/gms/common/api/GoogleApiClient;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaJA:Lcom/google/android/gms/internal/zzpj;

.field final synthetic zzaJz:[B


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzpj;Lcom/google/android/gms/common/api/GoogleApiClient;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpj$1;->zzaJA:Lcom/google/android/gms/internal/zzpj;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzpj$1;->zzaJz:[B

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzpj$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzpk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpj$1;->zza(Lcom/google/android/gms/internal/zzpk;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzpk;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj$1;->zzaJC:Lcom/google/android/gms/internal/zzph;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpj$1;->zzaJz:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzpk;->zza(Lcom/google/android/gms/internal/zzph;[B)V

    return-void
.end method
