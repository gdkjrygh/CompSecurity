// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;

public final class drd
{

    public static boolean a(ClientStatus clientstatus)
    {
        return clientstatus != null && "Looking".equals(clientstatus.getStatus());
    }
}
