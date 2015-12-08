// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.geometry;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.spatial4j.core.io.GeohashUtils;
import java.util.Collection;
import org.jgeohash.GeoHashUtils;
import org.jgeohash.distance.MeasuringUnit;

// Referenced classes of package com.weather.util.geometry:
//            LatLng, LatLngBounds

public final class TwcGeohashUtils
{
    private static final class FirstLetterExcluder
        implements Predicate
    {

        private final String excludeString;

        public volatile boolean apply(Object obj)
        {
            return apply((String)obj);
        }

        public boolean apply(String s)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (s != null)
            {
                flag = flag1;
                if (excludeString.indexOf(s.charAt(0)) == -1)
                {
                    flag = true;
                }
            }
            return flag;
        }

        FirstLetterExcluder(String s)
        {
            excludeString = s;
        }
    }


    private static final double HashLengthToKmErrorMap[];
    private static final int MAX_PRECISION_CALCULATED_BY_KM_ERROR = 8;
    private static final String NORTH_POLE_HASHES = "bcfguvyz";
    private static final String SOUTH_POLE_HASHES = "0145hjnp";
    private static final FirstLetterExcluder excludeNorthPole = new FirstLetterExcluder("bcfguvyz");
    private static final FirstLetterExcluder excludeSouthPole = new FirstLetterExcluder("0145hjnp");

    private TwcGeohashUtils()
    {
    }

    static double convertToKm(double d, MeasuringUnit measuringunit)
    {
        static class _cls1
        {

            static final int $SwitchMap$org$jgeohash$distance$MeasuringUnit[];

            static 
            {
                $SwitchMap$org$jgeohash$distance$MeasuringUnit = new int[MeasuringUnit.values().length];
                try
                {
                    $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.MILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.METER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.KILOMETER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.jgeohash.distance.MeasuringUnit[measuringunit.ordinal()])
        {
        default:
            return d;

        case 1: // '\001'
            return d * 1.6093440000000001D;

        case 2: // '\002'
            return d / 1000D;
        }
    }

    public static Collection getAdjacentGeohashes(LatLng latlng, double d, double d1, MeasuringUnit measuringunit, int i)
    {
        Preconditions.checkNotNull(measuringunit);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maxLength must be > 0");
        return getAdjacentGeohashes(latlng, Math.min(getLengthForErrorAllowance(d, d1, measuringunit), i));
    }

    private static Collection getAdjacentGeohashes(LatLng latlng, int i)
    {
        String s = GeoHashUtils.encode(latlng.latitude, latlng.longitude);
        latlng = s;
        if (s.length() > i)
        {
            latlng = s.substring(0, i);
        }
        return getAdjacentGeohashes(((String) (latlng)));
    }

    public static Collection getAdjacentGeohashes(LatLngBounds latlngbounds, int i)
    {
        Preconditions.checkNotNull(latlngbounds);
        int j;
        int k;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maxLength must be > 0");
        k = GeohashUtils.lookupHashLenForWidthHeight(latlngbounds.getWidth(), latlngbounds.getHeight());
        j = k;
        if (k > 1)
        {
            j = k - 1;
        }
        return getAdjacentGeohashes(latlngbounds.getCenter(), Math.min(j, i));
    }

    private static Collection getAdjacentGeohashes(String s)
    {
        Object obj = Predicates.alwaysTrue();
        if ("bcfguvyz".indexOf(s.charAt(0)) == -1) goto _L2; else goto _L1
_L1:
        obj = excludeSouthPole;
_L4:
        return Collections2.filter(GeoHashUtils.getAllAdjacentAreasList(s), ((Predicate) (obj)));
_L2:
        if ("0145hjnp".indexOf(s.charAt(0)) != -1)
        {
            obj = excludeNorthPole;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int getLengthForErrorAllowance(double d, double d1, MeasuringUnit measuringunit)
    {
        byte byte1 = 8;
        d = convertToKm(Math.max(d, d1), measuringunit);
        for (int i = 1; i < 8; i++)
        {
            if (d <= HashLengthToKmErrorMap[i] && d > HashLengthToKmErrorMap[i + 1])
            {
                return i;
            }
        }

        byte byte0;
        if (d < HashLengthToKmErrorMap[8])
        {
            byte0 = byte1;
        } else
        {
            byte0 = 1;
        }
        return byte0;
    }

    static 
    {
        HashLengthToKmErrorMap = new double[9];
        HashLengthToKmErrorMap[0] = 10000D;
        HashLengthToKmErrorMap[1] = 2500D;
        HashLengthToKmErrorMap[2] = 630D;
        HashLengthToKmErrorMap[3] = 78D;
        HashLengthToKmErrorMap[4] = 20D;
        HashLengthToKmErrorMap[5] = 2.3999999999999999D;
        HashLengthToKmErrorMap[6] = 0.60999999999999999D;
        HashLengthToKmErrorMap[7] = 0.075999999999999998D;
        HashLengthToKmErrorMap[8] = 0.019D;
    }
}
