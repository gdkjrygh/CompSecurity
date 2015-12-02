// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public final class CreditBalance
    implements com.ubercab.rider.realtime.model.CreditBalance
{

    private String amountString;
    private String displayName;

    public CreditBalance()
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
            obj = (CreditBalance)obj;
            if (amountString == null ? ((CreditBalance) (obj)).amountString != null : !amountString.equals(((CreditBalance) (obj)).amountString))
            {
                return false;
            }
            if (displayName == null ? ((CreditBalance) (obj)).displayName != null : !displayName.equals(((CreditBalance) (obj)).displayName))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAmountString()
    {
        return amountString;
    }

    public final String getDisplayName()
    {
        return displayName;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (amountString != null)
        {
            i = amountString.hashCode();
        } else
        {
            i = 0;
        }
        if (displayName != null)
        {
            j = displayName.hashCode();
        }
        return i * 31 + j;
    }

    public final void setAmountString(String s)
    {
        amountString = s;
    }

    public final void setDisplayName(String s)
    {
        displayName = s;
    }
}
