// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gax
{

    private gbj a;
    private com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation b;

    gax(gbj gbj, com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        gjz.a(gbj);
        gjz.a(pickuplocation);
        a = gbj;
        b = pickuplocation;
    }

    final com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation a()
    {
        return b;
    }

    final gbj b()
    {
        return a;
    }
}
