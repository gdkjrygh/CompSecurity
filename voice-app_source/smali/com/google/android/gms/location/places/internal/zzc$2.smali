.class Lcom/google/android/gms/location/places/internal/zzc$2;
.super Lcom/google/android/gms/location/places/zzm$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/zzc;->getPlaceById(Lcom/google/android/gms/common/api/GoogleApiClient;[Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/zzm$zzc",
        "<",
        "Lcom/google/android/gms/location/places/internal/zzd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzaAh:Lcom/google/android/gms/location/places/internal/zzc;

.field final synthetic zzaAi:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/zzc;Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/zzc$2;->zzaAh:Lcom/google/android/gms/location/places/internal/zzc;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/zzc$2;->zzaAi:[Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/zzm$zzc;-><init>(Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/location/places/internal/zzd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/zzc$2;->zza(Lcom/google/android/gms/location/places/internal/zzd;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/places/internal/zzd;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/zzc$2;->zzaAi:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/location/places/zzm;

    invoke-virtual {p1}, Lcom/google/android/gms/location/places/internal/zzd;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/location/places/zzm;-><init>(Lcom/google/android/gms/location/places/zzm$zzc;Landroid/content/Context;)V

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/location/places/internal/zzd;->zza(Lcom/google/android/gms/location/places/zzm;Ljava/util/List;)V

    return-void
.end method
