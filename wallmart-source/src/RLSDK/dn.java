// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            do

public final class dn
{

    public static final dn a = new dn(new int[] {
        0, 0, 0
    }, 0, "TERMINATOR");
    public static final dn b = new dn(new int[] {
        10, 12, 14
    }, 1, "NUMERIC");
    public static final dn c = new dn(new int[] {
        9, 11, 13
    }, 2, "ALPHANUMERIC");
    public static final dn d = new dn(new int[] {
        0, 0, 0
    }, 3, "STRUCTURED_APPEND");
    public static final dn e = new dn(new int[] {
        8, 16, 16
    }, 4, "BYTE");
    public static final dn f = new dn(null, 7, "ECI");
    public static final dn g = new dn(new int[] {
        8, 10, 12
    }, 8, "KANJI");
    public static final dn h = new dn(null, 5, "FNC1_FIRST_POSITION");
    public static final dn i = new dn(null, 9, "FNC1_SECOND_POSITION");
    public static final dn j = new dn(new int[] {
        8, 10, 12
    }, 13, "HANZI");
    private final int k[];
    private final int l;
    private final String m;

    private dn(int ai[], int i1, String s)
    {
        k = ai;
        l = i1;
        m = s;
    }

    public static dn a(int i1)
    {
        switch (i1)
        {
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return h;

        case 7: // '\007'
            return f;

        case 8: // '\b'
            return g;

        case 9: // '\t'
            return i;

        case 13: // '\r'
            return j;
        }
    }

    public final int a(do do1)
    {
        if (k == null)
        {
            throw new IllegalArgumentException("Character count doesn't apply to this mode");
        }
        int i1 = do1.a();
        if (i1 <= 9)
        {
            i1 = 0;
        } else
        if (i1 <= 26)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        return k[i1];
    }

    public final String toString()
    {
        return m;
    }

}
