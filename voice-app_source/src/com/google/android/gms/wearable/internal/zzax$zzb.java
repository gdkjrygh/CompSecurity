// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzax

public static class zzaUJ
    implements com.google.android.gms.wearable.etConnectedNodesResult
{

    private final Status zzOt;
    private final List zzaUJ;

    public List getNodes()
    {
        return zzaUJ;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public edNodesResult(Status status, List list)
    {
        zzOt = status;
        zzaUJ = list;
    }
}
