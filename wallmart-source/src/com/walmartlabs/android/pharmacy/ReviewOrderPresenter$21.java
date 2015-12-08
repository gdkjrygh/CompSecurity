// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PharmacyUtils

class val.editor
    implements android.widget.edListener
{

    final ReviewOrderPresenter this$0;
    final EditText val$editor;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ReviewOrderPresenter.access$4100(ReviewOrderPresenter.this).getPhoneNumber(i);
        if (TextUtils.isEmpty(adapterview))
        {
            val$editor.setText("");
            return;
        } else
        {
            val$editor.setText(PharmacyUtils.formatUSPhoneNumber(adapterview));
            val$editor.setSelection(val$editor.getText().length());
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    cation()
    {
        this$0 = final_revieworderpresenter;
        val$editor = EditText.this;
        super();
    }
}
