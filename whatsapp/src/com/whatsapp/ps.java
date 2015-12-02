// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.whatsapp:
//            AnswerCallView, afa

class ps extends Animation
{

    final AnswerCallView a;

    private ps(AnswerCallView answercallview)
    {
        a = answercallview;
        super();
    }

    ps(AnswerCallView answercallview, afa afa)
    {
        this(answercallview);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        AnswerCallView.a(a, f);
        a.invalidate();
    }
}
