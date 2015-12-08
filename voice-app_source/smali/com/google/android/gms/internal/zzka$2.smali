.class Lcom/google/android/gms/internal/zzka$2;
.super Lcom/google/android/gms/internal/zzka$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzka;->startRemoteDisplay(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzVx:Lcom/google/android/gms/internal/zzka;

.field final synthetic zzVy:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzka;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzka$2;->zzVx:Lcom/google/android/gms/internal/zzka;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzka$2;->zzVy:Ljava/lang/String;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzka$2;->zza(Lcom/google/android/gms/internal/zzkb;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzkb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzka$zzb$zza;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzka$zzb$zza;-><init>(Lcom/google/android/gms/internal/zzka$zzb;Lcom/google/android/gms/internal/zzkb;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzka$2;->zzVx:Lcom/google/android/gms/internal/zzka;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzka;->zzb(Lcom/google/android/gms/internal/zzka;)Lcom/google/android/gms/internal/zzke;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzka$2;->zzVy:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzkb;->zza(Lcom/google/android/gms/internal/zzkc;Lcom/google/android/gms/internal/zzke;Ljava/lang/String;)V

    return-void
.end method
