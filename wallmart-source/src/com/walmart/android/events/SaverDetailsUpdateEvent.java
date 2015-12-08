// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;


public class SaverDetailsUpdateEvent
{

    public final com.walmart.android.service.saver.SaverReceiptResponse.ProcessedDetails mProcessedDetails;
    public final String mTcNbr;

    public SaverDetailsUpdateEvent(String s, com.walmart.android.service.saver.SaverReceiptResponse.ProcessedDetails processeddetails)
    {
        mTcNbr = s;
        mProcessedDetails = processeddetails;
    }
}
