// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage.model;

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;

public class MobileMessageDataHolder
{

    final City city;
    final Client client;
    final Trip trip;

    public MobileMessageDataHolder(City city1, Client client1, Trip trip1)
    {
        city = city1;
        client = client1;
        trip = trip1;
    }
}
