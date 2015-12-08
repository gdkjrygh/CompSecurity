// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            cz, aj, cn, cr, 
//            ch, ci, cj, ck, 
//            cl, y

public abstract class cq
{

    protected final aj a;
    protected final cz b;

    cq(aj aj1)
    {
        a = aj1;
        b = new cz(aj1);
    }

    public static cq a(aj aj1)
    {
        if (aj1.a(1))
        {
            return new cn(aj1);
        }
        if (!aj1.a(2))
        {
            return new cr(aj1);
        }
        switch (cz.a(aj1, 1, 4))
        {
        default:
            switch (cz.a(aj1, 1, 5))
            {
            default:
                switch (cz.a(aj1, 1, 7))
                {
                default:
                    throw new IllegalStateException((new StringBuilder("unknown decoder: ")).append(aj1).toString());

                case 56: // '8'
                    return new cl(aj1, "310", "11");

                case 57: // '9'
                    return new cl(aj1, "320", "11");

                case 58: // ':'
                    return new cl(aj1, "310", "13");

                case 59: // ';'
                    return new cl(aj1, "320", "13");

                case 60: // '<'
                    return new cl(aj1, "310", "15");

                case 61: // '='
                    return new cl(aj1, "320", "15");

                case 62: // '>'
                    return new cl(aj1, "310", "17");

                case 63: // '?'
                    return new cl(aj1, "320", "17");
                }

            case 12: // '\f'
                return new cj(aj1);

            case 13: // '\r'
                return new ck(aj1);
            }

        case 4: // '\004'
            return new ch(aj1);

        case 5: // '\005'
            return new ci(aj1);
        }
    }

    public abstract String a()
        throws y;
}
