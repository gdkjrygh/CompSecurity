// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.whatsapp.util:
//            l

public class am
{

    private static final String z[];

    public static File a(File file)
    {
        return l.b(file, z[0]);
    }

    public static File a(File file, File file1)
    {
        File file2 = null;
        if (!file1.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = l.a(file, new Date(), z[3]);
        obj = new File(file.getParentFile(), ((String) (obj)));
        file = new GZIPOutputStream(new FileOutputStream(((File) (obj)), true));
        file1 = new FileInputStream(file1);
        file = Channels.newChannel(file);
        file1 = file1.getChannel();
        l.a(file1, file);
        if (file1 != null)
        {
            file1.close();
        }
        boolean flag;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
_L3:
        try
        {
            flag = ((File) (obj)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (flag)
        {
            return ((File) (obj));
        }
          goto _L2
        file;
        file1 = null;
        file = null;
_L6:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
          goto _L3
        file1;
        file = null;
_L5:
        if (file2 != null)
        {
            try
            {
                file2.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        throw file1;
_L2:
        return null;
        file1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        file2 = file1;
        file1 = exception;
        if (true) goto _L5; else goto _L4
_L4:
        file1;
        file1 = null;
          goto _L6
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
          goto _L6
    }

    public static void a(File file, int i)
    {
        l.a(file, i, z[1]);
    }

    public static ArrayList b(File file, int i)
    {
        return l.b(file, i, z[2]);
    }

    public static boolean b(File file, File file1)
    {
        return l.c(file, file1);
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "0\0053".toCharArray();
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 164
    //                   0 185
    //                   1 191
    //                   2 197
    //                   3 203;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_203;
_L3:
        byte byte0 = 104;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 30;
          goto _L9
_L5:
        byte0 = 98;
          goto _L9
_L6:
        byte0 = 73;
          goto _L9
        byte0 = 27;
          goto _L9
    }
}
