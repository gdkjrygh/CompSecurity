// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ArtistFragment, g

final class c
    implements android.view.View.OnClickListener
{

    final ArtistFragment a;

    c(ArtistFragment artistfragment)
    {
        a = artistfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (a.a != null)
        {
            int i;
            boolean flag;
            if (!a.a.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.a.a(flag);
            view = ArtistFragment.f(a);
            if (flag)
            {
                i = p.cv;
            } else
            {
                i = p.cu;
            }
            view.setText(i);
        }
    }
}
