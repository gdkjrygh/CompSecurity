// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPromoFragment

final class a
    implements TextWatcher
{

    final SignupPromoFragment a;
    final mo b;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.onTextChangedPromo(charsequence);
    }

    ( , SignupPromoFragment signuppromofragment)
    {
        b = ;
        a = signuppromofragment;
        super();
    }
}
