// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ij, LikeAction, hj

final class ik
    implements android.view.View.OnClickListener
{

    final ij a;

    ik(ij ij1)
    {
        a = ij1;
        super();
    }

    public final void onClick(View view)
    {
        ij.e(a).a(LikeAction.LIKE);
    }
}
