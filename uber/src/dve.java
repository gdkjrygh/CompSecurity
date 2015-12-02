// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class dve
{

    public static String a(String s)
    {
        String s2 = Locale.getDefault().getISO3Country();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = Locale.US.getISO3Country();
        }
        return String.format(s, new Object[] {
            s1
        }).toLowerCase();
    }
}
