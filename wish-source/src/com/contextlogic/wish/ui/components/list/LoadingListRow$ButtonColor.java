// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;


// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            LoadingListRow

public static final class I extends Enum
{

    private static final Orange $VALUES[];
    public static final Orange Blue;
    public static final Orange Gray;
    public static final Orange Orange;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/contextlogic/wish/ui/components/list/LoadingListRow$ButtonColor, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        Gray = new <init>("Gray", 0);
        Blue = new <init>("Blue", 1);
        Orange = new <init>("Orange", 2);
        $VALUES = (new .VALUES[] {
            Gray, Blue, Orange
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
