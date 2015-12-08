.class Lcom/google/android/gms/drive/internal/zzz$1;
.super Lcom/google/android/gms/drive/internal/zzz$zzd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzz;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzafx:Z

.field final synthetic zzafy:Lcom/google/android/gms/drive/internal/zzz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzz;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzz$1;->zzafy:Lcom/google/android/gms/drive/internal/zzz;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/internal/zzz$1;->zzafx:Z

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/zzz$zzd;-><init>(Lcom/google/android/gms/drive/internal/zzz;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/internal/zzz$1;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzz$1;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

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

    new-instance v1, Lcom/google/android/gms/drive/internal/GetMetadataRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzz$1;->zzafy:Lcom/google/android/gms/drive/internal/zzz;

    iget-object v2, v2, Lcom/google/android/gms/drive/internal/zzz;->zzacT:Lcom/google/android/gms/drive/DriveId;

    iget-boolean v3, p0, Lcom/google/android/gms/drive/internal/zzz$1;->zzafx:Z

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/GetMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Z)V

    new-instance v2, Lcom/google/android/gms/drive/internal/zzz$zzb;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/zzz$zzb;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/zzak;->zza(Lcom/google/android/gms/drive/internal/GetMetadataRequest;Lcom/google/android/gms/drive/internal/zzal;)V

    return-void
.end method
