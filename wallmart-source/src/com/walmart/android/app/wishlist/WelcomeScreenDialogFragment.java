// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;

public class WelcomeScreenDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnDismissListener mDismissListener;

    public WelcomeScreenDialogFragment()
    {
    }

    public static WelcomeScreenDialogFragment newInstance()
    {
        return new WelcomeScreenDialogFragment();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = ViewUtil.inflate(getActivity(), 0x7f0401f8);
        return (new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity())).setView(bundle).setPositiveButton(0x7f090292, null).create();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        SharedPreferencesUtil.setWishListIntroShown(getActivity().getApplicationContext(), true);
    }
}
