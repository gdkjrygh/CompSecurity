// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.weather.util.geometry.LatLng;

public class StormPosition
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status CURRENT;
        public static final Status FUTURE;
        public static final Status PAST;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/weather/commons/tropical/StormPosition$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            CURRENT = new Status("CURRENT", 0);
            PAST = new Status("PAST", 1);
            FUTURE = new Status("FUTURE", 2);
            $VALUES = (new Status[] {
                CURRENT, PAST, FUTURE
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private final LatLng latLng;
    private final Status status;
    private final StormData.StormType stormType;

    public StormPosition(LatLng latlng, StormData.StormType stormtype, Status status1)
    {
        latLng = (LatLng)Preconditions.checkNotNull(latlng);
        stormType = (StormData.StormType)Preconditions.checkNotNull(stormtype);
        status = (Status)Preconditions.checkNotNull(status1);
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag3;
            if (obj != null)
            {
                flag = flag3;
                if (getClass() == obj.getClass())
                {
                    obj = (StormPosition)obj;
                    flag = flag3;
                    if (latLng.equals(((StormPosition) (obj)).latLng))
                    {
                        flag = flag3;
                        if (stormType == ((StormPosition) (obj)).stormType)
                        {
                            boolean flag1;
                            if (status == ((StormPosition) (obj)).status)
                            {
                                flag1 = flag2;
                            } else
                            {
                                flag1 = false;
                            }
                            return flag1;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public LatLng getLatLng()
    {
        return latLng;
    }

    public Status getStatus()
    {
        return status;
    }

    public StormData.StormType getStormType()
    {
        return stormType;
    }

    public int hashCode()
    {
        return (latLng.hashCode() * 31 + stormType.hashCode()) * 31 + status.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("StormPosition{latLng=").append(latLng).append(", stormType=").append(stormType).append(", status=").append(status).append('}').toString();
    }
}
