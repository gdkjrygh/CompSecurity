// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;


// Referenced classes of package com.contextlogic.wish.ui.components.list:
//            LoadingListRow

public static final class I extends Enum
{

    private static final NoMoreItems $VALUES[];
    public static final NoMoreItems ClickToLoad;
    public static final NoMoreItems Hidden;
    public static final NoMoreItems Loading;
    public static final NoMoreItems NoMoreItems;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/contextlogic/wish/ui/components/list/LoadingListRow$LoadingMode, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        Hidden = new <init>("Hidden", 0);
        Loading = new <init>("Loading", 1);
        ClickToLoad = new <init>("ClickToLoad", 2);
        NoMoreItems = new <init>("NoMoreItems", 3);
        $VALUES = (new .VALUES[] {
            Hidden, Loading, ClickToLoad, NoMoreItems
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
