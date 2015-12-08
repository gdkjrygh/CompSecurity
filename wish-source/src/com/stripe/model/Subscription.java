// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;

// Referenced classes of package com.stripe.model:
//            Plan

public class Subscription extends APIResource
{

    Boolean cancelAtPeriodEnd;
    Long canceledAt;
    Long currentPeriodEnd;
    Long currentPeriodStart;
    String customer;
    Long endedAt;
    Plan plan;
    Integer quantity;
    Long start;
    String status;
    Long trialEnd;
    Long trialStart;

    public Subscription()
    {
    }

    public Boolean getCancelAtPeriodEnd()
    {
        return cancelAtPeriodEnd;
    }

    public Long getCanceledAt()
    {
        return canceledAt;
    }

    public Long getCurrentPeriodEnd()
    {
        return currentPeriodEnd;
    }

    public Long getCurrentPeriodStart()
    {
        return currentPeriodStart;
    }

    public String getCustomer()
    {
        return customer;
    }

    public Long getEndedAt()
    {
        return endedAt;
    }

    public Plan getPlan()
    {
        return plan;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public Long getStart()
    {
        return start;
    }

    public String getStatus()
    {
        return status;
    }

    public Long getTrialEnd()
    {
        return trialEnd;
    }

    public Long getTrialStart()
    {
        return trialStart;
    }

    public void setCancelAtPeriodEnd(Boolean boolean1)
    {
        cancelAtPeriodEnd = boolean1;
    }

    public void setCanceledAt(Long long1)
    {
        canceledAt = long1;
    }

    public void setCurrentPeriodEnd(Long long1)
    {
        currentPeriodEnd = long1;
    }

    public void setCurrentPeriodStart(Long long1)
    {
        currentPeriodStart = long1;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setEndedAt(Long long1)
    {
        endedAt = long1;
    }

    public void setPlan(Plan plan1)
    {
        plan = plan1;
    }

    public void setQuantity(Integer integer)
    {
        quantity = integer;
    }

    public void setStart(Long long1)
    {
        start = long1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setTrialEnd(Long long1)
    {
        trialEnd = long1;
    }

    public void setTrialStart(Long long1)
    {
        trialStart = long1;
    }
}
