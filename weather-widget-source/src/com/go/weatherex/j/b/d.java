// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.Context;
import com.go.weatherex.j.g;
import com.go.weatherex.j.k;

// Referenced classes of package com.go.weatherex.j.b:
//            c, b, a, j, 
//            i, q

public class d extends g
{

    public d(Context context, int k)
    {
        super(context, k);
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
            return new j(this);

        case 5: // '\005'
            return new i(this);

        case 6: // '\006'
            return new q(this);
        }
    }

    public int r()
    {
        switch (a)
        {
        case 1: // '\001'
        case 4: // '\004'
        default:
            return 8;

        case 2: // '\002'
            return 9;

        case 3: // '\003'
            return 10;

        case 5: // '\005'
            return 9;

        case 6: // '\006'
            return 14;
        }
    }
}
