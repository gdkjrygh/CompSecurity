// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.LocationHistoryResponse;

final class dck
{

    private LocationHistoryResponse a;
    private int b;

    dck()
    {
        b = dcl.a;
    }

    private void a(int i)
    {
        b = i;
    }

    private void a(LocationHistoryResponse locationhistoryresponse)
    {
        a = locationhistoryresponse;
    }

    static void a(dck dck1, int i)
    {
        dck1.a(i);
    }

    static void a(dck dck1, LocationHistoryResponse locationhistoryresponse)
    {
        dck1.a(locationhistoryresponse);
    }

    final int a()
    {
        return b;
    }

    final LocationHistoryResponse b()
    {
        return a;
    }
}
