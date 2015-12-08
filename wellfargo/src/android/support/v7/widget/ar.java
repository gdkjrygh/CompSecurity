// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class ar
    implements TextWatcher
{

    final SearchView a;

    ar(SearchView searchview)
    {
        a = searchview;
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
        SearchView.a(a, charsequence);
    }
}
