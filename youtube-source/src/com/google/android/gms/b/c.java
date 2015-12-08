// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.b:
//            a

final class c
    implements d
{

    c()
    {
    }

    public final void a(a a1)
    {
        if (ij.a)
        {
            Log.d("MDM", "failed to connect to network quality service");
        }
        if (a1.b() != 7 && a1.b() != 8)
        {
            com.google.android.gms.b.a.a(false);
        }
    }
}
