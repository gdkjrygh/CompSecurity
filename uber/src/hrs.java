// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;

public final class hrs
{

    private final CharSequence a;
    private final int b;

    public hrs(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        a = null;
        b = i;
    }

    public hrs(CharSequence charsequence)
    {
        gjz.a(charsequence);
        a = charsequence;
        b = 0;
    }

    public final CharSequence a(Resources resources)
    {
        if (a != null)
        {
            return a;
        } else
        {
            return resources.getString(b);
        }
    }
}
