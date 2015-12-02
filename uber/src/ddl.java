// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class ddl
{

    public ddl()
    {
    }

    public final cxu a(Application application, hjo hjo, dal dal1)
    {
        application = new cxu(application, hjo);
        dal1.a(new dam(application) {

            final cxu a;
            final ddl b;

            public final void a(String s)
            {
                a.a(s);
            }

            public final void c()
            {
                a.a(null);
            }

            
            {
                b = ddl.this;
                a = cxu1;
                super();
            }
        });
        application.a(dal1.z());
        return application;
    }
}
