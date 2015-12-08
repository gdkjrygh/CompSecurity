.class public Lcom/google/android/gms/drive/internal/zzt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/DriveContents;


# instance fields
.field private mClosed:Z

.field private final zzafa:Lcom/google/android/gms/drive/Contents;

.field private zzafb:Z

.field private zzafc:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/Contents;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->mClosed:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafb:Z

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafc:Z

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/Contents;

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/drive/internal/zzt;)Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method


# virtual methods
.method public commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "changeSet"    # Lcom/google/android/gms/drive/MetadataChangeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/drive/MetadataChangeSet;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/zzt;->commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "changeSet"    # Lcom/google/android/gms/drive/MetadataChangeSet;
    .param p3, "executionOptions"    # Lcom/google/android/gms/drive/ExecutionOptions;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/drive/MetadataChangeSet;",
            "Lcom/google/android/gms/drive/ExecutionOptions;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .prologue
    if-nez p3, :cond_0

    new-instance v0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->build()Lcom/google/android/gms/drive/ExecutionOptions;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I

    move-result v0

    const/high16 v1, 0x10000000

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot commit contents opened with MODE_READ_ONLY"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/drive/ExecutionOptions;->zzpk()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/drive/ExecutionOptions;->zzbX(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->zzpc()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents must be valid for conflict detection."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p1, p3}, Lcom/google/android/gms/drive/ExecutionOptions;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/ExecutionOptions;)V

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only DriveContents obtained through DriveFile.open can be committed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-eqz p2, :cond_5

    .end local p2    # "changeSet":Lcom/google/android/gms/drive/MetadataChangeSet;
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpf()V

    new-instance v0, Lcom/google/android/gms/drive/internal/zzt$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/drive/internal/zzt$2;-><init>(Lcom/google/android/gms/drive/internal/zzt;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0

    .restart local p2    # "changeSet":Lcom/google/android/gms/drive/MetadataChangeSet;
    :cond_5
    sget-object p2, Lcom/google/android/gms/drive/MetadataChangeSet;->zzads:Lcom/google/android/gms/drive/MetadataChangeSet;

    goto :goto_0
.end method

.method public discard(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpf()V

    new-instance v0, Lcom/google/android/gms/drive/internal/zzt$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/zzt$4;-><init>(Lcom/google/android/gms/drive/internal/zzt;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/zzt$4;

    new-instance v1, Lcom/google/android/gms/drive/internal/zzt$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/zzt$3;-><init>(Lcom/google/android/gms/drive/internal/zzt;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/zzt$4;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method public getDriveId()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    return-object v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the input stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getInputStream() can only be used with contents opened with MODE_READ_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafb:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getInputStream() can only be called once per Contents instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafb:Z

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getMode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I

    move-result v0

    return v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the output stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I

    move-result v0

    const/high16 v1, 0x20000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafc:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getOutputStream() can only be called once per Contents instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafc:Z

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Contents have been closed, cannot access the output stream."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public reopenForWrite(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/drive/DriveApi$DriveContentsResult;",
            ">;"
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpg()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DriveContents already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/zzt;->zzpf()V

    new-instance v0, Lcom/google/android/gms/drive/internal/zzt$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/zzt$1;-><init>(Lcom/google/android/gms/drive/internal/zzt;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public zzpe()Lcom/google/android/gms/drive/Contents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    return-object v0
.end method

.method public zzpf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzt;->zzafa:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzlg;->zza(Landroid/os/ParcelFileDescriptor;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->mClosed:Z

    return-void
.end method

.method public zzpg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/zzt;->mClosed:Z

    return v0
.end method
