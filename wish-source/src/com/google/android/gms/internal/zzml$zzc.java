// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzml

static class zzaGX
{

    private Object mData;
    private Status zzKr;
    private long zzaGX;

    public void zzK(Object obj)
    {
        mData = obj;
    }

    public void zzT(long l)
    {
        zzaGX = l;
    }

    public void zzaP(Status status)
    {
        zzKr = status;
    }

    public long zzyi()
    {
        return zzaGX;
    }

    public (Status status, Object obj, long l)
    {
        zzKr = status;
        mData = obj;
        zzaGX = l;
    }
}
