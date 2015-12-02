// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public abstract class gsr extends gkv
{

    private Object a;

    public gsr()
    {
    }

    protected abstract Object a();

    protected abstract void a(Object obj);

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a == null)
        {
            a = a();
        }
        a(a);
    }
}
