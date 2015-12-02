// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

final class ang.Object
    implements Comparator
{

    final goo a;

    private static int a(String s, String s1)
    {
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(0);
        return collator.compare(s.toLowerCase(), s1.toLowerCase());
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }

    (goo goo1)
    {
        a = goo1;
        super();
    }
}
