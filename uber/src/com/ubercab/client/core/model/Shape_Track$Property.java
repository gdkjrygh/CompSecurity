// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final PLAYBACK_URI $VALUES[];
    public static final PLAYBACK_URI ALBUM;
    public static final PLAYBACK_URI ARTISTS;
    public static final PLAYBACK_URI DURATION_IN_SECONDS;
    public static final PLAYBACK_URI EXTERNAL_URI;
    public static final PLAYBACK_URI ID;
    public static final PLAYBACK_URI INDEX_IN_PLAYLIST;
    public static final PLAYBACK_URI NAME;
    public static final PLAYBACK_URI PLAYBACK_URI;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/Shape_Track$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        ALBUM = new Shape_Track.Property("ALBUM", 0) {

            public final String toString()
            {
                return "album";
            }

        };
        ARTISTS = new Shape_Track.Property("ARTISTS", 1) {

            public final String toString()
            {
                return "artists";
            }

        };
        DURATION_IN_SECONDS = new Shape_Track.Property("DURATION_IN_SECONDS", 2) {

            public final String toString()
            {
                return "duration_in_seconds";
            }

        };
        EXTERNAL_URI = new Shape_Track.Property("EXTERNAL_URI", 3) {

            public final String toString()
            {
                return "external_uri";
            }

        };
        ID = new Shape_Track.Property("ID", 4) {

            public final String toString()
            {
                return "id";
            }

        };
        INDEX_IN_PLAYLIST = new Shape_Track.Property("INDEX_IN_PLAYLIST", 5) {

            public final String toString()
            {
                return "index_in_playlist";
            }

        };
        NAME = new Shape_Track.Property("NAME", 6) {

            public final String toString()
            {
                return "name";
            }

        };
        PLAYBACK_URI = new Shape_Track.Property("PLAYBACK_URI", 7) {

            public final String toString()
            {
                return "playback_uri";
            }

        };
        $VALUES = (new .VALUES[] {
            ALBUM, ARTISTS, DURATION_IN_SECONDS, EXTERNAL_URI, ID, INDEX_IN_PLAYLIST, NAME, PLAYBACK_URI
        });
    }

    private _cls8(String s, int i)
    {
        super(s, i);
    }

    _cls8(String s, int i, _cls8 _pcls8)
    {
        this(s, i);
    }
}
