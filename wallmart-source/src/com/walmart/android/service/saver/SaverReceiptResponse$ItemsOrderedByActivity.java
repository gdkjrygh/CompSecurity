// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverReceiptResponse

public static class competitorPricesOrdered
{

    public boolean associateDiscount;
    public ArrayList competitorPricesOrdered;
    public boolean credited;
    public String measurement;
    public Integer ourPriceCents;
    public Integer preAssociateDiscountRetailPriceCents;
    public Integer preAssociateDiscountUnitPriceCents;
    public Float remainingQty;
    public Float returnQty;
    public Integer unitPriceCents;
    public Float unitQty;
    public String upcNbr;

    public ()
    {
        competitorPricesOrdered = new ArrayList();
    }
}
