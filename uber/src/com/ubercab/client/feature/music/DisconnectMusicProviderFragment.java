// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.ui.Button;
import czb;
import czj;
import dfp;
import djb;
import egj;
import egk;
import eht;
import ehu;

public class DisconnectMusicProviderFragment extends czb
{

    public cev c;
    Button mButtonDisconnect;
    ImageView mIconContainer;
    TextView mTextViewName;

    public DisconnectMusicProviderFragment()
    {
    }

    static DisconnectMusicProviderFragment a(TunesProvider tunesprovider)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.MUSIC_PROVIDER", tunesprovider);
        tunesprovider = new DisconnectMusicProviderFragment();
        tunesprovider.setArguments(bundle);
        return tunesprovider;
    }

    private void a(ehu ehu1)
    {
        ehu1.a(this);
    }

    private ehu b(dfp dfp)
    {
        return egj.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ehu)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickDisconnect()
    {
        c.c(new eht());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b0, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getArguments();
        if (view != null)
        {
            view = (TunesProvider)view.getParcelable("com.ubercab.MUSIC_PROVIDER");
            bundle = view.getName();
            mButtonDisconnect.setText(getString(0x7f0701e3, new Object[] {
                bundle
            }));
            mIconContainer.setImageResource(view.getIconResourceId());
            mTextViewName.setText(bundle);
        }
    }
}
