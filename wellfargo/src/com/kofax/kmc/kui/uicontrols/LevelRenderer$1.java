// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            LevelRenderer

class a
    implements Runnable
{

    final LevelRenderer a;

    public void run()
    {
        a.invalidate();
    }

    (LevelRenderer levelrenderer)
    {
        a = levelrenderer;
        super();
    }
}
