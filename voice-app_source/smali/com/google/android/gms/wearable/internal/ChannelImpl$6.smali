.class Lcom/google/android/gms/wearable/internal/ChannelImpl$6;
.super Lcom/google/android/gms/wearable/internal/zzf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ChannelImpl;->sendFile(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;JJ)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/zzf",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic zzaGx:Landroid/net/Uri;

.field final synthetic zzaTR:Lcom/google/android/gms/wearable/internal/ChannelImpl;

.field final synthetic zzaTT:J

.field final synthetic zzaTU:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ChannelImpl;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTR:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaGx:Landroid/net/Uri;

    iput-wide p4, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTT:J

    iput-wide p6, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTU:J

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzf;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$Client;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zza(Lcom/google/android/gms/wearable/internal/zzbk;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbk;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTR:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/ChannelImpl;->zza(Lcom/google/android/gms/wearable/internal/ChannelImpl;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaGx:Landroid/net/Uri;

    iget-wide v4, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTT:J

    iget-wide v6, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$6;->zzaTU:J

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/wearable/internal/zzbk;->zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;Landroid/net/Uri;JJ)V

    return-void
.end method

.method public zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method
