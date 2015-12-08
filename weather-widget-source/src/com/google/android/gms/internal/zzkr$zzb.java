// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            zzkr

static final class zzacs extends android.graphics.drawable.ConstantState
{

    int zzacr;
    int zzacs;

    public int getChangingConfigurations()
    {
        return zzacr;
    }

    public Drawable newDrawable()
    {
        return new zzkr(this);
    }

    ntState(ntState ntstate)
    {
        if (ntstate != null)
        {
            zzacr = ntstate.zzacr;
            zzacs = ntstate.zzacs;
        }
    }
}
