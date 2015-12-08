// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            zzkg

static final class zzZE extends android.graphics.drawable.ConstantState
{

    int zzZD;
    int zzZE;

    public int getChangingConfigurations()
    {
        return zzZD;
    }

    public Drawable newDrawable()
    {
        return new zzkg(this);
    }

    ntState(ntState ntstate)
    {
        if (ntstate != null)
        {
            zzZD = ntstate.zzZD;
            zzZE = ntstate.zzZE;
        }
    }
}
