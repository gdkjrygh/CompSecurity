// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;


public final class  extends Enum
{

    private static final RemoteQueue $VALUES[];
    public static final RemoteQueue ArtistTracks;
    public static final RemoteQueue Browse;
    public static final RemoteQueue ChannelActivity;
    public static final RemoteQueue ChannelFavorites;
    public static final RemoteQueue ChannelUploads;
    public static final RemoteQueue Favorites;
    public static final RemoteQueue HomeFeed;
    public static final RemoteQueue Live;
    public static final RemoteQueue Playlist;
    public static final RemoteQueue PlaylistVideos;
    public static final RemoteQueue RelatedArtist;
    public static final RemoteQueue RelatedVideos;
    public static final RemoteQueue RemoteQueue;
    public static final RemoteQueue SearchResults;
    public static final RemoteQueue Unknown;
    public static final RemoteQueue UploaderNotification;
    public static final RemoteQueue Uploads;
    public static final RemoteQueue WatchHistory;
    public static final RemoteQueue WatchLater;
    public static final RemoteQueue Widget;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/Analytics$VideoCategory, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Unknown = new <init>("Unknown", 0);
        HomeFeed = new <init>("HomeFeed", 1);
        Browse = new <init>("Browse", 2);
        SearchResults = new <init>("SearchResults", 3);
        RelatedVideos = new <init>("RelatedVideos", 4);
        PlaylistVideos = new <init>("PlaylistVideos", 5);
        Uploads = new <init>("Uploads", 6);
        Favorites = new <init>("Favorites", 7);
        Playlist = new <init>("Playlist", 8);
        ChannelUploads = new <init>("ChannelUploads", 9);
        ChannelFavorites = new <init>("ChannelFavorites", 10);
        ChannelActivity = new <init>("ChannelActivity", 11);
        Widget = new <init>("Widget", 12);
        RelatedArtist = new <init>("RelatedArtist", 13);
        ArtistTracks = new <init>("ArtistTracks", 14);
        UploaderNotification = new <init>("UploaderNotification", 15);
        Live = new <init>("Live", 16);
        WatchLater = new <init>("WatchLater", 17);
        WatchHistory = new <init>("WatchHistory", 18);
        RemoteQueue = new <init>("RemoteQueue", 19);
        $VALUES = (new .VALUES[] {
            Unknown, HomeFeed, Browse, SearchResults, RelatedVideos, PlaylistVideos, Uploads, Favorites, Playlist, ChannelUploads, 
            ChannelFavorites, ChannelActivity, Widget, RelatedArtist, ArtistTracks, UploaderNotification, Live, WatchLater, WatchHistory, RemoteQueue
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
