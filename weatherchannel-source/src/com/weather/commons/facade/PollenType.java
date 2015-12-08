// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import com.weather.util.app.AbstractTwcApplication;

public final class PollenType extends Enum
{

    private static final PollenType $VALUES[];
    public static final PollenType GRASS;
    public static final PollenType TREE;
    public static final PollenType WEED;
    private final int typeIconId;
    private final int typeId;

    private PollenType(String s, int i, int j, int k)
    {
        super(s, i);
        typeId = j;
        typeIconId = k;
    }

    public static PollenType valueOf(String s)
    {
        return (PollenType)Enum.valueOf(com/weather/commons/facade/PollenType, s);
    }

    public static PollenType[] values()
    {
        return (PollenType[])$VALUES.clone();
    }

    public String getPollenType()
    {
        return AbstractTwcApplication.getRootContext().getString(typeId);
    }

    public int getTypeIconId()
    {
        return typeIconId;
    }

    static 
    {
        TREE = new PollenType("TREE", 0, com.weather.commons.R.string.pollen_tree, com.weather.commons.R.drawable.tree_icon);
        GRASS = new PollenType("GRASS", 1, com.weather.commons.R.string.pollen_grass, com.weather.commons.R.drawable.grass_icon);
        WEED = new PollenType("WEED", 2, com.weather.commons.R.string.pollen_weed, com.weather.commons.R.drawable.weed_icon);
        $VALUES = (new PollenType[] {
            TREE, GRASS, WEED
        });
    }
}
