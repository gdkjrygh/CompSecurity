.class Lcom/google/android/gms/drive/internal/zzu$1;
.super Lcom/google/android/gms/drive/internal/zzq$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzu;->open(Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaeI:I

.field final synthetic zzafg:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

.field final synthetic zzafh:Lcom/google/android/gms/drive/internal/zzu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzu;Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzafh:Lcom/google/android/gms/drive/internal/zzu;

    iput p3, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaeI:I

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzafg:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/zzq$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzu$1;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzs;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->zzpB()Lcom/google/android/gms/drive/internal/zzak;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/OpenContentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzafh:Lcom/google/android/gms/drive/internal/zzu;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/internal/zzu;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaeI:I

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/OpenContentsRequest;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    new-instance v2, Lcom/google/android/gms/drive/internal/zzbi;

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzafg:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/drive/internal/zzbi;-><init>(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/zzak;->zza(Lcom/google/android/gms/drive/internal/OpenContentsRequest;Lcom/google/android/gms/drive/internal/zzal;)Lcom/google/android/gms/drive/internal/DriveServiceResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/DriveServiceResponse;->zzpF()Lcom/google/android/gms/common/internal/ICancelToken;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/internal/zzu$1;->setCancelToken(Lcom/google/android/gms/common/internal/ICancelToken;)V

    return-void
.end method
