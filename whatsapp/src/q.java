// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.HashSet;

public class q extends p
{

    private static final HashSet A;
    private static final HashSet B;
    private static final HashSet C;
    private static final String E[];
    private String D;

    public q()
    {
    }

    protected String a()
    {
        if (D != null)
        {
            String s = D;
            D = null;
            return s;
        } else
        {
            return x.readLine();
        }
    }

    protected String a(char c1)
    {
        if (c1 == 'n' || c1 == 'N')
        {
            return E[8];
        } else
        {
            return String.valueOf(c1);
        }
    }

    protected void a(String s, String s1)
    {
        super.a(s, s1);
    }

    protected void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
    }

    protected boolean a(boolean flag)
    {
        return super.a(flag);
    }

    protected boolean b(String s)
    {
        if (!C.contains(s) && !B.contains(s) && !s.startsWith(E[6]) && !this.s.contains(s))
        {
            this.s.add(s);
        }
        return true;
    }

    protected void c(String s)
    {
        throw new l(E[7]);
    }

    protected String d()
    {
        return E[0];
    }

    protected String d(String s)
    {
        int i = g.d;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        do
        {
            s = a();
            if (s == null)
            {
                throw new l(E[3]);
            }
            if (s.length() == 0 && i == 0)
            {
                break;
            }
            if (!s.startsWith(" ") && !s.startsWith("\t"))
            {
                D = s;
                if (i == 0)
                {
                    break;
                }
            }
            stringbuilder.append(s);
        } while (i == 0);
        return stringbuilder.toString();
    }

    protected void e(String s)
    {
        int k = g.d;
        s = s.split(",");
        e.e(E[10]);
        int i1 = s.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= i1)
                {
                    break label0;
                }
                String s1 = s[i];
                if (s1.length() >= 2 && s1.startsWith("\"") && s1.endsWith("\""))
                {
                    e.a(s1.substring(1, s1.length() - 1));
                    if (k == 0)
                    {
                        break label1;
                    }
                }
                e.a(s1.replaceAll(E[9], ""));
            }
            i++;
        } while (k == 0);
    }

    protected String g()
    {
        int i = g.d;
        if (p.u)
        {
            p.u = false;
            return p.z;
        }
        Object obj = null;
        do
        {
            String s1;
label0:
            {
                do
                {
                    do
                    {
                        do
                        {
                            s1 = x.readLine();
                            if (s1 == null)
                            {
                                if (obj != null)
                                {
                                    return ((StringBuilder) (obj)).toString();
                                }
                                if (D != null)
                                {
                                    obj = D;
                                    D = null;
                                    return ((String) (obj));
                                } else
                                {
                                    throw new l(E[1]);
                                }
                            }
                            if (s1.length() != 0)
                            {
                                break;
                            }
                            if (obj != null)
                            {
                                return ((StringBuilder) (obj)).toString();
                            }
                            if (D != null)
                            {
                                obj = D;
                                D = null;
                                return ((String) (obj));
                            }
                        } while (true);
                        if (s1.charAt(0) != ' ' && s1.charAt(0) != '\t')
                        {
                            break label0;
                        }
                        if (obj == null)
                        {
                            break;
                        }
                        ((StringBuilder) (obj)).append(s1.substring(1));
                    } while (i == 0);
                    if (D == null)
                    {
                        break;
                    }
                    obj = new StringBuilder();
                    ((StringBuilder) (obj)).append(D);
                    D = null;
                    ((StringBuilder) (obj)).append(s1.substring(1));
                } while (i == 0);
                throw new l(E[2]);
            }
            if (D == null)
            {
                D = s1;
                if (obj != null)
                {
                    return ((StringBuilder) (obj)).toString();
                }
            } else
            {
                String s = D;
                D = s1;
                return s;
            }
        } while (true);
    }

    protected void g(String s)
    {
        super.g(s);
_L2:
        return;
        l l1;
        l1;
        String as[] = s.split("=", 2);
        int i = as.length;
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        a(as[0], as[1]);
        if (g.d == 0) goto _L2; else goto _L1
_L1:
        throw new l((new StringBuilder()).append(E[5]).append(s).toString());
        s;
        throw s;
        s;
        throw s;
    }

    protected boolean h(String s)
    {
        return A.contains(s.toUpperCase());
    }

    protected String j(String s)
    {
        int i1 = g.d;
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = s.length();
        int i = 0;
label0:
        do
        {
label1:
            {
                char c1;
                int k;
label2:
                {
label3:
                    {
                        if (i >= j1)
                        {
                            break label0;
                        }
                        c1 = s.charAt(i);
                        k = i;
                        if (c1 != '\\')
                        {
                            break label2;
                        }
                        k = i;
                        if (i >= j1 - 1)
                        {
                            break label2;
                        }
                        k = i + 1;
                        char c2 = s.charAt(k);
                        if (c2 == 'n' || c2 == 'N')
                        {
                            stringbuilder.append(E[4]);
                            if (i1 == 0)
                            {
                                break label3;
                            }
                        }
                        stringbuilder.append(c2);
                    }
                    i = k;
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(c1);
                i = k;
            }
            i++;
        } while (i1 == 0);
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[42];
        obj = "S~p";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        k = 0;
_L8:
label0:
        {
            if (i1 > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "25!5i\0054`3o\004p/0!\002%&0d\022~";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "3 !5d@58?r\024#`7u@$(3!\0025'?o\0169.1!\0176`\"i\005p,?o\005";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "&9,3!\005>$3e@45$h\0167`&`\022#)8f@\022\001\005DVd`4h\01612/";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "mZ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "5>+8n\027>`&`\0221-%!\0261,#dZp";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "8}";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "!\027\005\030U@9.vw#122!S~pvh\023p.9u@#5&q\017\"43e@)%\"/";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "mZ";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ";\017dw=\034nar^=";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "4\t\020\023";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ".\021\r\023";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "0\002\017\022H$";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = ".\037\024\023";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "5\002\f";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "6\025\022\005H/\036";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "'\025\017";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "2\025\026";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\"\021\023\0237T";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "&\036";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "3\037\025\004B%";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "-\021\t\032D2";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "5\031\004";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = ",\037\007\031";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "2\037\f\023";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "#\021\024\023F/\002\t\023R";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "+\025\031";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "0\002\017\020H,\025";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "W\022\t\002";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\"\025\007\037O";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "3\037\022\002,3\004\022\037O'";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = ",\021\002\023M";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "4\025\f";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "0\030\017\002N";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "X\022\t\002";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "3\037\025\030E";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "#\034\001\005R";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "%\035\001\037M";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\"\024\001\017";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "4\031\024\032D";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = ".\031\003\035O!\035\005";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "4\n";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                E = as;
                C = new HashSet(Arrays.asList(new String[] {
                    E[29], E[23], E[33], E[31], E[19], E[39], E[35], E[15], E[32], E[37], 
                    E[41], E[16], E[13], E[14], E[38], E[24], E[17], E[22], E[26], E[21], 
                    E[11], E[27], E[20], E[40], E[36], E[30], E[25], E[12]
                }));
                A = new HashSet(Arrays.asList(new String[] {
                    E[28], E[34], E[18], "B"
                }));
                B = new HashSet();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 1356
    //                   0 1378
    //                   1 1385
    //                   2 1392
    //                   3 1399;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1399;
_L3:
        byte byte1 = 1;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 96;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 64;
          goto _L9
        byte1 = 86;
          goto _L9
    }
}
