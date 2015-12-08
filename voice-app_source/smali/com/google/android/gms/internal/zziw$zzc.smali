.class final Lcom/google/android/gms/internal/zziw$zzc;
.super Lcom/google/android/gms/internal/zziw$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zziw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "zzc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zziw$zza",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzNZ:Ljava/lang/String;

.field final synthetic zzOa:Lcom/google/android/gms/internal/zziw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zziw;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zziw$zzc;->zzOa:Lcom/google/android/gms/internal/zziw;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zziw$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/zziw$zzc;->zzNZ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zziw$zzc;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

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

    check-cast p1, Lcom/google/android/gms/internal/zzix;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zziw$zzc;->zza(Lcom/google/android/gms/internal/zzix;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzix;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zziw$zzc$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zziw$zzc$1;-><init>(Lcom/google/android/gms/internal/zziw$zzc;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zziw$zzc;->zzNZ:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzix;->zza(Lcom/google/android/gms/internal/zziy;Ljava/lang/String;)V

    return-void
.end method

.method protected zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method
