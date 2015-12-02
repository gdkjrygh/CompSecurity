// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hnj;
import java.util.Locale;

abstract class ObjectTripVehicle
    implements hnj
{

    ObjectTripVehicle()
    {
    }

    public String getLicensePlateFormatted()
    {
        if (getLicensePlate() == null)
        {
            return "";
        } else
        {
            return getLicensePlate().toUpperCase(Locale.getDefault());
        }
    }
}
