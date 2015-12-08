// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzfj

static final class a extends a
{

    final b zzCj;
    final Context zzoH;

    public void zzcX()
    {
        SharedPreferences sharedpreferences = zzfj.zzu(zzoH);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
        if (zzCj != null)
        {
            zzCj.zzc(bundle);
        }
    }

    b(Context context, b b)
    {
        zzoH = context;
        zzCj = b;
        super(null);
    }
}
