// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;


public class Video
{
    public static final class VideoType extends Enum
    {

        private static final VideoType $VALUES[];
        public static final VideoType AAC;
        public static final VideoType DASH;
        public static final VideoType HLS;
        public static final VideoType M4A;
        public static final VideoType MP3;
        public static final VideoType MP4;
        public static final VideoType OTHER;
        public static final VideoType SS;
        public static final VideoType TS;
        public static final VideoType WEBM;
        private int type;

        public static VideoType valueOf(String s)
        {
            return (VideoType)Enum.valueOf(com/google/android/libraries/mediaframework/exoplayerextensions/Video$VideoType, s);
        }

        public static VideoType[] values()
        {
            return (VideoType[])$VALUES.clone();
        }

        static 
        {
            DASH = new VideoType("DASH", 0, 0);
            SS = new VideoType("SS", 1, 1);
            HLS = new VideoType("HLS", 2, 2);
            MP4 = new VideoType("MP4", 3, 3);
            MP3 = new VideoType("MP3", 4, 4);
            M4A = new VideoType("M4A", 5, 5);
            WEBM = new VideoType("WEBM", 6, 6);
            TS = new VideoType("TS", 7, 7);
            AAC = new VideoType("AAC", 8, 8);
            OTHER = new VideoType("OTHER", 9, 9);
            $VALUES = (new VideoType[] {
                DASH, SS, HLS, MP4, MP3, M4A, WEBM, TS, AAC, OTHER
            });
        }

        private VideoType(String s, int i, int j)
        {
            super(s, i);
            type = j;
        }
    }


    private final String contentId;
    private final String url;
    private final VideoType videoType;

    public Video(String s, VideoType videotype)
    {
        this(s, videotype, null);
    }

    public Video(String s, VideoType videotype, String s1)
    {
        url = s;
        videoType = videotype;
        contentId = s1;
    }

    public String getContentId()
    {
        return contentId;
    }

    public String getUrl()
    {
        return url;
    }

    public VideoType getVideoType()
    {
        return videoType;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Video{url='").append(url).append('\'').append(", videoType=").append(videoType).append(", contentId='").append(contentId).append('\'').append('}').toString();
    }
}
