// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.Interpolator;

// Referenced classes of package com.whatsapp:
//            ak8

class po
    implements Interpolator
{

    final ak8 a;

    po(ak8 ak8_1)
    {
        a = ak8_1;
        super();
    }

    public float getInterpolation(float f)
    {
        if ((double)f > 0.5D)
        {
            return Math.min(f, ak8.g(a));
        } else
        {
            return 0.0F;
        }
    }
}
