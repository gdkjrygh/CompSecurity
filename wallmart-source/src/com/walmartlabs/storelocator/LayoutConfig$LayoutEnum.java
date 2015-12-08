// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            LayoutConfig

public static final class  extends Enum
{

    private static final SEARCH_SUGGESTION_ITEM $VALUES[];
    public static final SEARCH_SUGGESTION_ITEM LIST_ONLY_LAYOUT;
    public static final SEARCH_SUGGESTION_ITEM MAP_AND_LIST_LAYOUT;
    public static final SEARCH_SUGGESTION_ITEM SEARCH_LIST_LAYOUT;
    public static final SEARCH_SUGGESTION_ITEM SEARCH_SUGGESTION_ITEM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$LayoutEnum, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LIST_ONLY_LAYOUT = new <init>("LIST_ONLY_LAYOUT", 0);
        MAP_AND_LIST_LAYOUT = new <init>("MAP_AND_LIST_LAYOUT", 1);
        SEARCH_LIST_LAYOUT = new <init>("SEARCH_LIST_LAYOUT", 2);
        SEARCH_SUGGESTION_ITEM = new <init>("SEARCH_SUGGESTION_ITEM", 3);
        $VALUES = (new .VALUES[] {
            LIST_ONLY_LAYOUT, MAP_AND_LIST_LAYOUT, SEARCH_LIST_LAYOUT, SEARCH_SUGGESTION_ITEM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
