// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.account:
//            CreateAccountPresenter

class this._cls0
    implements android.widget.hangeListener
{

    final CreateAccountPresenter this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = (EditText)ViewUtil.findViewById(CreateAccountPresenter.access$200(CreateAccountPresenter.this), 0x7f1000cc);
        char c;
        if (flag)
        {
            c = '\220';
        } else
        {
            c = '\200';
        }
        compoundbutton.setInputType(c | '\001');
        compoundbutton.setSelection(compoundbutton.getText().length());
        if (flag || TextUtils.isEmpty(compoundbutton.getText()))
        {
            compoundbutton.setTypeface(Typeface.DEFAULT);
        }
    }

    ()
    {
        this$0 = CreateAccountPresenter.this;
        super();
    }
}
