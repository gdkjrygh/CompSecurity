// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import com.walmart.android.ui.dialog.AlertDialog;
import java.util.regex.Pattern;

public class GiftCardValidator
{

    public GiftCardValidator()
    {
    }

    public static boolean isGiftCardNumberValid(EditText edittext)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (edittext.getText() != null)
        {
            edittext = edittext.getText().toString().replace(" ", "");
            flag = flag1;
            if (Pattern.matches("[0-9]+", edittext))
            {
                flag = flag1;
                if (edittext.length() == 16)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean isGiftCardPinValid(EditText edittext)
    {
        if (edittext.getText() != null)
        {
            return Pattern.matches("[0-9]{4}", edittext.getText().toString());
        } else
        {
            return false;
        }
    }

    public static void showErrorForField(Context context, int i, View view)
    {
        String s = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err);
        (new com.walmart.android.ui.dialog.AlertDialog.Builder(context)).setTitle(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

        }).setMessage(context.getResources().getString(i)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(view) {

            final View val$field;

            public void onDismiss(DialogInterface dialoginterface)
            {
                field.requestFocus();
            }

            
            {
                field = view;
                super();
            }
        }).create().show();
    }

    public static boolean validateGiftCard(EditText edittext, EditText edittext1)
    {
        if (!isGiftCardNumberValid(edittext))
        {
            showErrorForField(edittext.getContext(), com.walmartlabs.android.payment.R.string.pm_add_gift_card_number_err, edittext);
            return false;
        }
        if (!isGiftCardPinValid(edittext1))
        {
            showErrorForField(edittext1.getContext(), com.walmartlabs.android.payment.R.string.pm_add_gift_card_pin_err, edittext1);
            return false;
        } else
        {
            return true;
        }
    }
}
