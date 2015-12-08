// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmart.android.app.registry.RegistryStatus;

// Referenced classes of package com.walmart.android.fragments:
//            RegistryFragment

static class 
{

    static final int $SwitchMap$com$walmart$android$app$registry$RegistryStatus[];

    static 
    {
        $SwitchMap$com$walmart$android$app$registry$RegistryStatus = new int[RegistryStatus.values().length];
        try
        {
            $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_MAINTENANCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_NEEDS_APP_UPDATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.ENABLED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
