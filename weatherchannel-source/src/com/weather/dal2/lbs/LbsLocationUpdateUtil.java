// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import com.spatial4j.core.distance.DistanceUtils;
import com.weather.dal2.DalPrefs;
import com.weather.util.prefs.Prefs;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsSystem

public class LbsLocationUpdateUtil
{

    static final double FIFTY_METERS_DISPLACEMENT = 0.050000000000000003D;
    private static final int HALF_A_MINUTE = 30;
    private static final LbsLocationUpdateUtil INSTANCE = new LbsLocationUpdateUtil();
    private final Prefs dalPrefs;

    private LbsLocationUpdateUtil()
    {
        this(DalPrefs.getInstance());
    }

    LbsLocationUpdateUtil(Prefs prefs)
    {
        dalPrefs = prefs;
    }

    static LbsLocationUpdateUtil getInstance()
    {
        return INSTANCE;
    }

    public boolean canUpdate(double d, double d1)
    {
        long l = dalPrefs.getLong(com.weather.dal2.DalPrefs.Keys.LAST_LBS_SERVICE_INTENT, 0L);
        return System.currentTimeMillis() >= (LbsSystem.interval + l) - TimeUnit.SECONDS.toMillis(30L) && locationHasDisplace(d, d1, 0.050000000000000003D);
    }

    public void commitUpdateTimeAndLatLng(double d, double d1)
    {
        commitUpdateTimeAndLatLng(d, d1, System.currentTimeMillis());
    }

    void commitUpdateTimeAndLatLng(double d, double d1, long l)
    {
        dalPrefs.putLong(com.weather.dal2.DalPrefs.Keys.LAST_LBS_SERVICE_INTENT, l);
        dalPrefs.putDouble(com.weather.dal2.DalPrefs.Keys.LAST_LATITUDE, d);
        dalPrefs.putDouble(com.weather.dal2.DalPrefs.Keys.LAST_LONGITUDE, d1);
    }

    public double getDisplacement(double d, double d1, double d2, double d3)
    {
        return DistanceUtils.radians2Dist(DistanceUtils.distLawOfCosinesRAD(d, d1, d2, d3), 111.19507973436875D);
    }

    boolean locationHasDisplace(double d, double d1, double d2)
    {
        if (dalPrefs.contains(com.weather.dal2.DalPrefs.Keys.LAST_LATITUDE) && dalPrefs.contains(com.weather.dal2.DalPrefs.Keys.LAST_LONGITUDE))
        {
            return getDisplacement(dalPrefs.getDouble(com.weather.dal2.DalPrefs.Keys.LAST_LATITUDE, 0.0D), dalPrefs.getDouble(com.weather.dal2.DalPrefs.Keys.LAST_LONGITUDE, 0.0D), d, d1) >= d2;
        } else
        {
            return true;
        }
    }

    public void resetUpdateTime()
    {
        dalPrefs.remove(com.weather.dal2.DalPrefs.Keys.LAST_LBS_SERVICE_INTENT);
    }

}
