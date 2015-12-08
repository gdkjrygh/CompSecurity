.class abstract Lcom/google/android/gms/internal/zzka$zzb;
.super Lcom/google/android/gms/common/api/zza$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzka;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzka$zzb$zzb;,
        Lcom/google/android/gms/internal/zzka$zzb$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/zza$zza",
        "<",
        "Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionResult;",
        "Lcom/google/android/gms/internal/zzkb;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzVx:Lcom/google/android/gms/internal/zzka;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzka;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzka$zzb;->zzVx:Lcom/google/android/gms/internal/zzka;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzka;->zzc(Lcom/google/android/gms/internal/zzka;)Lcom/google/android/gms/common/api/Api$ClientKey;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/common/api/zza$zza;-><init>(Lcom/google/android/gms/common/api/Api$ClientKey;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzka$zzb;->zzq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionResult;

    move-result-object v0

    return-object v0
.end method

.method protected zzq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzka$zzc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzka$zzc;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
