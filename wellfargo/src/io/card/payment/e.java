// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package io.card.payment:
//            r

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    private static int k;
    private static HashMap l;
    private static final e m[];
    public final String j;

    private e(String s, int i1, String s1)
    {
        super(s, i1);
        j = s1;
    }

    private static Pair a(String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = s;
        }
        return new Pair(s, s2);
    }

    public static e a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return h;
        }
        HashSet hashset = new HashSet();
        Iterator iterator = l.entrySet().iterator();
        do
        {
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s1 = (String)((Pair)entry.getKey()).first;
                String s2 = (String)((Pair)entry.getKey()).second;
                int i1 = Math.min(s.length(), s1.length());
                int j1 = Math.min(s.length(), s2.length());
                boolean flag;
                if (Integer.parseInt(s.substring(0, i1)) < Integer.parseInt(s1.substring(0, i1)))
                {
                    flag = false;
                } else
                if (Integer.parseInt(s.substring(0, j1)) > Integer.parseInt(s2.substring(0, j1)))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    hashset.add(entry.getValue());
                }
            } else
            {
                if (hashset.size() > 1)
                {
                    return i;
                }
                if (hashset.size() == 1)
                {
                    return (e)hashset.iterator().next();
                }
                return h;
            }
        } while (true);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(io/card/payment/e, s);
    }

    public static e[] values()
    {
        return (e[])m.clone();
    }

    public final int a()
    {
        switch (r.a[ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 15;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return 16;

        case 2: // '\002'
            return 14;

        case 7: // '\007'
            return k;
        }
    }

    public final int b()
    {
        switch (r.a[ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 4;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return 3;
        }
    }

    public final String toString()
    {
        return j;
    }

    static 
    {
        a = new e("AMEX", 0, "AmEx");
        b = new e("DINERSCLUB", 1, "DinersClub");
        c = new e("DISCOVER", 2, "Discover");
        d = new e("JCB", 3, "JCB");
        e = new e("MASTERCARD", 4, "MasterCard");
        f = new e("VISA", 5, "Visa");
        g = new e("MAESTRO", 6, "Maestro");
        h = new e("UNKNOWN", 7, "Unknown");
        i = new e("INSUFFICIENT_DIGITS", 8, "More digits required");
        m = (new e[] {
            a, b, c, d, e, f, g, h, i
        });
        k = 1;
        Object obj = new HashMap();
        l = ((HashMap) (obj));
        ((HashMap) (obj)).put(a("300", "305"), b);
        l.put(a("309", null), b);
        l.put(a("34", null), a);
        l.put(a("3528", "3589"), d);
        l.put(a("36", null), b);
        l.put(a("37", null), a);
        l.put(a("38", "39"), b);
        l.put(a("4", null), f);
        l.put(a("50", null), g);
        l.put(a("51", "55"), e);
        l.put(a("56", "59"), g);
        l.put(a("6011", null), c);
        l.put(a("61", null), g);
        l.put(a("62", null), c);
        l.put(a("63", null), g);
        l.put(a("644", "649"), c);
        l.put(a("65", null), c);
        l.put(a("66", "69"), g);
        l.put(a("88", null), c);
        obj = l.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            k = Math.max(k, ((String)((Pair)entry.getKey()).first).length());
            if (((Pair)entry.getKey()).second != null)
            {
                k = Math.max(k, ((String)((Pair)entry.getKey()).second).length());
            }
        } while (true);
    }
}
