// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

// Referenced classes of package com.whatsapp.util:
//            RtlCheckBox

class a0 extends InsetDrawable
{

    final RtlCheckBox a;

    a0(RtlCheckBox rtlcheckbox, Drawable drawable, int i)
    {
        a = rtlcheckbox;
        super(drawable, i);
    }

    public void draw(Canvas canvas)
    {
    }
}
