// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;


// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            BorderedImageView

public static final class  extends Enum
{

    private static final None $VALUES[];
    public static final None Dark;
    public static final None Gone;
    public static final None Light;
    public static final None None;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/components/image/BorderedImageView$LoadingStyle, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Dark = new <init>("Dark", 0);
        Light = new <init>("Light", 1);
        Gone = new <init>("Gone", 2);
        None = new <init>("None", 3);
        $VALUES = (new .VALUES[] {
            Dark, Light, Gone, None
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
