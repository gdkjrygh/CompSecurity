// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.signin.internal.n;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            g

final class d extends g
{

    d()
    {
    }

    public com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, q q, r r)
    {
        return a(context, looper, h, (com.google.android.gms.common.api.d)obj, q, r);
    }

    public n a(Context context, Looper looper, h h, com.google.android.gms.common.api.d d1, q q, r r)
    {
        return new n(context, looper, false, h, g.a, q, r, Executors.newSingleThreadExecutor());
    }
}
