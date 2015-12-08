// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.util.c;
import java.util.HashMap;
import java.util.Map;

public final class Method extends Enum
{

    private static final Method $VALUES[];
    public static final Method ADD_VIDEO;
    public static final Method ADD_VIDEOS;
    public static final Method CLEAR_PLAYLIST;
    public static final Method CONFIRM_PLAYLIST_UPDATE;
    public static final Method GET_NOW_PLAYING;
    public static final Method GET_PLAYLIST;
    public static final Method GET_SUBTITLES_TRACK;
    public static final Method GET_VOLUME;
    public static final Method HIDE_QR_CODE;
    public static final Method INSERT_VIDEO;
    public static final Method LOUNGE_STATUS;
    public static final Method MOVE_VIDEO;
    public static final Method NOOP;
    public static final Method NOW_PLAYING;
    public static final Method NOW_PLAYING_PLAYLIST;
    public static final Method ON_ERROR;
    public static final Method ON_STATE_CHANGED;
    public static final Method ON_SUBTITLES_TRACK_CHANGED;
    public static final Method ON_VOLUME_CHANGED;
    public static final Method PAUSE;
    public static final Method PLAY;
    public static final Method PLAYLIST_MODIFIED;
    public static final Method REMOTE_CONNECTED;
    public static final Method REMOTE_DISCONNECTED;
    public static final Method REMOVE_VIDEO;
    public static final Method SCREEN_CONNECTED;
    public static final Method SCREEN_DISCONNECTED;
    public static final Method SEEK_TO;
    public static final Method SET_PLAYLIST;
    public static final Method SET_SUBTITLES_TRACK;
    public static final Method SET_VIDEO;
    public static final Method SET_VOLUME;
    public static final Method SHOW_QR_CODE;
    public static final Method STOP;
    public static final Method UPDATE_PLAYLIST;
    public static final Method UPDATE_USERNAME;
    public static final Map fromString;
    private final String method;

    private Method(String s, int i, String s1)
    {
        super(s, i);
        method = (String)c.a(s1);
    }

    public static Method fromString(String s)
    {
        return (Method)fromString.get(s);
    }

    public static Method valueOf(String s)
    {
        return (Method)Enum.valueOf(com/google/android/apps/ytremote/backend/model/Method, s);
    }

    public static Method[] values()
    {
        return (Method[])$VALUES.clone();
    }

    public final String toString()
    {
        return method;
    }

    static 
    {
        int i = 0;
        ADD_VIDEO = new Method("ADD_VIDEO", 0, "addVideo");
        ADD_VIDEOS = new Method("ADD_VIDEOS", 1, "addVideos");
        CLEAR_PLAYLIST = new Method("CLEAR_PLAYLIST", 2, "clearPlaylist");
        CONFIRM_PLAYLIST_UPDATE = new Method("CONFIRM_PLAYLIST_UPDATE", 3, "confirmPlaylistUpdate");
        ON_ERROR = new Method("ON_ERROR", 4, "onError");
        GET_NOW_PLAYING = new Method("GET_NOW_PLAYING", 5, "getNowPlaying");
        GET_PLAYLIST = new Method("GET_PLAYLIST", 6, "getPlaylist");
        GET_SUBTITLES_TRACK = new Method("GET_SUBTITLES_TRACK", 7, "getSubtitlesTrack");
        GET_VOLUME = new Method("GET_VOLUME", 8, "getVolume");
        HIDE_QR_CODE = new Method("HIDE_QR_CODE", 9, "hideQrCode");
        INSERT_VIDEO = new Method("INSERT_VIDEO", 10, "insertVideo");
        LOUNGE_STATUS = new Method("LOUNGE_STATUS", 11, "loungeStatus");
        MOVE_VIDEO = new Method("MOVE_VIDEO", 12, "moveVideo");
        NOOP = new Method("NOOP", 13, "noop");
        NOW_PLAYING = new Method("NOW_PLAYING", 14, "nowPlaying");
        NOW_PLAYING_PLAYLIST = new Method("NOW_PLAYING_PLAYLIST", 15, "nowPlayingPlaylist");
        ON_SUBTITLES_TRACK_CHANGED = new Method("ON_SUBTITLES_TRACK_CHANGED", 16, "onSubtitlesTrackChanged");
        PAUSE = new Method("PAUSE", 17, "pause");
        PLAY = new Method("PLAY", 18, "play");
        PLAYLIST_MODIFIED = new Method("PLAYLIST_MODIFIED", 19, "playlistModified");
        REMOTE_CONNECTED = new Method("REMOTE_CONNECTED", 20, "remoteConnected");
        REMOTE_DISCONNECTED = new Method("REMOTE_DISCONNECTED", 21, "remoteDisconnected");
        REMOVE_VIDEO = new Method("REMOVE_VIDEO", 22, "removeVideo");
        SCREEN_CONNECTED = new Method("SCREEN_CONNECTED", 23, "loungeScreenConnected");
        SCREEN_DISCONNECTED = new Method("SCREEN_DISCONNECTED", 24, "loungeScreenDisconnected");
        SEEK_TO = new Method("SEEK_TO", 25, "seekTo");
        SET_PLAYLIST = new Method("SET_PLAYLIST", 26, "setPlaylist");
        SET_SUBTITLES_TRACK = new Method("SET_SUBTITLES_TRACK", 27, "setSubtitlesTrack");
        SET_VIDEO = new Method("SET_VIDEO", 28, "setVideo");
        SET_VOLUME = new Method("SET_VOLUME", 29, "setVolume");
        ON_VOLUME_CHANGED = new Method("ON_VOLUME_CHANGED", 30, "onVolumeChanged");
        SHOW_QR_CODE = new Method("SHOW_QR_CODE", 31, "showQrCode");
        ON_STATE_CHANGED = new Method("ON_STATE_CHANGED", 32, "onStateChange");
        STOP = new Method("STOP", 33, "stopVideo");
        UPDATE_PLAYLIST = new Method("UPDATE_PLAYLIST", 34, "updatePlaylist");
        UPDATE_USERNAME = new Method("UPDATE_USERNAME", 35, "updateUsername");
        $VALUES = (new Method[] {
            ADD_VIDEO, ADD_VIDEOS, CLEAR_PLAYLIST, CONFIRM_PLAYLIST_UPDATE, ON_ERROR, GET_NOW_PLAYING, GET_PLAYLIST, GET_SUBTITLES_TRACK, GET_VOLUME, HIDE_QR_CODE, 
            INSERT_VIDEO, LOUNGE_STATUS, MOVE_VIDEO, NOOP, NOW_PLAYING, NOW_PLAYING_PLAYLIST, ON_SUBTITLES_TRACK_CHANGED, PAUSE, PLAY, PLAYLIST_MODIFIED, 
            REMOTE_CONNECTED, REMOTE_DISCONNECTED, REMOVE_VIDEO, SCREEN_CONNECTED, SCREEN_DISCONNECTED, SEEK_TO, SET_PLAYLIST, SET_SUBTITLES_TRACK, SET_VIDEO, SET_VOLUME, 
            ON_VOLUME_CHANGED, SHOW_QR_CODE, ON_STATE_CHANGED, STOP, UPDATE_PLAYLIST, UPDATE_USERNAME
        });
        fromString = new HashMap();
        Method amethod[] = values();
        for (int j = amethod.length; i < j; i++)
        {
            Method method1 = amethod[i];
            fromString.put(method1.method, method1);
        }

    }
}
