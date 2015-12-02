// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            RtUnpaidBillsResponse

public final class Shape_RtUnpaidBillsResponse extends RtUnpaidBillsResponse
{

    private List unpaidBills;

    Shape_RtUnpaidBillsResponse()
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
            obj = (RtUnpaidBillsResponse)obj;
            if (((RtUnpaidBillsResponse) (obj)).getUnpaidBills() == null ? getUnpaidBills() != null : !((RtUnpaidBillsResponse) (obj)).getUnpaidBills().equals(getUnpaidBills()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getUnpaidBills()
    {
        return unpaidBills;
    }

    public final int hashCode()
    {
        int i;
        if (unpaidBills == null)
        {
            i = 0;
        } else
        {
            i = unpaidBills.hashCode();
        }
        return i ^ 0xf4243;
    }

    final RtUnpaidBillsResponse setUnpaidBills(List list)
    {
        unpaidBills = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RtUnpaidBillsResponse{unpaidBills=")).append(unpaidBills).append("}").toString();
    }
}
