// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

// Referenced classes of package com.google.android.gms.internal:
//            zzpp

class nit> extends nit>
{

    final State zzaJK;

    public void zza(Status status, GoogleNowAuthState googlenowauthstate)
    {
        if (a(zzaJK))
        {
            Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
        }
        zzaJK.tResult(new nit>(status, googlenowauthstate));
    }

    State(State state)
    {
        zzaJK = state;
        super();
    }
}
