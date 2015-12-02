// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final TYPE $VALUES[];
    public static final TYPE EXTERNAL_URI;
    public static final TYPE IMAGES;
    public static final TYPE KEY;
    public static final TYPE NAME;
    public static final TYPE PLAYBACK_URI;
    public static final TYPE TRACKS;
    public static final TYPE TRACKS_COUNT;
    public static final TYPE TYPE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/Shape_Playlist$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        EXTERNAL_URI = new Shape_Playlist.Property("EXTERNAL_URI", 0) {

            public final String toString()
            {
                return "external_uri";
            }

        };
        IMAGES = new Shape_Playlist.Property("IMAGES", 1) {

            public final String toString()
            {
                return "images";
            }

        };
        KEY = new Shape_Playlist.Property("KEY", 2) {

            public final String toString()
            {
                return "key";
            }

        };
        NAME = new Shape_Playlist.Property("NAME", 3) {

            public final String toString()
            {
                return "name";
            }

        };
        PLAYBACK_URI = new Shape_Playlist.Property("PLAYBACK_URI", 4) {

            public final String toString()
            {
                return "playback_uri";
            }

        };
        TRACKS_COUNT = new Shape_Playlist.Property("TRACKS_COUNT", 5) {

            public final String toString()
            {
                return "tracks_count";
            }

        };
        TRACKS = new Shape_Playlist.Property("TRACKS", 6) {

            public final String toString()
            {
                return "tracks";
            }

        };
        TYPE = new Shape_Playlist.Property("TYPE", 7) {

            public final String toString()
            {
                return "type";
            }

        };
        $VALUES = (new .VALUES[] {
            EXTERNAL_URI, IMAGES, KEY, NAME, PLAYBACK_URI, TRACKS_COUNT, TRACKS, TYPE
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
