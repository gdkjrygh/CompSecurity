.class public Lcom/google/android/gms/cast/RemoteMediaPlayer;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$zzc;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;,
        Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;
    }
.end annotation


# static fields
.field public static final RESUME_STATE_PAUSE:I = 0x2

.field public static final RESUME_STATE_PLAY:I = 0x1

.field public static final RESUME_STATE_UNCHANGED:I = 0x0

.field public static final STATUS_CANCELED:I = 0x835

.field public static final STATUS_FAILED:I = 0x834

.field public static final STATUS_REPLACED:I = 0x837

.field public static final STATUS_SUCCEEDED:I = 0x0

.field public static final STATUS_TIMED_OUT:I = 0x836


# instance fields
.field private final zzSt:Lcom/google/android/gms/cast/internal/zzm;

.field private final zzSu:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

.field private zzSv:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;

.field private zzSw:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;

.field private zzSx:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;

.field private zzSy:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;

.field private final zzqt:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSu:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$1;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSu:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/zzm;->zza(Lcom/google/android/gms/cast/internal/zzn;)V

    return-void
.end method

.method private onMetadataUpdated()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSx:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSx:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;

    invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;->onMetadataUpdated()V

    :cond_0
    return-void
.end method

.method private onPreloadStatusUpdated()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSv:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSv:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;

    invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;->onPreloadStatusUpdated()V

    :cond_0
    return-void
.end method

.method private onQueueStatusUpdated()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSw:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSw:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;

    invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;->onQueueStatusUpdated()V

    :cond_0
    return-void
.end method

.method private onStatusUpdated()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSy:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSy:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;

    invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;->onStatusUpdated()V

    :cond_0
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/cast/RemoteMediaPlayer;I)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzaH(I)I

    move-result v0

    return v0
.end method

.method static synthetic zza(Lcom/google/android/gms/cast/RemoteMediaPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onStatusUpdated()V

    return-void
.end method

.method private zzaH(I)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaStatus;->getQueueItemCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/MediaStatus;->getQueueItem(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/cast/MediaQueueItem;->getItemId()I

    move-result v2

    if-ne v2, p1, :cond_0

    :goto_1
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic zzb(Lcom/google/android/gms/cast/RemoteMediaPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onMetadataUpdated()V

    return-void
.end method

.method static synthetic zzc(Lcom/google/android/gms/cast/RemoteMediaPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onQueueStatusUpdated()V

    return-void
.end method

.method static synthetic zzd(Lcom/google/android/gms/cast/RemoteMediaPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onPreloadStatusUpdated()V

    return-void
.end method

.method static synthetic zze(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSu:Lcom/google/android/gms/cast/RemoteMediaPlayer$zza;

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/internal/zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    return-object v0
.end method


# virtual methods
.method public getApproximateStreamPosition()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/zzm;->getApproximateStreamPosition()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/zzm;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/zzm;->getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/zzm;->getNamespace()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStreamDuration()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzqt:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/zzm;->getStreamDuration()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "mediaInfo"    # Lcom/google/android/gms/cast/MediaInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "mediaInfo"    # Lcom/google/android/gms/cast/MediaInfo;
    .param p3, "autoplay"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "Z)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "mediaInfo"    # Lcom/google/android/gms/cast/MediaInfo;
    .param p3, "autoplay"    # Z
    .param p4, "playPosition"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "mediaInfo"    # Lcom/google/android/gms/cast/MediaInfo;
    .param p3, "autoplay"    # Z
    .param p4, "playPosition"    # J
    .param p6, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 10
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "mediaInfo"    # Lcom/google/android/gms/cast/MediaInfo;
    .param p3, "autoplay"    # Z
    .param p4, "playPosition"    # J
    .param p6, "activeTrackIds"    # [J
    .param p7, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ[J",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$12;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/cast/RemoteMediaPlayer$12;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public onMessageReceived(Lcom/google/android/gms/cast/CastDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "castDevice"    # Lcom/google/android/gms/cast/CastDevice;
    .param p2, "namespace"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSt:Lcom/google/android/gms/cast/internal/zzm;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/cast/internal/zzm;->zzbB(Ljava/lang/String;)V

    return-void
.end method

.method public pause(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->pause(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public pause(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$16;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$16;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public play(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->play(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public play(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$18;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$18;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueAppendItem(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "item"    # Lcom/google/android/gms/cast/MediaQueueItem;
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/cast/MediaQueueItem;

    aput-object p2, v0, v1

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->queueInsertItems(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public queueInsertItems(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 7
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemsToInsert"    # [Lcom/google/android/gms/cast/MediaQueueItem;
    .param p3, "insertBeforeItemId"    # I
    .param p4, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/RemoteMediaPlayer$5;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueJumpToItem(Lcom/google/android/gms/common/api/GoogleApiClient;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemId"    # I
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$14;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$14;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueLoad(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "items"    # [Lcom/google/android/gms/cast/MediaQueueItem;
    .param p3, "startIndex"    # I
    .param p4, "repeatMode"    # I
    .param p5, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer$4;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;IILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueMoveItemToNewIndex(Lcom/google/android/gms/common/api/GoogleApiClient;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 7
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemId"    # I
    .param p3, "newIndex"    # I
    .param p4, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$15;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p1

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/RemoteMediaPlayer$15;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;IILcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueNext(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$10;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$10;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queuePrev(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$9;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$9;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueRemoveItem(Lcom/google/android/gms/common/api/GoogleApiClient;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemId"    # I
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$13;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$13;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueRemoveItems(Lcom/google/android/gms/common/api/GoogleApiClient;[ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemIdsToRemove"    # [I
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$7;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$7;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[ILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueReorderItems(Lcom/google/android/gms/common/api/GoogleApiClient;[IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 7
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemIdsToReorder"    # [I
    .param p3, "insertBeforeItemId"    # I
    .param p4, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[IILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueSetRepeatMode(Lcom/google/android/gms/common/api/GoogleApiClient;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "repeatMode"    # I
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$11;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$11;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;ILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public queueUpdateItems(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "itemsToUpdate"    # [Lcom/google/android/gms/cast/MediaQueueItem;
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$6;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$6;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public requestStatus(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$22;

    invoke-direct {v0, p0, p1, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$22;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public seek(Lcom/google/android/gms/common/api/GoogleApiClient;J)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "position"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "J)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->seek(Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public seek(Lcom/google/android/gms/common/api/GoogleApiClient;JI)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "position"    # J
    .param p4, "resumeState"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "JI)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->seek(Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public seek(Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "position"    # J
    .param p4, "resumeState"    # I
    .param p5, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "JI",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$19;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer$19;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public setActiveMediaTracks(Lcom/google/android/gms/common/api/GoogleApiClient;[J)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "trackIds"    # [J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[J)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackIds cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$2;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$2;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;[J)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public setOnMetadataUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSx:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;

    return-void
.end method

.method public setOnPreloadStatusUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSv:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnPreloadStatusUpdatedListener;

    return-void
.end method

.method public setOnQueueStatusUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSw:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnQueueStatusUpdatedListener;

    return-void
.end method

.method public setOnStatusUpdatedListener(Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->zzSy:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;

    return-void
.end method

.method public setStreamMute(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "muteState"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Z)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setStreamMute(Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public setStreamMute(Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "muteState"    # Z
    .param p3, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Z",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$21;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer$21;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public setStreamVolume(Lcom/google/android/gms/common/api/GoogleApiClient;D)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "volume"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "D)",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setStreamVolume(Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public setStreamVolume(Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 8
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "volume"    # D
    .param p4, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "D",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$20;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/RemoteMediaPlayer$20;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public setTextTrackStyle(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/TextTrackStyle;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "trackStyle"    # Lcom/google/android/gms/cast/TextTrackStyle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lcom/google/android/gms/cast/TextTrackStyle;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackStyle cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$3;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$3;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/TextTrackStyle;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method

.method public stop(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->stop(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public stop(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "customData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$17;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$17;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/zza$zza;)Lcom/google/android/gms/common/api/zza$zza;

    move-result-object v0

    return-object v0
.end method
