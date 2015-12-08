.class Lcom/google/android/gms/internal/zzpj$zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/safetynet/SafetyNetApi$AttestationResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "zza"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field private final zzaJB:Lcom/google/android/gms/safetynet/AttestationData;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpj$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzpj$zza;->zzaJB:Lcom/google/android/gms/safetynet/AttestationData;

    return-void
.end method


# virtual methods
.method public getJwsResult()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj$zza;->zzaJB:Lcom/google/android/gms/safetynet/AttestationData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj$zza;->zzaJB:Lcom/google/android/gms/safetynet/AttestationData;

    invoke-virtual {v0}, Lcom/google/android/gms/safetynet/AttestationData;->getJwsResult()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpj$zza;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
