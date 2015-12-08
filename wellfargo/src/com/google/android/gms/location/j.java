// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.location.internal.v;

final class j extends g
{

    j()
    {
    }

    public com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, q q, r r)
    {
        return a(context, looper, h, (d)obj, q, r);
    }

    public v a(Context context, Looper looper, h h, d d1, q q, r r)
    {
        return new v(context, looper, q, r, "locationServices", h);
    }
}
