// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs

static final class a extends a
{

    final int zzHx;
    final Context zzrn;

    public void zzdG()
    {
        android.content.references.Editor editor = zzhs.zzH(zzrn).edit();
        editor.putInt("webview_cache_version", zzHx);
        editor.apply();
    }

    r(Context context, int i)
    {
        zzrn = context;
        zzHx = i;
        super(null);
    }
}
