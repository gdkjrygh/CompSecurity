// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class AddFundsDefaultValues
{

    Integer denomination1;
    Integer denomination2;
    Integer denomination3;

    public AddFundsDefaultValues()
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
            obj = (AddFundsDefaultValues)obj;
            if (denomination1 == null ? ((AddFundsDefaultValues) (obj)).denomination1 != null : !denomination1.equals(((AddFundsDefaultValues) (obj)).denomination1))
            {
                return false;
            }
            if (denomination2 == null ? ((AddFundsDefaultValues) (obj)).denomination2 != null : !denomination2.equals(((AddFundsDefaultValues) (obj)).denomination2))
            {
                return false;
            }
            if (denomination3 == null ? ((AddFundsDefaultValues) (obj)).denomination3 != null : !denomination3.equals(((AddFundsDefaultValues) (obj)).denomination3))
            {
                return false;
            }
        }
        return true;
    }

    public int getDenomination1()
    {
        if (denomination1 != null)
        {
            return denomination1.intValue();
        } else
        {
            return 0;
        }
    }

    public int getDenomination2()
    {
        if (denomination2 != null)
        {
            return denomination2.intValue();
        } else
        {
            return 0;
        }
    }

    public int getDenomination3()
    {
        if (denomination3 != null)
        {
            return denomination3.intValue();
        } else
        {
            return 0;
        }
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (denomination1 != null)
        {
            i = denomination1.hashCode();
        } else
        {
            i = 0;
        }
        if (denomination2 != null)
        {
            j = denomination2.hashCode();
        } else
        {
            j = 0;
        }
        if (denomination3 != null)
        {
            k = denomination3.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
