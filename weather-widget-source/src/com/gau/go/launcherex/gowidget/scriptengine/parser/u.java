// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.graphics.Color;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            r, ab, ad, p, 
//            s, x, a, y, 
//            t, v, z, DescriptionBean, 
//            aa, b, o, g

public class u
{

    private static Map a;
    private static Pattern b = null;

    public u()
    {
    }

    private float a(String s1, float f1)
    {
        float f2 = f1;
        if (s1 != null)
        {
            f2 = f1;
            if (s1.length() > 0)
            {
                try
                {
                    f2 = ((Number)(Number)NumberFormat.getPercentInstance().parseObject(s1)).floatValue();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return f1;
                }
            }
        }
        return f2;
    }

    private int a(String s1, int i)
    {
        int j = i;
        if (s1 != null)
        {
            j = i;
            if (s1.length() > 0)
            {
                try
                {
                    j = Integer.parseInt(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return i;
                }
            }
        }
        return j;
    }

    private r a(XmlPullParser xmlpullparser, r r1)
    {
_L2:
        String s1;
        if (xmlpullparser.next() == 1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s1 = xmlpullparser.getName();
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = xmlpullparser.getEventType();
        if (!s1.equals("set") || i != 2)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        try
        {
            g(xmlpullparser, (ab)r1.g(6));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
        }
        return r1;
        boolean flag = s1.equals("image");
        if (flag && i == 3)
        {
            return r1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int i;
        i = 1;
        ab1 = (ad)ab1.a(3);
        s1 = xmlpullparser.getAttributeValue(null, "fromXDelta");
        float f1;
        int j;
        int k;
        int l;
        int i1;
        if (a(s1))
        {
            ab1.a(2);
            ab1.a(a(s1, 0.0F));
        } else
        {
            ab1.a(1);
            ab1.a(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toXDelta");
        if (a(s1))
        {
            ab1.b(2);
            ab1.b(a(s1, 0.0F));
        } else
        {
            ab1.b(1);
            ab1.b(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "fromYDelta");
        if (a(s1))
        {
            ab1.h(2);
            ab1.d(a(s1, 0.0F));
        } else
        {
            ab1.h(1);
            ab1.d(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toYDelta");
        if (a(s1))
        {
            ab1.i(2);
            ab1.e(a(s1, 0.0F));
        } else
        {
            ab1.i(1);
            ab1.e(b(s1, 0.0F));
        }
        ab1.j(c(xmlpullparser.getAttributeValue(null, "anchor")));
        j = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        k = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        l = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        i1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        ab1.f(j);
        ab1.e(i);
        ab1.g(k);
        ab1.c(f1);
        ab1.c(l);
        ab1.d(i1);
        return;
_L4:
        if (s1.equals("reverse"))
        {
            i = 2;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = 0;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void a(XmlPullParser xmlpullparser, p p1)
    {
_L4:
        if (xmlpullparser.next() == 1) goto _L2; else goto _L1
_L1:
        String s1 = xmlpullparser.getName();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        int i = xmlpullparser.getEventType();
        if (!s1.equals("frame") || i != 2) goto _L6; else goto _L5
_L5:
        String s2;
        int j;
        int k;
        s1 = xmlpullparser.getAttributeValue(null, "src");
        j = a(xmlpullparser.getAttributeValue(null, "startTime"), 0);
        k = a(xmlpullparser.getAttributeValue(null, "endTime"), p1.h());
        s2 = xmlpullparser.getAttributeValue(null, "visibility");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (!s2.equals("invisible"))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        i = 0;
_L7:
        p1.a(s1, j, k, i);
          goto _L4
        xmlpullparser;
        xmlpullparser.printStackTrace();
_L2:
        return;
_L6:
        boolean flag = s1.equals("frames");
        if (flag && i == 3)
        {
            return;
        }
          goto _L4
        i = 1;
          goto _L7
    }

    private void a(XmlPullParser xmlpullparser, s s1)
    {
        ArrayList arraylist = new ArrayList();
_L4:
        if (xmlpullparser.next() == 1) goto _L2; else goto _L1
_L1:
        Object obj = xmlpullparser.getName();
        if (obj == null) goto _L4; else goto _L3
_L3:
        int i = xmlpullparser.getEventType();
        if (!((String) (obj)).equals("set") || i != 2)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        int j = s1.b();
        i = 0;
_L6:
        if (i >= j) goto _L4; else goto _L5
_L5:
        s1.a(i).g(6);
        i++;
          goto _L6
        if (!((String) (obj)).equals("translate") || i != 2) goto _L8; else goto _L7
_L7:
        int k;
        int l;
        int i1;
        k = a(xmlpullparser.getAttributeValue(null, "range"), 0);
        l = a(xmlpullparser.getAttributeValue(null, "duration"), 0);
        i1 = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        xmlpullparser.getAttributeValue(null, "repeatMode");
        obj = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (!((String) (obj)).equals("repeat")) goto _L12; else goto _L11
_L11:
        i = 1;
_L16:
        float f1;
        float f2;
        int j1;
        int k1;
        int l1;
        boolean flag;
        boolean flag1;
        f1 = b(xmlpullparser.getAttributeValue(null, "offsetX"), 0.0F);
        f2 = b(xmlpullparser.getAttributeValue(null, "offsetY"), 0.0F);
        flag = a(xmlpullparser.getAttributeValue(null, "outScreenX"), true);
        flag1 = a(xmlpullparser.getAttributeValue(null, "outScreenY"), true);
        j1 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        k1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        l1 = s1.b();
        j = 0;
_L14:
        if (j >= l1) goto _L4; else goto _L13
_L13:
        obj = (ad)s1.a(j).g(3);
        r r1 = s1.a(j);
        ((ad) (obj)).a(r1.q());
        ((ad) (obj)).a(r1.t());
        ((ad) (obj)).b(r1.q() + f1);
        ((ad) (obj)).b(r1.t());
        ((ad) (obj)).d(r1.r());
        ((ad) (obj)).h(1);
        ((ad) (obj)).e(r1.r() + f2);
        ((ad) (obj)).i(1);
        ((ad) (obj)).g((int)((double)l + Math.random() * (double)k));
        ((ad) (obj)).a(flag);
        ((ad) (obj)).b(flag1);
        ((ad) (obj)).f(i1);
        ((ad) (obj)).e(i);
        ((ad) (obj)).c((int)((double)j1 * Math.random()));
        ((ad) (obj)).d(k1);
        j++;
          goto _L14
_L12:
        if (!((String) (obj)).equals("reverse")) goto _L10; else goto _L15
_L15:
        i = 2;
          goto _L16
_L8:
        if (!((String) (obj)).equals("rotate") || i != 2) goto _L18; else goto _L17
_L17:
        i1 = a(xmlpullparser.getAttributeValue(null, "fromDegrees"), 0);
        j1 = a(xmlpullparser.getAttributeValue(null, "toDegrees"), 0);
        obj = xmlpullparser.getAttributeValue(null, "pivotX");
        if (!a(((String) (obj)))) goto _L20; else goto _L19
_L19:
        f1 = a(((String) (obj)), 0.0F);
        j = 1;
_L29:
        obj = xmlpullparser.getAttributeValue(null, "pivotY");
        if (!a(((String) (obj)))) goto _L22; else goto _L21
_L21:
        f2 = a(((String) (obj)), 0.0F);
        k = 1;
_L30:
        k1 = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        obj = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (obj == null) goto _L24; else goto _L23
_L23:
        if (!((String) (obj)).equals("repeat")) goto _L26; else goto _L25
_L25:
        i = 1;
_L32:
        int i2;
        int j2;
        int k2;
        l1 = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        i2 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        j2 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        k2 = s1.b();
        l = 0;
_L28:
        if (l >= k2) goto _L4; else goto _L27
_L27:
        obj = (x)s1.a(l).g(4);
        ((x) (obj)).a(i1);
        ((x) (obj)).b(j1);
        ((x) (obj)).g(l1);
        ((x) (obj)).f(k1);
        ((x) (obj)).e(i);
        ((x) (obj)).c((int)((double)i2 * Math.random()));
        ((x) (obj)).d(j2);
        ((x) (obj)).d(f1);
        ((x) (obj)).h(j);
        ((x) (obj)).e(f2);
        ((x) (obj)).i(k);
        l++;
          goto _L28
_L20:
        f1 = b(((String) (obj)), 0.0F);
        j = 0;
          goto _L29
_L22:
        f2 = b(((String) (obj)), 0.0F);
        k = 0;
          goto _L30
_L26:
        if (!((String) (obj)).equals("reverse")) goto _L24; else goto _L31
_L31:
        i = 2;
          goto _L32
_L18:
        if (!((String) (obj)).equals("alpha") || i != 2) goto _L34; else goto _L33
_L33:
        String s2;
        Object obj1;
        obj = xmlpullparser.getAttributeValue(null, "fromAlpha");
        s2 = xmlpullparser.getAttributeValue(null, "toAlpha");
        l = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        obj1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (obj1 == null) goto _L36; else goto _L35
_L35:
        if (!((String) (obj1)).equals("repeat")) goto _L38; else goto _L37
_L37:
        i = 1;
_L48:
        i1 = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        j1 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        k1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        l1 = a(xmlpullparser.getAttributeValue(null, "range"), 0);
        flag = arraylist.isEmpty();
        k = 0;
_L46:
        if (k >= s1.b()) goto _L4; else goto _L39
_L39:
        obj1 = (a)s1.a(k).g(2);
        if (!a(((String) (obj)))) goto _L41; else goto _L40
_L40:
        ((a) (obj1)).a(1);
        ((a) (obj1)).a(a(((String) (obj)), 1.0F));
_L49:
        if (!a(s2)) goto _L43; else goto _L42
_L42:
        ((a) (obj1)).b(1);
        ((a) (obj1)).b(a(s2, 1.0F));
_L50:
        ((a) (obj1)).f(l);
        ((a) (obj1)).e(i);
        if (!flag) goto _L45; else goto _L44
_L44:
        j = (int)(Math.random() * (double)l1);
        arraylist.add(Integer.valueOf(j));
_L51:
        ((a) (obj1)).g(i1 + j);
        ((a) (obj1)).c(f1);
        ((a) (obj1)).c(j + j1);
        ((a) (obj1)).d(k1);
        k++;
          goto _L46
_L38:
        if (!((String) (obj1)).equals("reverse")) goto _L36; else goto _L47
_L47:
        i = 2;
          goto _L48
_L41:
        ((a) (obj1)).a(0);
        ((a) (obj1)).a(b(((String) (obj)), 1.0F));
          goto _L49
        xmlpullparser;
        xmlpullparser.printStackTrace();
_L2:
        return;
_L43:
        ((a) (obj1)).b(0);
        ((a) (obj1)).b(b(s2, 1.0F));
          goto _L50
_L45:
        if (k >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_2212;
        }
        j = ((Integer)arraylist.get(k)).intValue();
          goto _L51
_L34:
        if (!((String) (obj)).equals("scale") || i != 2) goto _L53; else goto _L52
_L52:
        obj = xmlpullparser.getAttributeValue(null, "fromXScale");
        if (!a(((String) (obj)))) goto _L55; else goto _L54
_L54:
        f1 = a(((String) (obj)), 1.0F);
        j = 2;
_L70:
        obj = xmlpullparser.getAttributeValue(null, "toXScale");
        if (!a(((String) (obj)))) goto _L57; else goto _L56
_L56:
        f2 = a(((String) (obj)), 1.0F);
        k = 2;
_L71:
        obj = xmlpullparser.getAttributeValue(null, "fromYScale");
        if (!a(((String) (obj)))) goto _L59; else goto _L58
_L58:
        float f3 = a(((String) (obj)), 1.0F);
        l = 2;
_L72:
        obj = xmlpullparser.getAttributeValue(null, "toYScale");
        if (!a(((String) (obj)))) goto _L61; else goto _L60
_L60:
        float f4 = a(((String) (obj)), 1.0F);
        i1 = 2;
_L73:
        obj = xmlpullparser.getAttributeValue(null, "pivotX");
        if (!a(((String) (obj)))) goto _L63; else goto _L62
_L62:
        float f5 = a(((String) (obj)), 0.0F);
        j1 = 1;
_L74:
        obj = xmlpullparser.getAttributeValue(null, "pivotY");
        if (!a(((String) (obj)))) goto _L65; else goto _L64
_L64:
        float f6 = a(((String) (obj)), 0.0F);
        k1 = 1;
_L75:
        i2 = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        obj = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2188;
        }
        if (!((String) (obj)).equals("repeat")) goto _L67; else goto _L66
_L66:
        i = 1;
_L76:
        int l2;
        int i3;
        j2 = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        k2 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        l2 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        i3 = s1.b();
        l1 = 0;
_L69:
        if (l1 >= i3) goto _L4; else goto _L68
_L68:
        obj = (y)s1.a(l1).g(1);
        ((y) (obj)).a(f1);
        ((y) (obj)).a(j);
        ((y) (obj)).b(f2);
        ((y) (obj)).b(k);
        ((y) (obj)).d(f3);
        ((y) (obj)).h(l);
        ((y) (obj)).e(f4);
        ((y) (obj)).b(i1);
        ((y) (obj)).g(j2);
        ((y) (obj)).f(i2);
        ((y) (obj)).e(i);
        ((y) (obj)).c((int)((double)k2 * Math.random()));
        ((y) (obj)).d(l2);
        ((y) (obj)).f(f5);
        ((y) (obj)).j(j1);
        ((y) (obj)).g(f6);
        ((y) (obj)).k(k1);
        l1++;
          goto _L69
_L55:
        f1 = b(((String) (obj)), 1.0F);
        j = 1;
          goto _L70
_L57:
        f2 = b(((String) (obj)), 1.0F);
        k = 1;
          goto _L71
_L59:
        f3 = b(((String) (obj)), 1.0F);
        l = 1;
          goto _L72
_L61:
        f4 = b(((String) (obj)), 1.0F);
        i1 = 1;
          goto _L73
_L63:
        f5 = b(((String) (obj)), 0.0F);
        j1 = 0;
          goto _L74
_L65:
        f6 = b(((String) (obj)), 0.0F);
        k1 = 0;
          goto _L75
_L67:
        if (!((String) (obj)).equals("reverse"))
        {
            break MISSING_BLOCK_LABEL_2188;
        }
        i = 2;
          goto _L76
_L53:
        if (!((String) (obj)).equals("frames") || i != 2) goto _L78; else goto _L77
_L77:
        j = a(xmlpullparser.getAttributeValue(null, "amount"), 0);
        k = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        obj = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2182;
        }
        if (!((String) (obj)).equals("repeat")) goto _L80; else goto _L79
_L79:
        i = 1;
_L84:
        i1 = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        j1 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        k1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        l = s1.b();
        if (l <= 0) goto _L4; else goto _L81
_L81:
        obj = (p)s1.a(0).g(5);
        ((p) (obj)).g(i1);
        ((p) (obj)).c(f1);
        ((p) (obj)).f(k);
        ((p) (obj)).e(i);
        ((p) (obj)).d(k1);
        ((p) (obj)).c(j1);
        ((p) (obj)).b(j);
        a(xmlpullparser, ((p) (obj)));
        i = 1;
_L83:
        if (i >= l) goto _L4; else goto _L82
_L82:
        ((p) (obj)).a((p)s1.a(i).g(5), ((p) (obj)));
        i++;
          goto _L83
_L80:
        if (!((String) (obj)).equals("reverse"))
        {
            break MISSING_BLOCK_LABEL_2182;
        }
        i = 2;
          goto _L84
_L78:
        flag = ((String) (obj)).equals("images");
        if (flag && i == 3)
        {
            return;
        }
          goto _L4
        i = 0;
          goto _L84
        i = 0;
          goto _L76
_L36:
        i = 0;
          goto _L48
_L24:
        i = 0;
          goto _L32
_L10:
        i = 0;
          goto _L16
        j = 0;
          goto _L51
    }

    private void a(XmlPullParser xmlpullparser, t t1)
    {
_L2:
        String s1;
        if (xmlpullparser.next() == 1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s1 = xmlpullparser.getName();
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = xmlpullparser.getEventType();
        if (!s1.equals("set") || i != 2)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        try
        {
            g(xmlpullparser, (ab)t1.g(6));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
        }
        return;
        boolean flag = s1.equals("imageFrame");
        if (flag && i == 3)
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean a(String s1)
    {
        if (s1 != null && s1.length() > 0)
        {
            return b.matcher(s1).find();
        } else
        {
            return false;
        }
    }

    private boolean a(String s1, boolean flag)
    {
        boolean flag1 = flag;
        if (s1 != null)
        {
            flag1 = flag;
            if (s1.length() > 0)
            {
                try
                {
                    flag1 = Boolean.parseBoolean(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return flag;
                }
            }
        }
        return flag1;
    }

    private float b(String s1, float f1)
    {
        float f2 = f1;
        if (s1 != null)
        {
            f2 = f1;
            if (s1.length() > 0)
            {
                try
                {
                    f2 = Float.parseFloat(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return f1;
                }
            }
        }
        return f2;
    }

    private int b(String s1, int i)
    {
        int j = i;
        if (s1 != null)
        {
            j = i;
            if (s1.length() > 0)
            {
                try
                {
                    j = Color.parseColor(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return i;
                }
            }
        }
        return j;
    }

    private ArrayList b(String s1)
    {
        ArrayList arraylist;
        int i;
        i = 0;
        arraylist = new ArrayList();
        if (s1.indexOf(';') == -1) goto _L2; else goto _L1
_L1:
        s1 = s1.split(";");
_L3:
        if (i >= s1.length)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        String as[] = s1[i].split(":");
        int j = a(as[1], 0);
        as = as[0].split("~");
        arraylist.add(new v(this, (int)b(as[0], 0.0F), (int)b(as[1], 0.0F), j));
        i++;
          goto _L3
_L2:
        String as1[] = new String[1];
        as1[0] = s1;
        s1 = as1;
          goto _L3
        s1;
        s1.printStackTrace();
        return arraylist;
    }

    private void b(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int i;
        i = 1;
        ab1 = (y)ab1.a(1);
        s1 = xmlpullparser.getAttributeValue(null, "fromXScale");
        float f1;
        int j;
        int k;
        int l;
        int i1;
        if (a(s1))
        {
            ab1.a(2);
            ab1.a(a(s1, 1.0F));
        } else
        {
            ab1.a(1);
            ab1.a(b(s1, 1.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toXScale");
        if (a(s1))
        {
            ab1.b(2);
            ab1.b(a(s1, 1.0F));
        } else
        {
            ab1.b(1);
            ab1.b(b(s1, 1.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "fromYScale");
        if (a(s1))
        {
            ab1.h(2);
            ab1.d(a(s1, 1.0F));
        } else
        {
            ab1.h(1);
            ab1.d(b(s1, 1.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toYScale");
        if (a(s1))
        {
            ab1.i(2);
            ab1.e(a(s1, 1.0F));
        } else
        {
            ab1.i(1);
            ab1.e(b(s1, 1.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "pivotX");
        if (a(s1))
        {
            ab1.j(1);
            ab1.f(a(s1, 0.0F));
        } else
        {
            ab1.j(0);
            ab1.f(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "pivotY");
        if (a(s1))
        {
            ab1.k(1);
            ab1.g(a(s1, 0.0F));
        } else
        {
            ab1.k(0);
            ab1.g(b(s1, 0.0F));
        }
        ab1.l(c(xmlpullparser.getAttributeValue(null, "anchor")));
        j = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        k = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        l = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        i1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        ab1.f(j);
        ab1.e(i);
        ab1.g(k);
        ab1.c(f1);
        ab1.c(l);
        ab1.d(i1);
        return;
_L4:
        if (s1.equals("reverse"))
        {
            i = 2;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = 0;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void b(XmlPullParser xmlpullparser, z z1)
    {
        z1 = z1.b();
        z1.a(a(xmlpullparser.getAttributeValue(null, "dayOrNight"), 0));
        z1.a(a(xmlpullparser.getAttributeValue(null, "sceneWidth"), 480), 480);
    }

    private int c(String s1)
    {
        if (s1 != null && !s1.equals("anchor_left_top"))
        {
            if (s1.equals("anchor_left_bottom"))
            {
                return 2;
            }
            if (s1.equals("anchor_right_top"))
            {
                return 3;
            }
            if (s1.equals("anchor_right_bottom"))
            {
                return 4;
            }
            if (s1.equals("anchor_center"))
            {
                return 5;
            }
        }
        return 1;
    }

    private int c(String s1, int i)
    {
        int k = i;
        if (s1 != null)
        {
            k = i;
            if (s1.length() > 0)
            {
                s1 = s1.split("\\|");
                int j = 0;
                do
                {
                    k = i;
                    if (j >= s1.length)
                    {
                        break;
                    }
                    Integer integer = (Integer)a.get(s1[j]);
                    k = i;
                    if (integer != null)
                    {
                        k = i | integer.intValue();
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    private void c(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int i;
        i = 1;
        ab1 = (x)ab1.a(4);
        s1 = xmlpullparser.getAttributeValue(null, "fromDegrees");
        float f1;
        int j;
        int k;
        int l;
        int i1;
        if (a(s1))
        {
            ab1.a(2);
            ab1.a(a(s1, 0.0F));
        } else
        {
            ab1.a(1);
            ab1.a(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toDegrees");
        if (a(s1))
        {
            ab1.b(2);
            ab1.b(a(s1, 0.0F));
        } else
        {
            ab1.b(1);
            ab1.b(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "pivotX");
        if (a(s1))
        {
            ab1.h(1);
            ab1.d(a(s1, 0.0F));
        } else
        {
            ab1.h(0);
            ab1.d(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "pivotY");
        if (a(s1))
        {
            ab1.i(1);
            ab1.e(a(s1, 0.0F));
        } else
        {
            ab1.i(0);
            ab1.e(b(s1, 0.0F));
        }
        ab1.j(c(xmlpullparser.getAttributeValue(null, "anchor")));
        j = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        k = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        l = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        i1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        ab1.f(j);
        ab1.e(i);
        ab1.g(k);
        ab1.c(f1);
        ab1.c(l);
        ab1.d(i1);
        return;
_L4:
        if (s1.equals("reverse"))
        {
            i = 2;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = 0;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void c(XmlPullParser xmlpullparser, z z1)
    {
        z1 = z1.d();
        z1.a(b(xmlpullparser.getAttributeValue(null, "x"), 0.0F));
        z1.b(b(xmlpullparser.getAttributeValue(null, "y"), 0.0F));
        z1.a(a(xmlpullparser.getAttributeValue(null, "blur"), true));
        z1.b(a(xmlpullparser.getAttributeValue(null, "previewblur"), false));
        String s1 = xmlpullparser.getAttributeValue(null, "src");
        int i;
        if (s1.indexOf("#") == 0)
        {
            i = b(s1, 0);
        } else
        {
            i = 0;
        }
        z1.a(i);
        z1.a(s1);
        z1.b(a(xmlpullparser.getAttributeValue(null, "width"), 0));
        z1.c(a(xmlpullparser.getAttributeValue(null, "height"), 0));
        z1.d(c(xmlpullparser.getAttributeValue(null, "antialias"), 0));
    }

    private void d(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int i;
        i = 1;
        ab1 = (a)ab1.a(2);
        s1 = xmlpullparser.getAttributeValue(null, "fromAlpha");
        float f1;
        int j;
        int k;
        int l;
        int i1;
        if (a(s1))
        {
            ab1.a(1);
            ab1.a(a(s1, 1.0F));
        } else
        {
            ab1.a(0);
            ab1.a(b(s1, 1.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "toAlpha");
        if (a(s1))
        {
            ab1.b(1);
            ab1.b(a(s1, 1.0F));
        } else
        {
            ab1.b(0);
            ab1.b(b(s1, 1.0F));
        }
        j = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        k = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        l = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        i1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        ab1.f(j);
        ab1.e(i);
        ab1.g(k);
        ab1.c(f1);
        ab1.c(l);
        ab1.d(i1);
        return;
_L4:
        if (s1.equals("reverse"))
        {
            i = 2;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = 0;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void d(XmlPullParser xmlpullparser, z z1)
    {
        z1 = z1.f();
        z1.a(b(xmlpullparser.getAttributeValue(null, "x"), 0.0F));
        z1.b(b(xmlpullparser.getAttributeValue(null, "y"), 0.0F));
        z1.a(a(xmlpullparser.getAttributeValue(null, "blur"), true));
        z1.b(a(xmlpullparser.getAttributeValue(null, "previewblur"), false));
        String s1 = xmlpullparser.getAttributeValue(null, "src");
        int i;
        if (s1.indexOf("#") == 0)
        {
            i = b(s1, 0);
        } else
        {
            i = 0;
        }
        z1.a(i);
        z1.a(s1);
        z1.b(a(xmlpullparser.getAttributeValue(null, "width"), 0));
        z1.c(a(xmlpullparser.getAttributeValue(null, "height"), 0));
        z1.d(c(xmlpullparser.getAttributeValue(null, "antialias"), 0));
        z1.c(a(xmlpullparser.getAttributeValue(null, "fitcenter"), false));
    }

    private void e(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int j;
        int k;
        ab1 = (p)ab1.a(5);
        j = a(xmlpullparser.getAttributeValue(null, "amount"), 0);
        k = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        int i = 1;
_L6:
        int l = a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff);
        float f1 = b(xmlpullparser.getAttributeValue(null, "speed"), 3.402823E+38F);
        int i1 = a(xmlpullparser.getAttributeValue(null, "startDelayTime"), 0);
        int j1 = a(xmlpullparser.getAttributeValue(null, "repeatStartDelayTime"), 0);
        ab1.g(l);
        ab1.c(f1);
        ab1.f(k);
        ab1.e(i);
        ab1.d(j1);
        ab1.c(i1);
        ab1.b(j);
        a(xmlpullparser, ab1);
        return;
_L4:
        if (s1.equals("reverse"))
        {
            i = 2;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void e(XmlPullParser xmlpullparser, z z1)
    {
        z1 = z1.h();
        z1.a(b(xmlpullparser.getAttributeValue(null, "x"), 0.0F));
        z1.b(b(xmlpullparser.getAttributeValue(null, "y"), 0.0F));
        z1.a(xmlpullparser.getAttributeValue(null, "src"));
    }

    private void f(XmlPullParser xmlpullparser, ab ab1)
    {
        String s1;
        int i;
        boolean flag;
        int j;
        flag = false;
        ab1 = (g)ab1.a(7);
        ab1.g(a(xmlpullparser.getAttributeValue(null, "duration"), 0x7fffffff));
        ab1.a((int)b(xmlpullparser.getAttributeValue(null, "initOffsetX"), 0.0F));
        ab1.b((int)b(xmlpullparser.getAttributeValue(null, "initOffsetY"), 0.0F));
        j = a(xmlpullparser.getAttributeValue(null, "repeatCount"), 0);
        s1 = xmlpullparser.getAttributeValue(null, "repeatMode");
        i = ((flag) ? 1 : 0);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.equals("repeat")) goto _L4; else goto _L3
_L3:
        i = 1;
_L2:
        ab1.e(i);
        ab1.f(j);
        xmlpullparser = xmlpullparser.getAttributeValue(null, "direction");
        if (xmlpullparser.equals("down"))
        {
            ab1.h(4);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = ((flag) ? 1 : 0);
        if (s1.equals("reverse"))
        {
            i = 2;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (xmlpullparser.equals("right"))
        {
            ab1.h(2);
            return;
        }
        if (xmlpullparser.equals("up"))
        {
            ab1.h(3);
            return;
        } else
        {
            ab1.h(1);
            return;
        }
    }

    private void f(XmlPullParser xmlpullparser, z z1)
    {
        z1 = (r)z1.a(1);
        String s1 = xmlpullparser.getAttributeValue(null, "x");
        if (a(s1))
        {
            z1.j(2);
            z1.h(a(s1, 0.0F));
        } else
        {
            z1.j(1);
            z1.h(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "y");
        if (a(s1))
        {
            z1.k(2);
            z1.i(a(s1, 0.0F));
        } else
        {
            z1.k(1);
            z1.i(b(s1, 0.0F));
        }
        z1.j(b(xmlpullparser.getAttributeValue(null, "anchorX"), z1.q()));
        z1.k(b(xmlpullparser.getAttributeValue(null, "anchorY"), z1.r()));
        z1.l(c(xmlpullparser.getAttributeValue(null, "anchor")));
        z1.a(b(xmlpullparser.getAttributeValue(null, "initAlpha"), 1.0F));
        z1.b(b(xmlpullparser.getAttributeValue(null, "initScaleX"), 1.0F));
        z1.c(b(xmlpullparser.getAttributeValue(null, "initScaleY"), 1.0F));
        s1 = xmlpullparser.getAttributeValue(null, "initScalePivotX");
        if (a(s1))
        {
            z1.c(1);
            z1.d(a(s1, 0.5F));
        } else
        {
            z1.c(0);
            z1.d(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "initScalePivotY");
        if (a(s1))
        {
            z1.d(1);
            z1.e(a(s1, 0.5F));
        } else
        {
            z1.d(0);
            z1.e(b(s1, 0.0F));
        }
        z1.b(a(xmlpullparser.getAttributeValue(null, "initRotate"), 0));
        s1 = xmlpullparser.getAttributeValue(null, "initRotatePivotX");
        if (a(s1))
        {
            z1.e(1);
            z1.f(a(s1, 0.5F));
        } else
        {
            z1.e(0);
            z1.f(b(s1, 0.0F));
        }
        s1 = xmlpullparser.getAttributeValue(null, "initRotatePivotY");
        if (a(s1))
        {
            z1.f(1);
            z1.g(a(s1, 0.5F));
        } else
        {
            z1.f(0);
            z1.g(b(s1, 0.0F));
        }
        z1.a(xmlpullparser.getAttributeValue(null, "src"));
        z1.h(a(xmlpullparser.getAttributeValue(null, "width"), 0));
        z1.i(a(xmlpullparser.getAttributeValue(null, "height"), 0));
        z1.a(c(xmlpullparser.getAttributeValue(null, "antialias"), 0));
        a(xmlpullparser, z1);
    }

    private ab g(XmlPullParser xmlpullparser, ab ab1)
    {
_L2:
        String s1;
        if (xmlpullparser.next() == 1)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s1 = xmlpullparser.getName();
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = xmlpullparser.getEventType();
        if (!s1.equals("translate") || i != 2)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        try
        {
            a(xmlpullparser, ab1);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            xmlpullparser.printStackTrace();
        }
        return ab1;
        if (!s1.equals("scale") || i != 2)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        b(xmlpullparser, ab1);
        continue; /* Loop/switch isn't completed */
        if (!s1.equals("rotate") || i != 2)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        c(xmlpullparser, ab1);
        continue; /* Loop/switch isn't completed */
        if (!s1.equals("alpha") || i != 2)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        d(xmlpullparser, ab1);
        continue; /* Loop/switch isn't completed */
        if (!s1.equals("set") || i != 2)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        g(xmlpullparser, (ab)ab1.a(6));
        continue; /* Loop/switch isn't completed */
        if (!s1.equals("frames") || i != 2)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        e(xmlpullparser, ab1);
        continue; /* Loop/switch isn't completed */
        if (!s1.equals("cycle") || i != 2)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        f(xmlpullparser, ab1);
        continue; /* Loop/switch isn't completed */
        boolean flag = s1.equals("set");
        if (flag && i == 3)
        {
            return ab1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void g(XmlPullParser xmlpullparser, z z1)
    {
        s s1 = new s();
        Object obj = xmlpullparser.getAttributeValue(null, "src");
        float f5 = b(xmlpullparser.getAttributeValue(null, "initAlpha"), 1.0F);
        float f6 = b(xmlpullparser.getAttributeValue(null, "initScaleX"), 1.0F);
        float f7 = b(xmlpullparser.getAttributeValue(null, "initScaleY"), 1.0F);
        int j = 1;
        Object obj1 = xmlpullparser.getAttributeValue(null, "initScalePivotX");
        float f1;
        float f2;
        float f3;
        float f4;
        int i;
        int k;
        int l;
        int i2;
        int k2;
        int l2;
        if (a(((String) (obj1))))
        {
            f1 = a(((String) (obj1)), 0.5F);
            i = 1;
        } else
        {
            f1 = b(((String) (obj1)), 0.0F);
            i = 0;
        }
        obj1 = xmlpullparser.getAttributeValue(null, "initScalePivotY");
        if (a(((String) (obj1))))
        {
            f2 = a(((String) (obj1)), 0.5F);
        } else
        {
            f2 = b(((String) (obj1)), 0.0F);
            j = 0;
        }
        k2 = a(xmlpullparser.getAttributeValue(null, "initRotate"), 0);
        obj1 = xmlpullparser.getAttributeValue(null, "initRotatePivotX");
        if (a(((String) (obj1))))
        {
            f3 = a(((String) (obj1)), 0.5F);
            k = 1;
        } else
        {
            f3 = b(((String) (obj1)), 0.0F);
            k = 0;
        }
        obj1 = xmlpullparser.getAttributeValue(null, "initRotatePivotY");
        if (a(((String) (obj1))))
        {
            f4 = a(((String) (obj1)), 0.5F);
            l = 1;
        } else
        {
            f4 = b(((String) (obj1)), 0.0F);
            l = 0;
        }
        l2 = c(xmlpullparser.getAttributeValue(null, "antialias"), 0);
        obj1 = b(xmlpullparser.getAttributeValue(null, "x"));
        i2 = ((ArrayList) (obj1)).size();
        for (int i1 = 0; i1 < i2; i1++)
        {
            v v2 = (v)((ArrayList) (obj1)).get(i1);
            int i3 = v2.a;
            int k3 = v2.b;
            int i4 = v2.c;
            for (int k1 = 0; k1 < i4; k1++)
            {
                r r2 = s1.a();
                r2.j(1);
                r2.h((float)((double)v2.a + Math.random() * (double)(k3 - i3)));
                r2.a(((String) (obj)));
            }

        }

        obj = b(xmlpullparser.getAttributeValue(null, "y"));
        int j3 = ((ArrayList) (obj)).size();
        int l1 = -1;
        for (int j1 = 0; j1 < j3; j1++)
        {
            v v1 = (v)((ArrayList) (obj)).get(j1);
            int l3 = v1.a;
            int j4 = v1.b;
            int k4 = v1.c;
            for (int j2 = 0; j2 < k4; j2++)
            {
                l1++;
                r r1 = s1.a(l1);
                r1.a(f5);
                r1.b(k2);
                r1.e(k);
                r1.f(f3);
                r1.f(l);
                r1.g(f4);
                r1.b(f6);
                r1.c(f7);
                r1.c(i);
                r1.d(f1);
                r1.d(j);
                r1.e(f2);
                r1.k(1);
                r1.i((float)((double)l3 + Math.random() * (double)(j4 - l3)));
                r1.a(l2);
            }

        }

        a(xmlpullparser, s1);
        z1.a(s1);
    }

    private void h(XmlPullParser xmlpullparser, z z1)
    {
        z1 = z1.a(0);
        String s1 = xmlpullparser.getAttributeValue(null, "x");
        if (a(s1))
        {
            z1.j(2);
            z1.h(a(s1, 0.0F));
        } else
        {
            z1.j(1);
            z1.h(b(s1, 0.0F));
        }
        z1.l(c(xmlpullparser.getAttributeValue(null, "anchor")));
        s1 = xmlpullparser.getAttributeValue(null, "y");
        if (a(s1))
        {
            z1.k(2);
            z1.i(a(s1, 0.0F));
        } else
        {
            z1.k(1);
            z1.i(b(s1, 0.0F));
        }
        z1.a(xmlpullparser.getAttributeValue(null, "src"));
        z1.h(a(xmlpullparser.getAttributeValue(null, "width"), 0));
        z1.i(a(xmlpullparser.getAttributeValue(null, "height"), 0));
        a(xmlpullparser, z1);
    }

    public void a(XmlPullParser xmlpullparser, z z1)
    {
        if (xmlpullparser != null && z1 != null)
        {
            while (xmlpullparser.next() != 1) 
            {
                String s1 = xmlpullparser.getName();
                if (s1 != null)
                {
                    int i = xmlpullparser.getEventType();
                    if (s1.equals("description") && i == 2)
                    {
                        b(xmlpullparser, z1);
                    } else
                    if (s1.equals("sensorBackground") && i == 2)
                    {
                        c(xmlpullparser, z1);
                    } else
                    if (s1.equals("background") && i == 2)
                    {
                        d(xmlpullparser, z1);
                    } else
                    if (s1.equals("foreground") && i == 2)
                    {
                        e(xmlpullparser, z1);
                    } else
                    if (s1.equals("image") && i == 2)
                    {
                        f(xmlpullparser, z1);
                    } else
                    if (s1.equals("images") && i == 2)
                    {
                        g(xmlpullparser, z1);
                    } else
                    if (s1.equals("imageFrame") && i == 2)
                    {
                        h(xmlpullparser, z1);
                    }
                }
            }
        }
    }

    static 
    {
        a = null;
        a = new HashMap();
        a.put("ANTI_ALIAS_FLAG", Integer.valueOf(1));
        a.put("FILTER_BITMAP_FLAG", Integer.valueOf(2));
        b = Pattern.compile("-{0,1}\\d+%");
    }
}
