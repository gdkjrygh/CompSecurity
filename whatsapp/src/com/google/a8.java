// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google:
//            af, gf, bi, co, 
//            e_, df, b3, h, 
//            u, fi, g8, cf, 
//            f_

final class a8
    implements Iterator
{

    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern j;
    private static final Pattern n;
    private static final Pattern o;
    private static final String z;
    private final af a;
    private f_ e;
    private final String h;
    private final cf i;
    private int k;
    private gf l;
    private long m;
    private final CharSequence p;

    a8(af af1, CharSequence charsequence, String s, cf cf1, long l1)
    {
        l = gf.NOT_READY;
        e = null;
        k = 0;
        if (af1 == null || cf1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (af af1)
            {
                throw af1;
            }
        }
        if (l1 < 0L)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            // Misplaced declaration of an exception variable
            catch (af af1)
            {
                throw af1;
            }
        }
        try
        {
            a = af1;
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        if (charsequence == null)
        {
            charsequence = "";
        }
        p = charsequence;
        h = s;
        i = cf1;
        m = l1;
    }

    private f_ a(int i1)
    {
        int j1 = af.k;
        Matcher matcher = c.matcher(p);
        do
        {
            if (m <= 0L || !matcher.find(i1))
            {
                break;
            }
            i1 = matcher.start();
            CharSequence charsequence = p.subSequence(i1, matcher.end());
            charsequence = a(af.o, charsequence);
            f_ f_1 = a(charsequence, i1);
            if (f_1 != null)
            {
                return f_1;
            }
            i1 += charsequence.length();
            m = m - 1L;
        } while (j1 == 0);
        return null;
    }

    private f_ a(CharSequence charsequence, int i1)
    {
        Object obj;
        String s;
        s = null;
        boolean flag;
        try
        {
            flag = j.matcher(charsequence).find();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            try
            {
                throw charsequence;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
        }
        obj = s;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (f.matcher(charsequence).find())
        {
            return null;
        }
        if (b.matcher(charsequence).find())
        {
            obj = p.toString().substring(charsequence.length() + i1);
            boolean flag1;
            try
            {
                flag1 = g.matcher(((CharSequence) (obj))).lookingAt();
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw charsequence;
            }
            obj = s;
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_131;
            }
        }
        s = charsequence.toString();
        charsequence = b(s, i1);
        obj = charsequence;
        if (charsequence == null)
        {
            return a(s, i1);
        }
        return ((f_) (obj));
    }

    private f_ a(String s, int i1)
    {
        Object obj;
        CharSequence charsequence;
        Matcher matcher;
        int l1;
        l1 = af.k;
        matcher = d.matcher(s);
        if (!matcher.find())
        {
            break MISSING_BLOCK_LABEL_223;
        }
        obj = s.substring(0, matcher.start());
        charsequence = a(af.g, ((CharSequence) (obj)));
        obj = b(charsequence.toString(), i1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = ((String) (obj));
_L4:
        return s;
_L2:
        m = m - 1L;
        int j1 = matcher.end();
        obj = s.substring(j1);
        obj = b(a(af.g, ((CharSequence) (obj))).toString(), i1 + j1);
        if (obj != null)
        {
            return ((f_) (obj));
        }
        m = m - 1L;
        if (m <= 0L)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        do
        {
            if (!matcher.find())
            {
                break;
            }
            int k1 = matcher.start();
            j1 = k1;
            if (l1 == 0)
            {
                continue;
            }
            j1 = k1;
            break;
        } while (true);
        s = s.substring(0, j1);
        s = a(af.g, ((CharSequence) (s)));
        boolean flag;
        try
        {
            flag = s.equals(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag)
        {
            return null;
        }
        obj = b(s.toString(), i1);
        s = ((String) (obj));
        if (obj != null) goto _L4; else goto _L3
_L3:
        m = m - 1L;
        return null;
    }

    private static CharSequence a(Pattern pattern, CharSequence charsequence)
    {
        Matcher matcher = pattern.matcher(charsequence);
        pattern = charsequence;
        if (matcher.find())
        {
            pattern = charsequence.subSequence(0, matcher.start());
        }
        return pattern;
    }

    private static String a(int i1, int j1)
    {
        if (i1 < 0 || j1 <= 0 || j1 < i1)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return (new StringBuilder()).append("{").append(i1).append(",").append(j1).append("}").toString();
        }
    }

    static boolean a(char c1)
    {
        boolean flag;
        try
        {
            flag = Character.isLetter(c1);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (Character.getType(c1) != 6)
        {
            return false;
        }
        Character.UnicodeBlock unicodeblock = Character.UnicodeBlock.of(c1);
        boolean flag1 = unicodeblock.equals(Character.UnicodeBlock.BASIC_LATIN);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag1 = unicodeblock.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag1 = unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_A);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag1 = unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag1 = unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_B);
        if (!flag1)
        {
            IllegalArgumentException illegalargumentexception2;
            boolean flag2;
            try
            {
                flag2 = unicodeblock.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_123;
            }
        }
        return true;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        illegalargumentexception2;
        throw illegalargumentexception2;
        return false;
    }

    static boolean a(af af1, bi bi1, StringBuilder stringbuilder, String as[])
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = af.k;
        stringbuilder = af.p.split(stringbuilder.toString());
        if (!bi1.e()) goto _L2; else goto _L1
_L1:
        int i1 = stringbuilder.length;
        i1 -= 2;
_L16:
        int j1 = stringbuilder.length;
        if (j1 == 1) goto _L4; else goto _L3
_L3:
        boolean flag;
        try
        {
            flag = stringbuilder[i1].contains(af1.c(bi1));
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        if (!flag) goto _L5; else goto _L4
_L4:
        flag = true;
_L7:
        return flag;
        af1;
        throw af1;
_L2:
        i1 = stringbuilder.length - 1;
        continue; /* Loop/switch isn't completed */
        af1;
        throw af1;
_L5:
        j1 = as.length - 1;
_L9:
        int k1 = i1;
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = i1;
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2;
        try
        {
            flag2 = stringbuilder[i1].equals(as[j1]);
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        flag = flag1;
        if (!flag2) goto _L7; else goto _L6
_L6:
        j1--;
        k1 = i1 - 1;
        i1 = k1;
        if (l1 == 0) goto _L9; else goto _L8
_L8:
        if (k1 < 0) goto _L11; else goto _L10
_L10:
        try
        {
            flag = stringbuilder[k1].endsWith(as[0]);
        }
        // Misplaced declaration of an exception variable
        catch (af af1)
        {
            throw af1;
        }
        if (!flag) goto _L11; else goto _L12
_L12:
        flag = true;
_L14:
        return flag;
_L11:
        flag = false;
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
    }

    static boolean a(bi bi1, af af1)
    {
        Object obj;
        Object obj1;
        try
        {
            obj = bi1.j();
            obj1 = co.FROM_DEFAULT_COUNTRY;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (obj == obj1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if ((obj = af1.d(af1.a(bi1.m()))) == null) goto _L1; else goto _L3
_L3:
        obj1 = af1.c(bi1);
        obj1 = af1.a(((e_) (obj)).B(), ((String) (obj1)));
        if (obj1 == null) goto _L1; else goto _L4
_L4:
        int i1 = ((df) (obj1)).m().length();
        if (i1 > 0)
        {
            boolean flag;
            try
            {
                flag = ((df) (obj1)).l();
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            if (!flag)
            {
                obj1 = ((df) (obj1)).m();
                obj1 = af.c(((String) (obj1)).substring(0, ((String) (obj1)).indexOf(z)));
                int j1;
                try
                {
                    j1 = ((String) (obj1)).length();
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                if (j1 != 0)
                {
                    return af1.a(new StringBuilder(af.c(bi1.q())), ((e_) (obj)), null);
                }
            }
        }
          goto _L1
        bi1;
        throw bi1;
    }

    static boolean a(bi bi1, String s, af af1)
    {
        int i1;
        int k1;
        k1 = af.k;
        i1 = 0;
_L6:
        int j1;
        if (i1 >= s.length() - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        char c1 = s.charAt(i1);
        if (c1 != 'x')
        {
            j1 = i1;
            if (c1 != 'X')
            {
                break MISSING_BLOCK_LABEL_130;
            }
        }
        j1 = s.charAt(i1 + 1);
        if (j1 != 120 && j1 != 88) goto _L2; else goto _L1
_L1:
        j1 = i1 + 1;
        b3 b3_1;
        b3 b3_2;
        try
        {
            b3_1 = af1.b(bi1, s.substring(j1));
            b3_2 = b3.NSN_MATCH;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (b3_1 == b3_2)
        {
            break MISSING_BLOCK_LABEL_130;
        }
_L4:
        return false;
_L2:
        boolean flag;
        try
        {
            flag = af.c(s.substring(i1)).equals(bi1.v());
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        j1 = i1;
        i1 = j1 + 1;
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        return true;
    }

    static boolean a(bi bi1, String s, af af1, h h1)
    {
        int i1 = af.k;
        s = af.a(s, true);
        String as[] = a(af1, bi1, ((df) (null)));
        boolean flag;
        try
        {
            flag = h1.a(af1, bi1, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (flag)
        {
            return true;
        }
        Object obj = u.b(bi1.m());
        if (obj != null)
        {
            obj = ((e_) (obj)).B().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String as1[] = a(af1, bi1, (df)((Iterator) (obj)).next());
                boolean flag1;
                try
                {
                    flag1 = h1.a(af1, bi1, s, as1);
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                if (flag1)
                {
                    return true;
                }
            } while (i1 == 0);
        }
        return false;
    }

    static boolean a(String s)
    {
        int i1 = s.indexOf('/');
        if (i1 > 0)
        {
            boolean flag;
            try
            {
                flag = s.substring(i1 + 1).contains("/");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private static String[] a(af af1, bi bi1, df df1)
    {
        if (df1 == null)
        {
            af1 = af1.a(bi1, fi.RFC3966);
            int j1 = af1.indexOf(';');
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = af1.length();
            }
            return af1.substring(af1.indexOf('-') + 1, i1).split("-");
        } else
        {
            return af1.a(af1.c(bi1), df1, fi.RFC3966).split("-");
        }
    }

    private f_ b(String s, int i1)
    {
        char c1;
        bi bi1;
        int j1;
        boolean flag;
        try
        {
            flag = o.matcher(s).matches();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        j1 = i.compareTo(cf.VALID);
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = n.matcher(s).lookingAt();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = p.charAt(i1 - 1);
        if (b(c1)) goto _L1; else goto _L3
_L3:
        flag = a(c1);
        if (flag) goto _L1; else goto _L4
_L4:
        int k1 = s.length() + i1;
        if (k1 >= p.length())
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = p.charAt(k1);
        if (b(c1)) goto _L1; else goto _L5
_L5:
        flag = a(c1);
        if (flag) goto _L1; else goto _L6
_L6:
        bi1 = a.a(s, h);
        if (!i.a(bi1, s, a)) goto _L1; else goto _L7
_L7:
        bi1.s();
        bi1.c();
        bi1.b();
        s = new f_(i1, s, bi1);
        return s;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        s;
        throw s;
        s;
        throw s;
    }

    private static boolean b(char c1)
    {
label0:
        {
            if (c1 != '%')
            {
                int i1;
                try
                {
                    i1 = Character.getType(c1);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (i1 != 26)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    static boolean b(af af1, bi bi1, StringBuilder stringbuilder, String as[])
    {
        int l1 = af.k;
        int j1 = 0;
        int i1 = 0;
        int k1;
label0:
        do
        {
label1:
            {
                k1 = i1;
                if (j1 >= as.length)
                {
                    break label0;
                }
                i1 = stringbuilder.indexOf(as[j1], i1);
                if (i1 < 0)
                {
                    return false;
                }
                k1 = i1 + as[j1].length();
                if (j1 != 0)
                {
                    break label1;
                }
                boolean flag;
                try
                {
                    if (k1 >= stringbuilder.length())
                    {
                        break label1;
                    }
                    flag = Character.isDigit(stringbuilder.charAt(k1));
                }
                // Misplaced declaration of an exception variable
                catch (af af1)
                {
                    throw af1;
                }
                if (flag)
                {
                    af1 = af1.c(bi1);
                    return stringbuilder.substring(k1 - as[j1].length()).startsWith(af1);
                }
            }
            j1++;
            i1 = k1;
        } while (l1 == 0);
        return stringbuilder.substring(k1).contains(bi1.v());
    }

    private static String z(char ac[])
    {
        int i1;
        int j1;
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            return (new String(ac)).intern();
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 78
    //                   1 84
    //                   2 90
    //                   3 96;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_96;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 70;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 42;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 39;
          goto _L8
    }

    private static char[] z(String s)
    {
        s = s.toCharArray();
        if (s.length < 2)
        {
            s[0] = (char)(s[0] ^ 0x46);
        }
        return s;
    }

    public f_ a()
    {
        try
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        f_ f_1 = e;
        e = null;
        l = gf.NOT_READY;
        return f_1;
    }

    public boolean hasNext()
    {
        Object obj;
        gf gf1;
        obj = l;
        gf1 = gf.NOT_READY;
        if (obj != gf1)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            e = a(k);
            obj = e;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            try
            {
                throw illegalargumentexception1;
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        l = gf.DONE;
        if (af.k == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        k = e.a();
        l = gf.READY;
        try
        {
            obj = l;
            gf1 = gf.READY;
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        return obj == gf1;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        String s;
        byte byte0;
        s = "q\033";
        byte0 = -1;
_L27:
        String s1 = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 443
    //                   1 459
    //                   2 475
    //                   3 491
    //                   4 311;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        z = s1;
        s = "\tNm\026j`W;\f\0321Q'\013s(ve\\vy\036k{n\tNm\026jaW";
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L25:
        StringBuilder stringbuilder;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        o = Pattern.compile(stringbuilder.append(s).append(s4).append(s3).append("*").toString());
        s2 = a(0, 2);
        s = a(0, 4);
        s3 = a(0, 19);
        s4 = (new StringBuilder()).append(z(z("\016\007n\u2037k\u2040\u2238\u30EA\uFF2Ak\uFF5A\n\266\212\u204D\u2035\u302A>\016\uFF4E\uFF5C\uFF11\uFF2B\t\032\016vK\b8\u2006\u2216\uFF48z"))).append(s).toString();
        s5 = (new StringBuilder()).append(z(z("\tZmi\"("))).append(a(1, 19)).toString();
        s1 = (new StringBuilder()).append(s1).append(z(z("~\uFF21"))).toString();
        s6 = (new StringBuilder()).append("[").append(s1).append("]").toString();
        n = Pattern.compile(s6);
        stringbuilder = new StringBuilder();
        s = "\tZm};\016t";
        byte0 = -1;
_L14:
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 4: default 292
    //                   0 629
    //                   1 660
    //                   2 699
    //                   3 734
    //                   4 755;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        stringbuilder = stringbuilder.append(s).append(s1);
        s = "\tZmi\"(w<";
        byte0 = 0;
        if (true) goto _L14; else goto _L13
_L13:
_L6:
        s2 = z(z("|vK\uFF2E\uFF7B"));
        s3 = (new StringBuilder()).append(z(z("\016t"))).append(s1).append(s2).append("]").toString();
        s4 = a(0, 3);
        stringbuilder = new StringBuilder();
        s = "}\025,|";
        byte0 = -1;
_L23:
        s = z(z(s));
        byte0;
        JVM INSTR tableswitch 0 5: default 424
    //                   0 507
    //                   1 522
    //                   2 556
    //                   3 581
    //                   4 610
    //                   5 65;
           goto _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L21:
        continue; /* Loop/switch isn't completed */
_L15:
        stringbuilder = stringbuilder.append(s).append(s1);
        s = "\b\003)";
        byte0 = 0;
        if (true) goto _L23; else goto _L22
_L22:
        if (true) goto _L25; else goto _L24
_L24:
_L2:
        j = Pattern.compile(s1);
        s = "}\025,\017yoq&\nu\b\025JCi\016\032'zy\tN?[nj\020M\027w\b\025JCi\016\032;\024\033jvr\016oz\002)\035\035d\030K{\"|\025JC=gW";
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        f = Pattern.compile(s1);
        s = "\016\033$z\0321Q%Z\035x\005K\030\035e\033K{\"\016\0079zy\016\032;\024\033\tN6|vx\030K{\"q";
        byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        b = Pattern.compile(s1);
        s = "oq&\ns\bvr";
        byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        g = Pattern.compile(s1);
        s = "}vM\uFF2F\uFF7D";
        byte0 = 4;
        continue; /* Loop/switch isn't completed */
_L16:
        stringbuilder = stringbuilder.append(s);
        s = "}\025,";
        byte0 = 1;
          goto _L23
_L17:
        stringbuilder = stringbuilder.append(s).append(s3).append("+").append("[").append(s2);
        s = "\b\003)";
        byte0 = 2;
          goto _L23
_L18:
        stringbuilder = stringbuilder.append(s).append(s3).append("+");
        s = "}\025,|";
        byte0 = 3;
          goto _L23
_L19:
        stringbuilder = stringbuilder.append(s).append(s1).append("]").append(s3);
        s = "~q";
        byte0 = 4;
          goto _L23
_L20:
        stringbuilder = stringbuilder.append(s).append(s2);
        s = "\b\003";
        byte0 = 5;
          goto _L23
_L8:
        d = Pattern.compile(stringbuilder.append(s).toString());
        stringbuilder = new StringBuilder();
        s = "}\025,";
        byte0 = 1;
          goto _L14
_L9:
        stringbuilder = stringbuilder.append(s).append(s6).append(s4).append(")").append(s2).append(s5);
        s = "}\025,";
        byte0 = 2;
          goto _L14
_L10:
        stringbuilder = stringbuilder.append(s).append(s4).append(s5).append(")").append(s3);
        s = "}\025,";
        byte0 = 3;
          goto _L14
_L11:
        stringbuilder = stringbuilder.append(s).append(af.z);
        s = "|\025";
        byte0 = 4;
          goto _L14
_L12:
        c = Pattern.compile(stringbuilder.append(s).toString(), 66);
        if (true) goto _L27; else goto _L26
_L26:
    }
}
