// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.walmart.android.ui.dialog.AlertDialog;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyUtils

class val.editor
    implements android.content.stener
{

    final ReviewOrderPresenter this$0;
    final AlertDialog val$dialog;
    final EditText val$editor;
    final Spinner val$typeChooser;

    public void onShow(DialogInterface dialoginterface)
    {
        int i;
        if (ReviewOrderPresenter.access$4200(ReviewOrderPresenter.this) == -1)
        {
            i = 0;
        } else
        {
            i = ReviewOrderPresenter.access$4200(ReviewOrderPresenter.this);
        }
        val$typeChooser.setSelection(i);
        val$dialog.getButton(-1).setEnabled(PharmacyUtils.isValidUSPhoneNumber(val$editor.getText().toString()));
    }

    ()
    {
        this$0 = final_revieworderpresenter;
        val$typeChooser = spinner;
        val$dialog = alertdialog;
        val$editor = EditText.this;
        super();
    }
}
