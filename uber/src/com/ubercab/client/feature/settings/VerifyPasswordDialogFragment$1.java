// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.text.Editable;
import android.text.TextUtils;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import hpb;

// Referenced classes of package com.ubercab.client.feature.settings:
//            VerifyPasswordDialogFragment

final class a extends hpb
{

    final VerifyPasswordDialogFragment a;

    public final void afterTextChanged(Editable editable)
    {
        editable = a.mButtonSubmit;
        boolean flag;
        if (!TextUtils.isEmpty(a.mEditTextPassword.i()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editable.setEnabled(flag);
    }

    (VerifyPasswordDialogFragment verifypassworddialogfragment)
    {
        a = verifypassworddialogfragment;
        super();
    }
}
