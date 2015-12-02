// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.feature.search.LocationSearchEditText;
import com.ubercab.rider.realtime.model.City;
import cwz;
import czb;
import czj;
import dfp;
import djb;
import dkv;
import ehj;
import ehk;
import ejc;
import ejz;
import eke;
import eki;
import hkr;
import hpb;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicSearchAdapter

public class MusicSearchFragment extends czb
{

    public chp c;
    public cev d;
    public hkr e;
    public cgh f;
    public dkv g;
    private MusicSearchAdapter h;
    private TextWatcher i;
    private TunesProvider j;
    ImageButton mClearButton;
    LocationSearchEditText mEditTextSearch;
    ListView mListViewSearchResults;
    ViewGroup mViewGroupContent;

    public MusicSearchFragment()
    {
    }

    public static MusicSearchFragment a(TunesProvider tunesprovider)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.ARG_PROVIDER", tunesprovider);
        tunesprovider = new MusicSearchFragment();
        tunesprovider.setArguments(bundle);
        return tunesprovider;
    }

    private String a()
    {
        return mEditTextSearch.getText().toString().trim();
    }

    static String a(MusicSearchFragment musicsearchfragment)
    {
        return musicsearchfragment.a();
    }

    static void a(MusicSearchFragment musicsearchfragment, String s, boolean flag)
    {
        musicsearchfragment.a(s, flag);
    }

    private void a(ejc ejc1)
    {
        ejc1.a(this);
    }

    private void a(String s, boolean flag)
    {
        if (!b() && !TextUtils.isEmpty(j.getId()) && e.b() != null && !TextUtils.isEmpty(e.b().getCityName()) && !TextUtils.isEmpty(e.b().getCountryIso2()))
        {
            g.b(j.getId(), e.b().getCityName(), e.b().getCountryIso2(), s);
            if (flag)
            {
                cwz.b(getContext(), mEditTextSearch);
                return;
            }
        }
    }

    private ejc b(dfp dfp)
    {
        return ehj.a().a(new djb(this)).a(dfp).a();
    }

    private boolean b()
    {
        return TextUtils.isEmpty(a().trim()) || mEditTextSearch.getTag() != null;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    final void a(int k)
    {
        if (k > 0)
        {
            mClearButton.setVisibility(0);
            mClearButton.setEnabled(true);
            return;
        } else
        {
            mClearButton.setVisibility(8);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((ejc)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClearButtonClick(View view)
    {
        mEditTextSearch.setText("");
        h.a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = (TunesProvider)getArguments().getParcelable("com.ubercab.ARG_PROVIDER");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b1, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onListItemClick(int k)
    {
        c.a(n.bB);
        Playlist playlist = h.a(k);
        d.c(new eki(playlist.getName(), playlist.getPlaybackUri()));
    }

    public void onMusicSearchResponseEvent(ejz ejz1)
    {
        if (ejz1.i() && ejz1.a().equals(a()))
        {
            ejz1 = (Group)ejz1.g();
            if (ejz1 != null)
            {
                ejz1 = ejz1.getPlaylists();
                h.a(ejz1);
            }
        }
    }

    public void onOpenSearchEvent(eke eke)
    {
        if (TextUtils.isEmpty(a()))
        {
            cwz.a(getContext(), mEditTextSearch);
        }
    }

    public void onPause()
    {
        super.onPause();
        cwz.a(getActivity());
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        cwz.b(getContext(), mEditTextSearch);
        return false;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        mViewGroupContent.setVisibility(0);
        h = new MusicSearchAdapter(getContext(), f);
        mListViewSearchResults.setAdapter(h);
        mEditTextSearch.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final MusicSearchFragment a;

            public final boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (k == 3 || flag)
                {
                    cwz.b(a.mEditTextSearch.getContext(), textview);
                    MusicSearchFragment.a(a, MusicSearchFragment.a(a), true);
                    a.c.a(n.bA);
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                a = MusicSearchFragment.this;
                super();
            }
        });
        i = new hpb() {

            final MusicSearchFragment a;

            public final void afterTextChanged(Editable editable)
            {
                if (editable != null && editable.toString().trim().length() >= 3)
                {
                    MusicSearchFragment.a(a, editable.toString().trim(), false);
                }
            }

            public final void onTextChanged(CharSequence charsequence, int k, int l, int i1)
            {
                if (charsequence != null)
                {
                    a.a(charsequence.length());
                }
            }

            
            {
                a = MusicSearchFragment.this;
                super();
            }
        };
        mEditTextSearch.addTextChangedListener(i);
    }
}
