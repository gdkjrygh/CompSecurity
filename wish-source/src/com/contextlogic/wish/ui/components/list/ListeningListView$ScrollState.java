// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;


// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            ListeningListView

public static final class  extends Enum
{

    private static final DOWN $VALUES[];
    public static final DOWN DOWN;
    public static final DOWN STOP;
    public static final DOWN UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/components/list/ListeningListView$ScrollState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STOP = new <init>("STOP", 0);
        UP = new <init>("UP", 1);
        DOWN = new <init>("DOWN", 2);
        $VALUES = (new .VALUES[] {
            STOP, UP, DOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
