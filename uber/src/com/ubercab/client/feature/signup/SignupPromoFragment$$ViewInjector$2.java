// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupPromoFragment

final class a
    implements android.widget.nt..ViewInjector._cls2
{

    final SignupPromoFragment a;
    final omo b;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return a.onEditorActionPromo();
    }

    ( , SignupPromoFragment signuppromofragment)
    {
        b = ;
        a = signuppromofragment;
        super();
    }
}
