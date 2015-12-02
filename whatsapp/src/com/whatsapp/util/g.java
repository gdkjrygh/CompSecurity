// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.widget.ImageView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package com.whatsapp.util:
//            Log, cf, y

class g
{

    final y a;
    private Stack b;

    g(y y)
    {
        a = y;
        super();
        b = new Stack();
    }

    static Stack a(g g1)
    {
        return g1.b;
    }

    public void a(ImageView imageview)
    {
        boolean flag = Log.f;
        int i = 0;
        do
        {
label0:
            {
                if (i < b.size())
                {
                    if (((cf)b.get(i)).c == imageview)
                    {
                        b.remove(i);
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

    public boolean a(c4 c4_1)
    {
        boolean flag = Log.f;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((cf)iterator.next()).a.y.equals(c4_1.y))
            {
                return true;
            }
        } while (!flag);
        return false;
    }
}
