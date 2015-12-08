.class public final Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "T",
            "L;",
            ")",
            "Lcom/google/android/gms/common/api/zzi",
            "<T",
            "L;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public create(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 4
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/Games;->zzb(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza(Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    goto :goto_0
.end method

.method public declineInvitation(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "invitationId"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/games/Games;->zzb(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzr(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public dismissInvitation(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "invitationId"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/games/Games;->zzb(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzq(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public getSelectOpponentsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;II)Landroid/content/Intent;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "minPlayers"    # I
    .param p3, "maxPlayers"    # I

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzc(IIZ)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getSelectOpponentsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;IIZ)Landroid/content/Intent;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "minPlayers"    # I
    .param p3, "maxPlayers"    # I
    .param p4, "allowAutomatch"    # Z

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzc(IIZ)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getWaitingRoomIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "room"    # Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .param p3, "minParticipantsToStart"    # I

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public join(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 4
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "config"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    .prologue
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/Games;->zzb(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzb(Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/common/api/zzi;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    goto :goto_0
.end method

.method public leave(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    .param p3, "roomId"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/Games;->zzb(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzo(Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza(Lcom/google/android/gms/common/api/zzi;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public sendReliableMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "callback"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;
    .param p3, "messageData"    # [B
    .param p4, "roomId"    # Ljava/lang/String;
    .param p5, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    invoke-static {p1, p2}, Lcom/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;)Lcom/google/android/gms/common/api/zzi;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v1

    invoke-virtual {v1, v0, p3, p4, p5}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza(Lcom/google/android/gms/common/api/zzi;[BLjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableMessage(Lcom/google/android/gms/common/api/GoogleApiClient;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 3
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "messageData"    # [B
    .param p3, "roomId"    # Ljava/lang/String;
    .param p4, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p4, v1, v2

    invoke-virtual {v0, p2, p3, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableMessage(Lcom/google/android/gms/common/api/GoogleApiClient;[BLjava/lang/String;Ljava/util/List;)I
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "messageData"    # [B
    .param p3, "roomId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "[B",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .local p4, "recipientParticipantIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v1

    invoke-virtual {v1, p2, p3, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zza([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendUnreliableMessageToOthers(Lcom/google/android/gms/common/api/GoogleApiClient;[BLjava/lang/String;)I
    .locals 1
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "messageData"    # [B
    .param p3, "roomId"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/games/Games;->zzd(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzd([BLjava/lang/String;)I

    move-result v0

    return v0
.end method
