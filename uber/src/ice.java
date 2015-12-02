// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ice extends ica
{

    public ice(Throwable throwable)
    {
        super(new icc(throwable) {

            final Throwable a;

            private void a(ick ick1)
            {
                ick1.a(a);
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                a = throwable;
                super();
            }
        });
    }
}
