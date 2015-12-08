// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;

// Referenced classes of package io.card.payment:
//            af, s, e

final class q
    implements af
{

    private static int b[] = {
        4, 11
    };
    private static int c[] = {
        4, 9, 14
    };
    private String a;
    private int d;

    public q()
    {
        d = 0;
    }

    public q(String s1)
    {
        d = 0;
        a = s1;
    }

    public final boolean a()
    {
        while (!c() || !s.a(a)) 
        {
            return false;
        }
        return true;
    }

    public final void afterTextChanged(Editable editable)
    {
        boolean flag = false;
        a = s.c(editable.toString());
        e e1 = e.a(a);
        int i = ((flag) ? 1 : 0);
        if (d > 1)
        {
            int k = d;
            int l = d - 1;
            d = 0;
            i = ((flag) ? 1 : 0);
            if (k > l)
            {
                editable.delete(l, k);
                i = ((flag) ? 1 : 0);
            }
        }
        while (i < editable.length()) 
        {
            char c1 = editable.charAt(i);
            int j;
            if (e1.a() == 15 && (i == 4 || i == 11) || (e1.a() == 16 || e1.a() == 14) && (i == 4 || i == 9 || i == 14))
            {
                j = i;
                if (c1 != ' ')
                {
                    editable.insert(i, " ");
                    j = i;
                }
            } else
            {
                j = i;
                if (c1 == ' ')
                {
                    editable.delete(i, i + 1);
                    j = i - 1;
                }
            }
            i = j + 1;
        }
    }

    public final String b()
    {
        return a;
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final boolean c()
    {
        e e1;
        if (!TextUtils.isEmpty(a))
        {
            if (a.length() == (e1 = e.a(a)).a())
            {
                return true;
            }
        }
        return false;
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        String s1 = s.c((new SpannableStringBuilder(spanned)).replace(k, l, charsequence, i, j).toString());
        i = e.a(s1).a();
        if (s1.length() > i)
        {
            return "";
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        int ai[];
        int i1;
        if (i == 15)
        {
            ai = b;
        } else
        {
            ai = c;
        }
        i1 = l - k;
        for (i = 0; i < ai.length;)
        {
label0:
            {
                if (charsequence.length() == 0 && k == ai[i] && spanned.charAt(k) == ' ')
                {
                    d = ai[i];
                }
                l = j;
                if (k - i1 > ai[i])
                {
                    break label0;
                }
                l = j;
                if ((k + j) - i1 < ai[i])
                {
                    break label0;
                }
                int j1 = ai[i] - k;
                if (j1 != j)
                {
                    l = j;
                    if (j1 < 0)
                    {
                        break label0;
                    }
                    l = j;
                    if (j1 >= j)
                    {
                        break label0;
                    }
                    l = j;
                    if (spannablestringbuilder.charAt(j1) == ' ')
                    {
                        break label0;
                    }
                }
                spannablestringbuilder.insert(j1, " ");
                l = j + 1;
            }
            i++;
            j = l;
        }

        return spannablestringbuilder;
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

}
