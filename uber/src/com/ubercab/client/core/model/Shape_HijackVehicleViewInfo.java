// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareInfo;

// Referenced classes of package com.ubercab.client.core.model:
//            HijackVehicleViewInfo

public final class Shape_HijackVehicleViewInfo extends HijackVehicleViewInfo
{

    private String errorMessage;
    private FareInfo fareInfo;
    private String hijackVehicleSavingTagline;
    private String vehicleSavingTagline;

    Shape_HijackVehicleViewInfo()
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
            obj = (HijackVehicleViewInfo)obj;
            if (((HijackVehicleViewInfo) (obj)).getErrorMessage() == null ? getErrorMessage() != null : !((HijackVehicleViewInfo) (obj)).getErrorMessage().equals(getErrorMessage()))
            {
                return false;
            }
            if (((HijackVehicleViewInfo) (obj)).getHijackVehicleSavingTagline() == null ? getHijackVehicleSavingTagline() != null : !((HijackVehicleViewInfo) (obj)).getHijackVehicleSavingTagline().equals(getHijackVehicleSavingTagline()))
            {
                return false;
            }
            if (((HijackVehicleViewInfo) (obj)).getVehicleSavingTagline() == null ? getVehicleSavingTagline() != null : !((HijackVehicleViewInfo) (obj)).getVehicleSavingTagline().equals(getVehicleSavingTagline()))
            {
                return false;
            }
            if (((HijackVehicleViewInfo) (obj)).getFareInfo() == null ? getFareInfo() != null : !((HijackVehicleViewInfo) (obj)).getFareInfo().equals(getFareInfo()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getErrorMessage()
    {
        return errorMessage;
    }

    public final FareInfo getFareInfo()
    {
        return fareInfo;
    }

    public final String getHijackVehicleSavingTagline()
    {
        return hijackVehicleSavingTagline;
    }

    public final String getVehicleSavingTagline()
    {
        return vehicleSavingTagline;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (errorMessage == null)
        {
            i = 0;
        } else
        {
            i = errorMessage.hashCode();
        }
        if (hijackVehicleSavingTagline == null)
        {
            j = 0;
        } else
        {
            j = hijackVehicleSavingTagline.hashCode();
        }
        if (vehicleSavingTagline == null)
        {
            k = 0;
        } else
        {
            k = vehicleSavingTagline.hashCode();
        }
        if (fareInfo != null)
        {
            l = fareInfo.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final HijackVehicleViewInfo setErrorMessage(String s)
    {
        errorMessage = s;
        return this;
    }

    public final HijackVehicleViewInfo setFareInfo(FareInfo fareinfo)
    {
        fareInfo = fareinfo;
        return this;
    }

    public final HijackVehicleViewInfo setHijackVehicleSavingTagline(String s)
    {
        hijackVehicleSavingTagline = s;
        return this;
    }

    public final HijackVehicleViewInfo setVehicleSavingTagline(String s)
    {
        vehicleSavingTagline = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("HijackVehicleViewInfo{errorMessage=")).append(errorMessage).append(", hijackVehicleSavingTagline=").append(hijackVehicleSavingTagline).append(", vehicleSavingTagline=").append(vehicleSavingTagline).append(", fareInfo=").append(fareInfo).append("}").toString();
    }
}
