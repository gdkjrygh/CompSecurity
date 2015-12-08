// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.intent;


public final class  extends Enum
{

    private static final VIDEO_ID $VALUES[];
    public static final VIDEO_ID DEVICE_NAMES;
    public static final VIDEO_ID DEVICE_TYPES;
    public static final VIDEO_ID ERROR_CODE;
    public static final VIDEO_ID ERROR_MESSAGE;
    public static final VIDEO_ID NOT_PLAYABLE_REASONS;
    public static final VIDEO_ID NOT_PLAYABLE_VIDEOS;
    public static final VIDEO_ID ORIGINAL_METHOD;
    public static final VIDEO_ID PARAMS;
    public static final VIDEO_ID PLAYBACK_POSITION;
    public static final VIDEO_ID PLAYER_STATE_DATA;
    public static final VIDEO_ID PLAYLIST;
    public static final VIDEO_ID PLAYSTATE_DATA;
    public static final VIDEO_ID SCREEN_ID;
    public static final VIDEO_ID SCREEN_INFO;
    public static final VIDEO_ID SCREEN_NAME;
    public static final VIDEO_ID SESSION_TOKEN;
    public static final VIDEO_ID STATION_NAME;
    public static final VIDEO_ID STATION_TYPE;
    public static final VIDEO_ID UPDATED;
    public static final VIDEO_ID USERNAME;
    public static final VIDEO_ID USERNAMES;
    public static final VIDEO_ID VIDEO_ID;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/intent/Intents$IntentData, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(com/google/android/apps/ytremote/intent/Intents$IntentData.getCanonicalName()).append("#").append(name()).toString();
    }

    static 
    {
        DEVICE_NAMES = new <init>("DEVICE_NAMES", 0);
        DEVICE_TYPES = new <init>("DEVICE_TYPES", 1);
        ERROR_CODE = new <init>("ERROR_CODE", 2);
        ERROR_MESSAGE = new <init>("ERROR_MESSAGE", 3);
        NOT_PLAYABLE_VIDEOS = new <init>("NOT_PLAYABLE_VIDEOS", 4);
        NOT_PLAYABLE_REASONS = new <init>("NOT_PLAYABLE_REASONS", 5);
        ORIGINAL_METHOD = new <init>("ORIGINAL_METHOD", 6);
        PARAMS = new <init>("PARAMS", 7);
        PLAYBACK_POSITION = new <init>("PLAYBACK_POSITION", 8);
        PLAYER_STATE_DATA = new <init>("PLAYER_STATE_DATA", 9);
        PLAYLIST = new <init>("PLAYLIST", 10);
        PLAYSTATE_DATA = new <init>("PLAYSTATE_DATA", 11);
        SCREEN_ID = new <init>("SCREEN_ID", 12);
        SCREEN_INFO = new <init>("SCREEN_INFO", 13);
        SCREEN_NAME = new <init>("SCREEN_NAME", 14);
        SESSION_TOKEN = new <init>("SESSION_TOKEN", 15);
        STATION_NAME = new <init>("STATION_NAME", 16);
        STATION_TYPE = new <init>("STATION_TYPE", 17);
        UPDATED = new <init>("UPDATED", 18);
        USERNAME = new <init>("USERNAME", 19);
        USERNAMES = new <init>("USERNAMES", 20);
        VIDEO_ID = new <init>("VIDEO_ID", 21);
        $VALUES = (new .VALUES[] {
            DEVICE_NAMES, DEVICE_TYPES, ERROR_CODE, ERROR_MESSAGE, NOT_PLAYABLE_VIDEOS, NOT_PLAYABLE_REASONS, ORIGINAL_METHOD, PARAMS, PLAYBACK_POSITION, PLAYER_STATE_DATA, 
            PLAYLIST, PLAYSTATE_DATA, SCREEN_ID, SCREEN_INFO, SCREEN_NAME, SESSION_TOKEN, STATION_NAME, STATION_TYPE, UPDATED, USERNAME, 
            USERNAMES, VIDEO_ID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
