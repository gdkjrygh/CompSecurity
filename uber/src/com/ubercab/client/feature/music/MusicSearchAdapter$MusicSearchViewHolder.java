// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import chc;
import com.ubercab.client.core.model.Image;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.ui.TextView;
import ejr;
import java.util.List;

class b
{

    private final int a;
    private final cgh b;
    private final chc c;
    TextView mFirstLine;
    ImageView mImageView;

    public final void a(Playlist playlist)
    {
        mFirstLine.setText(playlist.getName());
        mImageView.getLayoutParams().mImageView = a;
        mImageView.requestLayout();
        playlist = playlist.getImages();
        if (playlist != null && !playlist.isEmpty())
        {
            playlist = (Image)playlist.get(0);
        } else
        {
            playlist = null;
        }
        if (playlist != null)
        {
            playlist = playlist.getUrl();
        } else
        {
            playlist = null;
        }
        b.a(playlist).b(a, a).c().a(0x7f020217).a(c).a(mImageView);
    }

    public (View view, cgh cgh1)
    {
        ButterKnife.inject(this, view);
        a = view.getResources().getDimensionPixelSize(0x7f080102);
        c = new ejr(view.getResources().getDimensionPixelSize(0x7f0800f8));
        b = cgh1;
    }
}
