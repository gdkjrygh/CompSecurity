// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class Summary extends StripeObject
{

    Integer adjustmentCount;
    Integer adjustmentGross;
    Integer chargeCount;
    Integer chargeFees;
    Integer chargeGross;
    Integer net;
    Integer refundCount;
    Integer refundFees;
    Integer refundGross;
    Integer validationCount;
    Integer validationFees;

    public Summary()
    {
    }

    public Integer getAdjustmentCount()
    {
        return adjustmentCount;
    }

    public Integer getAdjustmentGross()
    {
        return adjustmentGross;
    }

    public Integer getChargeCount()
    {
        return chargeCount;
    }

    public Integer getChargeFees()
    {
        return chargeFees;
    }

    public Integer getChargeGross()
    {
        return chargeGross;
    }

    public Integer getNet()
    {
        return net;
    }

    public Integer getRefundCount()
    {
        return refundCount;
    }

    public Integer getRefundFees()
    {
        return refundFees;
    }

    public Integer getRefundGross()
    {
        return refundGross;
    }

    public Integer getValidationCount()
    {
        return validationCount;
    }

    public Integer getValidationFees()
    {
        return validationFees;
    }

    public void set(Integer integer)
    {
        net = integer;
    }

    public void setAdjustmentCount(Integer integer)
    {
        adjustmentCount = integer;
    }

    public void setAdjustmentGross(Integer integer)
    {
        adjustmentGross = integer;
    }

    public void setChargeCount(Integer integer)
    {
        chargeCount = integer;
    }

    public void setChargeFees(Integer integer)
    {
        chargeFees = integer;
    }

    public void setChargeGross(Integer integer)
    {
        chargeGross = integer;
    }

    public void setRefundCount(Integer integer)
    {
        refundCount = integer;
    }

    public void setRefundFees(Integer integer)
    {
        refundFees = integer;
    }

    public void setRefundGross(Integer integer)
    {
        refundGross = integer;
    }

    public void setValidationCount(Integer integer)
    {
        validationCount = integer;
    }

    public void setValidationFees(Integer integer)
    {
        validationFees = integer;
    }
}
