// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.Locale;

// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class s
{

    public s address;
    public String name;
    public String number;
    public String phone;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (s)obj;
            if (address == null ? ((address) (obj)).address != null : !address.equals(((s.equals) (obj)).address))
            {
                return false;
            }
            if (name == null ? ((name) (obj)).name != null : !name.equals(((name) (obj)).name))
            {
                return false;
            }
            if (number == null ? ((number) (obj)).number != null : !number.equals(((number) (obj)).number))
            {
                return false;
            }
            if (phone == null ? ((phone) (obj)).phone != null : !phone.equals(((phone) (obj)).phone))
            {
                return false;
            }
        }
        return true;
    }

    public String[] getAddressLines()
    {
        return (new String[] {
            String.format(Locale.US, "%s #%s", new Object[] {
                name, number
            }), address.street, String.format(Locale.US, "%s, %s %s", new Object[] {
                address.city, address.state, address.zipcode
            })
        });
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (number != null)
        {
            j = number.hashCode();
        } else
        {
            j = 0;
        }
        if (address != null)
        {
            k = address.hashCode();
        } else
        {
            k = 0;
        }
        if (phone != null)
        {
            l = phone.hashCode();
        }
        return ((i * 31 + j) * 31 + k) * 31 + l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ name=").append(name).append(", number:").append(number).append(", address:").append(address).append("}").toString();
    }

    public s()
    {
    }
}
