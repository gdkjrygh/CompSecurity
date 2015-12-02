// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Date;

public final class htv
    implements hud
{

    public int a;
    public int b;
    private boolean c;

    public htv()
    {
        getClass().getName();
    }

    public htv(int i, int j)
    {
        getClass().getName();
        a = i;
        b = j;
        boolean flag;
        if (a > 0 && b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (b < 2000)
        {
            b = b + 2000;
        }
    }

    public final boolean a()
    {
        Date date;
        if (a > 0 && 12 >= a)
        {
            if (b <= (date = new Date()).getYear() + 1900 + 15 && (b > date.getYear() + 1900 || b == date.getYear() + 1900 && a >= date.getMonth() + 1))
            {
                return true;
            }
        }
        return false;
    }

    public final void afterTextChanged(Editable editable)
    {
        boolean flag;
        if (editable.length() >= 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        editable = editable.toString();
        if (editable != null)
        {
            if ((editable = hts.a(editable)) != null)
            {
                a = editable.getMonth() + 1;
                b = editable.getYear();
                if (b < 1900)
                {
                    b = b + 1900;
                    return;
                }
            }
        }
    }

    public final String b()
    {
        return String.format("%02d/%02d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b % 100)
        });
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a = 0;
        b = 0;
        c = false;
    }

    public final boolean c()
    {
        return c;
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        int i1;
label0:
        {
            charsequence = new SpannableStringBuilder(charsequence);
            if (k == 0 && charsequence.length() > 0 && '1' < charsequence.charAt(0) && charsequence.charAt(0) <= '9')
            {
                charsequence.insert(0, "0");
                j++;
            }
            int j1 = l - k;
            i1 = j;
            if (k - j1 > 2)
            {
                break label0;
            }
            i1 = j;
            if ((k + j) - j1 < 2)
            {
                break label0;
            }
            j1 = 2 - k;
            if (j1 != j)
            {
                i1 = j;
                if (j1 < 0)
                {
                    break label0;
                }
                i1 = j;
                if (j1 >= j)
                {
                    break label0;
                }
                i1 = j;
                if (charsequence.charAt(j1) == '/')
                {
                    break label0;
                }
            }
            charsequence.insert(j1, "/");
            i1 = j + 1;
        }
        spanned = (new SpannableStringBuilder(spanned)).replace(k, l, charsequence, i, i1).toString();
        if (spanned.length() > 0 && (spanned.charAt(0) < '0' || '1' < spanned.charAt(0)))
        {
            charsequence = "";
        } else
        {
            if (spanned.length() >= 2)
            {
                if (spanned.charAt(0) != '0' && spanned.charAt(1) > '2')
                {
                    return "";
                }
                if (spanned.charAt(0) == '0' && spanned.charAt(1) == '0')
                {
                    return "";
                }
            }
            if (spanned.length() > 5)
            {
                return "";
            }
        }
        return charsequence;
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
