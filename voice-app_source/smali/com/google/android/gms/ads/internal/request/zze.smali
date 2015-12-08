.class public Lcom/google/android/gms/ads/internal/request/zze;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/ads/internal/request/zzi;",
        ">;"
    }
.end annotation


# instance fields
.field final zzCk:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;I)V
    .locals 6

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const/16 v3, 0x8

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    iput p4, p0, Lcom/google/android/gms/ads/internal/request/zze;->zzCk:I

    return-void
.end method


# virtual methods
.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.request.IAdRequestService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.service.START"

    return-object v0
.end method

.method protected zzS(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/request/zzi;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/request/zzi$zza;->zzU(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/request/zzi;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/request/zze;->zzS(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/request/zzi;

    move-result-object v0

    return-object v0
.end method

.method public zzfy()Lcom/google/android/gms/ads/internal/request/zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/common/internal/zzi;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/request/zzi;

    return-object v0
.end method
