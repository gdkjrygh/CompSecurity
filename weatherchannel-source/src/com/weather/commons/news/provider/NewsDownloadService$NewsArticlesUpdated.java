// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


// Referenced classes of package com.weather.commons.news.provider:
//            NewsDownloadService

public static class failure
{

    private boolean failure;
    private boolean hasDeepLink;

    public boolean hasDeepLink()
    {
        return hasDeepLink;
    }

    public boolean isFailure()
    {
        return failure;
    }

    public (boolean flag)
    {
        this(flag, false);
    }

    public <init>(boolean flag, boolean flag1)
    {
        hasDeepLink = flag;
        failure = flag1;
    }
}
