.class public Lcom/google/android/gms/internal/zzmc;
.super Lcom/google/android/gms/internal/zzlw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzmc$zzb;,
        Lcom/google/android/gms/internal/zzmc$zzc;,
        Lcom/google/android/gms/internal/zzmc$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzlw",
        "<",
        "Lcom/google/android/gms/internal/zzmn;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zze;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    const/16 v3, 0x37

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzlw;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V

    return-void
.end method


# virtual methods
.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.fitness.SensorsApi"

    return-object v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzmc;->zzbn(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmn;

    move-result-object v0

    return-object v0
.end method

.method protected zzbn(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmn;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzmn$zza;->zzby(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzmn;

    move-result-object v0

    return-object v0
.end method
