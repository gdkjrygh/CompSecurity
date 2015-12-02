// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;

// Referenced classes of package com.whatsapp:
//            ab7

final class atg extends android.text.Editable.Factory
{

    atg()
    {
    }

    public Editable newEditable(CharSequence charsequence)
    {
        return new ab7(charsequence);
    }
}
