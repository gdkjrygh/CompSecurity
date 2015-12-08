// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqa

static class zzaPl
{

    private Object mData;
    private Status zzOt;
    private long zzaPl;

    public long zzAe()
    {
        return zzaPl;
    }

    public void zzO(Object obj)
    {
        mData = obj;
    }

    public void zzU(long l)
    {
        zzaPl = l;
    }

    public void zzaV(Status status)
    {
        zzOt = status;
    }

    public (Status status, Object obj, long l)
    {
        zzOt = status;
        mData = obj;
        zzaPl = l;
    }
}
