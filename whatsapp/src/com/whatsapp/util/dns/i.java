// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.util.dns:
//            f, e

class i
{

    private static final String z[];
    private final int a;
    private final String b[];
    private final short c;

    private i(String as[], short word0, int j)
    {
        b = as;
        c = word0;
        a = j;
    }

    static i a(byte abyte0[], int j)
    {
        short word0;
        ArrayList arraylist;
        int k;
label0:
        {
            word0 = 0;
            int i1 = f.a;
            if (abyte0 == null)
            {
                try
                {
                    throw new NullPointerException(z[2]);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            try
            {
                if (abyte0.length < 1)
                {
                    throw new IllegalArgumentException(z[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            arraylist = new ArrayList();
            StringBuilder stringbuilder = new StringBuilder();
            k = j;
            int l;
            do
            {
                l = k;
                if (abyte0[k] == 0)
                {
                    break;
                }
                l = k;
                if ((abyte0[k] & 0xc0) != 0)
                {
                    break;
                }
                l = (byte)(abyte0[k] & 0x3f);
                int j1 = k + 1;
                try
                {
                    if (abyte0.length < j1 + l + 1)
                    {
                        throw new IllegalArgumentException(z[1]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                stringbuilder.setLength(0);
                k = 0;
                do
                {
                    if (k >= l)
                    {
                        break;
                    }
                    stringbuilder.append((char)abyte0[j1 + k]);
                    k = (byte)(k + 1);
                } while (i1 == 0);
                l = j1 + l;
                arraylist.add(stringbuilder.toString());
                k = l;
            } while (i1 == 0);
            k = l;
            if (abyte0[l] == 0)
            {
                k = l + 1;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            word0 = e.a((byte)(abyte0[k] & 0x3f), abyte0[k + 1]);
            k += 2;
        }
        return new i((String[])arraylist.toArray(new String[arraylist.size()]), word0, k - j);
    }

    static i a(String as[], short word0)
    {
        int k;
label0:
        {
            int j = 0;
            int i1 = f.a;
            int j1 = as.length;
            int l = 0;
            do
            {
                k = j;
                if (l >= j1)
                {
                    break;
                }
                String s = as[l];
                byte abyte0[];
                try
                {
                    abyte0 = s.getBytes(z[3]);
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    throw new Error(as);
                }
                try
                {
                    if (abyte0.length > 63)
                    {
                        throw new IllegalStateException(z[4]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    throw as;
                }
                k = j + (abyte0.length + 1);
                l++;
                j = k;
            } while (i1 == 0);
            j = k;
            if (word0 == 0)
            {
                j = k + 1;
                k = j;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            k = j + 2;
        }
        return new i(as, word0, k);
    }

    void a(OutputStream outputstream)
    {
        int k;
        int j = 0;
        k = f.a;
        String as[] = b;
        int l = as.length;
        do
        {
            if (j >= l)
            {
                break;
            }
            byte abyte0[] = as[j].getBytes(z[6]);
            try
            {
                if (abyte0.length > 63)
                {
                    throw new IllegalStateException(z[5]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw outputstream;
            }
            outputstream.write(abyte0.length);
            outputstream.write(abyte0);
            j++;
        } while (k == 0);
        short word0 = c;
        if (word0 != 0)
        {
            try
            {
                outputstream.write(c >>> 8 & 0x3f | 0xc0);
                outputstream.write(c & 0xff);
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw outputstream;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_141;
            }
        }
        outputstream.write(0);
        return;
        outputstream;
        throw outputstream;
    }

    String[] a()
    {
        return b;
    }

    short b()
    {
        return c;
    }

    int c()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[7];
        obj = "U|N`\nZ{^|\tRf\035q\rHs";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "^kIp\037\034{N5\005RqRx\034PwIp";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "^kIp\037\034\177\\lLR}I5\016Y2S`\000P";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "iF{8T";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "H}Vp\002\034\177\\lLR}I5\016Y2Qz\002[wO5\030TsS5Z\0172_l\030Ya";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "H}Vp\002\034\177\\lLR}I5\016Y2Qz\002[wO5\030TsS5Z\0172_l\030Ya";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "iF{8T";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 108;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 60;
          goto _L9
_L5:
        byte1 = 18;
          goto _L9
_L6:
        byte1 = 61;
          goto _L9
        byte1 = 21;
          goto _L9
    }
}
