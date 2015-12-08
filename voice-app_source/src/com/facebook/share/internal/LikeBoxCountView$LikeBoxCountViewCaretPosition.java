// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            LikeBoxCountView

public static final class  extends Enum
{

    public static final BOTTOM BOTTOM;
    private static final BOTTOM ENUM$VALUES[];
    public static final BOTTOM LEFT;
    public static final BOTTOM RIGHT;
    public static final BOTTOM TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        LEFT = new <init>("LEFT", 0);
        TOP = new <init>("TOP", 1);
        RIGHT = new <init>("RIGHT", 2);
        BOTTOM = new <init>("BOTTOM", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            LEFT, TOP, RIGHT, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
