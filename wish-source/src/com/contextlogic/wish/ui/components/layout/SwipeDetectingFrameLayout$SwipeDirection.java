// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.layout;


// Referenced classes of package com.contextlogic.wish.ui.components.layout:
//            SwipeDetectingFrameLayout

public static final class Y extends Enum
{

    private static final Right $VALUES[];
    public static final Right Left;
    public static final Right Right;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/contextlogic/wish/ui/components/layout/SwipeDetectingFrameLayout$SwipeDirection, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        Left = new <init>("Left", 0);
        Right = new <init>("Right", 1);
        $VALUES = (new .VALUES[] {
            Left, Right
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
