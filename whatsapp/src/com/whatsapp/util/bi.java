// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.util:
//            a_, at, ab, au, 
//            a9, ad, a8

public class bi
{

    public static final String a[];
    public static final HashSet c;
    private static final String z[];
    private a_ b[];

    public bi()
    {
    }

    public static double a(RandomAccessFile randomaccessfile)
    {
        byte abyte0[] = new byte[4];
        randomaccessfile.read(abyte0, 0, 4);
        byte byte0 = abyte0[0];
        byte byte1 = abyte0[1];
        byte byte2 = abyte0[2];
        return (double)(abyte0[3] & 0xff | (byte0 << 24 & 0xff000000 | 0 | byte1 << 16 & 0xff0000 | byte2 << 8 & 0xff00)) / 1073741824D;
    }

    private static a8 a(a_ aa_[])
    {
        int j = a_.c;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
                        if (i >= aa_.length)
                        {
                            break label1;
                        }
                        a_ a_1 = aa_[i];
                        if (a_1 instanceof at)
                        {
                            a8 a8 = a(((at)a_1).a());
                            if (a8 != null)
                            {
                                return a8;
                            }
                            if (j == 0)
                            {
                                break label2;
                            }
                        }
                        if (a_1 instanceof ab)
                        {
                            au au1 = (au)a(aa_, com/whatsapp/util/au);
                            if (au1 != null && z[3].equals(au1.g))
                            {
                                return ((ab)a_1).f;
                            }
                        }
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            i++;
        } while (true);
    }

    private static a_ a(a_ aa_[], Class class1)
    {
        int i;
        int j;
        j = a_.c;
        i = 0;
_L7:
        a_ a_2;
        if (i >= aa_.length)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        a_2 = aa_[i];
        if (!(a_2 instanceof at)) goto _L2; else goto _L1
_L1:
        a_ a_1 = a(((at)a_2).a(), class1);
        if (a_1 == null) goto _L4; else goto _L3
_L3:
        return a_1;
_L4:
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        a_1 = a_2;
        if (a_2.getClass() == class1) goto _L3; else goto _L5
_L5:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        return null;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static ad a(long l, String s, RandomAccessFile randomaccessfile)
    {
        if (z[2].equals(s))
        {
            return new au(l, s, randomaccessfile);
        }
        if (z[0].equals(s))
        {
            return new a9(l, s, randomaccessfile);
        }
        if (z[1].equals(s))
        {
            return new ab(l, s, randomaccessfile);
        } else
        {
            return new ad(l, s, randomaccessfile);
        }
    }

    public static String a(RandomAccessFile randomaccessfile, int i)
    {
        byte abyte0[] = new byte[i];
        randomaccessfile.read(abyte0, 0, i);
        return new String(abyte0);
    }

    public static Date a(long l)
    {
        return new Date((l - 0x7c25b080L) * 1000L);
    }

    protected static a_[] a(RandomAccessFile randomaccessfile, long l, long l1)
    {
        int i = a_.c;
        ArrayList arraylist = new ArrayList();
        do
        {
            if (l >= l1)
            {
                break;
            }
            randomaccessfile.seek(l);
            long l2 = d(randomaccessfile);
            if (randomaccessfile.getFilePointer() == l1 && i == 0)
            {
                break;
            }
            byte abyte0[] = new byte[4];
            if (randomaccessfile.read(abyte0, 0, abyte0.length) != abyte0.length)
            {
                throw new IOException(z[5]);
            }
            Object obj = new String(abyte0);
            if (l2 == 1L)
            {
                l2 = c(randomaccessfile);
            }
            if (l2 < 0L || l + l2 > randomaccessfile.length())
            {
                throw new IOException((new StringBuilder()).append(z[4]).append(l2).toString());
            }
            long l3;
            if (c.contains(obj))
            {
                obj = new at(l2, ((String) (obj)), a(randomaccessfile, randomaccessfile.getFilePointer(), l + l2));
            } else
            {
                obj = a(l2, ((String) (obj)), randomaccessfile);
            }
            arraylist.add(obj);
            if (l2 == 0L)
            {
                l3 = randomaccessfile.length();
                l = l3;
                if (i == 0)
                {
                    continue;
                }
            } else
            {
                l3 = l;
            }
            l = l3 + l2;
        } while (i == 0);
        randomaccessfile = new a_[arraylist.size()];
        arraylist.toArray(randomaccessfile);
        return randomaccessfile;
    }

    public static int b(RandomAccessFile randomaccessfile)
    {
        return randomaccessfile.readByte();
    }

    public static long c(RandomAccessFile randomaccessfile)
    {
        return 0L + (d(randomaccessfile) << 32) + d(randomaccessfile);
    }

    public static long d(RandomAccessFile randomaccessfile)
    {
        byte abyte0[] = new byte[4];
        randomaccessfile.read(abyte0, 0, 4);
        byte byte0 = abyte0[0];
        byte byte1 = abyte0[1];
        byte byte2 = abyte0[2];
        return (long)(abyte0[3] & 0xff | (byte0 << 24 & 0xff000000 | 0 | byte1 << 16 & 0xff0000 | byte2 << 8 & 0xff00));
    }

    public static int e(RandomAccessFile randomaccessfile)
    {
        byte abyte0[] = new byte[3];
        randomaccessfile.read(abyte0, 0, 3);
        byte byte0 = abyte0[0];
        byte byte1 = abyte0[1];
        return abyte0[2] & 0xff | (byte0 << 16 & 0xff0000 | 0 | byte1 << 8 & 0xff00);
    }

    public static double f(RandomAccessFile randomaccessfile)
    {
        byte abyte0[] = new byte[4];
        randomaccessfile.read(abyte0, 0, 4);
        byte byte0 = abyte0[0];
        byte byte1 = abyte0[1];
        byte byte2 = abyte0[2];
        return (double)(abyte0[3] & 0xff | (byte0 << 24 & 0xff000000 | 0 | byte1 << 16 & 0xff0000 | byte2 << 8 & 0xff00)) / 65536D;
    }

    public static int g(RandomAccessFile randomaccessfile)
    {
        return randomaccessfile.readByte() << 8 | randomaccessfile.readByte();
    }

    public a8 a()
    {
        return a(b);
    }

    public void a(File file)
    {
        file = new RandomAccessFile(file, "r");
        b = a(((RandomAccessFile) (file)), 0L, file.length());
        file.close();
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int j;
        boolean flag;
        flag = false;
        as = new String[6];
        obj = "\007[P)";
        byte0 = -1;
        as1 = as;
        j = 0;
_L10:
        int k;
        int l;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L7:
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\036FP)";
                j = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\002IT?";
                j = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "\034D\\(";
                j = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "\013YW I\002LKm\000\004[Y!\000\016\rK$\023\017\027\030";
                j = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                as1 = as;
                obj = ")BM!\r\004\nLm\033\017L\\m\b\036BUm\035\023]]";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[j] = ((String) (obj));
                z = as;
                as = new String[14];
                obj = "\007BW;";
                byte0 = 5;
                as1 = as;
                j = 0;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[j] = ((String) (obj));
                obj = "\036_Y&";
                byte0 = 6;
                j = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[j] = ((String) (obj));
                obj = "\037IL,";
                byte0 = 7;
                j = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[j] = ((String) (obj));
                obj = "\036_]+";
                byte0 = 8;
                j = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[j] = ((String) (obj));
                obj = "\003@Y=";
                byte0 = 9;
                j = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "\007IQ,";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\007DV+";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "\031YZ!";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "\017IL>";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "\007IJ,";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "\030@J,";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "\003@Y*";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "\034CJ=";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "\016DV+";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[j] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_344;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 105;
_L8:
        obj[k] = (char)(byte1 ^ c1);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 106;
          goto _L8
_L3:
        byte1 = 45;
          goto _L8
_L4:
        byte1 = 56;
          goto _L8
        byte1 = 77;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        a = as;
        c = new HashSet();
        for (int i = ((flag) ? 1 : 0); i < a.length; i++)
        {
            c.add(a[i]);
        }

    }
}
