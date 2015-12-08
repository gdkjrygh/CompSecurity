// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;

import com.walmartlabs.analytics.anivia.AniviaEventJackson;

public class StoreSearchResultEvent extends AniviaEventJackson
{

    public static final String MODE_IN_STORE = "inStore";
    public static final String MODE_NEARBY_STORE = "nearbyStore";
    public static final String MODE_SET_STORE = "setStore";
    public static final String SECTION_STORE_SEARCH = "store search";
    public String categoryId;
    public String inDepartment;
    public String mode;
    public String name;
    public String numberOfAislesMapped;
    public String numberOfItemsMapped;
    public int resultNumber;
    public String searchTerm;
    public String searchType;
    public String section;
    public String storeId;

    public StoreSearchResultEvent()
    {
        super("pageView");
        name = "storeSearchResults";
    }

    public static String toSearchTypeString(com.walmart.android.search.SearchData.SearchType searchtype)
    {
        if (searchtype == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$walmart$android$search$SearchData$SearchType[];

            static 
            {
                $SwitchMap$com$walmart$android$search$SearchData$SearchType = new int[com.walmart.android.search.SearchData.SearchType.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_EXACT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_VOICE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.walmart.android.search.SearchData.SearchType[searchtype.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 47
    //                   2 47
    //                   3 50
    //                   4 53;
           goto _L2 _L3 _L3 _L4 _L5
_L2:
        return "";
_L3:
        return "entered";
_L4:
        return "history";
_L5:
        return "suggestion";
    }

    public String toString()
    {
        return (new StringBuilder()).append("Event [searchType=").append(searchType).append(", section: ").append(section).append(", searchTerm: ").append(searchTerm).append(", inDepartment=").append(inDepartment).append(", mode=").append(mode).append(", storeId=").append(storeId).append(", resultNumber: ").append(resultNumber).append(", numberOfItemsMapped: ").append(numberOfItemsMapped).append(", numberOfAislesMapped: ").append(numberOfAislesMapped).append("]").toString();
    }
}
