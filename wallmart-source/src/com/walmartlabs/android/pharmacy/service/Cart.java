// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;


public class Cart
{
    public static class Customer
    {

        public String deliveryMethod;
        public Refill refills[];
        public ShipAddress shipAddress;
        public String shipOption;

        public Customer()
        {
        }
    }

    public static class FillStatus
    {

        public String message;
        public String status;

        public FillStatus()
        {
        }
    }

    public static class Guest
    {

        public boolean accountIsLinked;
        public String deliveryMethod;
        public Refill refills[];
        public ShipAddress shipAddress;
        public String shipOption;

        public Guest()
        {
        }
    }

    public static class Pending
    {

        public Refill refills[];

        public Pending()
        {
        }
    }

    public static class Refill
    {

        public String dispensedDrugName;
        public FillStatus fillErrors[];
        public FillStatus fillStatus[];
        public String lastRefillDate;
        public boolean notTransferable;
        public int numOfRemainingReFills;
        public String prescribedDrugName;
        public String rxExpDate;
        public boolean rxIsShip;
        public int rxNumber;
        public boolean rxOnlineRefillable;
        public String rxStatus;
        public int storeNumber;
        public boolean submitted;
        public String validityStatus;

        public boolean canBeRefilled()
        {
            while (wasLastRefilledByHomeDelivery() && (numOfRemainingReFills == 0 || notTransferable) || !rxOnlineRefillable) 
            {
                return false;
            }
            return true;
        }

        public int getFirstFillStatus()
        {
            if (!hasFillStatus())
            {
                throw new IllegalStateException("Refill does not have fillStatus");
            }
            int i;
            try
            {
                i = Integer.parseInt(fillStatus[0].status);
            }
            catch (NumberFormatException numberformatexception)
            {
                return 0;
            }
            return i;
        }

        public boolean hasFillErrors()
        {
            return fillErrors != null && fillErrors.length > 0;
        }

        public boolean hasFillStatus()
        {
            return fillStatus != null && fillStatus.length > 0;
        }

        public boolean wasLastRefilledByHomeDelivery()
        {
            return rxIsShip;
        }

        public Refill()
        {
        }
    }

    public static class ShipAddress
    {

        public String city;
        public String state;
        public String street1;
        public String zip;

        public ShipAddress()
        {
        }
    }


    public static final int STATUS_AUTHENTICATED = 0;
    public static final int STATUS_GUEST = 1;
    public static final int STATUS_NOT_IN_CART = -1;
    public static final int STATUS_PENDING = 2;
    private static final String TAG = com/walmartlabs/android/pharmacy/service/Cart.getSimpleName();
    public Customer customer;
    public PickupTime.Day day[];
    public Guest guests[];
    public Pending pending[];
    public String pickupDate;
    public int pickupStore;
    public String pickupTime;

    public Cart()
    {
    }

    public boolean canBeRefilled(int i, int j)
    {
        boolean flag1 = false;
        if (customer == null || customer.refills == null) goto _L2; else goto _L1
_L1:
        Object aobj[];
        int k;
        int l;
        aobj = customer.refills;
        l = aobj.length;
        k = 0;
_L6:
        if (k >= l) goto _L2; else goto _L3
_L3:
        Refill refill = aobj[k];
        if (refill.rxNumber != i || refill.storeNumber != j) goto _L5; else goto _L4
_L4:
        boolean flag = refill.canBeRefilled();
_L8:
        return flag;
_L5:
        k++;
          goto _L6
_L2:
        flag = flag1;
        if (guests == null) goto _L8; else goto _L7
_L7:
        int j1;
        aobj = guests;
        j1 = aobj.length;
        k = 0;
_L10:
        flag = flag1;
        if (k >= j1) goto _L8; else goto _L9
_L9:
        Guest guest = aobj[k];
        if (guest.refills != null)
        {
            Refill arefill[] = guest.refills;
            int k1 = arefill.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                Refill refill1 = arefill[i1];
                if (refill1.rxNumber == i && refill1.storeNumber == j)
                {
                    return refill1.canBeRefilled();
                }
            }

        }
        k++;
          goto _L10
    }

    public Refill getRefill()
    {
        if (customer != null)
        {
            Refill arefill[] = customer.refills;
            if (arefill.length < 0)
            {
                return arefill[0];
            }
        }
        if (guests != null)
        {
            Guest aguest[] = guests;
            int j = aguest.length;
            for (int i = 0; i < j; i++)
            {
                Refill arefill1[] = aguest[i].refills;
                if (arefill1.length < 0)
                {
                    return arefill1[0];
                }
            }

        }
        return null;
    }

    public int getStatus(int i, int j)
    {
        int l = -1;
        byte byte0 = l;
        if (customer != null)
        {
            Refill arefill[] = customer.refills;
            int l1 = arefill.length;
            int i1 = 0;
            do
            {
                byte0 = l;
                if (i1 >= l1)
                {
                    break;
                }
                Refill refill = arefill[i1];
                byte0 = l;
                if (refill.rxNumber == i)
                {
                    byte0 = l;
                    if (refill.storeNumber == j)
                    {
                        byte0 = 0;
                    }
                }
                i1++;
                l = byte0;
            } while (true);
        }
        l = byte0;
        if (byte0 == -1)
        {
            l = byte0;
            if (guests != null)
            {
                Guest aguest[] = guests;
                int j2 = aguest.length;
                int j1 = 0;
                do
                {
                    l = byte0;
                    if (j1 >= j2)
                    {
                        break;
                    }
                    Refill arefill1[] = aguest[j1].refills;
                    int l2 = arefill1.length;
                    for (l = 0; l < l2;)
                    {
                        Refill refill1 = arefill1[l];
                        byte byte1 = byte0;
                        if (refill1.rxNumber == i)
                        {
                            byte1 = byte0;
                            if (refill1.storeNumber == j)
                            {
                                byte1 = 1;
                            }
                        }
                        l++;
                        byte0 = byte1;
                    }

                    j1++;
                } while (true);
            }
        }
        int k1 = l;
        if (l == -1)
        {
            k1 = l;
            if (pending != null)
            {
                Pending apending[] = pending;
                int k2 = apending.length;
                int k = 0;
                do
                {
                    k1 = l;
                    if (k >= k2)
                    {
                        break;
                    }
                    Refill arefill2[] = apending[k].refills;
                    int i3 = arefill2.length;
                    for (k1 = 0; k1 < i3;)
                    {
                        Refill refill2 = arefill2[k1];
                        int i2 = l;
                        if (refill2.rxNumber == i)
                        {
                            i2 = l;
                            if (refill2.storeNumber == j)
                            {
                                i2 = 2;
                            }
                        }
                        k1++;
                        l = i2;
                    }

                    k++;
                } while (true);
            }
        }
        return k1;
    }

    public int getStoreNumber()
    {
        boolean flag = false;
        if (customer == null) goto _L2; else goto _L1
_L1:
        Object aobj[];
        int i;
        int j;
        aobj = customer.refills;
        j = aobj.length;
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L3
_L3:
        Refill refill = aobj[i];
        if (refill.storeNumber == 0) goto _L5; else goto _L4
_L4:
        j = refill.storeNumber;
_L8:
        return j;
_L5:
        i++;
          goto _L6
_L2:
        j = ((flag) ? 1 : 0);
        if (guests == null) goto _L8; else goto _L7
_L7:
        int l;
        aobj = guests;
        l = aobj.length;
        i = 0;
_L10:
        j = ((flag) ? 1 : 0);
        if (i >= l) goto _L8; else goto _L9
_L9:
        Refill arefill[] = aobj[i].refills;
        int i1 = arefill.length;
        for (int k = 0; k < i1; k++)
        {
            Refill refill1 = arefill[k];
            if (refill1.storeNumber != 0)
            {
                return refill1.storeNumber;
            }
        }

        i++;
          goto _L10
    }

}
