.class public final Lcom/google/android/gms/internal/zzjj;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/internal/zzjl;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzOR:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zze;Lcom/google/android/gms/auth/api/Auth$zza;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    const/16 v3, 0x10

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p6

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V

    if-nez p4, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/zzjj;->zzOR:Landroid/os/Bundle;

    return-void

    :cond_0
    invoke-virtual {p4}, Lcom/google/android/gms/auth/api/Auth$zza;->zzkY()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.internal.IAuthService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.service.START"

    return-object v0
.end method

.method public requiresSignIn()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjj;->zznK()Lcom/google/android/gms/common/internal/zze;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zze;->getAccountName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/google/android/gms/auth/api/Auth;->zzOL:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/zze;->zzb(Lcom/google/android/gms/common/api/Api;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzjj;->zzar(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzjl;

    move-result-object v0

    return-object v0
.end method

.method protected zzar(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzjl;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzjl$zza;->zzat(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzjl;

    move-result-object v0

    return-object v0
.end method

.method protected zzkR()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjj;->zzOR:Landroid/os/Bundle;

    return-object v0
.end method
