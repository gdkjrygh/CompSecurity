// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;

public final class dzw
{

    private final cev a;
    private final fte b;

    public dzw(cev cev1, fte fte1)
    {
        a = cev1;
        b = fte1;
    }

    static void a(dzw dzw1)
    {
        dzw1.c();
    }

    public static boolean a()
    {
        b();
        return false;
    }

    private static boolean b()
    {
        return "mock".equals("release");
    }

    private void c()
    {
        a.c(new fzc(b.g()));
    }

    public final void a(Context context)
    {
        if (!b())
        {
            return;
        } else
        {
            gfq agfq[] = gfq.values();
            ArrayAdapter arrayadapter = new ArrayAdapter(context, 0x1090003, agfq);
            android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(agfq) {

                final gfq a[];
                final dzw b;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    gfp.a = a[i];
                    dzw.a(b);
                }

            
            {
                b = dzw.this;
                a = agfq;
                super();
            }
            };
            android.content.DialogInterface.OnCancelListener oncancellistener = new android.content.DialogInterface.OnCancelListener() {

                final dzw a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    gfp.a = null;
                    dzw.a(a);
                }

            
            {
                a = dzw.this;
                super();
            }
            };
            (new android.app.AlertDialog.Builder(context)).setAdapter(arrayadapter, onclicklistener).setOnCancelListener(oncancellistener).show();
            return;
        }
    }
}
