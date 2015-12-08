.class final Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzSY:J

.field final synthetic zzSZ:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;->zzSZ:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;->zzSY:J

    return-void
.end method


# virtual methods
.method public synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Result;

    .prologue
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .end local p1    # "x0":Lcom/google/android/gms/common/api/Result;
    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;->zzm(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public zzm(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;->zzSZ:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    iget-object v0, v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;->zzSz:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzg(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/internal/zzm;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza$zza;->zzSY:J

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/cast/internal/zzm;->zzb(JI)V

    :cond_0
    return-void
.end method
