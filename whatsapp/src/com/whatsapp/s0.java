// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            App, pi

public class s0
{

    private static File a;
    private static boolean b;
    private static SimpleDateFormat c;
    private static File d;
    private static File e;
    private static File f;
    private static File g;
    private static File h;
    private static File i;
    private static File j;
    private static File k;
    private static File l;
    private static File m;
    private static final String z[];

    public static File a()
    {
        if (!b)
        {
            c();
        }
        return e;
    }

    public static File a(byte byte0, int i1, boolean flag)
    {
label0:
        {
            int j1 = App.am;
            if (!b)
            {
                c();
            }
            File file;
            if (byte0 == 2)
            {
                if (i1 == 1)
                {
                    file = new File(f, c.format(new Date()));
                    if (j1 == 0)
                    {
                        break label0;
                    }
                }
                if (flag)
                {
                    file = m;
                } else
                {
                    file = l;
                }
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (byte0 == 1)
            {
                if (flag)
                {
                    file = d;
                } else
                {
                    file = i;
                }
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (byte0 == 3)
            {
                if (flag)
                {
                    file = a;
                } else
                {
                    file = h;
                }
                if (j1 == 0)
                {
                    break label0;
                }
            }
            file = new File(App.aK, z[27]);
        }
        return a(file, flag);
    }

    private static File a(File file, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        boolean flag3;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flag3 = file.isFile();
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        int i1;
        file.delete();
        i1 = App.am;
        flag1 = flag2;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        File file1;
        boolean flag4;
        try
        {
            flag4 = file.isDirectory();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        flag1 = flag2;
        if (flag4)
        {
            flag1 = true;
        }
        if (!flag1)
        {
            try
            {
                file.mkdirs();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        if (flag)
        {
            file1 = new File(file, z[26]);
            if (!file1.exists())
            {
                try
                {
                    file1.createNewFile();
                }
                catch (IOException ioexception)
                {
                    Log.e((new StringBuilder()).append(z[25]).append(file).append(" ").append(ioexception.toString()).toString());
                    return file;
                }
            }
        }
        return file;
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        throw file;
    }

    public static boolean a(File file)
    {
        if (!b)
        {
            c();
        }
        return file != null && file.getAbsolutePath().startsWith(g.getAbsolutePath());
    }

    private static boolean a(File file, long l1, long l2)
    {
        int j1 = App.am;
        Log.i((new StringBuilder()).append(z[8]).append(file).append(z[1]).append(l1 / 1000L).append(z[6]).append(l2).toString());
        if (file == null || !file.exists())
        {
            Log.e((new StringBuilder()).append(z[13]).append(file).append(z[4]).toString());
            return false;
        }
        if (!file.isDirectory())
        {
            Log.e((new StringBuilder()).append(z[7]).append(file).append(z[10]).toString());
            return false;
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            Log.e((new StringBuilder()).append(z[11]).append(file).append(z[9]).toString());
            return false;
        }
        Arrays.sort(afile, new pi());
        long l5 = System.currentTimeMillis();
        int k1 = afile.length;
        int i1 = 0;
        long l3 = l2;
label0:
        do
        {
label1:
            {
                if (i1 >= k1)
                {
                    break label0;
                }
                File file1 = afile[i1];
                long l6 = file1.length();
                if (file1.getName().equals(z[12]))
                {
                    l2 = l3;
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                long l4 = l3;
                if (file1.lastModified() >= l5 - l1)
                {
                    l4 = l3;
                    if (l6 <= l3)
                    {
                        l4 = l3 - l6;
                        l2 = l4;
                        if (j1 == 0)
                        {
                            break label1;
                        }
                    }
                }
                if (file1.delete())
                {
                    Log.i((new StringBuilder()).append(z[5]).append(file).append(z[3]).append(file1).toString());
                    l2 = l4;
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                Log.e((new StringBuilder()).append(z[0]).append(file).append(z[2]).append(file1).toString());
                l2 = l4;
            }
            i1++;
            l3 = l2;
        } while (j1 == 0);
        return true;
    }

    public static boolean a(boolean flag)
    {
        if (flag)
        {
            return a(a(), 0L, 0L);
        } else
        {
            return a(a(), 0x5265c00L, 0x1f400000L);
        }
    }

    public static File b()
    {
        if (!b)
        {
            c();
        }
        return b(k);
    }

    private static File b(File file)
    {
        return a(file, false);
    }

    public static void c()
    {
        g = b(new File(App.aK, z[18]));
        l = b(new File(g, z[19]));
        f = a(new File(g, z[14]), true);
        h = b(new File(g, z[23]));
        i = b(new File(g, z[22]));
        j = b(new File(g, z[20]));
        k = b(new File(g, z[15]));
        e = a(new File(g, z[17]), true);
        m = a(new File(l, z[24]), true);
        a = a(new File(h, z[16]), true);
        d = a(new File(i, z[21]), true);
        b = true;
    }

    public static File d()
    {
        if (!b)
        {
            c();
        }
        return b(j);
    }

    public static File e()
    {
        return new File(App.aK, z[28]);
    }

    public static File f()
    {
        if (!b)
        {
            c();
        }
        return f;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[30];
        obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\0049\0225g\0042\032 \"H6\r<\"B0\ty";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\004:\t+mV\177\f1gJ\177\037<nA+\0227e\004";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\004;\0365gP:\037y";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "\004;\024<q\0041\024-\"A'\022*v";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\004,\036:mJ;\bu\"@6\tyqM%\036ynM2\022-\"";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\004<\0327\"J0\017ynM,\017ydM3\036*";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\0046\bylK+[8\"@6\t";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\n1\0244g@6\032";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "B2\036*qE8\0360m\013<\027<cV\031\0245fA-[";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "s7\032-qe/\013yTK6\030<\"j0\017<q";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "s7\032-qe/\013yRV0\0350nA\177+1mP0\b";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "w:\025-";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "s7\032-qe/\013yAE3\027*";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "i:\0370c";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "s7\032-qe/\013yCQ;\0226";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "s>\0275RE/\036+";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "w:\025-";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "s7\032-qe/\013yKI>\034<q";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "s7\032-qe/\013yTM;\0366";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "w:\025-";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "B2\036*qE8\0360m\013/\t<rE-\036\037mH;\036+\"";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "\n1\0244g@6\032";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "i:\0370c";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\n\f\0238pA;";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "]&\002 uS";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                z = as;
                c = new SimpleDateFormat(z[29], Locale.US);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 760
    //                   0 782
    //                   1 789
    //                   2 796
    //                   3 803;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_803;
_L3:
        byte byte1 = 2;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 95;
          goto _L9
_L6:
        byte1 = 123;
          goto _L9
        byte1 = 89;
          goto _L9
    }
}
