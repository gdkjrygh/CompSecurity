// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;


// Referenced classes of package com.google.common.escape:
//            UnicodeEscaper, Escapers, CharEscaper

static final class per extends UnicodeEscaper
{

    final CharEscaper val$escaper;

    protected char[] escape(int i)
    {
        if (i >= 0x10000) goto _L2; else goto _L1
_L1:
        char ac[] = val$escaper.escape((char)i);
_L4:
        return ac;
_L2:
        char ac1[];
label0:
        {
            ac = new char[2];
            Character.toChars(i, ac, 0);
            char ac3[] = val$escaper.escape(ac[0]);
            char ac2[] = val$escaper.escape(ac[1]);
            if (ac3 == null && ac2 == null)
            {
                return null;
            }
            int j;
            if (ac3 != null)
            {
                i = ac3.length;
            } else
            {
                i = 1;
            }
            if (ac2 != null)
            {
                j = ac2.length;
            } else
            {
                j = 1;
            }
            ac1 = new char[i + j];
            if (ac3 != null)
            {
                for (j = 0; j < ac3.length; j++)
                {
                    ac1[j] = ac3[j];
                }

            } else
            {
                ac1[0] = ac[0];
            }
            if (ac2 == null)
            {
                break label0;
            }
            j = 0;
            do
            {
                ac = ac1;
                if (j >= ac2.length)
                {
                    break;
                }
                ac1[i + j] = ac2[j];
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        ac1[i] = ac[1];
        return ac1;
    }

    (CharEscaper charescaper)
    {
        val$escaper = charescaper;
        super();
    }
}
