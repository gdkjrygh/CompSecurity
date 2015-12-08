// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.signin.internal.n;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            g, b

final class c extends g
{

    c()
    {
    }

    public volatile com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, q q, r r)
    {
        return a(context, looper, h, (com.google.android.gms.signin.g)obj, q, r);
    }

    public n a(Context context, Looper looper, h h, com.google.android.gms.signin.g g1, q q, r r)
    {
        return new n(context, looper, true, h, g1, q, r, Executors.newSingleThreadExecutor());
    }

    public List a(com.google.android.gms.signin.g g1)
    {
        return Arrays.asList(new Scope[] {
            b.e, b.f
        });
    }

    public List a(Object obj)
    {
        return a((com.google.android.gms.signin.g)obj);
    }
}
