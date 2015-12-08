// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.text.InputFilter;
import android.text.Spanned;

// Referenced classes of package com.walmart.android.wmui:
//            NumberPicker

private class <init>
    implements InputFilter
{

    final NumberPicker this$0;

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (NumberPicker.access$800(NumberPicker.this) != null) goto _L2; else goto _L1
_L1:
        charsequence = NumberPicker.access$900(NumberPicker.this).filter(charsequence, i, j, spanned, k, l);
_L4:
        return charsequence;
_L2:
        String s = String.valueOf(charsequence.subSequence(i, j));
        spanned = String.valueOf((new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(s).append(spanned.subSequence(l, spanned.length())).toString()).toLowerCase();
        String as[] = NumberPicker.access$800(NumberPicker.this);
        j = as.length;
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                charsequence = s;
                if (as[i].toLowerCase().startsWith(spanned))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return "";
    }

    private ()
    {
        this$0 = NumberPicker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
