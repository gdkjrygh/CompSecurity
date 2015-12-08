// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;

// Referenced classes of package com.jiubang.goweather.c:
//            s, p

public abstract class w
{

    protected Context a;
    protected s b;
    protected p c;

    protected w(Context context, p p)
    {
        a = context;
        c = p;
    }

    public abstract void a();

    public abstract boolean a(int i, s s);
}
