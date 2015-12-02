// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;

// Referenced classes of package com.whatsapp.util:
//            Log

public class a4
{

    private static final String z[];
    private final File a;

    public a4(File file)
    {
        if (file == null)
        {
            throw new NullPointerException(z[1]);
        }
        try
        {
            if (!file.isDirectory())
            {
                throw new IllegalArgumentException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        a = file;
    }

    private static long a(int i, String s, File file)
    {
        boolean flag = Log.f;
        String s1 = a(file);
        if (file.isDirectory())
        {
            Log.b(i, (new StringBuilder()).append(s).append(z[6]).append(s1).append(' ').append(file.getAbsolutePath()).toString());
            File afile[] = file.listFiles();
            if (afile == null)
            {
                try
                {
                    throw new IllegalStateException((new StringBuilder()).append(z[3]).append(file).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            int k = afile.length;
            long l = 0L;
            int j = 0;
            long l1;
            do
            {
                l1 = l;
                if (j >= k)
                {
                    break;
                }
                l1 = l + a(i, s, afile[j]);
                j++;
                l = l1;
            } while (!flag);
            Log.b(i, (new StringBuilder()).append(s).append(z[7]).append(s1).append(' ').append(file.getAbsolutePath()).append(z[5]).append(l1).toString());
            return l1;
        } else
        {
            Log.b(i, (new StringBuilder()).append(s).append(z[4]).append(s1).append(' ').append(file.getAbsolutePath()).append(' ').append(file.length()).toString());
            return file.length();
        }
    }

    private static String a(File file)
    {
        char ac[];
        ac = new char[2];
        ac;
        ac[0] = '-';
        ac[1] = '-';
        if (file.canRead())
        {
            ac[0] = 'r';
        }
        if (file.canWrite())
        {
            ac[1] = 'w';
        }
        return new String(ac);
        file;
        throw file;
        file;
        throw file;
    }

    public static void b(int i, String s, File file)
    {
        try
        {
            (new a4(file)).a(i, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.w((new StringBuilder()).append(s).append(z[0]).append(file).toString());
        }
    }

    public void a(int i, String s)
    {
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                Log.b(i, (new StringBuilder()).append(s).append(z[10]).append(a.getTotalSpace()).toString());
                Log.b(i, (new StringBuilder()).append(s).append(z[8]).append(a.getUsableSpace()).toString());
                Log.b(i, (new StringBuilder()).append(s).append(z[9]).append(a.getFreeSpace()).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        a(i, s, a);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "\002xX0\035]iI<\026\r";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "_rO'X@hS'XCrTs\032H=N&\024A";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_rO'X@hS'XOx\0002XItR6\033YrR*";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "HpP'\001\r{I?\035\rqI \f\r{R<\025\ryI!\035NiO!\001\r";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\002qSsU";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\riO'\031A=";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\002qSs\034";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\002qSs\034";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\002hS2\032Ax\177 \bL~Es";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\002{R6\035rnP2\033H=";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\002iO'\031ABS#\031Nx\0";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 120;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 45;
          goto _L9
_L5:
        byte1 = 29;
          goto _L9
_L6:
        byte1 = 32;
          goto _L9
        byte1 = 83;
          goto _L9
    }
}
