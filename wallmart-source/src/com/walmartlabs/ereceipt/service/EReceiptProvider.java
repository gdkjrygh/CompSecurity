// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceipt

public interface EReceiptProvider
{

    public transient abstract void associate(String s, String as[]);

    public abstract void clearAll();

    public abstract void close();

    public transient abstract void delete(int ai[]);

    public transient abstract void delete(EReceipt aereceipt[]);

    public abstract void deleteAll(String s);

    public abstract Cursor getAllReceipts(String s);

    public transient abstract Cursor getFilteredReceipts(String s, String as[]);

    public abstract int getNrbOfReceipts(String s);

    public abstract Cursor getReceipt(String s);

    public abstract Cursor getReceiptImage(String s);

    public abstract Cursor getReceiptItems(long l);

    public abstract Cursor getReceiptTax(long l);

    public abstract Cursor getReceiptTender(long l);

    public abstract Cursor getReceiptsMarkedForDeletion();

    public transient abstract Cursor getStoreLookup(int i, String as[]);

    public transient abstract void insertReceipts(String s, EReceiptsResponse.Receipt areceipt[]);

    public transient abstract void markForDeletion(String as[]);

    public transient abstract void updateStoreLookup(StoreItemService.StoreItem astoreitem[]);
}
