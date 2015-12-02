// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipFile;

// Referenced classes of package com.whatsapp.util:
//            Log, bg

public class WhatsAppLibLoader
{

    private static Boolean a;
    private static final String z[];

    private static void a(Context context, UnsatisfiedLinkError unsatisfiedlinkerror, String as[])
    {
        String s;
        boolean flag;
label0:
        {
            flag = Log.f;
            if (Build.CPU_ABI.startsWith(z[20]))
            {
                s = z[15];
                if (!flag)
                {
                    break label0;
                }
            }
            boolean flag1;
            try
            {
                flag1 = Build.CPU_ABI.startsWith(z[22]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag1)
            {
                s = z[21];
                if (!flag)
                {
                    break label0;
                }
            }
            try
            {
                flag1 = Build.CPU_ABI.startsWith(z[19]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag1)
            {
                s = z[14];
                if (!flag)
                {
                    break label0;
                }
            }
            try
            {
                flag1 = Build.CPU_ABI.startsWith(z[25]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag1)
            {
                s = z[17];
                if (!flag)
                {
                    break label0;
                }
            }
            try
            {
                throw unsatisfiedlinkerror;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        ZipFile zipfile = new ZipFile((new ContextWrapper(context)).getPackageCodePath());
        Object obj = zipfile;
        int j = as.length;
        int i = 0;
_L4:
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = as[i];
        obj = zipfile;
        File file = new File(context.getFilesDir(), (new StringBuilder()).append(z[24]).append(((String) (obj1))).append(z[18]).toString());
        obj = zipfile;
        obj1 = zipfile.getEntry((new StringBuilder()).append(z[16]).append(s).append(z[26]).append(((String) (obj1))).append(z[27]).toString());
        if (obj1 != null);
        obj = zipfile;
        obj1 = zipfile.getInputStream(((java.util.zip.ZipEntry) (obj1)));
        obj = zipfile;
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        obj = zipfile;
        byte abyte0[] = new byte[1024];
_L2:
        int k = ((InputStream) (obj1)).read(abyte0);
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        fileoutputstream.write(abyte0, 0, k);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj = zipfile;
        ((InputStream) (obj1)).close();
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        obj = zipfile;
        fileoutputstream.close();
        obj = zipfile;
        System.load(file.getAbsolutePath());
        i++;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (zipfile == null)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        zipfile.close();
        return;
        context;
        obj = zipfile;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            context = zipfile;
        }
        finally { }
_L8:
        obj = context;
        Log.a(z[23], as);
        obj = context;
        throw unsatisfiedlinkerror;
_L6:
        if (obj != null)
        {
            try
            {
                ((ZipFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (UnsatisfiedLinkError unsatisfiedlinkerror)
            {
                Log.a(z[28], unsatisfiedlinkerror);
            }
        }
        throw context;
        context;
        obj = zipfile;
        throw context;
        context;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        obj = zipfile;
        ((InputStream) (obj1)).close();
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        obj = zipfile;
        fileoutputstream.close();
        obj = zipfile;
        throw context;
        context;
        obj = zipfile;
        throw context;
        context;
        obj = zipfile;
        throw context;
        context;
        Log.a(z[13], context);
        return;
        context;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        as;
        context = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(Context context, String as[])
    {
        boolean flag = Log.f;
        int i;
        int j;
        try
        {
            j = as.length;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.c(z[29], unsatisfiedlinkerror);
            a(context, unsatisfiedlinkerror, as);
            return;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        System.loadLibrary(as[i]);
        i++;
        if (!flag) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_11;
_L1:
    }

    private static boolean a()
    {
        byte abyte0[] = new byte[3];
        try
        {
            testLibraryUsable(abyte0);
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.c(z[30], unsatisfiedlinkerror);
            return false;
        }
        return Arrays.equals(new byte[] {
            31, 41, 59
        }, abyte0);
    }

    public static boolean a(Context context)
    {
        boolean flag1 = true;
        com/whatsapp/util/WhatsAppLibLoader;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        boolean flag2;
        a = Boolean.FALSE;
        a(context, new String[] {
            z[11], z[6], z[12], z[1]
        });
        a = Boolean.TRUE;
        flag2 = a();
        boolean flag;
        flag = flag1;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        Log.w(z[8]);
        a(context, new UnsatisfiedLinkError(z[0]), new String[] {
            z[2], z[4], z[9]
        });
        Log.i(z[7]);
        flag2 = a();
        flag = flag1;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        Log.w(z[3]);
        throw new UnsatisfiedLinkError(z[10]);
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        throw unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        Log.a(z[5], unsatisfiedlinkerror);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        (new Handler()).post(new bg(context));
        flag = false;
_L4:
        com/whatsapp/util/WhatsAppLibLoader;
        JVM INSTR monitorexit ;
        return flag;
        unsatisfiedlinkerror;
        throw unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        throw unsatisfiedlinkerror;
        context;
        com/whatsapp/util/WhatsAppLibLoader;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        flag = flag1;
        if (a.booleanValue()) goto _L4; else goto _L3
_L3:
        throw new UnsatisfiedLinkError();
        unsatisfiedlinkerror;
        throw unsatisfiedlinkerror;
        context;
        throw context;
    }

    private static native void testLibraryUsable(byte abyte0[]);

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[31];
        obj = "b\024`h.rZuebb\td*6\177\037!f+u\b`x+r\t!n'd\nh~'7\tti!r\trl7{Zme#s";
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
                obj = "t\017s|'%O4;{";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "f\031ng";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "{\023cx#e\003!\1771v\030hf+c\003!y6~\026m* e\025jo,,Zub0x\rhd%7\016n*!x\bs\1772cZhd1c\033mf#c\023ndbv\031uc4~\016x";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "`\022`~1v\nq";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "~\024r~#{\026`~+x\024!c17\031nx0b\nu1by\033uc4rZmc e\033sc'dZ`x'7\027hy1~\024f";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "e\037rk/g\026d";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "~\024r~#{\026!n+e\037b~bq\bngbv\nj*5x\bjo&,Zso6r\tuc,pZmc e\033ssbb\t`h+{\023us";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "b\024`h.rZuebb\td*.x\033eo&7\026hh0v\bho1,Zux;~\024f*+y\tuk.{Zec0r\031u*$e\025l*#g\021";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "t\017s|'%O4;{";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "b\024`h.rZuebb\td*.~\030sk0~\037r*&r\tqc6rZr\177!t\037ry$b\026!c,d\016`f.7\036hx't\016msbq\bngbv\nj";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "f\031ng";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "`\022`~1v\nq";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "`\022`~1v\nqf+u\026nk&r\b.i.x\tdp$";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "oB7";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "v\blo#u\023,|uv";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "{\023c%";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "z\023qy";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "9\tn";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "oB7";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "v\blo#u\023,|u";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "v\blo#u\023";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "v\blo#u\023";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                obj = "`\022`~1v\nqf+u\026nk&r\b.c-r\bse0";
                byte0 = 22;
                i = 23;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "{\023c";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "z\023qy";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "8\026hh";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "9\tn";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "`\022`~1v\nqf+u\026nk&r\b.i.x\tdp$";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "`\022`~1v\nqf+u\026nk&r\b.f-v\036dx0x\b";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "r\bse07\ric.rZuo1c\023omb{\023cx#e\003!\1771v\030hf+c\003";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                z = as;
                a = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 768
    //                   0 791
    //                   1 798
    //                   2 805
    //                   3 811;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_811;
_L3:
        byte byte1 = 66;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 23;
          goto _L9
_L5:
        byte1 = 122;
          goto _L9
_L6:
        byte1 = 1;
          goto _L9
        byte1 = 10;
          goto _L9
    }
}
