// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmartlabs.ereceipt.service.EReceipt;

public class SaverReceipt extends EReceipt
{
    public static class Competitor
    {

        public String competitorName;
        public int competitorUnitPrice;

        public Competitor()
        {
        }
    }

    public static class Item extends com.walmartlabs.ereceipt.service.EReceipt.Item
    {

        public Competitor competitor;
        public Boolean credited;
        public Integer itemId;
        public String measurement;
        public Integer ourPriceCents;
        public Float remainingQty;
        public Float returnQty;
        public Integer unitPriceCents;
        public Float unitQty;

        public int getCompetitorPrice()
        {
            if (competitor != null)
            {
                if ("lb".equalsIgnoreCase(unitType) || quantity > 1.0F)
                {
                    return Math.round(quantity * (float)competitor.competitorUnitPrice);
                } else
                {
                    return competitor.competitorUnitPrice;
                }
            } else
            {
                return 0;
            }
        }

        public int getCompetitorPriceDiff()
        {
            if (competitor != null)
            {
                return getPrice() - getCompetitorPrice();
            } else
            {
                return 0;
            }
        }

        public int getPrice()
        {
            if ("lb".equalsIgnoreCase(unitType) || quantity > 1.0F)
            {
                return Math.round(quantity * (float)getUnitPrice());
            }
            if (unitPriceCents != null)
            {
                return unitPriceCents.intValue();
            } else
            {
                return super.getPrice();
            }
        }

        public int getUnitPrice()
        {
            if (unitPriceCents != null)
            {
                return unitPriceCents.intValue();
            } else
            {
                return super.getUnitPrice();
            }
        }

        public boolean hasCompetitorLowerPrice()
        {
            return competitor != null && unitPriceCents != null && competitor.competitorUnitPrice < unitPriceCents.intValue();
        }

        public Item()
        {
        }
    }


    public int getItBack;
    public boolean hasDetails;
    public boolean hasSummary;
    public boolean notificationShown;
    public SaverContract.SaverRejectedReasons reason;
    public boolean seen;
    public String serverState;
    public int state;
    public boolean submitConfirmed;
    public int totalBack;
    public int totalTaxBack;

    public SaverReceipt()
    {
    }

    public boolean needsConfirmation()
    {
        return !submitConfirmed && state == SaverContract.SaverState.Unknown.getState() && reason == SaverContract.SaverRejectedReasons.UNKNOWN;
    }
}
