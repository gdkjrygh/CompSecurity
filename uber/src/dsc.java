// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.SpannableStringBuilder;

public final class dsc extends SpannableStringBuilder
{

    private dsc()
    {
    }

    public dsc(byte byte0)
    {
        this();
    }

    public final void a(dsb dsb1)
    {
        String s = (new StringBuilder()).append(dsb1.a().a()).append(", ").toString();
        int i = length();
        int j = s.length();
        append(s);
        setSpan(dsb1, i, j + i, 33);
    }
}
