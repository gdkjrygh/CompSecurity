// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g
{

    public static HashMap b;
    public static int d;
    public static HashMap j;
    private static final String z[];
    private Context a;
    public List c;
    public List e;
    public j f;
    public List g;
    public String h;
    public List i;
    public String k;
    public Map l;
    public byte m[];

    public g()
    {
        f = new j();
        c = new ArrayList();
    }

    public g(Context context)
    {
        f = new j();
        c = new ArrayList();
        a = context;
    }

    public static g a(f f1, int i1, String s)
    {
        int l4 = d;
        if (f1.b.equals(z[97])) goto _L2; else goto _L1
_L1:
        Log.e(z[86]);
        f1 = null;
_L7:
        return f1;
_L2:
        g g1;
        Iterator iterator;
        int j1;
        int k1;
        int l1;
        int i2;
        g1 = new g();
        iterator = f1.a.iterator();
        l1 = 0;
        k1 = 0;
        j1 = 0;
        i2 = 0;
_L24:
        c c2;
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_3825;
            }
            c2 = (c)iterator.next();
            s2 = c2.b;
        } while (TextUtils.isEmpty(c2.a) && l4 == 0);
        if (!s2.equals(z[80])) goto _L4; else goto _L3
_L3:
        int j2 = k1;
        k1 = j1;
        j1 = j2;
_L137:
        if (l4 == 0) goto _L6; else goto _L5
_L5:
        if (k1 == 0 && g1.g != null && g1.g.size() > 0)
        {
            ((a)g1.g.get(0)).b = true;
        }
        if (i2 == 0 && g1.i != null)
        {
            f1 = g1.i.iterator();
            do
            {
                if (!f1.hasNext())
                {
                    break;
                }
                s = (d)f1.next();
                if (((d) (s)).d != android/provider/ContactsContract$CommonDataKinds$StructuredPostal)
                {
                    continue;
                }
                s.f = true;
                if (l4 == 0)
                {
                    break;
                }
            } while (l4 == 0);
        }
        if (j1 == 0 && g1.i != null)
        {
            f1 = g1.i.iterator();
            do
            {
                if (!f1.hasNext())
                {
                    break;
                }
                s = (d)f1.next();
                if (((d) (s)).d != android/provider/ContactsContract$CommonDataKinds$Email)
                {
                    continue;
                }
                s.f = true;
                if (l4 == 0)
                {
                    break;
                }
            } while (l4 == 0);
        }
        f1 = g1;
        if (l1 == 0)
        {
            f1 = g1;
            if (g1.e != null)
            {
                f1 = g1;
                if (g1.e.size() > 0)
                {
                    ((i)g1.e.get(0)).c = true;
                    return g1;
                }
            }
        }
          goto _L7
_L4:
        if (!s2.equals(z[82])) goto _L9; else goto _L8
_L8:
        g1.f.a = c2.a;
        if (l4 == 0) goto _L10; else goto _L9
_L9:
        if (!s2.equals(z[91]) || g1.f.a != null) goto _L12; else goto _L11
_L11:
        g1.f.a = c2.a;
        if (l4 == 0) goto _L10; else goto _L12
_L12:
        if (!s2.equals("N")) goto _L14; else goto _L13
_L13:
        a(g1.f, c2.c, i1);
        if (l4 == 0) goto _L10; else goto _L14
_L14:
        if (!s2.equals(z[55])) goto _L16; else goto _L15
_L15:
        g1.k = c2.a;
        if (l4 == 0) goto _L10; else goto _L16
_L16:
        if (!s2.equals(z[71])) goto _L18; else goto _L17
_L17:
        if (!c2.e.contains(z[51]) || g1.k != null) goto _L20; else goto _L19
_L19:
        f1 = new StringBuilder();
        String s1 = c2.a;
        int j3 = s1.length();
        int k2 = 0;
        do
        {
            if (k2 >= j3)
            {
                break;
            }
            char c1 = s1.charAt(k2);
            if (c1 != ';')
            {
                f1.append(c1);
            }
            k2++;
        } while (l4 == 0);
        g1.k = f1.toString();
        if (l4 == 0) goto _L10; else goto _L20
_L20:
        g1.a(c2);
        if (l4 == 0) goto _L10; else goto _L18
_L18:
        if (!s2.equals(z[49])) goto _L22; else goto _L21
_L21:
        int l2;
        f1 = c2.c.iterator();
        l2 = 1;
        do
        {
            if (!f1.hasNext())
            {
                break;
            }
            if (((String)f1.next()).length() <= 0)
            {
                continue;
            }
            l2 = 0;
            boolean flag = false;
            if (l4 == 0)
            {
                break;
            }
            l2 = ((flag) ? 1 : 0);
        } while (l4 == 0);
        if (l2 && l4 == 0) goto _L24; else goto _L23
_L23:
        Object obj;
        Iterator iterator1;
        int k3;
        boolean flag2;
        k3 = -1;
        obj = "";
        iterator1 = c2.e.iterator();
        flag2 = false;
_L160:
        if (!iterator1.hasNext()) goto _L26; else goto _L25
_L25:
        Object obj1;
        boolean flag1;
        obj1 = (String)iterator1.next();
        flag1 = flag2;
        l2 = i2;
        if (!((String) (obj1)).equals(z[69])) goto _L28; else goto _L27
_L27:
        flag1 = flag2;
        l2 = i2;
        if (i2 != 0) goto _L28; else goto _L29
_L29:
        int l3;
        l3 = 1;
        l2 = 1;
        flag2 = true;
        flag1 = true;
        f1 = ((f) (obj));
        i2 = k3;
        if (l4 == 0) goto _L30; else goto _L28
_L28:
        if (!((String) (obj1)).equalsIgnoreCase(z[37])) goto _L32; else goto _L31
_L31:
        i2 = 1;
        k3 = 1;
        obj = "";
        flag2 = flag1;
        f1 = ((f) (obj));
        l3 = l2;
        if (l4 == 0) goto _L30; else goto _L32
_L32:
        if (!((String) (obj1)).equalsIgnoreCase(z[87]) && !((String) (obj1)).equalsIgnoreCase(z[44])) goto _L34; else goto _L33
_L33:
        k3 = 2;
        obj = "";
        flag2 = flag1;
        f1 = ((f) (obj));
        i2 = k3;
        l3 = l2;
        if (l4 == 0) goto _L30; else goto _L34
_L34:
        if (!((String) (obj1)).equalsIgnoreCase(z[50])) goto _L36; else goto _L35
_L35:
        f1 = ((f) (obj));
        i2 = k3;
_L140:
        if (l4 == 0) goto _L38; else goto _L37
_L37:
        k3 = i2;
        i2 = l2;
        l2 = k3;
_L159:
        int i4;
        int j4;
        int k4;
        k3 = l2;
        if (l2 < 0)
        {
            k3 = 1;
        }
        obj = c2.c;
        l2 = ((List) (obj)).size();
        obj1 = null;
        Iterator iterator2;
        if (l2 > 1)
        {
label0:
            {
                obj1 = new b();
                if (((List) (obj)).size() > 2)
                {
                    obj1.f = (String)((List) (obj)).get(2);
                }
                if (((List) (obj)).size() > 3)
                {
                    obj1.b = (String)((List) (obj)).get(3);
                }
                if (((List) (obj)).size() > 4)
                {
                    obj1.d = (String)((List) (obj)).get(4);
                }
                if (((List) (obj)).size() > 5)
                {
                    obj1.e = (String)((List) (obj)).get(5);
                }
                if (((List) (obj)).size() > 6)
                {
                    obj1.c = (String)((List) (obj)).get(6);
                }
                if (((List) (obj)).size() > 7)
                {
                    obj1.a = (String)((List) (obj)).get(7);
                    if (l4 == 0)
                    {
                        break label0;
                    }
                }
                Log.i((new StringBuilder()).append(z[92]).append(s).toString());
            }
            obj = ((b) (obj1)).toString().trim();
        } else
        {
            obj = c2.a;
        }
        g1.a(k3, ((String) (obj)), ((b) (obj1)), ((String) (f1)), flag1);
        j4 = l1;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L22
_L22:
        l2 = l1;
        if (!s2.equals(z[59])) goto _L41; else goto _L40
_L40:
        f1 = c2.e.iterator();
        flag1 = false;
        do
        {
            flag2 = flag1;
            l2 = l1;
            if (!f1.hasNext())
            {
                break;
            }
            if (((String)f1.next()).equals(z[79]) && l1 == 0)
            {
                l1 = 1;
                flag1 = true;
            }
            if (l4 == 0)
            {
                continue;
            }
            l2 = l1;
            flag2 = flag1;
            break;
        } while (true);
        obj = c2.c;
        f1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
label1:
        do
        {
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label1;
                }
                f1.append((String)((Iterator) (obj)).next());
            } while (!((Iterator) (obj)).hasNext());
            f1.append(' ');
        } while (l4 == 0);
        g1.a(1, f1.toString(), "", flag2);
        j4 = l2;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L41
_L41:
        if (!s2.equals(z[63])) goto _L43; else goto _L42
_L42:
        g1.j(c2.a);
        j4 = l2;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L43
_L43:
        if (!s2.equals(z[43])) goto _L45; else goto _L44
_L44:
        g1.j(c2.a);
        j4 = l2;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L45
_L45:
        if (!s2.equals(z[98])) goto _L47; else goto _L46
_L46:
        g1.m = c2.a.getBytes();
        j4 = l2;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L47
_L47:
        if (!s2.equals(z[81])) goto _L49; else goto _L48
_L48:
        Log.e(z[64]);
        j4 = l2;
        i4 = k1;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L49
_L49:
        k3 = k1;
        if (!s2.equals(z[60])) goto _L51; else goto _L50
_L50:
        iterator2 = c2.e.iterator();
        l1 = -1;
        f1 = null;
        flag2 = false;
_L158:
        if (!iterator2.hasNext()) goto _L53; else goto _L52
_L52:
        obj1 = (String)iterator2.next();
        flag1 = flag2;
        k3 = k1;
        if (!((String) (obj1)).equals(z[93])) goto _L55; else goto _L54
_L54:
        flag1 = flag2;
        k3 = k1;
        if (k1 != 0) goto _L55; else goto _L56
_L56:
        l3 = 1;
        k3 = 1;
        flag2 = true;
        flag1 = true;
        obj = f1;
        k1 = l1;
        if (l4 == 0) goto _L57; else goto _L55
_L55:
        if (!((String) (obj1)).equalsIgnoreCase(z[56])) goto _L59; else goto _L58
_L58:
        k1 = 1;
        l1 = 1;
        flag2 = flag1;
        obj = f1;
        l3 = k3;
        if (l4 == 0) goto _L57; else goto _L59
_L59:
        k1 = l1;
        if (!((String) (obj1)).equalsIgnoreCase(z[67])) goto _L61; else goto _L60
_L60:
        l1 = 2;
        flag2 = flag1;
        obj = f1;
        k1 = l1;
        l3 = k3;
        if (l4 == 0) goto _L57; else goto _L62
_L62:
        k1 = l1;
_L61:
        if (!((String) (obj1)).equalsIgnoreCase(z[76])) goto _L64; else goto _L63
_L63:
        l1 = 4;
        flag2 = flag1;
        obj = f1;
        k1 = l1;
        l3 = k3;
        if (l4 == 0) goto _L57; else goto _L65
_L65:
        k1 = l1;
_L64:
        obj = f1;
        l1 = k1;
        if (!((String) (obj1)).toUpperCase().startsWith(z[41])) goto _L67; else goto _L66
_L66:
        obj = f1;
        l1 = k1;
        if (k1 >= 0) goto _L67; else goto _L68
_L68:
        k1 = 0;
        l1 = 0;
        f1 = ((String) (obj1)).substring(2);
        flag2 = flag1;
        obj = f1;
        l3 = k3;
        if (l4 == 0) goto _L57; else goto _L69
_L69:
        obj = f1;
_L67:
        flag2 = flag1;
        k1 = l1;
        l3 = k3;
        if (l1 >= 0) goto _L57; else goto _L70
_L70:
        l1 = 0;
        f1 = ((f) (obj1));
        k1 = k3;
_L156:
        if (l4 == 0) goto _L72; else goto _L71
_L71:
        k3 = k1;
_L157:
        k1 = l1;
        if (l1 < 0)
        {
            k1 = 3;
        }
        g1.a(android/provider/ContactsContract$CommonDataKinds$Email, k1, c2.a, ((String) (f1)), flag1);
        j4 = l2;
        i4 = k3;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L51
_L51:
        k1 = j1;
        if (!s2.equals(z[65])) goto _L74; else goto _L73
_L73:
        iterator2 = c2.e.iterator();
        k1 = -1;
        f1 = null;
        flag2 = false;
        l1 = 0;
        i4 = j1;
        j1 = k1;
_L155:
        k1 = j1;
        if (!iterator2.hasNext()) goto _L76; else goto _L75
_L75:
        obj1 = (String)iterator2.next();
        k1 = j1;
        if (l1 == 0) goto _L78; else goto _L77
_L77:
        if (!((String) (obj1)).equals(z[53])) goto _L80; else goto _L79
_L79:
        j1 = 5;
        k1 = j1;
        if (l4 == 0) goto _L76; else goto _L80
_L80:
        k1 = j1;
        if (!((String) (obj1)).equals(z[42])) goto _L76; else goto _L81
_L81:
        j1 = 4;
        k1 = j1;
        if (l4 == 0) goto _L76; else goto _L82
_L82:
        k1 = j1;
_L78:
        flag1 = flag2;
        l3 = i4;
        if (!((String) (obj1)).equals(z[48])) goto _L84; else goto _L83
_L83:
        flag1 = flag2;
        l3 = i4;
        if (i4 != 0) goto _L84; else goto _L85
_L85:
        j4 = 1;
        l3 = 1;
        flag2 = true;
        flag1 = true;
        i4 = l1;
        obj = f1;
        j1 = k1;
        if (l4 == 0) goto _L86; else goto _L84
_L84:
        if (!((String) (obj1)).equalsIgnoreCase(z[84])) goto _L88; else goto _L87
_L87:
        j1 = 1;
        k1 = 1;
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L88
_L88:
        if (!((String) (obj1)).equalsIgnoreCase(z[54])) goto _L90; else goto _L89
_L89:
        k1 = 3;
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j1 = k1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L90
_L90:
        if (!((String) (obj1)).equalsIgnoreCase(z[47])) goto _L92; else goto _L91
_L91:
        k1 = 2;
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j1 = k1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L92
_L92:
        if (!((String) (obj1)).equalsIgnoreCase(z[73])) goto _L94; else goto _L93
_L93:
        k1 = 6;
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j1 = k1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L94
_L94:
        if (!((String) (obj1)).equalsIgnoreCase(z[96])) goto _L96; else goto _L95
_L95:
        i4 = 1;
        l1 = 1;
        flag2 = flag1;
        obj = f1;
        j1 = k1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L96
_L96:
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j1 = k1;
        j4 = l3;
        if (((String) (obj1)).equalsIgnoreCase(z[46])) goto _L86; else goto _L97
_L97:
        if (!((String) (obj1)).equalsIgnoreCase(z[38])) goto _L99; else goto _L98
_L98:
        j1 = k1;
        k1 = l1;
_L151:
        if (l4 == 0) goto _L101; else goto _L100
_L100:
        k1 = j1;
        j1 = l3;
_L154:
        l1 = k1;
        if (k1 < 0)
        {
            l1 = 1;
        }
        g1.b(l1, c2.a, f1, flag1);
        j4 = l2;
        i4 = k3;
        l3 = j1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L102
_L102:
        k1 = j1;
_L74:
        if (!s2.equals(z[74])) goto _L104; else goto _L103
_L103:
        g1.c.add(c2.a);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L104
_L104:
        if (!s2.equals(z[66])) goto _L106; else goto _L105
_L105:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L106
_L106:
        if (!s2.equals(z[77])) goto _L108; else goto _L107
_L107:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L108
_L108:
        if (!s2.equals(z[72])) goto _L110; else goto _L109
_L109:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L110
_L110:
        if (!s2.equals(z[61])) goto _L112; else goto _L111
_L111:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L112
_L112:
        if (!s2.equals(z[95])) goto _L114; else goto _L113
_L113:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L114
_L114:
        if (!s2.equals(z[78])) goto _L116; else goto _L115
_L115:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L116
_L116:
        if (!s2.equals(z[58])) goto _L118; else goto _L117
_L117:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L118
_L118:
        if (!s2.equals(z[40])) goto _L120; else goto _L119
_L119:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L120
_L120:
        if (!s2.equals(z[94])) goto _L122; else goto _L121
_L121:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L122
_L122:
        if (!s2.equals(z[75])) goto _L124; else goto _L123
_L123:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L124
_L124:
        if (!s2.equals(z[90])) goto _L126; else goto _L125
_L125:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L126
_L126:
        if (!s2.equals(z[85])) goto _L128; else goto _L127
_L127:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L128
_L128:
        if (!s2.equals(z[52])) goto _L130; else goto _L129
_L129:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L130
_L130:
        if (!s2.equals(z[45])) goto _L132; else goto _L131
_L131:
        g1.a(c2);
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L132
_L132:
        if (!s2.equals(z[68])) goto _L134; else goto _L133
_L133:
        g1.f.g = c2.a;
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L134
_L134:
        if (!s2.equals(z[89])) goto _L136; else goto _L135
_L135:
        l1 = l2;
        j1 = k3;
          goto _L137
_L36:
        flag2 = flag1;
        f1 = ((f) (obj));
        i2 = k3;
        l3 = l2;
        if (((String) (obj1)).equalsIgnoreCase(z[62])) goto _L30; else goto _L138
_L138:
        flag2 = flag1;
        f1 = ((f) (obj));
        i2 = k3;
        l3 = l2;
        if (((String) (obj1)).equalsIgnoreCase(z[83])) goto _L30; else goto _L139
_L139:
label2:
        {
            if (!((String) (obj1)).equalsIgnoreCase(z[39]))
            {
                break label2;
            }
            f1 = ((f) (obj));
            i2 = k3;
        }
          goto _L140
        f1 = ((f) (obj));
        i4 = k3;
        if (!((String) (obj1)).toUpperCase().startsWith(z[70])) goto _L142; else goto _L141
_L141:
        f1 = ((f) (obj));
        i4 = k3;
        if (k3 >= 0) goto _L142; else goto _L143
_L143:
        i2 = 0;
        i4 = 0;
        obj = ((String) (obj1)).substring(2);
        flag2 = flag1;
        f1 = ((f) (obj));
        l3 = l2;
        if (l4 == 0) goto _L30; else goto _L144
_L144:
        f1 = ((f) (obj));
_L142:
        flag2 = flag1;
        i2 = i4;
        l3 = l2;
        if (i4 >= 0) goto _L30; else goto _L145
_L145:
        i2 = 0;
        f1 = ((f) (obj1));
          goto _L140
_L99:
        obj = f1;
        k4 = k1;
        if (!((String) (obj1)).toUpperCase().startsWith(z[57])) goto _L147; else goto _L146
_L146:
        obj = f1;
        k4 = k1;
        if (k1 >= 0) goto _L147; else goto _L148
_L148:
        j1 = 0;
        k4 = 0;
        f1 = ((String) (obj1)).substring(2);
        i4 = l1;
        flag2 = flag1;
        obj = f1;
        j4 = l3;
        if (l4 == 0) goto _L86; else goto _L149
_L149:
        obj = f1;
_L147:
        i4 = l1;
        flag2 = flag1;
        j1 = k4;
        j4 = l3;
        if (k4 >= 0) goto _L86; else goto _L150
_L150:
        j1 = 0;
        f1 = ((f) (obj1));
        k1 = l1;
          goto _L151
_L136:
        if (!s2.equals(z[88])) goto _L153; else goto _L152
_L152:
        g1.f.c = c2.a;
        j4 = l2;
        i4 = k3;
        l3 = k1;
        k4 = i2;
        if (l4 == 0) goto _L39; else goto _L153
_L153:
        g1.a(c2);
        k4 = i2;
        l3 = k1;
        i4 = k3;
        j4 = l2;
_L39:
        l1 = j4;
        j1 = i4;
        k1 = l3;
        i2 = k4;
          goto _L137
_L6:
        l2 = k1;
        k1 = j1;
        j1 = l2;
          goto _L24
_L86:
        k1 = i4;
        flag1 = flag2;
        f1 = ((f) (obj));
        l3 = j4;
          goto _L151
_L76:
        flag1 = flag2;
        j1 = i4;
          goto _L154
_L101:
        l1 = k1;
        flag2 = flag1;
        i4 = l3;
          goto _L155
_L57:
        flag1 = flag2;
        f1 = ((f) (obj));
        l1 = k1;
        k1 = l3;
          goto _L156
_L53:
        flag1 = flag2;
        k3 = k1;
          goto _L157
_L72:
        flag2 = flag1;
          goto _L158
_L30:
        flag1 = flag2;
        l2 = l3;
          goto _L140
_L26:
        l2 = k3;
        flag1 = flag2;
        f1 = ((f) (obj));
          goto _L159
_L38:
        flag2 = flag1;
        obj = f1;
        k3 = i2;
        i2 = l2;
          goto _L160
_L10:
        int i3 = j1;
        j1 = k1;
        k1 = i3;
          goto _L137
        i1 = j1;
        j1 = k1;
        k1 = i1;
          goto _L5
    }

    private static void a(j j1, List list, int i1)
    {
        i1 = list.size();
        if (i1 > 1)
        {
            j1.h = (String)list.get(0);
            j1.b = (String)list.get(1);
            if (i1 > 2 && ((String)list.get(2)).length() > 0)
            {
                j1.e = (String)list.get(2);
            }
            if (i1 > 3 && ((String)list.get(3)).length() > 0)
            {
                j1.d = (String)list.get(3);
            }
            if (i1 > 4 && ((String)list.get(4)).length() > 0)
            {
                j1.f = (String)list.get(4);
            }
        }
    }

    public static byte[] a(Context context, String s)
    {
        Object obj = null;
        String s1 = z[101];
        String s2 = z[100];
        s = context.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new String[] {
            z[99]
        }, s1, new String[] {
            s, s2
        }, null);
        context = obj;
        if (s.moveToFirst())
        {
            context = s.getBlob(0);
        }
        return context;
    }

    public static g i(String s)
    {
        if (s != null)
        {
            Object obj = new h();
            e e1 = new e();
            if (!((h) (obj)).a(s, z[110], e1))
            {
                Log.w((new StringBuilder()).append(z[111]).append(s).toString());
            }
            obj = e1.f.iterator();
            if (((Iterator) (obj)).hasNext())
            {
                return a((f)((Iterator) (obj)).next(), 0, s);
            }
        }
        return null;
    }

    public String a()
    {
        int i1 = d;
        if (f.a != null)
        {
            return f.a;
        }
        if (i != null && i.size() > 0)
        {
            Iterator iterator = i.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                if (d1.d == android/provider/ContactsContract$CommonDataKinds$Email && d1.f)
                {
                    return d1.a;
                }
            } while (i1 == 0);
        }
        if (g != null && g.size() > 0)
        {
            Iterator iterator1 = g.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator1.next();
                if (a1.b)
                {
                    return a1.a;
                }
            } while (i1 == 0);
        }
        return "";
    }

    public void a(int i1, String s, b b1, String s1, boolean flag)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        d d1 = new d();
        d1.d = android/provider/ContactsContract$CommonDataKinds$StructuredPostal;
        d1.e = i1;
        d1.a = s;
        d1.c = b1;
        d1.b = s1;
        d1.f = flag;
        i.add(d1);
    }

    public void a(int i1, String s, String s1, boolean flag)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        i j1 = new i();
        j1.d = i1;
        j1.a = s;
        j1.b = s1;
        j1.c = flag;
        e.add(j1);
    }

    public void a(Cursor cursor)
    {
        boolean flag = true;
        int i1 = d;
        if (i == null)
        {
            i = new ArrayList();
        }
        d d1 = new d();
        d1.d = android/provider/ContactsContract$CommonDataKinds$StructuredPostal;
        d1.e = cursor.getInt(cursor.getColumnIndex(z[22]));
        d1.a = cursor.getString(cursor.getColumnIndex(z[26]));
        d1.c = new b();
        String s = cursor.getString(cursor.getColumnIndex(z[23]));
        if (s != null)
        {
            d1.c.f = s.replaceAll(z[29], " ");
        }
        d1.c.b = cursor.getString(cursor.getColumnIndex(z[24]));
        d1.c.d = cursor.getString(cursor.getColumnIndex(z[30]));
        d1.c.e = cursor.getString(cursor.getColumnIndex(z[28]));
        d1.c.c = cursor.getString(cursor.getColumnIndex(z[21]));
        d1.b = cursor.getString(cursor.getColumnIndex(z[27]));
        if (cursor.getInt(cursor.getColumnIndex(z[25])) != 1)
        {
            flag = false;
        }
        d1.f = flag;
        i.add(d1);
        if (i1 != 0)
        {
            DialogToastActivity.g++;
        }
    }

    public void a(c c1)
    {
        Object obj;
label0:
        {
            if (c1.a == null || c1.a.length() == 0)
            {
                return;
            }
            String s = c1.b;
            if (l == null)
            {
                l = new HashMap();
            }
            if (!l.containsKey(s))
            {
                obj = new ArrayList();
                l.put(s, obj);
                if (d == 0)
                {
                    break label0;
                }
            }
            obj = (List)l.get(s);
        }
        ((List) (obj)).add(c1);
    }

    public void a(Class class1, int i1, String s, String s1, boolean flag)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        d d1 = new d();
        d1.d = class1;
        d1.e = i1;
        d1.a = s;
        d1.b = s1;
        d1.f = flag;
        i.add(d1);
    }

    public void a(String s)
    {
        int i1 = d;
        s = a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, z[117], new String[] {
            s
        }, null);
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            int j1 = s.getInt(s.getColumnIndex(z[120]));
            String s1 = s.getString(s.getColumnIndex(z[119]));
            String s2 = s.getString(s.getColumnIndex(z[118]));
            boolean flag;
            if (s.getInt(s.getColumnIndex(z[121])) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(android/provider/ContactsContract$CommonDataKinds$Email, j1, s1, s2, flag);
        } while (i1 == 0);
        s.close();
    }

    public void b(int i1, String s, String s1, boolean flag)
    {
        int j1 = d;
        if (g == null)
        {
            g = new ArrayList();
        }
        a a1 = new a();
        a1.d = i1;
        StringBuilder stringbuilder = new StringBuilder();
        s = s.trim();
        int k1 = s.length();
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            char c1 = s.charAt(i1);
            if ('0' <= c1 && c1 <= '9' || i1 == 0 && c1 == '+' || c1 == ',')
            {
                stringbuilder.append(c1);
            }
            i1++;
        } while (j1 == 0);
        a1.a = PhoneNumberUtils.formatNumber(stringbuilder.toString());
        a1.c = s1;
        a1.b = flag;
        g.add(a1);
    }

    public void b(String s)
    {
        int i1 = d;
        s = a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, null, z[4], new String[] {
            s
        }, null);
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            a(s);
        } while (i1 == 0);
        s.close();
    }

    public void c(String s)
    {
        String s1 = z[105];
        String s2 = z[104];
        s = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, s1, new String[] {
            s, s2, String.valueOf(3)
        }, null);
        if (s.moveToFirst())
        {
            c c1 = new c();
            c1.b = z[102];
            c1.a = s.getString(s.getColumnIndex(z[103]));
            a(c1);
        }
        s.close();
    }

    public void d(String s)
    {
        int i1 = d;
        s = a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, z[113], new String[] {
            s
        }, null);
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            int j1 = s.getInt(s.getColumnIndex(z[114]));
            String s1 = s.getString(s.getColumnIndex(z[116]));
            String s2 = s.getString(s.getColumnIndex(z[112]));
            boolean flag;
            if (s.getInt(s.getColumnIndex(z[115])) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b(j1, s1, s2, flag);
        } while (i1 == 0);
        s.close();
    }

    public void e(String s)
    {
        int i1 = d;
        String s1 = z[108];
        String s2 = z[109];
        s = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, s1, new String[] {
            s, s2
        }, null);
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            int j1 = s.getInt(s.getColumnIndex(z[107]));
            c c1 = new c();
            c1.a = s.getString(s.getColumnIndex(z[106]));
            String s3 = a.getString(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(j1));
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((String)entry.getValue()).equalsIgnoreCase(s3))
                {
                    c1.b = (String)entry.getKey();
                }
            } while (i1 == 0);
            c1.a(a.getString(android.provider.ContactsContract.CommonDataKinds.Im.getTypeLabelResource(j1)));
            a(c1);
        } while (i1 == 0);
        s.close();
    }

    public void f(String s)
    {
        String s1 = z[1];
        String s2 = z[2];
        s = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, s1, new String[] {
            s, s2
        }, null);
        if (s.moveToFirst())
        {
            c c1 = new c();
            c1.b = z[3];
            c1.a = s.getString(s.getColumnIndex(z[0]));
            a(c1);
        }
        s.close();
    }

    public void g(String s)
    {
        Object obj = z[35];
        String s1 = z[36];
        obj = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, ((String) (obj)), new String[] {
            s, s1
        }, null);
        if (((Cursor) (obj)).moveToFirst())
        {
            Object obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(z[33]));
            s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(z[32]));
            obj1 = (new StringBuilder()).append(((String) (obj1)));
            boolean flag;
            if (s == null || s.length() == 0)
            {
                s = "";
            } else
            {
                s = (new StringBuilder()).append(";").append(s).toString();
            }
            s = ((StringBuilder) (obj1)).append(s).toString();
            obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(z[31]));
            if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex(z[34])) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(1, s, ((String) (obj1)), flag);
        }
        ((Cursor) (obj)).close();
    }

    public void h(String s)
    {
        int i1 = d;
        String s1 = z[20];
        String s2 = z[6];
        String s3 = z[5];
        String s4 = z[10];
        String s5 = z[11];
        String s6 = z[13];
        String s7 = z[8];
        ContentResolver contentresolver = a.getContentResolver();
        android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
        String s8 = z[16];
        String s9 = z[18];
        s = contentresolver.query(uri, new String[] {
            s1, s2, s3, s4, s5, s6, s7
        }, s8, new String[] {
            s, s9
        }, null);
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            f.b = s.getString(s.getColumnIndex(z[7]));
            f.h = s.getString(s.getColumnIndex(z[15]));
            f.e = s.getString(s.getColumnIndex(z[19]));
            f.d = s.getString(s.getColumnIndex(z[17]));
            f.f = s.getString(s.getColumnIndex(z[9]));
            f.g = s.getString(s.getColumnIndex(z[14]));
            f.c = s.getString(s.getColumnIndex(z[12]));
        } while (i1 == 0);
        s.close();
    }

    public void j(String s)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        int j1 = e.size();
        int i1 = j1;
        if (j1 == 0)
        {
            a(2, "", null, false);
            i1 = 1;
        }
        ((i)e.get(i1 - 1)).b = s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[122];
        obj = "\bs\0301T";
        byte0 = -1;
        i1 = 0;
_L125:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L152:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 120: default 548
    //                   0 564
    //                   1 580
    //                   2 596
    //                   3 612
    //                   4 628
    //                   5 645
    //                   6 663
    //                   7 681
    //                   8 699
    //                   9 717
    //                   10 735
    //                   11 753
    //                   12 771
    //                   13 789
    //                   14 807
    //                   15 825
    //                   16 843
    //                   17 861
    //                   18 879
    //                   19 897
    //                   20 915
    //                   21 933
    //                   22 951
    //                   23 969
    //                   24 987
    //                   25 1005
    //                   26 1023
    //                   27 1041
    //                   28 1059
    //                   29 1077
    //                   30 1095
    //                   31 1113
    //                   32 1131
    //                   33 1149
    //                   34 1167
    //                   35 1185
    //                   36 1203
    //                   37 1221
    //                   38 1239
    //                   39 1257
    //                   40 1275
    //                   41 1293
    //                   42 1311
    //                   43 1329
    //                   44 1347
    //                   45 1365
    //                   46 1383
    //                   47 1401
    //                   48 1419
    //                   49 1437
    //                   50 1455
    //                   51 1473
    //                   52 1491
    //                   53 1509
    //                   54 1527
    //                   55 1545
    //                   56 1563
    //                   57 1581
    //                   58 1599
    //                   59 1617
    //                   60 1635
    //                   61 1653
    //                   62 1671
    //                   63 1689
    //                   64 1707
    //                   65 1725
    //                   66 1743
    //                   67 1761
    //                   68 1779
    //                   69 1797
    //                   70 1815
    //                   71 1833
    //                   72 1851
    //                   73 1869
    //                   74 1887
    //                   75 1905
    //                   76 1923
    //                   77 1941
    //                   78 1959
    //                   79 1977
    //                   80 1995
    //                   81 2013
    //                   82 2031
    //                   83 2049
    //                   84 2067
    //                   85 2085
    //                   86 2103
    //                   87 2121
    //                   88 2139
    //                   89 2157
    //                   90 2175
    //                   91 2193
    //                   92 2211
    //                   93 2229
    //                   94 2247
    //                   95 2265
    //                   96 2283
    //                   97 2301
    //                   98 2319
    //                   99 2337
    //                   100 2355
    //                   101 2373
    //                   102 2391
    //                   103 2409
    //                   104 2427
    //                   105 2445
    //                   106 2463
    //                   107 2481
    //                   108 2499
    //                   109 2517
    //                   110 2535
    //                   111 2553
    //                   112 2571
    //                   113 2589
    //                   114 2607
    //                   115 2625
    //                   116 2643
    //                   117 2661
    //                   118 2679
    //                   119 2697
    //                   120 2715;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99 _L100 _L101 _L102 _L103 _L104 _L105 _L106 _L107 _L108 _L109 _L110 _L111 _L112 _L113 _L114 _L115 _L116 _L117 _L118 _L119 _L120 _L121 _L122 _L123 _L124
_L3:
        as1[i1] = ((String) (obj));
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wLmES";
        i1 = 1;
        byte0 = 0;
          goto _L125
_L4:
        as1[i1] = ((String) (obj));
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\013\005q\007>\004\001w";
        i1 = 2;
        byte0 = 1;
          goto _L125
_L5:
        as1[i1] = ((String) (obj));
        i1 = 3;
        obj = "\"[/\033+-_)";
        byte0 = 2;
          goto _L125
_L6:
        as1[i1] = ((String) (obj));
        i1 = 4;
        obj = "\017}\002$\004\017f39\001L/Lo";
        byte0 = 3;
          goto _L125
_L7:
        as1[i1] = ((String) (obj));
        obj = "\bs\0301P";
        byte0 = 4;
        i1 = 5;
          goto _L125
_L8:
        as1[i1] = ((String) (obj));
        i1 = 6;
        obj = "\bs\0301V";
        byte0 = 5;
          goto _L125
_L9:
        as1[i1] = ((String) (obj));
        i1 = 7;
        obj = "\bs\0301W";
        byte0 = 6;
          goto _L125
_L10:
        as1[i1] = ((String) (obj));
        i1 = 8;
        obj = "\bs\0301\\";
        byte0 = 7;
          goto _L125
_L11:
        as1[i1] = ((String) (obj));
        i1 = 9;
        obj = "\bs\0301S";
        byte0 = 8;
          goto _L125
_L12:
        as1[i1] = ((String) (obj));
        i1 = 10;
        obj = "\bs\0301Q";
        byte0 = 9;
          goto _L125
_L13:
        as1[i1] = ((String) (obj));
        i1 = 11;
        obj = "\bs\0301S";
        byte0 = 10;
          goto _L125
_L14:
        as1[i1] = ((String) (obj));
        i1 = 12;
        obj = "\bs\0301\\";
        byte0 = 11;
          goto _L125
_L15:
        as1[i1] = ((String) (obj));
        i1 = 13;
        obj = "\bs\0301R";
        byte0 = 12;
          goto _L125
_L16:
        as1[i1] = ((String) (obj));
        i1 = 14;
        obj = "\bs\0301R";
        byte0 = 13;
          goto _L125
_L17:
        as1[i1] = ((String) (obj));
        i1 = 15;
        obj = "\bs\0301V";
        byte0 = 14;
          goto _L125
_L18:
        as1[i1] = ((String) (obj));
        i1 = 16;
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wQo";
        byte0 = 15;
          goto _L125
_L19:
        as1[i1] = ((String) (obj));
        i1 = 17;
        obj = "\bs\0301Q";
        byte0 = 16;
          goto _L125
_L20:
        as1[i1] = ((String) (obj));
        i1 = 18;
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\013\r\177\t";
        byte0 = 17;
          goto _L125
_L21:
        as1[i1] = ((String) (obj));
        i1 = 19;
        obj = "\bs\0301P";
        byte0 = 18;
          goto _L125
_L22:
        as1[i1] = ((String) (obj));
        i1 = 20;
        obj = "\bs\0301W";
        byte0 = 19;
          goto _L125
_L23:
        as1[i1] = ((String) (obj));
        i1 = 21;
        obj = "\bs\0301T\\";
        byte0 = 20;
          goto _L125
_L24:
        as1[i1] = ((String) (obj));
        i1 = 22;
        obj = "\bs\0301W";
        byte0 = 21;
          goto _L125
_L25:
        as1[i1] = ((String) (obj));
        i1 = 23;
        obj = "\bs\0301Q";
        byte0 = 22;
          goto _L125
_L26:
        as1[i1] = ((String) (obj));
        i1 = 24;
        obj = "\bs\0301R";
        byte0 = 23;
          goto _L125
_L27:
        as1[i1] = ((String) (obj));
        i1 = 25;
        obj = "\005a3 \027\005\177\r\"\034";
        byte0 = 24;
          goto _L125
_L28:
        as1[i1] = ((String) (obj));
        i1 = 26;
        obj = "\bs\0301T";
        byte0 = 25;
          goto _L125
_L29:
        as1[i1] = ((String) (obj));
        i1 = 27;
        obj = "\bs\0301V";
        byte0 = 26;
          goto _L125
_L30:
        as1[i1] = ((String) (obj));
        i1 = 28;
        obj = "\bs\0301\\";
        byte0 = 27;
          goto _L125
_L31:
        as1[i1] = ((String) (obj));
        i1 = 29;
        obj = "D\037f,h\020\030\020ZhE";
        byte0 = 28;
          goto _L125
_L32:
        as1[i1] = ((String) (obj));
        i1 = 30;
        obj = "\bs\0301]";
        byte0 = 29;
          goto _L125
_L33:
        as1[i1] = ((String) (obj));
        i1 = 31;
        obj = "\bs\0301Q";
        byte0 = 30;
          goto _L125
_L34:
        as1[i1] = ((String) (obj));
        i1 = 32;
        obj = "\bs\0301P";
        byte0 = 31;
          goto _L125
_L35:
        as1[i1] = ((String) (obj));
        i1 = 33;
        obj = "\bs\0301T";
        byte0 = 32;
          goto _L125
_L36:
        as1[i1] = ((String) (obj));
        i1 = 34;
        obj = "\005a3 \027\005\177\r\"\034";
        byte0 = 33;
          goto _L125
_L37:
        as1[i1] = ((String) (obj));
        i1 = 35;
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wLmES";
        byte0 = 34;
          goto _L125
_L38:
        as1[i1] = ((String) (obj));
        i1 = 36;
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\n\036u\r>\f\026s\0309\n\002";
        byte0 = 35;
          goto _L125
_L39:
        as1[i1] = ((String) (obj));
        i1 = 37;
        obj = "$]!\025";
        byte0 = 36;
          goto _L125
_L40:
        as1[i1] = ((String) (obj));
        i1 = 38;
        obj = "!A+";
        byte0 = 37;
          goto _L125
_L41:
        as1[i1] = ((String) (obj));
        i1 = 39;
        obj = "%\\8\034";
        byte0 = 38;
          goto _L125
_L42:
        as1[i1] = ((String) (obj));
        i1 = 40;
        obj = "+W#";
        byte0 = 39;
          goto _L125
_L43:
        as1[i1] = ((String) (obj));
        i1 = 41;
        obj = "4?";
        byte0 = 40;
          goto _L125
_L44:
        as1[i1] = ((String) (obj));
        i1 = 42;
        obj = ";]>\033";
        byte0 = 41;
          goto _L125
_L45:
        as1[i1] = ((String) (obj));
        i1 = 43;
        obj = ">] \025";
        byte0 = 42;
          goto _L125
_L46:
        as1[i1] = ((String) (obj));
        i1 = 44;
        obj = "/]!\000$\"K";
        byte0 = 43;
          goto _L125
_L47:
        as1[i1] = ((String) (obj));
        i1 = 45;
        obj = "<@#\024,(";
        byte0 = 44;
          goto _L125
_L48:
        as1[i1] = ((String) (obj));
        i1 = 46;
        obj = ":]%\023 ";
        byte0 = 45;
          goto _L125
_L49:
        as1[i1] = ((String) (obj));
        i1 = 47;
        obj = "/W \034";
        byte0 = 46;
          goto _L125
_L50:
        as1[i1] = ((String) (obj));
        i1 = 48;
        obj = "<@)\026";
        byte0 = 47;
          goto _L125
_L51:
        as1[i1] = ((String) (obj));
        i1 = 49;
        obj = "-V>";
        byte0 = 48;
          goto _L125
_L52:
        as1[i1] = ((String) (obj));
        i1 = 50;
        obj = "<]?\004$ ";
        byte0 = 49;
          goto _L125
_L53:
        as1[i1] = ((String) (obj));
        i1 = 51;
        obj = "4?%\002(/?\"";
        byte0 = 50;
          goto _L125
_L54:
        as1[i1] = ((String) (obj));
        i1 = 52;
        obj = "?]9\002&)";
        byte0 = 51;
          goto _L125
_L55:
        as1[i1] = ((String) (obj));
        i1 = 53;
        obj = "$]!\025";
        byte0 = 52;
          goto _L125
_L56:
        as1[i1] = ((String) (obj));
        i1 = 54;
        obj = ";]>\033";
        byte0 = 53;
          goto _L125
_L57:
        as1[i1] = ((String) (obj));
        i1 = 55;
        obj = "?]>\004H?F>\031++";
        byte0 = 54;
          goto _L125
_L58:
        as1[i1] = ((String) (obj));
        i1 = 56;
        obj = "$]!\025";
        byte0 = 55;
          goto _L125
_L59:
        as1[i1] = ((String) (obj));
        i1 = 57;
        obj = "4?";
        byte0 = 56;
          goto _L125
_L60:
        as1[i1] = ((String) (obj));
        i1 = 58;
        obj = "8H";
        byte0 = 57;
          goto _L125
_L61:
        as1[i1] = ((String) (obj));
        i1 = 59;
        obj = "#@+";
        byte0 = 58;
          goto _L125
_L62:
        as1[i1] = ((String) (obj));
        i1 = 60;
        obj = ")_-\031)";
        byte0 = 59;
          goto _L125
_L63:
        as1[i1] = ((String) (obj));
        i1 = 61;
        obj = "9[(";
        byte0 = 60;
          goto _L125
_L64:
        as1[i1] = ((String) (obj));
        i1 = 62;
        obj = "<S>\023  ";
        byte0 = 61;
          goto _L125
_L65:
        as1[i1] = ((String) (obj));
        i1 = 63;
        obj = "8[8\034 ";
        byte0 = 62;
          goto _L125
_L66:
        as1[i1] = ((String) (obj));
        i1 = 64;
        obj = "\002s\0015J ]+\037J\033w34\n\0025\030\017\026\031b\034?\027\030";
        byte0 = 63;
          goto _L125
_L67:
        as1[i1] = ((String) (obj));
        i1 = 65;
        obj = "8W ";
        byte0 = 64;
          goto _L125
_L68:
        as1[i1] = ((String) (obj));
        i1 = 66;
        obj = ".V-\t";
        byte0 = 65;
          goto _L125
_L69:
        as1[i1] = ((String) (obj));
        i1 = 67;
        obj = ";]>\033";
        byte0 = 66;
          goto _L125
_L70:
        as1[i1] = ((String) (obj));
        i1 = 68;
        obj = "4?<\030*\"W8\031&AT%\00268?\"\021()";
        byte0 = 67;
          goto _L125
_L71:
        as1[i1] = ((String) (obj));
        i1 = 69;
        obj = "<@)\026";
        byte0 = 68;
          goto _L125
_L72:
        as1[i1] = ((String) (obj));
        i1 = 70;
        obj = "4?";
        byte0 = 69;
          goto _L125
_L73:
        as1[i1] = ((String) (obj));
        i1 = 71;
        obj = "?]9\036!";
        byte0 = 70;
          goto _L125
_L74:
        as1[i1] = ((String) (obj));
        i1 = 72;
        obj = ">W:";
        byte0 = 71;
          goto _L125
_L75:
        as1[i1] = ((String) (obj));
        i1 = 73;
        obj = "<S+\0257";
        byte0 = 72;
          goto _L125
_L76:
        as1[i1] = ((String) (obj));
        i1 = 74;
        obj = "\"]8\025";
        byte0 = 73;
          goto _L125
_L77:
        as1[i1] = ((String) (obj));
        i1 = 75;
        obj = "/^-\0036";
        byte0 = 74;
          goto _L125
_L78:
        as1[i1] = ((String) (obj));
        i1 = 76;
        obj = "/W \034";
        byte0 = 75;
          goto _L125
_L79:
        as1[i1] = ((String) (obj));
        i1 = 77;
        obj = "9@ ";
        byte0 = 76;
          goto _L125
_L80:
        as1[i1] = ((String) (obj));
        i1 = 78;
        obj = "!S%\034 >";
        byte0 = 77;
          goto _L125
_L81:
        as1[i1] = ((String) (obj));
        i1 = 79;
        obj = "<@)\026";
        byte0 = 78;
          goto _L125
_L82:
        as1[i1] = ((String) (obj));
        i1 = 80;
        obj = ":W>\003,#\\";
        byte0 = 79;
          goto _L125
_L83:
        as1[i1] = ((String) (obj));
        i1 = 81;
        obj = " ]+\037";
        byte0 = 80;
          goto _L125
_L84:
        as1[i1] = ((String) (obj));
        i1 = 82;
        obj = "*\\";
        byte0 = 81;
          goto _L125
_L85:
        as1[i1] = ((String) (obj));
        i1 = 83;
        obj = "(]!";
        byte0 = 82;
          goto _L125
_L86:
        as1[i1] = ((String) (obj));
        i1 = 84;
        obj = "$]!\025";
        byte0 = 83;
          goto _L125
_L87:
        as1[i1] = ((String) (obj));
        i1 = 85;
        obj = "/S8\025\"#@%\0256";
        byte0 = 84;
          goto _L125
_L88:
        as1[i1] = ((String) (obj));
        i1 = 86;
        obj = "\"}\002p3/S>\024E\bs\0301E\005aL9\013\037w\036$\000\b<";
        byte0 = 85;
          goto _L125
_L89:
        as1[i1] = ((String) (obj));
        i1 = 87;
        obj = ";]>\033";
        byte0 = 86;
          goto _L125
_L90:
        as1[i1] = ((String) (obj));
        i1 = 88;
        obj = "4?<\030*\"W8\031&A^-\0031A\\-\035 ";
        byte0 = 87;
          goto _L125
_L91:
        as1[i1] = ((String) (obj));
        i1 = 89;
        obj = "4?<\030*\"W8\031&A_%\024! WA\036$!W";
        byte0 = 88;
          goto _L125
_L92:
        as1[i1] = ((String) (obj));
        i1 = 90;
        obj = "<@#\026, W";
        byte0 = 89;
          goto _L125
_L93:
        as1[i1] = ((String) (obj));
        i1 = 91;
        obj = "\"S!\025";
        byte0 = 90;
          goto _L125
_L94:
        as1[i1] = ((String) (obj));
        i1 = 92;
        obj = "\017}\002#\021\036g\017$\006\003|\0301\006\030t\036?\b\032|\0034\000CG\0023\004\031u\004$E)j\0175\025\030{\003>J/}\002$\004\017f?$\027\031q\030j";
        byte0 = 91;
          goto _L125
_L95:
        as1[i1] = ((String) (obj));
        i1 = 93;
        obj = "<@)\026";
        byte0 = 92;
          goto _L125
_L96:
        as1[i1] = ((String) (obj));
        i1 = 94;
        obj = "\"[/\033+-_)";
        byte0 = 93;
          goto _L125
_L97:
        as1[i1] = ((String) (obj));
        i1 = 95;
        obj = "'W5";
        byte0 = 94;
          goto _L125
_L98:
        as1[i1] = ((String) (obj));
        i1 = 96;
        obj = "*S4";
        byte0 = 95;
          goto _L125
_L99:
        as1[i1] = ((String) (obj));
        i1 = 97;
        obj = ":Q-\002!";
        byte0 = 96;
          goto _L125
_L100:
        as1[i1] = ((String) (obj));
        i1 = 98;
        obj = "<Z#\004*";
        byte0 = 97;
          goto _L125
_L101:
        as1[i1] = ((String) (obj));
        i1 = 99;
        obj = "\bs\0301TY";
        byte0 = 98;
          goto _L125
_L102:
        as1[i1] = ((String) (obj));
        i1 = 100;
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\025\004}\030?";
        byte0 = 99;
          goto _L125
_L103:
        as1[i1] = ((String) (obj));
        i1 = 101;
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wLmES2";
        byte0 = 100;
          goto _L125
_L104:
        as1[i1] = ((String) (obj));
        i1 = 102;
        obj = ".V-\t";
        byte0 = 101;
          goto _L125
_L105:
        as1[i1] = ((String) (obj));
        i1 = 103;
        obj = "\bs\0301T";
        byte0 = 102;
          goto _L125
_L106:
        as1[i1] = ((String) (obj));
        i1 = 104;
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\006\003|\0301\006\030M\t&\000\002f";
        byte0 = 103;
          goto _L125
_L107:
        as1[i1] = ((String) (obj));
        i1 = 105;
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wLmES2-\036!Lv\r$\004^2QoE";
        byte0 = 104;
          goto _L125
_L108:
        as1[i1] = ((String) (obj));
        i1 = 106;
        obj = "\bs\0301T";
        byte0 = 105;
          goto _L125
_L109:
        as1[i1] = ((String) (obj));
        i1 = 107;
        obj = "\bs\0301P";
        byte0 = 106;
          goto _L125
_L110:
        as1[i1] = ((String) (obj));
        obj = "\017}\002$\004\017f39\001L/LoE-\\(p\b\005\177\t$\034\034wLmES2";
        byte0 = 107;
        i1 = 108;
          goto _L125
_L111:
        as1[i1] = ((String) (obj));
        i1 = 109;
        obj = "\032|\b~\004\002v\036?\f\b<\017%\027\037}\036~\f\030w\001\177\f\001";
        byte0 = 108;
          goto _L125
_L112:
        as1[i1] = ((String) (obj));
        i1 = 110;
        obj = "9F*}]";
        byte0 = 109;
          goto _L125
_L113:
        as1[i1] = ((String) (obj));
        i1 = 111;
        obj = "/}\031<\001L|\003$E\034s\036#\000Ld/1\027\b2\n9\t\t(L";
        byte0 = 110;
          goto _L125
_L114:
        as1[i1] = ((String) (obj));
        i1 = 112;
        obj = "\bs\0301V";
        byte0 = 111;
          goto _L125
_L115:
        as1[i1] = ((String) (obj));
        i1 = 113;
        obj = "\017}\002$\004\017f39\001L/Lo";
        byte0 = 112;
          goto _L125
_L116:
        as1[i1] = ((String) (obj));
        i1 = 114;
        obj = "\bs\0301W";
        byte0 = 113;
          goto _L125
_L117:
        as1[i1] = ((String) (obj));
        i1 = 115;
        obj = "\005a3 \027\005\177\r\"\034";
        byte0 = 114;
          goto _L125
_L118:
        as1[i1] = ((String) (obj));
        i1 = 116;
        obj = "\bs\0301T";
        byte0 = 115;
          goto _L125
_L119:
        as1[i1] = ((String) (obj));
        i1 = 117;
        obj = "\017}\002$\004\017f39\001L/Lo";
        byte0 = 116;
          goto _L125
_L120:
        as1[i1] = ((String) (obj));
        i1 = 118;
        obj = "\bs\0301V";
        byte0 = 117;
          goto _L125
_L121:
        as1[i1] = ((String) (obj));
        i1 = 119;
        obj = "\bs\0301T";
        byte0 = 118;
          goto _L125
_L122:
        as1[i1] = ((String) (obj));
        i1 = 120;
        obj = "\bs\0301W";
        byte0 = 119;
          goto _L125
_L123:
        as1[i1] = ((String) (obj));
        i1 = 121;
        obj = "\005a3 \027\005\177\r\"\034";
        byte0 = 120;
          goto _L125
_L124:
        HashMap hashmap;
        as1[i1] = ((String) (obj));
        z = as;
        j = new HashMap();
        b = new HashMap();
        hashmap = j;
        obj = "4?-\031(";
        byte0 = -1;
_L146:
        int j1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L178:
        if (k1 > j1) goto _L127; else goto _L126
_L126:
        String s = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 16: default 2868
    //                   0 3275
    //                   1 3297
    //                   2 3319
    //                   3 3341
    //                   4 3363
    //                   5 3386
    //                   6 3410
    //                   7 2983
    //                   8 3433
    //                   9 3461
    //                   10 3489
    //                   11 3517
    //                   12 3545
    //                   13 3573
    //                   14 3601
    //                   15 3630
    //                   16 3659;
           goto _L128 _L129 _L130 _L131 _L132 _L133 _L134 _L135 _L136 _L137 _L138 _L139 _L140 _L141 _L142 _L143 _L144 _L145
_L128:
        hashmap.put(s, Integer.valueOf(0));
        hashmap = j;
        obj = "4?!\003+";
        byte0 = 0;
          goto _L146
_L2:
        char c1 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 2932
    //                   0 2955
    //                   1 2962
    //                   2 2969
    //                   3 2976;
           goto _L147 _L148 _L149 _L150 _L151
_L147:
        j1 = 101;
_L153:
        obj[k1] = (char)(j1 ^ c1);
        k1++;
          goto _L152
_L148:
        j1 = 108;
          goto _L153
_L149:
        j1 = 18;
          goto _L153
_L150:
        j1 = 108;
          goto _L153
_L151:
        j1 = 80;
          goto _L153
_L136:
        obj = "-[!";
        byte0 = -1;
_L180:
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L171:
        if (k1 > j1) goto _L155; else goto _L154
_L154:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 8: default 3072
    //                   0 3441
    //                   1 3469
    //                   2 3497
    //                   3 3525
    //                   4 3553
    //                   5 3581
    //                   6 3610
    //                   7 3639
    //                   8 3668;
           goto _L156 _L157 _L158 _L159 _L160 _L161 _L162 _L163 _L164 _L165
_L156:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?!\003+";
        byte0 = 8;
          goto _L146
_L155:
        l1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 3132
    //                   0 3155
    //                   1 3162
    //                   2 3169
    //                   3 3176;
           goto _L166 _L167 _L168 _L169 _L170
_L166:
        i1 = 101;
_L172:
        obj[j1] = (char)(i1 ^ l1);
        j1++;
          goto _L171
_L167:
        i1 = 108;
          goto _L172
_L168:
        i1 = 18;
          goto _L172
_L169:
        i1 = 108;
          goto _L172
_L170:
        i1 = 80;
          goto _L172
_L127:
        l1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 3224
    //                   0 3247
    //                   1 3254
    //                   2 3261
    //                   3 3268;
           goto _L173 _L174 _L175 _L176 _L177
_L173:
        i1 = 101;
_L179:
        obj[j1] = (char)(i1 ^ l1);
        j1++;
          goto _L178
_L174:
        i1 = 108;
          goto _L179
_L175:
        i1 = 18;
          goto _L179
_L176:
        i1 = 108;
          goto _L179
_L177:
        i1 = 80;
          goto _L179
_L129:
        hashmap.put(s, Integer.valueOf(1));
        hashmap = j;
        obj = "4?5\021-#]";
        byte0 = 1;
          goto _L146
_L130:
        hashmap.put(s, Integer.valueOf(2));
        hashmap = j;
        obj = "4?+\037*+^)}1-^'";
        byte0 = 2;
          goto _L146
_L131:
        hashmap.put(s, Integer.valueOf(5));
        hashmap = j;
        obj = "4?+\037*+^)p1-^";
        byte0 = 3;
          goto _L146
_L132:
        hashmap.put(s, Integer.valueOf(5));
        hashmap = j;
        obj = "4?%\0234";
        byte0 = 4;
          goto _L146
_L133:
        hashmap.put(s, Integer.valueOf(6));
        hashmap = j;
        obj = "4?&\021'.W>";
        byte0 = 5;
          goto _L146
_L134:
        hashmap.put(s, Integer.valueOf(7));
        hashmap = j;
        obj = "4??\033<<WA\0056)@\"\021()";
        byte0 = 6;
          goto _L146
_L135:
        hashmap.put(s, Integer.valueOf(3));
        hashmap = b;
        obj = "4?-\031(";
        byte0 = 7;
          goto _L146
_L137:
        obj = ";{\0024\n\033aL\034\f\032w";
        byte0 = 0;
          goto _L180
_L157:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?5\021-#]";
        byte0 = 9;
          goto _L146
_L138:
        obj = "5S$\037*";
        byte0 = 1;
          goto _L180
_L158:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?+\037*+^)}1-^'";
        byte0 = 10;
          goto _L146
_L139:
        obj = "+}\0037\t\t281\t\007";
        byte0 = 2;
          goto _L180
_L159:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?+\037*+^)p1-^";
        byte0 = 11;
          goto _L146
_L140:
        obj = "+}\0037\t\t281\t\007";
        byte0 = 3;
          goto _L180
_L160:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?%\0234";
        byte0 = 12;
          goto _L146
_L141:
        obj = "%Q=";
        byte0 = 4;
          goto _L180
_L161:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4?&\021'.W>";
        byte0 = 13;
          goto _L146
_L142:
        obj = "&s\0162\000\036";
        byte0 = 5;
          goto _L180
_L162:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "4??\033<<WA\0056)@\"\021()";
        byte0 = 14;
          goto _L146
_L143:
        obj = "?y\025 \0";
        byte0 = 6;
          goto _L180
_L163:
        hashmap.put(s, obj);
        hashmap = b;
        obj = "\"[/\033+-_)";
        byte0 = 15;
          goto _L146
_L144:
        obj = "\"{\017;\013\r\177\t";
        byte0 = 7;
          goto _L180
_L164:
        hashmap.put(s, obj);
        hashmap = b;
        obj = ".V-\t";
        byte0 = 16;
          goto _L146
_L145:
        obj = ".{\036$\r\bs\025";
        byte0 = 8;
          goto _L180
_L165:
        hashmap.put(s, obj);
        if (true) goto _L125; else goto _L181
_L181:
    }
}
