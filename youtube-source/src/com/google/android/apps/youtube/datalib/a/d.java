// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.VolleyError;
import com.android.volley.n;
import com.google.android.apps.youtube.common.L;

final class d
    implements n
{

    d()
    {
    }

    public final void a(VolleyError volleyerror)
    {
        L.a("Network error while sending request ", volleyerror);
    }
}
