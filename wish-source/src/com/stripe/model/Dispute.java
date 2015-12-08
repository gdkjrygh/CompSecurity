// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class Dispute extends StripeObject
{

    Integer amount;
    String charge;
    Long created;
    String currency;
    String evidence;
    Long evidenceDueBy;
    Boolean livemode;
    String reason;
    String status;

    public Dispute()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getCharge()
    {
        return charge;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getEvidence()
    {
        return evidence;
    }

    public Long getEvidenceDueBy()
    {
        return evidenceDueBy;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public String getReason()
    {
        return reason;
    }

    public String getStatus()
    {
        return status;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setCharge(String s)
    {
        charge = s;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setEvidence(String s)
    {
        evidence = s;
    }

    public void setEvidenceDueBy(Long long1)
    {
        evidenceDueBy = long1;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setReason(String s)
    {
        reason = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
