// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.ubercab.client.core.ui.RiderGridView;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlayableItemGridFragment

final class a
    implements android.view.
{

    final LayoutInflater a;
    final PlayableItemGridFragment b;

    private int a()
    {
        return b() / 2 - b.getResources().getDimensionPixelSize(0x7f08007c) / 2;
    }

    private int b()
    {
        return b.mGridView.getWidth();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (k - i <= 0)
        {
            return;
        } else
        {
            i = a();
            PlayableItemGridFragment.a(b, a, i);
            b.mImageViewHeader.getLayoutParams().ht = i;
            b.mImageViewHeader.requestLayout();
            PlayableItemGridFragment.a(b);
            PlayableItemGridFragment.a(b, i);
            b.mGridView.removeOnLayoutChangeListener(this);
            return;
        }
    }

    A(PlayableItemGridFragment playableitemgridfragment, LayoutInflater layoutinflater)
    {
        b = playableitemgridfragment;
        a = layoutinflater;
        super();
    }
}
