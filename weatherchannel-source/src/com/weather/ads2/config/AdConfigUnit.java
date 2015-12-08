// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.weather.util.ui.Dimension;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.ads2.config:
//            AdSlotNotFoundException, AdConfig, AdSlot, AdUnitPrefix

public class AdConfigUnit
{

    public final AdSlot adSlot;
    public final AdUnitPrefix prefix;

    public AdConfigUnit(AdConfig adconfig, String s)
        throws AdSlotNotFoundException
    {
        adSlot = adconfig.getAdUnitSlot(s);
        prefix = adconfig.getAdUnitPrefixForCurrentLocale();
    }

    private AdConfigUnit(AdSlot adslot, AdUnitPrefix adunitprefix)
    {
        adSlot = adslot;
        prefix = adunitprefix;
    }

    public AdConfigUnit addTargetingParameters(Map map)
    {
        return new AdConfigUnit(adSlot.addTargetingParameters(map), prefix);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdConfigUnit)obj;
            if (adSlot == null ? ((AdConfigUnit) (obj)).adSlot != null : !adSlot.equals(((AdConfigUnit) (obj)).adSlot))
            {
                return false;
            }
            if (prefix == null ? ((AdConfigUnit) (obj)).prefix != null : !prefix.equals(((AdConfigUnit) (obj)).prefix))
            {
                return false;
            }
        }
        return true;
    }

    public Dimension getAdBoundingSizeInPixels(Context context, AdSize adsize)
    {
        int j = 0;
        int i = 0;
        for (adsize = adSlot.getAllowedAdSizes(adsize).iterator(); adsize.hasNext();)
        {
            AdSize adsize1 = (AdSize)adsize.next();
            j = Math.max(j, adsize1.getWidthInPixels(context));
            i = Math.max(i, adsize1.getHeightInPixels(context));
        }

        return new Dimension(j, i);
    }

    public String getAdUnitId()
    {
        String s = adSlot.getSuffix();
        String s1 = prefix.getAdUnitPrefix();
        return (new StringBuilder()).append(s1).append(s).toString();
    }

    public List getAllowedAdSizes(AdSize adsize)
    {
        return adSlot.getAllowedAdSizes(adsize);
    }

    public Map getParameters()
    {
        return adSlot.getParameters();
    }

    public String getSlotName()
    {
        return adSlot.getSlotName();
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (adSlot != null)
        {
            i = adSlot.hashCode();
        } else
        {
            i = 0;
        }
        if (prefix != null)
        {
            j = prefix.hashCode();
        }
        return i * 31 + j;
    }
}
