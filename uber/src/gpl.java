// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import java.util.Locale;

public class gpl
    implements TextWatcher
{

    private String a;
    private boolean b;
    private boolean c;
    private bmk d;
    private CharSequence e;

    public gpl()
    {
        this(Locale.getDefault().getCountry());
    }

    private gpl(String s)
    {
        b = false;
        e = "";
        gjz.a(s);
        bmr.a();
        d = bmr.e(s);
        a = s;
    }

    private static int a(String s, String s1)
    {
        int i1 = s.length() + 1;
        int j1 = s1.length();
        int ai1[] = new int[i1];
        int ai[] = new int[i1];
        for (int i = 0; i < i1; i++)
        {
            ai1[i] = i;
        }

        int j = 1;
        do
        {
            int ai2[] = ai1;
            if (j < j1 + 1)
            {
                ai[0] = j;
                int k = 1;
                while (k < i1) 
                {
                    int l;
                    int k1;
                    if (s.charAt(k - 1) == s1.charAt(j - 1))
                    {
                        l = 0;
                    } else
                    {
                        l = 1;
                    }
                    k1 = ai2[k - 1];
                    ai[k] = Math.min(Math.min(ai2[k] + 1, ai[k - 1] + 1), l + k1);
                    k++;
                }
                j++;
                ai1 = ai;
                ai = ai2;
            } else
            {
                return ai2[i1 - 1];
            }
        } while (true);
    }

    private String a(char c1, boolean flag)
    {
        if (flag)
        {
            return d.b(c1);
        } else
        {
            return d.a(c1);
        }
    }

    private String a(CharSequence charsequence, int i)
    {
        String s = null;
        d.a();
        int k = charsequence.length();
        int j = 0;
        boolean flag = false;
        char c1 = '\0';
        for (; j < k; j++)
        {
            char c2 = charsequence.charAt(j);
            if (PhoneNumberUtils.isNonSeparator(c2))
            {
                boolean flag1 = flag;
                if (c1 != 0)
                {
                    s = a(c1, flag);
                    flag1 = false;
                }
                c1 = c2;
                flag = flag1;
            }
            if (j == i - 1)
            {
                flag = true;
            }
        }

        if (c1 != 0)
        {
            s = a(c1, flag);
        }
        return s;
    }

    private static boolean a(CharSequence charsequence, int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            if (!PhoneNumberUtils.isNonSeparator(charsequence.charAt(k)))
            {
                return true;
            }
        }

        return false;
    }

    private void b()
    {
        c = true;
        d.a();
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        d.a();
        bmr.a();
        d = bmr.e(s);
        a = s;
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (!c) goto _L2; else goto _L1
_L1:
        int i = a(e.toString(), editable.toString());
        boolean flag = flag1;
        if (editable.length() != 0)
        {
            flag = flag1;
            if (i <= 1)
            {
                flag = true;
            }
        }
        c = flag;
        if (editable.length() != 0 && i != 1) goto _L2; else goto _L3
_L3:
        e = String.copyValueOf(editable.toString().toCharArray());
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s;
        if (b)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = a(editable, Selection.getSelectionEnd(editable));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        int j = d.b();
        b = true;
        editable.replace(0, editable.length(), s, 0, s.length());
        if (s.equals(editable.toString()))
        {
            Selection.setSelection(editable, j);
        }
        b = false;
        if (!editable.equals(e))
        {
            e = String.copyValueOf(editable.toString().toCharArray());
        }
        if (true) goto _L5; else goto _L4
_L4:
        editable;
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (b || c || j <= 0 || !a(charsequence, i, j)) 
        {
            return;
        }
        b();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (b || c || k <= 0 || !a(charsequence, i, k)) 
        {
            return;
        }
        b();
    }
}
