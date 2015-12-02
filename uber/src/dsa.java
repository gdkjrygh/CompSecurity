// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.ubercab.client.core.ui.ChipEditText;
import java.util.Collection;
import java.util.Set;

public final class dsa
    implements InputFilter
{

    final ChipEditText a;
    private boolean b;

    private dsa(ChipEditText chipedittext)
    {
        a = chipedittext;
        super();
        b = false;
    }

    public dsa(ChipEditText chipedittext, byte byte0)
    {
        this(chipedittext);
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (b)
        {
            return null;
        }
        if (spanned.length() == 0 || spanned.length() > 0 && k == 0 && l == spanned.length())
        {
            return null;
        }
        boolean flag;
        if (i == 0 && j == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ChipEditText.a(a) >= 0 && a.b().size() >= ChipEditText.a(a) && !flag)
        {
            return "";
        }
        if (ChipEditText.e().contains(charsequence.toString()))
        {
            if (a.c().length() != 0)
            {
                a.a();
            }
            return "";
        }
        if (flag)
        {
            charsequence = (dsb[])spanned.getSpans(k, l, dsb);
            if (charsequence.length > 0)
            {
                b = true;
                a.a(charsequence[0].a());
                b = false;
                return "";
            } else
            {
                return null;
            }
        }
        if (k == spanned.length() || l >= ChipEditText.b(a))
        {
            return null;
        } else
        {
            b = true;
            spanned = new SpannableStringBuilder(spanned);
            spanned.append(charsequence.subSequence(i, j));
            a.setText(spanned);
            a.setSelection(spanned.length());
            b = false;
            return "";
        }
    }
}
