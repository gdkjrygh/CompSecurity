// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Spinner;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyUtils

class val.editor
    implements android.content.istener
{

    final ReviewOrderPresenter this$0;
    final EditText val$editor;
    final Spinner val$typeChooser;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        updatePatientPhoneNumber(val$typeChooser.getSelectedItemPosition(), PharmacyUtils.extractRawUSPhoneNumber(val$editor.getText().toString()));
    }

    ()
    {
        this$0 = final_revieworderpresenter;
        val$typeChooser = spinner;
        val$editor = EditText.this;
        super();
    }
}
