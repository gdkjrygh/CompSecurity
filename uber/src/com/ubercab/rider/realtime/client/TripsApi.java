// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.AnonymousNumberBody;
import com.ubercab.rider.realtime.request.body.EmptyBody;
import com.ubercab.rider.realtime.request.body.InboundCallBody;
import com.ubercab.rider.realtime.request.body.RateDriverBody;
import com.ubercab.rider.realtime.request.body.RiderSetInfoBody;
import com.ubercab.rider.realtime.request.body.ShareWithContactsBody;
import ica;

public interface TripsApi
{

    public abstract ica getCancellationInfo(String s);

    public abstract ica getContacts(String s);

    public abstract ica getShareYoRide(String s);

    public abstract ica getTripLocations(String s);

    public abstract ica postAnonymousNumber(String s, AnonymousNumberBody anonymousnumberbody);

    public abstract ica postInboundCall(String s, InboundCallBody inboundcallbody);

    public abstract ica postRateDriver(String s, RateDriverBody ratedriverbody);

    public abstract ica postRiderCancel(String s, EmptyBody emptybody);

    public abstract ica postRiderSetInfo(String s, RiderSetInfoBody ridersetinfobody);

    public abstract ica postShareWithContacts(String s, ShareWithContactsBody sharewithcontactsbody);
}
