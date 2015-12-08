// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.intent;

import android.content.Intent;
import android.text.TextUtils;

public final class  extends Enum
{

    private static final SWITCH_USER $VALUES[];
    public static final SWITCH_USER AUTHORIZATION_LIGHTWEIGHT_ACCOUNT;
    public static final SWITCH_USER BIG_SCREEN_CONNECTED;
    public static final SWITCH_USER BIG_SCREEN_DISCONNECTED;
    public static final SWITCH_USER BIG_SCREEN_ON_ERROR;
    public static final SWITCH_USER BIG_SCREEN_PLAYER_STATE_CHANGED;
    public static final SWITCH_USER BIG_SCREEN_PLAYLIST_CONFIRMED;
    public static final SWITCH_USER BIG_SCREEN_PLAYLIST_UPDATE;
    public static final SWITCH_USER BIG_SCREEN_PLAY_STATE_UPDATE;
    public static final SWITCH_USER CLOUD_SERVICE_IPV6_ERROR;
    public static final SWITCH_USER CLOUD_SERVICE_NO_NETWORK;
    public static final SWITCH_USER CONNECTION_STATUS_CONNECTED;
    public static final SWITCH_USER CONNECTION_STATUS_DISCONNECTED;
    public static final SWITCH_USER CONNECTION_STATUS_STARTED_CONNECTING;
    public static final SWITCH_USER CONNECTION_STATUS_STOPPED_CONNECTING;
    public static final SWITCH_USER DECLINED_PARTY;
    public static final SWITCH_USER END_PARTY_MODE;
    public static final SWITCH_USER GO_HOME;
    public static final SWITCH_USER LOUNGE_SERVER_CONNECTION_ERROR;
    public static final SWITCH_USER LOUNGE_STATUS;
    public static final SWITCH_USER NO_ACTION;
    public static final SWITCH_USER PARTY_VIDEO_FLING;
    public static final SWITCH_USER PLAYSTATE_CHANGED;
    public static final SWITCH_USER QUEUE_MODIFIED;
    public static final SWITCH_USER QUEUE_MODIFIED_VIDEO_ADDED;
    public static final SWITCH_USER QUEUE_MODIFIED_VIDEO_REMOVED;
    public static final SWITCH_USER REFRESH;
    public static final SWITCH_USER REMOTE_CALL_ERROR;
    public static final SWITCH_USER SHARED_PLAYLIST_MODIFIED;
    public static final SWITCH_USER SWITCH_USER;

    public static  fromIntent(Intent intent)
    {
        intent = intent.getAction();
        if (TextUtils.isEmpty(intent))
        {
            return NO_ACTION;
        } else
        {
            return fromString(intent);
        }
    }

    public static fromString fromString(String s)
    {
        return valueOf(s.substring(s.lastIndexOf(".") + 1));
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/google/android/apps/ytremote/intent/Intents$IntentAction, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final Intent asIntent()
    {
        return new Intent(toString());
    }

    public final String toString()
    {
        return (new StringBuilder()).append(com/google/android/apps/ytremote/intent/Intents$IntentAction.getCanonicalName()).append(".").append(name()).toString();
    }

    static 
    {
        AUTHORIZATION_LIGHTWEIGHT_ACCOUNT = new <init>("AUTHORIZATION_LIGHTWEIGHT_ACCOUNT", 0);
        BIG_SCREEN_CONNECTED = new <init>("BIG_SCREEN_CONNECTED", 1);
        BIG_SCREEN_DISCONNECTED = new <init>("BIG_SCREEN_DISCONNECTED", 2);
        BIG_SCREEN_ON_ERROR = new <init>("BIG_SCREEN_ON_ERROR", 3);
        BIG_SCREEN_PLAY_STATE_UPDATE = new <init>("BIG_SCREEN_PLAY_STATE_UPDATE", 4);
        BIG_SCREEN_PLAYER_STATE_CHANGED = new <init>("BIG_SCREEN_PLAYER_STATE_CHANGED", 5);
        BIG_SCREEN_PLAYLIST_CONFIRMED = new <init>("BIG_SCREEN_PLAYLIST_CONFIRMED", 6);
        BIG_SCREEN_PLAYLIST_UPDATE = new <init>("BIG_SCREEN_PLAYLIST_UPDATE", 7);
        CLOUD_SERVICE_IPV6_ERROR = new <init>("CLOUD_SERVICE_IPV6_ERROR", 8);
        CLOUD_SERVICE_NO_NETWORK = new <init>("CLOUD_SERVICE_NO_NETWORK", 9);
        CONNECTION_STATUS_CONNECTED = new <init>("CONNECTION_STATUS_CONNECTED", 10);
        CONNECTION_STATUS_DISCONNECTED = new <init>("CONNECTION_STATUS_DISCONNECTED", 11);
        CONNECTION_STATUS_STARTED_CONNECTING = new <init>("CONNECTION_STATUS_STARTED_CONNECTING", 12);
        CONNECTION_STATUS_STOPPED_CONNECTING = new <init>("CONNECTION_STATUS_STOPPED_CONNECTING", 13);
        DECLINED_PARTY = new <init>("DECLINED_PARTY", 14);
        END_PARTY_MODE = new <init>("END_PARTY_MODE", 15);
        GO_HOME = new <init>("GO_HOME", 16);
        LOUNGE_SERVER_CONNECTION_ERROR = new <init>("LOUNGE_SERVER_CONNECTION_ERROR", 17);
        LOUNGE_STATUS = new <init>("LOUNGE_STATUS", 18);
        NO_ACTION = new <init>("NO_ACTION", 19);
        PARTY_VIDEO_FLING = new <init>("PARTY_VIDEO_FLING", 20);
        PLAYSTATE_CHANGED = new <init>("PLAYSTATE_CHANGED", 21);
        QUEUE_MODIFIED = new <init>("QUEUE_MODIFIED", 22);
        QUEUE_MODIFIED_VIDEO_ADDED = new <init>("QUEUE_MODIFIED_VIDEO_ADDED", 23);
        QUEUE_MODIFIED_VIDEO_REMOVED = new <init>("QUEUE_MODIFIED_VIDEO_REMOVED", 24);
        REFRESH = new <init>("REFRESH", 25);
        REMOTE_CALL_ERROR = new <init>("REMOTE_CALL_ERROR", 26);
        SHARED_PLAYLIST_MODIFIED = new <init>("SHARED_PLAYLIST_MODIFIED", 27);
        SWITCH_USER = new <init>("SWITCH_USER", 28);
        $VALUES = (new .VALUES[] {
            AUTHORIZATION_LIGHTWEIGHT_ACCOUNT, BIG_SCREEN_CONNECTED, BIG_SCREEN_DISCONNECTED, BIG_SCREEN_ON_ERROR, BIG_SCREEN_PLAY_STATE_UPDATE, BIG_SCREEN_PLAYER_STATE_CHANGED, BIG_SCREEN_PLAYLIST_CONFIRMED, BIG_SCREEN_PLAYLIST_UPDATE, CLOUD_SERVICE_IPV6_ERROR, CLOUD_SERVICE_NO_NETWORK, 
            CONNECTION_STATUS_CONNECTED, CONNECTION_STATUS_DISCONNECTED, CONNECTION_STATUS_STARTED_CONNECTING, CONNECTION_STATUS_STOPPED_CONNECTING, DECLINED_PARTY, END_PARTY_MODE, GO_HOME, LOUNGE_SERVER_CONNECTION_ERROR, LOUNGE_STATUS, NO_ACTION, 
            PARTY_VIDEO_FLING, PLAYSTATE_CHANGED, QUEUE_MODIFIED, QUEUE_MODIFIED_VIDEO_ADDED, QUEUE_MODIFIED_VIDEO_REMOVED, REFRESH, REMOTE_CALL_ERROR, SHARED_PLAYLIST_MODIFIED, SWITCH_USER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
