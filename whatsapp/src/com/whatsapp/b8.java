// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ImageView;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            App, ada, i0

final class b8
{

    private final Stack a;

    private b8()
    {
        a = new Stack();
    }

    b8(i0 i0)
    {
        this();
    }

    static Stack a(b8 b8_1)
    {
        return b8_1.a;
    }

    public void a(ImageView imageview)
    {
        int j = App.am;
        int i = 0;
        do
        {
label0:
            {
                if (i < a.size())
                {
                    if (((ada)a.get(i)).a == imageview)
                    {
                        a.remove(i);
                        if (j == 0)
                        {
                            continue;
                        }
                    }
                    if (j == 0)
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
