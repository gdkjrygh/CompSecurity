// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.ui.RiderGridView;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import com.ubercab.rider.realtime.model.ProfileThemeOption;
import com.ubercab.ui.EditText;
import com.ubercab.ui.FloatingLabelEditText;
import cwz;
import czb;
import czj;
import dfp;
import djb;
import dtu;
import dum;
import exj;
import exk;
import eyb;
import eyc;
import eyy;
import ezc;
import ezk;
import ezl;
import java.util.List;
import n;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeColorAdapter, BadgeView

public class EditBadgeFragment extends czb
    implements android.view.View.OnClickListener
{

    public chp c;
    public cev d;
    public cgh e;
    public eyy f;
    private EditBadgeColorAdapter g;
    private String h;
    private int i;
    private View j;
    private Profile k;
    private int l;
    private ProfileThemeOption m;
    RiderGridView mColorGridView;
    LinearLayout mGrabFocusLayout;
    GridLayout mIconGridLayout;
    FrameLayout mInitialsContainer;
    EditText mInitialsEditText;
    FloatingLabelEditText mProfileName;

    public EditBadgeFragment()
    {
    }

    static EditBadgeColorAdapter a(EditBadgeFragment editbadgefragment)
    {
        return editbadgefragment.g;
    }

    static EditBadgeFragment a(Profile profile)
    {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TROY_PROFILE_UUID", profile.getUuid());
        profile = new EditBadgeFragment();
        profile.setArguments(bundle);
        return profile;
    }

    private void a()
    {
        a(j, false);
        j = null;
    }

    private void a(View view)
    {
        view.clearFocus();
        mGrabFocusLayout.requestFocus();
        cwz.b(getActivity(), view);
    }

    private void a(View view, String s)
    {
        a(j, false);
        a(view, true);
        j = view;
        b();
        g.a(s);
    }

    private void a(View view, boolean flag)
    {
        if (view != null)
        {
            BadgeView badgeview = (BadgeView)view.findViewById(0x7f0e0105);
            int i1;
            if (flag)
            {
                i1 = 0xff000000;
            } else
            {
                i1 = i;
            }
            badgeview.a(i1);
            view.setSelected(flag);
        }
    }

    static void a(EditBadgeFragment editbadgefragment, View view)
    {
        editbadgefragment.a(view);
    }

    public static void a(EditBadgeFragment editbadgefragment, View view, String s)
    {
        editbadgefragment.a(view, s);
    }

    private void a(eyb eyb1)
    {
        eyb1.a(this);
    }

    private eyb b(dfp dfp)
    {
        return exj.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        mInitialsContainer.setSelected(false);
        cwz.b(getActivity(), mInitialsEditText);
    }

    static void b(EditBadgeFragment editbadgefragment)
    {
        editbadgefragment.g();
    }

    static void c(EditBadgeFragment editbadgefragment)
    {
        editbadgefragment.j();
    }

    public static int d(EditBadgeFragment editbadgefragment)
    {
        return editbadgefragment.i;
    }

    public static String e(EditBadgeFragment editbadgefragment)
    {
        return editbadgefragment.h;
    }

    private void g()
    {
        String s;
        if (mProfileName.i() == null)
        {
            s = "";
        } else
        {
            s = mProfileName.i().toString();
        }
        if (mInitialsContainer.isSelected())
        {
            d.c(new ezl(s, l, null, mInitialsEditText.getText().toString()));
        } else
        {
            if (g.a() != null)
            {
                d.c(new ezl(s, l, g.a(), null));
                return;
            }
            String s1 = dtu.a(l);
            if (!TextUtils.isEmpty(s1) && k.getThemeFromChildAttributes() != null && s1.equals(k.getThemeFromChildAttributes().getColor()))
            {
                d.c(new ezl(s, l, k.getThemeFromChildAttributes().getIcon(), null));
                return;
            }
        }
    }

    private void h()
    {
        String s = dum.a(k, getActivity());
        mProfileName.d(s);
        mProfileName.b(s.length());
    }

    private void i()
    {
        g = new EditBadgeColorAdapter(getActivity(), m.getIntColors(), k, e, d);
        mColorGridView.setAdapter(g);
    }

    private void j()
    {
        int l1 = getResources().getInteger(0x7f0b0018);
        int i2 = getResources().getInteger(0x7f0b0016);
        int k1 = mIconGridLayout.getMeasuredWidth() / l1;
        List list = m.getIcons();
        int j2 = (int)Math.ceil((double)(list.size() + i2) / (double)l1);
        mIconGridLayout.setColumnCount(l1);
        mIconGridLayout.setRowCount(j2);
        eyc eyc1 = new eyc(this, getActivity(), list);
        android.widget.GridLayout.LayoutParams layoutparams1 = (android.widget.GridLayout.LayoutParams)mIconGridLayout.getChildAt(0).getLayoutParams();
        layoutparams1.width = k1 * 2;
        layoutparams1.height = k1 * 2;
        layoutparams1.columnSpec = GridLayout.spec(0, i2 / 2);
        layoutparams1.rowSpec = GridLayout.spec(0, i2 / 2);
        for (int i1 = 0; i1 < eyc1.getCount(); i1++)
        {
            android.widget.GridLayout.LayoutParams layoutparams2 = new android.widget.GridLayout.LayoutParams();
            layoutparams2.width = k1;
            layoutparams2.height = k1;
            layoutparams2.setGravity(17);
            View view1 = eyc1.getView(i1, null, null);
            view1.setOnClickListener(this);
            mIconGridLayout.addView(view1, layoutparams2);
        }

        int j1 = j2 * l1 - i2 - list.size();
        if (j1 > 0)
        {
            View view = LayoutInflater.from(getActivity()).inflate(0x7f030058, null, false);
            android.widget.GridLayout.LayoutParams layoutparams = new android.widget.GridLayout.LayoutParams();
            layoutparams.columnSpec = GridLayout.spec(0x80000000, j1);
            layoutparams.height = k1;
            layoutparams.width = j1 * k1;
            mIconGridLayout.addView(view, layoutparams);
        }
    }

    private void k()
    {
        mInitialsContainer.setSelected(true);
        mInitialsEditText.setSelection(mInitialsEditText.getText().length());
        a();
        g.b(mInitialsEditText.getText().toString());
        g();
    }

    private void l()
    {
        String s;
        if (k.getThemeFromChildAttributes() == null)
        {
            s = "";
        } else
        {
            s = k.getThemeFromChildAttributes().getInitials();
        }
        if (!TextUtils.isEmpty(s))
        {
            mInitialsEditText.setText(s);
            onInitialsContainerClick();
        } else
        {
            mInitialsEditText.setText(m.getInitials());
        }
        mIconGridLayout.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final EditBadgeFragment a;

            public final void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
                    int k2, int l2)
            {
                a.mIconGridLayout.removeOnLayoutChangeListener(this);
                EditBadgeFragment.c(a);
            }

            
            {
                a = EditBadgeFragment.this;
                super();
            }
        });
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyb)czj);
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    public void onBadgeColorSelectedEvent(ezk ezk1)
    {
        c.a(n.in);
        l = ezk1.a();
        g.a(l);
        g();
    }

    public void onClick(View view)
    {
        c.a(n.io);
        a(view, (String)view.getTag());
        g();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = f.a(getArguments().getString("EXTRA_TROY_PROFILE_UUID"));
        m = f.b(k);
        ProfileTheme profiletheme = k.getThemeFromChildAttributes();
        if (profiletheme == null)
        {
            bundle = "";
        } else
        {
            bundle = profiletheme.getInitials();
        }
        if (TextUtils.isEmpty(bundle) && profiletheme != null)
        {
            h = profiletheme.getIcon();
        }
        l = ezc.a(getActivity(), k);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030057, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    void onInitialsContainerClick()
    {
        c.a(n.ip);
        cwz.a(getActivity(), mInitialsEditText);
        k();
    }

    void onInitialsEditTextClick()
    {
        c.a(n.iq);
        k();
    }

    void onProfileNameEditTextClick()
    {
        c.a(n.ir);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        i = getResources().getColor(0x7f0d0085);
        mGrabFocusLayout.requestFocus();
        h();
        i();
        l();
        view = new android.widget.TextView.OnEditorActionListener() {

            final EditBadgeFragment a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                EditBadgeFragment.a(a, textview);
                return true;
            }

            
            {
                a = EditBadgeFragment.this;
                super();
            }
        };
        mProfileName.a(view);
        mInitialsEditText.setOnEditorActionListener(view);
        mInitialsEditText.addTextChangedListener(new TextWatcher() {

            final EditBadgeFragment a;

            public final void afterTextChanged(Editable editable)
            {
                EditBadgeFragment.a(a).b(editable.toString());
                EditBadgeFragment.b(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = EditBadgeFragment.this;
                super();
            }
        });
        mProfileName.a(new TextWatcher() {

            final EditBadgeFragment a;

            public final void afterTextChanged(Editable editable)
            {
                EditBadgeFragment.b(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = EditBadgeFragment.this;
                super();
            }
        });
    }
}
