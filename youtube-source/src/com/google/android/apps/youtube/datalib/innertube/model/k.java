// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.TextUtils;
import com.google.a.a.a.a.pk;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ah

public class k
{

    private final pk a;
    private List b;

    public k(pk pk1)
    {
        a = (pk)c.a(pk1);
    }

    public static boolean a(pk pk1)
    {
        return pk1 != null && TextUtils.isEmpty(pk1.b);
    }

    public final List a()
    {
        if (b == null)
        {
            b = ah.a(a.l);
        }
        return b;
    }
}
