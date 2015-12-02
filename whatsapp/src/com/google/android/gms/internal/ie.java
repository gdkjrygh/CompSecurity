// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            np

public class ie
{

    private final np Ee;
    private final Context mContext;

    private ie(Context context, np np)
    {
        mContext = context;
        Ee = np;
    }

    public static ie a(Context context, np np)
    {
        return new ie(context, np);
    }
}
