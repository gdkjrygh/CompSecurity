.class Lcom/google/android/gms/internal/zzne$4;
.super Lcom/google/android/gms/internal/zzmc$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzne;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzne$zza;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzals:Lcom/google/android/gms/internal/zzne;

.field final synthetic zzalx:Lcom/google/android/gms/internal/zzne$zza;

.field final synthetic zzaly:Lcom/google/android/gms/fitness/data/zzj;

.field final synthetic zzalz:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzne;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zzne$zza;Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzne$4;->zzals:Lcom/google/android/gms/internal/zzne;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzne$4;->zzalx:Lcom/google/android/gms/internal/zzne$zza;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzne$4;->zzaly:Lcom/google/android/gms/fitness/data/zzj;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzne$4;->zzalz:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzmc$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzne$4;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

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

    check-cast p1, Lcom/google/android/gms/internal/zzmc;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzne$4;->zza(Lcom/google/android/gms/internal/zzmc;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzmc;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzne$zzc;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzne$4;->zzalx:Lcom/google/android/gms/internal/zzne$zza;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/google/android/gms/internal/zzne$zzc;-><init>(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/internal/zzne$zza;Lcom/google/android/gms/internal/zzne$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmc;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzmn;

    new-instance v3, Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzne$4;->zzaly:Lcom/google/android/gms/fitness/data/zzj;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzne$4;->zzalz:Landroid/app/PendingIntent;

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/zzj;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzmn;->zza(Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;)V

    return-void
.end method

.method protected zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method
