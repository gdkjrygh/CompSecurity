// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.Iterator;
import java.util.List;

public abstract class LocationDescription
{

    public static final String ADDRESS_COMPONENT_DRIVER_MSG = "driver_msg";
    public static final String ADDRESS_COMPONENT_RIDER_MSG = "rider_msg";
    public static final String ADDRESS_COMPONENT_SUBTITLE = "subtitle";
    public static final String ADDRESS_COMPONENT_TITLE = "title";

    public LocationDescription()
    {
    }

    public String getAddressComponent(String s)
    {
label0:
        {
            Object obj = getAddressComponents();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            AddressComponent addresscomponent;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                addresscomponent = (AddressComponent)((Iterator) (obj)).next();
            } while (!addresscomponent.getTypes().contains(s));
            return addresscomponent.getShortName();
        }
        return null;
    }

    public abstract List getAddressComponents();

    public abstract double getLatitude();

    public abstract String getLongAddress();

    public abstract double getLongitude();

    public abstract String getShortAddress();

    abstract LocationDescription setAddressComponents(List list);

    abstract LocationDescription setLatitude(double d);

    abstract LocationDescription setLongAddress(String s);

    abstract LocationDescription setLongitude(double d);

    abstract LocationDescription setShortAddress(String s);

    private class AddressComponent
    {

        public abstract String getLongName();

        public abstract String getShortName();

        public abstract List getTypes();

        abstract AddressComponent setLongName(String s);

        abstract AddressComponent setShortName(String s);

        abstract AddressComponent setTypes(List list);

        public AddressComponent()
        {
        }
    }

}
