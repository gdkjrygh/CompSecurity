// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.bc;
import java.io.File;

class au5 extends bc
{

    private boolean b;

    public au5(File file)
    {
        super(file);
    }

    public void a()
    {
        b = true;
    }

    public boolean a()
    {
        return !b;
    }
}
