// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.ui.TextView;
import ejb;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderChooserAdapter

class b
{

    final MusicProviderChooserAdapter a;
    private TunesProvider b;
    private final int c;
    ImageView mImageView;
    TextView mTextViewTagLine;

    protected final void a(TunesProvider tunesprovider, Context context)
    {
        b = tunesprovider;
        mTextViewTagLine.setText(b.getTaglineResource());
        int i = context.getResources().getDimensionPixelOffset(b.getLogoDisplayHeightResourceId());
        int j = Math.max(0, c - i);
        mImageView.setMaxHeight(i);
        mImageView.setPadding(mImageView.getPaddingLeft(), j, mImageView.getPaddingRight(), mImageView.getPaddingBottom());
        cgh.a(context).a(b.getLogoResourceId()).a(mImageView);
    }

    protected void onClickProvider()
    {
        MusicProviderChooserAdapter.a(a).c(new ejb(b));
    }

    (MusicProviderChooserAdapter musicproviderchooseradapter, TunesProvider tunesprovider, View view)
    {
        a = musicproviderchooseradapter;
        super();
        b = tunesprovider;
        ButterKnife.inject(this, view);
        musicproviderchooseradapter = view.getContext().getResources();
        int i = musicproviderchooseradapter.getDimensionPixelOffset(0x7f080100);
        c = musicproviderchooseradapter.getDimensionPixelOffset(0x7f0800fe) + i;
        a(b, view.getContext());
    }
}
