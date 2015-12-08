// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            v, al, dn, ap, 
//            am, dl, ax, do

final class dj
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', 
        '+', '-', '.', '/', ':'
    };

    private static char a(int i)
        throws v
    {
        if (i >= a.length)
        {
            throw v.a();
        } else
        {
            return a[i];
        }
    }

    static ap a(byte abyte0[], do do1, dl dl1, Hashtable hashtable)
        throws v
    {
        am am1;
        Vector vector;
        al al1;
        StringBuffer stringbuffer;
        boolean flag;
        al1 = new al(abyte0);
        stringbuffer = new StringBuffer(50);
        am1 = null;
        flag = false;
        vector = new Vector(1);
_L5:
        dn dn1;
        if (al1.a() < 4)
        {
            dn1 = dn.a;
        } else
        {
            try
            {
                dn1 = dn.a(al1.a(4));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw v.a();
            }
        }
        if (dn1.equals(dn.a)) goto _L2; else goto _L1
_L1:
        if (!dn1.equals(dn.h) && !dn1.equals(dn.i)) goto _L4; else goto _L3
_L3:
        flag = true;
_L2:
        if (dn1.equals(dn.a))
        {
            hashtable = stringbuffer.toString();
            do1 = vector;
            if (vector.isEmpty())
            {
                do1 = null;
            }
            int i;
            int j;
            if (dl1 == null)
            {
                dl1 = null;
            } else
            {
                dl1 = dl1.toString();
            }
            return new ap(abyte0, hashtable, do1, dl1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (dn1.equals(dn.d))
        {
            al1.a(16);
        } else
        if (dn1.equals(dn.f))
        {
            i = al1.a(8);
            if ((i & 0x80) == 0)
            {
                i &= 0x7f;
            } else
            if ((i & 0xc0) == 128)
            {
                i = (i & 0x3f) << 8 | al1.a(8);
            } else
            if ((i & 0xe0) == 192)
            {
                i = (i & 0x1f) << 16 | al1.a(16);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Bad ECI bits starting with byte ")).append(i).toString());
            }
            am1 = am.a(i);
            if (am1 == null)
            {
                throw v.a();
            }
        } else
        if (dn1.equals(dn.j))
        {
            i = al1.a(4);
            j = al1.a(dn1.a(do1));
            if (i == 1)
            {
                a(al1, stringbuffer, j);
            }
        } else
        {
            i = al1.a(dn1.a(do1));
            if (dn1.equals(dn.b))
            {
                c(al1, stringbuffer, i);
            } else
            if (dn1.equals(dn.c))
            {
                a(al1, stringbuffer, i, flag);
            } else
            if (dn1.equals(dn.e))
            {
                a(al1, stringbuffer, i, am1, vector, hashtable);
            } else
            if (dn1.equals(dn.g))
            {
                b(al1, stringbuffer, i);
            } else
            {
                throw v.a();
            }
        }
          goto _L2
    }

    private static void a(al al1, StringBuffer stringbuffer, int i)
        throws v
    {
        if (i * 13 > al1.a())
        {
            throw v.a();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int k = al1.a(13);
            k = k % 96 | k / 96 << 8;
            if (k < 959)
            {
                k += 41377;
            } else
            {
                k += 42657;
            }
            abyte0[i] = (byte)(k >> 8 & 0xff);
            abyte0[i + 1] = (byte)(k & 0xff);
            j--;
            i += 2;
        }
        try
        {
            stringbuffer.append(new String(abyte0, "GB2312"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (al al1)
        {
            throw v.a();
        }
    }

    private static void a(al al1, StringBuffer stringbuffer, int i, am am1, Vector vector, Hashtable hashtable)
        throws v
    {
        if (i << 3 > al1.a())
        {
            throw v.a();
        }
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)al1.a(8);
        }

        if (am1 == null)
        {
            al1 = ax.a(abyte0, hashtable);
        } else
        {
            al1 = am1.a();
        }
        try
        {
            stringbuffer.append(new String(abyte0, al1));
        }
        // Misplaced declaration of an exception variable
        catch (al al1)
        {
            throw v.a();
        }
        vector.addElement(abyte0);
    }

    private static void a(al al1, StringBuffer stringbuffer, int i, boolean flag)
        throws v
    {
        int j = stringbuffer.length();
        for (; i > 1; i -= 2)
        {
            int k = al1.a(11);
            stringbuffer.append(a(k / 45));
            stringbuffer.append(a(k % 45));
        }

        if (i == 1)
        {
            stringbuffer.append(a(al1.a(6)));
        }
        if (flag)
        {
            i = j;
            while (i < stringbuffer.length()) 
            {
                if (stringbuffer.charAt(i) == '%')
                {
                    if (i < stringbuffer.length() - 1 && stringbuffer.charAt(i + 1) == '%')
                    {
                        stringbuffer.deleteCharAt(i + 1);
                    } else
                    {
                        stringbuffer.setCharAt(i, '\035');
                    }
                }
                i++;
            }
        }
    }

    private static void b(al al1, StringBuffer stringbuffer, int i)
        throws v
    {
        if (i * 13 > al1.a())
        {
            throw v.a();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int k = al1.a(13);
            k = k % 192 | k / 192 << 8;
            if (k < 7936)
            {
                k += 33088;
            } else
            {
                k += 49472;
            }
            abyte0[i] = (byte)(k >> 8);
            abyte0[i + 1] = (byte)k;
            j--;
            i += 2;
        }
        try
        {
            stringbuffer.append(new String(abyte0, "SJIS"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (al al1)
        {
            throw v.a();
        }
    }

    private static void c(al al1, StringBuffer stringbuffer, int i)
        throws v
    {
        for (; i >= 3; i -= 3)
        {
            int j = al1.a(10);
            if (j >= 1000)
            {
                throw v.a();
            }
            stringbuffer.append(a(j / 100));
            stringbuffer.append(a((j / 10) % 10));
            stringbuffer.append(a(j % 10));
        }

        if (i == 2)
        {
            i = al1.a(7);
            if (i >= 100)
            {
                throw v.a();
            }
            stringbuffer.append(a(i / 10));
            stringbuffer.append(a(i % 10));
        } else
        if (i == 1)
        {
            i = al1.a(4);
            if (i >= 10)
            {
                throw v.a();
            } else
            {
                stringbuffer.append(a(i));
                return;
            }
        }
    }

}
