.class Lcom/google/android/gms/drive/internal/zzq$zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Releasable;
.implements Lcom/google/android/gms/drive/DriveApi$DriveContentsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/zzq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "zza"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzacW:Lcom/google/android/gms/drive/DriveContents;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveContents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzacW:Lcom/google/android/gms/drive/DriveContents;

    return-void
.end method


# virtual methods
.method public getDriveContents()Lcom/google/android/gms/drive/DriveContents;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzacW:Lcom/google/android/gms/drive/DriveContents;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzacW:Lcom/google/android/gms/drive/DriveContents;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzq$zza;->zzacW:Lcom/google/android/gms/drive/DriveContents;

    invoke-interface {v0}, Lcom/google/android/gms/drive/DriveContents;->zzpf()V

    :cond_0
    return-void
.end method
