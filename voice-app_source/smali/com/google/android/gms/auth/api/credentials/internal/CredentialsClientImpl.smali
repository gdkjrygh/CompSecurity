.class public final Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;",
        ">;"
    }
.end annotation


# static fields
.field public static final ACTION_START_SERVICE:Ljava/lang/String; = "com.google.android.gms.auth.api.credentials.service.START"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "looper"    # Landroid/os/Looper;
    .param p3, "connectionListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    .param p4, "connectionFailedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .prologue
    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    return-void
.end method


# virtual methods
.method protected createServiceInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;
    .locals 1
    .param p1, "binder"    # Landroid/os/IBinder;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService$zza;->zzaq(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;

    move-result-object v0

    return-object v0
.end method

.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/CredentialsClientImpl;->createServiceInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/credentials/internal/ICredentialsService;

    move-result-object v0

    return-object v0
.end method
