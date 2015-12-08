// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.weather.dal2.locations:
//            WidgetLocations

public class WidgetLocationsSnapshot
    implements Serializable
{

    private static final long serialVersionUID = 0x3bc0aa0a8dedff8cL;
    private final List locations = WidgetLocations.getInstance().viewLocations();

    public WidgetLocationsSnapshot()
    {
    }

    public int getSize()
    {
        return locations.size();
    }

    public List viewLocations()
    {
        return locations;
    }
}
