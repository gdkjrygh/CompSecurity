// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    private static final b w[];

    private b(String s1, int i1)
    {
        super(s1, i1);
    }

    public static b valueOf(String s1)
    {
        return (b)Enum.valueOf(a/a/a/a/b, s1);
    }

    public static b[] values()
    {
        b ab[] = w;
        int i1 = ab.length;
        b ab1[] = new b[i1];
        System.arraycopy(ab, 0, ab1, 0, i1);
        return ab1;
    }

    static 
    {
        a = new b("Insert", 0);
        b = new b("InsertInTxIterable", 1);
        c = new b("InsertInTxArray", 2);
        d = new b("InsertOrReplace", 3);
        e = new b("InsertOrReplaceInTxIterable", 4);
        f = new b("InsertOrReplaceInTxArray", 5);
        g = new b("Update", 6);
        h = new b("UpdateInTxIterable", 7);
        i = new b("UpdateInTxArray", 8);
        j = new b("Delete", 9);
        k = new b("DeleteInTxIterable", 10);
        l = new b("DeleteInTxArray", 11);
        m = new b("DeleteByKey", 12);
        n = new b("DeleteAll", 13);
        o = new b("TransactionRunnable", 14);
        p = new b("TransactionCallable", 15);
        q = new b("QueryList", 16);
        r = new b("QueryUnique", 17);
        s = new b("Load", 18);
        t = new b("LoadAll", 19);
        u = new b("Count", 20);
        v = new b("Refresh", 21);
        w = (new b[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v
        });
    }
}
