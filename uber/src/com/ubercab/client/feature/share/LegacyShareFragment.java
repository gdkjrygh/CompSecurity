// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.RiderGridView;
import com.ubercab.client.feature.share.wechat.ShareActivity;
import cwm;
import cxk;
import czb;
import czj;
import dar;
import dbf;
import dbj;
import dbk;
import dfp;
import djb;
import dul;
import fhi;
import fhj;
import fhs;
import fhu;
import gmg;
import l;
import n;

public class LegacyShareFragment extends czb
    implements android.view.View.OnClickListener
{

    public chp c;
    public gmg d;
    private fhs e;
    private HeaderViewHolder f;
    private FooterViewHolder g;
    private final android.content.ClipboardManager.OnPrimaryClipChangedListener h = new android.content.ClipboardManager.OnPrimaryClipChangedListener() {

        final LegacyShareFragment a;

        public final void onPrimaryClipChanged()
        {
            a.c.a(n.ff);
        }

            
            {
                a = LegacyShareFragment.this;
                super();
            }
    };
    RiderGridView mGridViewIntents;

    public LegacyShareFragment()
    {
    }

    private ClipboardManager a()
    {
        return (ClipboardManager)getActivity().getSystemService("clipboard");
    }

    private static String a(String s, String s1)
    {
        Object obj = null;
        Uri uri;
        try
        {
            uri = Uri.parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s1 = obj;
        if ("https".equals(uri.getScheme()))
        {
            s = Uri.parse(s);
            s1 = uri.buildUpon().appendPath(s.getLastPathSegment()).build().toString();
        }
        return s1;
    }

    private void a(fhu fhu1)
    {
        fhu1.a(this);
    }

    private fhu b(dfp dfp)
    {
        return fhi.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fhu)czj);
    }

    public final cic f()
    {
        return l.gw;
    }

    public void onClick(View view)
    {
        if (view == FooterViewHolder.a(g))
        {
            e.b();
            mGridViewIntents.d(view);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030084, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
        a().removePrimaryClipChangedListener(h);
    }

    public void onItemClickIntentGridView(int i)
    {
        Object obj;
        obj = (LabeledIntent)mGridViewIntents.getItemAtPosition(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ((LabeledIntent) (obj)).setFlags(0x10000000);
        startActivity(new Intent(((Intent) (obj))));
        obj = ((LabeledIntent) (obj)).getNonLocalizedLabel();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = "Unknown";
_L1:
        try
        {
            obj = AnalyticsEvent.create("tap").setName(n.fr).setValue(((String) (obj)));
            c.a(((AnalyticsEvent) (obj)));
            return;
        }
        catch (SecurityException securityexception) { }
        catch (ActivityNotFoundException activitynotfoundexception) { }
        break MISSING_BLOCK_LABEL_83;
        obj = ((CharSequence) (obj)).toString();
          goto _L1
        cwm.a(getActivity(), getString(0x7f070224));
        return;
    }

    public void onPingEvent(dar dar1)
    {
        dar1 = dar1.a();
        if (dul.a(dar1))
        {
            Client client = dar1.getClient();
            f.a(client);
            if (e == null)
            {
                dar1 = getString(0x7f07040b, new Object[] {
                    client.getPromotion()
                });
                String s1 = client.getReferralUrl();
                String s = getString(0x7f070406, new Object[] {
                    client.getReferralCode(), client.getPromotion(), s1
                });
                e = new fhs(getActivity(), dar1, s, client.getMobileCountryIso2());
                if (d.a(dbf.bj, dbj.a))
                {
                    dar1 = s;
                    if (d.a(dbf.bk, dbk.a))
                    {
                        s1 = a(s1, d.b(dbf.bk, "url"));
                        dar1 = s;
                        if (!TextUtils.isEmpty(s1))
                        {
                            dar1 = getString(0x7f070406, new Object[] {
                                client.getReferralCode(), client.getPromotion(), s1
                            });
                        }
                    }
                    dar1 = ShareActivity.a(getActivity(), dar1, cxk.b);
                    if (dar1 != null)
                    {
                        e.a(dar1);
                    }
                }
                mGridViewIntents.setAdapter(e);
                if (e.c() <= e.a() && mGridViewIntents.a() > 0)
                {
                    mGridViewIntents.d(FooterViewHolder.a(g));
                    return;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = LayoutInflater.from(view.getContext());
        bundle = view.inflate(0x7f030086, mGridViewIntents, false);
        f = new HeaderViewHolder(bundle);
        mGridViewIntents.a(bundle, false);
        view = view.inflate(0x7f030085, mGridViewIntents, false);
        g = new FooterViewHolder(view, this);
        mGridViewIntents.b(view, false);
        a().addPrimaryClipChangedListener(h);
    }

    private class FooterViewHolder
    {

        private View a;
        TextView mTextViewSeeMore;

        static View a(FooterViewHolder footerviewholder)
        {
            return footerviewholder.a;
        }

        public FooterViewHolder(View view, android.view.View.OnClickListener onclicklistener)
        {
            a = view;
            ButterKnife.inject(this, view);
            mTextViewSeeMore.setText(view.getContext().getString(0x7f0703d2));
            view.setOnClickListener(onclicklistener);
        }
    }


    private class HeaderViewHolder
    {

        private final Context a;
        TextView mTextViewCode;
        TextView mTextViewDescription;

        public final void a(Client client)
        {
            String s = client.getReferralCode();
            client = client.getPromotion();
            if (s == null || client == null)
            {
                return;
            } else
            {
                mTextViewCode.setText(s.toUpperCase());
                (new SpannableString(client)).setSpan(new StyleSpan(1), 0, client.length(), 18);
                client = a.getString(0x7f0703f2, new Object[] {
                    client
                });
                mTextViewDescription.setText(client);
                return;
            }
        }

        public HeaderViewHolder(View view)
        {
            ButterKnife.inject(this, view);
            a = view.getContext();
        }
    }

}
