.class Lcom/google/android/gms/internal/zzoq$4;
.super Lcom/google/android/gms/internal/zzoq$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzoq;->sendConnectionRequest(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/Connections$ConnectionResponseCallback;Lcom/google/android/gms/nearby/connection/Connections$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$name:Ljava/lang/String;

.field final synthetic zzaFJ:Lcom/google/android/gms/internal/zzoq;

.field final synthetic zzaFL:Lcom/google/android/gms/common/api/zzi;

.field final synthetic zzaFM:Lcom/google/android/gms/common/api/zzi;

.field final synthetic zzaFs:Ljava/lang/String;

.field final synthetic zzarU:[B


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzoq;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFJ:Lcom/google/android/gms/internal/zzoq;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzoq$4;->val$name:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFs:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzoq$4;->zzarU:[B

    iput-object p6, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFL:Lcom/google/android/gms/common/api/zzi;

    iput-object p7, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFM:Lcom/google/android/gms/common/api/zzi;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/zzoq$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzoq$1;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzop;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzoq$4;->zza(Lcom/google/android/gms/internal/zzop;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzop;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/internal/zzoq$4;->val$name:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFs:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzoq$4;->zzarU:[B

    iget-object v5, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFL:Lcom/google/android/gms/common/api/zzi;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzoq$4;->zzaFM:Lcom/google/android/gms/common/api/zzi;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzop;->zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;)V

    return-void
.end method
