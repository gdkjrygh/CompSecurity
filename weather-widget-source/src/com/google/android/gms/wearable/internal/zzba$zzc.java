// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzba

public static class zzbaN
    implements com.google.android.gms.wearable.etLocalNodeResult
{

    private final Status zzQA;
    private final Node zzbaN;

    public Node getNode()
    {
        return zzbaN;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public deResult(Status status, Node node)
    {
        zzQA = status;
        zzbaN = node;
    }
}
