.class public final Lcom/google/android/gms/cast/games/GameManagerClient;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;,
        Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerInstanceResult;,
        Lcom/google/android/gms/cast/games/GameManagerClient$Listener;
    }
.end annotation


# static fields
.field public static final GAMEPLAY_STATE_LOADING:I = 0x1

.field public static final GAMEPLAY_STATE_PAUSED:I = 0x3

.field public static final GAMEPLAY_STATE_RUNNING:I = 0x2

.field public static final GAMEPLAY_STATE_SHOWING_INFO_SCREEN:I = 0x4

.field public static final GAMEPLAY_STATE_UNKNOWN:I = 0x0

.field public static final LOBBY_STATE_CLOSED:I = 0x2

.field public static final LOBBY_STATE_OPEN:I = 0x1

.field public static final LOBBY_STATE_UNKNOWN:I = 0x0

.field public static final PLAYER_STATE_AVAILABLE:I = 0x3

.field public static final PLAYER_STATE_DROPPED:I = 0x1

.field public static final PLAYER_STATE_IDLE:I = 0x5

.field public static final PLAYER_STATE_PLAYING:I = 0x6

.field public static final PLAYER_STATE_QUIT:I = 0x2

.field public static final PLAYER_STATE_READY:I = 0x4

.field public static final PLAYER_STATE_UNKNOWN:I = 0x0

.field public static final STATUS_INCORRECT_VERSION:I = 0x866

.field public static final STATUS_TOO_MANY_PLAYERS:I = 0x867


# instance fields
.field private final zzTm:Lcom/google/android/gms/internal/zzjs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzjs;)V
    .locals 0
    .param p1, "channel"    # Lcom/google/android/gms/internal/zzjs;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    return-void
.end method

.method public static getInstanceFor(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p0, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p1, "castSessionId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerInstanceResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/zzjs;

    sget-object v1, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/zzjs;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/Cast$CastApi;)V

    invoke-static {v0}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Lcom/google/android/gms/internal/zzjs;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method static zza(Lcom/google/android/gms/internal/zzjs;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzjs;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerInstanceResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/games/GameManagerClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/games/GameManagerClient;-><init>(Lcom/google/android/gms/internal/zzjs;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzjs;->zza(Lcom/google/android/gms/cast/games/GameManagerClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method private zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzjs;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjs;->dispose()V

    return-void
.end method

.method public declared-synchronized getCurrentState()Lcom/google/android/gms/cast/games/GameManagerState;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjs;->getCurrentState()Lcom/google/android/gms/cast/games/GameManagerState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getLastUsedPlayerId()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjs;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjs;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzjs;->sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public sendGameMessage(Lorg/json/JSONObject;)V
    .locals 1
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzjs;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendGameRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerAvailableRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerAvailableRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerIdleRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x5

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerIdleRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerPlayingRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerPlayingRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerQuitRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerQuitRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerReadyRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "playerId"    # Ljava/lang/String;
    .param p2, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public sendPlayerReadyRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2
    .param p1, "extraMessageData"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public setListener(Lcom/google/android/gms/cast/games/GameManagerClient$Listener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/cast/games/GameManagerClient$Listener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzjs;->setListener(Lcom/google/android/gms/cast/games/GameManagerClient$Listener;)V

    return-void
.end method

.method public setSessionLabel(Ljava/lang/String;)V
    .locals 1
    .param p1, "sessionLabel"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzTm:Lcom/google/android/gms/internal/zzjs;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzjs;->setSessionLabel(Ljava/lang/String;)V

    return-void
.end method
