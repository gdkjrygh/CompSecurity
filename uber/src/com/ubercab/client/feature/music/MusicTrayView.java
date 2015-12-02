// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Track;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.rider.realtime.model.Client;
import czf;
import dbf;
import dfp;
import dkv;
import dno;
import dnp;
import dqt;
import eiv;
import eje;
import ejt;
import ejv;
import ejw;
import ejx;
import eka;
import ekb;
import ekd;
import ekg;
import ekj;
import ekn;
import eko;
import fte;
import fzc;
import gmg;
import hkr;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l;
import n;

public class MusicTrayView extends LinearLayout
{

    public chp a;
    public dqt b;
    public cev c;
    public hkr d;
    public gmg e;
    public czf f;
    public fte g;
    public dkv h;
    private final Drawable i;
    private final Drawable j;
    private final Drawable k;
    private Integer l;
    private boolean m;
    ImageView mImageViewPlayback;
    ImageView mImageViewPlaybackSpinner;
    ViewGroup mImageViewPlaybackSpinnerContainer;
    ImageView mImageViewRight;
    TextView mTextViewAttribution;
    TextView mTextViewTray;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    public MusicTrayView(Context context)
    {
        this(context, null);
    }

    public MusicTrayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MusicTrayView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
        context = getResources();
        i = context.getDrawable(0x7f02022a);
        j = context.getDrawable(0x7f02022b);
        k = context.getDrawable(0x7f02022c);
    }

    private void a()
    {
        Animation animation = mImageViewPlaybackSpinner.getAnimation();
        if (animation != null)
        {
            animation.cancel();
        }
        mImageViewPlaybackSpinnerContainer.setVisibility(8);
    }

    private void a(String s)
    {
        mTextViewTray.setLines(1);
        mTextViewTray.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mTextViewTray.setText(s);
    }

    private void a(String s, int i1)
    {
        l = Integer.valueOf(i1);
        if (!e.a(dbf.bo))
        {
            r = true;
            mTextViewTray.setLines(2);
            mTextViewTray.setEllipsize(null);
            mTextViewTray.setText(s);
            a();
            mTextViewAttribution.setVisibility(8);
            mImageViewRight.setVisibility(8);
        }
        if (l.intValue() == 403)
        {
            a.a(l.db);
            return;
        } else
        {
            a();
            return;
        }
    }

    private void a(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        r = true;
        p = flag;
        mImageViewPlayback.setEnabled(true);
        mImageViewPlayback.setVisibility(0);
        a(q, p);
        if (!e.a(dbf.bo))
        {
            mTextViewAttribution.setVisibility(0);
        }
        a(s);
        mImageViewRight.setVisibility(8);
    }

    private void a(boolean flag, boolean flag1)
    {
        if (!o)
        {
            return;
        }
        Drawable drawable = k;
        if (flag)
        {
            if (flag1)
            {
                drawable = i;
            } else
            {
                drawable = j;
            }
        }
        mImageViewPlayback.setImageDrawable(drawable);
        mImageViewPlayback.setEnabled(flag);
    }

    private static boolean a(Client client, TunesProvider tunesprovider, gmg gmg1)
    {
        if (client != null && !TextUtils.isEmpty(client.getUuid()))
        {
            if ((client = client.getThirdPartyIdentities()) != null)
            {
                if (tunesprovider != null && gmg1 != null && gmg1.a(dbf.bo))
                {
                    return client.containsKey(tunesprovider.getId());
                } else
                {
                    return client.containsKey("spotify");
                }
            }
        }
        return false;
    }

    public final void a(Client client, int i1)
    {
        boolean flag;
        if (i1 == 7 && l == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        if (e.a(dbf.bo))
        {
            if (a(client, eko.a(), e) || a(client, ekn.b(), e))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = a(client, null, null);
        }
        if (!n)
        {
            n = true;
            if (!flag)
            {
                a.a(l.cY);
            } else
            {
                a.a(l.cZ);
            }
        }
        m = flag;
        if (!r && o)
        {
            mTextViewAttribution.setVisibility(8);
            mImageViewPlayback.setEnabled(false);
            mImageViewPlayback.setVisibility(4);
            client = getContext();
            if (m)
            {
                if (!e.a(dbf.bo))
                {
                    mTextViewAttribution.setVisibility(0);
                }
                mImageViewPlayback.setVisibility(0);
                mImageViewRight.setVisibility(8);
                a(client.getString(0x7f070098));
            } else
            {
                mTextViewAttribution.setVisibility(8);
                mImageViewRight.setVisibility(8);
                if (e.a(dbf.bo))
                {
                    a(client.getString(0x7f0700a5));
                } else
                {
                    a(client.getString(0x7f0700a6, new Object[] {
                        "Spotify"
                    }));
                }
            }
            a();
        } else
        if (r && o)
        {
            a(q, p);
            a();
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Animation animation = AnimationUtils.loadAnimation(mImageViewPlaybackSpinner.getContext(), 0x7f04000f);
        mImageViewPlaybackSpinner.setLayerType(2, null);
        mImageViewPlaybackSpinner.startAnimation(animation);
        c.a(this);
    }

    void onClickMusicTray()
    {
        n n1;
        chp chp1;
        boolean flag;
        if (g.g() < 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        chp1 = a;
        if (flag)
        {
            n1 = n.bp;
        } else
        {
            n1 = n.bm;
        }
        chp1.a(n1);
        if (l != null && l.intValue() == 403)
        {
            a.a(n.bk);
        } else
        if (l == null)
        {
            f.n(true);
            if (e.a(dbf.bo))
            {
                List list = Arrays.asList(new TunesProvider[] {
                    ekn.b(), eko.a()
                });
                TunesProvider tunesprovider1;
                for (Iterator iterator = list.iterator(); iterator.hasNext(); tunesprovider1.setLinked(Boolean.valueOf(a(d.c(), tunesprovider1, e))))
                {
                    tunesprovider1 = (TunesProvider)iterator.next();
                }

                c.c(new eje(list));
                return;
            }
            if (!m)
            {
                a.a(n.bi);
                TunesProvider tunesprovider = TunesProvider.create("spotify", "Spotify");
                c.c(new ejt(tunesprovider));
                return;
            }
            if (!TextUtils.isEmpty(h.a()))
            {
                c.c(new ejv("spotify", h.a()));
                return;
            } else
            {
                a.a(n.bj);
                c.c(new ekd(TunesProvider.create("spotify", "Spotify")));
                return;
            }
        }
    }

    void onClickPlayback()
    {
        if (!o)
        {
            return;
        }
        Object obj;
        chp chp1;
        int i1;
        boolean flag;
        if (!p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        a(q, p);
        obj = c;
        if (p)
        {
            i1 = ejx.c;
        } else
        {
            i1 = ejx.b;
        }
        ((cev) (obj)).c(new ejw(i1));
        chp1 = a;
        if (p)
        {
            obj = n.bo;
        } else
        {
            obj = n.bn;
        }
        chp1.a(((cif) (obj)));
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.b(this);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        if (!isInEditMode())
        {
            g.d();
        }
        if (e.a(dbf.bo))
        {
            mTextViewAttribution.setVisibility(8);
            return;
        } else
        {
            android.text.SpannableString spannablestring = eiv.a(getResources());
            mTextViewAttribution.setText(spannablestring, android.widget.TextView.BufferType.SPANNABLE);
            return;
        }
    }

    public void onMusicStateUpdateEvent(eka eka1)
    {
        a(eka1.b(), eka1.d());
    }

    public void onNoMusicAccountConnectedEvent(ekb ekb)
    {
        o = true;
    }

    public void onPlaylistsEvent(ekg ekg1)
    {
        if (!ekg1.a().isEmpty())
        {
            o = true;
        }
    }

    public void onTrackClickEvent(ekj ekj1)
    {
        ekj1 = ekj1.b();
        if (ekj1 != null)
        {
            a(ekj1.getName(), p);
        }
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        if (fzc1.b() == 0)
        {
            o = false;
        }
    }

    public void onTunesHandshakeResponseEvent(dno dno1)
    {
        if (!dno1.i())
        {
            a(dno1.a(), dno1.n());
        }
    }

    public void onTunesProviderResponseEvent(dnp dnp1)
    {
        o = true;
        if (dnp1.i())
        {
            l = null;
            if (!TextUtils.isEmpty(((TunesProvider)dnp1.g()).getEligibleTrial()))
            {
                a.a(l.da);
            }
            return;
        } else
        {
            a(dnp1.a(), dnp1.n());
            return;
        }
    }
}
