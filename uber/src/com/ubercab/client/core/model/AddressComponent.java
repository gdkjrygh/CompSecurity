// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

public class AddressComponent
    implements com.ubercab.rider.realtime.model.AddressComponent
{

    private String long_name;
    private String short_name;
    private List types;

    public AddressComponent()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AddressComponent)obj;
            if (long_name == null ? ((AddressComponent) (obj)).long_name != null : !long_name.equals(((AddressComponent) (obj)).long_name))
            {
                return false;
            }
            if (short_name == null ? ((AddressComponent) (obj)).short_name != null : !short_name.equals(((AddressComponent) (obj)).short_name))
            {
                return false;
            }
            if (types == null ? ((AddressComponent) (obj)).types != null : !types.equals(((AddressComponent) (obj)).types))
            {
                return false;
            }
        }
        return true;
    }

    public String getLongName()
    {
        return long_name;
    }

    public String getShortName()
    {
        return short_name;
    }

    public List getTypes()
    {
        return types;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (long_name != null)
        {
            i = long_name.hashCode();
        } else
        {
            i = 0;
        }
        if (short_name != null)
        {
            j = short_name.hashCode();
        } else
        {
            j = 0;
        }
        if (types != null)
        {
            k = types.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void setLongName(String s)
    {
        long_name = s;
    }

    public void setShortName(String s)
    {
        short_name = s;
    }

    public void setTypes(List list)
    {
        types = list;
    }
}
