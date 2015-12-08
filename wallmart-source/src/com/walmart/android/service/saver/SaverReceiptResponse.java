// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            StatusResponse

public class SaverReceiptResponse extends StatusResponse
{
    public static class CompetitorPricesOrdered
    {

        public String competitorName;
        public Integer competitorPriceInCents;

        public CompetitorPricesOrdered()
        {
        }
    }

    public static class ItemsOrderedByActivity
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

        public ItemsOrderedByActivity()
        {
            competitorPricesOrdered = new ArrayList();
        }
    }

    public static class Payload
    {

        public String localDate;
        public ProcessedDetails processedDetails;
        public String tcNbr;

        public Payload()
        {
        }
    }

    public static class ProcessedDetails
    {

        public Integer getItBackTaxComponentCents;
        public ArrayList itemsOrderedByActivity;
        public Integer totalGetItBackCents;

        public ProcessedDetails()
        {
            itemsOrderedByActivity = new ArrayList();
        }
    }


    public Payload payload;

    public SaverReceiptResponse()
    {
    }
}
