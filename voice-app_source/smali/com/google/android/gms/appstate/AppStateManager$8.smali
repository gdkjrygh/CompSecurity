.class final Lcom/google/android/gms/appstate/AppStateManager$8;
.super Lcom/google/android/gms/appstate/AppStateManager$zze;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/appstate/AppStateManager;->resolve(Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic zzOm:I

.field final synthetic zzOp:Ljava/lang/String;

.field final synthetic zzOq:[B


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;[B)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOm:I

    iput-object p3, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOp:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOq:[B

    invoke-direct {p0, p1}, Lcom/google/android/gms/appstate/AppStateManager$zze;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzjb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/appstate/AppStateManager$8;->zza(Lcom/google/android/gms/internal/zzjb;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzjb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOm:I

    iget-object v1, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOp:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/appstate/AppStateManager$8;->zzOq:[B

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/internal/zzjb;->zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;[B)V

    return-void
.end method
