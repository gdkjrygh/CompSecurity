// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import java.util.List;

// Referenced classes of package com.walmart.android.search:
//            SearchData

public interface RecentSearchProvider
{

    public abstract void addSearch(SearchData searchdata);

    public abstract List getRecentSearches();
}
