// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;


// Referenced classes of package com.weather.dal2.locations:
//            LocationChange

public static final class  extends Enum
{

    private static final ADDRESS_CHANGE $VALUES[];
    public static final ADDRESS_CHANGE ACTIVE;
    public static final ADDRESS_CHANGE ADDRESS_CHANGE;
    public static final ADDRESS_CHANGE FOLLOW_ME_ACTIVATED;
    public static final ADDRESS_CHANGE FOLLOW_ME_ACTIVATION_FAILURE;
    public static final ADDRESS_CHANGE FOLLOW_ME_CHANGE;
    public static final ADDRESS_CHANGE FOLLOW_ME_CHANGE_ON_LAST_LOCATION;
    public static final ADDRESS_CHANGE FOLLOW_ME_DEACTIVATED;
    public static final ADDRESS_CHANGE INITIAL;
    public static final ADDRESS_CHANGE ITEMS_REMOVED;
    public static final ADDRESS_CHANGE ITEM_ADDED;
    public static final ADDRESS_CHANGE ITEM_REMOVED;
    public static final ADDRESS_CHANGE LIST;
    public static final ADDRESS_CHANGE LIST_CREATED;
    public static final ADDRESS_CHANGE NOTIFICATION_CHANGE;
    public static final ADDRESS_CHANGE SYSTEM_LBS_CHANGED;
    public static final ADDRESS_CHANGE WIDGET_ADDED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/dal2/locations/LocationChange$Flags, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LIST = new <init>("LIST", 0);
        ITEM_REMOVED = new <init>("ITEM_REMOVED", 1);
        ITEMS_REMOVED = new <init>("ITEMS_REMOVED", 2);
        ITEM_ADDED = new <init>("ITEM_ADDED", 3);
        INITIAL = new <init>("INITIAL", 4);
        SYSTEM_LBS_CHANGED = new <init>("SYSTEM_LBS_CHANGED", 5);
        FOLLOW_ME_CHANGE = new <init>("FOLLOW_ME_CHANGE", 6);
        FOLLOW_ME_CHANGE_ON_LAST_LOCATION = new <init>("FOLLOW_ME_CHANGE_ON_LAST_LOCATION", 7);
        FOLLOW_ME_ACTIVATED = new <init>("FOLLOW_ME_ACTIVATED", 8);
        FOLLOW_ME_DEACTIVATED = new <init>("FOLLOW_ME_DEACTIVATED", 9);
        FOLLOW_ME_ACTIVATION_FAILURE = new <init>("FOLLOW_ME_ACTIVATION_FAILURE", 10);
        ACTIVE = new <init>("ACTIVE", 11);
        WIDGET_ADDED = new <init>("WIDGET_ADDED", 12);
        NOTIFICATION_CHANGE = new <init>("NOTIFICATION_CHANGE", 13);
        LIST_CREATED = new <init>("LIST_CREATED", 14);
        ADDRESS_CHANGE = new <init>("ADDRESS_CHANGE", 15);
        $VALUES = (new .VALUES[] {
            LIST, ITEM_REMOVED, ITEMS_REMOVED, ITEM_ADDED, INITIAL, SYSTEM_LBS_CHANGED, FOLLOW_ME_CHANGE, FOLLOW_ME_CHANGE_ON_LAST_LOCATION, FOLLOW_ME_ACTIVATED, FOLLOW_ME_DEACTIVATED, 
            FOLLOW_ME_ACTIVATION_FAILURE, ACTIVE, WIDGET_ADDED, NOTIFICATION_CHANGE, LIST_CREATED, ADDRESS_CHANGE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
