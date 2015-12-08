// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequestFactory;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            AbstractAppSpiCall, AppRequestData

public class UpdateAppSpiCall extends AbstractAppSpiCall
{

    public UpdateAppSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
    {
        super(kit, s, s1, httprequestfactory, HttpMethod.PUT);
    }

    public volatile boolean invoke(AppRequestData apprequestdata)
    {
        return super.invoke(apprequestdata);
    }
}
