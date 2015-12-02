// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;

// Referenced classes of package com.whatsapp:
//            asy, App, bk

public class a1p
{

    public final String a;
    public final int b[];
    public final String c;
    public final String d[];
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final int i[];
    public final String j[];
    public final String k[];
    public final String l[];

    private a1p(String as[])
    {
        Object aobj[];
        boolean flag = false;
        Object obj = null;
        super();
        if (as.length < 12)
        {
            throw new IllegalArgumentException();
        }
        String s = as[0];
        String s3 = as[1];
        String s4 = as[2];
        String s5 = as[3];
        String s2 = as[4];
        String s1 = as[5];
        if (s3 == null || s4 == null)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
        }
        int i1;
        try
        {
            a = s3;
            e = s;
            g = Integer.parseInt(s4);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            try
            {
                throw as;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
        }
        if (s5 == null) goto _L2; else goto _L1
_L1:
        if (s5.trim().length() <= 0) goto _L2; else goto _L3
_L3:
        aobj = asy.e(s5);
_L12:
        try
        {
            i = ((int []) (aobj));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            try
            {
                throw as;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
        }
        if (s2 == null) goto _L5; else goto _L4
_L4:
        if (s2.trim().length() <= 0) goto _L5; else goto _L6
_L6:
        aobj = asy.e(s2);
_L13:
        try
        {
            b = ((int []) (aobj));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            try
            {
                throw as;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
        }
        if (s1 == null) goto _L8; else goto _L7
_L7:
        if (s1.trim().length() <= 0) goto _L8; else goto _L9
_L9:
        aobj = TextUtils.split(s1, ",");
_L14:
        l = ((String []) (aobj));
        i1 = as[7].length();
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        i1 = as[8].length();
        if (i1 <= 0)
        {
            try
            {
                i1 = as[9].length();
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
            if (i1 <= 0)
            {
                break MISSING_BLOCK_LABEL_222;
            }
        }
        flag = true;
        f = flag;
        if (!f) goto _L11; else goto _L10
_L10:
        aobj = TextUtils.split(as[7], ";");
_L15:
        try
        {
            k = ((String []) (aobj));
            if (!f)
            {
                break MISSING_BLOCK_LABEL_366;
            }
            aobj = TextUtils.split(as[8], ";");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw as;
        }
_L16:
        try
        {
            d = ((String []) (aobj));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw as;
        }
        aobj = obj;
        if (f)
        {
            aobj = TextUtils.split(as[9], ";");
        }
        j = ((String []) (aobj));
        h = as[10];
        c = as[11];
        return;
_L2:
        aobj = null;
          goto _L12
_L5:
        aobj = null;
          goto _L13
_L8:
        aobj = null;
          goto _L14
        as;
        try
        {
            throw as;
        }
        // Misplaced declaration of an exception variable
        catch (String as[]) { }
        throw as;
        as;
        throw as;
_L11:
        aobj = null;
          goto _L15
        aobj = null;
          goto _L16
    }

    a1p(String as[], bk bk)
    {
        this(as);
    }

    public int a()
    {
        int l1;
        l1 = App.am;
        int ai[];
        try
        {
            ai = b;
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
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        int k1;
        if (b.length != 0)
        {
            int i1 = b[0];
            int j1 = 1;
            do
            {
                k1 = i1;
                if (j1 >= b.length)
                {
                    break MISSING_BLOCK_LABEL_91;
                }
                k1 = i1;
                if (b[j1] < i1)
                {
                    k1 = b[j1];
                }
                j1++;
                i1 = k1;
            } while (l1 == 0);
            return k1;
        }
        k1 = 5;
        return k1;
    }

    public int a(int i1)
    {
        int j1;
        boolean flag;
        int l1;
        flag = false;
        l1 = App.am;
        try
        {
            j1 = a();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        j1 = -1;
_L4:
        return j1;
_L2:
        try
        {
            j1 = b();
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i1 > j1)
        {
            return 1;
        }
        int ai[] = b;
        j1 = ((flag) ? 1 : 0);
        if (ai == null) goto _L4; else goto _L3
_L3:
        IllegalArgumentException illegalargumentexception2;
        int k1;
        int i2;
        try
        {
            k1 = b.length;
        }
        catch (IllegalArgumentException illegalargumentexception3)
        {
            throw illegalargumentexception3;
        }
        j1 = ((flag) ? 1 : 0);
        if (k1 == 0) goto _L4; else goto _L5
_L5:
        k1 = 0;
_L8:
        if (k1 >= b.length)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i2 = b[k1];
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        j1 = ((flag) ? 1 : 0);
        if (i2 == i1) goto _L4; else goto _L6
_L6:
        k1++;
        if (l1 == 0) goto _L8; else goto _L7
_L7:
        return 1;
        illegalargumentexception2;
        throw illegalargumentexception2;
    }

    public String a(String s)
    {
        int k1 = App.am;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < s.length())
                {
                    String as[];
                    try
                    {
                        as = l;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s;
                    }
                    if (as != null)
                    {
                        break label0;
                    }
                }
                return s;
            }
            int j1 = 0;
            boolean flag = false;
            do
            {
                boolean flag1 = flag;
                if (j1 >= l.length)
                {
                    break;
                }
                flag1 = flag;
                if (flag)
                {
                    break;
                }
                char c1;
                char c2;
                try
                {
                    c1 = l[j1].charAt(0);
                    c2 = s.charAt(i1);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                flag1 = flag;
                if (c1 == c2)
                {
                    flag1 = true;
                }
                j1++;
                flag = flag1;
            } while (k1 == 0);
            if (!flag1)
            {
                try
                {
                    s = s.substring(i1);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                return s;
            }
            i1++;
            if (k1 != 0)
            {
                return s;
            }
        } while (true);
    }

    public int b()
    {
        int l1;
        l1 = App.am;
        int ai[];
        try
        {
            ai = b;
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
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        int k1;
        if (b.length != 0)
        {
            int i1 = b[0];
            int j1 = 1;
            do
            {
                k1 = i1;
                if (j1 >= b.length)
                {
                    break MISSING_BLOCK_LABEL_92;
                }
                k1 = i1;
                if (b[j1] > i1)
                {
                    k1 = b[j1];
                }
                j1++;
                i1 = k1;
            } while (l1 == 0);
            return k1;
        }
        k1 = 14;
        return k1;
    }
}
