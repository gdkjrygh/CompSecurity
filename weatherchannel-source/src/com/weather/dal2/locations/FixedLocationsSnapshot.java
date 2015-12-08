// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.dal2.locations:
//            FixedLocations, SavedLocation

public class FixedLocationsSnapshot
    implements Serializable
{

    private static final long serialVersionUID = 0x3bc0aa0a8dedff8cL;
    private final List locations = FixedLocations.getInstance().viewLocations();

    public FixedLocationsSnapshot()
    {
    }

    public SavedLocation getFirstLocationWithTag(String s)
    {
        for (Iterator iterator = locations.iterator(); iterator.hasNext();)
        {
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.getTags().contains(s))
            {
                return savedlocation;
            }
        }

        return null;
    }

    public Set getLocationsWithNotification(SavedLocation.AlertType alerttype)
    {
        HashSet hashset = new HashSet();
        Iterator iterator = locations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.hasAlert(alerttype))
            {
                hashset.add(savedlocation);
            }
        } while (true);
        return hashset;
    }

    public List getLocationsWithTag(String s)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        Iterator iterator = locations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SavedLocation savedlocation = (SavedLocation)iterator.next();
            if (savedlocation.getTags().contains(s))
            {
                arraylist.add(savedlocation);
            }
        } while (true);
        return arraylist;
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
