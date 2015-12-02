// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public final class TripExpenseInfo
    implements com.ubercab.rider.realtime.model.TripExpenseInfo
{

    private String code;
    private boolean expenseTrip;
    private String memo;

    public TripExpenseInfo()
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
            obj = (TripExpenseInfo)obj;
            if (expenseTrip != ((TripExpenseInfo) (obj)).expenseTrip)
            {
                return false;
            }
            if (code == null ? ((TripExpenseInfo) (obj)).code != null : !code.equals(((TripExpenseInfo) (obj)).code))
            {
                return false;
            }
            if (memo == null ? ((TripExpenseInfo) (obj)).memo != null : !memo.equals(((TripExpenseInfo) (obj)).memo))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCode()
    {
        return code;
    }

    public final String getMemo()
    {
        return memo;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (memo != null)
        {
            i = memo.hashCode();
        } else
        {
            i = 0;
        }
        if (code != null)
        {
            j = code.hashCode();
        } else
        {
            j = 0;
        }
        if (expenseTrip)
        {
            k = 1;
        }
        return (j + i * 31) * 31 + k;
    }

    public final boolean isExpenseTrip()
    {
        return expenseTrip;
    }

    public final void setCode(String s)
    {
        code = s;
    }

    public final void setExpenseTrip(boolean flag)
    {
        expenseTrip = flag;
    }

    public final void setMemo(String s)
    {
        memo = s;
    }
}
