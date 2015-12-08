// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;


// Referenced classes of package com.weather.commons.ups.facade:
//            Profile

public static class 
{

    private final String endpoint = null;
    private final Integer hour = null;
    private final String location = null;
    private final String status = null;
    private final String threshold = null;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (endpoint == null ? ((endpoint) (obj)).endpoint != null : !endpoint.equals(((endpoint) (obj)).endpoint))
            {
                return false;
            }
            if (hour == null ? ((hour) (obj)).hour != null : !hour.equals(((hour) (obj)).hour))
            {
                return false;
            }
            if (location == null ? ((location) (obj)).location != null : !location.equals(((location) (obj)).location))
            {
                return false;
            }
            if (status == null ? ((status) (obj)).status != null : !status.equals(((status) (obj)).status))
            {
                return false;
            }
            if (threshold == null ? ((threshold) (obj)).threshold != null : !threshold.equals(((threshold) (obj)).threshold))
            {
                return false;
            }
        }
        return true;
    }

    public String getEndpoint()
    {
        return endpoint;
    }

    public Integer getHour()
    {
        return hour;
    }

    public String getLocation()
    {
        return location;
    }

    public String getStatus()
    {
        return status;
    }

    public String getThreshold()
    {
        return threshold;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (location != null)
        {
            i = location.hashCode();
        } else
        {
            i = 0;
        }
        if (status != null)
        {
            j = status.hashCode();
        } else
        {
            j = 0;
        }
        if (endpoint != null)
        {
            k = endpoint.hashCode();
        } else
        {
            k = 0;
        }
        if (threshold != null)
        {
            l = threshold.hashCode();
        } else
        {
            l = 0;
        }
        if (hour != null)
        {
            i1 = hour.hashCode();
        }
        return (((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ServiceDoc{location='").append(location).append('\'').append(", status='").append(status).append('\'').append(", endpoint='").append(endpoint).append('\'').append(", threshold='").append(threshold).append('\'').append(", hour='").append(hour).append('\'').append('}').toString();
    }

    public ()
    {
    }
}
