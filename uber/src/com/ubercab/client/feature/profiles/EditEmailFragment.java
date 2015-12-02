// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import com.ubercab.ui.TextView;
import cwz;
import czb;
import czj;
import dfp;
import djb;
import exl;
import exm;
import eye;
import eyy;
import ezn;
import hrs;
import hrx;
import hsj;
import java.util.List;
import n;

public class EditEmailFragment extends czb
{

    public chp c;
    public cev d;
    public eyy e;
    private String f;
    private int g;
    private Profile h;
    FloatingLabelEditText mEmailEditText;
    Button mEmailSaveButton;
    TextView mExplanationTextView;
    TextView mHeaderTextView;

    public EditEmailFragment()
    {
    }

    private static int a(Bundle bundle)
    {
        return bundle.getInt("EXTRA_EDIT_EMAIL_FRAGMENT_MODE");
    }

    public static EditEmailFragment a(Profile profile)
    {
        EditEmailFragment editemailfragment = new EditEmailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UUID", profile.getUuid());
        bundle.putInt("EXTRA_EDIT_EMAIL_FRAGMENT_MODE", 2);
        editemailfragment.setArguments(bundle);
        return editemailfragment;
    }

    public static EditEmailFragment a(String s)
    {
        EditEmailFragment editemailfragment = a(false);
        editemailfragment.getArguments().putString("EXTRA_EDIT_EMAIL_DEFAULT_EMAIL", s);
        return editemailfragment;
    }

    public static EditEmailFragment a(boolean flag)
    {
        EditEmailFragment editemailfragment = new EditEmailFragment();
        Bundle bundle = new Bundle();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bundle.putInt("EXTRA_EDIT_EMAIL_FRAGMENT_MODE", i);
        editemailfragment.setArguments(bundle);
        return editemailfragment;
    }

    private void a()
    {
        Object obj;
        obj = getView();
        mHeaderTextView.setVisibility(0);
        mExplanationTextView.setVisibility(0);
        ((View) (obj)).findViewById(0x7f0e03b7).setVisibility(0);
        obj = "";
        if (g != 1) goto _L2; else goto _L1
_L1:
        obj = getActivity().getString(0x7f070673);
_L4:
        mEmailEditText.c(((CharSequence) (obj)));
        mEmailEditText.a(new TextWatcher() {

            final EditEmailFragment a;

            public final void afterTextChanged(Editable editable)
            {
                Button button = a.mEmailSaveButton;
                boolean flag;
                if (!editable.toString().isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                button.setEnabled(flag);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                a = EditEmailFragment.this;
                super();
            }
        });
        mEmailSaveButton.setText(0x7f0702cc);
        mEmailSaveButton.setEnabled(false);
        return;
_L2:
        if (g == 0)
        {
            obj = getActivity().getString(0x7f070351);
            mHeaderTextView.setText(0x7f07037d);
            mExplanationTextView.setText(0x7f070202);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(eye eye1)
    {
        eye1.a(this);
    }

    private eye b(dfp dfp)
    {
        return exl.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eye)czj);
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            h = e.a(bundle.getString("EXTRA_PROFILE_UUID"));
            f = getArguments().getString("EXTRA_EDIT_EMAIL_DEFAULT_EMAIL", "");
            g = a(bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030143, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    void onSaveButtonClick()
    {
        hrx hrx1 = new hrx(new hrs(0x7f07039f), new hrs(0x7f070287));
        if ((new hsj()).a(mEmailEditText, hrx1).a().isEmpty())
        {
            c.a(n.iV);
            cev cev1 = d;
            String s;
            if (mEmailEditText.i() == null)
            {
                s = "";
            } else
            {
                s = mEmailEditText.i().toString();
            }
            cev1.c(new ezn(s));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        int i;
        if (g == 2)
        {
            d().b().a(0x7f0701f8);
            FloatingLabelEditText floatinglabeledittext = mEmailEditText;
            if (h != null)
            {
                bundle = h.getEmail();
            } else
            {
                bundle = "";
            }
            floatinglabeledittext.d(bundle);
        } else
        if (g == 1 || g == 0)
        {
            mEmailEditText.d(f);
            a();
            if (!TextUtils.isEmpty(f))
            {
                mEmailSaveButton.setEnabled(true);
            }
        }
        bundle = mEmailEditText;
        if (mEmailEditText.i() == null)
        {
            i = 0;
        } else
        {
            i = mEmailEditText.i().length();
        }
        bundle.b(i);
        cwz.a(view.getContext(), mEmailEditText);
        mEmailEditText.a(new android.widget.TextView.OnEditorActionListener() {

            final EditEmailFragment a;

            public final boolean onEditorAction(android.widget.TextView textview, int j, KeyEvent keyevent)
            {
                a.onSaveButtonClick();
                return true;
            }

            
            {
                a = EditEmailFragment.this;
                super();
            }
        });
    }
}
