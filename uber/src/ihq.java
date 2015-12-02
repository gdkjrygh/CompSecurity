// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ihq extends ica
{

    protected ihq(icc icc)
    {
        super(icc);
    }

    public final icl a()
    {
        icl aicl[] = new icl[1];
        d(new ide(aicl) {

            final icl a[];
            final ihq b;

            private void a(icl icl1)
            {
                a[0] = icl1;
            }

            public final void call(Object obj)
            {
                a((icl)obj);
            }

            
            {
                b = ihq.this;
                a = aicl;
                super();
            }
        });
        return aicl[0];
    }

    public abstract void d(ide ide);

    public final ica m()
    {
        return a(new ieg(this));
    }
}
