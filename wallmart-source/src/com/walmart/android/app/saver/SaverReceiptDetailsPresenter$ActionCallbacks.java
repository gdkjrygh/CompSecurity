// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

public static interface 
{

    public abstract void launchReceiptImage(String s);

    public abstract void launchReceiptItem(SaverReceipt saverreceipt, com.walmart.android.service.saver. );

    public abstract void launchReturn(String s);

    public abstract void launchSignIn();

    public abstract void moveTo(int i);

    public abstract void onShowCompetitors(String s, String s1, String s2, String s3);

    public abstract void onUnseen(SaverReceipt saverreceipt);
}
