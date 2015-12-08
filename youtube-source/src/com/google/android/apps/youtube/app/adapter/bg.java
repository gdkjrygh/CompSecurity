// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, bh, bi

public abstract class bg extends g
{

    public bg()
    {
    }

    public static bg a(Context context)
    {
        return new bh(context);
    }

    public static bg b(Context context)
    {
        return new bi(context);
    }
}
