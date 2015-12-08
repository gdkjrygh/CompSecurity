// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.c;
import com.google.zxing.common.d;
import com.google.zxing.common.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            Mode, ErrorCorrectionLevel, p

final class l
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', 
        '+', '-', '.', '/', ':'
    };

    private static char a(int i)
    {
        if (i >= a.length)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return a[i];
        }
    }

    static d a(byte abyte0[], p p, ErrorCorrectionLevel errorcorrectionlevel, Map map)
    {
        CharacterSetECI characterseteci;
        ArrayList arraylist;
        c c1;
        StringBuilder stringbuilder;
        boolean flag;
        c1 = new c(abyte0);
        stringbuilder = new StringBuilder(50);
        arraylist = new ArrayList(1);
        flag = false;
        characterseteci = null;
_L7:
        if (c1.c() >= 4) goto _L2; else goto _L1
_L1:
        Mode mode = Mode.TERMINATOR;
_L8:
        if (mode == Mode.TERMINATOR) goto _L4; else goto _L3
_L3:
        if (mode == Mode.FNC1_FIRST_POSITION || mode == Mode.FNC1_SECOND_POSITION)
        {
            break MISSING_BLOCK_LABEL_465;
        }
          goto _L5
_L4:
        Mode mode1;
        try
        {
            mode1 = Mode.TERMINATOR;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw FormatException.getFormatInstance();
        }
        if (mode != mode1) goto _L7; else goto _L6
_L6:
        map = stringbuilder.toString();
        p = arraylist;
        if (arraylist.isEmpty())
        {
            p = null;
        }
        int i;
        int j;
        if (errorcorrectionlevel == null)
        {
            errorcorrectionlevel = null;
        } else
        {
            errorcorrectionlevel = errorcorrectionlevel.toString();
        }
        return new d(abyte0, map, p, errorcorrectionlevel);
_L2:
        mode = Mode.forBits(c1.a(4));
          goto _L8
_L5:
        if (mode != Mode.STRUCTURED_APPEND)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        if (c1.c() < 16)
        {
            throw FormatException.getFormatInstance();
        }
        c1.a(16);
          goto _L4
        if (mode != Mode.ECI)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        i = c1.a(8);
        if ((i & 0x80) != 0) goto _L10; else goto _L9
_L9:
        i &= 0x7f;
_L12:
        characterseteci = CharacterSetECI.getCharacterSetECIByValue(i);
        if (characterseteci != null) goto _L4; else goto _L11
_L11:
        throw FormatException.getFormatInstance();
_L10:
        if ((i & 0xc0) != 128)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        i = (i & 0x3f) << 8 | c1.a(8);
          goto _L12
        if ((i & 0xe0) != 192)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        i = (i & 0x1f) << 16 | c1.a(16);
          goto _L12
        throw FormatException.getFormatInstance();
        if (mode != Mode.HANZI)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        i = c1.a(4);
        j = c1.a(mode.getCharacterCountBits(p));
        if (i != 1) goto _L4; else goto _L13
_L13:
        a(c1, stringbuilder, j);
          goto _L4
label0:
        {
            i = c1.a(mode.getCharacterCountBits(p));
            if (mode != Mode.NUMERIC)
            {
                break label0;
            }
            c(c1, stringbuilder, i);
        }
          goto _L4
label1:
        {
            if (mode != Mode.ALPHANUMERIC)
            {
                break label1;
            }
            a(c1, stringbuilder, i, flag);
        }
          goto _L4
label2:
        {
            if (mode != Mode.BYTE)
            {
                break label2;
            }
            a(c1, stringbuilder, i, characterseteci, ((Collection) (arraylist)), map);
        }
          goto _L4
label3:
        {
            if (mode != Mode.KANJI)
            {
                break label3;
            }
            b(c1, stringbuilder, i);
        }
          goto _L4
        throw FormatException.getFormatInstance();
        flag = true;
          goto _L4
    }

    private static void a(c c1, StringBuilder stringbuilder, int i)
    {
        if (i * 13 > c1.c())
        {
            throw FormatException.getFormatInstance();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int i1 = c1.a(13);
            i1 = i1 % 96 | i1 / 96 << 8;
            if (i1 < 959)
            {
                i1 += 41377;
            } else
            {
                i1 += 42657;
            }
            abyte0[i] = (byte)(i1 >> 8 & 0xff);
            abyte0[i + 1] = (byte)(i1 & 0xff);
            j--;
            i += 2;
        }
        try
        {
            stringbuilder.append(new String(abyte0, "GB2312"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw FormatException.getFormatInstance();
        }
    }

    private static void a(c c1, StringBuilder stringbuilder, int i, CharacterSetECI characterseteci, Collection collection, Map map)
    {
        if (i << 3 > c1.c())
        {
            throw FormatException.getFormatInstance();
        }
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)c1.a(8);
        }

        if (characterseteci == null)
        {
            c1 = k.a(abyte0, map);
        } else
        {
            c1 = characterseteci.name();
        }
        try
        {
            stringbuilder.append(new String(abyte0, c1));
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw FormatException.getFormatInstance();
        }
        collection.add(abyte0);
    }

    private static void a(c c1, StringBuilder stringbuilder, int i, boolean flag)
    {
        int j = stringbuilder.length();
        for (; i > 1; i -= 2)
        {
            if (c1.c() < 11)
            {
                throw FormatException.getFormatInstance();
            }
            int i1 = c1.a(11);
            stringbuilder.append(a(i1 / 45));
            stringbuilder.append(a(i1 % 45));
        }

        if (i == 1)
        {
            if (c1.c() < 6)
            {
                throw FormatException.getFormatInstance();
            }
            stringbuilder.append(a(c1.a(6)));
        }
        if (flag)
        {
            i = j;
            while (i < stringbuilder.length()) 
            {
                if (stringbuilder.charAt(i) == '%')
                {
                    if (i < stringbuilder.length() - 1 && stringbuilder.charAt(i + 1) == '%')
                    {
                        stringbuilder.deleteCharAt(i + 1);
                    } else
                    {
                        stringbuilder.setCharAt(i, '\035');
                    }
                }
                i++;
            }
        }
    }

    private static void b(c c1, StringBuilder stringbuilder, int i)
    {
        if (i * 13 > c1.c())
        {
            throw FormatException.getFormatInstance();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int i1 = c1.a(13);
            i1 = i1 % 192 | i1 / 192 << 8;
            if (i1 < 7936)
            {
                i1 += 33088;
            } else
            {
                i1 += 49472;
            }
            abyte0[i] = (byte)(i1 >> 8);
            abyte0[i + 1] = (byte)i1;
            j--;
            i += 2;
        }
        try
        {
            stringbuilder.append(new String(abyte0, "SJIS"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw FormatException.getFormatInstance();
        }
    }

    private static void c(c c1, StringBuilder stringbuilder, int i)
    {
        for (; i >= 3; i -= 3)
        {
            if (c1.c() < 10)
            {
                throw FormatException.getFormatInstance();
            }
            int j = c1.a(10);
            if (j >= 1000)
            {
                throw FormatException.getFormatInstance();
            }
            stringbuilder.append(a(j / 100));
            stringbuilder.append(a((j / 10) % 10));
            stringbuilder.append(a(j % 10));
        }

        if (i == 2)
        {
            if (c1.c() < 7)
            {
                throw FormatException.getFormatInstance();
            }
            i = c1.a(7);
            if (i >= 100)
            {
                throw FormatException.getFormatInstance();
            }
            stringbuilder.append(a(i / 10));
            stringbuilder.append(a(i % 10));
        } else
        if (i == 1)
        {
            if (c1.c() < 4)
            {
                throw FormatException.getFormatInstance();
            }
            i = c1.a(4);
            if (i >= 10)
            {
                throw FormatException.getFormatInstance();
            } else
            {
                stringbuilder.append(a(i));
                return;
            }
        }
    }

}
