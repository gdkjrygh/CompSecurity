// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.internal:
//            zzbf, zzbi

class zzbj extends FrameLayout
{

    private final zzbf zzta;
    private final zzbi zztc;
    private final View zztd;

    public zzbj(Context context, zzbi zzbi, View view, zzbf zzbf)
    {
        super(context);
        zzv.zzb(zzbi, "Native ad engine must not be null!");
        zzv.zzb(view, "Native ad bounding box must not be null!");
        zztc = zzbi;
        zztd = view;
        zzta = zzbf;
        addView(view);
        if (zzta != null)
        {
            addView(zzta);
        }
    }

    public zzbi zzcP()
    {
        return zztc;
    }

    public View zzcQ()
    {
        return zztd;
    }
}
