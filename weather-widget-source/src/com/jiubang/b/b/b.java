// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.b.b;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.jiubang.b.b:
//            c, a, d

public class b
{

    private Resources a;
    private Context b;
    private int c;
    private c d;
    private List e;
    private List f;
    private List g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private int o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private int w;

    public b(Context context, int i1, int j1)
    {
        c = 0;
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = false;
        i = 0;
        j = false;
        k = 0;
        l = false;
        m = 0;
        n = false;
        o = 0;
        p = false;
        q = 0;
        r = false;
        s = 0;
        t = false;
        u = 0;
        v = false;
        w = 0;
        b = context;
        c = i1;
        a = context.getResources();
        a(j1);
        d = new c(context);
    }

    private boolean a(int i1)
    {
        String s1;
        String s2;
        String s3;
        android.content.res.XmlResourceParser xmlresourceparser;
        int j1;
        int k1;
        int l1;
        int i2;
        int l3;
        xmlresourceparser = a.getXml(i1);
        s3 = "";
        s1 = "";
        s2 = "";
        i2 = 0;
        i1 = 0;
        l1 = 0;
        k1 = 0;
        j1 = 0;
        l3 = xmlresourceparser.getEventType();
_L5:
        String s8;
        if (l3 == 1)
        {
            return true;
        }
        s8 = xmlresourceparser.getName();
        if (l3 != 2) goto _L2; else goto _L1
_L1:
        int j2;
        String s4 = s3;
        s3 = s2;
        j2 = 0;
        int k2 = j1;
        s2 = s4;
        j1 = l1;
        l1 = k1;
        k1 = k2;
_L6:
        if (j2 < xmlresourceparser.getAttributeCount()) goto _L4; else goto _L3
_L3:
        String s5;
        String s6;
        String s7;
        int l2;
        int i3;
        int j3;
        int k3;
        s5 = s3;
        s6 = s1;
        j2 = k1;
        l2 = l1;
        i3 = j1;
        j3 = i1;
        s7 = s2;
        k3 = i2;
_L7:
        l3 = xmlresourceparser.next();
        i2 = k3;
        s3 = s7;
        i1 = j3;
        l1 = i3;
        k1 = l2;
        j1 = j2;
        s1 = s6;
        s2 = s5;
          goto _L5
_L4:
        String s9 = xmlresourceparser.getAttributeName(j2);
        s5 = xmlresourceparser.getAttributeValue(j2);
        l2 = i2;
        s6 = s2;
        if (s8.equals("festival"))
        {
            if (s9.equals("name"))
            {
                s6 = s5;
                l2 = i2;
            } else
            {
                l2 = i2;
                s6 = s2;
                if (s9.equals("algorithm"))
                {
                    l2 = Integer.parseInt(s5);
                    s6 = s2;
                }
            }
        }
        if (!s8.equals("info"))
        {
            break MISSING_BLOCK_LABEL_648;
        }
        if (s9.equals("month"))
        {
            k3 = Integer.parseInt(s5);
            s2 = s1;
            s7 = s3;
            j3 = j1;
            i3 = l1;
            i2 = k1;
        } else
        if (s9.equals("week"))
        {
            j3 = Integer.parseInt(s5);
            i2 = k1;
            i3 = l1;
            k3 = i1;
            s7 = s3;
            s2 = s1;
        } else
        if (s9.equals("day"))
        {
            i3 = Integer.parseInt(s5);
            i2 = k1;
            j3 = j1;
            k3 = i1;
            s7 = s3;
            s2 = s1;
        } else
        if (s9.equals("weekday"))
        {
            i2 = Integer.parseInt(s5);
            i3 = l1;
            j3 = j1;
            k3 = i1;
            s7 = s3;
            s2 = s1;
        } else
        {
            i2 = k1;
            i3 = l1;
            j3 = j1;
            k3 = i1;
            s7 = s3;
            s2 = s5;
            if (!s9.equals("mark"))
            {
                if (!s9.equals("mark_day"))
                {
                    break MISSING_BLOCK_LABEL_648;
                }
                i2 = k1;
                i3 = l1;
                j3 = j1;
                k3 = i1;
                s7 = s5;
                s2 = s1;
            }
        }
_L8:
        j2++;
        s1 = s2;
        k1 = i2;
        l1 = i3;
        j1 = j3;
        i1 = k3;
        s3 = s7;
        i2 = l2;
        s2 = s6;
          goto _L6
_L2:
        k3 = i2;
        s7 = s3;
        j3 = i1;
        i3 = l1;
        l2 = k1;
        j2 = j1;
        s6 = s1;
        s5 = s2;
        if (l3 == 3)
        {
            k3 = i2;
            s7 = s3;
            j3 = i1;
            i3 = l1;
            l2 = k1;
            j2 = j1;
            s6 = s1;
            s5 = s2;
            if (s8.equals("festival"))
            {
                k3 = i2;
                s7 = s3;
                j3 = i1;
                i3 = l1;
                l2 = k1;
                j2 = j1;
                s6 = s1;
                s5 = s2;
                if (!a(i2, s3, i1, l1, k1, j1, s1, s2))
                {
                    return false;
                }
            }
        }
          goto _L7
        i2 = k1;
        i3 = l1;
        j3 = j1;
        k3 = i1;
        s7 = s3;
        s2 = s1;
          goto _L8
    }

    private boolean a(int i1, String s1, int j1, int k1, int l1, int i2, String s2, 
            String s3)
    {
        if (i1 < 0 || i1 > 5)
        {
            return false;
        }
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
            return b(s1, j1, l1);

        case 1: // '\001'
            return a(s1, j1, l1);

        case 2: // '\002'
            return a(s1, j1, k1, i2);

        case 3: // '\003'
            return a(s1, s2);

        case 4: // '\004'
            return b(s1, s2);

        case 5: // '\005'
            return c(s1, s3);
        }
    }

    private boolean a(String s1, int i1, int j1)
    {
        String s2 = b.getPackageName();
        int k1 = a.getIdentifier(s1, "string", s2);
        if (k1 == 0)
        {
            return false;
        } else
        {
            f.add(new a(i1, j1, k1));
            return true;
        }
    }

    private boolean a(String s1, int i1, int j1, int k1)
    {
        String s2 = b.getPackageName();
        int l1 = a.getIdentifier(s1, "string", s2);
        if (l1 == 0)
        {
            return false;
        } else
        {
            g.add(new d(i1, j1, k1, l1));
            return true;
        }
    }

    private boolean a(String s1, String s2)
    {
        String s3 = b.getPackageName();
        if (!s2.equals("year_first_day")) goto _L2; else goto _L1
_L1:
        i = a.getIdentifier(s1, "string", s3);
        if (i != 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        h = true;
        return true;
_L2:
        if (s2.equals("year_last_day"))
        {
            k = a.getIdentifier(s1, "string", s3);
            if (k != 0)
            {
                j = true;
                return true;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean a(StringBuffer stringbuffer, int i1, int j1)
    {
        Iterator iterator = e.iterator();
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
            a1 = (a)iterator.next();
        } while (a1.a != i1 || a1.b != j1);
        stringbuffer.append(a.getString(a1.c));
        return true;
    }

    private boolean a(StringBuffer stringbuffer, Calendar calendar)
    {
        Iterator iterator = g.iterator();
        d d1;
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
            d1 = (d)iterator.next();
        } while (!a(calendar, d1.a, d1.b, d1.c));
        stringbuffer.append(a.getString(d1.d));
        return true;
    }

    private boolean a(Calendar calendar, int i1, int j1, int k1)
    {
        int j2 = calendar.get(1);
        int l1 = calendar.get(2);
        int i2 = calendar.get(5);
        calendar = Calendar.getInstance();
        calendar.set(1, j2);
        calendar.set(2, l1);
        calendar.set(5, 1);
        j2 = (k1 - calendar.get(7)) + 1;
        k1 = j1;
        if (j2 > 0)
        {
            k1 = j1 - 1;
        }
        return l1 == i1 && i2 == j2 + k1 * 7;
    }

    private boolean b(String s1, int i1, int j1)
    {
        String s2 = b.getPackageName();
        int k1 = a.getIdentifier(s1, "string", s2);
        if (k1 == 0)
        {
            return false;
        } else
        {
            e.add(new a(i1, j1, k1));
            return true;
        }
    }

    private boolean b(String s1, String s2)
    {
        String s3 = b.getPackageName();
        if (!s2.equals("year_first_day")) goto _L2; else goto _L1
_L1:
        m = a.getIdentifier(s1, "string", s3);
        if (m != 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l = true;
        return true;
_L2:
        if (s2.equals("year_last_day"))
        {
            o = a.getIdentifier(s1, "string", s3);
            if (o != 0)
            {
                n = true;
                return true;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean b(StringBuffer stringbuffer, int i1, int j1)
    {
        Iterator iterator = f.iterator();
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
            a1 = (a)iterator.next();
        } while (a1.a != i1 || a1.b != j1);
        stringbuffer.append(a.getString(a1.c));
        return true;
    }

    private boolean b(StringBuffer stringbuffer, Calendar calendar)
    {
        if (h && b(calendar))
        {
            stringbuffer.append(a.getString(i));
            return true;
        }
        if (j && c(calendar))
        {
            stringbuffer.append(a.getString(k));
            return true;
        } else
        {
            return false;
        }
    }

    private boolean b(Calendar calendar)
    {
        int i1 = calendar.get(2);
        int j1 = calendar.get(5);
        return i1 == 0 && j1 == 1;
    }

    private boolean c(String s1, String s2)
    {
        String s3 = b.getPackageName();
        if (a.getIdentifier(s1, "string", s3) != 0)
        {
            if (s2.equals("qingming_day"))
            {
                p = true;
                q = a.getIdentifier(s1, "string", s3);
                return false;
            }
            if (s2.equals("election_day"))
            {
                r = true;
                s = a.getIdentifier(s1, "string", s3);
                return false;
            }
            if (s2.equals("memorial_day"))
            {
                t = true;
                u = a.getIdentifier(s1, "string", s3);
                return false;
            }
            if (s2.equals("easter_day"))
            {
                v = true;
                w = a.getIdentifier(s1, "string", s3);
                return false;
            }
        }
        return false;
    }

    private boolean c(StringBuffer stringbuffer, Calendar calendar)
    {
        if (l && d(calendar))
        {
            stringbuffer.append(a.getString(m));
            return true;
        }
        if (n && e(calendar))
        {
            stringbuffer.append(a.getString(o));
            return true;
        } else
        {
            return false;
        }
    }

    private boolean c(Calendar calendar)
    {
        int i1 = calendar.get(2);
        int j1 = calendar.get(5);
        return i1 == 11 && j1 == 31;
    }

    private boolean d(StringBuffer stringbuffer, Calendar calendar)
    {
        int i1 = (int)(97.52000000000001D - 1.8999999999999999D * Math.sin(1.5720000000000001D));
        if ((int)(365.24200000000002D * (double)(calendar.get(1) - 1900) + (double)i1) != d.a(calendar))
        {
            return false;
        } else
        {
            stringbuffer.append(a.getString(q));
            return true;
        }
    }

    private boolean d(Calendar calendar)
    {
        int i1 = d.b(calendar);
        int j1 = d.c(calendar);
        return i1 == 0 && j1 == 1;
    }

    private boolean e(StringBuffer stringbuffer, Calendar calendar)
    {
        int k1 = calendar.get(1);
        int i1 = calendar.get(5);
        if (k1 < 1900 || k1 > 2099)
        {
            return false;
        }
        int j1 = calendar.get(2);
        k1 -= 1900;
        int i2 = k1 % 19;
        int l1 = k1 / 4;
        i2 = ((i2 * 11 + 4) - (i2 * 7 + 1) / 19) % 29;
        k1 = 25 - i2 - ((k1 + l1 + 31) - i2) % 7;
        if (k1 > 0)
        {
            if (j1 == 3 && i1 == k1)
            {
                stringbuffer.append(a.getString(w));
                return true;
            }
        } else
        if (k1 == 0)
        {
            if (j1 == 2 && i1 == 31)
            {
                stringbuffer.append(a.getString(w));
                return true;
            }
        } else
        if (j1 == 2 && i1 == k1 + 31)
        {
            stringbuffer.append(a.getString(w));
            return true;
        }
        return false;
    }

    private boolean e(Calendar calendar)
    {
        int i1 = calendar.get(1);
        int j1 = calendar.get(2);
        int k1 = calendar.get(5);
        calendar = Calendar.getInstance();
        calendar.set(1, i1);
        calendar.set(2, j1);
        calendar.set(5, k1);
        calendar.add(6, 1);
        return d(calendar);
    }

    private boolean f(StringBuffer stringbuffer, Calendar calendar)
    {
        int i1 = calendar.get(1);
        int j1 = calendar.get(2);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1, i1);
        calendar1.set(2, j1);
        calendar1.set(5, 1);
        if (calendar1.get(7) == 3)
        {
            if (a(calendar, 10, 2, 3))
            {
                stringbuffer.append(a.getString(s));
                return true;
            }
        } else
        if (a(calendar, 10, 1, 3))
        {
            stringbuffer.append(a.getString(s));
            return true;
        }
        return false;
    }

    private boolean g(StringBuffer stringbuffer, Calendar calendar)
    {
        int i1 = calendar.get(2);
        if (i1 == 4)
        {
            int j1 = calendar.get(1);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.set(1, j1);
            calendar1.set(2, i1);
            calendar1.set(5, 31);
            i1 = calendar.get(5);
            if (31 - ((calendar1.get(7) - 2) + 7) % 7 == i1)
            {
                stringbuffer.append(a.getString(u));
                return true;
            }
        }
        return false;
    }

    public String a(Calendar calendar)
    {
        StringBuffer stringbuffer = new StringBuffer("");
        if (a(stringbuffer, calendar.get(2), calendar.get(5)))
        {
            return stringbuffer.toString();
        }
        if (b(stringbuffer, d.b(calendar), d.c(calendar)))
        {
            return stringbuffer.toString();
        }
        if (a(stringbuffer, calendar))
        {
            return stringbuffer.toString();
        }
        if (b(stringbuffer, calendar))
        {
            return stringbuffer.toString();
        }
        if (c(stringbuffer, calendar))
        {
            return stringbuffer.toString();
        }
        if (c == 1)
        {
            if (p && d(stringbuffer, calendar))
            {
                return stringbuffer.toString();
            }
        } else
        if (c == 2)
        {
            if (v && e(stringbuffer, calendar))
            {
                return stringbuffer.toString();
            }
            if (r && f(stringbuffer, calendar))
            {
                return stringbuffer.toString();
            }
            if (t && g(stringbuffer, calendar))
            {
                return stringbuffer.toString();
            }
        }
        return "";
    }
}
