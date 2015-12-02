// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class gfl extends gfm
{

    private final int a;

    public gfl(View view, int i)
    {
        super(view);
        a = i;
    }

    public int a()
    {
        if (!i || !c())
        {
            return 0;
        } else
        {
            return a;
        }
    }

    public void a(gfk gfk1)
    {
        super.a(gfk1);
        if (!f())
        {
            return;
        }
        if (!c()) goto _L2; else goto _L1
_L1:
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[gdq.values().length];
                try
                {
                    a[gdq.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[gdq.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[gdq.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[gfk1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 80
    //                   2 85
    //                   3 93;
           goto _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_93;
_L2:
        int i = 0;
_L6:
        h().height = i;
        if (i == 0)
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            c.requestLayout();
            return;
        }
_L3:
        i = 0;
          goto _L6
_L4:
        i = a;
          goto _L6
        i = (int)((float)a * (1.0F - gfk1.c()));
          goto _L6
    }

    public final int b()
    {
        return 0;
    }

    boolean c()
    {
        return true;
    }
}
