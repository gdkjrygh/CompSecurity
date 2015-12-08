// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.gdata;

import com.google.android.youtube.p;

public final class nameId extends Enum
{

    private static final PRIVATE $VALUES[];
    public static final PRIVATE PRIVATE;
    public static final PRIVATE PUBLIC;
    public static final PRIVATE UNLISTED;
    public final int nameId;

    public static nameId valueOf(String s)
    {
        return (nameId)Enum.valueOf(com/google/android/apps/youtube/datalib/model/gdata/Video$Privacy, s);
    }

    public static nameId[] values()
    {
        return (nameId[])$VALUES.clone();
    }

    static 
    {
        PUBLIC = new <init>("PUBLIC", 0, p.gV);
        UNLISTED = new <init>("UNLISTED", 1, p.gX);
        PRIVATE = new <init>("PRIVATE", 2, p.gT);
        $VALUES = (new .VALUES[] {
            PUBLIC, UNLISTED, PRIVATE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        nameId = j;
    }
}
