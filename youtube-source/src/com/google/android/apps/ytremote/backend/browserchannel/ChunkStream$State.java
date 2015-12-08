// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;


final class  extends Enum
{

    private static final ST_ERROR $VALUES[];
    public static final ST_ERROR ST_CHUNK_BODY;
    public static final ST_ERROR ST_CHUNK_LENGTH;
    public static final ST_ERROR ST_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/backend/browserchannel/ChunkStream$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ST_CHUNK_LENGTH = new <init>("ST_CHUNK_LENGTH", 0);
        ST_CHUNK_BODY = new <init>("ST_CHUNK_BODY", 1);
        ST_ERROR = new <init>("ST_ERROR", 2);
        $VALUES = (new .VALUES[] {
            ST_CHUNK_LENGTH, ST_CHUNK_BODY, ST_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
