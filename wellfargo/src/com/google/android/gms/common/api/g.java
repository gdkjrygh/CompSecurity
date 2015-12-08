// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.h;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            q, r, h

public abstract class g
{

    public g()
    {
    }

    public int a()
    {
        return 0x7fffffff;
    }

    public abstract com.google.android.gms.common.api.h a(Context context, Looper looper, h h, Object obj, q q, r r);

    public List a(Object obj)
    {
        return Collections.emptyList();
    }
}
