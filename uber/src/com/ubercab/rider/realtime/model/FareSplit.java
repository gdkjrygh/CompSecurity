// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            FareSplitClient

public interface FareSplit
{

    public abstract FareSplitClient getClientInitiator();

    public abstract FareSplitClient getClientSelf();

    public abstract List getClients();
}
