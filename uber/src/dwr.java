// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;

public final class dwr
    implements don
{

    private final Context a;
    private final ExecutorService b;

    public dwr(Context context, ExecutorService executorservice)
    {
        a = context;
        b = executorservice;
    }

    static Context a(dwr dwr1)
    {
        return dwr1.a;
    }

    static void a(dwr dwr1, String s)
    {
        dwr1.a(s);
    }

    private void a(String s)
    {
        android.content.SharedPreferences.Editor editor = b().edit();
        if (!TextUtils.isEmpty(s))
        {
            editor.putString("registration_id", s);
            editor.putInt("app_version", 30982);
        } else
        {
            editor.clear();
        }
        editor.apply();
    }

    private SharedPreferences b()
    {
        return a.getSharedPreferences("gcm", 0);
    }

    public final String a()
    {
        SharedPreferences sharedpreferences = b();
        String s;
        for (s = sharedpreferences.getString("registration_id", null); TextUtils.isEmpty(s) || sharedpreferences.getInt("app_version", 0x80000000) != 30982;)
        {
            return null;
        }

        return s;
    }

    public final void a(doo doo1)
    {
        if (!cwy.b(a))
        {
            doo1.a(new rx(1));
            return;
        } else
        {
            String s = a.getString(0x7f0706c1);
            b.execute(new Runnable(s, doo1) {

                final String a;
                final doo b;
                final dwr c;

                public final void run()
                {
                    try
                    {
                        String s1 = aam.a(dwr.a(c)).a(new String[] {
                            a
                        });
                        dwr.a(c, s1);
                        b.a("gcm", s1);
                        return;
                    }
                    catch (Exception exception)
                    {
                        b.a(exception);
                    }
                }

            
            {
                c = dwr.this;
                a = s;
                b = doo1;
                super();
            }
            });
            return;
        }
    }

    public final void a(dop dop1)
    {
        if (!cwy.b(a))
        {
            dop1.a(new rx(1));
            return;
        } else
        {
            b.execute(new Runnable(dop1) {

                final dop a;
                final dwr b;

                public final void run()
                {
                    String s;
                    s = b.a();
                    if (TextUtils.isEmpty(s))
                    {
                        return;
                    }
                    try
                    {
                        aam.a(dwr.a(b)).a();
                        dwr.a(b, null);
                        a.a("gcm", s);
                        return;
                    }
                    catch (Exception exception)
                    {
                        a.a(exception);
                    }
                    return;
                }

            
            {
                b = dwr.this;
                a = dop1;
                super();
            }
            });
            return;
        }
    }
}
