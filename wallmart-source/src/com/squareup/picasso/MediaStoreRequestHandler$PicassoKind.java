// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            MediaStoreRequestHandler

static final class height extends Enum
{

    private static final FULL $VALUES[];
    public static final FULL FULL;
    public static final FULL MICRO;
    public static final FULL MINI;
    final int androidKind;
    final int height;
    final int width;

    public static height valueOf(String s)
    {
        return (height)Enum.valueOf(com/squareup/picasso/MediaStoreRequestHandler$PicassoKind, s);
    }

    public static height[] values()
    {
        return (height[])$VALUES.clone();
    }

    static 
    {
        MICRO = new <init>("MICRO", 0, 3, 96, 96);
        MINI = new <init>("MINI", 1, 1, 512, 384);
        FULL = new <init>("FULL", 2, 2, -1, -1);
        $VALUES = (new .VALUES[] {
            MICRO, MINI, FULL
        });
    }

    private (String s, int i, int j, int k, int l)
    {
        super(s, i);
        androidKind = j;
        width = k;
        height = l;
    }
}
