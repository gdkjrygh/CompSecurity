// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            CacheBuilderSpec

static class 
{

    static final int $SwitchMap$com$google$common$cache$LocalCache$Strength[];

    static 
    {
        $SwitchMap$com$google$common$cache$LocalCache$Strength = new int[.values().length];
        try
        {
            $SwitchMap$com$google$common$cache$LocalCache$Strength[.WEAK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$common$cache$LocalCache$Strength[.SOFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
