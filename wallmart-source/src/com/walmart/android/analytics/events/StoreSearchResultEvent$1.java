// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;


// Referenced classes of package com.walmart.android.analytics.events:
//            StoreSearchResultEvent

static class 
{

    static final int $SwitchMap$com$walmart$android$search$SearchData$SearchType[];

    static 
    {
        $SwitchMap$com$walmart$android$search$SearchData$SearchType = new int[com.walmart.android.search.ues().length];
        try
        {
            $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.RCH_TYPE_EXACT.inal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.RCH_TYPE_VOICE.inal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.RCH_TYPE_RECENT.inal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmart$android$search$SearchData$SearchType[com.walmart.android.search.RCH_TYPE_SUGGESTION.inal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
