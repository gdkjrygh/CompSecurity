// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import com.google.common.base.Preconditions;
import com.google.common.collect.Range;
import com.weather.util.TwcPreconditions;
import com.weather.util.geometry.LatLng;
import com.weather.util.ui.Dimension;
import java.util.Arrays;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

public class MapUtil
{

    private static final double PIXELS_PER_MILE_VALUES[];
    private static final double STARTING_PIXELS_PER_MILE = 12800D;

    private MapUtil()
    {
    }

    public static Dimension clip(Dimension dimension, int i)
    {
        Range range = GoogleStaticMapsUrl.getValidPixels(i);
        int j = ((Integer)range.lowerEndpoint()).intValue();
        int k = ((Integer)range.upperEndpoint()).intValue();
        int i1 = dimension.getHeight();
        int j1 = dimension.getWidth();
        int l = i1;
        if (l < j)
        {
            i = j;
        } else
        {
            i = l;
            if (l > k)
            {
                i = k;
            }
        }
        l = j1;
        if (l >= j)
        {
            j = l;
            if (l > k)
            {
                j = k;
            }
        }
        if (i1 != i || j1 != j)
        {
            dimension = new Dimension(j, i);
        }
        return dimension;
    }

    public static int getZoomLevel(int i, int j, int k)
    {
        Preconditions.checkArgument(GoogleStaticMapsUrl.getValidPixels(j).contains(Integer.valueOf(i / j)), "pixels must be within range");
        TwcPreconditions.checkAllowed(Integer.valueOf(j), GoogleStaticMapsUrl.validScales);
        double d;
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "miles must be greater than zero");
        d = (double)i / (double)j / (double)k;
        j = Arrays.binarySearch(PIXELS_PER_MILE_VALUES, d);
        i = j;
        if (j < 0)
        {
            i = -(j + 1);
        }
        return i;
    }

    public static LatLng midPoint(LatLng latlng, LatLng latlng1)
    {
        double d4 = Math.toRadians(latlng1.longitude - latlng.longitude);
        double d1 = Math.toRadians(latlng.latitude);
        double d3 = Math.toRadians(latlng1.latitude);
        double d = Math.toRadians(latlng.longitude);
        double d2 = Math.cos(d3) * Math.cos(d4);
        d4 = Math.cos(d3) * Math.sin(d4);
        d3 = Math.atan2(Math.sin(d1) + Math.sin(d3), Math.sqrt((Math.cos(d1) + d2) * (Math.cos(d1) + d2) + d4 * d4));
        d1 = Math.atan2(d4, Math.cos(d1) + d2);
        return new LatLng(Double.valueOf(Math.toDegrees(d3)), Double.valueOf(Math.toDegrees(d + d1)));
    }

    static 
    {
        PIXELS_PER_MILE_VALUES = new double[21];
        double d = 12800D;
        for (int i = PIXELS_PER_MILE_VALUES.length - 1; i >= 0; i--)
        {
            PIXELS_PER_MILE_VALUES[i] = d;
            d /= 2D;
        }

    }
}
