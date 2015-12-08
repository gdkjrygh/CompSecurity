// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.search;


// Referenced classes of package com.arubanetworks.meridian.search:
//            LocalSearch, LocalSearchResponse

public static interface 
{

    public abstract void onSearchComplete(LocalSearchResponse localsearchresponse);

    public abstract void onSearchError(Throwable throwable);
}
