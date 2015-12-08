// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverReceipt

public class SaverContractUtil
{

    public SaverContractUtil()
    {
    }

    public static SaverReceipt populateSaverReceipt(Cursor cursor, SaverReceipt saverreceipt)
    {
        boolean flag1 = true;
        int i = cursor.getColumnIndex("tcNumber");
        if (saverreceipt.tcNumber == null && i >= 0 && !cursor.isNull(i))
        {
            saverreceipt.tcNumber = cursor.getString(i);
        }
        i = cursor.getColumnIndex("visitDate");
        if (i >= 0 && !cursor.isNull(i))
        {
            saverreceipt.localDate = cursor.getString(i);
            if (saverreceipt.datetimePrinted == null)
            {
                saverreceipt.datetimePrinted = saverreceipt.localDate;
            }
        }
        i = cursor.getColumnIndex("state");
        int j = cursor.getColumnIndex("getItBackCents");
        boolean flag;
        if (i >= 0 && j >= 0 && !cursor.isNull(i) && !cursor.isNull(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        saverreceipt.hasSummary = flag;
        if (saverreceipt.hasSummary)
        {
            saverreceipt.state = cursor.getInt(i);
            saverreceipt.getItBack = cursor.getInt(j);
            saverreceipt.serverState = cursor.getString(cursor.getColumnIndex("serverState"));
        }
        i = cursor.getColumnIndex("totalBackCents");
        j = cursor.getColumnIndex("backTaxCents");
        if (i >= 0 && j >= 0 && !cursor.isNull(i) && !cursor.isNull(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        saverreceipt.hasDetails = flag;
        if (saverreceipt.hasDetails)
        {
            saverreceipt.totalBack = cursor.getInt(i);
            saverreceipt.totalTaxBack = cursor.getInt(j);
        }
        i = cursor.getColumnIndex("seen");
        if (i >= 0)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            saverreceipt.seen = flag;
        }
        i = cursor.getColumnIndex("submitConfirmed");
        if (i >= 0)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            saverreceipt.submitConfirmed = flag;
        }
        i = cursor.getColumnIndex("notificationShown");
        if (i >= 0)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            saverreceipt.notificationShown = flag;
        }
        i = cursor.getColumnIndex("rejected_reason");
        if (i >= 0)
        {
            saverreceipt.reason = SaverContract.SaverRejectedReasons.find(cursor.getInt(i));
        }
        return saverreceipt;
    }

    public static SaverReceipt.Item populateSaverReceiptItem(Cursor cursor, SaverReceipt.Item item)
    {
        boolean flag = true;
        int i = cursor.getColumnIndex("_id");
        if (i >= 0)
        {
            item.itemId = Integer.valueOf(cursor.getInt(i));
        }
        i = cursor.getColumnIndex("retailPrice");
        int j = cursor.getColumnIndex("unitPrice");
        int l = cursor.getColumnIndex("unitQuantity");
        int i1 = cursor.getColumnIndex("returnQty");
        int j1 = cursor.getColumnIndex("remainingQty");
        int k1 = cursor.getColumnIndex("measurement");
        if (i >= 0 && j >= 0 && l >= 0 && i1 >= 0 && j1 >= 0 && k1 >= 0)
        {
            item.ourPriceCents = Integer.valueOf(cursor.getInt(i));
            item.unitPriceCents = Integer.valueOf(cursor.getInt(j));
            item.unitQty = Float.valueOf(cursor.getFloat(l));
            item.returnQty = Float.valueOf(cursor.getFloat(i1));
            item.remainingQty = Float.valueOf(cursor.getFloat(j1));
            item.measurement = cursor.getString(k1);
        }
        i = cursor.getColumnIndex("credited");
        if (i >= 0)
        {
            int k;
            if (cursor.getInt(i) != 1)
            {
                flag = false;
            }
            item.credited = Boolean.valueOf(flag);
        }
        i = cursor.getColumnIndex("competitorName");
        k = cursor.getColumnIndex("competitorUnitPrice");
        if (i >= 0 && k >= 0 && !cursor.isNull(i) && !cursor.isNull(k))
        {
            item.competitor = new SaverReceipt.Competitor();
            item.competitor.competitorName = cursor.getString(i);
            item.competitor.competitorUnitPrice = cursor.getInt(k);
        }
        return item;
    }
}
