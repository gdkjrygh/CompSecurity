// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import android.content.Context;

// Referenced classes of package com.google.android.ads:
//            GADSignalsLimitedAbstract, a, w, u, 
//            v

public final class s extends GADSignalsLimitedAbstract
{

    private s(Context context, u u, v v)
    {
        super(context, u, v);
    }

    public static s a(String s1, Context context)
    {
        a a1 = new a();
        a(s1, context, ((u) (a1)));
        return new s(context, a1, new w(239));
    }
}
