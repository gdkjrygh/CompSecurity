.class public Lcom/google/android/gms/location/internal/zzb;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/location/internal/zzg;",
        ">;"
    }
.end annotation


# instance fields
.field protected final zzayq:Lcom/google/android/gms/location/internal/zzn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/location/internal/zzn",
            "<",
            "Lcom/google/android/gms/location/internal/zzg;",
            ">;"
        }
    .end annotation
.end field

.field private final zzayw:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Lcom/google/android/gms/common/internal/zze;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V

    new-instance v0, Lcom/google/android/gms/location/internal/zzb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/internal/zzb$1;-><init>(Lcom/google/android/gms/location/internal/zzb;)V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/zzb;->zzayq:Lcom/google/android/gms/location/internal/zzn;

    iput-object p5, p0, Lcom/google/android/gms/location/internal/zzb;->zzayw:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/location/internal/zzb;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/zzb;->zznL()V

    return-void
.end method


# virtual methods
.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zzb;->zzbU(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/zzg;

    move-result-object v0

    return-object v0
.end method

.method protected zzbU(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/zzg;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/location/internal/zzg$zza;->zzbW(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/zzg;

    move-result-object v0

    return-object v0
.end method

.method protected zzkR()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcom/google/android/gms/location/internal/zzb;->zzayw:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
