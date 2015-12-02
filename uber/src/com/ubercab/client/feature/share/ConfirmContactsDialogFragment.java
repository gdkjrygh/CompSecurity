// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;
import java.util.Locale;

public class ConfirmContactsDialogFragment extends DialogFragment
{

    public ConfirmContactsDialogFragment()
    {
    }

    private void a(int i)
    {
        RiderActivity rideractivity = (RiderActivity)getActivity();
        if (rideractivity != null)
        {
            rideractivity.a(1, i, null);
        }
        dismiss();
    }

    public static void a(RiderActivity rideractivity)
    {
        (new ConfirmContactsDialogFragment()).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/share/ConfirmContactsDialogFragment.getName());
    }

    public void onClickAccept()
    {
        a(-1);
    }

    public void onClickCancel()
    {
        a(0);
    }

    public void onClickLearnMore()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://get.uber.com/tos_for_sharing_contacts?lang=%s", new Object[] {
            Locale.getDefault().getLanguage()
        }))));
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        android.view.View view = getActivity().getLayoutInflater().inflate(0x7f030174, null);
        ButterKnife.inject(this, view);
        bundle.setView(view);
        return bundle.create();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
