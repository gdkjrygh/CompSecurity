// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.walmart.android.utils.UpcUtils;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptProviderImpl;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverProvider, SaverDBHelper

public class SaverProviderImpl extends EReceiptProviderImpl
    implements SaverProvider
{

    private static final String TAG = com/walmart/android/service/saver/SaverProviderImpl.getSimpleName();
    private final SaverDBHelper mDatabaseHelper;

    public SaverProviderImpl(Context context)
    {
        super(context);
        mDatabaseHelper = new SaverDBHelper(context);
    }

    private String createUnconfirmedSortColumn(String s, boolean flag)
    {
        if (flag)
        {
            return (new StringBuilder()).append("(submitConfirmed IS NULL OR submitConfirmed = 0) AND (state IS NULL OR state = ").append(SaverContract.SaverState.Unknown.getState()).append(") AND (").append("rejected_reason").append(" IS NULL OR ").append("rejected_reason").append(" = ").append(SaverContract.SaverRejectedReasons.UNKNOWN.getReason()).append(") AS ").append(s).toString();
        } else
        {
            return (new StringBuilder()).append("0 AS ").append(s).toString();
        }
    }

    private void decorateEReceiptInternal(SQLiteDatabase sqlitedatabase, ContentValues contentvalues, int i, String s, String s1, boolean flag, boolean flag1, 
            boolean flag2, SaverContract.SaverRejectedReasons saverrejectedreasons)
    {
        boolean flag3 = true;
        contentvalues.clear();
        contentvalues.put("visitDate", s1);
        contentvalues.put("tcNumber", s);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        contentvalues.put("seen", Integer.valueOf(j));
        contentvalues.put("eReceiptDeleted", Integer.valueOf(0));
        contentvalues.put("rejected_reason", Integer.valueOf(saverrejectedreasons.getReason()));
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        contentvalues.put("submitConfirmed", Integer.valueOf(j));
        if (flag2)
        {
            j = ((flag3) ? 1 : 0);
        } else
        {
            j = 0;
        }
        contentvalues.put("notificationShown", Integer.valueOf(j));
        sqlitedatabase.insertWithOnConflict("saver_receipt_decoration", null, contentvalues, i);
    }

    public void clearAll()
    {
        super.clearAll();
        resetSaverData();
        try
        {
            getDatabase().delete("saver_receipt_decoration", null, null);
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
        }
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        super.close();
        mDatabaseHelper.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void decorateEReceipt(String s, String s1, boolean flag, boolean flag1, boolean flag2, SaverContract.SaverRejectedReasons saverrejectedreasons)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        decorateEReceiptInternal(sqlitedatabase, new ContentValues(), 5, s, s1, flag, flag1, flag2, saverrejectedreasons);
        sqlitedatabase.setTransactionSuccessful();
        try
        {
            sqlitedatabase.endTransaction();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_63;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public transient void delete(EReceipt aereceipt[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        int j;
        contentvalues = new ContentValues();
        j = aereceipt.length;
_L2:
        EReceipt ereceipt;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ereceipt = aereceipt[i];
        contentvalues.clear();
        contentvalues.put("eReceiptDeleted", Integer.valueOf(1));
        sqlitedatabase.update("saver_receipt_decoration", contentvalues, (new StringBuilder()).append("tcNumber = ?").append(" AND visitDate = ?").toString(), new String[] {
            ereceipt.tcNumber, ereceipt.localDate
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.setTransactionSuccessful();
        Exception exception;
        try
        {
            sqlitedatabase.endTransaction();
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
        }
        super.delete(aereceipt);
        return;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public void deleteAll(String s)
    {
        super.deleteAll(s);
        clearAll();
    }

    public Cursor findMissingEReceipts()
    {
        Object obj;
        try
        {
            obj = getDatabase();
            String s = (new StringBuilder()).append("uuid IS NULL").append(" AND rejected_reason = ").append(SaverContract.SaverRejectedReasons.NONE.getReason()).toString();
            s = (new StringBuilder()).append(s).append(" AND eReceiptDeleted = 0").toString();
            obj = ((SQLiteDatabase) (obj)).query("view_ereceipts_decorated", null, (new StringBuilder()).append(s).append(" AND eReceiptMissing = 0").toString(), null, null, null, null);
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return ((Cursor) (obj));
    }

    public Cursor findMissingSaverReceipts(String s)
    {
        SQLiteDatabase sqlitedatabase = getDatabase();
        String s1 = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s2 = "customerId IS NULL";
        s = s1;
        s1 = s2;
_L3:
        String as[];
        try
        {
            s1 = (new StringBuilder()).append(s1).append(" AND deleted=0").toString();
            return sqlitedatabase.query("view_ereceipts_with_saver", null, (new StringBuilder()).append(s1).append(" AND (rejected_reason IS NULL OR rejected_reason = ").append(SaverContract.SaverRejectedReasons.UNKNOWN.getReason()).append(" OR ").append("rejected_reason").append(" = ").append(SaverContract.SaverRejectedReasons.LIMIT_REACHED.getReason()).append(")").toString(), s, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_139;
_L2:
        s1 = "customerId = ?";
        as = new String[1];
        as[0] = s;
        s = as;
          goto _L3
        return null;
    }

    public Cursor getAllReceipts(String s)
    {
        return getAllReceipts(s, false);
    }

    public Cursor getAllReceipts(String s, boolean flag)
    {
        SQLiteDatabase sqlitedatabase = getDatabase();
        String as[] = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String s1 = "customerId IS NULL";
_L4:
        String s2;
        s1 = (new StringBuilder()).append(s1).append(" AND deleted=0").toString();
        s2 = (new StringBuilder()).append("SELECT * FROM (SELECT *, ").append(createUnconfirmedSortColumn("unconfirmedSort", flag)).append(",").append("localDateTime").append(" AS ").append("sort").append(" FROM ").append("view_ereceipts_with_saver").append(" WHERE ").append(s1).toString();
        s1 = s2;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                s1 = (new StringBuilder()).append(s2).append(" UNION ALL SELECT *, ").append(createUnconfirmedSortColumn("unconfirmedSort", false)).append(", ").append("visitDate").append(" AS ").append("sort").append(" FROM ").append("view_saver_without_ereceipt").toString();
            }
            return sqlitedatabase.rawQuery((new StringBuilder()).append(s1).append(") ORDER BY ").append("unconfirmedSort").append(" DESC, ").append("sort").append(" DESC;").toString(), as);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break; /* Loop/switch isn't completed */
_L2:
        s1 = "customerId = ?";
        as = new String[1];
        as[0] = s;
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public Cursor getCompetitors(Integer integer)
    {
        try
        {
            integer = getDatabase().query("saver_competitors", null, "itemId = ? ", new String[] {
                String.valueOf(integer)
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            WLog.e(TAG, "Database operation failed", integer);
            return null;
        }
        return integer;
    }

    protected SQLiteDatabase getDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        super.getDatabase();
        sqlitedatabase = mDatabaseHelper.getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public String getOldestSaverReceipt()
    {
        Cursor cursor = getDatabase().query("saver_receipt", new String[] {
            "visitDate"
        }, null, null, null, null, "visitDate ASC", "1");
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Object obj;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = cursor.getString(0);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        cursor.close();
        return ((String) (obj));
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            catch (SQLiteException sqliteexception)
            {
                WLog.e(TAG, "Database operation failed", sqliteexception);
            }
        }
        break MISSING_BLOCK_LABEL_104;
        obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        cursor.close();
        throw obj;
        return ((String) (obj));
        return null;
    }

    public Cursor getReceipt(String s)
    {
        try
        {
            s = getDatabase().query("view_ereceipts_with_saver", null, "uuid=?", new String[] {
                s
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return null;
        }
        return s;
    }

    public Cursor getReceipt(String s, String s1)
    {
        try
        {
            s = getDatabase().query("view_ereceipts_with_saver", null, "tcNumber = ? AND date(localDateTime) = ?", new String[] {
                s, s1
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return null;
        }
        return s;
    }

    public Cursor getReceiptItems(long l)
    {
        Cursor cursor;
        try
        {
            cursor = getDatabase().query("item", null, "ereceiptId=?", new String[] {
                String.valueOf(l)
            }, null, null, "normalizedUpc ASC, price ASC");
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return cursor;
    }

    public Cursor getSaverReceipt(String s, String s1)
    {
        try
        {
            s = getDatabase().query("view_saver_without_ereceipt", null, "tcNumber = ? AND visitDate= ?", new String[] {
                s, s1
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return null;
        }
        return s;
    }

    public Cursor getSaverReceiptItems(String s, String s1)
    {
        try
        {
            s = getDatabase().query("view_saver_receipt_items", null, "tcNumber = ? AND visitDate = ? ", new String[] {
                s, s1
            }, null, null, "normalizedUpc ASC, retailPrice ASC");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return null;
        }
        return s;
    }

    public Cursor getUnseenReceipts(String s)
    {
        String s1;
        String s2;
        String as[];
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = getDatabase();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return null;
        }
        s1 = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s2 = (new StringBuilder()).append("").append("customerId IS NULL").toString();
        s = s1;
        s1 = s2;
_L4:
        s1 = (new StringBuilder()).append(s1).append(" AND deleted=0").toString();
        s1 = (new StringBuilder()).append(s1).append(" AND seen=0").toString();
        return sqlitedatabase.query("view_ereceipts_with_saver", null, (new StringBuilder()).append(s1).append(" AND state IN ('").append(SaverContract.SaverState.CreditFound.getState()).append("', '").append(SaverContract.SaverState.NoCreditFound.getState()).append("')").toString(), s, null, null, null);
_L2:
        s1 = (new StringBuilder()).append("").append("customerId = ?").toString();
        as = new String[1];
        as[0] = s;
        s = as;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void insertDetails(String s, String s1, SaverReceiptResponse.ProcessedDetails processeddetails)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.clear();
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        contentvalues.put("visitDate", s1);
        contentvalues.put("tcNumber", s);
        contentvalues.put("totalBackCents", processeddetails.totalGetItBackCents);
        contentvalues.put("backTaxCents", processeddetails.getItBackTaxComponentCents);
        Cursor cursor = null;
        Cursor cursor1 = sqlitedatabase.query("saver_receipt", new String[] {
            "_id"
        }, "tcNumber=? AND visitDate=?", new String[] {
            s, s1
        }, null, null, null);
        if (cursor1 == null) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L4; else goto _L5
_L5:
        cursor = cursor1;
        long l = cursor1.getLong(0);
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        cursor1.close();
        sqlitedatabase.update("saver_receipt", contentvalues, "_id=?", new String[] {
            String.valueOf(l)
        });
        if (processeddetails.itemsOrderedByActivity == null) goto _L2; else goto _L6
_L6:
        int i = 0;
_L16:
        if (i >= processeddetails.itemsOrderedByActivity.size()) goto _L2; else goto _L7
_L7:
        s = (SaverReceiptResponse.ItemsOrderedByActivity)processeddetails.itemsOrderedByActivity.get(i);
        contentvalues.clear();
        if (TextUtils.isEmpty(((SaverReceiptResponse.ItemsOrderedByActivity) (s)).upcNbr) || ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).unitPriceCents == null) goto _L9; else goto _L8
_L8:
        contentvalues.put("receiptId", Long.valueOf(l));
        contentvalues.put("upc", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).upcNbr);
        if (!UpcUtils.isValid(((SaverReceiptResponse.ItemsOrderedByActivity) (s)).upcNbr)) goto _L11; else goto _L10
_L10:
        contentvalues.put("normalizedUpc", UpcUtils.getLookupUpc((new StringBuilder()).append(((SaverReceiptResponse.ItemsOrderedByActivity) (s)).upcNbr).append("0").toString()));
_L14:
        contentvalues.put("retailPrice", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).ourPriceCents);
        contentvalues.put("unitPrice", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).unitPriceCents);
        contentvalues.put("unitQuantity", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).unitQty);
        contentvalues.put("returnQty", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).returnQty);
        contentvalues.put("remainingQty", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).remainingQty);
        int j;
        long l1;
        if (((SaverReceiptResponse.ItemsOrderedByActivity) (s)).credited)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        contentvalues.put("credited", Integer.valueOf(j));
        contentvalues.put("measurement", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).measurement);
        contentvalues.put("item_order", Integer.valueOf(i));
        l1 = sqlitedatabase.insert("saver_items", null, contentvalues);
        if (((SaverReceiptResponse.ItemsOrderedByActivity) (s)).competitorPricesOrdered == null) goto _L9; else goto _L12
_L12:
        j = 0;
_L13:
        if (j >= ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).competitorPricesOrdered.size())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (SaverReceiptResponse.CompetitorPricesOrdered)((SaverReceiptResponse.ItemsOrderedByActivity) (s)).competitorPricesOrdered.get(j);
        contentvalues.clear();
        if (!TextUtils.isEmpty(((SaverReceiptResponse.CompetitorPricesOrdered) (s1)).competitorName) && ((SaverReceiptResponse.CompetitorPricesOrdered) (s1)).competitorPriceInCents != null)
        {
            contentvalues.put("itemId", Long.valueOf(l1));
            contentvalues.put("competitorName", ((SaverReceiptResponse.CompetitorPricesOrdered) (s1)).competitorName);
            contentvalues.put("competitorUnitPrice", ((SaverReceiptResponse.CompetitorPricesOrdered) (s1)).competitorPriceInCents);
            contentvalues.put("item_order", Integer.valueOf(j));
            sqlitedatabase.insert("saver_competitors", null, contentvalues);
        }
        j++;
        if (true) goto _L13; else goto _L9
_L4:
        cursor = cursor1;
        WLog.e(TAG, (new StringBuilder()).append("Database operation failed: No saver receipt ").append(s).append(" ").append(s1).append(" found to insert details").toString());
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_624;
        }
        cursor1.close();
        try
        {
            sqlitedatabase.endTransaction();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_663;
        s;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_643;
        }
        cursor.close();
        throw s;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        return;
_L11:
        contentvalues.put("normalizedUpc", ((SaverReceiptResponse.ItemsOrderedByActivity) (s)).upcNbr);
          goto _L14
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
_L9:
        i++;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void insertSummaries(List list)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        list = list.iterator();
_L1:
        ReceiptsSummaryResponse.ProcessedReceipts processedreceipts;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        processedreceipts = (ReceiptsSummaryResponse.ProcessedReceipts)list.next();
        contentvalues.clear();
        if (!TextUtils.isEmpty(processedreceipts.localDate) && !TextUtils.isEmpty(processedreceipts.tcNbr))
        {
            contentvalues.put("visitDate", processedreceipts.localDate);
            contentvalues.put("tcNumber", processedreceipts.tcNbr);
            contentvalues.put("state", Integer.valueOf(SaverContract.SaverState.find(processedreceipts.stateLabel).getState()));
            contentvalues.put("serverState", processedreceipts.cacheId);
            contentvalues.put("getItBackCents", Integer.valueOf(processedreceipts.getItBackCents));
            sqlitedatabase.insert("saver_receipt", null, contentvalues);
            decorateEReceiptInternal(sqlitedatabase, contentvalues, 4, processedreceipts.tcNbr, processedreceipts.localDate, false, false, false, SaverContract.SaverRejectedReasons.NONE);
        }
          goto _L1
        SQLiteException sqliteexception;
        sqliteexception;
        WLog.e(TAG, "Database operation failed", sqliteexception);
          goto _L1
        list;
        sqlitedatabase.endTransaction();
        throw list;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    public void resetSaverData()
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("saver_receipt", null, null);
        sqlitedatabase.setTransactionSuccessful();
        Exception exception;
        try
        {
            sqlitedatabase.endTransaction();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
        }
        break MISSING_BLOCK_LABEL_45;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public void updateMissingReceipt(String s, String s1, boolean flag)
    {
        int i = 1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        if (!flag)
        {
            i = 0;
        }
        contentvalues.put("eReceiptMissing", Integer.valueOf(i));
        sqlitedatabase.update("saver_receipt_decoration", contentvalues, (new StringBuilder()).append("tcNumber = ?").append(" AND visitDate = ?").toString(), new String[] {
            s, s1
        });
        sqlitedatabase.setTransactionSuccessful();
        try
        {
            sqlitedatabase.endTransaction();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_111;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public transient void updateSeenReceipt(boolean flag, Pair apair[])
    {
        int i = 1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        String s;
        Pair pair;
        int j;
        if (!flag)
        {
            i = 0;
        }
        contentvalues.put("seen", Integer.valueOf(i));
        s = (new StringBuilder()).append("tcNumber = ?").append(" AND visitDate = ?").toString();
        j = apair.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        pair = apair[i];
        sqlitedatabase.update("saver_receipt_decoration", contentvalues, s, new String[] {
            (String)pair.first, (String)pair.second
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.setTransactionSuccessful();
        try
        {
            sqlitedatabase.endTransaction();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Pair apair[])
        {
            WLog.e(TAG, "Database operation failed", apair);
        }
        break MISSING_BLOCK_LABEL_151;
        apair;
        sqlitedatabase.endTransaction();
        throw apair;
    }

}
