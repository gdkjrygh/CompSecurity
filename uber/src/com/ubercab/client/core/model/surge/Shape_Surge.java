// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.surge;

import com.ubercab.rider.realtime.model.DropNotification;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ubercab.client.core.model.surge:
//            Surge

public final class Shape_Surge extends Surge
{

    private static final Set SHAPE_PROPERTIES;
    private String base;
    private String baseValue;
    private String cancellation;
    private String distanceUnit;
    private DropNotification dropNotification;
    private long expirationTime;
    private long fareId;
    private String fareUuid;
    private boolean forceFareEstimate;
    private int id;
    private String minimum;
    private float multiplier;
    private String perDistanceUnit;
    private String perMinute;
    private String safeRidesFee;
    private String screenType;
    private boolean showRates;
    private String speedThresholdMps;
    private String type;

    Shape_Surge()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Surge)obj;
            if (((Surge) (obj)).getBaseValue() == null ? getBaseValue() != null : !((Surge) (obj)).getBaseValue().equals(getBaseValue()))
            {
                return false;
            }
            if (((Surge) (obj)).getBase() == null ? getBase() != null : !((Surge) (obj)).getBase().equals(getBase()))
            {
                return false;
            }
            if (((Surge) (obj)).getDistanceUnit() == null ? getDistanceUnit() != null : !((Surge) (obj)).getDistanceUnit().equals(getDistanceUnit()))
            {
                return false;
            }
            if (((Surge) (obj)).getFareId() != getFareId())
            {
                return false;
            }
            if (((Surge) (obj)).getMinimum() == null ? getMinimum() != null : !((Surge) (obj)).getMinimum().equals(getMinimum()))
            {
                return false;
            }
            if (((Surge) (obj)).getPerDistanceUnit() == null ? getPerDistanceUnit() != null : !((Surge) (obj)).getPerDistanceUnit().equals(getPerDistanceUnit()))
            {
                return false;
            }
            if (((Surge) (obj)).getPerMinute() == null ? getPerMinute() != null : !((Surge) (obj)).getPerMinute().equals(getPerMinute()))
            {
                return false;
            }
            if (((Surge) (obj)).getExpirationTime() != getExpirationTime())
            {
                return false;
            }
            if (Float.compare(((Surge) (obj)).getMultiplier(), getMultiplier()) != 0)
            {
                return false;
            }
            if (((Surge) (obj)).getSafeRidesFee() == null ? getSafeRidesFee() != null : !((Surge) (obj)).getSafeRidesFee().equals(getSafeRidesFee()))
            {
                return false;
            }
            if (((Surge) (obj)).getType() == null ? getType() != null : !((Surge) (obj)).getType().equals(getType()))
            {
                return false;
            }
            if (((Surge) (obj)).getScreenType() == null ? getScreenType() != null : !((Surge) (obj)).getScreenType().equals(getScreenType()))
            {
                return false;
            }
            if (((Surge) (obj)).getDropNotification() == null ? getDropNotification() != null : !((Surge) (obj)).getDropNotification().equals(getDropNotification()))
            {
                return false;
            }
            if (((Surge) (obj)).getCancellation() == null ? getCancellation() != null : !((Surge) (obj)).getCancellation().equals(getCancellation()))
            {
                return false;
            }
            if (((Surge) (obj)).getFareUuid() == null ? getFareUuid() != null : !((Surge) (obj)).getFareUuid().equals(getFareUuid()))
            {
                return false;
            }
            if (((Surge) (obj)).getSpeedThresholdMps() == null ? getSpeedThresholdMps() != null : !((Surge) (obj)).getSpeedThresholdMps().equals(getSpeedThresholdMps()))
            {
                return false;
            }
            if (((Surge) (obj)).getId() != getId())
            {
                return false;
            }
            if (((Surge) (obj)).getForceFareEstimate() != getForceFareEstimate())
            {
                return false;
            }
            if (((Surge) (obj)).getShowRates() != getShowRates())
            {
                return false;
            }
        }
        return true;
    }

    public final String getBase()
    {
        return (String)onGet(Property.BASE, base);
    }

    public final String getBaseValue()
    {
        return (String)onGet(Property.BASE_VALUE, baseValue);
    }

    public final String getCancellation()
    {
        return (String)onGet(Property.CANCELLATION, cancellation);
    }

    public final String getDistanceUnit()
    {
        return (String)onGet(Property.DISTANCE_UNIT, distanceUnit);
    }

    public final DropNotification getDropNotification()
    {
        return (DropNotification)onGet(Property.DROP_NOTIFICATION, dropNotification);
    }

    public final long getExpirationTime()
    {
        return ((Long)onGet(Property.EXPIRATION_TIME, Long.valueOf(expirationTime))).longValue();
    }

    public final long getFareId()
    {
        return ((Long)onGet(Property.FARE_ID, Long.valueOf(fareId))).longValue();
    }

    public final String getFareUuid()
    {
        return (String)onGet(Property.FARE_UUID, fareUuid);
    }

    final boolean getForceFareEstimate()
    {
        return ((Boolean)onGet(Property.FORCE_FARE_ESTIMATE, Boolean.valueOf(forceFareEstimate))).booleanValue();
    }

    public final int getId()
    {
        return ((Integer)onGet(Property.ID, Integer.valueOf(id))).intValue();
    }

    public final String getMinimum()
    {
        return (String)onGet(Property.MINIMUM, minimum);
    }

    public final float getMultiplier()
    {
        return ((Float)onGet(Property.MULTIPLIER, Float.valueOf(multiplier))).floatValue();
    }

    public final String getPerDistanceUnit()
    {
        return (String)onGet(Property.PER_DISTANCE_UNIT, perDistanceUnit);
    }

    public final String getPerMinute()
    {
        return (String)onGet(Property.PER_MINUTE, perMinute);
    }

    public final String getSafeRidesFee()
    {
        return (String)onGet(Property.SAFE_RIDES_FEE, safeRidesFee);
    }

    public final String getScreenType()
    {
        return (String)onGet(Property.SCREEN_TYPE, screenType);
    }

    final boolean getShowRates()
    {
        return ((Boolean)onGet(Property.SHOW_RATES, Boolean.valueOf(showRates))).booleanValue();
    }

    public final String getSpeedThresholdMps()
    {
        return (String)onGet(Property.SPEED_THRESHOLD_MPS, speedThresholdMps);
    }

    public final String getType()
    {
        return (String)onGet(Property.TYPE, type);
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        char c;
        int l1;
        int i2;
        int j2;
        if (baseValue == null)
        {
            i = 0;
        } else
        {
            i = baseValue.hashCode();
        }
        if (base == null)
        {
            j = 0;
        } else
        {
            j = base.hashCode();
        }
        if (distanceUnit == null)
        {
            k = 0;
        } else
        {
            k = distanceUnit.hashCode();
        }
        l = (int)((long)((k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) ^ (fareId >>> 32 ^ fareId));
        if (minimum == null)
        {
            i = 0;
        } else
        {
            i = minimum.hashCode();
        }
        if (perDistanceUnit == null)
        {
            j = 0;
        } else
        {
            j = perDistanceUnit.hashCode();
        }
        if (perMinute == null)
        {
            k = 0;
        } else
        {
            k = perMinute.hashCode();
        }
        l1 = (int)((long)((k ^ (j ^ (i ^ l * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) ^ (expirationTime >>> 32 ^ expirationTime));
        i2 = Float.floatToIntBits(multiplier);
        if (safeRidesFee == null)
        {
            i = 0;
        } else
        {
            i = safeRidesFee.hashCode();
        }
        if (type == null)
        {
            j = 0;
        } else
        {
            j = type.hashCode();
        }
        if (screenType == null)
        {
            k = 0;
        } else
        {
            k = screenType.hashCode();
        }
        if (dropNotification == null)
        {
            l = 0;
        } else
        {
            l = dropNotification.hashCode();
        }
        if (cancellation == null)
        {
            i1 = 0;
        } else
        {
            i1 = cancellation.hashCode();
        }
        if (fareUuid == null)
        {
            j1 = 0;
        } else
        {
            j1 = fareUuid.hashCode();
        }
        if (speedThresholdMps != null)
        {
            k1 = speedThresholdMps.hashCode();
        }
        j2 = id;
        if (forceFareEstimate)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!showRates)
        {
            c1 = '\u04D5';
        }
        return (c ^ (((j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ (l1 * 0xf4243 ^ i2) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k1) * 0xf4243 ^ j2) * 0xf4243) * 0xf4243 ^ c1;
    }

    public final Surge setBase(String s)
    {
        String s1 = base;
        base = (String)beforeSet(Property.BASE, s1, s);
        afterSet(Property.BASE, s1, s);
        return this;
    }

    public final Surge setBaseValue(String s)
    {
        String s1 = baseValue;
        baseValue = (String)beforeSet(Property.BASE_VALUE, s1, s);
        afterSet(Property.BASE_VALUE, s1, s);
        return this;
    }

    public final Surge setCancellation(String s)
    {
        String s1 = cancellation;
        cancellation = (String)beforeSet(Property.CANCELLATION, s1, s);
        afterSet(Property.CANCELLATION, s1, s);
        return this;
    }

    public final Surge setDistanceUnit(String s)
    {
        String s1 = distanceUnit;
        distanceUnit = (String)beforeSet(Property.DISTANCE_UNIT, s1, s);
        afterSet(Property.DISTANCE_UNIT, s1, s);
        return this;
    }

    public final Surge setDropNotification(DropNotification dropnotification)
    {
        DropNotification dropnotification1 = dropNotification;
        dropNotification = (DropNotification)beforeSet(Property.DROP_NOTIFICATION, dropnotification1, dropnotification);
        afterSet(Property.DROP_NOTIFICATION, dropnotification1, dropnotification);
        return this;
    }

    public final Surge setExpirationTime(long l)
    {
        long l1 = expirationTime;
        expirationTime = ((Long)beforeSet(Property.EXPIRATION_TIME, Long.valueOf(l1), Long.valueOf(l))).longValue();
        afterSet(Property.EXPIRATION_TIME, Long.valueOf(l1), Long.valueOf(l));
        return this;
    }

    public final Surge setFareId(long l)
    {
        long l1 = fareId;
        fareId = ((Long)beforeSet(Property.FARE_ID, Long.valueOf(l1), Long.valueOf(l))).longValue();
        afterSet(Property.FARE_ID, Long.valueOf(l1), Long.valueOf(l));
        return this;
    }

    final Surge setFareUuid(String s)
    {
        String s1 = fareUuid;
        fareUuid = (String)beforeSet(Property.FARE_UUID, s1, s);
        afterSet(Property.FARE_UUID, s1, s);
        return this;
    }

    public final Surge setForceFareEstimate(boolean flag)
    {
        boolean flag1 = forceFareEstimate;
        forceFareEstimate = ((Boolean)beforeSet(Property.FORCE_FARE_ESTIMATE, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.FORCE_FARE_ESTIMATE, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final Surge setId(int i)
    {
        int j = id;
        id = ((Integer)beforeSet(Property.ID, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.ID, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    public final Surge setMinimum(String s)
    {
        String s1 = minimum;
        minimum = (String)beforeSet(Property.MINIMUM, s1, s);
        afterSet(Property.MINIMUM, s1, s);
        return this;
    }

    public final Surge setMultiplier(float f)
    {
        float f1 = multiplier;
        multiplier = ((Float)beforeSet(Property.MULTIPLIER, Float.valueOf(f1), Float.valueOf(f))).floatValue();
        afterSet(Property.MULTIPLIER, Float.valueOf(f1), Float.valueOf(f));
        return this;
    }

    public final Surge setPerDistanceUnit(String s)
    {
        String s1 = perDistanceUnit;
        perDistanceUnit = (String)beforeSet(Property.PER_DISTANCE_UNIT, s1, s);
        afterSet(Property.PER_DISTANCE_UNIT, s1, s);
        return this;
    }

    public final Surge setPerMinute(String s)
    {
        String s1 = perMinute;
        perMinute = (String)beforeSet(Property.PER_MINUTE, s1, s);
        afterSet(Property.PER_MINUTE, s1, s);
        return this;
    }

    final Surge setSafeRidesFee(String s)
    {
        String s1 = safeRidesFee;
        safeRidesFee = (String)beforeSet(Property.SAFE_RIDES_FEE, s1, s);
        afterSet(Property.SAFE_RIDES_FEE, s1, s);
        return this;
    }

    public final Surge setScreenType(String s)
    {
        String s1 = screenType;
        screenType = (String)beforeSet(Property.SCREEN_TYPE, s1, s);
        afterSet(Property.SCREEN_TYPE, s1, s);
        return this;
    }

    public final Surge setShowRates(boolean flag)
    {
        boolean flag1 = showRates;
        showRates = ((Boolean)beforeSet(Property.SHOW_RATES, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.SHOW_RATES, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final Surge setSpeedThresholdMps(String s)
    {
        String s1 = speedThresholdMps;
        speedThresholdMps = (String)beforeSet(Property.SPEED_THRESHOLD_MPS, s1, s);
        afterSet(Property.SPEED_THRESHOLD_MPS, s1, s);
        return this;
    }

    public final Surge setType(String s)
    {
        String s1 = type;
        type = (String)beforeSet(Property.TYPE, s1, s);
        afterSet(Property.TYPE, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Surge{baseValue=")).append(baseValue).append(", base=").append(base).append(", distanceUnit=").append(distanceUnit).append(", fareId=").append(fareId).append(", minimum=").append(minimum).append(", perDistanceUnit=").append(perDistanceUnit).append(", perMinute=").append(perMinute).append(", expirationTime=").append(expirationTime).append(", multiplier=").append(multiplier).append(", safeRidesFee=").append(safeRidesFee).append(", type=").append(type).append(", screenType=").append(screenType).append(", dropNotification=").append(dropNotification).append(", cancellation=").append(cancellation).append(", fareUuid=").append(fareUuid).append(", speedThresholdMps=").append(speedThresholdMps).append(", id=").append(id).append(", forceFareEstimate=").append(forceFareEstimate).append(", showRates=").append(showRates).append("}").toString();
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.BASE_VALUE, Property.BASE, Property.DISTANCE_UNIT, Property.FARE_ID, Property.MINIMUM, Property.PER_DISTANCE_UNIT, Property.PER_MINUTE, Property.EXPIRATION_TIME, Property.MULTIPLIER, Property.SAFE_RIDES_FEE, 
            Property.TYPE, Property.SCREEN_TYPE, Property.DROP_NOTIFICATION, Property.CANCELLATION, Property.FARE_UUID, Property.SPEED_THRESHOLD_MPS, Property.ID, Property.FORCE_FARE_ESTIMATE, Property.SHOW_RATES
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property BASE;
        public static final Property BASE_VALUE;
        public static final Property CANCELLATION;
        public static final Property DISTANCE_UNIT;
        public static final Property DROP_NOTIFICATION;
        public static final Property EXPIRATION_TIME;
        public static final Property FARE_ID;
        public static final Property FARE_UUID;
        public static final Property FORCE_FARE_ESTIMATE;
        public static final Property ID;
        public static final Property MINIMUM;
        public static final Property MULTIPLIER;
        public static final Property PER_DISTANCE_UNIT;
        public static final Property PER_MINUTE;
        public static final Property SAFE_RIDES_FEE;
        public static final Property SCREEN_TYPE;
        public static final Property SHOW_RATES;
        public static final Property SPEED_THRESHOLD_MPS;
        public static final Property TYPE;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/surge/Shape_Surge$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            BASE_VALUE = new Property("BASE_VALUE", 0) {

                public final String toString()
                {
                    return "baseValue";
                }

            };
            BASE = new Property("BASE", 1) {

                public final String toString()
                {
                    return "base";
                }

            };
            DISTANCE_UNIT = new Property("DISTANCE_UNIT", 2) {

                public final String toString()
                {
                    return "distanceUnit";
                }

            };
            FARE_ID = new Property("FARE_ID", 3) {

                public final String toString()
                {
                    return "fareId";
                }

            };
            MINIMUM = new Property("MINIMUM", 4) {

                public final String toString()
                {
                    return "minimum";
                }

            };
            PER_DISTANCE_UNIT = new Property("PER_DISTANCE_UNIT", 5) {

                public final String toString()
                {
                    return "perDistanceUnit";
                }

            };
            PER_MINUTE = new Property("PER_MINUTE", 6) {

                public final String toString()
                {
                    return "perMinute";
                }

            };
            EXPIRATION_TIME = new Property("EXPIRATION_TIME", 7) {

                public final String toString()
                {
                    return "expirationTime";
                }

            };
            MULTIPLIER = new Property("MULTIPLIER", 8) {

                public final String toString()
                {
                    return "multiplier";
                }

            };
            SAFE_RIDES_FEE = new Property("SAFE_RIDES_FEE", 9) {

                public final String toString()
                {
                    return "safeRidesFee";
                }

            };
            TYPE = new Property("TYPE", 10) {

                public final String toString()
                {
                    return "type";
                }

            };
            SCREEN_TYPE = new Property("SCREEN_TYPE", 11) {

                public final String toString()
                {
                    return "screenType";
                }

            };
            DROP_NOTIFICATION = new Property("DROP_NOTIFICATION", 12) {

                public final String toString()
                {
                    return "dropNotification";
                }

            };
            CANCELLATION = new Property("CANCELLATION", 13) {

                public final String toString()
                {
                    return "cancellation";
                }

            };
            FARE_UUID = new Property("FARE_UUID", 14) {

                public final String toString()
                {
                    return "fareUuid";
                }

            };
            SPEED_THRESHOLD_MPS = new Property("SPEED_THRESHOLD_MPS", 15) {

                public final String toString()
                {
                    return "speedThresholdMps";
                }

            };
            ID = new Property("ID", 16) {

                public final String toString()
                {
                    return "id";
                }

            };
            FORCE_FARE_ESTIMATE = new Property("FORCE_FARE_ESTIMATE", 17) {

                public final String toString()
                {
                    return "forceFareEstimate";
                }

            };
            SHOW_RATES = new Property("SHOW_RATES", 18) {

                public final String toString()
                {
                    return "showRates";
                }

            };
            $VALUES = (new Property[] {
                BASE_VALUE, BASE, DISTANCE_UNIT, FARE_ID, MINIMUM, PER_DISTANCE_UNIT, PER_MINUTE, EXPIRATION_TIME, MULTIPLIER, SAFE_RIDES_FEE, 
                TYPE, SCREEN_TYPE, DROP_NOTIFICATION, CANCELLATION, FARE_UUID, SPEED_THRESHOLD_MPS, ID, FORCE_FARE_ESTIMATE, SHOW_RATES
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
