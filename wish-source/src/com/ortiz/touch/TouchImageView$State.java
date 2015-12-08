// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ortiz.touch;


// Referenced classes of package com.ortiz.touch:
//            TouchImageView

private static final class  extends Enum
{

    private static final ANIMATE_ZOOM $VALUES[];
    public static final ANIMATE_ZOOM ANIMATE_ZOOM;
    public static final ANIMATE_ZOOM DRAG;
    public static final ANIMATE_ZOOM FLING;
    public static final ANIMATE_ZOOM NONE;
    public static final ANIMATE_ZOOM ZOOM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ortiz/touch/TouchImageView$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        DRAG = new <init>("DRAG", 1);
        ZOOM = new <init>("ZOOM", 2);
        FLING = new <init>("FLING", 3);
        ANIMATE_ZOOM = new <init>("ANIMATE_ZOOM", 4);
        $VALUES = (new .VALUES[] {
            NONE, DRAG, ZOOM, FLING, ANIMATE_ZOOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
