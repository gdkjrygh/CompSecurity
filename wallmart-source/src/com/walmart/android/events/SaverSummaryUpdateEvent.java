// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;


public class SaverSummaryUpdateEvent
{

    public final com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary mOverallSavingsSummary;

    public SaverSummaryUpdateEvent(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary overallsavingssummary)
    {
        mOverallSavingsSummary = overallsavingssummary;
    }
}
