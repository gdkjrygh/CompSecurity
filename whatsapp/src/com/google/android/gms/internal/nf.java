// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.internal:
//            nk

public class nf
    implements FusedLocationProviderApi
{

    public nf()
    {
    }

    public Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.f(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.nl();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new _cls5(googleapiclient, locationlistener));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new _cls1(googleapiclient, locationrequest, locationlistener));
    }

    private class _cls5 extends a
    {
        private class a extends com.google.android.gms.location.LocationServices.a
        {

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            public a(GoogleApiClient googleapiclient)
            {
                super(googleapiclient);
            }
        }


        final LocationListener agG;
        final nf agH;

        protected void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agG);
            b(Status.Kw);
        }

        _cls5(GoogleApiClient googleapiclient, LocationListener locationlistener)
        {
            agH = nf.this;
            agG = locationlistener;
            super(googleapiclient);
        }
    }


    private class _cls1 extends a
    {

        final LocationRequest agF;
        final LocationListener agG;
        final nf agH;

        protected void a(com.google.android.gms.common.api.Api.a a1)
        {
            a((nk)a1);
        }

        protected void a(nk nk1)
        {
            nk1.a(agF, agG, null);
            b(Status.Kw);
        }

        _cls1(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
        {
            agH = nf.this;
            agF = locationrequest;
            agG = locationlistener;
            super(googleapiclient);
        }
    }

}
