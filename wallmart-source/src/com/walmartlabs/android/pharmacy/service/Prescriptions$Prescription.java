// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;


// Referenced classes of package com.walmartlabs.android.pharmacy.service:
//            Prescriptions

public static class I
{

    public boolean compoundRx;
    public String dispensedDrugName;
    public boolean expired;
    public String fillStatus;
    public String lastRefillDate;
    public int numOfRemainingReFills;
    public String prescribedDrugName;
    public String prescriber;
    public boolean rxAutoRefillOn;
    public boolean rxAutoRefillable;
    public String rxExpDate;
    public boolean rxIsShip;
    public int rxNumber;
    public boolean rxOnlineRefillable;
    public int storeNumber;
    public int storePatientId;

    public boolean canBeRefilled()
    {
        while (wasLastRefilledByHomeDelivery() && numOfRemainingReFills == 0 || !rxOnlineRefillable) 
        {
            return false;
        }
        return true;
    }

    public boolean hasPlacedOrders()
    {
        return "PROCESSING".equalsIgnoreCase(fillStatus);
    }

    public boolean wasLastRefilledByHomeDelivery()
    {
        return rxIsShip;
    }

    public I()
    {
    }
}
