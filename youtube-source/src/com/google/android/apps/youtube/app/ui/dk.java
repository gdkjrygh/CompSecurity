// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            df, dn

final class dk
    implements android.view.View.OnClickListener
{

    final df a;

    dk(df df1)
    {
        a = df1;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (view.equals(df.d(a)))
        {
            view = df.e(a);
            if (df.d(a).isSelected())
            {
                flag = false;
            }
            view.e(flag);
        } else
        if (view.equals(df.f(a)))
        {
            view = df.e(a);
            boolean flag1;
            if (!df.f(a).isSelected())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            view.f(flag1);
            return;
        }
    }
}
