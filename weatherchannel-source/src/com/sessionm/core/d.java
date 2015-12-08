// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package com.sessionm.core:
//            Session

public class d
{

    private static final String cm = "com.sessionm.iap";
    private static final String cn = "SessionMIAPPrefsFile";
    private static final String co = "amount_spent";
    private Context cf;
    private float cp;

    public d(Context context)
    {
        cf = context;
        if (context != null)
        {
            cp = context.getSharedPreferences("SessionMIAPPrefsFile", 0).getFloat("amount_spent", 0.0F);
        }
    }

    private void b(float f)
    {
        cp = f;
    }

    public static void s()
    {
        Session.D().logAction("com.sessionm.iap", 1);
    }

    public void a(float f)
    {
        b(t() + f);
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("SessionMIAPPrefsFile", 0).edit();
        editor.putFloat("amount_spent", t());
        editor.commit();
    }

    public void g(Context context)
    {
        b(0.0F);
        context = context.getSharedPreferences("SessionMIAPPrefsFile", 0).edit();
        context.putFloat("amount_spent", 0.0F);
        context.commit();
    }

    public float t()
    {
        this;
        JVM INSTR monitorenter ;
        float f = cp;
        this;
        JVM INSTR monitorexit ;
        return f;
        Exception exception;
        exception;
        throw exception;
    }
}
