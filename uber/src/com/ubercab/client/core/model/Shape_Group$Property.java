// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final TYPE $VALUES[];
    public static final TYPE GROUPS;
    public static final TYPE GROUPS_COUNT;
    public static final TYPE IMAGES;
    public static final TYPE IMAGES_COUNT;
    public static final TYPE NAME;
    public static final TYPE PLAYBACK_URI;
    public static final TYPE PLAYLISTS;
    public static final TYPE PLAYLISTS_COUNT;
    public static final TYPE STATION_URI;
    public static final TYPE TYPE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/Shape_Group$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        GROUPS = new Shape_Group.Property("GROUPS", 0) {

            public final String toString()
            {
                return "groups";
            }

        };
        GROUPS_COUNT = new Shape_Group.Property("GROUPS_COUNT", 1) {

            public final String toString()
            {
                return "groups_count";
            }

        };
        IMAGES = new Shape_Group.Property("IMAGES", 2) {

            public final String toString()
            {
                return "images";
            }

        };
        IMAGES_COUNT = new Shape_Group.Property("IMAGES_COUNT", 3) {

            public final String toString()
            {
                return "images_count";
            }

        };
        NAME = new Shape_Group.Property("NAME", 4) {

            public final String toString()
            {
                return "name";
            }

        };
        PLAYBACK_URI = new Shape_Group.Property("PLAYBACK_URI", 5) {

            public final String toString()
            {
                return "playback_uri";
            }

        };
        PLAYLISTS = new Shape_Group.Property("PLAYLISTS", 6) {

            public final String toString()
            {
                return "playlists";
            }

        };
        PLAYLISTS_COUNT = new Shape_Group.Property("PLAYLISTS_COUNT", 7) {

            public final String toString()
            {
                return "playlists_count";
            }

        };
        STATION_URI = new Shape_Group.Property("STATION_URI", 8) {

            public final String toString()
            {
                return "station_uri";
            }

        };
        TYPE = new Shape_Group.Property("TYPE", 9) {

            public final String toString()
            {
                return "type";
            }

        };
        $VALUES = (new .VALUES[] {
            GROUPS, GROUPS_COUNT, IMAGES, IMAGES_COUNT, NAME, PLAYBACK_URI, PLAYLISTS, PLAYLISTS_COUNT, STATION_URI, TYPE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }

    _cls9(String s, int i, _cls9 _pcls9)
    {
        this(s, i);
    }
}
