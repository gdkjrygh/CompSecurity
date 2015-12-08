// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.walmart.android.app.account:
//            AssociateLoginPresenter

class val.associateCardText
    implements android.view.teLoginPresenter._cls1
{

    final AssociateLoginPresenter this$0;
    final EditText val$associateCardText;
    final EditText val$associateIdText;

    public void onClick(View view)
    {
        view = val$associateIdText.getText().toString();
        String s = val$associateCardText.getText().toString();
        if (TextUtils.isEmpty(view))
        {
            AssociateLoginPresenter.access$000(AssociateLoginPresenter.this, 1);
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            AssociateLoginPresenter.access$100(AssociateLoginPresenter.this, 2);
            return;
        } else
        {
            ((InputMethodManager)AssociateLoginPresenter.access$200(AssociateLoginPresenter.this).getSystemService("input_method")).hideSoftInputFromWindow(val$associateCardText.getWindowToken(), 0);
            AssociateLoginPresenter.access$300(AssociateLoginPresenter.this, view, s);
            return;
        }
    }

    ()
    {
        this$0 = final_associateloginpresenter;
        val$associateIdText = edittext;
        val$associateCardText = EditText.this;
        super();
    }
}
