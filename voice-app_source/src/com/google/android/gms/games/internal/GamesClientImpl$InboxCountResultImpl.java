// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapj
    implements com.google.android.gms.games.sultImpl
{

    private final Status zzOt;
    private final Bundle zzapj;

    public Status getStatus()
    {
        return zzOt;
    }

    (Status status, Bundle bundle)
    {
        zzOt = status;
        zzapj = bundle;
    }
}
