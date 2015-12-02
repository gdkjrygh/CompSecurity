// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dwm
{

    public static void a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            (new Thread(new Runnable(context, s) {

                final Context a;
                final String b;

                public final void run()
                {
                    try
                    {
                        rq.a(a, b);
                        return;
                    }
                    catch (Exception exception)
                    {
                        ijg.b(exception, "Failed to clear google token", new Object[0]);
                    }
                }

            
            {
                a = context;
                b = s;
                super();
            }
            })).start();
            return;
        }
    }
}
