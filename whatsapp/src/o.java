// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.backport.util.Base64;
import android.content.Context;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.asy;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class o
{

    private static final HashSet b;
    private static final HashSet d;
    private static final String z[];
    private StringBuilder a;
    private int c;
    private String e;

    public o()
    {
        c = 0;
    }

    private String a(String s, int k)
    {
        String s1;
        int i1;
        i1 = g.d;
        s1 = s;
        if (!s.endsWith(z[37])) goto _L2; else goto _L1
_L1:
        s = s.substring(0, s.length() - 2);
        s1 = s;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        s1 = s;
_L2:
        if (!s1.endsWith("\n")) goto _L6; else goto _L5
_L5:
        s1 = s1.substring(0, s1.length() - 1);
        if (i1 == 0) goto _L4; else goto _L6
_L6:
        return null;
_L4:
        s = s1.replaceAll(z[36], "\n");
        if (k == 1)
        {
            return s.replaceAll("\n", z[38]);
        }
        if (k == 2)
        {
            return s.replaceAll("\n", z[39]);
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    private void a(Context context, d d1, int k)
    {
        k = g.d;
        int i1;
        c = c + 1;
        if (d1.c == null)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        Log.v((new StringBuilder()).append(z[51]).append(d1).toString());
        i1 = d1.e;
        if (i1 == 0)
        {
            String s;
            try
            {
                a.append(z[45]).append(c).append(z[40]).append(d1.c.b()).append(e);
                a.append(z[46]).append(c).append(z[49]);
                s = d1.c.c;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (s != null)
            {
                try
                {
                    a.append(asy.f(d1.c.c).toLowerCase());
                }
                catch (IOException ioexception)
                {
                    Log.a(z[43], ioexception);
                }
            }
            a.append(e);
            a.append(z[48]).append(c).append(z[42]).append(d1.b).append(e);
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_388;
            }
        }
        context = context.getString(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(d1.e));
        a.append(z[41]).append(c).append(z[53]).append(context).append(z[47]).append(d1.c.b()).append(e);
        a.append(z[44]).append(c).append(z[54]);
        if (d1.c.c != null)
        {
            try
            {
                a.append(asy.f(d1.c.c).toLowerCase());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.a(z[50], context);
            }
        }
        try
        {
            a.append(e);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        Log.e(z[52]);
        return;
        context;
        throw context;
    }

    private void a(Context context, List list, int k)
    {
        int i1 = g.d;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            d d1 = (d)list.next();
            if (d1.d == android/provider/ContactsContract$CommonDataKinds$Email)
            {
                b(context, d1, k);
                if (i1 == 0)
                {
                    continue;
                }
            }
            if (d1.d == android/provider/ContactsContract$CommonDataKinds$StructuredPostal)
            {
                a(context, d1, k);
            }
        } while (i1 == 0);
    }

    private void a(g g1)
    {
        int k = g.d;
        if (g1.l != null)
        {
            Iterator iterator = g1.l.keySet().iterator();
label0:
            do
            {
                c c1;
label1:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    String s = (String)iterator.next();
                    if (!g.j.containsKey(s))
                    {
                        continue;
                    }
                    c1 = (c)((List)g1.l.get(s)).get(0);
                    a.append(s).append(";");
                    if (c1.e != null && c1.e.size() > 0)
                    {
                        a.append(z[1]).append(c1.e.toArray()[0]).append(":");
                        if (k == 0)
                        {
                            break label1;
                        }
                    }
                    a.append(z[0]).append(":");
                }
                a.append(c1.a).append(e);
            } while (k == 0);
        }
    }

    private void a(j j1)
    {
        int k;
label0:
        {
            k = g.d;
            Log.v((new StringBuilder()).append(z[35]).append(j1).toString());
            a.append(z[34]);
            if (j1.h != null)
            {
                a.append(j1.h).append(";");
                if (k == 0)
                {
                    break label0;
                }
            }
            a.append(";");
        }
label1:
        {
            if (j1.b != null)
            {
                a.append(j1.b).append(";");
                if (k == 0)
                {
                    break label1;
                }
            }
            a.append(";");
        }
label2:
        {
            if (j1.e != null)
            {
                a.append(j1.e).append(";");
                if (k == 0)
                {
                    break label2;
                }
            }
            a.append(";");
        }
label3:
        {
            if (j1.d != null)
            {
                a.append(j1.d).append(";");
                if (k == 0)
                {
                    break label3;
                }
            }
            a.append(";");
        }
        if (j1.f != null)
        {
            a.append(j1.f);
        }
        a.append(e);
        a.append(z[33]).append(j1.a).append(e);
    }

    private void a(byte abyte0[], String s, int k)
    {
        a.append(z[10]).append(Base64.encodeToString(abyte0, 2)).append(e);
    }

    private boolean a(String s)
    {
        return s == null || s.trim().equals("");
    }

    private void b(Context context, d d1, int k)
    {
label0:
        {
label1:
            {
                int i1 = g.d;
                String s = z[3];
                if (a(d1.a))
                {
                    break label0;
                }
                if (d1.e == 0)
                {
                    Log.v((new StringBuilder()).append(z[8]).append(d1).toString());
                    c = c + 1;
                    a.append(z[2]).append(c).append(z[6]).append(d1.a).append(e);
                    a.append(z[9]).append(c).append(z[4]).append(d1.b).append(e);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                context = context.getString(android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(d1.e));
                if (k == 1)
                {
                    a.append(z[7]);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                a.append(z[5]);
            }
            a.append(context).append(":").append(d1.a).append(e);
        }
    }

    private void b(Context context, List list, int k)
    {
        int i1 = g.d;
        Iterator iterator = list.iterator();
label0:
        do
        {
            a a1;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (a)iterator.next();
                if (a(a1.a))
                {
                    continue;
                }
                if (a1.d == 0)
                {
                    c = c + 1;
                    a.append(z[31]).append(c).append(z[27]).append(a1.a).append(e);
                    a.append(z[28]).append(c).append(z[29]).append(a1.c).append(e);
                    if (i1 == 0)
                    {
                        continue;
                    }
                }
                String s = context.getString(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(a1.d));
                list = s;
                if (k == 2)
                {
                    list = s;
                    if (s.indexOf(";") != -1)
                    {
                        list = s.replace(";", ",");
                    }
                }
                if (k == 1)
                {
                    a.append(z[30]);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                a.append(z[32]);
            }
            a.append(list).append(":").append(a1.a).append(e);
        } while (i1 == 0);
    }

    public String a(Context context, g g1, int k)
    {
        int i1;
label0:
        {
            i1 = g.d;
            a = new StringBuilder();
            if (g1.f != null && g1.f.a == null)
            {
                g1.f.a = "";
            }
            if (k == 1)
            {
                e = "\n";
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (k == 2)
            {
                e = "\n";
                if (i1 == 0)
                {
                    break label0;
                }
            }
            throw new l(z[17]);
        }
label1:
        {
            a.append(z[11]).append(e);
            if (k == 1)
            {
                a.append(z[25]).append(e);
                if (i1 == 0)
                {
                    break label1;
                }
            }
            a.append(z[22]).append(e);
        }
        if (g1.f != null)
        {
            a(g1.f);
        }
        if (g1.l != null && g1.l.containsKey(z[26]))
        {
            a.append(z[15]).append(((c)((List)g1.l.get(z[20])).get(0)).a).append(e);
        }
        if (g1.f != null)
        {
            if (g1.f.g != null)
            {
                a.append(z[14]).append(g1.f.g).append(e);
            }
            if (g1.f.c != null)
            {
                a.append(z[24]).append(g1.f.c).append(e);
            }
        }
        if (g1.e != null && g1.e.size() > 0)
        {
            String s = ((i)g1.e.get(0)).a;
            String s1 = ((i)g1.e.get(0)).b;
            if (s != null)
            {
                a.append(z[12]).append(s).append(e);
            }
            if (s1 != null)
            {
                a.append(z[19]).append(s1).append(e);
            }
        }
        if (g1.c.size() > 0 && !a((String)g1.c.get(0)))
        {
            a.append(z[16]).append(a((String)g1.c.get(0), k)).append(e);
        }
        if (g1.g != null)
        {
            b(context, g1.g, k);
        }
        if (g1.i != null)
        {
            a(context, g1.i, k);
        }
        if (g1.l != null && g1.l.containsKey(z[13]))
        {
            a.append(z[23]).append(((c)((List)g1.l.get(z[21])).get(0)).a).append(e);
        }
        a(g1);
        if (g1.m != null)
        {
            a(g1.m, g1.h, k);
        }
        a.append(z[18]);
        context = a.toString();
        if (DialogToastActivity.g != 0)
        {
            g.d = i1 + 1;
        }
        return context;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[81];
        obj = "Fq|'+zGA\007";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "Fq|'+";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "[|i/";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                k = 3;
                obj = "{FX\007D|MX";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                k = 4;
                obj = "\034P!\003T~in'z\b";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "wEM\013Z\t\\U\022S\017";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "\034MA\003_~3x;fW5E\fBwZB\007B\b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "wEM\013Z\t";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                obj = "Sx|'xV_M\007{Sa`\021b@2";
                byte0 = 7;
                k = 8;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "[|i/";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "b@C\026Y\tJM\021S\004<6";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                k = 11;
                obj = "pMK\013X\b^O\003Dv";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[k] = ((String) (obj));
                obj = "}ZKx";
                byte0 = 11;
                k = 12;
                break;

            case 11: // '\013'
                as1[k] = ((String) (obj));
                k = 13;
                obj = "pLM\033";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[k] = ((String) (obj));
                k = 14;
                obj = "j%\\\nY|MX\013U\037NE\020Ef%B\003[w2";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[k] = ((String) (obj));
                k = 15;
                obj = "|AO\tXsEIx";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[k] = ((String) (obj));
                k = 16;
                obj = "|GX\007,";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[k] = ((String) (obj));
                k = 17;
                obj = "\022~i0e[gbbx]|,/wFkdb@wZ_\013Y|WZ\001W`L>s6]z,\024S`[E\rXm^O\003Dv;<l";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[k] = ((String) (obj));
                k = 18;
                obj = "wFHx@qI^\006";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[k] = ((String) (obj));
                k = 19;
                obj = "fAX\016S\b";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[k] = ((String) (obj));
                k = 20;
                obj = "|AO\tXsEI";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[k] = ((String) (obj));
                k = 21;
                obj = "pLM\033";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[k] = ((String) (obj));
                k = 22;
                obj = "dM^\021_}F6q8\002";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[k] = ((String) (obj));
                k = 23;
                obj = "pLM\033-Di`7s\017lm6s\b";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[k] = ((String) (obj));
                k = 24;
                obj = "j%\\\nY|MX\013U\037DM\021B\037FM\017S\b";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[k] = ((String) (obj));
                k = 25;
                obj = "dM^\021_}F6p8\003";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[k] = ((String) (obj));
                k = 26;
                obj = "|AO\tXsEI";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[k] = ((String) (obj));
                k = 27;
                obj = "\034\\I\016,";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[k] = ((String) (obj));
                k = 28;
                obj = "[|i/";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[k] = ((String) (obj));
                k = 29;
                obj = "\034P!\003T~in'z\b";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[k] = ((String) (obj));
                k = 30;
                obj = "fM@y";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[k] = ((String) (obj));
                k = 31;
                obj = "[|i/";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[k] = ((String) (obj));
                k = 32;
                obj = "fM@ybKxi\177";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[k] = ((String) (obj));
                k = 33;
                obj = "tF6";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[k] = ((String) (obj));
                k = 34;
                obj = "|2";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[k] = ((String) (obj));
                k = 35;
                obj = "Dkm0r\035fm/s\b";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[k] = ((String) (obj));
                k = 36;
                obj = "?\002";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[k] = ((String) (obj));
                k = 37;
                obj = "?\002";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[k] = ((String) (obj));
                k = 38;
                obj = "?\002,";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[k] = ((String) (obj));
                k = 39;
                obj = "8(";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[k] = ((String) (obj));
                k = 40;
                obj = "\034IH\020,\t3";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[k] = ((String) (obj));
                k = 41;
                obj = "[|i/";
                byte0 = 40;
                break;

            case 40: // '('
                as1[k] = ((String) (obj));
                k = 42;
                obj = "\034P!\003T~in'z\b";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[k] = ((String) (obj));
                k = 43;
                obj = "Dkm0rQga2yAm~mwBxi,rEi|-eFi`1b@(j#\177^mhbz]gg7fqgy,b@qM t@Ju\fw_m";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[k] = ((String) (obj));
                k = 44;
                obj = "[|i/";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[k] = ((String) (obj));
                k = 45;
                obj = "[|i/";
                byte0 = 44;
                break;

            case 44: // ','
                as1[k] = ((String) (obj));
                k = 46;
                obj = "[|i/";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[k] = ((String) (obj));
                k = 47;
                obj = "\b37";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[k] = ((String) (obj));
                k = 48;
                obj = "[|i/";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[k] = ((String) (obj));
                k = 49;
                obj = "\034P!\003TsL^x";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[k] = ((String) (obj));
                k = 50;
                obj = "Dkm0rQga2yAm~mwBxi,rEi|-eFi`1b@(j#\177^mhbz]gg7fqgy,b@qM t@Ju\fw_m";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[k] = ((String) (obj));
                k = 51;
                obj = "Sx|'xV_M\022yA|m.EFz6";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[k] = ((String) (obj));
                k = 52;
                obj = "Sx|'xV_M\022yA|m.EFz,#rVzS&wFi,+e\022FY\016Z";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[k] = ((String) (obj));
                k = 53;
                obj = "\034IH\020-Fq|'+";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[k] = ((String) (obj));
                k = 54;
                obj = "\034P!\003TsL^x";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[k] = ((String) (obj));
                k = 55;
                obj = "dAH\007Y";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[k] = ((String) (obj));
                k = 56;
                obj = "\177KE\017W{D";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[k] = ((String) (obj));
                k = 57;
                obj = "eG^\t";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[k] = ((String) (obj));
                k = 58;
                obj = "zGA\007";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[k] = ((String) (obj));
                k = 59;
                obj = "qA_";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[k] = ((String) (obj));
                k = 60;
                obj = "bZC\006_uQ";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[k] = ((String) (obj));
                k = 61;
                obj = "j<<r";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[k] = ((String) (obj));
                k = 62;
                obj = "s\\X\017W{D";
                byte0 = 61;
                break;

            case 61: // '='
                as1[k] = ((String) (obj));
                k = 63;
                obj = "\177[K";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[k] = ((String) (obj));
                k = 64;
                obj = "{FX\007D|MX";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[k] = ((String) (obj));
                k = 65;
                obj = "bG[\007Da@M\020S";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[k] = ((String) (obj));
                k = 66;
                obj = "sG@";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[k] = ((String) (obj));
                k = 67;
                obj = "qI^";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[k] = ((String) (obj));
                k = 68;
                obj = "{[H\f";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[k] = ((String) (obj));
                k = 69;
                obj = "pJ_";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[k] = ((String) (obj));
                k = 70;
                obj = "qM@\016";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[k] = ((String) (obj));
                k = 71;
                obj = "\177GH\007[";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[k] = ((String) (obj));
                k = 72;
                obj = "w_C\020Zv";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[k] = ((String) (obj));
                k = 73;
                obj = "dGE\001S";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[k] = ((String) (obj));
                k = 74;
                obj = "fDT";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[k] = ((String) (obj));
                k = 75;
                obj = "tIT";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[k] = ((String) (obj));
                k = 76;
                obj = "sX\\\016S~AB\t";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[k] = ((String) (obj));
                k = 77;
                obj = "bIK\007D";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[k] = ((String) (obj));
                k = 78;
                obj = "bZI\004";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[k] = ((String) (obj));
                k = 79;
                obj = "qM@\016";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[k] = ((String) (obj));
                k = 80;
                obj = "{JA\017W{D";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[k] = ((String) (obj));
                z = as;
                d = new HashSet(Arrays.asList(new String[] {
                    z[70], z[66], z[76], z[62], z[59], z[72], z[64], z[80], z[56], z[65], 
                    z[60], z[74], z[61]
                }));
                b = new HashSet(Arrays.asList(new String[] {
                    z[78], z[57], z[58], z[73], z[75], z[63], z[79], z[77], z[69], z[71], 
                    z[67], z[68], z[55]
                }));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 2148
    //                   0 2171
    //                   1 2178
    //                   2 2185
    //                   3 2192;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2192;
_L3:
        byte byte1 = 22;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 50;
          goto _L9
_L5:
        byte1 = 8;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 66;
          goto _L9
    }
}
