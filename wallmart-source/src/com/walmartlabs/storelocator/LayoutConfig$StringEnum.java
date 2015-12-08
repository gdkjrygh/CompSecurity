// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            LayoutConfig

public static final class  extends Enum
{

    private static final LOADING_PROGRESS $VALUES[];
    public static final LOADING_PROGRESS LOADING_PROGRESS;
    public static final LOADING_PROGRESS NO_CLOSE_SHIPPING_LOCATIONS;
    public static final LOADING_PROGRESS NO_FILTERED_RESULT;
    public static final LOADING_PROGRESS NO_LOCAL_RESULT;
    public static final LOADING_PROGRESS NO_LOCATION;
    public static final LOADING_PROGRESS SEARCHING_PROGRESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$StringEnum, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SEARCHING_PROGRESS = new <init>("SEARCHING_PROGRESS", 0);
        NO_FILTERED_RESULT = new <init>("NO_FILTERED_RESULT", 1);
        NO_LOCATION = new <init>("NO_LOCATION", 2);
        NO_LOCAL_RESULT = new <init>("NO_LOCAL_RESULT", 3);
        NO_CLOSE_SHIPPING_LOCATIONS = new <init>("NO_CLOSE_SHIPPING_LOCATIONS", 4);
        LOADING_PROGRESS = new <init>("LOADING_PROGRESS", 5);
        $VALUES = (new .VALUES[] {
            SEARCHING_PROGRESS, NO_FILTERED_RESULT, NO_LOCATION, NO_LOCAL_RESULT, NO_CLOSE_SHIPPING_LOCATIONS, LOADING_PROGRESS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
