// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzfj

static final class a extends a
{

    final boolean zzCi;
    final Context zzoH;

    public void zzcX()
    {
        android.content.references.Editor editor = zzfj.zzu(zzoH).edit();
        editor.putBoolean("use_https", zzCi);
        editor.commit();
    }

    r(Context context, boolean flag)
    {
        zzoH = context;
        zzCi = flag;
        super(null);
    }
}
