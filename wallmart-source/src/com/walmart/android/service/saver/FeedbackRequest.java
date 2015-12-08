// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


public class FeedbackRequest
{

    public static final String CATEGORY_ITEM_SPECIFIC = "Item Specific";
    public static final String CATEGORY_OTHER = "Other";
    public static final String CATEGORY_PROCESS = "Process";
    public static final String CATEGORY_RECEIPT_ENTRY = "Receipt Entry";
    public static final String CATEGORY_REWARDS = "Rewards eGift Card";
    public String category;
    public String competitorName;
    public String description;
    public String endDate;
    public String startDate;
    public String tcNbr;
    public String upcNbr;

    public FeedbackRequest()
    {
    }
}
