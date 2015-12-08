// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.walmartlabs.utils.WLog;

public class EReceiptDBHelper extends SQLiteOpenHelper
{

    public static final String COLUMN_ORDER = "item_order";
    public static final String DB_NAME = "eReceipts.db";
    private static final String INDEX_ITEM_FK = "index_item_fk";
    private static final String INDEX_ITEM_NORM_UPC = "index_item_norm_upc";
    public static final String TABLE_ERECEIPT = "ereceipts";
    public static final String TABLE_ERECEIPT_ITEM = "item";
    public static final String TABLE_ERECEIPT_TAX = "tax";
    public static final String TABLE_ERECEIPT_TENDER = "tender";
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptDBHelper.getSimpleName();
    private static final int VERSION = 4;
    public static final String VIEW_ERECEIPT_ITEM = "view_ereceipt_item";

    public EReceiptDBHelper(Context context)
    {
        super(context, "eReceipts.db", null, 4);
    }

    private void createEReceiptItemView(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE VIEW view_ereceipt_item AS SELECT ereceipts.*, item.* FROM ereceipts LEFT JOIN item ON (ereceipts._id = item.ereceiptId);");
    }

    private void createItemTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE item (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,ereceiptId INTEGER,upc TEXT,normalizedUpc TEXT,productId TEXT, name TEXT, rawText TEXT, nameOnReceipt TEXT, price INTEGER, quantity REAL, unitQuantity INTEGER, unitPrice INTEGER, lineNumber INTEGER, verticalPixel TEXT, originalOrder INTEGER, productImageUrl TEXT, coupon INTEGER, unitType TEXT, storeItemLookup INTEGER DEFAULT 0,FOREIGN KEY (ereceiptId) REFERENCES ereceipts(_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_item_fk ON item(ereceiptId)");
        sqlitedatabase.execSQL("CREATE INDEX index_item_norm_upc ON item(normalizedUpc)");
    }

    private void upgradeToVersion2(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("ereceipts", "customerId IS NOT NULL", null);
        sqlitedatabase.execSQL("DROP INDEX index_item_fk;");
        sqlitedatabase.execSQL("DROP INDEX index_item_norm_upc;");
        sqlitedatabase.execSQL("ALTER TABLE item ADD COLUMN unitType TEXT;");
        sqlitedatabase.execSQL("ALTER TABLE item RENAME TO temp;");
        createItemTable(sqlitedatabase);
        sqlitedatabase.execSQL("INSERT INTO item SELECT * FROM temp;");
        sqlitedatabase.execSQL("DROP TABLE temp;");
    }

    private void upgradeToVersion3(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("ALTER TABLE item ADD COLUMN storeItemLookup INTEGER DEFAULT 0;");
    }

    private void upgradeToVersion4(SQLiteDatabase sqlitedatabase)
    {
        createEReceiptItemView(sqlitedatabase);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("CREATE TABLE ereceipts (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL,customerReceiptId INTEGER,tcNumber TEXT NOT NULL,timestamp INTEGER NOT NULL,localDateTime TEXT NOT NULL,itemsSold INTEGER,subtotal INTEGER,discountGiven INTEGER,total INTEGER,changeDue INTEGER,waitingOnMoreInfo TEXT,image TEXT,deleted INTEGER DEFAULT 0,customerId TEXT,storeId INTEGER,addressLine1 TEXT,addressLine2 TEXT, city TEXT, phone TEXT, address TEXT, UNIQUE (uuid) UNIQUE (tcNumber, timestamp));");
        createItemTable(sqlitedatabase);
        sqlitedatabase.execSQL("CREATE TABLE tax (_id INTEGER PRIMARY KEY NOT NULL,ereceiptId INTEGER,level TEXT,rateStr TEXT, amount TEXT,item_order INTEGER,FOREIGN KEY (ereceiptId) REFERENCES ereceipts(_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_tax_fk ON tax(ereceiptId)");
        sqlitedatabase.execSQL("CREATE TABLE tender (_id INTEGER PRIMARY KEY NOT NULL,ereceiptId INTEGER,name TEXT,amount TEXT,item_order INTEGER,FOREIGN KEY (ereceiptId) REFERENCES ereceipts(_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_tender_fk ON tender(ereceiptId)");
        createEReceiptItemView(sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        WLog.i(TAG, (new StringBuilder()).append("Upgrading database version from ").append(i).append(" to ").append(j).toString());
        sqlitedatabase.beginTransaction();
        j = i;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        upgradeToVersion2(sqlitedatabase);
        j = i + 1;
        i = j;
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        upgradeToVersion3(sqlitedatabase);
        i = j + 1;
        if (i != 3)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        upgradeToVersion4(sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        WLog.e(TAG, "Could not upgrade eReceipt database", ((Throwable) (obj)));
        throw obj;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

}
