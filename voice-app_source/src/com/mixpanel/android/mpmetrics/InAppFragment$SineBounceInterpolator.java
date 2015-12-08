// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.view.animation.Interpolator;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppFragment

private class this._cls0
    implements Interpolator
{

    final InAppFragment this$0;

    public float getInterpolation(float f)
    {
        return (float)(-(Math.pow(2.7182818284590451D, -8F * f) * Math.cos(12F * f))) + 1.0F;
    }

    public I()
    {
        this$0 = InAppFragment.this;
        super();
    }
}
