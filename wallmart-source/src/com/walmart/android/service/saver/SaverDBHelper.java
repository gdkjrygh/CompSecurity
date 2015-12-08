// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.walmartlabs.utils.WLog;
import java.io.File;

class SaverDBHelper extends SQLiteOpenHelper
{

    private static final String CONSTRAINT_UNIQUE_TC_DATE = "unique_tc_date";
    private static final String DB_ERECEIPT_ALIAS = "eReceiptsDb";
    public static final String DB_NAME = "saver.db";
    private static final String DECORATION_COLUMNS = "saver_receipt_decoration.seen,saver_receipt_decoration.rejected_reason,saver_receipt_decoration.submitConfirmed,saver_receipt_decoration.notificationShown";
    private static final String ERECEIPT_COLUMNS = "ereceipts._id,ereceipts.uuid,ereceipts.customerReceiptId,ereceipts.timestamp,ereceipts.localDateTime,ereceipts.itemsSold,ereceipts.subtotal,ereceipts.discountGiven,ereceipts.total,ereceipts.changeDue,ereceipts.waitingOnMoreInfo,CASE WHEN ereceipts.image IS NULL THEN 0 ELSE 1 END AS hasImage,ereceipts.deleted,ereceipts.customerId,ereceipts.storeId,ereceipts.addressLine1,ereceipts.addressLine2,ereceipts.city,ereceipts.phone,ereceipts.address";
    private static final String ERECEIPT_TC_NBR_COLUMN = "ereceipts.tcNumber";
    public static final String SORT_COLUMN = "sort";
    private static final String SUMMARY_COLUMNS = "saver_receipt.visitDate,saver_receipt.state,saver_receipt.serverState,saver_receipt.getItBackCents,saver_receipt.totalBackCents,saver_receipt.backTaxCents";
    private static final String SUMMARY_TC_NBR_COLUMN = "saver_receipt.tcNumber";
    public static final String TABLE_SAVER_COMPETITORS = "saver_competitors";
    public static final String TABLE_SAVER_ITEMS = "saver_items";
    public static final String TABLE_SAVER_RECEIPT = "saver_receipt";
    public static final String TABLE_SAVER_RECEIPT_DECORATION = "saver_receipt_decoration";
    private static final String TAG = com/walmart/android/service/saver/SaverDBHelper.getSimpleName();
    private static final String TRIGGER_ERECEIPT_DELETE = "trigger_ereceipt_delete";
    private static final int VERSION = 5;
    public static final String VIEW_DECORATED_ERECEIPTS = "view_ereceipts_decorated";
    public static final String VIEW_ERECEIPTS_WITH_SAVER = "view_ereceipts_with_saver";
    public static final String VIEW_SAVER_RECEIPT_ITEMS = "view_saver_receipt_items";
    public static final String VIEW_SAVER_WITHOUT_ERECEIPTS = "view_saver_without_ereceipt";
    private final String mEReceiptDBName;

    public SaverDBHelper(Context context)
    {
        super(context, "saver.db", null, 5);
        mEReceiptDBName = context.getDatabasePath("eReceipts.db").getPath();
    }

    private void createCompetitorTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE saver_competitors (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,itemId INTEGER NOT NULL,competitorName TEXT,competitorUnitPrice INTEGER,item_order INTEGER, FOREIGN KEY (itemId) REFERENCES saver_items(_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_saver_competitors_fk ON saver_competitors(itemId)");
    }

    private void createItemView(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE VIEW view_saver_receipt_items AS SELECT tcNumber, visitDate, saver_items.*, saver_competitors.* FROM saver_receipt LEFT JOIN saver_items ON (saver_receipt._id = saver_items.receiptId) LEFT JOIN ( SELECT * FROM ( SELECT * FROM saver_competitors ORDER BY competitorUnitPrice DESC ) GROUP BY itemId ) AS saver_competitors ON (saver_items._id = saver_competitors.itemId) WHERE saver_items._id IS NOT NULL;");
    }

    private void createReceiptTable(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE saver_receipt (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,tcNumber TEXT NOT NULL,visitDate TEXT NOT NULL,state INTEGER,serverState TEXT,getItBackCents INTEGER, totalBackCents INTEGER,backTaxCents INTEGER, competitors TEXT,CONSTRAINT unique_tc_date UNIQUE (tcNumber, visitDate));");
    }

    private void upgradeToVersion2(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("saver_receipt", null, null);
        sqlitedatabase.execSQL("ALTER TABLE saver_competitors ADD COLUMN competitorUnitPrice INTEGER;");
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN returnQty REAL;");
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN remainingQty REAL;");
        sqlitedatabase.execSQL("DROP VIEW view_saver_receipt_items;");
        createItemView(sqlitedatabase);
    }

    private void upgradeToVersion3(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("saver_receipt", null, null);
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN associateDiscount INTEGER DEFAULT 0;");
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN preDiscountRetailPrice INTEGER;");
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN preDiscountUnitPrice INTEGER;");
        sqlitedatabase.execSQL("ALTER TABLE saver_items ADD COLUMN measurement TEXT;");
        sqlitedatabase.execSQL("DROP VIEW view_saver_receipt_items;");
        sqlitedatabase.execSQL("DROP TABLE saver_competitors");
        createCompetitorTable(sqlitedatabase);
        createItemView(sqlitedatabase);
    }

    private void upgradeToVersion4(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("saver_receipt", null, null);
        sqlitedatabase.execSQL("ALTER TABLE saver_receipt ADD COLUMN competitors TEXT;");
    }

    private void upgradeToVersion5(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("ALTER TABLE saver_receipt_decoration ADD COLUMN submitConfirmed INTEGER DEFAULT 0;");
        sqlitedatabase.execSQL("ALTER TABLE saver_receipt_decoration ADD COLUMN notificationShown INTEGER DEFAULT 0;");
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        createReceiptTable(sqlitedatabase);
        sqlitedatabase.execSQL("CREATE TABLE saver_items (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,receiptId INTEGER NOT NULL,upc TEXT NOT NULL,normalizedUpc TEXT NOT NULL,retailPrice INTEGER,unitPrice INTEGER,unitQuantity REAL,returnQty REAL,remainingQty REAL,credited INTEGER,associateDiscount INTEGER DEFAULT 0,preDiscountRetailPrice INTEGER, preDiscountUnitPrice INTEGER,measurement TEXT,item_order INTEGER, FOREIGN KEY (receiptId) REFERENCES saver_receipt(_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_saver_items_fk ON saver_items(receiptId)");
        sqlitedatabase.execSQL("CREATE INDEX index_saver_items_norm_upc ON saver_items(normalizedUpc)");
        createCompetitorTable(sqlitedatabase);
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE saver_receipt_decoration (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,tcNumber TEXT NOT NULL,visitDate TEXT NOT NULL,seen INTEGER DEFAULT 0, eReceiptDeleted INTEGER DEFAULT 0, eReceiptMissing INTEGER DEFAULT 0, rejected_reason INTEGER DEFAULT ").append(SaverContract.SaverRejectedReasons.NONE.getReason()).append(", ").append("submitConfirmed").append(" INTEGER DEFAULT ").append(0).append(", ").append("notificationShown").append(" INTEGER DEFAULT ").append(0).append(", ").append("CONSTRAINT ").append("unique_tc_date").append(" UNIQUE (").append("tcNumber").append(", ").append("visitDate").append(")").append(")").append(";").toString());
        createItemView(sqlitedatabase);
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
        sqlitedatabase.execSQL((new StringBuilder()).append("ATTACH DATABASE '").append(mEReceiptDBName).append("' AS ").append("eReceiptsDb").append(";").toString());
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("CREATE TEMPORARY TRIGGER trigger_ereceipt_delete DELETE ON eReceiptsDb.ereceipts BEGIN DELETE FROM saver_receipt_decoration WHERE old.tcNumber = tcNumber AND date(old.localDateTime) = visitDate AND eReceiptDeleted != 1;  END;");
        sqlitedatabase.execSQL("CREATE TEMPORARY VIEW view_ereceipts_with_saver AS SELECT ereceipts._id,ereceipts.uuid,ereceipts.customerReceiptId,ereceipts.timestamp,ereceipts.localDateTime,ereceipts.itemsSold,ereceipts.subtotal,ereceipts.discountGiven,ereceipts.total,ereceipts.changeDue,ereceipts.waitingOnMoreInfo,CASE WHEN ereceipts.image IS NULL THEN 0 ELSE 1 END AS hasImage,ereceipts.deleted,ereceipts.customerId,ereceipts.storeId,ereceipts.addressLine1,ereceipts.addressLine2,ereceipts.city,ereceipts.phone,ereceipts.address, ereceipts.tcNumber,saver_receipt.visitDate,saver_receipt.state,saver_receipt.serverState,saver_receipt.getItBackCents,saver_receipt.totalBackCents,saver_receipt.backTaxCents, saver_receipt_decoration.seen,saver_receipt_decoration.rejected_reason,saver_receipt_decoration.submitConfirmed,saver_receipt_decoration.notificationShown FROM eReceiptsDb.ereceipts LEFT JOIN saver_receipt ON (eReceiptsDb.ereceipts.tcNumber = saver_receipt.tcNumber AND date(eReceiptsDb.ereceipts.localDateTime) = saver_receipt.visitDate) LEFT JOIN saver_receipt_decoration ON (eReceiptsDb.ereceipts.tcNumber = saver_receipt_decoration.tcNumber AND date(eReceiptsDb.ereceipts.localDateTime) = saver_receipt_decoration.visitDate);");
        sqlitedatabase.execSQL("CREATE TEMPORARY VIEW view_ereceipts_decorated AS SELECT ereceipts._id,ereceipts.uuid,ereceipts.customerReceiptId,ereceipts.timestamp,ereceipts.localDateTime,ereceipts.itemsSold,ereceipts.subtotal,ereceipts.discountGiven,ereceipts.total,ereceipts.changeDue,ereceipts.waitingOnMoreInfo,CASE WHEN ereceipts.image IS NULL THEN 0 ELSE 1 END AS hasImage,ereceipts.deleted,ereceipts.customerId,ereceipts.storeId,ereceipts.addressLine1,ereceipts.addressLine2,ereceipts.city,ereceipts.phone,ereceipts.address, saver_receipt_decoration.* FROM saver_receipt_decoration LEFT JOIN eReceiptsDb.ereceipts ON (eReceiptsDb.ereceipts.tcNumber = saver_receipt_decoration.tcNumber AND date(eReceiptsDb.ereceipts.localDateTime) = saver_receipt_decoration.visitDate);");
        sqlitedatabase.execSQL("CREATE TEMPORARY VIEW view_saver_without_ereceipt AS SELECT ereceipts._id,ereceipts.uuid,ereceipts.customerReceiptId,ereceipts.timestamp,ereceipts.localDateTime,ereceipts.itemsSold,ereceipts.subtotal,ereceipts.discountGiven,ereceipts.total,ereceipts.changeDue,ereceipts.waitingOnMoreInfo,CASE WHEN ereceipts.image IS NULL THEN 0 ELSE 1 END AS hasImage,ereceipts.deleted,ereceipts.customerId,ereceipts.storeId,ereceipts.addressLine1,ereceipts.addressLine2,ereceipts.city,ereceipts.phone,ereceipts.address, saver_receipt.tcNumber,saver_receipt.visitDate,saver_receipt.state,saver_receipt.serverState,saver_receipt.getItBackCents,saver_receipt.totalBackCents,saver_receipt.backTaxCents, saver_receipt_decoration.seen,saver_receipt_decoration.rejected_reason,saver_receipt_decoration.submitConfirmed,saver_receipt_decoration.notificationShown FROM saver_receipt LEFT JOIN eReceiptsDb.ereceipts ON (eReceiptsDb.ereceipts.tcNumber = saver_receipt.tcNumber AND date(eReceiptsDb.ereceipts.localDateTime) = saver_receipt.visitDate) LEFT JOIN saver_receipt_decoration ON (saver_receipt.tcNumber = saver_receipt_decoration.tcNumber AND saver_receipt.visitDate = saver_receipt_decoration.visitDate) WHERE uuid IS NULL;");
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
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
        j = i;
        if (i != 3)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        upgradeToVersion4(sqlitedatabase);
        j = i + 1;
        if (j != 4)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        upgradeToVersion5(sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        WLog.e(TAG, "Could not upgrade Saver database", ((Throwable) (obj)));
        throw obj;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

}
