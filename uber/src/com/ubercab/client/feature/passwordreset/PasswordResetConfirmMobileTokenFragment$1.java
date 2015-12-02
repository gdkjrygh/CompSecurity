// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.EditText;
import dkf;
import emu;
import hpb;

// Referenced classes of package com.ubercab.client.feature.passwordreset:
//            PasswordResetConfirmMobileTokenFragment

final class a extends hpb
{

    final PasswordResetConfirmMobileTokenFragment a;

    public final void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        if (editable.length() == 6)
        {
            a.d.a(a.e.a(), editable);
            a.b(a.getString(0x7f070296));
            ((InputMethodManager)PasswordResetConfirmMobileTokenFragment.a(a).getSystemService("input_method")).hideSoftInputFromWindow(a.mEditTextToken.getWindowToken(), 0);
        }
    }

    (PasswordResetConfirmMobileTokenFragment passwordresetconfirmmobiletokenfragment)
    {
        a = passwordresetconfirmmobiletokenfragment;
        super();
    }
}
