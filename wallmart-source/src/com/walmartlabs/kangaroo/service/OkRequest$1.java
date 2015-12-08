// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;


// Referenced classes of package com.walmartlabs.kangaroo.service:
//            OkRequest

static class 
{

    static final int $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[];

    static 
    {
        $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType = new int[com.walmartlabs.kangaroo.nseType.values().length];
        try
        {
            $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.nseType.NETWORK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.nseType.CACHED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.nseType.CONDITIONAL_NETWORK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.nseType.CONDITIONAL_CACHED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmartlabs$kangaroo$Result$ResponseType[com.walmartlabs.kangaroo.nseType.NO_RESPONSE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
