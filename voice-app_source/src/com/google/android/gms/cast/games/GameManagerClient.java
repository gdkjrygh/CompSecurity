// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.games;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.internal.zzjs;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//            GameManagerState

public final class GameManagerClient
{
    public static interface GameManagerInstanceResult
        extends Result
    {

        public abstract GameManagerClient getGameManagerClient();
    }

    public static interface GameManagerResult
        extends Result
    {

        public abstract JSONObject getExtraMessageData();

        public abstract String getPlayerId();

        public abstract long getRequestId();
    }

    public static interface Listener
    {

        public abstract void onGameMessageReceived(String s, JSONObject jsonobject);

        public abstract void onStateChanged(GameManagerState gamemanagerstate, GameManagerState gamemanagerstate1);
    }


    public static final int GAMEPLAY_STATE_LOADING = 1;
    public static final int GAMEPLAY_STATE_PAUSED = 3;
    public static final int GAMEPLAY_STATE_RUNNING = 2;
    public static final int GAMEPLAY_STATE_SHOWING_INFO_SCREEN = 4;
    public static final int GAMEPLAY_STATE_UNKNOWN = 0;
    public static final int LOBBY_STATE_CLOSED = 2;
    public static final int LOBBY_STATE_OPEN = 1;
    public static final int LOBBY_STATE_UNKNOWN = 0;
    public static final int PLAYER_STATE_AVAILABLE = 3;
    public static final int PLAYER_STATE_DROPPED = 1;
    public static final int PLAYER_STATE_IDLE = 5;
    public static final int PLAYER_STATE_PLAYING = 6;
    public static final int PLAYER_STATE_QUIT = 2;
    public static final int PLAYER_STATE_READY = 4;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int STATUS_INCORRECT_VERSION = 2150;
    public static final int STATUS_TOO_MANY_PLAYERS = 2151;
    private final zzjs zzTm;

    public GameManagerClient(zzjs zzjs1)
    {
        zzTm = zzjs1;
    }

    public static PendingResult getInstanceFor(GoogleApiClient googleapiclient, String s)
        throws IllegalArgumentException
    {
        return zza(new zzjs(googleapiclient, s, Cast.CastApi));
    }

    static PendingResult zza(zzjs zzjs1)
        throws IllegalArgumentException
    {
        return zzjs1.zza(new GameManagerClient(zzjs1));
    }

    private PendingResult zza(String s, int i, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zzTm.zza(s, i, jsonobject);
    }

    public void dispose()
    {
        zzTm.dispose();
    }

    public GameManagerState getCurrentState()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        GameManagerState gamemanagerstate = zzTm.getCurrentState();
        this;
        JVM INSTR monitorexit ;
        return gamemanagerstate;
        Exception exception;
        exception;
        throw exception;
    }

    public String getLastUsedPlayerId()
        throws IllegalStateException
    {
        return zzTm.getLastUsedPlayerId();
    }

    public boolean isDisposed()
    {
        return zzTm.isDisposed();
    }

    public void sendGameMessage(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        zzTm.sendGameMessage(s, jsonobject);
    }

    public void sendGameMessage(JSONObject jsonobject)
        throws IllegalStateException
    {
        sendGameMessage(getLastUsedPlayerId(), jsonobject);
    }

    public PendingResult sendGameRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zzTm.sendGameRequest(s, jsonobject);
    }

    public PendingResult sendGameRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return sendGameRequest(getLastUsedPlayerId(), jsonobject);
    }

    public PendingResult sendPlayerAvailableRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(s, 3, jsonobject);
    }

    public PendingResult sendPlayerAvailableRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(getLastUsedPlayerId(), 3, jsonobject);
    }

    public PendingResult sendPlayerIdleRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(s, 5, jsonobject);
    }

    public PendingResult sendPlayerIdleRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(getLastUsedPlayerId(), 5, jsonobject);
    }

    public PendingResult sendPlayerPlayingRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(s, 6, jsonobject);
    }

    public PendingResult sendPlayerPlayingRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(getLastUsedPlayerId(), 6, jsonobject);
    }

    public PendingResult sendPlayerQuitRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(s, 2, jsonobject);
    }

    public PendingResult sendPlayerQuitRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(getLastUsedPlayerId(), 2, jsonobject);
    }

    public PendingResult sendPlayerReadyRequest(String s, JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(s, 4, jsonobject);
    }

    public PendingResult sendPlayerReadyRequest(JSONObject jsonobject)
        throws IllegalStateException
    {
        return zza(getLastUsedPlayerId(), 4, jsonobject);
    }

    public void setListener(Listener listener)
    {
        zzTm.setListener(listener);
    }

    public void setSessionLabel(String s)
    {
        zzTm.setSessionLabel(s);
    }
}
