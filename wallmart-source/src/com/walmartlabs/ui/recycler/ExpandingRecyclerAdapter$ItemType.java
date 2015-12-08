// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;


// Referenced classes of package com.walmartlabs.ui.recycler:
//            ExpandingRecyclerAdapter

public static final class  extends Enum
{

    private static final SECTION_ITEM $VALUES[];
    public static final SECTION_ITEM SECTION_HEADER;
    public static final SECTION_ITEM SECTION_ITEM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/ui/recycler/ExpandingRecyclerAdapter$ItemType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SECTION_HEADER = new <init>("SECTION_HEADER", 0);
        SECTION_ITEM = new <init>("SECTION_ITEM", 1);
        $VALUES = (new .VALUES[] {
            SECTION_HEADER, SECTION_ITEM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
