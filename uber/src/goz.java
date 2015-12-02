// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.ubercab.locale.name.NameInput;

public final class goz
    implements hrt
{

    private final hrs a;
    private final hrs b;

    public goz(hrs hrs1, hrs hrs2)
    {
        a = hrs1;
        b = hrs2;
    }

    private Pair a(NameInput nameinput)
    {
        CharSequence charsequence1 = null;
        boolean flag = TextUtils.isEmpty(nameinput.c());
        boolean flag1 = TextUtils.isEmpty(nameinput.d());
        if (!flag && !flag1)
        {
            return null;
        }
        CharSequence charsequence;
        if (flag)
        {
            charsequence = a.a(nameinput.getResources());
        } else
        {
            charsequence = null;
        }
        if (flag1)
        {
            charsequence1 = b.a(nameinput.getResources());
        }
        return new Pair(charsequence, charsequence1);
    }

    public final volatile Object a(Object obj)
    {
        return a((NameInput)obj);
    }
}
