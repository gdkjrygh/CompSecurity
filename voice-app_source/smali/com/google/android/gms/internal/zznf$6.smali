.class Lcom/google/android/gms/internal/zznf$6;
.super Lcom/google/android/gms/internal/zzmd$zzc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zznf;->unregisterForSessions(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzalC:Lcom/google/android/gms/internal/zznf;

.field final synthetic zzalv:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznf;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zznf$6;->zzalC:Lcom/google/android/gms/internal/zznf;

    iput-object p3, p0, Lcom/google/android/gms/internal/zznf$6;->zzalv:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzmd$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/zzmd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zznf$6;->zza(Lcom/google/android/gms/internal/zzmd;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzmd;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzng;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzng;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmd;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzmd;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzmo;

    new-instance v3, Lcom/google/android/gms/fitness/request/SessionUnregistrationRequest;

    iget-object v4, p0, Lcom/google/android/gms/internal/zznf$6;->zzalv:Landroid/app/PendingIntent;

    invoke-direct {v3, v4, v1, v2}, Lcom/google/android/gms/fitness/request/SessionUnregistrationRequest;-><init>(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/zzmu;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzmo;->zza(Lcom/google/android/gms/fitness/request/SessionUnregistrationRequest;)V

    return-void
.end method
