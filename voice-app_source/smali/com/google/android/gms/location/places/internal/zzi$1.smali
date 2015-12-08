.class Lcom/google/android/gms/location/places/internal/zzi$1;
.super Lcom/google/android/gms/location/places/zzm$zzd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/zzi;->getCurrentPlace(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/places/PlaceFilter;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/zzm$zzd",
        "<",
        "Lcom/google/android/gms/location/places/internal/zzj;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzaAp:Lcom/google/android/gms/location/places/PlaceFilter;

.field final synthetic zzaAq:Lcom/google/android/gms/location/places/internal/zzi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/zzi;Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/places/PlaceFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/zzi$1;->zzaAq:Lcom/google/android/gms/location/places/internal/zzi;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/zzi$1;->zzaAp:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/zzm$zzd;-><init>(Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/location/places/internal/zzj;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/zzi$1;->zza(Lcom/google/android/gms/location/places/internal/zzj;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/places/internal/zzj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/zzm;

    invoke-virtual {p1}, Lcom/google/android/gms/location/places/internal/zzj;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/location/places/zzm;-><init>(Lcom/google/android/gms/location/places/zzm$zzd;Landroid/content/Context;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/zzi$1;->zzaAp:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/places/internal/zzj;->zza(Lcom/google/android/gms/location/places/zzm;Lcom/google/android/gms/location/places/PlaceFilter;)V

    return-void
.end method
