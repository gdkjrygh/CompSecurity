// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            i, f

public class e
{

    public static SparseArray a = new SparseArray();
    public static SparseArray b = new SparseArray();
    private static boolean c = true;

    private static int a(int j, boolean flag)
    {
        int k = 0x7f0201f1;
        if (flag)
        {
            switch (j)
            {
            default:
                k = 0;
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return k;

            case 3: // '\003'
                return 0x7f0201e7;

            case 4: // '\004'
                return 0x7f0201eb;

            case 5: // '\005'
                return 0x7f0201ef;

            case 6: // '\006'
                return 0x7f0201e9;

            case 7: // '\007'
                return 0x7f0201ed;

            case 8: // '\b'
                return 0x7f0201f3;
            }
        }
        switch (j)
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f0201f2;

        case 2: // '\002'
            return 0x7f0201f2;

        case 3: // '\003'
            return 0x7f0201e8;

        case 4: // '\004'
            return 0x7f0201ec;

        case 5: // '\005'
            return 0x7f0201f0;

        case 6: // '\006'
            return 0x7f0201ea;

        case 7: // '\007'
            return 0x7f0201ee;

        case 8: // '\b'
            return 0x7f0201f4;
        }
    }

    public static int a(android.graphics.BitmapFactory.Options options, int j, int k)
    {
        int j1 = options.outHeight;
        int k1 = options.outWidth;
        int l = 1;
        int i1;
        do
        {
            i1 = l;
            if (k1 / l <= j)
            {
                break;
            }
            l++;
        } while (true);
        for (; j1 / i1 > k; i1++) { }
        return Math.min(6, i1);
    }

    private static Resources a(Context context)
    {
        Object obj1 = GoWidgetApplication.d().a();
        Object obj = null;
        try
        {
            obj1 = context.createPackageContext(((String) (obj1)), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        context = ((Context) (obj1)).getResources();
        return context;
    }

    public static Bitmap a(Context context, int j, boolean flag, int k, int l)
    {
        f f1;
        if (flag)
        {
            f1 = (f)a.get(j);
        } else
        {
            f1 = (f)b.get(j);
        }
        if (f1.c)
        {
            return a(context.getResources(), f1.b, k, l);
        }
        Resources resources = a(context);
        if (resources == null)
        {
            return a(context.getResources(), a(j, flag), k, l);
        } else
        {
            return a(resources, f1.b, k, l);
        }
    }

    public static Bitmap a(Resources resources, int j, int k, int l)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, j, options);
        options.inSampleSize = a(options, k, l);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
        return BitmapFactory.decodeResource(resources, j, options);
    }

    public static void a()
    {
        int l = a.size();
        for (int j = 0; j < l; j++)
        {
            f f1 = (f)a.valueAt(j);
            f1.b = a(f1.a, true);
            f1.c = true;
        }

        l = b.size();
        for (int k = 0; k < l; k++)
        {
            f f2 = (f)b.valueAt(k);
            f2.b = a(f2.a, false);
            f2.c = true;
        }

    }

    public static void a(i j, int k, String s)
    {
        f f1;
        int l;
label0:
        {
            f1 = (f)a.get(k);
            if (s != null)
            {
                l = j.c(s);
                if (l != 0)
                {
                    break label0;
                }
            }
            f1.b = a(k, true);
            f1.c = true;
            return;
        }
        f1.b = l;
        f1.c = false;
    }

    private static void b()
    {
        a.put(1, new f(1, 0x7f0201f1, true));
        a.put(2, new f(2, 0x7f0201f1, true));
        a.put(3, new f(3, 0x7f0201e7, true));
        a.put(4, new f(4, 0x7f0201eb, true));
        a.put(5, new f(5, 0x7f0201ef, true));
        a.put(6, new f(6, 0x7f0201e9, true));
        a.put(7, new f(7, 0x7f0201ed, true));
        a.put(8, new f(8, 0x7f0201f3, true));
        b.put(1, new f(1, 0x7f0201f2, true));
        b.put(2, new f(2, 0x7f0201f2, true));
        b.put(3, new f(3, 0x7f0201e8, true));
        b.put(4, new f(4, 0x7f0201ec, true));
        b.put(5, new f(5, 0x7f0201f0, true));
        b.put(6, new f(6, 0x7f0201ea, true));
        b.put(7, new f(7, 0x7f0201ee, true));
        b.put(8, new f(8, 0x7f0201f4, true));
    }

    public static void b(i j, int k, String s)
    {
        f f1;
        int l;
label0:
        {
            f1 = (f)b.get(k);
            if (s != null)
            {
                l = j.c(s);
                if (l != 0)
                {
                    break label0;
                }
            }
            f1.b = a(k, false);
            f1.c = true;
            return;
        }
        f1.b = l;
        f1.c = false;
    }

    static 
    {
        b();
    }
}
