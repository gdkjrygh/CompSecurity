// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import com.walmartlabs.utils.WLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceipt

public class EReceiptsContractUtil
{

    private static final Pattern BY_WEIGHT_RAW_TEXT_PATTERN = Pattern.compile("(?is).*@\\s+\\d+\\s+lb.*");
    public static final SimpleDateFormat LOCAL_DATE_FORMAT;
    public static final SimpleDateFormat RECEIPT_PRINT_FORMAT;
    public static final SimpleDateFormat RECEIPT_SIMPLE_PRINT_FORMAT;
    public static final SimpleDateFormat SQLITE_FORMAT;
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptsContractUtil.getSimpleName();

    public EReceiptsContractUtil()
    {
    }

    public static EReceipt populateEReceipt(Cursor cursor, EReceipt ereceipt)
    {
        boolean flag3 = true;
        boolean flag2 = true;
        ereceipt.rowId = cursor.getLong(cursor.getColumnIndex("_id"));
        ereceipt.tcNumber = cursor.getString(cursor.getColumnIndex("tcNumber"));
        ereceipt.uuid = cursor.getString(cursor.getColumnIndex("uuid"));
        ereceipt.timestamp = cursor.getLong(cursor.getColumnIndex("timestamp"));
        String s1 = cursor.getString(cursor.getColumnIndex("localDateTime"));
        String s = s1;
        int i;
        boolean flag;
        if (s1 != null)
        {
            try
            {
                s = LOCAL_DATE_FORMAT.format(SQLITE_FORMAT.parse(s1));
            }
            catch (ParseException parseexception)
            {
                WLog.e(TAG, (new StringBuilder()).append("Could not parse local date ").append(s1).toString(), parseexception);
                parseexception = s1;
            }
        }
        ereceipt.localDate = s;
        ereceipt.changeDue = cursor.getInt(cursor.getColumnIndex("changeDue"));
        ereceipt.customerId = cursor.getString(cursor.getColumnIndex("customerId"));
        ereceipt.customerReceiptId = cursor.getInt(cursor.getColumnIndex("customerReceiptId"));
        if (cursor.getInt(cursor.getColumnIndex("deleted")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ereceipt.deleted = flag;
        ereceipt.discountGiven = cursor.getInt(cursor.getColumnIndex("discountGiven"));
        i = cursor.getColumnIndex("hasImage");
        if (i >= 0)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            ereceipt.hasImage = flag;
        } else
        {
            ereceipt.image = cursor.getString(cursor.getColumnIndex("image"));
            boolean flag1;
            if (ereceipt.image != null)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            ereceipt.hasImage = flag1;
        }
        ereceipt.itemsSold = cursor.getInt(cursor.getColumnIndex("itemsSold"));
        ereceipt.subtotal = cursor.getInt(cursor.getColumnIndex("subtotal"));
        ereceipt.total = cursor.getInt(cursor.getColumnIndex("total"));
        ereceipt.waitingOnMoreInfo = cursor.getString(cursor.getColumnIndex("waitingOnMoreInfo"));
        ereceipt.uuid = cursor.getString(cursor.getColumnIndex("uuid"));
        ereceipt.store = new EReceipt.Store();
        ereceipt.store.address = cursor.getString(cursor.getColumnIndex("address"));
        ereceipt.store.addressLine1 = cursor.getString(cursor.getColumnIndex("addressLine1"));
        ereceipt.store.addressLine2 = cursor.getString(cursor.getColumnIndex("addressLine2"));
        ereceipt.store.city = cursor.getString(cursor.getColumnIndex("city"));
        ereceipt.store.id = cursor.getString(cursor.getColumnIndex("storeId"));
        ereceipt.store.phone = cursor.getString(cursor.getColumnIndex("phone"));
        return ereceipt;
    }

    public static EReceipt.Item populateEReceiptItem(Cursor cursor, EReceipt.Item item)
    {
        boolean flag1 = true;
        item.upc = cursor.getString(cursor.getColumnIndex("upc"));
        item.productId = cursor.getString(cursor.getColumnIndex("productId"));
        item.name = cursor.getString(cursor.getColumnIndex("name"));
        item.rawText = cursor.getString(cursor.getColumnIndex("rawText"));
        item.nameOnReceipt = cursor.getString(cursor.getColumnIndex("nameOnReceipt"));
        item.price = cursor.getInt(cursor.getColumnIndex("price"));
        item.quantity = cursor.getFloat(cursor.getColumnIndex("quantity"));
        item.unitQuantity = cursor.getInt(cursor.getColumnIndex("unitQuantity"));
        item.unitType = cursor.getString(cursor.getColumnIndex("unitType"));
        item.unitPrice = cursor.getInt(cursor.getColumnIndex("unitPrice"));
        item.lineNumber = cursor.getString(cursor.getColumnIndex("lineNumber"));
        item.verticalPixel = cursor.getString(cursor.getColumnIndex("verticalPixel"));
        item.originalOrder = cursor.getInt(cursor.getColumnIndex("originalOrder"));
        item.productImageUrl = cursor.getString(cursor.getColumnIndex("productImageUrl"));
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("coupon")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        item.coupon = flag;
        if (cursor.getInt(cursor.getColumnIndex("storeItemLookup")) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        item.storeItemLookup = flag;
        item.normalizedUpc = cursor.getString(cursor.getColumnIndex("normalizedUpc"));
        if (item.unitType == null && item.rawText != null && BY_WEIGHT_RAW_TEXT_PATTERN.matcher(item.rawText).matches())
        {
            item.unitType = "lb";
        }
        return item;
    }

    public static EReceipt.Tax populateEReceiptTax(Cursor cursor, EReceipt.Tax tax)
    {
        tax.amount = cursor.getInt(cursor.getColumnIndex("amount"));
        tax.level = cursor.getString(cursor.getColumnIndex("level"));
        tax.rateStr = cursor.getString(cursor.getColumnIndex("rateStr"));
        return tax;
    }

    public static EReceipt.Tender populateEReceiptTender(Cursor cursor, EReceipt.Tender tender)
    {
        tender.amount = cursor.getInt(cursor.getColumnIndex("amount"));
        tender.name = cursor.getString(cursor.getColumnIndex("name"));
        return tender;
    }

    static 
    {
        SQLITE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        LOCAL_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        RECEIPT_PRINT_FORMAT = new SimpleDateFormat("MM/dd/yy HH:mm:ss", Locale.US);
        RECEIPT_SIMPLE_PRINT_FORMAT = new SimpleDateFormat("MM/dd/yy", Locale.US);
    }
}
