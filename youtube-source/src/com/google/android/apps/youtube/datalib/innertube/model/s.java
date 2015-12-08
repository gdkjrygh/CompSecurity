// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kg;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u

public class s
    implements u
{

    private kg a;
    private CharSequence b;

    public s(kg kg1)
    {
        a = (kg)c.a(kg1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return b;
    }

    public final kz e()
    {
        return a.c;
    }
}
