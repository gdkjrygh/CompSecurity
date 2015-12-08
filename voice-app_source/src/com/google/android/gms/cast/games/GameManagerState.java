// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.games;

import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//            PlayerInfo

public interface GameManagerState
{

    public abstract CharSequence getApplicationName();

    public abstract List getConnectedControllablePlayers();

    public abstract List getConnectedPlayers();

    public abstract List getControllablePlayers();

    public abstract JSONObject getGameData();

    public abstract CharSequence getGameStatusText();

    public abstract int getGameplayState();

    public abstract Collection getListOfChangedPlayers(GameManagerState gamemanagerstate);

    public abstract int getLobbyState();

    public abstract int getMaxPlayers();

    public abstract PlayerInfo getPlayer(String s);

    public abstract Collection getPlayers();

    public abstract List getPlayersInState(int i);

    public abstract boolean hasGameDataChanged(GameManagerState gamemanagerstate);

    public abstract boolean hasGameStatusTextChanged(GameManagerState gamemanagerstate);

    public abstract boolean hasGameplayStateChanged(GameManagerState gamemanagerstate);

    public abstract boolean hasLobbyStateChanged(GameManagerState gamemanagerstate);

    public abstract boolean hasPlayerChanged(String s, GameManagerState gamemanagerstate);

    public abstract boolean hasPlayerDataChanged(String s, GameManagerState gamemanagerstate);

    public abstract boolean hasPlayerStateChanged(String s, GameManagerState gamemanagerstate);
}
