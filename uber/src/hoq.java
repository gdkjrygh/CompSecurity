// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.widget.TextView;

public final class hoq
{

    private static SparseArray a = new SparseArray();

    public static Typeface a(Context context, int i)
    {
        Object obj = (Typeface)a.get(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((Typeface) (obj));
_L2:
        obj = null;
        String s = context.getResources().getString(i);
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.startsWith("fonts/"))
        {
            break; /* Loop/switch isn't completed */
        }
        context = ijy.a(context.getAssets(), s);
_L4:
        a.put(i, context);
        obj = context;
        if (context == null)
        {
            return Typeface.DEFAULT;
        }
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            context = Typeface.create(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = ((Context) (obj));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void a(Context context)
    {
        b(context, hov.ub__font_default);
    }

    public static void a(Context context, TextView textview)
    {
        ijt.a(textview, a(context, 0x7f07069a));
    }

    public static void a(Context context, TextView textview, int i)
    {
        ijt.a(textview, a(context, i), true);
    }

    public static Typeface b(Context context)
    {
        return a(context, hov.ub__font_default);
    }

    private static void b(Context context, int i)
    {
        ijk.a((new ijl()).a(context.getResources().getString(i)).a(hos.fontPath).a());
    }

}
