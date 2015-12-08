// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.walmart.android.utils.UpcUtils;
import com.walmartlabs.utils.WLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptProvider, EReceiptDBHelper, EReceipt, EReceiptsContractUtil

public class EReceiptProviderImpl
    implements EReceiptProvider
{

    private static final Pattern DECIMAL_PATTERN = Pattern.compile("\\d{1,7}\\.\\d{0,2}");
    private static final Pattern DIGIT_PATTERN = Pattern.compile("\\d+");
    private static final Pattern DOLLAR_PATTERN = Pattern.compile("\\$\\d{1,7}\\.?\\d{0,2}");
    private static final int MAX_PARAMS = 990;
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptProviderImpl.getSimpleName();
    private final EReceiptDBHelper mDatabaseHelper;

    public EReceiptProviderImpl(Context context)
    {
        mDatabaseHelper = new EReceiptDBHelper(context);
    }

    private void fillEReceiptValues(String s, EReceipt ereceipt, ContentValues contentvalues)
    {
        if (ereceipt.store != null)
        {
            contentvalues.put("storeId", ereceipt.store.id);
            contentvalues.put("address", ereceipt.store.address);
            contentvalues.put("addressLine1", ereceipt.store.addressLine1);
            contentvalues.put("addressLine2", ereceipt.store.addressLine2);
            contentvalues.put("city", ereceipt.store.city);
            contentvalues.put("phone", ereceipt.store.phone);
        }
        contentvalues.put("uuid", ereceipt.uuid);
        contentvalues.put("changeDue", Integer.valueOf(ereceipt.changeDue));
        contentvalues.put("customerReceiptId", Integer.valueOf(ereceipt.customerReceiptId));
        contentvalues.put("discountGiven", Integer.valueOf(ereceipt.discountGiven));
        contentvalues.put("image", ereceipt.image);
        contentvalues.put("itemsSold", Integer.valueOf(ereceipt.itemsSold));
        contentvalues.put("subtotal", Integer.valueOf(ereceipt.subtotal));
        contentvalues.put("tcNumber", ereceipt.tcNumber);
        contentvalues.put("timestamp", Long.valueOf(ereceipt.timestamp));
        String s1;
        try
        {
            s1 = EReceiptsContractUtil.SQLITE_FORMAT.format(EReceiptsContractUtil.RECEIPT_PRINT_FORMAT.parse(ereceipt.datetimePrinted));
        }
        catch (Exception exception)
        {
            WLog.e(TAG, (new StringBuilder()).append("Failed to parse eReceipt printed date, using timestamp instead. ").append(exception.getMessage()).toString());
            exception = EReceiptsContractUtil.SQLITE_FORMAT.format(new Date(ereceipt.getTimeInMs()));
        }
        contentvalues.put("localDateTime", s1);
        contentvalues.put("total", Integer.valueOf(ereceipt.total));
        contentvalues.put("waitingOnMoreInfo", ereceipt.waitingOnMoreInfo);
        contentvalues.put("customerId", s);
    }

    private void fillItemValues(EReceipt.Item item, ContentValues contentvalues)
    {
        int i;
        if (item.coupon)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("coupon", Integer.valueOf(i));
        if (item.lineNumber != null)
        {
            contentvalues.put("lineNumber", Integer.valueOf(Integer.parseInt(item.lineNumber)));
        }
        contentvalues.put("name", item.name);
        contentvalues.put("nameOnReceipt", item.nameOnReceipt);
        contentvalues.put("originalOrder", Integer.valueOf(item.originalOrder));
        contentvalues.put("price", Integer.valueOf(item.price));
        contentvalues.put("productId", item.productId);
        contentvalues.put("productImageUrl", item.productImageUrl);
        contentvalues.put("quantity", Float.valueOf(item.quantity));
        contentvalues.put("rawText", item.rawText);
        contentvalues.put("unitPrice", Integer.valueOf(item.unitPrice));
        contentvalues.put("unitQuantity", Integer.valueOf(item.unitQuantity));
        contentvalues.put("unitType", item.unitType);
        contentvalues.put("upc", item.upc);
        if (item.upc != null)
        {
            if (item.normalizedUpc == null)
            {
                item.normalizedUpc = UpcUtils.getLookupUpc((new StringBuilder()).append(item.upc).append("0").toString());
            }
            contentvalues.put("normalizedUpc", item.normalizedUpc);
        }
        contentvalues.put("verticalPixel", item.verticalPixel);
        if (item.name != null && !item.name.equals(item.nameOnReceipt) && item.hasProductId() && item.hasProductImageUrl())
        {
            item.storeItemLookup = true;
            contentvalues.put("storeItemLookup", Integer.valueOf(1));
            return;
        } else
        {
            item.storeItemLookup = false;
            contentvalues.put("storeItemLookup", Integer.valueOf(0));
            return;
        }
    }

    public transient void associate(String s, String as[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        int j;
        contentvalues = new ContentValues();
        j = as.length;
_L2:
        String s1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[i];
        contentvalues.clear();
        contentvalues.put("customerId", s);
        sqlitedatabase.update("ereceipts", contentvalues, "uuid=?", new String[] {
            s1
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
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_109;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public void clearAll()
    {
        try
        {
            getDatabase().delete("ereceipts", null, null);
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
        mDatabaseHelper.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public transient void delete(int ai[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        int j = ai.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.delete("ereceipts", "customerReceiptId=?", new String[] {
            String.valueOf(ai[i])
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
        catch (int ai[])
        {
            WLog.e(TAG, "Database operation failed", ai);
        }
        break MISSING_BLOCK_LABEL_79;
        ai;
        sqlitedatabase.endTransaction();
        throw ai;
    }

    public transient void delete(EReceipt aereceipt[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        int j = aereceipt.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.delete("ereceipts", "deleted=1 AND uuid=?", new String[] {
            aereceipt[i].uuid
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
        catch (EReceipt aereceipt[])
        {
            WLog.e(TAG, "Database operation failed", aereceipt);
        }
        break MISSING_BLOCK_LABEL_79;
        aereceipt;
        sqlitedatabase.endTransaction();
        throw aereceipt;
    }

    public void deleteAll(String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("ereceipts", "customerId=?", new String[] {
            s
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
        break MISSING_BLOCK_LABEL_55;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public Cursor getAllReceipts(String s)
    {
        SQLiteDatabase sqlitedatabase = getDatabase();
        String as[] = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = "customerId IS NULL";
_L3:
        String s1;
        try
        {
            return sqlitedatabase.query("ereceipts", null, (new StringBuilder()).append(s).append(" AND deleted=0").toString(), as, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
        }
        break MISSING_BLOCK_LABEL_82;
_L2:
        s1 = "customerId = ?";
        as = new String[1];
        as[0] = s;
        s = s1;
          goto _L3
        return null;
    }

    protected SQLiteDatabase getDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = mDatabaseHelper.getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public transient Cursor getFilteredReceipts(String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i2;
        sqlitedatabase = getDatabase();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        i2 = as.length;
        int i1 = 0;
_L18:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = as[i1];
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_918;
        }
        if ("".equals(s2) || "$".equals(s2))
        {
            break MISSING_BLOCK_LABEL_918;
        }
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        String s1 = "customerId IS NULL";
_L13:
        s1 = (new StringBuilder()).append(s1).append(" AND deleted=0 AND ").toString();
        if (!DIGIT_PATTERN.matcher(s2).matches() && !DOLLAR_PATTERN.matcher(s2).matches() && !DECIMAL_PATTERN.matcher(s2).matches()) goto _L6; else goto _L5
_L5:
        String as1[] = s2.replace("$", "").split("\\.");
        int i;
        int j;
        int k;
        boolean flag1;
        boolean flag2;
        j = 0;
        k = 0;
        flag1 = false;
        flag2 = false;
        i = k;
        int j1 = Integer.valueOf(as1[0]).intValue() * 100;
        i = k;
        j = j1;
        int k1 = (Integer.valueOf(as1[0]).intValue() + 1) * 100;
        int l;
        boolean flag;
        int l1;
        flag = flag1;
        k = k1;
        l = j1;
        l1 = ((flag2) ? 1 : 0);
        i = k1;
        j = j1;
        if (as1.length != 2) goto _L8; else goto _L7
_L7:
        i = k1;
        j = j1;
        if (as1[1].length() != 2) goto _L10; else goto _L9
_L9:
        i = k1;
        j = j1;
        k = Integer.valueOf(as1[1]).intValue();
        l1 = j1 + k;
        flag = true;
        l = j1;
        k = k1;
_L8:
        if (!DIGIT_PATTERN.matcher(s2).matches()) goto _L12; else goto _L11
_L11:
        s1 = (new StringBuilder()).append(s1).append("(upc LIKE ? OR (price < ? AND price >= ? ) OR (unitPrice < ? AND unitPrice >= ? ))").toString();
        arraylist.add((new StringBuilder()).append("%").append(s2).append("%").toString());
        arraylist.add(String.valueOf(k));
        arraylist.add(String.valueOf(l));
        arraylist.add(String.valueOf(k));
        arraylist.add(String.valueOf(l));
_L14:
        arraylist1.add((new StringBuilder()).append("SELECT * FROM view_ereceipt_item WHERE ").append(s1).append(" GROUP BY ").append("upc").append(",").append("price").toString());
        break MISSING_BLOCK_LABEL_918;
        s;
        WLog.e(TAG, "Database operation failed", s);
_L16:
        return null;
_L4:
        s1 = "customerId = ?";
        arraylist.add(s);
          goto _L13
_L10:
        i = k1;
        j = j1;
        k = j1 + (Integer.valueOf(as1[1]).intValue() + 1) * 10;
        i = k;
        j = j1;
        l = Integer.valueOf(as1[1]).intValue();
        l = j1 + l * 10;
        flag = flag1;
        l1 = ((flag2) ? 1 : 0);
          goto _L8
_L12:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        s1 = (new StringBuilder()).append(s1).append("(price = ? OR unitPrice = ?)").toString();
        arraylist.add(String.valueOf(l1));
        arraylist.add(String.valueOf(l1));
          goto _L14
        s1 = (new StringBuilder()).append(s1).append("((price < ? AND price >= ? ) OR (unitPrice < ? AND unitPrice >= ? ))").toString();
        arraylist.add(String.valueOf(k));
        arraylist.add(String.valueOf(l));
        arraylist.add(String.valueOf(k));
        arraylist.add(String.valueOf(l));
          goto _L14
_L6:
        s1 = (new StringBuilder()).append(s1).append("(name LIKE ? OR nameOnReceipt LIKE ?)").toString();
        arraylist.add((new StringBuilder()).append("%").append(s2).append("%").toString());
        arraylist.add((new StringBuilder()).append("%").append(s2).append("%").toString());
          goto _L14
_L2:
        if (arraylist1.isEmpty()) goto _L16; else goto _L15
_L15:
        s = sqlitedatabase.rawQuery((new StringBuilder()).append(StringUtils.join(arraylist1, " INTERSECT ")).append(" ORDER BY ").append("localDateTime").append(" DESC, ").append("lineNumber").append(" ASC").toString(), (String[])arraylist.toArray(new String[arraylist.size()]));
        return s;
        NumberFormatException numberformatexception;
        numberformatexception;
        flag = flag1;
        k = i;
        l = j;
        l1 = ((flag2) ? 1 : 0);
          goto _L8
        i1++;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public int getNrbOfReceipts(String s)
    {
        String as[];
        String s1;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = getDatabase();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Database operation failed", s);
            return 0;
        }
        as = null;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder()).append("SELECT count(*) FROM ereceipts WHERE ").append("customerId IS NULL").toString();
_L3:
        return (int)DatabaseUtils.longForQuery(sqlitedatabase, (new StringBuilder()).append(s).append(" AND deleted=0").toString(), as);
_L2:
        s1 = (new StringBuilder()).append("SELECT count(*) FROM ereceipts WHERE ").append("customerId = ?").toString();
        as = new String[1];
        as[0] = s;
        s = s1;
          goto _L3
    }

    public Cursor getReceipt(String s)
    {
        try
        {
            s = getDatabase().query("ereceipts", null, "uuid=?", new String[] {
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

    public Cursor getReceiptImage(String s)
    {
        try
        {
            s = getDatabase().query("ereceipts", new String[] {
                "image"
            }, "uuid=?", new String[] {
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

    public Cursor getReceiptItems(long l)
    {
        Cursor cursor;
        try
        {
            cursor = getDatabase().query("item", null, "ereceiptId=?", new String[] {
                String.valueOf(l)
            }, null, null, "lineNumber ASC");
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return cursor;
    }

    public Cursor getReceiptTax(long l)
    {
        Cursor cursor;
        try
        {
            cursor = getDatabase().query("tax", null, "ereceiptId=?", new String[] {
                String.valueOf(l)
            }, null, null, "item_order ASC");
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return cursor;
    }

    public Cursor getReceiptTender(long l)
    {
        Cursor cursor;
        try
        {
            cursor = getDatabase().query("tender", null, "ereceiptId=?", new String[] {
                String.valueOf(l)
            }, null, null, "item_order ASC");
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return cursor;
    }

    public Cursor getReceiptsMarkedForDeletion()
    {
        Cursor cursor;
        try
        {
            cursor = getDatabase().query("ereceipts", null, "deleted=1", null, null, null, "customerId");
        }
        catch (SQLiteException sqliteexception)
        {
            WLog.e(TAG, "Database operation failed", sqliteexception);
            return null;
        }
        return cursor;
    }

    public transient Cursor getStoreLookup(int i, String as[])
    {
        String as1[];
        String s;
        String s1;
        Object obj;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = getDatabase();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            WLog.e(TAG, "Database operation failed", as);
            return null;
        }
        s1 = "storeItemLookup=0";
        obj = null;
        s = s1;
        as1 = obj;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = s1;
        as1 = obj;
        if (as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = s1;
        as1 = obj;
        if (as.length >= 990)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = (new StringBuilder()).append("storeItemLookup=0").append(" AND ereceiptId IN (SELECT _id FROM ereceipts WHERE uuid IN (").append(StringUtils.repeat("?", ",", as.length)).append("))").toString();
        as1 = as;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        as = String.valueOf(i);
_L1:
        as = sqlitedatabase.query(true, "item", new String[] {
            "normalizedUpc"
        }, s, as1, null, null, null, as);
        return as;
        as = null;
          goto _L1
    }

    public transient void insertReceipts(String s, EReceiptsResponse.Receipt areceipt[])
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        int k;
        contentvalues = new ContentValues();
        k = areceipt.length;
        int i = 0;
_L12:
        if (i >= k) goto _L2; else goto _L1
_L1:
        EReceiptsResponse.Receipt receipt = areceipt[i];
        contentvalues.clear();
        fillEReceiptValues(s, receipt, contentvalues);
        receipt.rowId = sqlitedatabase.insertWithOnConflict("ereceipts", null, contentvalues, 3);
_L11:
        if (receipt.tax == null) goto _L4; else goto _L3
_L3:
        int j = 0;
_L21:
        if (j >= receipt.tax.length) goto _L4; else goto _L5
_L5:
        Object obj;
        contentvalues.clear();
        obj = receipt.tax[j];
        if (obj == null) goto _L7; else goto _L6
_L6:
        contentvalues.put("ereceiptId", Long.valueOf(receipt.rowId));
        contentvalues.put("amount", Integer.valueOf(((EReceipt.Tax) (obj)).amount));
        contentvalues.put("level", ((EReceipt.Tax) (obj)).level);
        contentvalues.put("rateStr", ((EReceipt.Tax) (obj)).rateStr);
        contentvalues.put("item_order", Integer.valueOf(j));
        sqlitedatabase.insert("tax", null, contentvalues);
          goto _L7
        Object obj1;
        obj1;
        Object obj2;
        obj2 = receipt.uuid;
        obj2 = sqlitedatabase.query("ereceipts", new String[] {
            "_id"
        }, "uuid=?", new String[] {
            obj2
        }, null, null, null);
        if (obj2 == null) goto _L9; else goto _L8
_L8:
        if (!((Cursor) (obj2)).moveToFirst()) goto _L9; else goto _L10
_L10:
        receipt.rowId = ((Cursor) (obj2)).getLong(0);
        sqlitedatabase.update("ereceipts", contentvalues, "uuid=?", new String[] {
            receipt.uuid
        });
        sqlitedatabase.delete("item", "ereceiptId=?", new String[] {
            String.valueOf(receipt.rowId)
        });
        sqlitedatabase.delete("tax", "ereceiptId=?", new String[] {
            String.valueOf(receipt.rowId)
        });
        sqlitedatabase.delete("tender", "ereceiptId=?", new String[] {
            String.valueOf(receipt.rowId)
        });
          goto _L11
_L13:
        WLog.e(TAG, (new StringBuilder()).append("Database operation failed for ruid: ").append(receipt.uuid).append(", tcNbr: ").append(receipt.tcNumber).toString(), ((Throwable) (obj1)));
_L18:
        i++;
          goto _L12
_L9:
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally
        {
            sqlitedatabase.endTransaction();
        }
          goto _L13
        throw s;
_L4:
        if (receipt.tender == null) goto _L15; else goto _L14
_L14:
        j = 0;
_L22:
        if (j >= receipt.tender.length) goto _L15; else goto _L16
_L16:
        contentvalues.clear();
        obj1 = receipt.tender[j];
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        contentvalues.put("ereceiptId", Long.valueOf(receipt.rowId));
        contentvalues.put("amount", Integer.valueOf(((EReceipt.Tender) (obj1)).amount));
        contentvalues.put("name", ((EReceipt.Tender) (obj1)).name);
        contentvalues.put("item_order", Integer.valueOf(j));
        sqlitedatabase.insert("tender", null, contentvalues);
        break MISSING_BLOCK_LABEL_661;
_L15:
        if (receipt.items == null) goto _L18; else goto _L17
_L17:
        EReceipt.Item aitem[];
        int l;
        aitem = receipt.items;
        l = aitem.length;
        j = 0;
_L20:
        if (j >= l) goto _L18; else goto _L19
_L19:
        obj2 = aitem[j];
        contentvalues.clear();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_634;
        }
        contentvalues.put("ereceiptId", Long.valueOf(receipt.rowId));
        fillItemValues(((EReceipt.Item) (obj2)), contentvalues);
        sqlitedatabase.insert("item", null, contentvalues);
        j++;
          goto _L20
          goto _L18
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
_L7:
        j++;
          goto _L21
        j++;
          goto _L22
    }

    public transient void markForDeletion(String as[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        int j;
        contentvalues = new ContentValues();
        j = as.length;
_L2:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        contentvalues.clear();
        contentvalues.put("deleted", Integer.valueOf(1));
        sqlitedatabase.update("ereceipts", contentvalues, "uuid=?", new String[] {
            s
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
        catch (String as[])
        {
            WLog.e(TAG, "Database operation failed", as);
        }
        break MISSING_BLOCK_LABEL_109;
        as;
        sqlitedatabase.endTransaction();
        throw as;
    }

    public transient void updateStoreLookup(StoreItemService.StoreItem astoreitem[])
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        int j;
        contentvalues = new ContentValues();
        j = astoreitem.length;
_L2:
        StoreItemService.StoreItem storeitem;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        storeitem = astoreitem[i];
        contentvalues.clear();
        if (!TextUtils.isEmpty(storeitem.name))
        {
            contentvalues.put("name", storeitem.name);
        }
        if (!TextUtils.isEmpty(storeitem.productId))
        {
            contentvalues.put("productId", storeitem.productId);
        }
        if (!TextUtils.isEmpty(storeitem.imageUrl))
        {
            contentvalues.put("productImageUrl", storeitem.imageUrl);
        }
        contentvalues.put("storeItemLookup", Integer.valueOf(1));
        sqlitedatabase.update("item", contentvalues, "normalizedUpc=?", new String[] {
            storeitem.normalizedUpc
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
        catch (StoreItemService.StoreItem astoreitem[])
        {
            WLog.e(TAG, "Database operation failed", astoreitem);
        }
        break MISSING_BLOCK_LABEL_178;
        astoreitem;
        sqlitedatabase.endTransaction();
        throw astoreitem;
    }

}
