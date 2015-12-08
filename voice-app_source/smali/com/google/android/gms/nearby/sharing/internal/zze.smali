.class Lcom/google/android/gms/nearby/sharing/internal/zze;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/nearby/sharing/internal/zzd;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V
    .locals 7

    const/16 v3, 0x31

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V

    return-void
.end method


# virtual methods
.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.sharing.internal.INearbySharingService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.sharing.service.NearbySharingService.START"

    return-object v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/sharing/internal/zze;->zzdl(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzd;

    move-result-object v0

    return-object v0
.end method

.method protected zzdl(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzd;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/nearby/sharing/internal/zzd$zza;->zzdk(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzd;

    move-result-object v0

    return-object v0
.end method
