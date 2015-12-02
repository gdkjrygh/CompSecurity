// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iev
    implements icd
{

    final idi a;
    final idj b;

    private ick a(ick ick1)
    {
        return new ick(ick1, ick1) {

            final ick a;
            final iev b;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
                try
                {
                    a.a(((ica)b.a.a(obj)).d(new idi(this, obj) {

                        final Object a;
                        final _cls2 b;

                        public final Object a(Object obj)
                        {
                            return b.b.b.a(a, obj);
                        }

            
            {
                b = _pcls2;
                a = obj;
                super();
            }
                    }));
                    return;
                }
                catch (Throwable throwable)
                {
                    a.a(ida.a(throwable, obj));
                }
            }

            public final void a(Throwable throwable)
            {
                a.a(throwable);
            }

            
            {
                b = iev.this;
                a = ick2;
                super(ick1);
            }
        };
    }

    public static idi a(idi idi)
    {
        return new idi(idi) {

            final idi a;

            private ica b(Object obj)
            {
                return ica.a((Iterable)a.a(obj));
            }

            public final Object a(Object obj)
            {
                return b(obj);
            }

            
            {
                a = idi1;
                super();
            }
        };
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
