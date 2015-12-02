// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.whatsapp.qrcode:
//            QrEducationView, q

class a extends Animation
{

    final QrEducationView a;

    private a(QrEducationView qreducationview)
    {
        a = qreducationview;
        super();
    }

    a(QrEducationView qreducationview, q q)
    {
        this(qreducationview);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        QrEducationView.a(a, f);
        a.invalidate();
    }
}
