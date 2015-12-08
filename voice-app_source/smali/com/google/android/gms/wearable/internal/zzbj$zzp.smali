.class final Lcom/google/android/gms/wearable/internal/zzbj$zzp;
.super Lcom/google/android/gms/wearable/internal/zzbj$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/zzbj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "zzp"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzbj$zzb",
        "<",
        "Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;",
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
            "Lcom/google/android/gms/wearable/ChannelApi$OpenChannelResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbj$zzb;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/wearable/internal/OpenChannelResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzi$zzb;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/OpenChannelResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbg;->zzfn(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/OpenChannelResponse;->zzaTP:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzi$zzb;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/Channel;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbj$zzp;->zzP(Ljava/lang/Object;)V

    return-void
.end method
