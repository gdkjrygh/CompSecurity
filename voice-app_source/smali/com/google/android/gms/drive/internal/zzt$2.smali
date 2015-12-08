.class Lcom/google/android/gms/drive/internal/zzt$2;
.super Lcom/google/android/gms/drive/internal/zzr$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzt;->commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzafd:Lcom/google/android/gms/drive/internal/zzt;

.field final synthetic zzafe:Lcom/google/android/gms/drive/MetadataChangeSet;

.field final synthetic zzaff:Lcom/google/android/gms/drive/ExecutionOptions;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzt;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafd:Lcom/google/android/gms/drive/internal/zzt;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafe:Lcom/google/android/gms/drive/MetadataChangeSet;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzaff:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/zzr$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzt$2;->zza(Lcom/google/android/gms/drive/internal/zzs;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzs;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafe:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/MetadataChangeSet;->zzpm()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->setContext(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzs;->zzpB()Lcom/google/android/gms/drive/internal/zzak;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafd:Lcom/google/android/gms/drive/internal/zzt;

    invoke-static {v1}, Lcom/google/android/gms/drive/internal/zzt;->zza(Lcom/google/android/gms/drive/internal/zzt;)Lcom/google/android/gms/drive/Contents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafe:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/MetadataChangeSet;->zzpm()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafd:Lcom/google/android/gms/drive/internal/zzt;

    invoke-static {v3}, Lcom/google/android/gms/drive/internal/zzt;->zza(Lcom/google/android/gms/drive/internal/zzt;)Lcom/google/android/gms/drive/Contents;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/drive/Contents;->getRequestId()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzafd:Lcom/google/android/gms/drive/internal/zzt;

    invoke-static {v4}, Lcom/google/android/gms/drive/internal/zzt;->zza(Lcom/google/android/gms/drive/internal/zzt;)Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/drive/Contents;->zzpc()Z

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/zzt$2;->zzaff:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IZLcom/google/android/gms/drive/ExecutionOptions;)V

    new-instance v1, Lcom/google/android/gms/drive/internal/zzbq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/zzbq;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-interface {v6, v0, v1}, Lcom/google/android/gms/drive/internal/zzak;->zza(Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;Lcom/google/android/gms/drive/internal/zzal;)V

    return-void
.end method
