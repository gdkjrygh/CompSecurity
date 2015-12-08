.class Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/zzo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzTb:Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;->zzTb:Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(JILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p4, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    check-cast p4, Lorg/json/JSONObject;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;->zzTb:Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;

    new-instance v1, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzc;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, p4}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzc;-><init>(Lcom/google/android/gms/common/api/Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void

    :cond_0
    move-object p4, v0

    goto :goto_0
.end method

.method public zzy(J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;->zzTb:Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;->zzTb:Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x837

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->zzn(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
