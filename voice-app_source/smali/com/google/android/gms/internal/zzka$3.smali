.class Lcom/google/android/gms/internal/zzka$3;
.super Lcom/google/android/gms/internal/zzka$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzka;->stopRemoteDisplay(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzVx:Lcom/google/android/gms/internal/zzka;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzka;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzka$3;->zzVx:Lcom/google/android/gms/internal/zzka;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzka$zzb;-><init>(Lcom/google/android/gms/internal/zzka;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzkb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzka$3;->zza(Lcom/google/android/gms/internal/zzkb;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzkb;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzka$zzb$zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzka$zzb$zzb;-><init>(Lcom/google/android/gms/internal/zzka$zzb;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzkb;->zza(Lcom/google/android/gms/internal/zzkc;)V

    return-void
.end method
