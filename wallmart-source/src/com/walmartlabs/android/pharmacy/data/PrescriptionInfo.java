// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.data;


public class PrescriptionInfo
{

    public int rxNumber;
    public int storeNumber;

    public PrescriptionInfo()
    {
    }

    public PrescriptionInfo(int i, int j)
    {
        rxNumber = i;
        storeNumber = j;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PrescriptionInfo)obj;
            if (rxNumber != ((PrescriptionInfo) (obj)).rxNumber)
            {
                return false;
            }
            if (storeNumber != ((PrescriptionInfo) (obj)).storeNumber)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (rxNumber + 31) * 31 + storeNumber;
    }
}
