// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;


// Referenced classes of package com.walmartlabs.android.pharmacy.service:
//            RefillHistory

public static class 
{

    private static final String ACTIVE_STATUSES[] = {
        "ACKNOWLEDGED", "PROCESSING"
    };
    public static final String FILLSTATUS_ACKNOWLEDGED = "ACKNOWLEDGED";
    public static final String FILLSTATUS_CANCELLED = "CANCELLED";
    public static final String FILLSTATUS_PICKED_UP = "PICKED UP";
    public static final String FILLSTATUS_PROCESSING = "PROCESSING";
    public static final String FILLSTATUS_SHIPPED = "SHIPPED";
    public float customerPriceForRx;
    public String dawAbbr;
    public int daysSupplyInFill;
    public String dispensedDrugName;
    public String fillDate;
    public int fillId;
    public int fillQuantity;
    public String fillStatus;
    public String insCarrierAbbr;
    public int nabpNumber;
    public String ndcNumber;
    public String pickupDate;
    public String prescribedDrugName;
    public String prescriber;
    public int refillNumber;
    public String rxExpDate;
    public int rxNumber;
    public String rxWrittenDate;
    public int storeNumber;

    public boolean isActive()
    {
        return isFillStatusIn(ACTIVE_STATUSES);
    }

    public boolean isFillStatusEqualTo(String s)
    {
        return fillStatus.equalsIgnoreCase(s);
    }

    public transient boolean isFillStatusIn(String as[])
    {
        boolean flag1 = false;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!isFillStatusEqualTo(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public boolean isShip()
    {
        return isFillStatusEqualTo("SHIPPED");
    }


    public ()
    {
    }
}
