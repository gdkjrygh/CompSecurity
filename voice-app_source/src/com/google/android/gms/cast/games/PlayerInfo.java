// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.games;

import org.json.JSONObject;

public interface PlayerInfo
{

    public abstract JSONObject getPlayerData();

    public abstract String getPlayerId();

    public abstract int getPlayerState();

    public abstract boolean isConnected();

    public abstract boolean isControllable();
}
