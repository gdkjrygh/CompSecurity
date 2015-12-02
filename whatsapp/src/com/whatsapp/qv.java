// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Spannable;
import android.text.SpannableString;

// Referenced classes of package com.whatsapp:
//            g1

final class qv extends android.text.Spannable.Factory
{

    qv()
    {
    }

    public Spannable newSpannable(CharSequence charsequence)
    {
        return new g1(new SpannableString(charsequence));
    }
}
