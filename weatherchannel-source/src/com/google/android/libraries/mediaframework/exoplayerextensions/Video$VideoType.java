// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;


// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            Video

public static final class type extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER AAC;
    public static final OTHER DASH;
    public static final OTHER HLS;
    public static final OTHER M4A;
    public static final OTHER MP3;
    public static final OTHER MP4;
    public static final OTHER OTHER;
    public static final OTHER SS;
    public static final OTHER TS;
    public static final OTHER WEBM;
    private int type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/google/android/libraries/mediaframework/exoplayerextensions/Video$VideoType, s);
    }

    public static type[] values()
    {
        return (type[])$VALUES.clone();
    }

    static 
    {
        DASH = new <init>("DASH", 0, 0);
        SS = new <init>("SS", 1, 1);
        HLS = new <init>("HLS", 2, 2);
        MP4 = new <init>("MP4", 3, 3);
        MP3 = new <init>("MP3", 4, 4);
        M4A = new <init>("M4A", 5, 5);
        WEBM = new <init>("WEBM", 6, 6);
        TS = new <init>("TS", 7, 7);
        AAC = new <init>("AAC", 8, 8);
        OTHER = new <init>("OTHER", 9, 9);
        $VALUES = (new .VALUES[] {
            DASH, SS, HLS, MP4, MP3, M4A, WEBM, TS, AAC, OTHER
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        type = j;
    }
}
