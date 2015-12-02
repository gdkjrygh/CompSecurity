// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.whatsapp.util:
//            Log, aa

public class l
{

    private static final String z[];

    private static int a(File file, File file1)
    {
        int i;
        int j;
        int i1;
        boolean flag;
        j = 0;
        i = 0;
        flag = Log.f;
        file1 = file1.getName();
        i1 = file1.length() + 1;
        file = file.getParentFile().listFiles();
        if (file == null) goto _L2; else goto _L1
_L1:
        int k;
        int j1;
        j1 = file.length;
        k = 0;
_L7:
        j = i;
        if (k >= j1) goto _L2; else goto _L3
_L3:
        String s = file[k].getName();
        j = i;
        if (!s.startsWith(file1))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        int k1 = s.length();
        int l1;
        try
        {
            l1 = s.length();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        j = i;
        if (k1 > l1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        j = i;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        j = Integer.parseInt(s.substring(i1, k1));
        if (j > i)
        {
            i = j;
        }
        j = i;
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return j;
        NumberFormatException numberformatexception;
        numberformatexception;
        j = i;
        if (true) goto _L5; else goto _L4
_L4:
        k++;
        i = j;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static int a(String s)
    {
        return s.indexOf('.') + "-".length();
    }

    public static String a(File file, Date date, String s)
    {
        String s1;
        String s2;
        File afile[];
        boolean flag;
        flag = Log.f;
        s1 = a(file.getName(), date);
        s2 = a(file.getName(), s);
        date = null;
        s = null;
        afile = file.getParentFile().listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int i1;
        i1 = afile.length;
        j = 0;
        i = 0;
        file = s;
_L7:
        date = file;
        if (j >= i1) goto _L2; else goto _L3
_L3:
        int k;
        s = afile[j];
        String s3 = s.getName();
        date = file;
        k = i;
        int j1;
        int k1;
        int l1;
        boolean flag1;
        try
        {
            if (!s3.startsWith(s1))
            {
                break MISSING_BLOCK_LABEL_198;
            }
            flag1 = s3.endsWith(s2);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        date = file;
        k = i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        j1 = s1.length() + 1;
        k1 = s3.length() - s2.length();
        try
        {
            l1 = s3.length();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        date = file;
        k = i;
        if (k1 >= l1)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        date = file;
        k = i;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        k = Integer.parseInt(s3.substring(j1, k1));
        if (k > i)
        {
            i = k;
            file = s;
        }
        k = i;
        date = file;
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        if (date != null)
        {
            try
            {
                file = date.getName();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            return file;
        } else
        {
            return (new StringBuilder()).append(s1).append(z[1]).append(s2).toString();
        }
        date;
        date = file;
        k = i;
        if (true) goto _L5; else goto _L4
_L4:
        j++;
        file = date;
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String a(String s, String s1)
    {
        s = s.substring(s.indexOf('.'));
        return (new StringBuilder()).append(s).append(s1).toString();
    }

    private static String a(String s, Date date)
    {
        s = s.substring(0, s.indexOf('.'));
        return (new StringBuilder()).append(s).append("-").append(a().format(date)).toString();
    }

    private static SimpleDateFormat a()
    {
        return new SimpleDateFormat(z[0], Locale.US);
    }

    public static ArrayList a(File file, int i, String as[])
    {
        ArrayList arraylist;
        Object obj;
        Date date;
        String s;
        String s1;
        String s2;
        String as1[];
        File afile[];
        boolean flag2;
        flag2 = Log.f;
        obj = a();
        arraylist = new ArrayList();
        date = new Date();
        s = ((SimpleDateFormat) (obj)).toPattern();
        s1 = b(file.getName());
        s2 = a(file.getName(), "");
        as1 = new String[as.length];
        int j = 0;
        do
        {
            if (j >= as1.length)
            {
                break;
            }
            as1[j] = a(file.getName(), as[j]);
            j++;
        } while (!flag2);
        afile = file.getParentFile().listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int k;
        int j1;
        j1 = afile.length;
        k = 0;
_L17:
        if (k >= j1) goto _L2; else goto _L3
_L3:
        boolean flag;
        File file1 = afile[k];
        Object obj1 = file1.getName();
        String s3;
        int i1;
        int k1;
        long l1;
        boolean flag1;
        try
        {
            flag = ((String) (obj1)).startsWith(s1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (!flag && !flag2) goto _L5; else goto _L4
_L4:
        flag1 = ((String) (obj1)).endsWith(s2);
        k1 = as1.length;
        i1 = 0;
_L10:
        flag = flag1;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = as1[i1];
        if (flag1)
        {
            flag = flag1;
            if (!flag2)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (flag1) goto _L7; else goto _L6
_L6:
        try
        {
            flag = ((String) (obj1)).endsWith(s3);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                throw file;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        if (!flag) goto _L8; else goto _L7
_L7:
        flag = true;
_L15:
        i1++;
        flag1 = flag;
        if (!flag2) goto _L10; else goto _L9
_L9:
        if (!flag) goto _L5; else goto _L11
_L11:
        obj1 = ((String) (obj1)).substring(s1.length(), s1.length() + s.length());
        obj1 = ((SimpleDateFormat) (obj)).parse(((String) (obj1)));
        l1 = (date.getTime() - ((Date) (obj1)).getTime()) / 0x5265c00L;
        if (i < 0 || l1 < (long)i)
        {
            try
            {
                arraylist.add(file1);
            }
            catch (ParseException parseexception)
            {
                try
                {
                    throw parseexception;
                }
                catch (ParseException parseexception1) { }
            }
        }
_L5:
        if (!flag2) goto _L12; else goto _L2
_L2:
        if (i < 0)
        {
            try
            {
                flag = file.exists();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                try
                {
                    throw file;
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    throw file;
                }
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_348;
            }
        }
        if (!a(file, i))
        {
            break MISSING_BLOCK_LABEL_354;
        }
        arraylist.add(file);
        i1 = as.length;
        k = 0;
_L14:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = as[k];
        obj = new File((new StringBuilder()).append(file.getPath()).append(((String) (obj))).toString());
        if (i < 0)
        {
            try
            {
                flag = ((File) (obj)).exists();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                try
                {
                    throw file;
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    throw file;
                }
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_430;
            }
        }
        if (!a(((File) (obj)), i))
        {
            break MISSING_BLOCK_LABEL_437;
        }
        arraylist.add(obj);
        k++;
        if (!flag2) goto _L14; else goto _L13
_L13:
        Collections.sort(arraylist, new aa(null));
        return arraylist;
_L8:
        flag = false;
          goto _L15
_L12:
        k++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static ArrayList a(ArrayList arraylist)
    {
        Collections.sort(arraylist, new aa(null));
        return arraylist;
    }

    public static void a(File file, int i, String s)
    {
        SimpleDateFormat simpledateformat;
        Date date;
        String s1;
        String s2;
        String s3;
        boolean flag;
        flag = Log.f;
        simpledateformat = a();
        date = new Date();
        s1 = simpledateformat.toPattern();
        s2 = a(file.getName(), s);
        s3 = b(file.getName());
        s = null;
        if (i >= 0) goto _L2; else goto _L1
_L1:
        int j = file.getName().indexOf('.');
        if (j != -1) goto _L4; else goto _L3
_L3:
        return;
_L4:
        s = file.getName().substring(0, j);
_L2:
        file = file.getParentFile().listFiles();
        if (file == null) goto _L3; else goto _L5
_L5:
        int k;
        k = file.length;
        j = 0;
_L9:
        if (j >= k) goto _L3; else goto _L6
_L6:
        File file1;
        Object obj1;
        file1 = file[j];
        obj1 = file1.getName();
        if (i >= 0) goto _L8; else goto _L7
_L7:
        boolean flag1 = ((String) (obj1)).startsWith(s);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        file1.delete();
_L10:
        j++;
        if (flag)
        {
            return;
        }
          goto _L9
        file;
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        SecurityException securityexception1;
        securityexception1;
        if (!flag) goto _L10; else goto _L8
_L8:
        flag1 = ((String) (obj1)).startsWith(s3);
        if (!flag1) goto _L10; else goto _L11
_L11:
        try
        {
            flag1 = ((String) (obj1)).endsWith(s2);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (!flag1) goto _L10; else goto _L12
_L12:
        int i1 = s3.length() + s1.length();
        Object obj;
        int j1;
        long l1;
        try
        {
            j1 = ((String) (obj1)).length();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (i1 > j1 && !flag) goto _L10; else goto _L13
_L13:
        obj1 = ((String) (obj1)).substring(s3.length(), i1);
        obj1 = simpledateformat.parse(((String) (obj1)));
        l1 = (date.getTime() - ((Date) (obj1)).getTime()) / 0x5265c00L;
        if (l1 <= (long)i) goto _L10; else goto _L14
_L14:
        file1.delete();
          goto _L10
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        catch (SecurityException securityexception) { }
          goto _L10
        file;
        throw file;
    }

    public static void a(FileChannel filechannel, WritableByteChannel writablebytechannel)
    {
        boolean flag = Log.f;
        long l1 = 0L;
        do
        {
            if (l1 >= filechannel.size())
            {
                break;
            }
            filechannel.transferTo(l1, Math.min(0x20000L, filechannel.size() - l1), writablebytechannel);
            l1 += 0x20000L;
        } while (!flag);
    }

    private static boolean a(File file, int i)
    {
        float f = (System.currentTimeMillis() - file.lastModified()) / 0x5265c00L;
        boolean flag;
        try
        {
            flag = file.exists();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                throw file;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if ((System.currentTimeMillis() - file.lastModified()) / 0x5265c00L <= (long)i)
        {
            return true;
        }
        return false;
    }

    public static boolean a(File file, String s)
    {
        boolean flag = false;
        if (file.exists())
        {
            try
            {
                s = a(file, new Date(), s);
                flag = file.renameTo(new File(file.getParentFile(), s));
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
        }
        return flag;
    }

    public static File b(File file, String s)
    {
        Object obj = new Date();
        String s2 = a(file.getName(), ((Date) (obj)));
        String s3 = a(file.getName(), s);
        String s1 = "1";
        obj = a(file, ((Date) (obj)), s);
        s = s1;
        if (obj != null)
        {
            int i = s2.length() + 1;
            int j = ((String) (obj)).length() - s3.length();
            s = s1;
            if (i < j)
            {
                try
                {
                    s = Integer.toString(Integer.parseInt(((String) (obj)).substring(i, j)) + 1);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s = s1;
                }
            }
        }
        s = (new StringBuilder()).append(s2).append(".").append(s).append(s3).toString();
        file = new File(file.getParent(), s);
        file.createNewFile();
        return file;
    }

    private static String b(String s)
    {
        return a(s, new Date()).substring(0, a(s));
    }

    public static ArrayList b(File file, int i, String s)
    {
        SimpleDateFormat simpledateformat;
        ArrayList arraylist;
        Date date;
        String s1;
        String s2;
        boolean flag;
        flag = Log.f;
        simpledateformat = a();
        arraylist = new ArrayList();
        date = new Date();
        s1 = simpledateformat.toPattern();
        s = a(file.getName(), s);
        s2 = b(file.getName());
        file = file.getParentFile().listFiles();
        if (file == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        Arrays.sort(file);
        k = file.length;
        j = 0;
_L3:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        File file1 = file[j];
        Object obj = file1.getName();
        long l1;
        boolean flag1;
        try
        {
            if (!((String) (obj)).startsWith(s2))
            {
                break MISSING_BLOCK_LABEL_181;
            }
            flag1 = ((String) (obj)).endsWith(s);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj = ((String) (obj)).substring(s2.length(), s2.length() + s1.length());
        obj = simpledateformat.parse(((String) (obj)));
        l1 = (date.getTime() - ((Date) (obj)).getTime()) / 0x5265c00L;
        if (l1 < (long)i)
        {
            try
            {
                arraylist.add(file1);
            }
            catch (ParseException parseexception)
            {
                try
                {
                    throw parseexception;
                }
                catch (ParseException parseexception1) { }
            }
        }
        j++;
        if (!flag) goto _L3; else goto _L2
_L2:
        return arraylist;
    }

    public static ArrayList b(File file, File file1)
    {
        boolean flag = Log.f;
        ArrayList arraylist = new ArrayList();
        int j = a(file, file1);
        file = file.getParent();
        int i = 1;
        do
        {
            if (i > j)
            {
                break;
            }
            File file2 = new File(file, (new StringBuilder()).append(file1.getName()).append(".").append(i).toString());
            try
            {
                if (file2.exists())
                {
                    arraylist.add(file2);
                }
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw file;
            }
            i++;
        } while (!flag);
        return arraylist;
    }

    public static boolean c(File file, File file1)
    {
        boolean flag = false;
        if (file.exists())
        {
            int i = a(file, file1);
            file1 = new File((new StringBuilder()).append(file1.getPath()).append(".").append(i + 1).toString());
            try
            {
                flag = file.renameTo(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
        }
        return flag;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "|U/\004'Ha{\031n";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "+\035";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 5;
          goto _L9
_L5:
        byte0 = 44;
          goto _L9
_L6:
        byte0 = 86;
          goto _L9
        byte0 = 125;
          goto _L9
    }
}
