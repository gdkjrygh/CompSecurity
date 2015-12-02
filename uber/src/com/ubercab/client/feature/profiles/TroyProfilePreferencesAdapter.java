// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cev;
import com.ubercab.ui.TextView;
import ezh;
import ezi;
import gjy;
import gka;
import gki;
import java.util.List;

public final class TroyProfilePreferencesAdapter extends BaseAdapter
{

    private final cev a;
    private final LayoutInflater b;
    private final List c;

    public TroyProfilePreferencesAdapter(Context context, List list, cev cev)
    {
        b = LayoutInflater.from(context);
        c = list;
        a = cev;
    }

    static cev a(TroyProfilePreferencesAdapter troyprofilepreferencesadapter)
    {
        return troyprofilepreferencesadapter.a;
    }

    private ezh a(int i)
    {
        return (ezh)c.get(i);
    }

    public final ezh a(ezi ezi)
    {
        return (ezh)gki.d(c, new gka(ezi) {

            final ezi a;
            final TroyProfilePreferencesAdapter b;

            private boolean a(ezh ezh1)
            {
                return ezh1.a() == a;
            }

            public final boolean apply(Object obj)
            {
                return a((ezh)obj);
            }

            
            {
                b = TroyProfilePreferencesAdapter.this;
                a = ezi;
                super();
            }
        }).d();
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        ezh ezh1 = a(i);
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f030142, viewgroup, false);
            view = new ViewHolder(view1);
            view1.setTag(view);
            view.mTextViewTitle = (TextView)view1.findViewById(0x7f0e03b0);
            view.mTextViewSubtitle = (TextView)view1.findViewById(0x7f0e03b1);
        }
        ((ViewHolder)view1.getTag()).a(ezh1);
        return view1;
    }

    private class ViewHolder
    {

        final TroyProfilePreferencesAdapter a;
        private final View b;
        private ezi c;
        private boolean d;
        private boolean e;
        ImageView mEditImageView;
        SwitchCompat mSwitch;
        TextView mTextViewSubtitle;
        TextView mTextViewTitle;

        private void a(boolean flag)
        {
            d = flag;
        }

        private void b(boolean flag)
        {
            e = flag;
            b.setEnabled(flag);
        }

        final void a(ezh ezh1)
        {
            c = ezh1.a();
            mTextViewTitle.setText(ezh1.c());
            if (ezh1.e())
            {
                mSwitch.setVisibility(0);
                a(false);
                mSwitch.setChecked(ezh1.f());
                a(true);
            } else
            {
                mSwitch.setVisibility(8);
            }
            if (ezh1.d())
            {
                mEditImageView.setVisibility(0);
            } else
            {
                mEditImageView.setVisibility(8);
            }
            if (TextUtils.isEmpty(ezh1.b()))
            {
                mTextViewSubtitle.setVisibility(8);
            } else
            {
                mTextViewSubtitle.setVisibility(0);
                mTextViewSubtitle.setText(ezh1.b());
            }
            b(ezh1.d());
        }

        void onSwitchChecked(boolean flag)
        {
            if (d)
            {
                ezq ezq1 = new ezq(c);
                ezq1.a(flag);
                TroyProfilePreferencesAdapter.a(a).c(ezq1);
            }
        }

        void onViewGroupClick()
        {
            if (e)
            {
                TroyProfilePreferencesAdapter.a(a).c(new ezq(c));
            }
        }

        ViewHolder(View view)
        {
            a = TroyProfilePreferencesAdapter.this;
            super();
            ButterKnife.inject(this, view);
            b = view;
        }
    }

}
