// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.walmart.android.ui.dialog.AlertDialog;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyUtils

class val.editor
    implements TextWatcher
{

    final ReviewOrderPresenter this$0;
    final AlertDialog val$dialog;
    final EditText val$editor;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        val$dialog.getButton(-1).setEnabled(PharmacyUtils.isValidUSPhoneNumber(val$editor.getText().toString()));
    }

    ()
    {
        this$0 = final_revieworderpresenter;
        val$dialog = alertdialog;
        val$editor = EditText.this;
        super();
    }
}
