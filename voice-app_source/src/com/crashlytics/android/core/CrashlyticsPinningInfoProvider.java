// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.network.PinningInfoProvider;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android.core:
//            PinningInfoProvider

class CrashlyticsPinningInfoProvider
    implements PinningInfoProvider
{

    private final com.crashlytics.android.core.PinningInfoProvider pinningInfo;

    public CrashlyticsPinningInfoProvider(com.crashlytics.android.core.PinningInfoProvider pinninginfoprovider)
    {
        pinningInfo = pinninginfoprovider;
    }

    public String getKeyStorePassword()
    {
        return pinningInfo.getKeyStorePassword();
    }

    public InputStream getKeyStoreStream()
    {
        return pinningInfo.getKeyStoreStream();
    }

    public long getPinCreationTimeInMillis()
    {
        return -1L;
    }

    public String[] getPins()
    {
        return pinningInfo.getPins();
    }
}
