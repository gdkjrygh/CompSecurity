// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, iz

class eu
    implements TextWatcher
{

    final MultipleContactsSelector a;

    eu(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
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
        iz.a(a.q, charsequence);
    }
}
