// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.content.Context;
import com.google.android.gms.location.internal.z;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            CopresenceApiOptions, c

public class b
{

    private final Context a;
    private final String b;
    private final z c;
    private final String d;
    private final CopresenceApiOptions e;
    private c f;

    private b(Context context, String s, String s1, z z, CopresenceApiOptions copresenceapioptions)
    {
        a = context;
        b = s;
        c = z;
        f = null;
        d = s1;
        e = copresenceapioptions;
    }

    public static b a(Context context, String s, String s1, z z, CopresenceApiOptions copresenceapioptions)
    {
        return new b(context, s, s1, z, copresenceapioptions);
    }
}
