// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.e;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.plus.PlusOneDummyView;

// Referenced classes of package com.google.android.gms.internal:
//            ja, gi, jb

public final class kd
{

    private static Context a;
    private static ja b;

    public static View a(Context context, int i, int j, String s, int k)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new PlusOneDummyView(context, i);
            }
        }
        s = (View)n.a(a(context).a(n.a(context), i, j, s, k));
        return s;
    }

    public static View a(Context context, int i, int j, String s, String s1)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new PlusOneDummyView(context, i);
            }
        }
        s = (View)n.a(a(context).a(n.a(context), i, j, s, s1));
        return s;
    }

    private static ja a(Context context)
    {
        gi.a(context);
        if (b == null)
        {
            if (a == null)
            {
                context = e.c(context);
                a = context;
                if (context == null)
                {
                    throw new a("Could not get remote context.");
                }
            }
            context = a.getClassLoader();
            try
            {
                b = jb.a((IBinder)context.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not load creator class.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not instantiate creator.");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new a("Could not access creator.");
            }
        }
        return b;
    }

    private class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

}
