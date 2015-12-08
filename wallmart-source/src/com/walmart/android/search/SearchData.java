// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;


public class SearchData
{
    public static final class SearchType extends Enum
    {

        private static final SearchType $VALUES[];
        public static final SearchType SEARCH_TYPE_EXACT;
        public static final SearchType SEARCH_TYPE_RECENT;
        public static final SearchType SEARCH_TYPE_SUGGESTION;
        public static final SearchType SEARCH_TYPE_VOICE;

        public static SearchType valueOf(String s)
        {
            return (SearchType)Enum.valueOf(com/walmart/android/search/SearchData$SearchType, s);
        }

        public static SearchType[] values()
        {
            return (SearchType[])$VALUES.clone();
        }

        static 
        {
            SEARCH_TYPE_EXACT = new SearchType("SEARCH_TYPE_EXACT", 0);
            SEARCH_TYPE_RECENT = new SearchType("SEARCH_TYPE_RECENT", 1);
            SEARCH_TYPE_SUGGESTION = new SearchType("SEARCH_TYPE_SUGGESTION", 2);
            SEARCH_TYPE_VOICE = new SearchType("SEARCH_TYPE_VOICE", 3);
            $VALUES = (new SearchType[] {
                SEARCH_TYPE_EXACT, SEARCH_TYPE_RECENT, SEARCH_TYPE_SUGGESTION, SEARCH_TYPE_VOICE
            });
        }

        private SearchType(String s, int i)
        {
            super(s, i);
        }
    }


    private CharSequence mSearchText;
    private SearchType mSearchType;

    public SearchData(CharSequence charsequence)
    {
        this(charsequence, SearchType.SEARCH_TYPE_EXACT);
    }

    public SearchData(CharSequence charsequence, SearchType searchtype)
    {
        mSearchText = charsequence;
        mSearchType = searchtype;
    }

    public CharSequence getSearchText()
    {
        return mSearchText;
    }

    public SearchType getSearchType()
    {
        return mSearchType;
    }
}
