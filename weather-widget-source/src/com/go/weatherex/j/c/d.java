// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.Context;
import com.go.weatherex.j.g;
import com.go.weatherex.j.k;

// Referenced classes of package com.go.weatherex.j.c:
//            c, b, a, k, 
//            j

public class d extends g
{

    public d(Context context, int i)
    {
        super(context, i);
    }

    public k q()
    {
        switch (a)
        {
        default:
            throw new IllegalStateException("need to handle a new widget type in loading theme\uFF1F");

        case 1: // '\001'
            return new c(this);

        case 2: // '\002'
            return new b(this);

        case 3: // '\003'
            return new a(this);

        case 4: // '\004'
            return new com.go.weatherex.j.c.k(this);

        case 5: // '\005'
            return new j(this);
        }
    }

    public int r()
    {
        switch (a)
        {
        case 1: // '\001'
        case 4: // '\004'
        default:
            return 4;

        case 2: // '\002'
            return 5;

        case 3: // '\003'
            return 6;

        case 5: // '\005'
            return 5;
        }
    }

    public int s()
    {
        switch (a)
        {
        default:
            throw new IllegalStateException("need to handle a new widget type in getGoWidgetType()\uFF1F");

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 3;

        case 5: // '\005'
            return 4;

        case 4: // '\004'
            return 6;
        }
    }
}
