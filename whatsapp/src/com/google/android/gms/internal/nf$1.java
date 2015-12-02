// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            nk, nf

class gleApiClient extends gleApiClient
{

    final LocationRequest agF;
    final LocationListener agG;
    final nf agH;

    protected void a(com.google.android.gms.common.api. )
    {
        a((nk));
    }

    protected void a(nk nk1)
    {
        nk1.a(agF, agG, null);
        b(Status.Kw);
    }

    gleApiClient(nf nf, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        agH = nf;
        agF = locationrequest;
        agG = locationlistener;
        super(googleapiclient);
    }
}
