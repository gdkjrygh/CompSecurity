// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.walmart.android.ui.dialog.AlertDialog;
import java.util.regex.Pattern;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ContactAndStoreFragment

public class EnterPhoneDialogFragment extends DialogFragment
{

    private static final String ARGUMENT_PHONE = "phone";

    public EnterPhoneDialogFragment()
    {
    }

    private String asPhone(String s)
    {
        boolean flag;
        if (TextUtils.isEmpty(s) || !s.matches(Patterns.PHONE.pattern()))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        s = s.replaceAll("[\\D]", "");
        if (s.length() == 10)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (s.length() != 11)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        flag = s.startsWith("1");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        return s;
        s;
        return null;
    }

    private void doDismiss()
    {
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public static EnterPhoneDialogFragment newInstance(String s)
    {
        EnterPhoneDialogFragment enterphonedialogfragment = new EnterPhoneDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("phone", s);
        enterphonedialogfragment.setArguments(bundle);
        return enterphonedialogfragment;
    }

    private void onDone()
    {
        if (getDialog() == null)
        {
            return;
        }
        String s = asPhone(String.valueOf(((EditText)getDialog().findViewById(com.walmartlabs.android.photo.R.id.phone)).getText()));
        if (s == null)
        {
            Toast.makeText(getActivity(), getString(com.walmartlabs.android.photo.R.string.photo_please_enter_valid_phone), 0).show();
            return;
        }
        ContactAndStoreFragment contactandstorefragment = (ContactAndStoreFragment)getTargetFragment();
        if (contactandstorefragment != null)
        {
            contactandstorefragment.notifyPhoneUpdated(s);
        }
        doDismiss();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = getArguments().getString("phone");
        bundle = LayoutInflater.from(getActivity()).inflate(com.walmartlabs.android.photo.R.layout.photo_phone_dialog, null);
        EditText edittext = (EditText)bundle.findViewById(com.walmartlabs.android.photo.R.id.phone);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            edittext.setText(((CharSequence) (obj)));
        }
        edittext.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EnterPhoneDialogFragment this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    onDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = EnterPhoneDialogFragment.this;
                super();
            }
        });
        obj = new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity());
        ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(getString(com.walmartlabs.android.photo.R.string.photo_enter_phone_number)).setView(bundle).setPositiveButton(getString(com.walmartlabs.android.photo.R.string.photo_ok), new android.content.DialogInterface.OnClickListener() {

            final EnterPhoneDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = EnterPhoneDialogFragment.this;
                super();
            }
        });
        return ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).create();
    }

    public void onResume()
    {
        super.onResume();
        getDialog().getWindow().setSoftInputMode(5);
        ((AlertDialog)getDialog()).getButton(-1).setOnClickListener(new android.view.View.OnClickListener() {

            final EnterPhoneDialogFragment this$0;

            public void onClick(View view)
            {
                onDone();
            }

            
            {
                this$0 = EnterPhoneDialogFragment.this;
                super();
            }
        });
    }

}
