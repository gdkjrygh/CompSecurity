// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;


// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            BorderedImageView

public static final class  extends Enum
{

    private static final Blank $VALUES[];
    public static final Blank Blank;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/components/image/BorderedImageView$BorderedImageMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Blank = new <init>("Blank", 0);
        $VALUES = (new .VALUES[] {
            Blank
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
