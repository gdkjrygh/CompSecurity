// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzba

public static class zzbaM
    implements com.google.android.gms.wearable.etConnectedNodesResult
{

    private final Status zzQA;
    private final List zzbaM;

    public List getNodes()
    {
        return zzbaM;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public edNodesResult(Status status, List list)
    {
        zzQA = status;
        zzbaM = list;
    }
}
