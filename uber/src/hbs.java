// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.rds.core.app.RdsActivity;

public abstract class hbs extends gkw
{

    private Object a;

    public hbs()
    {
    }

    protected final RdsActivity a()
    {
        return (RdsActivity)getActivity();
    }

    protected abstract void a(Object obj);

    protected abstract Object b();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a == null)
        {
            a = b();
        }
        a(a);
    }
}
