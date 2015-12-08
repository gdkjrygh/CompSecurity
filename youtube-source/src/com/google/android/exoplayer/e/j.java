// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.e;

import android.os.Trace;

// Referenced classes of package com.google.android.exoplayer.e:
//            k

public final class j
{

    public static void a()
    {
        if (k.a >= 18)
        {
            Trace.endSection();
        }
    }

    public static void a(String s)
    {
        if (k.a >= 18)
        {
            Trace.beginSection(s);
        }
    }
}
