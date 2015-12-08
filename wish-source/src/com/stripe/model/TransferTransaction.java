// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class TransferTransaction extends StripeObject
{

    Long amount;
    Long created;
    String description;
    Long fees;
    String id;
    Long net;
    String type;

    public TransferTransaction()
    {
    }

    public Long getAmount()
    {
        return amount;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getDescription()
    {
        return description;
    }

    public Long getFees()
    {
        return fees;
    }

    public String getId()
    {
        return id;
    }

    public Long getNet()
    {
        return net;
    }

    public String getType()
    {
        return type;
    }

    public void setAmount(Long long1)
    {
        amount = long1;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setFees(Long long1)
    {
        fees = long1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setNet(Long long1)
    {
        net = long1;
    }

    public void setType(String s)
    {
        type = s;
    }
}
