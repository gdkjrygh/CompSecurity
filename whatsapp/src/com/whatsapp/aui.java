// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.bc;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            wi, pr

class aui extends bc
{

    final wi b;

    aui(wi wi1, File file)
    {
        b = wi1;
        super(file);
    }

    public boolean a()
    {
        return !pr.a(b.a);
    }
}
