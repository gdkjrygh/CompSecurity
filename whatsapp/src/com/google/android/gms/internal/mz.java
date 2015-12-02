// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            np, na

public class mz
{

    private final String DZ;
    private final np Ee;
    private final String JK;
    private na agz;
    private final Context mContext;

    private mz(Context context, String s, String s1, np np)
    {
        mContext = context;
        DZ = s;
        Ee = np;
        agz = null;
        JK = s1;
    }

    public static mz a(Context context, String s, String s1, np np)
    {
        return new mz(context, s, s1, np);
    }
}
