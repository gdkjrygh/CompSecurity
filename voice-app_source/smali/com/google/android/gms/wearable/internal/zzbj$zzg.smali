.class final Lcom/google/android/gms/wearable/internal/zzbj$zzg;
.super Lcom/google/android/gms/wearable/internal/zzbj$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/zzbj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "zzg"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzbj$zzb",
        "<",
        "Lcom/google/android/gms/wearable/CapabilityApi$GetCapabilityResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/zza$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/wearable/CapabilityApi$GetCapabilityResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbj$zzb;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzg$zze;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbg;->zzfn(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzg$zzc;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->zzaUr:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-direct {v2, v3}, Lcom/google/android/gms/wearable/internal/zzg$zzc;-><init>(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzg$zze;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbj$zzg;->zzP(Ljava/lang/Object;)V

    return-void
.end method
