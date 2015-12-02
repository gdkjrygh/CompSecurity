// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcf
    implements cpw
{

    private gob a;

    public dcf(gob gob1)
    {
        a = gob1;
    }

    public final void a(cpx cpx)
    {
        a.a(new gnw(cpx) {

            final cpx a;
            final dcf b;

            private void a(String s)
            {
                a.a(s);
            }

            public final void a(Exception exception)
            {
                a.c_();
            }

            public final volatile void a(Object obj)
            {
                a((String)obj);
            }

            
            {
                b = dcf.this;
                a = cpx1;
                super();
            }
        });
    }
}
