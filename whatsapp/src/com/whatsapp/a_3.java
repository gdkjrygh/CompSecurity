// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.google.af;
import com.google.gl;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            App

public class a_3
    implements TextWatcher
{

    private int a;
    private boolean b;
    private boolean c;
    private gl d;

    public a_3()
    {
        this(Locale.getDefault().getCountry());
    }

    public a_3(String s)
    {
        c = false;
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            d = af.a().h(s);
            return;
        }
    }

    private String a(char c1, boolean flag)
    {
        if (flag)
        {
            String s;
            try
            {
                s = d.d(c1);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s;
        } else
        {
            return d.c(c1);
        }
    }

    private String a(CharSequence charsequence, int i)
    {
        char c1;
        String s;
        int j;
        int k;
        int l;
        boolean flag;
        k = App.am;
        s = null;
        d.g();
        l = charsequence.length();
        j = 0;
        flag = false;
        c1 = '\0';
_L4:
        if (j >= l) goto _L2; else goto _L1
_L1:
        char c2 = charsequence.charAt(j);
        boolean flag1;
        try
        {
            flag1 = PhoneNumberUtils.isNonSeparator(c2);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (flag1)
        {
            boolean flag2 = flag;
            if (c1 != 0)
            {
                s = a(c1, flag);
                flag2 = false;
            }
            c1 = c2;
            flag = flag2;
        }
        if (j == i - 1)
        {
            flag = true;
        }
        j++;
        if (k == 0) goto _L4; else goto _L3
_L3:
        charsequence = s;
_L6:
        if (c1 != 0)
        {
            charsequence = a(c1, flag);
        }
        return charsequence;
_L2:
        charsequence = s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a()
    {
        b = true;
        d.g();
    }

    private boolean a(CharSequence charsequence, int i, int j)
    {
        int l = App.am;
        int k = i;
        do
        {
            if (k >= i + j)
            {
                break;
            }
            char c1 = charsequence.charAt(k);
            boolean flag;
            try
            {
                flag = PhoneNumberUtils.isNonSeparator(c1);
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (!flag)
            {
                return true;
            }
            k++;
        } while (l == 0);
        return false;
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = b;
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i = editable.length();
        if (i == 0)
        {
            flag = false;
        }
        b = flag;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        editable;
        try
        {
            throw editable;
        }
        // Misplaced declaration of an exception variable
        catch (Editable editable) { }
        finally
        {
            this;
        }
        throw editable;
        throw editable;
_L2:
        flag = c;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s = a(editable, Selection.getSelectionEnd(editable));
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = d.d();
        c = true;
        editable.replace(0, editable.length(), s, 0, s.length());
        if (s.equals(editable.toString()))
        {
            Selection.setSelection(editable, i);
        }
        c = false;
        if (true) goto _L4; else goto _L3
_L3:
        editable;
        throw editable;
        editable;
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        int l = App.am;
        boolean flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        try
        {
            if (b)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        break MISSING_BLOCK_LABEL_30;
        charsequence;
        throw charsequence;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        int i1 = charsequence.length();
        if (i1 != i)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a = 1;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        k = charsequence.length();
        if (i + j != k || j <= 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        a = 0;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        flag = a(charsequence, i, j);
        if (!flag)
        {
            try
            {
                a = 2;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_154;
            }
        }
        a = 3;
        return;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        try
        {
            if (b)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        break MISSING_BLOCK_LABEL_25;
        charsequence;
        throw charsequence;
        j = a;
        if (j == 3 && k > 0)
        {
            try
            {
                if (!a(charsequence, i, k))
                {
                    a = 2;
                }
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        j = a;
        if (j != 1 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        flag = a(charsequence, i, k);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a();
        i = App.am;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        try
        {
            if (a == 3)
            {
                a();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        break MISSING_BLOCK_LABEL_135;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
    }
}
