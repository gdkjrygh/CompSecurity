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

    final int zzCk;
    final Context zzoH;

    public void zzcX()
    {
        android.content.references.Editor editor = zzfj.zzu(zzoH).edit();
        editor.putInt("webview_cache_version", zzCk);
        editor.commit();
    }

    r(Context context, int i)
    {
        zzoH = context;
        zzCk = i;
        super(null);
    }
}
