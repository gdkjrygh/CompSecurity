// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            Conversation, ao7, s, iz

class af_
    implements TextWatcher
{

    final EditText a;
    final ao7 b;

    af_(ao7 ao7_1, EditText edittext)
    {
        b = ao7_1;
        a = edittext;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        Conversation.o = editable.toString();
        Conversation.b(b.a, Conversation.o);
        if (TextUtils.isEmpty(Conversation.o))
        {
            Conversation.g(b.a);
        }
        b.a.U.notifyDataSetChanged();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        iz.a(a, charsequence);
    }
}
