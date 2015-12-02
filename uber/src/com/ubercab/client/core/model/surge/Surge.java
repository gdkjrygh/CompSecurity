// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.surge;

import com.ubercab.rider.realtime.model.DropNotification;
import com.ubercab.rider.realtime.model.DynamicFare;
import hnx;
import hny;

// Referenced classes of package com.ubercab.client.core.model.surge:
//            Shape_Surge

public abstract class Surge extends hnx
    implements DynamicFare
{

    public static final float DEFAULT_MULTIPLIER = 1F;
    public static final String SURGE_SCREEN_TYPE_SOBRIETY = "sobriety";

    public Surge()
    {
    }

    public static Surge create()
    {
        return new Shape_Surge();
    }

    public abstract String getBase();

    public abstract String getCancellation();

    public abstract String getDistanceUnit();

    public abstract DropNotification getDropNotification();

    public abstract long getExpirationTime();

    public abstract long getFareId();

    public abstract String getFareUuid();

    abstract boolean getForceFareEstimate();

    public abstract int getId();

    public abstract String getMinimum();

    public abstract float getMultiplier();

    public abstract String getPerDistanceUnit();

    public abstract String getPerMinute();

    public abstract String getSafeRidesFee();

    public abstract String getScreenType();

    abstract boolean getShowRates();

    public abstract String getSpeedThresholdMps();

    public abstract String getType();

    boolean isForceFareEstimate()
    {
        return getForceFareEstimate();
    }

    boolean isShowRates()
    {
        return getShowRates();
    }

    public boolean isSurging()
    {
        return getMultiplier() > 1.0F;
    }

    protected Object onGet(hny hny, Object obj)
    {
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$surge$Shape_Surge$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$surge$Shape_Surge$Property = new int[Shape_Surge.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$surge$Shape_Surge$Property[Shape_Surge.Property.MULTIPLIER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.ubercab.client.core.model.surge.Shape_Surge.Property[((Shape_Surge.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 30;
           goto _L1 _L2
_L1:
        return obj;
_L2:
        if (obj.equals(Float.valueOf(0.0F)))
        {
            return Float.valueOf(1.0F);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public abstract Surge setBase(String s);

    public abstract Surge setBaseValue(String s);

    public abstract Surge setCancellation(String s);

    public abstract Surge setDistanceUnit(String s);

    public abstract Surge setDropNotification(DropNotification dropnotification);

    public abstract Surge setExpirationTime(long l);

    public abstract Surge setFareId(long l);

    abstract Surge setFareUuid(String s);

    public abstract Surge setForceFareEstimate(boolean flag);

    public abstract Surge setId(int i);

    public abstract Surge setMinimum(String s);

    public abstract Surge setMultiplier(float f);

    public abstract Surge setPerDistanceUnit(String s);

    public abstract Surge setPerMinute(String s);

    abstract Surge setSafeRidesFee(String s);

    public abstract Surge setScreenType(String s);

    public abstract Surge setShowRates(boolean flag);

    public abstract Surge setSpeedThresholdMps(String s);

    public abstract Surge setType(String s);
}
