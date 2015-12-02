// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public final class TripBalance
    implements com.ubercab.rider.realtime.model.TripBalance
{

    String amount;
    Integer count;
    String currency;
    String detail;
    String endsAt;
    String label;
    String startsAt;

    public TripBalance()
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
            obj = (TripBalance)obj;
            if (amount == null ? ((TripBalance) (obj)).amount != null : !amount.equals(((TripBalance) (obj)).amount))
            {
                return false;
            }
            if (count == null ? ((TripBalance) (obj)).count != null : !count.equals(((TripBalance) (obj)).count))
            {
                return false;
            }
            if (currency == null ? ((TripBalance) (obj)).currency != null : !currency.equals(((TripBalance) (obj)).currency))
            {
                return false;
            }
            if (detail == null ? ((TripBalance) (obj)).detail != null : !detail.equals(((TripBalance) (obj)).detail))
            {
                return false;
            }
            if (endsAt == null ? ((TripBalance) (obj)).endsAt != null : !endsAt.equals(((TripBalance) (obj)).endsAt))
            {
                return false;
            }
            if (label == null ? ((TripBalance) (obj)).label != null : !label.equals(((TripBalance) (obj)).label))
            {
                return false;
            }
            if (startsAt == null ? ((TripBalance) (obj)).startsAt != null : !startsAt.equals(((TripBalance) (obj)).startsAt))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAmount()
    {
        return amount;
    }

    public final int getCount()
    {
        if (count == null)
        {
            return 1;
        } else
        {
            return count.intValue();
        }
    }

    public final String getCurrency()
    {
        return currency;
    }

    public final String getDetail()
    {
        return detail;
    }

    public final String getEndsAt()
    {
        return endsAt;
    }

    public final String getLabel()
    {
        return label;
    }

    public final String getStartsAt()
    {
        return startsAt;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (label != null)
        {
            i = label.hashCode();
        } else
        {
            i = 0;
        }
        if (detail != null)
        {
            j = detail.hashCode();
        } else
        {
            j = 0;
        }
        if (startsAt != null)
        {
            k = startsAt.hashCode();
        } else
        {
            k = 0;
        }
        if (endsAt != null)
        {
            l = endsAt.hashCode();
        } else
        {
            l = 0;
        }
        if (amount != null)
        {
            i1 = amount.hashCode();
        } else
        {
            i1 = 0;
        }
        if (currency != null)
        {
            j1 = currency.hashCode();
        } else
        {
            j1 = 0;
        }
        if (count != null)
        {
            k1 = count.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public final void setAmount(String s)
    {
        amount = s;
    }

    public final void setCount(Integer integer)
    {
        count = integer;
    }

    public final void setCurrency(String s)
    {
        currency = s;
    }

    public final void setDetail(String s)
    {
        detail = s;
    }

    public final void setEndsAt(String s)
    {
        endsAt = s;
    }

    public final void setLabel(String s)
    {
        label = s;
    }

    public final void setStartsAt(String s)
    {
        startsAt = s;
    }
}
