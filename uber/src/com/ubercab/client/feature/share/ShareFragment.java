// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cgh;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.model.InvitationsResponse;
import com.ubercab.client.core.model.Invite;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.rider.realtime.model.Client;
import czb;
import czf;
import czj;
import dbf;
import dfp;
import djb;
import dkc;
import dma;
import dpg;
import fhq;
import fhr;
import fie;
import fif;
import fih;
import gmg;
import hku;
import ica;
import icl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.share:
//            InviteAdapter

public class ShareFragment extends czb
{

    public chp c;
    public hku d;
    public gmg e;
    public dkc f;
    public cgh g;
    public dpg h;
    public czf i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    ListView mListViewInvites;
    private HeaderViewHolder n;
    private List o;
    private icl p;
    private View q;
    private final Handler r = new Handler();
    private final Runnable s = new Runnable() {

        final ShareFragment a;

        public final void run()
        {
            a.f.a();
        }

            
            {
                a = ShareFragment.this;
                super();
            }
    };

    public ShareFragment()
    {
    }

    private View a()
    {
        View view = new View(getActivity());
        view.setMinimumHeight((int)getResources().getDimension(0x7f0800cd));
        return view;
    }

    public static HeaderViewHolder a(ShareFragment sharefragment)
    {
        return sharefragment.n;
    }

    public static String a(ShareFragment sharefragment, String s1)
    {
        sharefragment.k = s1;
        return s1;
    }

    static List a(List list)
    {
        return b(list);
    }

    private void a(fif fif1)
    {
        fif1.a(this);
    }

    static View b(ShareFragment sharefragment)
    {
        return sharefragment.q;
    }

    private fif b(dfp dfp)
    {
        return fhq.a().a(new djb(this)).a(dfp).a();
    }

    public static String b(ShareFragment sharefragment, String s1)
    {
        sharefragment.l = s1;
        return s1;
    }

    private static List b(List list)
    {
        if (list == null)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((Invite)list.next()).getEmail())) { }
        return arraylist;
    }

    static String c(ShareFragment sharefragment)
    {
        return sharefragment.l;
    }

    public static String c(ShareFragment sharefragment, String s1)
    {
        sharefragment.m = s1;
        return s1;
    }

    static String d(ShareFragment sharefragment)
    {
        return sharefragment.k;
    }

    static String e(ShareFragment sharefragment)
    {
        return sharefragment.m;
    }

    static List f(ShareFragment sharefragment)
    {
        return sharefragment.o;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fif)czj);
    }

    public final cic f()
    {
        return l.gw;
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        if (!h.n())
        {
            if ((clientevent = clientevent.getClient()) != null)
            {
                k = clientevent.getReferralCode();
                l = clientevent.getPromotion();
                m = clientevent.getReferralUrl();
                HeaderViewHolder.a(n);
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f030175, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        bundle = layoutinflater.inflate(0x7f030177, mListViewInvites, false);
        n = new HeaderViewHolder(bundle);
        mListViewInvites.addHeaderView(bundle);
        q = layoutinflater.inflate(0x7f030176, mListViewInvites, false);
        mListViewInvites.setAdapter(new InviteAdapter(getActivity(), g, new ArrayList(0)));
        r.post(new Runnable() {

            final ShareFragment a;

            public final void run()
            {
                if (a.isAdded())
                {
                    ShareFragment.a(a).a(false);
                }
            }

            
            {
                a = ShareFragment.this;
                super();
            }
        });
        if (i.z() || !e.b(dbf.cJ))
        {
            f.a();
        }
        return viewgroup;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onInvitesLoaded(dma dma1)
    {
        if (dma1.i() && dma1.g() != null)
        {
            o = ((InvitationsResponse)dma1.g()).getInvites();
            if (!o.isEmpty())
            {
                mListViewInvites.setAdapter(null);
                dma1 = new InviteAdapter(getActivity(), g, o);
                int i1 = dma1.getCount();
                AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.gE).setValue((new StringBuilder()).append(i1).append(",").append(o.size()).toString());
                c.a(analyticsevent);
                if (i1 != 0)
                {
                    if (!j)
                    {
                        j = true;
                        mListViewInvites.addHeaderView(q, null, false);
                        mListViewInvites.addFooterView(a());
                        n.a(true);
                        mListViewInvites.setVerticalScrollBarEnabled(true);
                    }
                    mListViewInvites.setAdapter(dma1);
                    return;
                }
            }
        }
    }

    public void onOpenChooserEvent(fih fih)
    {
        HeaderViewHolder.b(n);
    }

    public void onPause()
    {
        r.removeCallbacks(s);
        super.onPause();
        p.b();
    }

    public void onResume()
    {
        super.onResume();
        if (f.b())
        {
            mListViewInvites.smoothScrollToPositionFromTop(0, 0, 750);
            r.postDelayed(s, 750L);
        }
        p = d.d().c(new fie(this, (byte)0));
    }

    private class HeaderViewHolder
    {

        final ShareFragment a;
        private final View b;
        TextView mTextViewCode;
        TextView mTextViewPromoMessage;

        private void a()
        {
            String s1 = a.getString(0x7f07040b, new Object[] {
                ShareFragment.c(a)
            });
            String s2 = a.getString(0x7f070406, new Object[] {
                ShareFragment.d(a), ShareFragment.c(a), ShareFragment.e(a)
            });
            fic fic1 = new fic(a.getActivity());
            if (a.i.z() || !a.e.b(dbf.cJ))
            {
                fic1.a(s1, s2, ShareFragment.a(ShareFragment.f(a)));
            }
            if (a.e.a(dbf.bj, dbj.a))
            {
                fic1.a(ShareActivity.a(a.getActivity(), s2, cxk.b));
            }
            fic1.d(s2).c(s2).a(s1, s2).e(s2).b(a.getString(0x7f0703ea)).a(ShareFragment.d(a)).a();
        }

        public static void a(HeaderViewHolder headerviewholder)
        {
            headerviewholder.b();
        }

        private void b()
        {
            mTextViewCode.setText(ShareFragment.d(a));
            c();
        }

        static void b(HeaderViewHolder headerviewholder)
        {
            headerviewholder.a();
        }

        static View c(HeaderViewHolder headerviewholder)
        {
            return headerviewholder.b;
        }

        private void c()
        {
            Object obj = new ClickableSpan() {

                final HeaderViewHolder a;

                public final void onClick(View view)
                {
                    dtp.a((RiderActivity)a.a.getActivity(), 0, null, a.a.getString(0x7f070407, new Object[] {
                        ShareFragment.c(a.a)
                    }), a.a.getString(0x7f07009a).toUpperCase());
                }

                public final void updateDrawState(TextPaint textpaint)
                {
                    super.updateDrawState(textpaint);
                    textpaint.setUnderlineText(false);
                }

                
                {
                    a = HeaderViewHolder.this;
                    super();
                }
            };
            SpannableString spannablestring = new SpannableString(a.getString(0x7f0703f3));
            spannablestring.setSpan(obj, 0, spannablestring.length(), 33);
            spannablestring.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f0d00bc)), 0, spannablestring.length(), 33);
            obj = new SpannableStringBuilder(a.getString(0x7f0703f2, new Object[] {
                ShareFragment.c(a)
            }));
            ((SpannableStringBuilder) (obj)).append(" ");
            ((SpannableStringBuilder) (obj)).append(spannablestring);
            mTextViewPromoMessage.setHighlightColor(0);
            mTextViewPromoMessage.setText(((CharSequence) (obj)));
            mTextViewPromoMessage.setMovementMethod(LinkMovementMethod.getInstance());
        }

        final void a(boolean flag)
        {
            int i1 = cwm.b(a.getActivity());
            i1 = cwu.a(a.getActivity()) - i1;
            android.view.ViewGroup.LayoutParams layoutparams = b.getLayoutParams();
            if (!flag)
            {
                layoutparams.height = i1;
                b.setLayoutParams(layoutparams);
                return;
            } else
            {
                Object obj = ShareFragment.b(a).getLayoutParams();
                obj.height = -2;
                ShareFragment.b(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                int j1 = (int)a.getResources().getDimension(0x7f08020f);
                obj = ValueAnimator.ofInt(new int[] {
                    b.getMeasuredHeight(), i1 - j1
                });
                ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final HeaderViewHolder a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        android.view.ViewGroup.LayoutParams layoutparams1 = HeaderViewHolder.c(a).getLayoutParams();
                        layoutparams1.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
                        HeaderViewHolder.c(a).setLayoutParams(layoutparams1);
                    }

                
                {
                    a = HeaderViewHolder.this;
                    super();
                }
                });
                ((ValueAnimator) (obj)).setDuration(750L);
                ((ValueAnimator) (obj)).start();
                return;
            }
        }

        void onClickCode()
        {
            a.c.a(n.ff);
            ((ClipboardManager)a.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a.getString(0x7f0703ef), mTextViewCode.getText()));
            Toast toast = Toast.makeText(a.getActivity(), a.getString(0x7f0703f0), 0);
            toast.setGravity(17, 0, 0);
            toast.show();
        }

        void onClickInvite()
        {
            a.c.a(n.fp);
            a();
        }

        HeaderViewHolder(View view)
        {
            a = ShareFragment.this;
            super();
            b = view;
            ButterKnife.inject(this, view);
        }
    }

}
