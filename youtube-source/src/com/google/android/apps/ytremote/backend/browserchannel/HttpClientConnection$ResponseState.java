// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;


final class  extends Enum
{

    private static final TRAILER $VALUES[];
    public static final TRAILER BODY;
    public static final TRAILER CHUNK_DATA;
    public static final TRAILER CHUNK_END;
    public static final TRAILER CHUNK_SIZE;
    public static final TRAILER DONE;
    public static final TRAILER HEADER;
    public static final TRAILER TRAILER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/HttpClientConnection$ResponseState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BODY = new <init>("BODY", 0);
        CHUNK_DATA = new <init>("CHUNK_DATA", 1);
        CHUNK_END = new <init>("CHUNK_END", 2);
        CHUNK_SIZE = new <init>("CHUNK_SIZE", 3);
        DONE = new <init>("DONE", 4);
        HEADER = new <init>("HEADER", 5);
        TRAILER = new <init>("TRAILER", 6);
        $VALUES = (new .VALUES[] {
            BODY, CHUNK_DATA, CHUNK_END, CHUNK_SIZE, DONE, HEADER, TRAILER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
