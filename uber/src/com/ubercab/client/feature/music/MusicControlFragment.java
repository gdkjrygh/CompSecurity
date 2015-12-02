// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import cwm;
import czb;
import czj;
import dbf;
import dfp;
import djb;
import egt;
import egu;
import eik;
import eiv;
import eju;
import ejw;
import ejx;
import eka;
import ekc;
import gmg;
import l;
import n;

public class MusicControlFragment extends czb
{

    public chp c;
    public cev d;
    public gmg e;
    private int f;
    private String g;
    ImageView mButtonNextTrack;
    ImageView mButtonOpenApp;
    ImageView mButtonPlayback;
    ImageView mButtonPreviousTrack;
    ImageView mButtonShuffle;
    TextView mTextViewAttribution;
    TextView mTextViewHint;
    TextView mTextViewTrackname;
    ViewGroup mViewGroupButtons;
    ViewGroup mViewGroupControls;

    public MusicControlFragment()
    {
    }

    private void a()
    {
        if (TextUtils.isEmpty(g))
        {
            mViewGroupControls.setVisibility(8);
            return;
        }
        if (f == 5 || f == 6)
        {
            mViewGroupButtons.setVisibility(8);
            mTextViewHint.setVisibility(0);
            mViewGroupControls.setVisibility(0);
            return;
        }
        if (f == 7)
        {
            mViewGroupButtons.setVisibility(0);
            mTextViewHint.setVisibility(8);
            mViewGroupControls.setVisibility(0);
            return;
        } else
        {
            mViewGroupControls.setVisibility(8);
            return;
        }
    }

    private void a(eik eik1)
    {
        eik1.a(this);
    }

    private eik b(dfp dfp)
    {
        return egt.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    final void a(int i)
    {
        f = i;
        if (f == 7)
        {
            c.a(l.df);
        }
        a();
    }

    public final volatile void a(czj czj)
    {
        a((eik)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ae, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = eiv.a(getResources());
        mTextViewAttribution.setText(viewgroup, android.widget.TextView.BufferType.SPANNABLE);
        return layoutinflater;
    }

    public void onMusicStateUpdateEvent(eka eka1)
    {
        g = eka1.b();
        mTextViewTrackname.setText(g);
        mButtonShuffle.setSelected(eka1.f());
        mButtonPlayback.setSelected(eka1.d());
        if (e.a(dbf.bo))
        {
            mButtonNextTrack.setEnabled(eka1.c());
            mButtonPreviousTrack.setEnabled(eka1.e());
            if ("rdio".equals(eka1.a()))
            {
                mButtonOpenApp.setEnabled(false);
                mButtonOpenApp.setVisibility(4);
                mButtonShuffle.setEnabled(false);
                mButtonShuffle.setVisibility(4);
                mTextViewAttribution.setVisibility(8);
            }
        }
        a();
    }

    public void onNextTrackClicked()
    {
        d.c(new ejw(ejx.a));
        c.a(n.bt);
    }

    public void onOpenAppClick()
    {
        if (cwm.b(mViewGroupButtons.getContext(), "com.spotify.music"))
        {
            d.c(new ekc("com.spotify.music"));
        } else
        {
            d.c(new eju(eiv.a));
        }
        c.a(n.bu);
    }

    public void onPlaybackToggled()
    {
        boolean flag1 = mButtonPlayback.isSelected();
        Object obj = d;
        chp chp1;
        int i;
        boolean flag;
        if (flag1)
        {
            i = ejx.b;
        } else
        {
            i = ejx.c;
        }
        ((cev) (obj)).c(new ejw(i));
        obj = mButtonPlayback;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ImageView) (obj)).setSelected(flag);
        chp1 = c;
        if (flag1)
        {
            obj = n.bv;
        } else
        {
            obj = n.bw;
        }
        chp1.a(((cif) (obj)));
    }

    public void onPrevTrackClicked()
    {
        d.c(new ejw(ejx.d));
        c.a(n.by);
    }

    public void onShuffleClicked()
    {
        d.c(new ejw(ejx.e));
        boolean flag1 = mButtonShuffle.isSelected();
        Object obj = mButtonShuffle;
        chp chp1;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ImageView) (obj)).setSelected(flag);
        chp1 = c;
        if (!flag1)
        {
            obj = n.br;
        } else
        {
            obj = n.bq;
        }
        chp1.a(((cif) (obj)));
    }
}
