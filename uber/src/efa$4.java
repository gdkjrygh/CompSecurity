// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageDisplayProperties;

final class ang.Object
    implements gka
{

    final efa a;

    private static boolean a(MobileMessage mobilemessage)
    {
        mobilemessage = mobilemessage.getDisplayProps();
        return mobilemessage != null && mobilemessage.getShowForDynamicPickupsSummary() != null && mobilemessage.getShowForDynamicPickupsSummary().booleanValue();
    }

    public final boolean apply(Object obj)
    {
        return a((MobileMessage)obj);
    }

    (efa efa1)
    {
        a = efa1;
        super();
    }
}
