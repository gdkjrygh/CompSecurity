// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.FareInfo;

public final class fgf
{

    private final RiderLocation a;
    private final FareInfo b;

    public fgf(RiderLocation riderlocation, FareInfo fareinfo)
    {
        a = riderlocation;
        b = fareinfo;
    }

    public final RiderLocation a()
    {
        return a;
    }

    public final FareInfo b()
    {
        return b;
    }
}
