// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import android.text.TextUtils;
import com.whatsapp.a1p;
import com.whatsapp.asy;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google:
//            ff, ci, bf, e_, 
//            b8, g_, df, fi, 
//            gs, bi, g8, d1, 
//            co, b3, gl

public class af
{

    private static final Pattern B;
    private static final Map C;
    private static final Pattern D;
    private static final Pattern G;
    private static final Map H;
    private static final Pattern I;
    private static final String J[];
    private static final Logger b;
    private static final Pattern c;
    private static final Pattern d;
    static final Pattern f;
    static final Pattern g;
    private static final Pattern h;
    private static final String i;
    public static int k;
    private static af l;
    private static final Pattern m;
    private static final Pattern n;
    static final Pattern o;
    static final Pattern p;
    private static final Pattern r;
    private static final Map s;
    private static final Map t;
    private static final String v;
    private static final Pattern w;
    private static final Pattern x;
    private static final String y;
    static final String z;
    private final Map A = Collections.synchronizedMap(new HashMap());
    private final Set E = new HashSet(35);
    private ff F;
    private final Set a = new HashSet();
    private String e;
    private final Set j = new HashSet(320);
    private Map q;
    private final Map u = Collections.synchronizedMap(new HashMap());

    private af()
    {
        e = J[47];
        q = null;
        F = new ff(100);
    }

    public static af a()
    {
        com/google/af;
        JVM INSTR monitorenter ;
        Object obj;
        if (l != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = a(J[16], ci.a());
_L1:
        com/google/af;
        JVM INSTR monitorexit ;
        return ((af) (obj));
        obj;
        throw obj;
        obj;
        com/google/af;
        JVM INSTR monitorexit ;
        throw obj;
        obj = l;
          goto _L1
    }

    static af a(String s1, Map map)
    {
        com/google/af;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = new af();
            l.q = map;
            l.i(s1);
        }
        s1 = l;
        com/google/af;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
        s1;
        com/google/af;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private bf a(Pattern pattern, String s1)
    {
label0:
        {
            pattern = pattern.matcher(s1);
            try
            {
                if (!pattern.matches())
                {
                    break label0;
                }
                pattern = bf.IS_POSSIBLE;
            }
            // Misplaced declaration of an exception variable
            catch (Pattern pattern)
            {
                throw pattern;
            }
            return pattern;
        }
label1:
        {
            try
            {
                if (!pattern.lookingAt())
                {
                    break label1;
                }
                pattern = bf.TOO_LONG;
            }
            // Misplaced declaration of an exception variable
            catch (Pattern pattern)
            {
                throw pattern;
            }
            return pattern;
        }
        return bf.TOO_SHORT;
    }

    private e_ a(int i1, String s1)
    {
label0:
        {
            try
            {
                if (!J[19].equals(s1))
                {
                    break label0;
                }
                s1 = b(i1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
        return d(s1);
    }

    private g_ a(String s1, e_ e_1)
    {
        b8 b8_1 = e_1.h();
        boolean flag;
        try
        {
            flag = b8_1.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (a(s1, b8_1))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        return g_.UNKNOWN;
label0:
        {
            try
            {
                if (!a(s1, e_1.R()))
                {
                    break label0;
                }
                s1 = g_.PREMIUM_RATE;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label1:
        {
            try
            {
                if (!a(s1, e_1.F()))
                {
                    break label1;
                }
                s1 = g_.TOLL_FREE;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label2:
        {
            try
            {
                if (!a(s1, e_1.P()))
                {
                    break label2;
                }
                s1 = g_.SHARED_COST;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label3:
        {
            try
            {
                if (!a(s1, e_1.y()))
                {
                    break label3;
                }
                s1 = g_.VOIP;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label4:
        {
            try
            {
                if (!a(s1, e_1.p()))
                {
                    break label4;
                }
                s1 = g_.PERSONAL_NUMBER;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label5:
        {
            try
            {
                if (!a(s1, e_1.C()))
                {
                    break label5;
                }
                s1 = g_.PAGER;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label6:
        {
            try
            {
                if (!a(s1, e_1.s()))
                {
                    break label6;
                }
                s1 = g_.UAN;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label7:
        {
            try
            {
                if (!a(s1, e_1.x()))
                {
                    break label7;
                }
                s1 = g_.VOICEMAIL;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
label8:
        {
label9:
            {
                if (!a(s1, e_1.q()))
                {
                    break label8;
                }
                try
                {
                    if (!e_1.b())
                    {
                        break label9;
                    }
                    s1 = g_.FIXED_LINE_OR_MOBILE;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    throw s1;
                }
                return s1;
            }
label10:
            {
                try
                {
                    if (!a(s1, e_1.X()))
                    {
                        break label10;
                    }
                    s1 = g_.FIXED_LINE_OR_MOBILE;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    throw s1;
                }
                return s1;
            }
            return g_.FIXED_LINE;
        }
        boolean flag1 = e_1.b();
        if (!flag1)
        {
            try
            {
                if (a(s1, e_1.X()))
                {
                    return g_.MOBILE;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        break MISSING_BLOCK_LABEL_289;
        s1;
        throw s1;
        return g_.UNKNOWN;
    }

    private String a(bi bi1, List list)
    {
        int i1;
        i1 = k;
        bi1 = c(bi1);
        list = list.iterator();
_L2:
        String s1;
        Object obj;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)list.next();
        obj = d(s1);
        boolean flag;
        try
        {
            flag = ((e_) (obj)).i();
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            try
            {
                throw bi1;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (F.a(((e_) (obj)).f()).matcher(bi1).lookingAt())
        {
            return s1;
        }
        continue; /* Loop/switch isn't completed */
        g_ g_1;
        try
        {
            obj = a(((String) (bi1)), ((e_) (obj)));
            g_1 = g_.UNKNOWN;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (obj != g_1)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        return null;
        return s1;
    }

    private String a(String s1, df df1, fi fi1, String s2)
    {
        int i1 = k;
        String s4 = df1.d();
        Matcher matcher = F.a(df1.e()).matcher(s1);
        String s3;
        int j1;
        try
        {
            s1 = fi.NATIONAL;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        s3 = s4;
        if (fi1 != s1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s3 = s4;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s3 = s4;
        if (s2.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j1 = df1.b().length();
        s3 = s4;
        if (j1 > 0)
        {
            s1 = df1.b();
            s1 = n.matcher(s1).replaceFirst(s2);
            s3 = G.matcher(s4).replaceFirst(s1);
            s1 = matcher.replaceAll(s3);
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_185;
            }
        }
        s1 = df1.m();
        df1 = fi.NATIONAL;
        if (fi1 == df1 && s1 != null)
        {
            try
            {
                j1 = s1.length();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (j1 > 0)
            {
                s1 = matcher.replaceAll(G.matcher(s3).replaceFirst(s1));
                if (i1 == 0)
                {
                    break MISSING_BLOCK_LABEL_185;
                }
            }
        }
        s1 = matcher.replaceAll(s3);
        df1 = s1;
        if (fi1 == fi.RFC3966)
        {
            df1 = m.matcher(s1);
            if (df1.lookingAt())
            {
                s1 = df1.replaceFirst("");
            }
            df1 = df1.reset(s1).replaceAll("-");
        }
        return df1;
        s1;
        throw s1;
    }

    private String a(String s1, e_ e_1, fi fi1)
    {
        return a(s1, e_1, fi1, ((String) (null)));
    }

    private String a(String s1, e_ e_1, fi fi1, String s2)
    {
        List list = e_1.G();
        int i1;
        try
        {
            i1 = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (fi1 != fi.NATIONAL)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        e_1 = e_1.B();
_L1:
        e_1 = a(((List) (e_1)), s1);
        if (e_1 == null)
        {
            return s1;
        } else
        {
            return a(s1, ((df) (e_1)), fi1, s2);
        }
        e_1 = e_1.G();
          goto _L1
    }

    private static String a(String s1, Map map, boolean flag)
    {
        StringBuilder stringbuilder;
        int i1;
        int j1;
        j1 = k;
        stringbuilder = new StringBuilder(s1.length());
        i1 = 0;
_L2:
        char c1;
        Character character;
        if (i1 >= s1.length())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        c1 = s1.charAt(i1);
        character = (Character)map.get(Character.valueOf(Character.toUpperCase(c1)));
        if (character == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        stringbuilder.append(character);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (!flag)
        {
            try
            {
                stringbuilder.append(c1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        return stringbuilder.toString();
        s1;
        throw s1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static StringBuilder a(String s1, boolean flag)
    {
        StringBuilder stringbuilder;
        int i1;
        int j1;
        int k1;
        j1 = k;
        stringbuilder = new StringBuilder(s1.length());
        s1 = s1.toCharArray();
        k1 = s1.length;
        i1 = 0;
_L2:
        char c1;
        int l1;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = s1[i1];
        l1 = Character.digit(c1, 10);
        if (l1 == -1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        stringbuilder.append(l1);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (flag)
        {
            try
            {
                stringbuilder.append(c1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        break MISSING_BLOCK_LABEL_86;
        s1;
        throw s1;
        i1++;
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        return stringbuilder;
    }

    private void a(int i1, fi fi1, StringBuilder stringbuilder)
    {
        gs.c[fi1.ordinal()];
        JVM INSTR tableswitch 1 3: default 105
    //                   1 36
    //                   2 53
    //                   3 74;
           goto _L1 _L2 _L3 _L4
_L2:
        stringbuilder.insert(0, i1).insert(0, '+');
        return;
        fi1;
        throw fi1;
_L3:
        stringbuilder.insert(0, " ").insert(0, i1).insert(0, '+');
        return;
_L4:
        stringbuilder.insert(0, "-").insert(0, i1).insert(0, '+').insert(0, J[8]);
        return;
_L1:
    }

    private void a(bi bi1, e_ e_1, fi fi1, StringBuilder stringbuilder)
    {
        int i1 = k;
        boolean flag = bi1.e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        int j1 = bi1.v().length();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        fi fi2 = fi.RFC3966;
        if (fi1 != fi2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        stringbuilder.append(J[25]).append(bi1.v());
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        flag = e_1.aa();
        if (flag)
        {
            try
            {
                stringbuilder.append(e_1.t()).append(bi1.v());
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_117;
            }
        }
        stringbuilder.append(J[24]).append(bi1.v());
        return;
        bi1;
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        try
        {
            throw bi1;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1) { }
        throw bi1;
    }

    private void a(String s1, String s2, boolean flag, boolean flag1, bi bi1)
    {
        StringBuilder stringbuilder;
        int l1;
        l1 = k;
        if (s1 == null)
        {
            try
            {
                throw new g8(d1.NOT_A_NUMBER, J[28]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        try
        {
            if (s1.length() > 250)
            {
                throw new g8(d1.TOO_LONG, J[32]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        stringbuilder = new StringBuilder();
        try
        {
            a(s1, stringbuilder);
            if (!b(stringbuilder.toString()))
            {
                throw new g8(d1.NOT_A_NUMBER, J[26]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag1 = b(stringbuilder.toString(), s2);
        if (!flag1)
        {
            try
            {
                throw new g8(d1.INVALID_COUNTRY_CODE, J[29]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        break MISSING_BLOCK_LABEL_151;
        s1;
        throw s1;
        Object obj;
        StringBuilder stringbuilder1;
        int i1;
        if (flag)
        {
            try
            {
                bi1.a(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        s1 = b(stringbuilder);
        try
        {
            if (s1.length() > 0)
            {
                bi1.c(s1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        s1 = d(s2);
        stringbuilder1 = new StringBuilder();
        i1 = a(stringbuilder.toString(), ((e_) (s1)), stringbuilder1, flag, bi1);
_L2:
        if (i1 != 0)
        {
            obj = a(i1);
            if (!((String) (obj)).equals(s2))
            {
                s1 = a(i1, ((String) (obj)));
            }
            obj = s1;
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_309;
            }
        }
        Matcher matcher;
        int k1;
        try
        {
            a(stringbuilder);
            stringbuilder1.append(stringbuilder);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        i1 = s1.ad();
        bi1.a(i1);
        obj = s1;
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj = s1;
        if (flag)
        {
            try
            {
                bi1.s();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            obj = s1;
        }
        try
        {
            if (stringbuilder1.length() < 2)
            {
                throw new g8(d1.TOO_SHORT_NSN, J[27]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        break MISSING_BLOCK_LABEL_463;
        obj;
        matcher = f.matcher(stringbuilder.toString());
        try
        {
            if (((g8) (obj)).a() != d1.INVALID_COUNTRY_CODE)
            {
                break; /* Loop/switch isn't completed */
            }
            flag1 = matcher.lookingAt();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = a(stringbuilder.substring(matcher.end()), ((e_) (s1)), stringbuilder1, flag, bi1);
        i1 = k1;
        if (k1 == 0)
        {
            try
            {
                throw new g8(d1.INVALID_COUNTRY_CODE, J[30]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        throw new g8(((g8) (obj)).a(), ((g8) (obj)).getMessage());
        s1;
        throw s1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        s1 = new StringBuilder();
        try
        {
            a(stringbuilder1, ((e_) (obj)), ((StringBuilder) (s1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        bi1.b(s1.toString());
        int j1 = stringbuilder1.length();
        if (j1 < 2)
        {
            try
            {
                throw new g8(d1.TOO_SHORT_NSN, J[33]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (j1 > 16)
        {
            try
            {
                throw new g8(d1.TOO_LONG, J[31]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        try
        {
            if (stringbuilder1.charAt(0) == '0')
            {
                bi1.a(true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        bi1.a(Long.parseLong(stringbuilder1.toString()));
        return;
    }

    private void a(String s1, StringBuilder stringbuilder)
    {
        int i1 = k;
        int j1 = s1.indexOf(J[3]);
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        int k1 = J[1].length() + j1;
        if (s1.charAt(k1) != '+')
        {
            break MISSING_BLOCK_LABEL_87;
        }
        int l1 = s1.indexOf(';', k1);
        if (l1 > 0)
        {
            try
            {
                stringbuilder.append(s1.substring(k1, l1));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_87;
            }
        }
        stringbuilder.append(s1.substring(k1));
        try
        {
            stringbuilder.append(s1.substring(s1.indexOf(J[0]) + J[2].length(), j1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        stringbuilder.append(j(s1));
        i1 = stringbuilder.indexOf(J[4]);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        stringbuilder.delete(i1, stringbuilder.length());
        return;
        s1;
        throw s1;
    }

    static void a(StringBuilder stringbuilder)
    {
        String s1 = e(stringbuilder.toString());
        stringbuilder.replace(0, stringbuilder.length(), s1);
    }

    static boolean a(String s1)
    {
        return h.matcher(s1).matches();
    }

    private boolean a(String s1, b8 b8_1)
    {
        Matcher matcher = F.a(b8_1.e()).matcher(s1);
        s1 = F.a(b8_1.f()).matcher(s1);
        boolean flag;
        try
        {
            flag = matcher.matches();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (s1.matches())
        {
            return true;
        }
        return false;
    }

    private boolean a(Pattern pattern, StringBuilder stringbuilder)
    {
        int i1;
label0:
        {
            pattern = pattern.matcher(stringbuilder);
            if (pattern.lookingAt())
            {
                i1 = pattern.end();
                pattern = w.matcher(stringbuilder.substring(i1));
                if (!pattern.find())
                {
                    break label0;
                }
                pattern = c(pattern.group(1));
                boolean flag;
                try
                {
                    flag = pattern.equals("0");
                }
                // Misplaced declaration of an exception variable
                catch (Pattern pattern)
                {
                    throw pattern;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return false;
        }
        stringbuilder.delete(0, i1);
        return true;
    }

    private boolean b(bi bi1, bi bi2)
    {
        bi1 = String.valueOf(bi1.p());
        bi2 = String.valueOf(bi2.p());
        boolean flag;
        try
        {
            flag = bi1.endsWith(bi2);
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            try
            {
                throw bi1;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!bi2.endsWith(bi1))
        {
            return false;
        }
        return true;
    }

    static boolean b(String s1)
    {
        int i1;
        try
        {
            i1 = s1.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 < 2)
        {
            return false;
        } else
        {
            return c.matcher(s1).matches();
        }
    }

    private boolean b(String s1, String s2)
    {
        boolean flag = g(s2);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        int i1 = s1.length();
        if (i1 != 0)
        {
            boolean flag1;
            try
            {
                flag1 = f.matcher(s1).lookingAt();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_56;
            }
        }
        return false;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        return true;
    }

    public static String c(String s1)
    {
        return a(s1, false).toString();
    }

    private boolean c(int i1)
    {
        return q.containsKey(Integer.valueOf(i1));
    }

    static String e(String s1)
    {
label0:
        {
            Matcher matcher = B.matcher(s1);
            try
            {
                if (!matcher.matches())
                {
                    break label0;
                }
                s1 = a(s1, t, true);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return s1;
        }
        return c(s1);
    }

    private static String f(String s1)
    {
        return (new StringBuilder()).append(J[40]).append(s1).append(J[45]).append(J[43]).append(J[41]).append(J[38]).append(J[44]).append(J[42]).append(J[39]).toString();
    }

    private boolean g(String s1)
    {
        if (s1 != null)
        {
            boolean flag;
            try
            {
                flag = j.contains(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private void i(String s1)
    {
        int i1;
        i1 = k;
        e = s1;
        s1 = q.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        List list;
        if (!s1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)s1.next();
        list = (List)entry.getValue();
        int j1 = list.size();
        if (j1 != 1)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        boolean flag = J[37].equals(list.get(0));
        if (flag)
        {
            try
            {
                a.add(entry.getKey());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j.addAll(list);
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        try
        {
            if (j.remove(J[35]))
            {
                b.log(Level.WARNING, J[36]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        E.addAll((Collection)q.get(Integer.valueOf(1)));
        return;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
    }

    static String j(String s1)
    {
        Object obj = D.matcher(s1);
        if (((Matcher) (obj)).find())
        {
            obj = s1.substring(((Matcher) (obj)).start());
            Matcher matcher = g.matcher(((CharSequence) (obj)));
            s1 = ((String) (obj));
            if (matcher.find())
            {
                s1 = ((String) (obj)).substring(0, matcher.start());
                b.log(Level.FINER, (new StringBuilder()).append(J[10]).append(s1).toString());
            }
            matcher = o.matcher(s1);
            obj = s1;
            if (matcher.find())
            {
                obj = s1.substring(0, matcher.start());
            }
            return ((String) (obj));
        } else
        {
            return "";
        }
    }

    private int k(String s1)
    {
        e_ e_1 = d(s1);
        if (e_1 == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(J[17]).append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        } else
        {
            return e_1.ad();
        }
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
        byte byte0 = 10;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 37;
          goto _L8
_L3:
        byte0 = 57;
          goto _L8
_L4:
        byte0 = 18;
          goto _L8
        byte0 = 93;
          goto _L8
    }

    private static char[] z(String s1)
    {
        s1 = s1.toCharArray();
        if (s1.length < 2)
        {
            s1[0] = (char)(s1[0] ^ 0xa);
        }
        return s1;
    }

    int a(String s1, e_ e_1, StringBuilder stringbuilder, boolean flag, bi bi1)
    {
        Object obj;
        int i1;
        try
        {
            i1 = s1.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 == 0)
        {
            return 0;
        }
        obj = new StringBuilder(s1);
        s1 = J[5];
        if (e_1 != null)
        {
            s1 = e_1.n();
        }
        s1 = a(((StringBuilder) (obj)), s1);
        co co1;
        if (flag)
        {
            try
            {
                bi1.a(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        co1 = co.FROM_DEFAULT_COUNTRY;
        if (s1 == co1)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        try
        {
            if (((StringBuilder) (obj)).length() <= 2)
            {
                throw new g8(d1.TOO_SHORT_AFTER_IDD, J[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        break MISSING_BLOCK_LABEL_107;
        s1;
        throw s1;
        int j1 = a(((StringBuilder) (obj)), stringbuilder);
        if (j1 != 0)
        {
            try
            {
                bi1.a(j1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return j1;
        } else
        {
            throw new g8(d1.INVALID_COUNTRY_CODE, J[6]);
        }
        Object obj1;
        int k1;
        if (e_1 == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        k1 = e_1.ad();
        s1 = String.valueOf(k1);
        obj1 = ((StringBuilder) (obj)).toString();
        if (!((String) (obj1)).startsWith(s1))
        {
            break MISSING_BLOCK_LABEL_340;
        }
        s1 = new StringBuilder(((String) (obj1)).substring(s1.length()));
        b8 b8_1 = e_1.h();
        obj1 = F.a(b8_1.f());
        a(((StringBuilder) (s1)), e_1, ((StringBuilder) (null)));
        e_1 = F.a(b8_1.e());
        boolean flag1 = ((Pattern) (obj1)).matcher(((CharSequence) (obj))).matches();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        flag1 = ((Pattern) (obj1)).matcher(s1).matches();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        e_1 = a(((Pattern) (e_1)), ((StringBuilder) (obj)).toString());
        obj = bf.TOO_LONG;
        if (e_1 != obj)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        try
        {
            stringbuilder.append(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        bi1.a(co.FROM_NUMBER_WITHOUT_PLUS_SIGN);
        bi1.a(k1);
        return k1;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        bi1.a(0);
        return 0;
    }

    int a(StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        int k1;
        k1 = k;
        int i1;
        try
        {
            i1 = stringbuilder.length();
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            try
            {
                throw stringbuilder;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (stringbuilder.charAt(0) != '0')
        {
            int l1 = stringbuilder.length();
            int j1 = 1;
            do
            {
label0:
                {
label1:
                    {
label2:
                        {
                            if (j1 > 3 || j1 > l1)
                            {
                                break label1;
                            }
                            int i2 = Integer.parseInt(stringbuilder.substring(0, j1));
                            try
                            {
                                if (!q.containsKey(Integer.valueOf(i2)))
                                {
                                    break label2;
                                }
                                stringbuilder1.append(stringbuilder.substring(j1));
                            }
                            // Misplaced declaration of an exception variable
                            catch (StringBuilder stringbuilder)
                            {
                                throw stringbuilder;
                            }
                            return i2;
                        }
                        if (k1 == 0)
                        {
                            break label0;
                        }
                    }
                    return 0;
                }
                j1++;
            } while (true);
        }
        return 0;
    }

    public b3 a(bi bi1, bi bi2)
    {
        bi bi3;
        bi3 = new bi();
        bi3.b(bi1);
        bi1 = new bi();
        boolean flag;
        bi1.b(bi2);
        bi3.c();
        bi3.s();
        bi3.b();
        bi1.c();
        bi1.s();
        bi1.b();
        flag = bi3.e();
        if (flag)
        {
            try
            {
                if (bi3.v().length() == 0)
                {
                    bi3.f();
                }
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        flag = bi1.e();
        if (flag)
        {
            try
            {
                if (bi1.v().length() == 0)
                {
                    bi1.f();
                }
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        try
        {
            flag = bi3.e();
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            try
            {
                throw bi1;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1) { }
            try
            {
                throw bi1;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        flag = bi1.e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (bi3.v().equals(bi1.v()))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        bi1 = b3.NO_MATCH;
        return bi1;
        bi1;
        throw bi1;
        bi1;
        throw bi1;
        int j1;
label0:
        {
            int i1;
label1:
            {
                i1 = bi3.m();
                j1 = bi1.m();
                if (i1 == 0 || j1 == 0)
                {
                    break label0;
                }
                try
                {
                    if (!bi3.a(bi1))
                    {
                        break label1;
                    }
                    bi1 = b3.EXACT_MATCH;
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                return bi1;
            }
label2:
            {
                if (i1 != j1)
                {
                    break label2;
                }
                try
                {
                    if (!b(bi3, bi1))
                    {
                        break label2;
                    }
                    bi1 = b3.SHORT_NSN_MATCH;
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                return bi1;
            }
            return b3.NO_MATCH;
        }
label3:
        {
            try
            {
                bi3.a(j1);
                if (!bi3.a(bi1))
                {
                    break label3;
                }
                bi1 = b3.NSN_MATCH;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            return bi1;
        }
label4:
        {
            try
            {
                if (!b(bi3, bi1))
                {
                    break label4;
                }
                bi1 = b3.SHORT_NSN_MATCH;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            return bi1;
        }
        return b3.NO_MATCH;
    }

    public bi a(String s1, String s2)
    {
        bi bi1 = new bi();
        a(s1, s2, bi1);
        return bi1;
    }

    co a(StringBuilder stringbuilder, String s1)
    {
label0:
        {
            try
            {
                if (stringbuilder.length() != 0)
                {
                    break label0;
                }
                stringbuilder = co.FROM_DEFAULT_COUNTRY;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
            return stringbuilder;
        }
label1:
        {
            Matcher matcher = f.matcher(stringbuilder);
            try
            {
                if (!matcher.lookingAt())
                {
                    break label1;
                }
                stringbuilder.delete(0, matcher.end());
                a(stringbuilder);
                stringbuilder = co.FROM_NUMBER_WITH_PLUS_SIGN;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
            return stringbuilder;
        }
label2:
        {
            s1 = F.a(s1);
            try
            {
                a(stringbuilder);
                if (!a(((Pattern) (s1)), stringbuilder))
                {
                    break label2;
                }
                stringbuilder = co.FROM_NUMBER_WITH_IDD;
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
            return stringbuilder;
        }
        return co.FROM_DEFAULT_COUNTRY;
    }

    df a(List list, String s1)
    {
        int i1 = k;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            df df1 = (df)list.next();
            int j1 = df1.c();
            if (j1 != 0)
            {
                Matcher matcher;
                boolean flag;
                try
                {
                    flag = F.a(df1.a(j1 - 1)).matcher(s1).lookingAt();
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    throw list;
                }
                if (!flag)
                {
                    continue;
                }
            }
            matcher = F.a(df1.e()).matcher(s1);
            try
            {
                flag = matcher.matches();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
            if (flag)
            {
                return df1;
            }
        } while (i1 == 0);
        return null;
    }

    public String a(int i1)
    {
        Object obj = (List)q.get(Integer.valueOf(i1));
        if (obj == null)
        {
            try
            {
                obj = J[34];
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((String) (obj));
        } else
        {
            return (String)((List) (obj)).get(0);
        }
    }

    public String a(bi bi1)
    {
        List list;
label0:
        {
            int i1 = bi1.m();
            list = (List)q.get(Integer.valueOf(i1));
            if (list == null)
            {
                bi1 = c(bi1);
                b.log(Level.WARNING, (new StringBuilder()).append(J[14]).append(i1).append(J[15]).append(bi1).toString());
                return null;
            }
            try
            {
                if (list.size() != 1)
                {
                    break label0;
                }
                bi1 = (String)list.get(0);
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            return bi1;
        }
        return a(bi1, list);
    }

    public String a(bi bi1, fi fi1)
    {
        boolean flag;
        try
        {
            if (bi1.p() != 0L)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            flag = bi1.i();
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        if (flag)
        {
            String s1 = bi1.q();
            int i1;
            try
            {
                i1 = s1.length();
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            if (i1 > 0)
            {
                return s1;
            }
        }
        StringBuilder stringbuilder = new StringBuilder(20);
        a(bi1, fi1, stringbuilder);
        return stringbuilder.toString();
    }

    String a(String s1, df df1, fi fi1)
    {
        return a(s1, df1, fi1, ((String) (null)));
    }

    public void a(bi bi1, fi fi1, StringBuilder stringbuilder)
    {
        stringbuilder.setLength(0);
        int i1 = bi1.m();
        String s1 = c(bi1);
        try
        {
            if (fi1 == fi.E164)
            {
                stringbuilder.append(s1);
                a(i1, fi.E164, stringbuilder);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        try
        {
            if (!c(i1))
            {
                stringbuilder.append(s1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        e_ e_1 = a(i1, a(i1));
        stringbuilder.append(a(s1, e_1, fi1));
        a(bi1, e_1, fi1, stringbuilder);
        a(i1, fi1, stringbuilder);
    }

    void a(String s1, String s2, int i1)
    {
        e_ e_1;
        int l1;
        boolean flag;
        l1 = k;
        flag = J[20].equals(s2);
        try
        {
            s1 = asy.b(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException((new StringBuilder()).append(J[22]).append(s2).toString());
        }
        if (s1 == null)
        {
            try
            {
                throw new RuntimeException((new StringBuilder()).append(J[23]).append(s2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        e_1 = new e_();
        e_1.d(((a1p) (s1)).e);
        e_1.a(((a1p) (s1)).g);
        e_1.b(((a1p) (s1)).h);
        if (((a1p) (s1)).k == null) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L3:
        if (j1 >= ((a1p) (s1)).k.length)
        {
            break; /* Loop/switch isn't completed */
        }
        df df1 = new df();
        String as[];
        int k1;
        int i2;
        boolean flag1;
        try
        {
            df1.a(((a1p) (s1)).k[j1]);
            df1.e(((a1p) (s1)).d[j1]);
            as = ((a1p) (s1)).j;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            try
            {
                throw s1;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
        }
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        k1 = ((a1p) (s1)).j.length;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        if (((a1p) (s1)).j[j1] == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        flag1 = ((a1p) (s1)).j[j1].equals(J[21]);
        if (!flag1)
        {
            as = TextUtils.split(((a1p) (s1)).j[j1], "#");
            i2 = as.length;
            k1 = 0;
            do
            {
                if (k1 >= i2)
                {
                    break;
                }
                df1.d(as[k1]);
                k1++;
            } while (l1 == 0);
        }
        e_1.b(df1);
        e_1.a(df1);
        j1++;
        if (l1 == 0) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            try
            {
                A.put(Integer.valueOf(i1), e_1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_362;
            }
        }
        u.put(s2, e_1);
    }

    public void a(String s1, String s2, bi bi1)
    {
        a(s1, s2, true, true, bi1);
    }

    public boolean a(bi bi1, String s1)
    {
        e_ e_1;
        boolean flag;
        flag = true;
        int i1 = bi1.m();
        e_1 = a(i1, s1);
        if (e_1 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        boolean flag1;
        try
        {
            flag1 = J[18].equals(s1);
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            try
            {
                throw bi1;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (i1 != k(s1))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s1 = e_1.h();
        bi1 = c(bi1);
        if (!s1.b())
        {
            int j1 = bi1.length();
            if (j1 <= 2 || j1 > 16)
            {
                return false;
            }
        } else
        {
            try
            {
                bi1 = a(((String) (bi1)), e_1);
                s1 = g_.UNKNOWN;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            if (bi1 == s1)
            {
                return false;
            }
        }
        break MISSING_BLOCK_LABEL_120;
        flag = false;
        return flag;
    }

    boolean a(StringBuilder stringbuilder, e_ e_1, StringBuilder stringbuilder1)
    {
        Object obj;
        int i1;
        i1 = stringbuilder.length();
        obj = e_1.L();
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        try
        {
            j1 = ((String) (obj)).length();
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        if (j1 != 0) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        if (!((Matcher) (obj = F.a(((String) (obj))).matcher(stringbuilder))).lookingAt()) goto _L2; else goto _L4
_L4:
        Pattern pattern;
        boolean flag;
        pattern = F.a(e_1.h().f());
        flag = pattern.matcher(stringbuilder).matches();
        j1 = ((Matcher) (obj)).groupCount();
        e_1 = e_1.ae();
        if (e_1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        int k1 = e_1.length();
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        Object obj1 = ((Matcher) (obj)).group(j1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag = pattern.matcher(stringbuilder.substring(((Matcher) (obj)).end())).matches();
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        if (!flag) goto _L2; else goto _L5
_L5:
        if (stringbuilder1 != null && j1 > 0)
        {
            try
            {
                if (((Matcher) (obj)).group(j1) != null)
                {
                    stringbuilder1.append(((Matcher) (obj)).group(1));
                }
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
        }
        stringbuilder.delete(0, ((Matcher) (obj)).end());
        return true;
        stringbuilder;
        try
        {
            throw stringbuilder;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder) { }
        try
        {
            throw stringbuilder;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder) { }
        throw stringbuilder;
        obj1 = new StringBuilder(stringbuilder);
        ((StringBuilder) (obj1)).replace(0, i1, ((Matcher) (obj)).replaceFirst(e_1));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag = pattern.matcher(((StringBuilder) (obj1)).toString()).matches();
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        if (!flag) goto _L2; else goto _L6
_L6:
        if (stringbuilder1 != null && j1 > 1)
        {
            try
            {
                stringbuilder1.append(((Matcher) (obj)).group(1));
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw stringbuilder;
            }
        }
        stringbuilder.replace(0, stringbuilder.length(), ((StringBuilder) (obj1)).toString());
        return true;
        stringbuilder;
        throw stringbuilder;
    }

    public b3 b(bi bi1, String s1)
    {
        Object obj = a(bi1, c(s1, J[48]));
        bi1 = ((bi) (obj));
_L2:
        return bi1;
        g8 g8_1;
        g8_1;
        if (g8_1.a() != d1.INVALID_COUNTRY_CODE)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        g8_1 = a(bi1.m());
        if (g8_1.equals(J[49]))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s1 = a(bi1, c(s1, g8_1));
        bi1 = s1;
        if (s1 != b3.EXACT_MATCH) goto _L2; else goto _L1
_L1:
        return b3.NSN_MATCH;
        bi bi2 = new bi();
        a(s1, ((String) (null)), false, false, bi2);
        bi1 = a(bi1, bi2);
        return bi1;
        bi1;
        return b3.NOT_A_NUMBER;
    }

    e_ b(int i1)
    {
label0:
        {
            synchronized (A)
            {
                if (q.containsKey(Integer.valueOf(i1)))
                {
                    break label0;
                }
            }
            return null;
        }
        if (!A.containsKey(Integer.valueOf(i1)))
        {
            a(e, J[9], i1);
        }
        map;
        JVM INSTR monitorexit ;
        return (e_)A.get(Integer.valueOf(i1));
        RuntimeException runtimeexception;
        runtimeexception;
        throw runtimeexception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    String b(StringBuilder stringbuilder)
    {
        Matcher matcher;
        int j1;
        j1 = k;
        matcher = d.matcher(stringbuilder);
        if (!matcher.find()) goto _L2; else goto _L1
_L1:
        boolean flag = b(stringbuilder.substring(0, matcher.start()));
        if (!flag) goto _L2; else goto _L3
_L3:
        int i1;
        int k1;
        i1 = 1;
        k1 = matcher.groupCount();
_L4:
        if (i1 > k1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (matcher.group(i1) != null)
        {
            String s1 = matcher.group(i1);
            stringbuilder.delete(matcher.start(), stringbuilder.length());
            return s1;
        }
        break MISSING_BLOCK_LABEL_89;
        stringbuilder;
        throw stringbuilder;
        i1++;
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        return "";
    }

    public void b(String s1, String s2, bi bi1)
    {
        a(s1, s2, false, true, bi1);
    }

    public boolean b(bi bi1)
    {
        return a(bi1, a(bi1));
    }

    public bi c(String s1, String s2)
    {
        bi bi1 = new bi();
        b(s1, s2, bi1);
        return bi1;
    }

    public String c(bi bi1)
    {
        Object obj;
        if (bi1.r())
        {
            obj = "0";
        } else
        {
            obj = "";
        }
        obj = new StringBuilder(((String) (obj)));
        ((StringBuilder) (obj)).append(bi1.p());
        return ((StringBuilder) (obj)).toString();
        bi1;
        throw bi1;
    }

    public bf d(bi bi1)
    {
        String s1;
        int i1;
label0:
        {
            s1 = c(bi1);
            i1 = bi1.m();
            try
            {
                if (c(i1))
                {
                    break label0;
                }
                bi1 = bf.INVALID_COUNTRY_CODE;
            }
            // Misplaced declaration of an exception variable
            catch (bi bi1)
            {
                throw bi1;
            }
            return bi1;
        }
        bi1 = a(i1, a(i1)).h();
        if (!bi1.b())
        {
            b.log(Level.FINER, J[46]);
            int j1 = s1.length();
            if (j1 < 2)
            {
                try
                {
                    bi1 = bf.TOO_SHORT;
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                return bi1;
            }
            if (j1 > 16)
            {
                try
                {
                    bi1 = bf.TOO_LONG;
                }
                // Misplaced declaration of an exception variable
                catch (bi bi1)
                {
                    throw bi1;
                }
                return bi1;
            } else
            {
                return bf.IS_POSSIBLE;
            }
        } else
        {
            return a(F.a(bi1.e()), s1);
        }
    }

    e_ d(String s1)
    {
        boolean flag;
        try
        {
            flag = g(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag)
        {
            return null;
        }
        synchronized (u)
        {
            if (!u.containsKey(s1))
            {
                a(e, s1, 0);
            }
        }
        return (e_)u.get(s1);
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public boolean e(bi bi1)
    {
        bf bf1;
        try
        {
            bi1 = d(bi1);
            bf1 = bf.IS_POSSIBLE;
        }
        // Misplaced declaration of an exception variable
        catch (bi bi1)
        {
            throw bi1;
        }
        return bi1 == bf1;
    }

    public gl h(String s1)
    {
        return new gl(s1);
    }

    public int l(String s1)
    {
        boolean flag = g(s1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        String s2;
        Logger logger;
        Level level;
        StringBuilder stringbuilder;
        try
        {
            logger = b;
            level = Level.WARNING;
            stringbuilder = (new StringBuilder()).append(J[12]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        s2 = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s2 = J[13];
        logger.log(level, stringbuilder.append(s2).append(J[11]).toString());
        return 0;
        s1;
        throw s1;
        return k(s1);
    }

    static 
    {
_L28:
        obj = z(z(((String) (obj))));
        StringBuilder stringbuilder;
        String s1;
        byte byte1;
        switch (byte1)
        {
        default:
            p = Pattern.compile(((String) (obj)));
            obj = "\re6\001n\f";
            byte1 = 0;
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            G = Pattern.compile(((String) (obj)));
            obj = "y\035\\\r";
            byte1 = 1;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            x = Pattern.compile(((String) (obj)));
            obj = "y\035T\032";
            byte1 = 2;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            I = Pattern.compile(((String) (obj)));
            obj = "y\035Q\036";
            byte1 = 3;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            n = Pattern.compile(((String) (obj)));
            obj = "y\021-\001.\024e;b";
            byte1 = 4;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            h = Pattern.compile(((String) (obj)));
            break;
        }
        break; /* Loop/switch isn't completed */
        byte2 = -1;
        String as[] = new String[50];
        int i1 = 0;
        obj = "Q\\~g";
        byte byte0 = -1;
label0:
        do
        {
            String as1[] = as;
            obj = z(z(((String) (obj))));
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\036Iz2d@\024q2dQ\\j)7";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "Q\\~g";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "\036Iz2d@\024q2dQ\\j)7";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\036Pa(h\030";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "kV|\020kQZz";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "fVg3~W@2>kIU{3m\005Z}9o\005Jg-zIPw9*RXa}dJM2/oFVu3cV\\vs";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "uQ}3o\005Wg0h@K25kA\031s3*l}Vq*GLf}kCMw/*QQ{.*RXa}dJM21eK^28dJLu5*QV2?o\005X2+cD[~8*UQ}3o\005Wg0h@K<";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Q\\~g";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "\025\t#";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "vM`4zU\\v}~WX{1cK^2>bDKs>~@Kag*";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\f\031b/eSPv8n\013";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "lWd<fL]22x\005T{.yLWu}x@^{2d\005Z}9o\005\021";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "KL~1";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "hPa.cK^=4dSX~4n\005Z}(dQKk\002iJ]w}\"";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\f\031t2x\005Wg0h@K2";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\nZ}0%BV}:f@\026{l2K\026b5eK\\|(gG\\`.%AXf<%uQ}3okL\177?oWtw)kAXf<ZWVf2";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "lWd<fL]2/oBP}3*FVv80\005";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\025\t#";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "\025\t#";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\025\t#";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "k\026S";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "@Tb)s\005Tw)kAXf<0\005";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "@Tb)s\005Tw)kAXf<0\005";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "\005\\j)$\005";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "\036\\j)7";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "qQw}yQK{3m\005Jg-zIPw9*APv}dJM2.o@T2)e\005[w}k\005Iz2d@\031|(gG\\`s";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "qQw}yQK{3m\005Jg-zIPw9*LJ2)eJ\031a5eWM2)e\005[w}k\005Iz2d@\031|(gG\\`s";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "qQw}zMV|8*KL\177?oW\031a(zUU{8n\005Ns.*KL~1$";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "hPa.cK^22x\005P|+kIPv}n@_s(fQ\031`8mLV|s";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "fVg1n\005W})*LWf8xUKw)*KL\177?oWJ2<lQ\\`}zILapyL^|s";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "qQw}yQK{3m\005Jg-zIPw9*LJ2)eJ\031~2dB\031f2*G\\2<*UQ}3o\005Wg0h@K<";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                obj = "qQw}yQK{3m\005Jg-zIPw9*RXa}~JV21eK^2)e\005Is/y@\027";
                byte0 = 31;
                i1 = 32;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "qQw}yQK{3m\005Jg-zIPw9*LJ2)eJ\031a5eWM2)e\005[w}k\005Iz2d@\031|(gG\\`s";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "\177c";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\025\t#";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "LWd<fL]20oQXv<~D\031:>ePWf/s\005Zs1fLWu}iJ]w}}DJ20kUIw9*QV2)b@\031|2d\b^w2*@Wf4~\\\031s.*R\\~1*DJ2.z@Z{;cF\031`8mLV|uy\f\020";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "\025\t#";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\006\006n";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "^\b>hw\f\032";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\036\\j)7\reb&DADil&\022D;!Q\005\231N)&x\023:b0@\006j)\"\032\003w3yL\021-ge\u0324\006n\256#\f\006|bv\uFF60\006\uFF4A\uFF09\uFF44\032EI";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "\reb&DADil&\022D;";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "yIi\023nX";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "~\003Ns\uFF04x\006I}\252yM>pW\017";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "~\0242\000!\r";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                obj = "xE{3~YX|8rJE\uFF5B\uFF13\uFF5E\f";
                byte0 = 44;
                i1 = 45;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "fQw>aLWu}cC\031|(gG\\`}cV\031b2yVPp1o\005N{)b\005P|>eHI~8~@\031\1778~D]s)k\013";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "\nZ}0%BV}:f@\026{l2K\026b5eK\\|(gG\\`.%AXf<%uQ}3okL\177?oWtw)kAXf<ZWVf2";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\177c";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\177c";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                break label0;
            }
        } while (true);
        J = as;
        b = Logger.getLogger(com/google/af.getName());
        obj = new HashMap();
        ((HashMap) (obj)).put(Character.valueOf('0'), Character.valueOf('0'));
        ((HashMap) (obj)).put(Character.valueOf('1'), Character.valueOf('1'));
        ((HashMap) (obj)).put(Character.valueOf('2'), Character.valueOf('2'));
        ((HashMap) (obj)).put(Character.valueOf('3'), Character.valueOf('3'));
        ((HashMap) (obj)).put(Character.valueOf('4'), Character.valueOf('4'));
        ((HashMap) (obj)).put(Character.valueOf('5'), Character.valueOf('5'));
        ((HashMap) (obj)).put(Character.valueOf('6'), Character.valueOf('6'));
        ((HashMap) (obj)).put(Character.valueOf('7'), Character.valueOf('7'));
        ((HashMap) (obj)).put(Character.valueOf('8'), Character.valueOf('8'));
        ((HashMap) (obj)).put(Character.valueOf('9'), Character.valueOf('9'));
        HashMap hashmap = new HashMap(40);
        hashmap.put(Character.valueOf('A'), Character.valueOf('2'));
        hashmap.put(Character.valueOf('B'), Character.valueOf('2'));
        hashmap.put(Character.valueOf('C'), Character.valueOf('2'));
        hashmap.put(Character.valueOf('D'), Character.valueOf('3'));
        hashmap.put(Character.valueOf('E'), Character.valueOf('3'));
        hashmap.put(Character.valueOf('F'), Character.valueOf('3'));
        hashmap.put(Character.valueOf('G'), Character.valueOf('4'));
        hashmap.put(Character.valueOf('H'), Character.valueOf('4'));
        hashmap.put(Character.valueOf('I'), Character.valueOf('4'));
        hashmap.put(Character.valueOf('J'), Character.valueOf('5'));
        hashmap.put(Character.valueOf('K'), Character.valueOf('5'));
        hashmap.put(Character.valueOf('L'), Character.valueOf('5'));
        hashmap.put(Character.valueOf('M'), Character.valueOf('6'));
        hashmap.put(Character.valueOf('N'), Character.valueOf('6'));
        hashmap.put(Character.valueOf('O'), Character.valueOf('6'));
        hashmap.put(Character.valueOf('P'), Character.valueOf('7'));
        hashmap.put(Character.valueOf('Q'), Character.valueOf('7'));
        hashmap.put(Character.valueOf('R'), Character.valueOf('7'));
        hashmap.put(Character.valueOf('S'), Character.valueOf('7'));
        hashmap.put(Character.valueOf('T'), Character.valueOf('8'));
        hashmap.put(Character.valueOf('U'), Character.valueOf('8'));
        hashmap.put(Character.valueOf('V'), Character.valueOf('8'));
        hashmap.put(Character.valueOf('W'), Character.valueOf('9'));
        hashmap.put(Character.valueOf('X'), Character.valueOf('9'));
        hashmap.put(Character.valueOf('Y'), Character.valueOf('9'));
        hashmap.put(Character.valueOf('Z'), Character.valueOf('9'));
        s = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap(100);
        hashmap.putAll(s);
        hashmap.putAll(((Map) (obj)));
        t = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap();
        hashmap.putAll(((Map) (obj)));
        hashmap.put(Character.valueOf('+'), Character.valueOf('+'));
        hashmap.put(Character.valueOf('*'), Character.valueOf('*'));
        H = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap();
        char c1;
        for (Iterator iterator = s.keySet().iterator(); iterator.hasNext(); hashmap.put(Character.valueOf(c1), Character.valueOf(c1)))
        {
            c1 = ((Character)iterator.next()).charValue();
            hashmap.put(Character.valueOf(Character.toLowerCase(c1)), Character.valueOf(c1));
        }

        hashmap.putAll(((Map) (obj)));
        hashmap.put(Character.valueOf('-'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\uFF0D'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2010'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2011'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2012'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2013'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2014'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2015'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('\u2212'), Character.valueOf('-'));
        hashmap.put(Character.valueOf('/'), Character.valueOf('/'));
        hashmap.put(Character.valueOf('\uFF0F'), Character.valueOf('/'));
        hashmap.put(Character.valueOf(' '), Character.valueOf(' '));
        hashmap.put(Character.valueOf('\u3000'), Character.valueOf(' '));
        hashmap.put(Character.valueOf('\u2060'), Character.valueOf(' '));
        hashmap.put(Character.valueOf('.'), Character.valueOf('.'));
        hashmap.put(Character.valueOf('\uFF0E'), Character.valueOf('.'));
        C = Collections.unmodifiableMap(hashmap);
        obj = "~ev\000!\r\006(\006t\u2076\u2205\uFF4C\000Qy]Ov#\032";
        byte1 = -1;
_L26:
        obj = z(z(((String) (obj))));
        byte1;
        JVM INSTR tableswitch 0 7: default 2284
    //                   0 2596
    //                   1 2613
    //                   2 2630
    //                   3 2647
    //                   4 2664
    //                   5 2681
    //                   6 2494
    //                   7 2386;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        r = Pattern.compile(((String) (obj)));
        stringbuilder = new StringBuilder();
        obj = Arrays.toString(s.keySet().toArray());
        byte1 = -1;
_L13:
        s1 = z(z("~\0252\001QydO"));
        byte1;
        JVM INSTR tableswitch 0 0: default 2348
    //                   0 2569;
           goto _L10 _L11
_L10:
        stringbuilder = stringbuilder.append(((String) (obj)).replaceAll(s1, ""));
        obj = Arrays.toString(s.keySet().toArray()).toLowerCase();
        byte1 = 0;
        if (true) goto _L13; else goto _L12
_L12:
_L9:
        y = f((new StringBuilder()).append(",").append(((String) (obj))).toString());
        z = f(((String) (obj)));
        stringbuilder = new StringBuilder();
        obj = "\r\006(";
        byte1 = -1;
_L19:
        obj = z(z(((String) (obj))));
        byte1;
        JVM INSTR tableswitch 0 2: default 2472
    //                   0 2737
    //                   1 2777
    //                   2 2799;
           goto _L14 _L15 _L16 _L17
_L14:
        stringbuilder = stringbuilder.append(((String) (obj))).append(y);
        obj = "\f\035";
        byte1 = 0;
        if (true) goto _L19; else goto _L18
_L18:
_L8:
        B = Pattern.compile(((String) (obj)));
        stringbuilder = new StringBuilder();
        obj = "yIi\023nXB  v~\022\uFF19\000 \016\021-gQ\bA\u2002p\u201F\u2237\u30C5\uFF1Fp\uFF05\005\231\277\u2056\u206A\u3025\021;\uFF55\uFF03\uFF1E\uFF04<\001Qyd=#\u2059\u2219\uFF678\000 yIi\023nX\020in&Xb?%\u201A\b\u202C\u2200\u30A1\uFF07\b\uFF362\375\247\u202E\u2059\u3012u#\uFF2D\uFF30\uFF29\uFF60$ybN\000%[\u206A\u222E\uFF03 ";
        byte1 = -1;
_L24:
        obj = z(z(((String) (obj))));
        byte1;
        JVM INSTR tableswitch 0 1: default 2548
    //                   0 2699
    //                   1 2715;
           goto _L20 _L21 _L22
_L20:
        stringbuilder = stringbuilder.append(((String) (obj))).append(i);
        obj = "yIi\023nX";
        byte1 = 0;
        if (true) goto _L24; else goto _L23
_L23:
_L11:
        i = stringbuilder.append(((String) (obj)).replaceAll(s1, "")).toString();
        obj = "~\022\uFF19\000!";
        byte1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        f = Pattern.compile(((String) (obj)));
        obj = "~\024j\u204D'\u2030\u222B\u30EE\uFF50'\uFF2A\031\262\360\u2001\u2045\u3039:t\uFF02\uFF2C\uFF02\uFF2FsV~eOrt\u2076\u2205\uFF4C\000!";
        byte1 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        m = Pattern.compile(((String) (obj)));
        obj = "\reb&DAD;";
        byte1 = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        w = Pattern.compile(((String) (obj)));
        obj = "~\022\uFF19\001z^wv W";
        byte1 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        D = Pattern.compile(((String) (obj)));
        obj = "~eNrW\005\023j";
        byte1 = 4;
        continue; /* Loop/switch isn't completed */
_L6:
        o = Pattern.compile(((String) (obj)));
        obj = "~bN\rqkD4{VuB^ W\003\037I\003)xd9y";
        byte1 = 5;
        continue; /* Loop/switch isn't completed */
_L7:
        g = Pattern.compile(((String) (obj)));
        obj = "\r\006(s \032bSpPD\024h\000#^\nos ";
        byte1 = 6;
        continue; /* Loop/switch isn't completed */
_L21:
        stringbuilder = stringbuilder.append(((String) (obj)));
        obj = "x\023";
        byte1 = 1;
          goto _L24
_L22:
        v = stringbuilder.append(((String) (obj))).toString();
        obj = "]\uFF611\uFF5Et\uFF7B";
        byte1 = 7;
        continue; /* Loop/switch isn't completed */
_L15:
        d = Pattern.compile(stringbuilder.append(((String) (obj))).toString(), 66);
        stringbuilder = (new StringBuilder()).append(v);
        obj = "\r\006(";
        byte1 = 1;
          goto _L19
_L16:
        stringbuilder = stringbuilder.append(((String) (obj))).append(y);
        obj = "\f\006";
        byte1 = 2;
          goto _L19
_L17:
        c = Pattern.compile(stringbuilder.append(((String) (obj))).toString(), 66);
        obj = "\reVv#";
        byte1 = byte2;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
        l = null;
    }
}
