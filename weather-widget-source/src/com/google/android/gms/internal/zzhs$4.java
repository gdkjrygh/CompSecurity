// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs

static final class a extends a
{

    final b zzHw;
    final Context zzrn;

    public void zzdG()
    {
        SharedPreferences sharedpreferences = zzhs.zzH(zzrn);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
        if (zzHw != null)
        {
            zzHw.zzd(bundle);
        }
    }

    b(Context context, b b)
    {
        zzrn = context;
        zzHw = b;
        super(null);
    }
}
