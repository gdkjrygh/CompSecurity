// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ResourceReader

public static class initialize extends ResourceReader
{

    private final String mResourcePackageName;

    protected String getLocalClassName(Context context)
    {
        return (new StringBuilder(String.valueOf(mResourcePackageName))).append(".R$id").toString();
    }

    protected Class getSystemClass()
    {
        return android/R$id;
    }

    public (String s, Context context)
    {
        super(context);
        mResourcePackageName = s;
        initialize();
    }
}
