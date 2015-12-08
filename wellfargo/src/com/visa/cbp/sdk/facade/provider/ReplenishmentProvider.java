// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.provider;

import com.visa.cbp.external.aam.ReplenishAckRequest;

// Referenced classes of package com.visa.cbp.sdk.facade.provider:
//            Provider, ResponseCallback

public interface ReplenishmentProvider
    extends Provider
{

    public abstract void doAcknowledge(ReplenishAckRequest replenishackrequest, ResponseCallback responsecallback);
}
