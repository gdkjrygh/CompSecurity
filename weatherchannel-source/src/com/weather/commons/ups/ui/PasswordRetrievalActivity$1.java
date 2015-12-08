// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.weather.commons.ups.ui:
//            PasswordRetrievalActivity

class this._cls0
    implements android.view.valActivity._cls1
{

    final PasswordRetrievalActivity this$0;

    public void onClick(View view)
    {
        (new ndRecoveryEmail(PasswordRetrievalActivity.this, instructionText, null)).execute(new String[] {
            etEmail.getText().toString()
        });
    }

    ndRecoveryEmail()
    {
        this$0 = PasswordRetrievalActivity.this;
        super();
    }
}
