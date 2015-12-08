.class Lcom/google/android/gms/drive/internal/zzy$1;
.super Lcom/google/android/gms/drive/internal/zzy$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzy;->getFileUploadPreferences(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzafu:Lcom/google/android/gms/drive/internal/zzy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzy$1;->zzafu:Lcom/google/android/gms/drive/internal/zzy;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzy$zzc;-><init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/drive/internal/zzs;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzy$1;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzs;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->zzpB()Lcom/google/android/gms/drive/internal/zzak;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/zzy$zza;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzy$1;->zzafu:Lcom/google/android/gms/drive/internal/zzy;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v3}, Lcom/google/android/gms/drive/internal/zzy$zza;-><init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/drive/internal/zzy$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/zzak;->zzd(Lcom/google/android/gms/drive/internal/zzal;)V

    return-void
.end method
