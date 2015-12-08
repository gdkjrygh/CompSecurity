// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class WatchFeature extends Enum
{

    private static final WatchFeature $VALUES[];
    public static final WatchFeature AD;
    public static final WatchFeature ANNOTATION;
    public static final WatchFeature ARTIST_VIDEOS;
    public static final WatchFeature BROWSE;
    public static final WatchFeature CHANNEL_ACTIVITY;
    public static final WatchFeature CHANNEL_FAVORITE;
    public static final WatchFeature CHANNEL_PLAYLIST;
    public static final WatchFeature CHANNEL_UPLOAD;
    public static final WatchFeature EXTERNAL_URL;
    public static final WatchFeature GUIDE_CATEGORY_ANIMALS;
    public static final WatchFeature GUIDE_CATEGORY_AUTOS;
    public static final WatchFeature GUIDE_CATEGORY_COMEDY;
    public static final WatchFeature GUIDE_CATEGORY_EDUCATION;
    public static final WatchFeature GUIDE_CATEGORY_ENTERTAINMENT;
    public static final WatchFeature GUIDE_CATEGORY_FILM;
    public static final WatchFeature GUIDE_CATEGORY_GAMES;
    public static final WatchFeature GUIDE_CATEGORY_HOWTO;
    public static final WatchFeature GUIDE_CATEGORY_MUSIC;
    public static final WatchFeature GUIDE_CATEGORY_NEWS;
    public static final WatchFeature GUIDE_CATEGORY_NONPROFIT;
    public static final WatchFeature GUIDE_CATEGORY_PEOPLE;
    public static final WatchFeature GUIDE_CATEGORY_POPULAR;
    public static final WatchFeature GUIDE_CATEGORY_RECOMMENDED;
    public static final WatchFeature GUIDE_CATEGORY_SCIENCE;
    public static final WatchFeature GUIDE_CATEGORY_SPORTS;
    public static final WatchFeature GUIDE_CATEGORY_TRAVEL;
    public static final WatchFeature GUIDE_CHANNEL_ACTIVITY;
    public static final WatchFeature GUIDE_CHANNEL_ACTIVITY_UPLOAD;
    public static final WatchFeature GUIDE_CHANNEL_UPLOADS;
    public static final WatchFeature GUIDE_RIVER_ACTIVITY;
    public static final WatchFeature GUIDE_RIVER_ACTIVITY_UPLOAD;
    public static final WatchFeature GUIDE_RIVER_RECOMMENDED;
    public static final WatchFeature GUIDE_RIVER_UPLOADS;
    public static final WatchFeature LIVE;
    public static final WatchFeature LIVE_TEASER;
    public static final WatchFeature MY_FAVORITES;
    public static final WatchFeature MY_UPLOADS;
    public static final WatchFeature NO_FEATURE;
    public static final WatchFeature OFFLINE;
    public static final WatchFeature PLAYER_EMBEDDED;
    public static final WatchFeature PLAYLISTS;
    public static final WatchFeature RELATED;
    public static final WatchFeature RELATED_ARTIST;
    public static final WatchFeature REMOTE_QR_SCAN;
    public static final WatchFeature REMOTE_QUEUE;
    public static final WatchFeature SEARCH;
    public static final WatchFeature UPLOAD_NOTIFICATION;
    public static final WatchFeature VIDEO_NOTIFICATION;
    public static final WatchFeature WATCH_HISTORY;
    public static final WatchFeature WATCH_LATER;
    public static final WatchFeature WIDGET;
    public static final WatchFeature YT_REMOTE;
    public static final WatchFeature YT_REMOTE_DIAL;
    private final String featureString;

    private WatchFeature(String s, int i, String s1)
    {
        super(s, i);
        featureString = s1;
    }

    public static WatchFeature fromOrdinal(int i)
    {
        if (i < 0 || i >= values().length)
        {
            return NO_FEATURE;
        } else
        {
            return values()[i];
        }
    }

    public static WatchFeature valueOf(String s)
    {
        return (WatchFeature)Enum.valueOf(com/google/android/apps/youtube/core/client/WatchFeature, s);
    }

    public static WatchFeature[] values()
    {
        return (WatchFeature[])$VALUES.clone();
    }

    public final String getFeatureString()
    {
        return featureString;
    }

    static 
    {
        NO_FEATURE = new WatchFeature("NO_FEATURE", 0, null);
        GUIDE_RIVER_UPLOADS = new WatchFeature("GUIDE_RIVER_UPLOADS", 1, "g-all-u");
        GUIDE_RIVER_ACTIVITY = new WatchFeature("GUIDE_RIVER_ACTIVITY", 2, "g-all-a");
        GUIDE_RIVER_ACTIVITY_UPLOAD = new WatchFeature("GUIDE_RIVER_ACTIVITY_UPLOAD", 3, "g-all-au");
        GUIDE_RIVER_RECOMMENDED = new WatchFeature("GUIDE_RIVER_RECOMMENDED", 4, "g-all-r");
        GUIDE_CHANNEL_UPLOADS = new WatchFeature("GUIDE_CHANNEL_UPLOADS", 5, "g-user-u");
        GUIDE_CHANNEL_ACTIVITY = new WatchFeature("GUIDE_CHANNEL_ACTIVITY", 6, "g-user-a");
        GUIDE_CHANNEL_ACTIVITY_UPLOAD = new WatchFeature("GUIDE_CHANNEL_ACTIVITY_UPLOAD", 7, "g-user-au");
        GUIDE_CATEGORY_POPULAR = new WatchFeature("GUIDE_CATEGORY_POPULAR", 8, "g-pop");
        GUIDE_CATEGORY_RECOMMENDED = new WatchFeature("GUIDE_CATEGORY_RECOMMENDED", 9, "g-vrec");
        GUIDE_CATEGORY_AUTOS = new WatchFeature("GUIDE_CATEGORY_AUTOS", 10, "g-auto");
        GUIDE_CATEGORY_COMEDY = new WatchFeature("GUIDE_CATEGORY_COMEDY", 11, "g-comedy");
        GUIDE_CATEGORY_EDUCATION = new WatchFeature("GUIDE_CATEGORY_EDUCATION", 12, "g-edu");
        GUIDE_CATEGORY_ENTERTAINMENT = new WatchFeature("GUIDE_CATEGORY_ENTERTAINMENT", 13, "g-ent");
        GUIDE_CATEGORY_FILM = new WatchFeature("GUIDE_CATEGORY_FILM", 14, "g-film");
        GUIDE_CATEGORY_GAMES = new WatchFeature("GUIDE_CATEGORY_GAMES", 15, "g-games");
        GUIDE_CATEGORY_MUSIC = new WatchFeature("GUIDE_CATEGORY_MUSIC", 16, "g-music");
        GUIDE_CATEGORY_NEWS = new WatchFeature("GUIDE_CATEGORY_NEWS", 17, "g-news");
        GUIDE_CATEGORY_NONPROFIT = new WatchFeature("GUIDE_CATEGORY_NONPROFIT", 18, "g-npo");
        GUIDE_CATEGORY_PEOPLE = new WatchFeature("GUIDE_CATEGORY_PEOPLE", 19, "g-people");
        GUIDE_CATEGORY_ANIMALS = new WatchFeature("GUIDE_CATEGORY_ANIMALS", 20, "g-pets");
        GUIDE_CATEGORY_SCIENCE = new WatchFeature("GUIDE_CATEGORY_SCIENCE", 21, "g-sci");
        GUIDE_CATEGORY_SPORTS = new WatchFeature("GUIDE_CATEGORY_SPORTS", 22, "g-sports");
        GUIDE_CATEGORY_HOWTO = new WatchFeature("GUIDE_CATEGORY_HOWTO", 23, "g-howto");
        GUIDE_CATEGORY_TRAVEL = new WatchFeature("GUIDE_CATEGORY_TRAVEL", 24, "g-travel");
        CHANNEL_ACTIVITY = new WatchFeature("CHANNEL_ACTIVITY", 25, "c-activity");
        CHANNEL_FAVORITE = new WatchFeature("CHANNEL_FAVORITE", 26, "c-favorite");
        CHANNEL_PLAYLIST = new WatchFeature("CHANNEL_PLAYLIST", 27, "c-playlist");
        CHANNEL_UPLOAD = new WatchFeature("CHANNEL_UPLOAD", 28, "c-upload");
        AD = new WatchFeature("AD", 29, "ad");
        ANNOTATION = new WatchFeature("ANNOTATION", 30, "annotation");
        EXTERNAL_URL = new WatchFeature("EXTERNAL_URL", 31, "custom_uri");
        LIVE = new WatchFeature("LIVE", 32, "g-all-lsb");
        LIVE_TEASER = new WatchFeature("LIVE_TEASER", 33, "g-all-lss");
        MY_FAVORITES = new WatchFeature("MY_FAVORITES", 34, "my_favorites");
        MY_UPLOADS = new WatchFeature("MY_UPLOADS", 35, "my_uploads");
        OFFLINE = new WatchFeature("OFFLINE", 36, "offline");
        PLAYER_EMBEDDED = new WatchFeature("PLAYER_EMBEDDED", 37, "player_embedded");
        PLAYLISTS = new WatchFeature("PLAYLISTS", 38, "playlist");
        RELATED = new WatchFeature("RELATED", 39, "related");
        WATCH_LATER = new WatchFeature("WATCH_LATER", 40, "my_watch_later");
        WATCH_HISTORY = new WatchFeature("WATCH_HISTORY", 41, "my_history");
        ARTIST_VIDEOS = new WatchFeature("ARTIST_VIDEOS", 42, "artist_video");
        RELATED_ARTIST = new WatchFeature("RELATED_ARTIST", 43, "related_artist");
        REMOTE_QR_SCAN = new WatchFeature("REMOTE_QR_SCAN", 44, "remote_qr_scan");
        REMOTE_QUEUE = new WatchFeature("REMOTE_QUEUE", 45, "remote_queue");
        UPLOAD_NOTIFICATION = new WatchFeature("UPLOAD_NOTIFICATION", 46, "upload_notification");
        VIDEO_NOTIFICATION = new WatchFeature("VIDEO_NOTIFICATION", 47, "push-notification");
        YT_REMOTE = new WatchFeature("YT_REMOTE", 48, "ytremote");
        YT_REMOTE_DIAL = new WatchFeature("YT_REMOTE_DIAL", 49, "ytremote_d");
        WIDGET = new WatchFeature("WIDGET", 50, "widget");
        SEARCH = new WatchFeature("SEARCH", 51, "search");
        BROWSE = new WatchFeature("BROWSE", 52, "browse");
        $VALUES = (new WatchFeature[] {
            NO_FEATURE, GUIDE_RIVER_UPLOADS, GUIDE_RIVER_ACTIVITY, GUIDE_RIVER_ACTIVITY_UPLOAD, GUIDE_RIVER_RECOMMENDED, GUIDE_CHANNEL_UPLOADS, GUIDE_CHANNEL_ACTIVITY, GUIDE_CHANNEL_ACTIVITY_UPLOAD, GUIDE_CATEGORY_POPULAR, GUIDE_CATEGORY_RECOMMENDED, 
            GUIDE_CATEGORY_AUTOS, GUIDE_CATEGORY_COMEDY, GUIDE_CATEGORY_EDUCATION, GUIDE_CATEGORY_ENTERTAINMENT, GUIDE_CATEGORY_FILM, GUIDE_CATEGORY_GAMES, GUIDE_CATEGORY_MUSIC, GUIDE_CATEGORY_NEWS, GUIDE_CATEGORY_NONPROFIT, GUIDE_CATEGORY_PEOPLE, 
            GUIDE_CATEGORY_ANIMALS, GUIDE_CATEGORY_SCIENCE, GUIDE_CATEGORY_SPORTS, GUIDE_CATEGORY_HOWTO, GUIDE_CATEGORY_TRAVEL, CHANNEL_ACTIVITY, CHANNEL_FAVORITE, CHANNEL_PLAYLIST, CHANNEL_UPLOAD, AD, 
            ANNOTATION, EXTERNAL_URL, LIVE, LIVE_TEASER, MY_FAVORITES, MY_UPLOADS, OFFLINE, PLAYER_EMBEDDED, PLAYLISTS, RELATED, 
            WATCH_LATER, WATCH_HISTORY, ARTIST_VIDEOS, RELATED_ARTIST, REMOTE_QR_SCAN, REMOTE_QUEUE, UPLOAD_NOTIFICATION, VIDEO_NOTIFICATION, YT_REMOTE, YT_REMOTE_DIAL, 
            WIDGET, SEARCH, BROWSE
        });
    }
}
