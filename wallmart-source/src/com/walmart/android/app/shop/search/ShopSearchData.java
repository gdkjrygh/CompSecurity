// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.search;

import android.os.Bundle;
import com.walmart.android.search.SearchData;

public class ShopSearchData extends SearchData
{

    public static final int SOURCE_BARCODE = 2;
    public static final int SOURCE_TEXT = 0;
    public static final int SOURCE_VOICE = 1;
    private final CharSequence mDepartment;
    private final int mSource;

    public ShopSearchData(CharSequence charsequence)
    {
        this(charsequence, null, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_EXACT, 0);
    }

    public ShopSearchData(CharSequence charsequence, int i)
    {
        this(charsequence, null, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_EXACT, i);
    }

    public ShopSearchData(CharSequence charsequence, com.walmart.android.search.SearchData.SearchType searchtype)
    {
        this(charsequence, null, searchtype, 0);
    }

    public ShopSearchData(CharSequence charsequence, CharSequence charsequence1, com.walmart.android.search.SearchData.SearchType searchtype)
    {
        this(charsequence, charsequence1, searchtype, 0);
    }

    public ShopSearchData(CharSequence charsequence, CharSequence charsequence1, com.walmart.android.search.SearchData.SearchType searchtype, int i)
    {
        super(charsequence, searchtype);
        mDepartment = charsequence1;
        mSource = i;
    }

    public CharSequence getDepartment()
    {
        return mDepartment;
    }

    public CharSequence getDisplayDepartment()
    {
        if (mDepartment != null)
        {
            return new String((new StringBuilder()).append("In ").append(mDepartment).toString());
        } else
        {
            return null;
        }
    }

    public boolean isFromBarcode()
    {
        return mSource == 2;
    }

    public boolean isFromText()
    {
        return mSource == 0;
    }

    public boolean isFromVoice()
    {
        return mSource == 1;
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        if (isFromBarcode())
        {
            bundle.putCharSequence("search_barcode", getSearchText());
        } else
        {
            bundle.putCharSequence("search_query", getSearchText());
            bundle.putCharSequence("search_department", getDepartment());
        }
        bundle.putString("search_type", getSearchType().toString());
        return bundle;
    }
}
