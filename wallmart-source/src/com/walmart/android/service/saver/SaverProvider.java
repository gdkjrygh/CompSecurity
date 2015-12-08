// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;
import android.util.Pair;
import com.walmartlabs.ereceipt.service.EReceiptProvider;
import java.util.List;

public interface SaverProvider
    extends EReceiptProvider
{

    public abstract void decorateEReceipt(String s, String s1, boolean flag, boolean flag1, boolean flag2, SaverContract.SaverRejectedReasons saverrejectedreasons);

    public abstract Cursor findMissingEReceipts();

    public abstract Cursor findMissingSaverReceipts(String s);

    public abstract Cursor getAllReceipts(String s, boolean flag);

    public abstract Cursor getCompetitors(Integer integer);

    public abstract String getOldestSaverReceipt();

    public abstract Cursor getReceipt(String s, String s1);

    public abstract Cursor getSaverReceipt(String s, String s1);

    public abstract Cursor getSaverReceiptItems(String s, String s1);

    public abstract Cursor getUnseenReceipts(String s);

    public abstract void insertDetails(String s, String s1, SaverReceiptResponse.ProcessedDetails processeddetails);

    public abstract void insertSummaries(List list);

    public abstract void resetSaverData();

    public abstract void updateMissingReceipt(String s, String s1, boolean flag);

    public transient abstract void updateSeenReceipt(boolean flag, Pair apair[]);
}
