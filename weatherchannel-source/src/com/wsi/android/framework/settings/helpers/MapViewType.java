// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.settings.helpers;


public final class MapViewType extends Enum
{

    private static final MapViewType $VALUES[];
    public static final MapViewType HYBRID;
    public static final MapViewType STANDARD;
    public static final MapViewType UNDEFINED;

    private MapViewType(String s, int i)
    {
        super(s, i);
    }

    public static MapViewType getTypeFromString(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        s = valueOf(s.toUpperCase());
        return s;
        s;
        return UNDEFINED;
    }

    public static MapViewType valueOf(String s)
    {
        return (MapViewType)Enum.valueOf(com/wsi/android/framework/settings/helpers/MapViewType, s);
    }

    public static MapViewType[] values()
    {
        return (MapViewType[])$VALUES.clone();
    }

    static 
    {
        HYBRID = new MapViewType("HYBRID", 0);
        STANDARD = new MapViewType("STANDARD", 1);
        UNDEFINED = new MapViewType("UNDEFINED", 2);
        $VALUES = (new MapViewType[] {
            HYBRID, STANDARD, UNDEFINED
        });
    }
}
