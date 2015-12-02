// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import com.whatsapp.App;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.whatsapp.util:
//            Log

public class bp
{

    private static final String z[];

    public static File a(ArrayList arraylist)
    {
        boolean flag = Log.f;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = App.aK;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            try
            {
                throw arraylist;
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist) { }
            try
            {
                throw arraylist;
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                throw arraylist;
            }
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (arraylist.size() != 0) goto _L4; else goto _L2
_L4:
        File file = new File(App.aK, z[2]);
        obj = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        byte abyte0[];
        Iterator iterator;
        abyte0 = new byte[16384];
        iterator = arraylist.iterator();
_L8:
        File file1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = (File)iterator.next();
        arraylist = new BufferedInputStream(new FileInputStream(file1), 16384);
        Object obj1;
        Object obj2;
        obj2 = obj;
        obj1 = arraylist;
        ((ZipOutputStream) (obj)).putNextEntry(new ZipEntry(file1.getName()));
_L6:
        obj2 = obj;
        obj1 = arraylist;
        int i = arraylist.read(abyte0, 0, 16384);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj;
        obj1 = arraylist;
        ((ZipOutputStream) (obj)).write(abyte0, 0, i);
        if (!flag) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        obj1 = arraylist;
        arraylist.close();
        if (!flag) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L10:
        arraylist = file;
_L12:
        obj1 = arraylist;
        if (obj != null)
        {
            try
            {
                ((ZipOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                Log.e((new StringBuilder()).append(z[7]).append(arraylist.toString()).toString());
                return null;
            }
            return arraylist;
        }
        break; /* Loop/switch isn't completed */
_L9:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            Log.e((new StringBuilder()).append(z[0]).append(arraylist.toString()).toString());
        }
        arraylist = null;
        if (true) goto _L12; else goto _L11
        IOException ioexception;
        ioexception;
        obj = null;
        arraylist = null;
_L15:
        obj2 = obj;
        obj1 = arraylist;
        Log.e((new StringBuilder()).append(z[3]).append(ioexception.toString()).toString());
        if (arraylist != null)
        {
            try
            {
                arraylist.close();
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                Log.e((new StringBuilder()).append(z[5]).append(arraylist.toString()).toString());
            }
        }
        if (obj != null)
        {
            try
            {
                ((ZipOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                Log.e((new StringBuilder()).append(z[6]).append(arraylist.toString()).toString());
                return null;
            }
        }
        return null;
        arraylist;
        obj = null;
        obj1 = null;
_L14:
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e((new StringBuilder()).append(z[4]).append(((IOException) (obj1)).toString()).toString());
            }
        }
        if (obj != null)
        {
            try
            {
                ((ZipOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e((new StringBuilder()).append(z[1]).append(((IOException) (obj)).toString()).toString());
            }
        }
        throw arraylist;
        arraylist;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        arraylist;
        obj = obj2;
        if (true) goto _L14; else goto _L13
_L13:
        ioexception;
        arraylist = null;
        continue; /* Loop/switch isn't completed */
        ioexception;
        if (true) goto _L15; else goto _L2
_L2:
        obj1 = null;
_L11:
        return ((File) (obj1));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\_\032T";
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
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\Y\001\000\021";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\037Y\023\007\037\t_\004";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035AS";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\_\032T";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\_\032T";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\Y\001\000\021";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\026[\025\035]\000S\032\020T\001\031\016\035A\\Y\001\000\021";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 49;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 115;
          goto _L9
_L5:
        byte1 = 54;
          goto _L9
_L6:
        byte1 = 116;
          goto _L9
        byte1 = 116;
          goto _L9
    }
}
