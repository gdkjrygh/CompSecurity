// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class 
{

    public String city;
    public String state;
    public String street;
    public String zipcode;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (city == null ? ((city) (obj)).city != null : !city.equals(((city) (obj)).city))
            {
                return false;
            }
            if (state == null ? ((state) (obj)).state != null : !state.equals(((state) (obj)).state))
            {
                return false;
            }
            if (street == null ? ((street) (obj)).street != null : !street.equals(((street) (obj)).street))
            {
                return false;
            }
            if (zipcode == null ? ((zipcode) (obj)).zipcode != null : !zipcode.equals(((zipcode) (obj)).zipcode))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (street != null)
        {
            i = street.hashCode();
        } else
        {
            i = 0;
        }
        if (city != null)
        {
            j = city.hashCode();
        } else
        {
            j = 0;
        }
        if (state != null)
        {
            k = state.hashCode();
        } else
        {
            k = 0;
        }
        if (zipcode != null)
        {
            l = zipcode.hashCode();
        }
        return ((i * 31 + j) * 31 + k) * 31 + l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ street:").append(street).append(", ").append(city).append(", ").append(state).append(", ").append(zipcode).append("}").toString();
    }

    public ()
    {
    }
}
