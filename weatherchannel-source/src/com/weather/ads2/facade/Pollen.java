// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.locations.SavedLocation;
import java.util.List;

public class Pollen
{

    public static final Pollen EMPTY = new Pollen("nl");
    public final String pollenLabel;

    public Pollen(RecordSets recordsets, SavedLocation savedlocation)
    {
        boolean flag;
        if (recordsets.hasDataFor(savedlocation) && recordsets.wxdv2Pollen != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            recordsets = recordsets.wxdv2Pollen.getPollenDoc();
        } else
        {
            recordsets = null;
        }
        if (recordsets == null)
        {
            recordsets = "nl";
        } else
        {
            recordsets = extractPollenValue(recordsets);
        }
        pollenLabel = recordsets;
    }

    public Pollen(String s)
    {
        pollenLabel = s;
    }

    private static String extractPollenValue(com.weather.dal2.data.PollenRecord.PollenDoc pollendoc)
    {
        return getMaxPollenLabel(Math.max(Math.max(Math.max(getPollenValue(pollendoc.getGrassPollen()), getPollenValue(pollendoc.getTreePollen())), getPollenValue(pollendoc.getWeedPollen())), getMoldValue(pollendoc.getMoldCount())));
    }

    private static String getMaxPollenLabel(int i)
    {
        if (i < 0)
        {
            return "nl";
        }
        if (i <= 1)
        {
            return "lo";
        }
        if (i <= 2)
        {
            return "me";
        } else
        {
            return "hi";
        }
    }

    private static int getMoldValue(Integer integer)
    {
        if (integer == null || integer.intValue() < 0 || integer.intValue() > 4)
        {
            return -1;
        } else
        {
            return integer.intValue();
        }
    }

    private static int getPollenValue(List list)
    {
        if (list != null && !list.isEmpty())
        {
            if ((list = ((com.weather.dal2.data.PollenRecord.PollenDoc.PollenDay)list.get(0)).getPollenIndexCode()) != null)
            {
                return list.intValue();
            }
        }
        return -1;
    }

}
