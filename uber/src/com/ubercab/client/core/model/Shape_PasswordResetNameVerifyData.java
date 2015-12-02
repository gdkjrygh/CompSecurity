// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetNameVerifyData

public final class Shape_PasswordResetNameVerifyData extends PasswordResetNameVerifyData
{

    private String firstName;
    private String lastName;

    Shape_PasswordResetNameVerifyData()
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
            obj = (PasswordResetNameVerifyData)obj;
            if (((PasswordResetNameVerifyData) (obj)).getFirstName() == null ? getFirstName() != null : !((PasswordResetNameVerifyData) (obj)).getFirstName().equals(getFirstName()))
            {
                return false;
            }
            if (((PasswordResetNameVerifyData) (obj)).getLastName() == null ? getLastName() != null : !((PasswordResetNameVerifyData) (obj)).getLastName().equals(getLastName()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getFirstName()
    {
        return firstName;
    }

    public final String getLastName()
    {
        return lastName;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (firstName == null)
        {
            i = 0;
        } else
        {
            i = firstName.hashCode();
        }
        if (lastName != null)
        {
            j = lastName.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final PasswordResetNameVerifyData setFirstName(String s)
    {
        firstName = s;
        return this;
    }

    final PasswordResetNameVerifyData setLastName(String s)
    {
        lastName = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetNameVerifyData{firstName=")).append(firstName).append(", lastName=").append(lastName).append("}").toString();
    }
}
