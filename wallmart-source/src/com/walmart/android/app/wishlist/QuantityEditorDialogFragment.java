// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import com.walmart.android.wmui.NumberPicker;

public class QuantityEditorDialogFragment extends DialogFragment
{
    public static interface OnNewQuantityListener
    {

        public abstract void onNewQuantity(int i);
    }


    private static final String INITIAL_VALUE_ARG = "current_value";
    private static final String MAX_VALUE_VALUE_ARG = "max_value";
    private static final String MIN_VALUE_VALUE_ARG = "min_value";
    private OnNewQuantityListener mListener;

    public QuantityEditorDialogFragment()
    {
    }

    public static QuantityEditorDialogFragment newInstance(int i, int j, int k)
    {
        Bundle bundle = new Bundle(3);
        bundle.putInt("current_value", i);
        bundle.putInt("min_value", j);
        bundle.putInt("max_value", k);
        QuantityEditorDialogFragment quantityeditordialogfragment = new QuantityEditorDialogFragment();
        quantityeditordialogfragment.setArguments(bundle);
        return quantityeditordialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreateDialog(bundle);
        bundle = getActivity();
        final int initialValue = getArguments().getInt("current_value");
        int i = getArguments().getInt("min_value");
        int j = Math.max(getArguments().getInt("max_value"), initialValue);
        View view = LayoutInflater.from(bundle).inflate(0x7f04013f, null);
        final NumberPicker numberPicker = (NumberPicker)view.findViewById(0x7f100467);
        numberPicker.setRange(i, j);
        numberPicker.setCurrent(initialValue);
        return (new com.walmart.android.ui.dialog.AlertDialog.Builder(bundle)).setTitle(0x7f09046c).setCancelable(true).setView(view).setNegativeButton(0x7f0900a0, new android.content.DialogInterface.OnClickListener() {

            final QuantityEditorDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = QuantityEditorDialogFragment.this;
                super();
            }
        }).setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final QuantityEditorDialogFragment this$0;
            final int val$initialValue;
            final NumberPicker val$numberPicker;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                if (mListener != null)
                {
                    k = numberPicker.getCurrent();
                    if (k != initialValue)
                    {
                        mListener.onNewQuantity(k);
                    }
                }
            }

            
            {
                this$0 = QuantityEditorDialogFragment.this;
                numberPicker = numberpicker;
                initialValue = i;
                super();
            }
        }).create();
    }

    public void setOnNewQuantityListener(OnNewQuantityListener onnewquantitylistener)
    {
        mListener = onnewquantitylistener;
    }

}
