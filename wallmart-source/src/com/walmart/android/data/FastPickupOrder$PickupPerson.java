// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class 
{

    public String firstName;
    public String lastName;
    public String phone;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (firstName == null ? ((firstName) (obj)).firstName != null : !firstName.equals(((firstName) (obj)).firstName))
            {
                return false;
            }
            if (lastName == null ? ((lastName) (obj)).lastName != null : !lastName.equals(((lastName) (obj)).lastName))
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

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (firstName != null)
        {
            i = firstName.hashCode();
        } else
        {
            i = 0;
        }
        if (lastName != null)
        {
            j = lastName.hashCode();
        } else
        {
            j = 0;
        }
        if (phone != null)
        {
            k = phone.hashCode();
        }
        return (i * 31 + j) * 31 + k;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{firstName: ").append(firstName).append(", lastName: ").append(lastName).append(", phone: ").append(phone).append("}").toString();
    }

    public ()
    {
    }
}
