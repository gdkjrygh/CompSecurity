// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            f8, fs, App, _p, 
//            ak3, a_j, wn, aku, 
//            a1g, p0, ak9, tl, 
//            y8, za

public class afn
{

    private static final int a[];
    private static final f8 e[];
    private static int h;
    private static final int i[];
    private static final int k[];
    private static int l;
    private static final int o[];
    private static final int p[];
    private static int r;
    private static ArrayList w;
    private static final String z[];
    private int b;
    private LayoutInflater c;
    private int d;
    private ImageView f;
    private wn g;
    private _p j[];
    private Comparator m;
    private int n;
    private android.view.View.OnClickListener q;
    private za s;
    private ViewPager t;
    private ViewGroup u;
    private Context v;

    public afn(Context context, ViewGroup viewgroup)
    {
        int j1;
        j1 = App.am;
        super();
        j = new _p[e.length];
        m = new ak3(this);
        v = context;
        if (w != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        context = new File(App.au.getFilesDir(), z[1]);
        if (!context.exists())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        a_j a_j1 = new a_j(this, new FileInputStream(context));
        context = a_j1;
        w = (ArrayList)(ArrayList)a_j1.readObject();
        Exception exception;
        int i1;
        if (a_j1 != null)
        {
            try
            {
                a_j1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        context = w;
        if (context == null)
        {
            try
            {
                w = new ArrayList();
                l = 1;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_140;
            }
        }
        l = 0;
        try
        {
            u = (ViewGroup)viewgroup.findViewById(0x7f0b01c4);
            g = new wn(this, null);
            t = (ViewPager)viewgroup.findViewById(0x7f0b012d);
            t.setOffscreenPageLimit(6);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                t.setLayerType(1, null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        t.setAdapter(g);
        t.setOnPageChangeListener(new aku(this));
        c = (LayoutInflater)App.au.getBaseContext().getSystemService(z[2]);
        n = a1g.a().e;
        b = a1g.a().w;
        i1 = 0;
        do
        {
            if (i1 >= e.length)
            {
                break;
            }
            context = e[i1];
            u.findViewById(f8.a(context)).setOnClickListener(new p0(this, context));
            i1++;
        } while (j1 == 0);
        if (!App.aR()) goto _L2; else goto _L1
_L1:
        i1 = l;
_L3:
        t.setCurrentItem(i1, false);
        a(l);
        q = new ak9(this);
        f = (ImageView)viewgroup.findViewById(0x7f0b01d1);
        if (f != null)
        {
            context = new tl(this);
            f.setClickable(true);
            f.setOnTouchListener(new y8(this, context));
            f.setImageDrawable(new m(v.getResources().getDrawable(0x7f020654)));
        }
        return;
        exception;
        a_j1 = null;
_L5:
        context = a_j1;
        Log.e((new StringBuilder()).append(z[0]).append(exception.toString()).toString());
        if (a_j1 != null)
        {
            try
            {
                a_j1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        break MISSING_BLOCK_LABEL_109;
        viewgroup;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw viewgroup;
        context;
        throw context;
        context;
        throw context;
_L2:
        i1 = j.length - 1 - l;
          goto _L3
        viewgroup;
          goto _L4
        exception;
          goto _L5
    }

    static int a()
    {
        return l;
    }

    static int a(afn afn1)
    {
        return afn1.n;
    }

    static Drawable a(Context context, int i1)
    {
        return b(context, i1);
    }

    private void a(int i1)
    {
        int k1 = App.am;
        f8 af8[] = e;
        int l1 = af8.length;
        int j1 = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
                        if (j1 >= l1)
                        {
                            break label1;
                        }
                        f8 f8_1 = af8[j1];
                        View view = u.findViewById(f8.b(f8_1));
                        ImageView imageview = (ImageView)(ImageView)u.findViewById(f8.a(f8_1));
                        if (imageview == null)
                        {
                            break label2;
                        }
                        if (com.whatsapp.f8.c(f8_1) == i1)
                        {
                            imageview.setSelected(true);
                            view.setVisibility(0);
                            if (k1 == 0)
                            {
                                break label2;
                            }
                        }
                        imageview.setSelected(false);
                        view.setVisibility(4);
                    }
                    if (k1 == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            j1++;
        } while (true);
    }

    static void a(afn afn1, int i1)
    {
        afn1.a(i1);
    }

    static Context b(afn afn1)
    {
        return afn1.v;
    }

    private static Drawable b(Context context, int i1)
    {
        switch (i1)
        {
        default:
            return com.whatsapp.util.c.a(context, i1);

        case 57932: 
            return context.getResources().getDrawable(0x7f0205e6);

        case 57934: 
            return context.getResources().getDrawable(0x7f0205e7);

        case 57935: 
            return context.getResources().getDrawable(0x7f0205e8);

        case 57673: 
            return context.getResources().getDrawable(0x7f0205e5);

        case 58679: 
            return context.getResources().getDrawable(0x7f0205e9);

        case 127932: 
            return context.getResources().getDrawable(0x7f0205ea);

        case 128178: 
            return context.getResources().getDrawable(0x7f0205ed);

        case 128282: 
            return context.getResources().getDrawable(0x7f0205f0);

        case 128283: 
            return context.getResources().getDrawable(0x7f0205f1);

        case 128284: 
            return context.getResources().getDrawable(0x7f0205f2);

        case 128259: 
            return context.getResources().getDrawable(0x7f0205ee);

        case 128281: 
            return context.getResources().getDrawable(0x7f0205ef);

        case 10160: 
            return context.getResources().getDrawable(0x7f0205f8);

        case 10004: 
            return context.getResources().getDrawable(0x7f0205f3);

        case 10006: 
            return context.getResources().getDrawable(0x7f0205f4);

        case 10133: 
            return context.getResources().getDrawable(0x7f0205f5);

        case 10134: 
            return context.getResources().getDrawable(0x7f0205f6);

        case 10135: 
            return context.getResources().getDrawable(0x7f0205f7);

        case 12336: 
            return context.getResources().getDrawable(0x7f0205f9);

        case 128028: 
            return context.getResources().getDrawable(0x7f0205ec);

        case 128003: 
            return context.getResources().getDrawable(0x7f0205eb);
        }
    }

    static ArrayList b()
    {
        return w;
    }

    static int c()
    {
        return h;
    }

    static int c(int i1)
    {
        l = i1;
        return i1;
    }

    static ViewPager c(afn afn1)
    {
        return afn1.t;
    }

    static za d(afn afn1)
    {
        return afn1.s;
    }

    static f8[] d()
    {
        return e;
    }

    static int e()
    {
        return r;
    }

    static LayoutInflater e(afn afn1)
    {
        return afn1.c;
    }

    static _p[] f(afn afn1)
    {
        return afn1.j;
    }

    static Comparator g(afn afn1)
    {
        return afn1.m;
    }

    static int h(afn afn1)
    {
        return afn1.b;
    }

    static int i(afn afn1)
    {
        return afn1.d;
    }

    static android.view.View.OnClickListener j(afn afn1)
    {
        return afn1.q;
    }

    public void a(Drawable drawable)
    {
        u.setBackgroundDrawable(drawable);
    }

    public void a(za za)
    {
        s = za;
    }

    public void a(boolean flag)
    {
        if (f != null)
        {
            ImageView imageview = f;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            imageview.setVisibility(i1);
        }
    }

    public void b(int i1)
    {
        int j1 = App.am;
        if (d != i1)
        {
            d = i1;
            i1 = 1;
            do
            {
                if (i1 >= j.length)
                {
                    break;
                }
                if (j[i1] != null)
                {
                    j[i1].notifyDataSetChanged();
                }
                i1++;
            } while (j1 == 0);
        }
        if (j[0] != null)
        {
            j[0].notifyDataSetChanged();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[3];
        obj = "\006[J\0321\023_F\033=\021\031W\0259\007D@\023=\rB\005";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "\006[J\0321";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "\017W\\\037-\027iL\036>\017WQ\025*";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                z = as;
                h = 500;
                r = 50;
                if (android.os.Build.VERSION.SDK_INT >= 12)
                {
                    h = ViewConfiguration.getKeyRepeatTimeout();
                    r = ViewConfiguration.getKeyRepeatDelay();
                }
                k = (new int[] {
                    58389, 57431, 0x1f600, 57430, 58388, 58373, 57606, 58392, 58391, 0x1f617, 
                    0x1f619, 57605, 58377, 0x1f61b, 58381, 58372, 58371, 58378, 58382, 57432, 
                    58374, 58387, 58386, 58385, 58376, 58369, 58383, 0x1f605, 57608, 0x1f629, 
                    0x1f62b, 58379, 57607, 57433, 58390, 0x1f624, 58375, 0x1f606, 0x1f60b, 58380, 
                    0x1f60e, 0x1f634, 0x1f635, 58384, 0x1f61f, 0x1f626, 0x1f627, 0x1f608, 57626, 0x1f62e, 
                    0x1f62c, 0x1f610, 0x1f615, 0x1f62f, 0x1f636, 0x1f607, 58370, 0x1f611, 58646, 58647, 
                    57682, 58651, 58654, 58650, 57345, 57346, 57348, 57349, 58648, 58649, 
                    58645, 57422, 58652, 0x1f63a, 0x1f638, 0x1f63b, 0x1f63d, 0x1f63c, 0x1f640, 0x1f63f, 
                    0x1f639, 0x1f63e, 0x1f479, 0x1f47a, 0x1f648, 0x1f649, 0x1f64a, 57628, 57612, 57434, 
                    57629, 58158, 58165, 0x1f4ab, 0x1f4a5, 58164, 58161, 0x1f4a7, 57660, 58160, 
                    58395, 58393, 58394, 0x1f445, 58396, 57358, 58401, 58400, 57357, 57360, 
                    57361, 58398, 57362, 58402, 57902, 57903, 57905, 57904, 58407, 58397, 
                    57359, 58399, 57676, 57857, 57621, 58655, 58408, 0x1f46a, 0x1f46c, 0x1f46d, 
                    57617, 58405, 58409, 58404, 58403, 57939, 0x1f64b, 58142, 58143, 58141, 
                    0x1f470, 0x1f64e, 0x1f64d, 58406, 58627, 57614, 58136, 57351, 0x1f45e, 58138, 
                    57662, 58139, 57350, 58114, 0x1f45a, 58137, 0x1f3bd, 0x1f456, 58145, 58146, 
                    57630, 58147, 0x1f45d, 0x1f45b, 0x1f453, 58132, 58428, 58140, 58156, 58154, 
                    58157, 58155, 57378, 57379, 58152, 58151, 0x1f495, 0x1f496, 0x1f49e, 58153, 
                    0x1f48c, 57347, 57396, 57397, 0x1f464, 0x1f465, 0x1f4ac, 58678, 0x1f4ad
                });
                a = (new int[] {
                    57426, 58666, 57423, 57427, 58660, 58668, 58673, 57424, 58663, 57425, 
                    57611, 0x1f43d, 58667, 58671, 57609, 58664, 57370, 58665, 58662, 0x1f43c, 
                    57429, 58657, 58659, 0x1f425, 0x1f423, 58670, 58669, 0x1f422, 58661, 0x1f41d, 
                    0x1f41c, 0x1f41e, 0x1f40c, 57610, 58433, 58658, 57369, 58656, 57428, 0x1f40b, 
                    0x1f404, 0x1f40f, 0x1f400, 0x1f403, 0x1f405, 0x1f407, 0x1f409, 57652, 0x1f410, 0x1f413, 
                    0x1f415, 0x1f416, 0x1f401, 0x1f402, 0x1f432, 0x1f421, 0x1f40a, 58672, 0x1f42a, 0x1f406, 
                    0x1f408, 0x1f429, 0x1f43e, 58118, 57392, 58116, 57616, 57394, 58117, 58115, 
                    57624, 58439, 57625, 0x1f33f, 58436, 0x1f344, 58120, 58119, 0x1f332, 0x1f333, 
                    0x1f330, 0x1f331, 0x1f33c, 0x1f310, 0x1f31e, 0x1f31d, 0x1f31a, 0x1f311, 0x1f312, 0x1f313, 
                    0x1f314, 0x1f315, 0x1f316, 0x1f317, 0x1f318, 0x1f31c, 0x1f31b, 57420, 0x1f30d, 0x1f30e, 
                    0x1f30f, 0x1f30b, 0x1f30c, 0x1f320, 58159, 57418, 9925, 57417, 57661, 57419, 
                    10052, 57416, 58435, 0x1f301, 58444, 58430
                });
                i = (new int[] {
                    58422, 58423, 58424, 58426, 58425, 58427, 57623, 58432, 58434, 58438, 
                    58437, 57627, 58440, 57395, 57618, 0x1f38b, 58130, 0x1f38a, 58128, 57667, 
                    0x1f52e, 57405, 57352, 0x1f4f9, 57641, 57638, 57639, 58134, 0x1f4be, 57356, 
                    57354, 57353, 0x1f4de, 0x1f4df, 57355, 57675, 57642, 57640, 57665, 0x1f509, 
                    0x1f508, 0x1f507, 58149, 0x1f515, 57666, 58135, 9203, 8987, 9200, 8986, 
                    57669, 57668, 0x1f50f, 0x1f510, 57407, 0x1f50e, 57615, 0x1f526, 0x1f506, 0x1f505, 
                    0x1f50c, 0x1f50b, 57620, 0x1f6c1, 57663, 0x1f6bf, 57664, 0x1f527, 0x1f529, 57622, 
                    0x1f6aa, 58126, 58129, 57619, 0x1f52a, 58127, 57659, 57647, 0x1f4b4, 0x1f4b5, 
                    0x1f4b7, 0x1f4b6, 0x1f4b3, 0x1f4b8, 57604, 0x1f4e7, 0x1f4e5, 0x1f4e4, 9993, 57603, 
                    0x1f4e8, 0x1f4ef, 57601, 0x1f4ea, 0x1f4ec, 0x1f4ed, 57602, 0x1f4e6, 58113, 0x1f4c4, 
                    0x1f4c3, 0x1f4d1, 0x1f4ca, 0x1f4c8, 0x1f4c9, 0x1f4dc, 0x1f4cb, 0x1f4c5, 0x1f4c6, 0x1f4c7, 
                    0x1f4c1, 0x1f4c2, 58131, 0x1f4cc, 0x1f4ce, 10002, 9999, 0x1f4cf, 0x1f4d0, 0x1f4d5, 
                    0x1f4d7, 0x1f4d8, 0x1f4d9, 0x1f4d3, 0x1f4d4, 0x1f4d2, 0x1f4da, 57672, 0x1f516, 0x1f4db, 
                    0x1f52c, 0x1f52d, 0x1f4f0, 58626, 58148, 57404, 58122, 0x1f3bc, 57406, 58150, 
                    0x1f3b9, 0x1f3bb, 57410, 57408, 57409, 57643, 0x1f3ae, 0x1f0cf, 0x1f3b4, 57645, 
                    0x1f3b2, 57648, 58411, 58410, 57368, 57366, 57365, 58412, 0x1f3c9, 0x1f3b3, 
                    57364, 0x1f6b5, 0x1f6b4, 57650, 0x1f3c7, 57649, 57363, 0x1f3c2, 58413, 57367, 
                    0x1f3a3, 57413, 58168, 58123, 0x1f37c, 57415, 58124, 57412, 0x1f379, 0x1f377, 
                    57411, 0x1f355, 57632, 58171, 0x1f357, 0x1f356, 58175, 58177, 0x1f364, 58188, 
                    58180, 0x1f365, 58178, 58173, 58174, 58176, 58189, 58179, 58172, 57671, 
                    58169, 0x1f369, 0x1f36e, 58170, 0x1f368, 58431, 58187, 57414, 0x1f36a, 0x1f36b, 
                    0x1f36c, 0x1f36d, 0x1f36f, 58181, 0x1f34f, 58182, 0x1f34b, 0x1f352, 0x1f347, 58184, 
                    58183, 0x1f351, 0x1f348, 0x1f34c, 0x1f350, 0x1f34d, 0x1f360, 58186, 58185, 0x1f33d
                });
                o = (new int[] {
                    57398, 0x1f3e1, 57687, 57400, 57683, 57685, 57677, 57686, 58625, 57688, 
                    58429, 57399, 58628, 0x1f3e4, 58442, 57670, 58629, 58630, 57634, 58632, 
                    58633, 0x1f5fe, 57403, 57421, 58441, 58443, 58653, 0x1f309, 0x1f3a0, 57636, 
                    57633, 58419, 57858, 57372, 57653, 0x1f6a3, 9875, 57613, 57373, 57631, 
                    0x1f681, 0x1f682, 0x1f68a, 57401, 0x1f69e, 0x1f686, 58421, 57375, 0x1f688, 58420, 
                    0x1f69d, 0x1f68b, 57374, 0x1f68e, 57689, 0x1f68d, 58414, 0x1f698, 57371, 57690, 
                    0x1f696, 0x1f69b, 58415, 0x1f6a8, 58418, 0x1f694, 58416, 58417, 0x1f690, 57654, 
                    0x1f6a1, 0x1f69f, 0x1f6a0, 0x1f69c, 58144, 57680, 57637, 0x1f6a6, 57678, 57938, 
                    57655, 57865, 57402, 0x1f3ee, 57651, 57635, 0x1f5ff, 0x1f3aa, 0x1f3ad, 0x1f4cd, 
                    0x1f6a9, 60417, 58638, 60419, 60418, 58641, 58639, 58640, 60420, 60421, 
                    60439, 60422, 58636, 60424, 60423, 58642, 60425, 60427, 60426, 60428, 
                    60430, 60429, 60432, 60431, 60437, 60435, 60434, 58637, 60438, 60433, 
                    60436, 58643, 58644, 58635, 60453, 60459, 60440, 60455, 60457, 60448, 
                    60456, 60454, 60441, 60446, 60449, 60443, 60451, 60460, 60458, 60461, 
                    60452, 60450, 60442, 60447, 60444, 60445, 60462
                });
                p = (new int[] {
                    57884, 57885, 57886, 57887, 57888, 57889, 57890, 57891, 57892, 57893, 
                    0x1f51f, 0x1f522, 57872, 0x1f523, 57906, 57907, 57909, 57908, 0x1f520, 0x1f521, 
                    0x1f524, 57910, 57911, 57912, 57913, 8596, 8597, 0x1f504, 57915, 57914, 
                    0x1f53c, 0x1f53d, 8617, 8618, 8505, 57917, 57916, 9195, 9196, 10549, 
                    10548, 57933, 0x1f500, 0x1f501, 0x1f502, 57874, 57875, 57876, 0x1f193, 0x1f196, 
                    57867, 58631, 57859, 57900, 57899, 57898, 0x1f234, 0x1f232, 57894, 57895, 
                    57901, 57877, 57878, 57681, 57656, 57657, 57658, 58121, 0x1f6b0, 0x1f6ae, 
                    57679, 57866, 57864, 57879, 57880, 57896, 9410, 0x1f6c2, 0x1f6c4, 0x1f6c5, 
                    0x1f6c3, 0x1f251, 58133, 58125, 0x1f191, 0x1f198, 57897, 0x1f6ab, 57863, 0x1f4f5, 
                    0x1f6af, 0x1f6b1, 0x1f6b3, 0x1f6b7, 0x1f6b8, 9940, 57862, 10055, 10062, 9989, 
                    57861, 57860, 57646, 57936, 57937, 58674, 58675, 58676, 58677, 0x1f4a0, 
                    57873, 9851, 57919, 57920, 57921, 57922, 57923, 57924, 57925, 57926, 
                    57927, 57928, 57929, 57930, 57931, 57918, 57684, 57674, 0x1f4b2, 57673, 
                    57934, 57935, 58679, 57644, 12336, 57932, 0x1f51a, 0x1f519, 0x1f51b, 0x1f51c, 
                    58163, 58162, 57377, 57376, 58167, 58166, 0x1f503, 57391, 0x1f567, 57380, 
                    0x1f55c, 57381, 0x1f55d, 57382, 0x1f55e, 57383, 0x1f55f, 57384, 0x1f560, 57385, 
                    57386, 57387, 57388, 57389, 57390, 0x1f561, 0x1f562, 0x1f563, 0x1f564, 0x1f565, 
                    0x1f566, 10006, 10133, 10134, 10135, 57870, 57868, 57871, 57869, 0x1f4ae, 
                    0x1f4af, 10004, 9745, 0x1f518, 0x1f517, 10160, 57393, 57882, 57883, 9724, 
                    9723, 9726, 9725, 9642, 9643, 0x1f53a, 11036, 11035, 9899, 9898, 
                    57881, 0x1f535, 0x1f53b, 0x1f536, 0x1f537, 0x1f538, 0x1f539
                });
                l = 1;
                e = (new f8[] {
                    new fs(0, 0x7f0b01c5, 0x7f0b01c6, null), new f8(1, k, 0x7f0b01c7, 0x7f0b01c8, null), new f8(2, a, 0x7f0b01c9, 0x7f0b01ca, null), new f8(3, i, 0x7f0b01cb, 0x7f0b01cc, null), new f8(4, o, 0x7f0b01cd, 0x7f0b01ce, null), new f8(5, p, 0x7f0b01cf, 0x7f0b01d0, null)
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 6644
    //                   0 6665
    //                   1 6671
    //                   2 6677
    //                   3 6683;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_6683;
_L3:
        byte byte0 = 88;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 99;
          goto _L9
_L5:
        byte0 = 54;
          goto _L9
_L6:
        byte0 = 37;
          goto _L9
        byte0 = 112;
          goto _L9
    }
}
