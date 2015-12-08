// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.go.weatherex.d:
//            a

class b
    implements TextWatcher
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        com.go.weatherex.d.a.a(a, "");
    }
}
