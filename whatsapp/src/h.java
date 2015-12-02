// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;

public class h
{

    private static final String z[];
    p a;
    String b;

    public h()
    {
        a = null;
        b = null;
    }

    private void a(String s)
    {
        b = s;
    }

    private String b(String s)
    {
        int j = g.d;
        c(s);
        s = s.replaceAll(z[4], "\n").split("\n");
        StringBuilder stringbuilder = new StringBuilder("");
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= s.length)
                {
                    break label0;
                }
                if (s[i].indexOf(":") < 0)
                {
                    if (s[i].length() == 0 && i + 1 < s.length && s[i + 1].indexOf(":") > 0)
                    {
                        stringbuilder.append(s[i]).append(z[1]);
                        if (j == 0)
                        {
                            break label1;
                        }
                    }
                    stringbuilder.append(" ").append(s[i]).append(z[3]);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                stringbuilder.append(s[i]).append(z[2]);
            }
            i++;
        } while (j == 0);
        return stringbuilder.toString();
    }

    private void c(String s)
    {
label0:
        {
            int i = g.d;
            if (b != null)
            {
                break label0;
            }
            int j = s.indexOf(z[8]);
            if (j == -1)
            {
                b = z[10];
                if (i == 0)
                {
                    break label0;
                }
            }
            s = s.substring(j, s.indexOf("\n", j + 1));
            if (s.indexOf(z[11]) > 0)
            {
                b = z[15];
                if (i == 0)
                {
                    break label0;
                }
            }
            if (s.indexOf(z[12]) > 0)
            {
                b = z[14];
                if (i == 0)
                {
                    break label0;
                }
            }
            b = z[9];
        }
        if (b.equals(z[16]))
        {
            a = new p();
        }
        if (b.equals(z[13]))
        {
            a = new q();
        }
    }

    public boolean a(String s, e e)
    {
        return a(s, z[0], e);
    }

    public boolean a(String s, String s1, e e)
    {
        s = b(s);
        if (!a.a(new ByteArrayInputStream(s.getBytes(s1)), s1, e))
        {
            if (b.equals(z[6]))
            {
                a(z[7]);
                return a(s, e);
            } else
            {
                throw new l(z[5]);
            }
        } else
        {
            return true;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = "\\I*\034\000JSN";
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
                obj = "\004\020";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004\020";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\004\020";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\004\020";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "y{u.6)|f4?l~)u6\177\177i}&z\177'n}9:w<!z\177ut";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\177yf/7;46";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "\177yf/7:47";
                byte0 = 6;
                i = 7;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\003LB\017\000@UIg";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "\177yf/7;46";
                byte0 = 8;
                i = 9;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\177yf/7;46";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ";46";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ":47";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\177yf/7:47";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\177yf/7:47";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\177yf/7;46";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\177yf/7;46";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 83;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 26;
          goto _L9
_L6:
        byte1 = 7;
          goto _L9
        byte1 = 93;
          goto _L9
    }
}
