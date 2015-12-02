// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.client.core.realtime.model.ParcelableUnpaidBill;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UnpaidBill, ClientTransaction

public abstract class UnpaidBill
    implements ParcelableUnpaidBill
{

    public UnpaidBill()
    {
    }

    public static UnpaidBill create(String s, ClientTransaction clienttransaction)
    {
        return (new Shape_UnpaidBill()).setUuid(s).setClientTransaction(clienttransaction);
    }

    public String getAmount()
    {
        Object obj = getClientTransaction();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ClientTransaction) (obj)).getAmount();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return ((String) (obj1));
    }

    public String getAmountString()
    {
        Object obj = getClientTransaction();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ClientTransaction) (obj)).getAmountString();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return ((String) (obj1));
    }

    abstract ClientTransaction getClientTransaction();

    public String getCreatedAt()
    {
        return "";
    }

    public abstract String getUuid();

    abstract UnpaidBill setClientTransaction(ClientTransaction clienttransaction);

    abstract UnpaidBill setUuid(String s);
}
