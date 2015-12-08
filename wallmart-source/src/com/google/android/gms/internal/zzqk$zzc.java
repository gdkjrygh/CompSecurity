// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqk

static class zzaTF
{

    private Object mData;
    private Status zzQA;
    private long zzaTF;

    public long zzBu()
    {
        return zzaTF;
    }

    public void zzQ(Object obj)
    {
        mData = obj;
    }

    public void zzU(long l)
    {
        zzaTF = l;
    }

    public void zzbh(Status status)
    {
        zzQA = status;
    }

    public (Status status, Object obj, long l)
    {
        zzQA = status;
        mData = obj;
        zzaTF = l;
    }
}
