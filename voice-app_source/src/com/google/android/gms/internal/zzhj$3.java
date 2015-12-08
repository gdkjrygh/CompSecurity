// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj

static final class a extends a
{

    final int zzGd;
    final Context zzqV;

    public void zzdP()
    {
        android.content.references.Editor editor = zzhj.zzF(zzqV).edit();
        editor.putInt("webview_cache_version", zzGd);
        editor.commit();
    }

    r(Context context, int i)
    {
        zzqV = context;
        zzGd = i;
        super(null);
    }
}
