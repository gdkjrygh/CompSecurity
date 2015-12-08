.class abstract Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;
.super Lcom/google/android/gms/cast/internal/zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/RemoteMediaPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/cast/internal/zzb",
        "<",
        "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
        ">;"
    }
.end annotation


# instance fields
.field zzTa:Lcom/google/android/gms/cast/internal/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->zzTa:Lcom/google/android/gms/cast/internal/zzo;

    return-void
.end method


# virtual methods
.method public synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Status;

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->zzn(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;

    move-result-object v0

    return-object v0
.end method

.method public zzn(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$2;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
