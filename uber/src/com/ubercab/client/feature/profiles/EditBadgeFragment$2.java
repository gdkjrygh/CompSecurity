// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeFragment, EditBadgeColorAdapter

final class a
    implements TextWatcher
{

    final EditBadgeFragment a;

    public final void afterTextChanged(Editable editable)
    {
        EditBadgeFragment.a(a).b(editable.toString());
        EditBadgeFragment.b(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    r(EditBadgeFragment editbadgefragment)
    {
        a = editbadgefragment;
        super();
    }
}
