.class Lcom/google/android/gms/drive/internal/zzq$zzf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/DriveApi$MetadataBufferResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/zzq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "zzf"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzaeK:Lcom/google/android/gms/drive/MetadataBuffer;

.field private final zzaeL:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/MetadataBuffer;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzaeK:Lcom/google/android/gms/drive/MetadataBuffer;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzaeL:Z

    return-void
.end method


# virtual methods
.method public getMetadataBuffer()Lcom/google/android/gms/drive/MetadataBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzaeK:Lcom/google/android/gms/drive/MetadataBuffer;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzaeK:Lcom/google/android/gms/drive/MetadataBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zzf;->zzaeK:Lcom/google/android/gms/drive/MetadataBuffer;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/MetadataBuffer;->release()V

    :cond_0
    return-void
.end method
