// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class SearchResultsEvent extends AniviaEventJackson
{

    private static final String EVENT_NAME = "searchResults";
    private String mAvailability;
    private String mCategoryId;
    private String mItemId;
    private String mItemPrice;
    private String mItemSeller;
    private int mNumberOfResults;
    private String mSearchConstraints;
    private String mSearchTerm;

    private SearchResultsEvent()
    {
    }

    public SearchResultsEvent(String s, int i, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        super("searchResults");
        mSearchTerm = s;
        mNumberOfResults = i;
        mSearchConstraints = s1;
        mItemId = s2;
        mCategoryId = s3;
        mAvailability = s4;
        mItemPrice = s5;
        mItemSeller = s6;
    }
}
