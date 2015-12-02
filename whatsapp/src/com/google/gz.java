// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google:
//            dN, bY, gd, bL, 
//            dy, fG

final class gz
{

    private static final char a[];
    private static final char b[];
    private static final char c[];
    private static final char d[];
    private static final String z[];

    private static int a(int i, int j)
    {
        i -= (j * 149) % 255 + 1;
        if (i >= 0)
        {
            return i;
        } else
        {
            return i + 256;
        }
    }

    private static bL a(bY by, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        int i;
        boolean flag;
        i = 0;
        flag = dN.a;
_L9:
        int k = by.a(8);
        if (k == 0)
        {
            throw gd.a();
        }
        if (k <= 128)
        {
            int j;
            if (i != 0)
            {
                i = k + 128;
            } else
            {
                i = k;
            }
            stringbuilder.append((char)(i - 1));
            return bL.ASCII_ENCODE;
        }
        if (k == 129)
        {
            try
            {
                by = bL.PAD_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        if (k > 229) goto _L2; else goto _L1
_L1:
        j = k - 130;
        if (j < 10)
        {
            try
            {
                stringbuilder.append('0');
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
        }
        stringbuilder.append(j);
        j = i;
        if (!flag) goto _L3; else goto _L2
_L2:
        if (k == 230)
        {
            try
            {
                by = bL.C40_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        break MISSING_BLOCK_LABEL_141;
        by;
        throw by;
        if (k == 231)
        {
            try
            {
                by = bL.BASE256_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        if (k != 232) goto _L5; else goto _L4
_L4:
        try
        {
            stringbuilder.append('\035');
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            try
            {
                throw by;
            }
            // Misplaced declaration of an exception variable
            catch (bY by) { }
            try
            {
                throw by;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
        }
        j = i;
        if (!flag) goto _L3; else goto _L5
_L5:
        j = i;
        if (k == 233) goto _L3; else goto _L6
_L6:
        if (k != 234) goto _L8; else goto _L7
_L7:
        j = i;
_L3:
        i = j;
        if (by.c() <= 0)
        {
            return bL.ASCII_ENCODE;
        }
          goto _L9
_L8:
        if (k == 235)
        {
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_422;
            }
            i = 1;
        }
        if (k != 236) goto _L11; else goto _L10
_L10:
        stringbuilder.append(z[2]);
        stringbuilder1.insert(0, z[0]);
        j = i;
        if (!flag) goto _L3; else goto _L11
_L11:
        if (k != 237) goto _L13; else goto _L12
_L12:
        stringbuilder.append(z[3]);
        stringbuilder1.insert(0, z[1]);
        j = i;
        if (!flag) goto _L3; else goto _L13
_L13:
        if (k == 238)
        {
            try
            {
                by = bL.ANSIX12_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        break MISSING_BLOCK_LABEL_341;
        by;
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        throw by;
        if (k == 239)
        {
            try
            {
                by = bL.TEXT_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        if (k == 240)
        {
            try
            {
                by = bL.EDIFACT_ENCODE;
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            return by;
        }
        j = i;
        if (k == 241) goto _L3; else goto _L14
_L14:
        j = i;
        if (k < 242) goto _L3; else goto _L15
_L15:
        if (k != 254) goto _L17; else goto _L16
_L16:
        j = i;
        if (by.c() == 0) goto _L3; else goto _L17
_L17:
        throw gd.a();
        by;
        throw by;
        j = 1;
          goto _L3
    }

    static fG a(byte abyte0[])
    {
        bL bl;
        ArrayList arraylist;
        bY by;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        boolean flag;
        flag = dN.a;
        by = new bY(abyte0);
        stringbuilder = new StringBuilder(100);
        stringbuilder1 = new StringBuilder(0);
        arraylist = new ArrayList(1);
        bl = bL.ASCII_ENCODE;
_L12:
        bL bl1 = bl;
        if (bl != bL.ASCII_ENCODE) goto _L2; else goto _L1
_L1:
        bl1 = a(by, stringbuilder, stringbuilder1);
        bl = bl1;
        if (!flag) goto _L3; else goto _L2
_L2:
        int i = dy.a[bl1.ordinal()];
        i;
        JVM INSTR tableswitch 1 5: default 120
    //                   1 127
    //                   2 139
    //                   3 151
    //                   4 163
    //                   5 175;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
_L5:
        d(by, stringbuilder);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        b(by, stringbuilder);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        a(by, stringbuilder);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        c(by, stringbuilder);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        a(by, stringbuilder, ((Collection) (arraylist)));
        if (flag) goto _L4; else goto _L10
_L10:
        bl = bL.ASCII_ENCODE;
_L3:
        try
        {
            if (bl == bL.PAD_ENCODE)
            {
                break; /* Loop/switch isn't completed */
            }
            i = by.c();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (i > 0) goto _L12; else goto _L11
_L11:
        Object obj;
        String s;
        boolean flag1;
        try
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder.append(stringbuilder1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            s = stringbuilder.toString();
            flag1 = arraylist.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = arraylist;
        }
        return new fG(abyte0, s, ((List) (obj)), null);
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw abyte0;
    }

    private static void a(int i, int j, int ai[])
    {
        i = ((i << 8) + j) - 1;
        j = i / 1600;
        ai[0] = j;
        i -= j * 1600;
        j = i / 40;
        ai[1] = j;
        ai[2] = i - j * 40;
    }

    private static void a(bY by, StringBuilder stringbuilder)
    {
        int ai[];
        boolean flag;
        flag = dN.a;
        ai = new int[3];
_L7:
        if (by.c() != 8) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = by.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(i, by.a(8), ai);
        i = 0;
_L5:
        int j;
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        j = ai[i];
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        stringbuilder.append('\r');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        stringbuilder.append('*');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        stringbuilder.append('>');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (j != 3)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        stringbuilder.append(' ');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        char c1;
        if (j >= 14)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        c1 = (char)(j + 44);
        stringbuilder.append(c1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (j < 40)
        {
            char c2 = (char)(j + 51);
            try
            {
                stringbuilder.append(c2);
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_220;
            }
        }
        throw gd.a();
        by;
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        try
        {
            throw by;
        }
        // Misplaced declaration of an exception variable
        catch (bY by) { }
        throw by;
        i++;
        if (!flag) goto _L5; else goto _L4
_L4:
        if (by.c() > 0) goto _L7; else goto _L6
_L6:
    }

    private static void a(bY by, StringBuilder stringbuilder, Collection collection)
    {
        int i;
        int j;
        boolean flag;
        flag = dN.a;
        j = by.b() + 1;
        int k = by.a(8);
        i = j + 1;
        j = a(k, j);
        if (j != 0) goto _L2; else goto _L1
_L1:
        int l = by.c() / 8;
        if (!flag) goto _L3; else goto _L2
_L2:
        if (j >= 250 || flag)
        {
            int i1 = by.a(8);
            l = i + 1;
            j = (j - 249) * 250 + a(i1, i);
            i = l;
        }
_L5:
        if (j < 0)
        {
            try
            {
                throw gd.a();
            }
            // Misplaced declaration of an exception variable
            catch (bY by)
            {
                throw by;
            }
        }
        byte abyte0[] = new byte[j];
        l = 0;
        do
        {
label0:
            {
                if (l < j)
                {
                    try
                    {
                        if (by.c() < 8)
                        {
                            throw gd.a();
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (bY by)
                    {
                        throw by;
                    }
                    abyte0[l] = (byte)a(by.a(8), i);
                    l++;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                collection.add(abyte0);
                try
                {
                    stringbuilder.append(new String(abyte0, z[4]));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (bY by)
                {
                    throw new IllegalStateException((new StringBuilder()).append(z[5]).append(by).toString());
                }
            }
            i++;
        } while (true);
_L3:
        j = l;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void b(bY by, StringBuilder stringbuilder)
    {
        int ai[];
        int i;
        int k;
        boolean flag;
        flag = dN.a;
        ai = new int[3];
        k = 0;
        i = 0;
_L43:
        if (by.c() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = by.a(8)) == 254) goto _L1; else goto _L3
_L3:
        int i1;
        a(j, by.a(8), ai);
        i1 = 0;
_L42:
        int l;
        int j1;
        j = k;
        l = i;
        if (i1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ai[i1];
        k;
        JVM INSTR tableswitch 0 3: default 108
    //                   0 112
    //                   1 221
    //                   2 546
    //                   3 543;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw gd.a();
_L5:
        j = k;
        if (j1 >= 3) goto _L10; else goto _L9
_L9:
        k = j1 + 1;
        j = k;
        l = i;
        if (!flag) goto _L12; else goto _L11
_L11:
        j = k;
_L10:
        char c1;
        try
        {
            k = c.length;
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        if (j1 >= k) goto _L14; else goto _L13
_L13:
        c1 = c[j1];
        k = i;
        if (i == 0) goto _L16; else goto _L15
_L15:
        stringbuilder.append((char)(c1 + 128));
        if (!flag) goto _L18; else goto _L17
_L17:
        k = 0;
_L16:
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L47:
        l = k;
        if (!flag) goto _L12; else goto _L14
_L14:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L6:
        if (i == 0) goto _L20; else goto _L19
_L19:
        stringbuilder.append((char)(j1 + 128));
        if (!flag) goto _L22; else goto _L21
_L21:
        i = 0;
_L20:
        c1 = (char)j1;
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L46:
        j = i;
        if (!flag) goto _L23; else goto _L7
_L7:
        try
        {
            k = a.length;
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        j = i;
        if (j1 >= k) goto _L25; else goto _L24
_L24:
        c1 = a[j1];
        j = i;
        if (i == 0) goto _L27; else goto _L26
_L26:
        stringbuilder.append((char)(c1 + 128));
        if (!flag) goto _L29; else goto _L28
_L28:
        j = 0;
_L27:
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L45:
        i = j;
        if (!flag) goto _L30; else goto _L25
_L25:
        if (j1 != 27) goto _L32; else goto _L31
_L31:
        try
        {
            stringbuilder.append('\035');
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        i = j;
        if (!flag) goto _L30; else goto _L32
_L32:
        if (j1 != 30) goto _L34; else goto _L33
_L33:
        i = 1;
        if (!flag) goto _L30; else goto _L34
_L34:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L30:
        j = i;
        if (!flag) goto _L23; else goto _L8
_L8:
        try
        {
            j = d.length;
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        if (j1 >= j) goto _L36; else goto _L35
_L35:
        c1 = d[j1];
        j = i;
        if (i == 0) goto _L38; else goto _L37
_L37:
        stringbuilder.append((char)(c1 + 128));
        if (!flag) goto _L40; else goto _L39
_L39:
        j = 0;
_L38:
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L44:
        if (!flag) goto _L23; else goto _L36
_L36:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L23:
        i = 0;
        l = j;
        j = i;
_L12:
        i1++;
        k = j;
        i = l;
        if (!flag) goto _L42; else goto _L41
_L41:
        k = j;
        i = l;
        if (by.c() <= 0)
        {
            return;
        }
          goto _L43
_L40:
        j = 0;
          goto _L44
_L29:
        j = 0;
          goto _L45
_L22:
        i = 0;
          goto _L46
_L18:
        k = 0;
          goto _L47
    }

    private static void c(bY by, StringBuilder stringbuilder)
    {
        boolean flag = dN.a;
_L5:
        if (by.c() > 16) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L6:
        int k;
label0:
        {
            if (i >= 4)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = by.a(6);
            if (k != 31)
            {
                break label0;
            }
            i = 8 - by.a();
            if (i != 8)
            {
                try
                {
                    by.a(i);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (bY by)
                {
                    throw by;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j = k;
        if ((k & 0x20) == 0)
        {
            j = k | 0x40;
        }
        stringbuilder.append((char)j);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (by.c() > 0) goto _L5; else goto _L4
_L4:
        return;
        i++;
          goto _L6
    }

    private static void d(bY by, StringBuilder stringbuilder)
    {
        int ai[];
        int i;
        int k;
        boolean flag;
        flag = dN.a;
        ai = new int[3];
        k = 0;
        i = 0;
_L41:
        if (by.c() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = by.a(8)) == 254) goto _L1; else goto _L3
_L3:
        int i1;
        a(j, by.a(8), ai);
        i1 = 0;
_L40:
        int l;
        int j1;
        j = k;
        l = i;
        if (i1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ai[i1];
        k;
        JVM INSTR tableswitch 0 3: default 108
    //                   0 115
    //                   1 224
    //                   2 527
    //                   3 524;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L5:
        j = k;
        if (j1 >= 3) goto _L10; else goto _L9
_L9:
        k = j1 + 1;
        j = k;
        l = i;
        if (!flag) goto _L12; else goto _L11
_L11:
        j = k;
_L10:
        char c1;
        try
        {
            k = b.length;
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        if (j1 >= k) goto _L14; else goto _L13
_L13:
        c1 = b[j1];
        k = i;
        if (i == 0) goto _L16; else goto _L15
_L15:
        stringbuilder.append((char)(c1 + 128));
        if (!flag) goto _L18; else goto _L17
_L17:
        k = 0;
_L16:
        try
        {
            stringbuilder.append(c1);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L45:
        l = k;
        if (!flag) goto _L12; else goto _L14
_L14:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L6:
        if (i == 0) goto _L20; else goto _L19
_L19:
        stringbuilder.append((char)(j1 + 128));
        if (!flag) goto _L22; else goto _L21
_L21:
        i = 0;
_L20:
        char c2 = (char)j1;
        try
        {
            stringbuilder.append(c2);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L44:
        j = i;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        try
        {
            k = a.length;
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        j = i;
        if (j1 >= k) goto _L24; else goto _L23
_L23:
        c2 = a[j1];
        j = i;
        if (i == 0) goto _L26; else goto _L25
_L25:
        stringbuilder.append((char)(c2 + 128));
        if (!flag) goto _L28; else goto _L27
_L27:
        j = 0;
_L26:
        try
        {
            stringbuilder.append(c2);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L43:
        i = j;
        if (!flag) goto _L29; else goto _L24
_L24:
        if (j1 != 27) goto _L31; else goto _L30
_L30:
        try
        {
            stringbuilder.append('\035');
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
        i = j;
        if (!flag) goto _L29; else goto _L31
_L31:
        if (j1 != 30) goto _L33; else goto _L32
_L32:
        i = 1;
        if (!flag) goto _L29; else goto _L33
_L33:
        try
        {
            throw gd.a();
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L29:
        j = i;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        j = i;
        if (i == 0) goto _L35; else goto _L34
_L34:
        stringbuilder.append((char)(j1 + 224));
        if (!flag) goto _L37; else goto _L36
_L36:
        j = 0;
_L35:
        char c3 = (char)(j1 + 96);
        try
        {
            stringbuilder.append(c3);
        }
        // Misplaced declaration of an exception variable
        catch (bY by)
        {
            throw by;
        }
_L42:
        if (flag) goto _L4; else goto _L38
_L38:
        i = 0;
        l = j;
        j = i;
_L12:
        i1++;
        k = j;
        i = l;
        if (!flag) goto _L40; else goto _L39
_L39:
        k = j;
        i = l;
        if (by.c() <= 0)
        {
            return;
        }
          goto _L41
_L37:
        j = 0;
          goto _L42
_L28:
        j = 0;
          goto _L43
_L22:
        i = 0;
          goto _L44
_L18:
        k = 0;
          goto _L45
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "\034\032";
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
                obj = "\034\032";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Y7O\031W7\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Y7O\031W4\003";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "KM>?_7'.6";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Rr\020s\001ml\034'\003m{\002'\tmjQt\022rn\036u\023\"l\024v\022kl\024cGgp\022h\003kp\026=G";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                b = (new char[] {
                    '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
                    '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
                    'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
                    'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
                });
                a = (new char[] {
                    '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', 
                    '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', 
                    '?', '@', '[', '\\', ']', '^', '_'
                });
                c = (new char[] {
                    '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
                    '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
                    'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
                    'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
                });
                d = (new char[] {
                    '`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
                    'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
                    'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', 
                    '~', '\177'
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1052
    //                   0 1075
    //                   1 1081
    //                   2 1088
    //                   3 1095;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1095;
_L3:
        byte byte1 = 103;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 2;
          goto _L9
_L5:
        byte1 = 30;
          goto _L9
_L6:
        byte1 = 113;
          goto _L9
        byte1 = 7;
          goto _L9
    }
}
