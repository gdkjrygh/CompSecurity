// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class ang.Object
    implements gka
{

    final elg a;

    private static boolean a(String s)
    {
        return !TextUtils.isEmpty(s);
    }

    public final boolean apply(Object obj)
    {
        return a((String)obj);
    }

    (elg elg1)
    {
        a = elg1;
        super();
    }
}
