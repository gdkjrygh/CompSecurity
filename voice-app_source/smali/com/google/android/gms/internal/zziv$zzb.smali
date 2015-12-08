.class abstract Lcom/google/android/gms/internal/zziv$zzb;
.super Lcom/google/android/gms/common/api/zza$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zziv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Lcom/google/android/gms/common/api/zza$zza",
        "<TT;",
        "Lcom/google/android/gms/internal/zzit;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/zza;->zzMO:Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/zza$zza;-><init>(Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzit;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zziv$zzb;->zza(Lcom/google/android/gms/internal/zzit;)V

    return-void
.end method

.method protected abstract zza(Lcom/google/android/gms/internal/zziq;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method protected final zza(Lcom/google/android/gms/internal/zzit;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzit;->zzkO()Lcom/google/android/gms/internal/zziq;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zziv$zzb;->zza(Lcom/google/android/gms/internal/zziq;)V

    return-void
.end method
