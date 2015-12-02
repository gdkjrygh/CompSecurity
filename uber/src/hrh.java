// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hrh
{

    private final List a = new ArrayList();

    public hrh()
    {
    }

    public final hrh a(View view, String s)
    {
        view = new hri(view, (hrg)view, s);
        a.add(view);
        return this;
    }

    public final boolean a()
    {
        Iterator iterator = a.iterator();
        boolean flag = true;
        Object obj;
        hrg hrg1;
        for (; iterator.hasNext(); hrg1.setError(((CharSequence) (obj))))
        {
            obj = (hri)iterator.next();
            View view = ((hri) (obj)).a;
            hrg1 = ((hri) (obj)).b;
            obj = ((hri) (obj)).c;
            boolean flag1 = hrg1.B_();
            if (!flag1 && flag)
            {
                view.requestFocus();
                flag = false;
            }
            if (flag1)
            {
                obj = null;
            }
        }

        return flag;
    }
}
