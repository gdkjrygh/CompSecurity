// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.E;
import org.H;
import org.S;

public class e
    implements r
{

    public static String c;
    private static final String z[];
    private String a;
    private boolean b;
    private String d;
    private int e;
    public List f;
    private f g;
    private c h;
    private String i;

    public e()
    {
        this(c, c, false);
    }

    public e(String s, String s1, boolean flag)
    {
        int j;
label0:
        {
            j = c.g;
            super();
            f = new ArrayList();
            e = 0;
            if (s != null)
            {
                a = s;
                if (j == 0)
                {
                    break label0;
                }
            }
            a = c;
        }
label1:
        {
            if (s1 != null)
            {
                i = s1;
                if (j == 0)
                {
                    break label1;
                }
            }
            i = c;
        }
        b = flag;
    }

    private String a(String s, String s1)
    {
        boolean flag;
        try
        {
            flag = a.equalsIgnoreCase(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag)
        {
            return s;
        }
        Object obj = Charset.forName(a).encode(s);
        s = new byte[((ByteBuffer) (obj)).remaining()];
        ((ByteBuffer) (obj)).get(s);
        try
        {
            obj = new String(s, s1);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e((new StringBuilder()).append(z[9]).append(s1).toString());
            return new String(s);
        }
        return ((String) (obj));
    }

    private String a(String s, String s1, String s2)
    {
        int l = c.g;
        if (s2 == null) goto _L2; else goto _L1
_L1:
        boolean flag = s2.equals(z[8]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        flag = s2.equals("B");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        try
        {
            Log.e(z[5]);
            h.f = H.a(s.getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        if (!s2.equals(z[2])) goto _L2; else goto _L3
_L3:
        String s3 = s.replaceAll(z[0], " ").replaceAll(z[3], "\t");
        if (!b) goto _L5; else goto _L4
_L4:
        s = s3.split(z[7]);
        if (l == 0) goto _L6; else goto _L5
_L5:
        Object obj;
        int j;
        int i1;
        s2 = new StringBuilder();
        i1 = s3.length();
        obj = new ArrayList();
        j = 0;
_L15:
        char c1;
        int k;
        s = s2;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = s3.charAt(j);
        if (c1 != '\n')
        {
            break MISSING_BLOCK_LABEL_575;
        }
        ((ArrayList) (obj)).add(s2.toString());
        s2 = new StringBuilder();
        s = s2;
        k = j;
        if (l == 0) goto _L8; else goto _L7
_L7:
        s = s2;
_L20:
        if (c1 != '\r') goto _L10; else goto _L9
_L9:
        ((ArrayList) (obj)).add(s.toString());
        s = new StringBuilder();
        if (j >= i1 - 1) goto _L12; else goto _L11
_L11:
        if (s3.charAt(j + 1) == '\n')
        {
            j++;
        }
        if (l == 0) goto _L13; else goto _L10
_L10:
        String s4;
        try
        {
            s.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        k = j;
_L8:
        j = k + 1;
        s2 = s;
        if (l == 0) goto _L15; else goto _L14
_L14:
        s = s.toString();
        try
        {
            if (s.length() > 0)
            {
                ((ArrayList) (obj)).add(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = (String[])((ArrayList) (obj)).toArray(new String[0]);
_L6:
        obj = new StringBuilder();
        k = s.length;
        j = 0;
_L19:
        if (j >= k) goto _L17; else goto _L16
_L16:
        s4 = s[j];
        s2 = s4;
        if (s4.endsWith("="))
        {
            s2 = s4.substring(0, s4.length() - 1);
        }
        ((StringBuilder) (obj)).append(s2);
        if (l == 0) goto _L18; else goto _L17
_L17:
        try
        {
            s = ((StringBuilder) (obj)).toString().getBytes(a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append(z[6]).append(a).toString());
            s = ((StringBuilder) (obj)).toString().getBytes();
        }
        try
        {
            s = E.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e((new StringBuilder()).append(z[4]).append(s).toString());
            return "";
        }
        try
        {
            s2 = new String(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            Log.e((new StringBuilder()).append(z[1]).append(s1).toString());
            return new String(s);
        }
        return s2;
_L2:
        return a(s, s1);
_L18:
        j++;
        if (true) goto _L19; else goto _L13
_L13:
        k = j;
          goto _L8
_L12:
        k = j;
          goto _L8
        s = s2;
          goto _L20
    }

    private String a(List list)
    {
        int j = c.g;
        int k = list.size();
        if (k > 1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                stringbuilder.append((String)list.next()).append(";");
            } while (j == 0);
            j = stringbuilder.length();
            if (j > 0 && stringbuilder.charAt(j - 1) == ';')
            {
                return stringbuilder.substring(0, j - 1);
            } else
            {
                return stringbuilder.toString();
            }
        }
        if (k == 1)
        {
            return (String)list.get(0);
        } else
        {
            return "";
        }
    }

    public void a()
    {
        h = new c();
    }

    public void a(String s)
    {
label0:
        {
            if (d == null || d.equalsIgnoreCase(z[11]))
            {
                h.e.add(s);
                if (c.g == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[10]).append(s).toString());
        }
        d = null;
    }

    public void a(List list)
    {
        int j = c.g;
        if (list == null || list.size() == 0)
        {
            h.f = null;
            h.c.clear();
            h.c.add("");
            h.a = "";
            return;
        }
        String s = c;
        if (s == null || s.length() == 0)
        {
            s = i;
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            h.c.add(a(s1, s, null));
        } while (j == 0);
        h.a = a(h.c);
    }

    public void b()
    {
    }

    public void b(String s)
    {
        int j = c.g;
        f f1 = new f();
        f1.c = 1;
        f1.b = s;
        f.add(f1);
        e = f.size() - 1;
        g = (f)f.get(e);
        if (DialogToastActivity.g != 0)
        {
            c.g = j + 1;
        }
    }

    public void c()
    {
        g.a.add(h);
    }

    public void c(String s)
    {
        h.d.add(s);
    }

    public void d()
    {
    }

    public void d(String s)
    {
        h.b = s;
    }

    public void e()
    {
        ((f)f.get(e)).c = 0;
        do
        {
            if (e <= 0)
            {
                break;
            }
            e = e - 1;
        } while (((f)f.get(e)).c != 1);
        g = (f)f.get(e);
    }

    public void e(String s)
    {
        d = s;
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int j;
        as = new String[12];
        ac = "kb";
        byte0 = -1;
        j = 0;
_L23:
        String as1[];
        int l;
        int i1;
        as1 = as;
        ac = ac.toCharArray();
        i1 = ac.length;
        l = 0;
_L21:
        if (i1 > l) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 10: default 108
    //                   0 124
    //                   1 140
    //                   2 156
    //                   3 172
    //                   4 188
    //                   5 205
    //                   6 223
    //                   7 241
    //                   8 259
    //                   9 277
    //                   10 295;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        as1[j] = ac;
        ac = "\020#f.R2b{-\0273,l-S3x/!_70|'Ck";
        j = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[j] = ac;
        ac = "\007\027@\026r\022o_\020~\030\026N\000{\023";
        j = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[j] = ac;
        ac = "kK";
        j = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[j] = ac;
        j = 4;
        ac = "\020#f.R2b{-\0272'l-S3b~7X\"'koG$+a6V4.jx\027";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[j] = ac;
        j = 5;
        ac = "2'l-S3\000n1R`v5\022\177\031\026@";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[j] = ac;
        j = 6;
        ac = "\020#f.R2b{-\0273,l-S3x/!_70|'Ck";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as1[j] = ac;
        j = 7;
        ac = "[H";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as1[j] = ac;
        j = 8;
        ac = "\024\003\\\007\001b";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as1[j] = ac;
        j = 9;
        ac = "\020#f.R2b{-\0273,l-S3x/!_70|'Ck";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as1[j] = ac;
        j = 10;
        ac = "&0`2R$6v\022V$#b\024V:7jmY96P1C90jx";
        byte0 = 9;
        break; /* Loop/switch isn't completed */
_L13:
        as1[j] = ac;
        j = 11;
        ac = "\002\033_\007";
        byte0 = 10;
        break; /* Loop/switch isn't completed */
_L14:
        int k;
        as1[j] = ac;
        z = as;
        ac = "\003\026Io\017".toCharArray();
        k = ac.length;
        j = 0;
          goto _L15
_L2:
        c1 = ac[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 380
    //                   0 403
    //                   1 410
    //                   2 417
    //                   3 424;
           goto _L16 _L17 _L18 _L19 _L20
_L20:
        break MISSING_BLOCK_LABEL_424;
_L16:
        k = 55;
_L22:
        ac[l] = (char)(k ^ c1);
        l++;
          goto _L21
_L17:
        k = 86;
          goto _L22
_L18:
        k = 66;
          goto _L22
_L19:
        k = 15;
          goto _L22
        k = 66;
          goto _L22
        if (true) goto _L23; else goto _L2
_L15:
        char c1;
        if (k <= j)
        {
            c = (new String(ac)).intern();
            return;
        }
        l = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 472
    //                   0 493
    //                   1 499
    //                   2 505
    //                   3 511;
           goto _L24 _L25 _L26 _L27 _L28
_L28:
        break MISSING_BLOCK_LABEL_511;
_L25:
        break; /* Loop/switch isn't completed */
_L24:
        byte0 = 55;
_L30:
        ac[j] = (char)(byte0 ^ l);
        j++;
        if (true) goto _L15; else goto _L29
_L29:
        byte0 = 86;
          goto _L30
_L26:
        byte0 = 66;
          goto _L30
_L27:
        byte0 = 15;
          goto _L30
        byte0 = 66;
          goto _L30
    }
}
