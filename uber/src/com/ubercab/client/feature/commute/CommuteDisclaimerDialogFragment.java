// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.commute;

import al;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.commute:
//            CommuteDisclaimerStrings

public class CommuteDisclaimerDialogFragment extends DialogFragment
{

    private static final int a = com/ubercab/client/feature/commute/CommuteDisclaimerDialogFragment.getName().hashCode();
    private String b;
    Button mButtonContinue;
    Button mButtonNotNow;
    TextView mTextViewContent;
    TextView mTextViewLearnMore;
    TextView mTextViewTitle;

    public CommuteDisclaimerDialogFragment()
    {
    }

    private void a()
    {
        Object obj = getArguments();
        if (obj == null || ((Bundle) (obj)).getParcelable("strings_key") == null)
        {
            return;
        }
        Resources resources = getResources();
        CommuteDisclaimerStrings commutedisclaimerstrings = (CommuteDisclaimerStrings)((Bundle) (obj)).getParcelable("strings_key");
        Object obj1 = mTextViewTitle;
        if (TextUtils.isEmpty(commutedisclaimerstrings.f()))
        {
            obj = resources.getString(0x7f070670);
        } else
        {
            obj = commutedisclaimerstrings.f();
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        obj1 = mTextViewContent;
        if (TextUtils.isEmpty(commutedisclaimerstrings.a()))
        {
            obj = resources.getString(0x7f07009c);
        } else
        {
            obj = commutedisclaimerstrings.a();
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        obj1 = mTextViewLearnMore;
        if (TextUtils.isEmpty(commutedisclaimerstrings.c()))
        {
            obj = resources.getString(0x7f070290);
        } else
        {
            obj = commutedisclaimerstrings.c();
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        obj1 = mButtonContinue;
        if (TextUtils.isEmpty(commutedisclaimerstrings.b()))
        {
            obj = resources.getString(0x7f0700b1);
        } else
        {
            obj = commutedisclaimerstrings.b();
        }
        ((Button) (obj1)).setText(((CharSequence) (obj)));
        obj1 = mButtonNotNow;
        if (TextUtils.isEmpty(commutedisclaimerstrings.e()))
        {
            obj = resources.getString(0x7f0702d8);
        } else
        {
            obj = commutedisclaimerstrings.e();
        }
        ((Button) (obj1)).setText(((CharSequence) (obj)));
        b = commutedisclaimerstrings.d();
    }

    private void a(int i)
    {
        RiderActivity rideractivity = (RiderActivity)getActivity();
        if (rideractivity != null)
        {
            rideractivity.a(a, i, null);
        }
        dismiss();
    }

    public void onClickContinue()
    {
        a(-1);
    }

    public void onClickLearnMore()
    {
        if (!TextUtils.isEmpty(b))
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(b)));
        }
    }

    public void onClickNotNow()
    {
        a(0);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new al(getActivity());
        android.view.View view = getActivity().getLayoutInflater().inflate(0x7f030040, null);
        ButterKnife.inject(this, view);
        a();
        bundle.b(view);
        return bundle.b();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

}
