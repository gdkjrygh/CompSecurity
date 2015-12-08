.class Lcom/google/android/gms/wearable/internal/zzav$1;
.super Lcom/google/android/gms/wearable/internal/zzf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/zzav;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzf",
        "<",
        "Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzOn:[B

.field final synthetic zzaTI:Ljava/lang/String;

.field final synthetic zzaUC:Ljava/lang/String;

.field final synthetic zzaUD:Lcom/google/android/gms/wearable/internal/zzav;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzav;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzaUD:Lcom/google/android/gms/wearable/internal/zzav;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzaTI:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzaUC:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzOn:[B

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzf;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzav$1;->zzbh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzav$1;->zza(Lcom/google/android/gms/wearable/internal/zzbk;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbk;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzaTI:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzaUC:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/zzav$1;->zzOn:[B

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzbk;->zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method protected zzbh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzav$zzb;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/zzav$zzb;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    return-object v0
.end method
