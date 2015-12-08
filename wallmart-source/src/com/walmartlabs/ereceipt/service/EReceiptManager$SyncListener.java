// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;


// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceipt

public static interface 
{

    public abstract void onDeletedReceipts(int ai[]);

    public abstract void onNewReceipts(EReceipt aereceipt[]);

    public abstract void onSyncFinished(Integer integer);
}
