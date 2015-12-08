// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.facebook;


// Referenced classes of package com.contextlogic.wish.facebook:
//            FacebookManager

public static final class  extends Enum
{

    private static final Large $VALUES[];
    public static final Large Large;
    public static final Large Normal;
    public static final Large Small;
    public static final Large Square;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/facebook/FacebookManager$FacebookProfileImageSize, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Small = new <init>("Small", 0);
        Square = new <init>("Square", 1);
        Normal = new <init>("Normal", 2);
        Large = new <init>("Large", 3);
        $VALUES = (new .VALUES[] {
            Small, Square, Normal, Large
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
