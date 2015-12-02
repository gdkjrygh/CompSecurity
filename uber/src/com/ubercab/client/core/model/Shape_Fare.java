// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Fare

public final class Shape_Fare extends Fare
{

    private String base;
    private String baseValue;
    private String cancellation;
    private String distanceUnit;
    private int id;
    private String minimum;
    private String perDistanceUnit;
    private String perMinute;
    private String safeRidesFee;
    private String speedThresholdMps;
    private String type;

    Shape_Fare()
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
            obj = (Fare)obj;
            if (((Fare) (obj)).getId() != getId())
            {
                return false;
            }
            if (((Fare) (obj)).getBase() == null ? getBase() != null : !((Fare) (obj)).getBase().equals(getBase()))
            {
                return false;
            }
            if (((Fare) (obj)).getBaseValue() == null ? getBaseValue() != null : !((Fare) (obj)).getBaseValue().equals(getBaseValue()))
            {
                return false;
            }
            if (((Fare) (obj)).getCancellation() == null ? getCancellation() != null : !((Fare) (obj)).getCancellation().equals(getCancellation()))
            {
                return false;
            }
            if (((Fare) (obj)).getDistanceUnit() == null ? getDistanceUnit() != null : !((Fare) (obj)).getDistanceUnit().equals(getDistanceUnit()))
            {
                return false;
            }
            if (((Fare) (obj)).getMinimum() == null ? getMinimum() != null : !((Fare) (obj)).getMinimum().equals(getMinimum()))
            {
                return false;
            }
            if (((Fare) (obj)).getPerDistanceUnit() == null ? getPerDistanceUnit() != null : !((Fare) (obj)).getPerDistanceUnit().equals(getPerDistanceUnit()))
            {
                return false;
            }
            if (((Fare) (obj)).getPerMinute() == null ? getPerMinute() != null : !((Fare) (obj)).getPerMinute().equals(getPerMinute()))
            {
                return false;
            }
            if (((Fare) (obj)).getSafeRidesFee() == null ? getSafeRidesFee() != null : !((Fare) (obj)).getSafeRidesFee().equals(getSafeRidesFee()))
            {
                return false;
            }
            if (((Fare) (obj)).getSpeedThresholdMps() == null ? getSpeedThresholdMps() != null : !((Fare) (obj)).getSpeedThresholdMps().equals(getSpeedThresholdMps()))
            {
                return false;
            }
            if (((Fare) (obj)).getType() == null ? getType() != null : !((Fare) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getBase()
    {
        return base;
    }

    public final String getBaseValue()
    {
        return baseValue;
    }

    public final String getCancellation()
    {
        return cancellation;
    }

    public final String getDistanceUnit()
    {
        return distanceUnit;
    }

    public final int getId()
    {
        return id;
    }

    public final String getMinimum()
    {
        return minimum;
    }

    public final String getPerDistanceUnit()
    {
        return perDistanceUnit;
    }

    public final String getPerMinute()
    {
        return perMinute;
    }

    public final String getSafeRidesFee()
    {
        return safeRidesFee;
    }

    public final String getSpeedThresholdMps()
    {
        return speedThresholdMps;
    }

    public final String getType()
    {
        return type;
    }

    public final int hashCode()
    {
        int j2 = 0;
        int k2 = id;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (base == null)
        {
            i = 0;
        } else
        {
            i = base.hashCode();
        }
        if (baseValue == null)
        {
            j = 0;
        } else
        {
            j = baseValue.hashCode();
        }
        if (cancellation == null)
        {
            k = 0;
        } else
        {
            k = cancellation.hashCode();
        }
        if (distanceUnit == null)
        {
            l = 0;
        } else
        {
            l = distanceUnit.hashCode();
        }
        if (minimum == null)
        {
            i1 = 0;
        } else
        {
            i1 = minimum.hashCode();
        }
        if (perDistanceUnit == null)
        {
            j1 = 0;
        } else
        {
            j1 = perDistanceUnit.hashCode();
        }
        if (perMinute == null)
        {
            k1 = 0;
        } else
        {
            k1 = perMinute.hashCode();
        }
        if (safeRidesFee == null)
        {
            l1 = 0;
        } else
        {
            l1 = safeRidesFee.hashCode();
        }
        if (speedThresholdMps == null)
        {
            i2 = 0;
        } else
        {
            i2 = speedThresholdMps.hashCode();
        }
        if (type != null)
        {
            j2 = type.hashCode();
        }
        return (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ (k2 ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j2;
    }

    public final Fare setBase(String s)
    {
        base = s;
        return this;
    }

    final Fare setBaseValue(String s)
    {
        baseValue = s;
        return this;
    }

    final Fare setCancellation(String s)
    {
        cancellation = s;
        return this;
    }

    public final Fare setDistanceUnit(String s)
    {
        distanceUnit = s;
        return this;
    }

    public final Fare setId(int i)
    {
        id = i;
        return this;
    }

    public final Fare setMinimum(String s)
    {
        minimum = s;
        return this;
    }

    public final Fare setPerDistanceUnit(String s)
    {
        perDistanceUnit = s;
        return this;
    }

    public final Fare setPerMinute(String s)
    {
        perMinute = s;
        return this;
    }

    public final Fare setSafeRidesFee(String s)
    {
        safeRidesFee = s;
        return this;
    }

    final Fare setSpeedThresholdMps(String s)
    {
        speedThresholdMps = s;
        return this;
    }

    final Fare setType(String s)
    {
        type = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.Fare{id=")).append(id).append(", base=").append(base).append(", baseValue=").append(baseValue).append(", cancellation=").append(cancellation).append(", distanceUnit=").append(distanceUnit).append(", minimum=").append(minimum).append(", perDistanceUnit=").append(perDistanceUnit).append(", perMinute=").append(perMinute).append(", safeRidesFee=").append(safeRidesFee).append(", speedThresholdMps=").append(speedThresholdMps).append(", type=").append(type).append("}").toString();
    }
}
