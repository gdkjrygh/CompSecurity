// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import java.util.Iterator;
import java.util.List;

public class LastLocationFinder
{

    private LocationManager locationManager;

    public LastLocationFinder(Context context)
    {
        this((LocationManager)context.getSystemService("location"));
    }

    LastLocationFinder(LocationManager locationmanager)
    {
        locationManager = locationmanager;
    }

    public Location getLastBestLocation(long l, Criteria criteria)
    {
        Object obj = null;
        Criteria criteria1 = null;
        List list = locationManager.getProviders(criteria, true);
        criteria = obj;
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                criteria = criteria1;
                if (!iterator.hasNext())
                {
                    break;
                }
                criteria = (String)iterator.next();
                criteria = locationManager.getLastKnownLocation(criteria);
                if (criteria != null && (criteria1 == null || criteria.getTime() > criteria1.getTime()))
                {
                    criteria1 = criteria;
                }
            } while (true);
        }
        if (criteria == null)
        {
            return null;
        }
        criteria1 = criteria;
        if (l < System.currentTimeMillis() - criteria.getTime())
        {
            criteria1 = null;
        }
        return criteria1;
    }
}
