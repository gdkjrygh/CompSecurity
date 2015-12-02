// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.widget.ImageView;
import java.util.Stack;

// Referenced classes of package com.whatsapp.util:
//            Log, bb, al

class b0
{

    private final Stack a;

    private b0()
    {
        a = new Stack();
    }

    b0(al al)
    {
        this();
    }

    static Stack a(b0 b0_1)
    {
        return b0_1.a;
    }

    public void a(ImageView imageview)
    {
        boolean flag = Log.f;
        int i = 0;
        do
        {
label0:
            {
                if (i < a.size())
                {
                    if (((bb)a.get(i)).a == imageview)
                    {
                        a.remove(i);
                        if (!flag)
                        {
                            continue;
                        }
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }
}
