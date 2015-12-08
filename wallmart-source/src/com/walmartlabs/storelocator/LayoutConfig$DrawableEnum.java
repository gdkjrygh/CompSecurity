// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            LayoutConfig

public static final class  extends Enum
{

    private static final FILTER_BUTTON $VALUES[];
    public static final FILTER_BUTTON FILTER_BUTTON;
    public static final FILTER_BUTTON FILTER_BUTTON_ACTIVE;
    public static final FILTER_BUTTON LIST_BUTTON_DRAWABLE;
    public static final FILTER_BUTTON MAP_BUTTON_DRAWABLE;
    public static final FILTER_BUTTON SEARCH_HINT_ICON;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$DrawableEnum, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MAP_BUTTON_DRAWABLE = new <init>("MAP_BUTTON_DRAWABLE", 0);
        LIST_BUTTON_DRAWABLE = new <init>("LIST_BUTTON_DRAWABLE", 1);
        FILTER_BUTTON_ACTIVE = new <init>("FILTER_BUTTON_ACTIVE", 2);
        SEARCH_HINT_ICON = new <init>("SEARCH_HINT_ICON", 3);
        FILTER_BUTTON = new <init>("FILTER_BUTTON", 4);
        $VALUES = (new .VALUES[] {
            MAP_BUTTON_DRAWABLE, LIST_BUTTON_DRAWABLE, FILTER_BUTTON_ACTIVE, SEARCH_HINT_ICON, FILTER_BUTTON
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
