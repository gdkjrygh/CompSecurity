// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;


// Referenced classes of package com.walmart.android.search:
//            SearchData

public static final class  extends Enum
{

    private static final SEARCH_TYPE_VOICE $VALUES[];
    public static final SEARCH_TYPE_VOICE SEARCH_TYPE_EXACT;
    public static final SEARCH_TYPE_VOICE SEARCH_TYPE_RECENT;
    public static final SEARCH_TYPE_VOICE SEARCH_TYPE_SUGGESTION;
    public static final SEARCH_TYPE_VOICE SEARCH_TYPE_VOICE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/search/SearchData$SearchType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SEARCH_TYPE_EXACT = new <init>("SEARCH_TYPE_EXACT", 0);
        SEARCH_TYPE_RECENT = new <init>("SEARCH_TYPE_RECENT", 1);
        SEARCH_TYPE_SUGGESTION = new <init>("SEARCH_TYPE_SUGGESTION", 2);
        SEARCH_TYPE_VOICE = new <init>("SEARCH_TYPE_VOICE", 3);
        $VALUES = (new .VALUES[] {
            SEARCH_TYPE_EXACT, SEARCH_TYPE_RECENT, SEARCH_TYPE_SUGGESTION, SEARCH_TYPE_VOICE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
