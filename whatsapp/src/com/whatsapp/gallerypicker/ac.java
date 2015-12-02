// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, aq, ax, ab, 
//            a, am, a0, ar, 
//            b5, ai, t

public class ac
{

    public static final String a;
    public static final String b;
    private static final String z[];

    private static Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1)
    {
        if (contentresolver == null)
        {
            return null;
        }
        try
        {
            contentresolver = contentresolver.query(uri, as, s, as1, s1);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return null;
        }
        return contentresolver;
    }

    public static ai a(ContentResolver contentresolver, a a1, int i, int j, String s)
    {
        return a(contentresolver, a(a1, i, j, s));
    }

    public static ai a(ContentResolver contentresolver, aq aq1)
    {
        Object obj;
        String s;
        int i;
        int j;
        int k;
        i = ImagePreview.B;
        obj = aq1.c;
        j = aq1.a;
        k = aq1.e;
        s = aq1.b;
        Uri uri = aq1.f;
        if (aq1.d || contentresolver == null)
        {
            try
            {
                contentresolver = new ax(null);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
            return contentresolver;
        }
        if (uri != null)
        {
            try
            {
                contentresolver = new ab(contentresolver, uri);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
            return contentresolver;
        }
        boolean flag = a(false);
        aq1 = new ArrayList();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        a a1 = a.INTERNAL;
        if (obj != a1)
        {
            a a2;
            if ((j & 1) != 0)
            {
                try
                {
                    aq1.add(new am(contentresolver, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, k, s));
                }
                // Misplaced declaration of an exception variable
                catch (ContentResolver contentresolver)
                {
                    throw contentresolver;
                }
            }
            if ((j & 4) != 0)
            {
                try
                {
                    aq1.add(new a0(contentresolver, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, k, s));
                }
                // Misplaced declaration of an exception variable
                catch (ContentResolver contentresolver)
                {
                    throw contentresolver;
                }
            }
        }
        a2 = a.INTERNAL;
        if (obj == a2)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        a2 = a.ALL;
        if (obj != a2)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        if ((j & 1) != 0)
        {
            try
            {
                aq1.add(new am(contentresolver, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, k, s));
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
        }
        contentresolver = aq1.iterator();
        do
        {
            if (!contentresolver.hasNext())
            {
                break;
            }
            obj = (ar)contentresolver.next();
            try
            {
                if (((ar) (obj)).e())
                {
                    ((ar) (obj)).b();
                    contentresolver.remove();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
        } while (i == 0);
        if (aq1.size() == 1)
        {
            return (ar)aq1.get(0);
        } else
        {
            return new b5((ai[])aq1.toArray(new ai[aq1.size()]), k);
        }
        contentresolver;
        throw contentresolver;
        contentresolver;
        try
        {
            throw contentresolver;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver) { }
        throw contentresolver;
    }

    public static aq a(a a1, int i, int j, String s)
    {
        aq aq1 = new aq();
        aq1.c = a1;
        aq1.a = i;
        aq1.e = j;
        aq1.b = s;
        return aq1;
    }

    private static boolean a()
    {
        Object obj;
        File file;
        obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append(z[3]).toString();
        file = new File(((String) (obj)));
        if (file.isDirectory()) goto _L2; else goto _L1
_L1:
        boolean flag = file.mkdirs();
        if (flag) goto _L2; else goto _L3
_L3:
        return false;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L2:
        obj = new File(((String) (obj)), z[4]);
        try
        {
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
            }
        }
        catch (IOException ioexception)
        {
            try
            {
                throw ioexception;
            }
            catch (IOException ioexception1)
            {
                return false;
            }
        }
        if (!((File) (obj)).createNewFile()) goto _L3; else goto _L4
_L4:
        ((File) (obj)).delete();
        return true;
    }

    public static boolean a(ContentResolver contentresolver)
    {
        contentresolver = a(contentresolver, MediaStore.getMediaScannerUri(), new String[] {
            z[6]
        }, null, null, null);
        if (contentresolver != null)
        {
            int i;
            boolean flag;
            try
            {
                i = contentresolver.getCount();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                throw contentresolver;
            }
            if (i == 1)
            {
                contentresolver.moveToFirst();
                flag = z[5].equals(contentresolver.getString(0));
            } else
            {
                flag = false;
            }
            contentresolver.close();
            return flag;
        } else
        {
            return false;
        }
    }

    public static boolean a(t t1)
    {
        return a(t1.b());
    }

    public static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return s.startsWith(z[0]);
        }
    }

    public static boolean a(boolean flag)
    {
        Object obj;
        boolean flag1 = true;
        obj = Environment.getExternalStorageState();
        boolean flag2;
        try
        {
            flag2 = z[2].equals(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag2) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            flag1 = a();
        }
_L4:
        return flag1;
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag = z[1].equals(obj);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        return false;
    }

    public static ai b()
    {
        return a(null, c());
    }

    public static String b(String s)
    {
        return String.valueOf(s.toLowerCase().hashCode());
    }

    public static aq c()
    {
        aq aq1 = new aq();
        aq1.d = true;
        return aq1;
    }

    static 
    {
        Object obj;
        Object aobj[];
        byte byte0;
        int i;
        aobj = new String[7];
        obj = "x\020\003tV!";
        byte0 = -1;
        i = 0;
_L18:
        String as[];
        int k;
        int l;
        as = ((String []) (aobj));
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L16:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 5: default 88
    //                   0 104
    //                   1 120
    //                   2 136
    //                   3 152
    //                   4 168
    //                   5 185;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        as[i] = ((String) (obj));
        obj = "c\026\022\177Mk\0358cV";
        i = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as[i] = ((String) (obj));
        obj = "c\026\022\177Mk\035";
        i = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as[i] = ((String) (obj));
        obj = "!=$Xt";
        i = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as[i] = ((String) (obj));
        obj = " \t\025~[k";
        i = 4;
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as[i] = ((String) (obj));
        i = 5;
        obj = "k\001\023tK`\030\013";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as[i] = ((String) (obj));
        i = 6;
        obj = "x\026\013dTk";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        int j;
        as[i] = ((String) (obj));
        z = ((String []) (aobj));
        obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().toString());
        aobj = "!=$Xt!:\006|\\|\030".toCharArray();
        j = aobj.length;
        i = 0;
          goto _L10
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 304
    //                   0 327
    //                   1 334
    //                   2 341
    //                   3 348;
           goto _L11 _L12 _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_348;
_L11:
        j = 57;
_L17:
        obj[k] = (char)(j ^ c1);
        k++;
          goto _L16
_L12:
        j = 14;
          goto _L17
_L13:
        j = 121;
          goto _L17
_L14:
        j = 103;
          goto _L17
        j = 17;
          goto _L17
        if (true) goto _L18; else goto _L2
_L10:
        char c1;
        if (j <= i)
        {
            a = ((StringBuilder) (obj)).append((new String(((char []) (aobj)))).intern()).toString();
            b = b(a);
            return;
        }
        k = aobj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 396
    //                   0 417
    //                   1 423
    //                   2 429
    //                   3 435;
           goto _L19 _L20 _L21 _L22 _L23
_L23:
        break MISSING_BLOCK_LABEL_435;
_L20:
        break; /* Loop/switch isn't completed */
_L19:
        byte0 = 57;
_L25:
        aobj[i] = (char)(byte0 ^ k);
        i++;
        if (true) goto _L10; else goto _L24
_L24:
        byte0 = 14;
          goto _L25
_L21:
        byte0 = 121;
          goto _L25
_L22:
        byte0 = 103;
          goto _L25
        byte0 = 17;
          goto _L25
    }
}
