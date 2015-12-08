// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.config;


// Referenced classes of package com.google.android.apps.youtube.datalib.config:
//            ApiaryHostSelection

final class h
{

    static final int a[];

    static 
    {
        a = new int[ApiaryHostSelection.values().length];
        try
        {
            a[ApiaryHostSelection.PRODUCTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ApiaryHostSelection.STAGING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
