// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gpa
    implements TextWatcher, gpk
{

    private static final Pattern a = Pattern.compile("\\+*[\\(]*\\d[\\s\\-\\d\\(\\)]*");
    private int b;
    private int c;
    private final gpj d;
    private gpb e;
    private gpc f;
    private gpd g;
    private gpe h;
    private boolean i;

    public gpa()
    {
        this(null);
    }

    public gpa(gpb gpb1)
    {
        c = gpg.a;
        d = new gpj();
        d.a(this);
        a(gpb1);
    }

    private int a(CharSequence charsequence)
    {
        if (c != gpg.a || charsequence.length() == 0)
        {
            return b;
        }
        if (a.matcher(charsequence).matches())
        {
            b(gph.b);
        } else
        {
            b(gph.a);
        }
        return b;
    }

    private static void a(Editable editable)
    {
        String s = editable.toString().replaceAll("[\\(\\)\\s\\-]+", "");
        editable.replace(0, editable.length(), s);
    }

    private void a(gpb gpb1)
    {
        e = gpb1;
    }

    private void b(int j)
    {
        if (j != b)
        {
            b = j;
            if (j == gph.a)
            {
                i = true;
            }
            if (e != null)
            {
                e.a(b);
                return;
            }
        }
    }

    public final void a(int j)
    {
        c = j;
        if (j == gpg.c)
        {
            b(gph.b);
            return;
        } else
        {
            b(gph.a);
            return;
        }
    }

    public final void a(gpc gpc1)
    {
        f = gpc1;
    }

    public final void a(gpd gpd)
    {
        g = gpd;
    }

    public final void a(gpe gpe)
    {
        h = gpe;
    }

    public final void afterTextChanged(Editable editable)
    {
        if (b == gph.b)
        {
            d.afterTextChanged(editable);
            if (h != null)
            {
                editable.toString();
            }
        } else
        {
            if (i)
            {
                i = false;
                a(editable);
                return;
            }
            if (g != null)
            {
                editable.toString();
                return;
            }
        }
    }

    public final void b(String s)
    {
        d.a(s);
    }

    public final void b_(String s)
    {
        if (f != null)
        {
            f.b(s);
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
    {
        if (b == gph.b)
        {
            d.beforeTextChanged(charsequence, j, k, l);
        }
    }

    public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
        a(charsequence);
        if (b == gph.b)
        {
            d.onTextChanged(charsequence, j, k, l);
        }
    }

}
