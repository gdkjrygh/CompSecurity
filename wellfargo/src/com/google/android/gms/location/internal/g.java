// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.z;
import com.google.android.gms.location.k;

abstract class g extends k
{

    public g(n n)
    {
        super(n);
    }

    public z b(Status status)
    {
        return d(status);
    }

    public Status d(Status status)
    {
        return status;
    }
}
