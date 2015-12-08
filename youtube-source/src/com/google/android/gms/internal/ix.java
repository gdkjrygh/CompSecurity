// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.c.b;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            iz

public final class ix
    implements c, d
{

    private final b a;
    private iz b;
    private boolean c;

    public ix(b b1)
    {
        a = b1;
        b = null;
        c = true;
    }

    public final void a(a a1)
    {
        b.a(true);
        if (c && a != null)
        {
            if (a1.a())
            {
                b b1 = a;
                a1.c();
            } else
            {
                a1 = a;
            }
        }
        c = false;
    }

    public final void a(iz iz1)
    {
        b = iz1;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void b()
    {
        b.a(true);
    }

    public final void u_()
    {
        b.a(false);
        b b1;
        if (c && a != null)
        {
            b1 = a;
        }
        c = false;
    }
}
