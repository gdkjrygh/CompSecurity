// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzax

public static class zzaUK
    implements com.google.android.gms.wearable.etLocalNodeResult
{

    private final Status zzOt;
    private final Node zzaUK;

    public Node getNode()
    {
        return zzaUK;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public deResult(Status status, Node node)
    {
        zzOt = status;
        zzaUK = node;
    }
}
