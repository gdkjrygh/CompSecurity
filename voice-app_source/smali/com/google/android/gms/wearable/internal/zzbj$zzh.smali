.class final Lcom/google/android/gms/wearable/internal/zzbj$zzh;
.super Lcom/google/android/gms/wearable/internal/zzbj$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/zzbj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "zzh"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzbj$zzb",
        "<",
        "Lcom/google/android/gms/wearable/Channel$GetInputStreamResult;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzaUQ:Lcom/google/android/gms/wearable/internal/zzq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/wearable/internal/zzq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/wearable/Channel$GetInputStreamResult;",
            ">;",
            "Lcom/google/android/gms/wearable/internal/zzq;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbj$zzb;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzq;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbj$zzh;->zzaUQ:Lcom/google/android/gms/wearable/internal/zzq;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/wearable/internal/GetChannelInputStreamResponse;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p1, Lcom/google/android/gms/wearable/internal/GetChannelInputStreamResponse;->zzaUs:Landroid/os/ParcelFileDescriptor;

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzm;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/GetChannelInputStreamResponse;->zzaUs:Landroid/os/ParcelFileDescriptor;

    invoke-direct {v1, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/internal/zzm;-><init>(Ljava/io/InputStream;)V

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzbj$zzh;->zzaUQ:Lcom/google/android/gms/wearable/internal/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/internal/zzm;->zzBb()Lcom/google/android/gms/wearable/internal/zzr;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/wearable/internal/zzq;->zza(Lcom/google/android/gms/wearable/internal/zzr;)V

    :cond_0
    new-instance v1, Lcom/google/android/gms/wearable/internal/ChannelImpl$zza;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    iget v3, p1, Lcom/google/android/gms/wearable/internal/GetChannelInputStreamResponse;->statusCode:I

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/wearable/internal/ChannelImpl$zza;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/io/InputStream;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/wearable/internal/zzbj$zzh;->zzP(Ljava/lang/Object;)V

    return-void
.end method
