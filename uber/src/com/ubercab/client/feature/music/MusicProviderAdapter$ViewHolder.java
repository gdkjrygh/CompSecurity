// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.core.model.TunesProvider;
import ejb;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderAdapter

class b
{

    final MusicProviderAdapter a;
    private TunesProvider b;
    ImageView mConnectedIcon;
    TextView mTextViewStatus;

    final void a(TunesProvider tunesprovider)
    {
        b = tunesprovider;
        String s = b.getName();
        mTextViewStatus.setText(s);
        Context context = mTextViewStatus.getContext();
        boolean flag;
        if (b.getLinked() != null && b.getLinked().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s = context.getString(0x7f070035, new Object[] {
                s
            });
            mConnectedIcon.setImageResource(tunesprovider.getIconResourceId());
            tunesprovider = s;
        } else
        {
            s = context.getString(0x7f0700a1, new Object[] {
                s
            });
            mConnectedIcon.setImageResource(tunesprovider.getIconResourceId(true));
            tunesprovider = s;
        }
        mTextViewStatus.setText(tunesprovider);
        mTextViewStatus.setSelected(flag);
    }

    public void onClickProvider()
    {
        MusicProviderAdapter.a(a).c(new ejb(b));
    }

    (MusicProviderAdapter musicprovideradapter, TunesProvider tunesprovider, View view)
    {
        a = musicprovideradapter;
        super();
        b = tunesprovider;
        ButterKnife.inject(this, view);
        a(b);
    }
}
