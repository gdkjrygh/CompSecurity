// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import com.a.a.an;
import com.a.a.au;

// Referenced classes of package com.go.weatherex.viewex:
//            ExtendableButton

class a
    implements au
{

    final ExtendableButton a;

    a(ExtendableButton extendablebutton)
    {
        a = extendablebutton;
        super();
    }

    public void a(an an1)
    {
        ExtendableButton.a(a, an1.m());
        a.invalidate();
    }
}
