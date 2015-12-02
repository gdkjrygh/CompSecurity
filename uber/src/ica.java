// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ica
{

    private static final ihy b = iia.a().c();
    final icc a;

    protected ica(icc icc1)
    {
        a = icc1;
    }

    public static final ica a(long l1, TimeUnit timeunit, ici ici)
    {
        return a(((icc) (new ieh(l1, timeunit, ici))));
    }

    private static ica a(ica ica1)
    {
        return ica1.a(((icd) (iel.a())));
    }

    public static final ica a(ica ica1, ica ica2)
    {
        return b(a(((Iterable) (Arrays.asList(new ica[] {
            ica1, ica2
        })))));
    }

    public static final ica a(ica ica1, ica ica2, ica ica3)
    {
        return c(a(ica1, ica2, ica3));
    }

    public static final ica a(ica ica1, ica ica2, ica ica3, ica ica4, ica ica5, ica ica6, idn idn)
    {
        return a(Arrays.asList(new ica[] {
            ica1, ica2, ica3, ica4, ica5, ica6
        }), idp.a(idn));
    }

    public static final ica a(ica ica1, ica ica2, ica ica3, ica ica4, ica ica5, idm idm)
    {
        return a(Arrays.asList(new ica[] {
            ica1, ica2, ica3, ica4, ica5
        }), idp.a(idm));
    }

    public static final ica a(ica ica1, ica ica2, ica ica3, ica ica4, idl idl)
    {
        return a(Arrays.asList(new ica[] {
            ica1, ica2, ica3, ica4
        }), idp.a(idl));
    }

    public static final ica a(ica ica1, ica ica2, ica ica3, idk idk)
    {
        return a(Arrays.asList(new ica[] {
            ica1, ica2, ica3
        }), idp.a(idk));
    }

    public static final ica a(ica ica1, ica ica2, idj idj)
    {
        return a(Arrays.asList(new ica[] {
            ica1, ica2
        }), idp.a(idj));
    }

    public static final ica a(icc icc1)
    {
        return new ica(ihy.a(icc1));
    }

    public static final ica a(idh idh)
    {
        return a(((icc) (new iec(idh))));
    }

    public static final ica a(Iterable iterable)
    {
        return a(((icc) (new ied(iterable))));
    }

    private static ica a(Object obj, Object obj1)
    {
        return a(((Iterable) (Arrays.asList(new Object[] {
            obj, obj1
        }))));
    }

    private static ica a(Object obj, Object obj1, Object obj2)
    {
        return a(((Iterable) (Arrays.asList(new Object[] {
            obj, obj1, obj2
        }))));
    }

    private static ica a(List list, ido ido)
    {
        return a(((icc) (new idx(list, ido))));
    }

    public static final ica a(TimeUnit timeunit)
    {
        return b(timeunit, iim.b());
    }

    private static icl a(ick ick1, ica ica1)
    {
        if (ick1 == null)
        {
            throw new IllegalArgumentException("observer can not be null");
        }
        if (ica1.a == null)
        {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        ick1.d();
        Object obj = ick1;
        if (!(ick1 instanceof ihs))
        {
            obj = new ihs(ick1);
        }
        try
        {
            ihy.b(ica1.a).call(obj);
            ick1 = ihy.a(((icl) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ick ick1)
        {
            icw.a(ick1);
            try
            {
                ((ick) (obj)).a(ihy.a(ick1));
            }
            // Misplaced declaration of an exception variable
            catch (ick ick1)
            {
                throw ick1;
            }
            // Misplaced declaration of an exception variable
            catch (ica ica1)
            {
                throw new RuntimeException((new StringBuilder("Error occurred attempting to subscribe [")).append(ick1.getMessage()).append("] and then again while trying to pass to onError.").toString(), ica1);
            }
            return ijd.b();
        }
        return ick1;
    }

    public static final ica b()
    {
        return icb.a;
    }

    private static ica b(ica ica1)
    {
        if (ica1.getClass() == igi)
        {
            return ((igi)ica1).i(igo.a());
        } else
        {
            return ica1.a(iew.a(false));
        }
    }

    private static ica b(ica ica1, ica ica2)
    {
        return a(a(ica1, ica2));
    }

    public static final ica b(Object obj)
    {
        return igi.a(obj);
    }

    public static final ica b(Throwable throwable)
    {
        return new ice(throwable);
    }

    private static ica b(TimeUnit timeunit, ici ici)
    {
        return a(new iei(timeunit, ici));
    }

    private static ica c(ica ica1)
    {
        return ica1.a(iew.a(true));
    }

    static ihy l()
    {
        return b;
    }

    private ica m()
    {
        return b(this);
    }

    public final ica a(ica ica1, idj idj)
    {
        return a(((icd) (new ifr(ica1, idj))));
    }

    public final ica a(icd icd)
    {
        return new ica(new icc(icd) {

            final icd a;
            final ica b;

            private void a(ick ick1)
            {
                Object obj;
                Throwable throwable;
                try
                {
                    ica.l();
                    obj = (ick)ihy.a(a).a(ick1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (obj instanceof icz)
                    {
                        throw (icz)obj;
                    } else
                    {
                        ick1.a(((Throwable) (obj)));
                        return;
                    }
                }
                ((ick) (obj)).d();
                b.a.call(obj);
                return;
                throwable;
                if (throwable instanceof icz)
                {
                    throw (icz)throwable;
                }
                ((ick) (obj)).a(throwable);
                return;
            }

            public final void call(Object obj)
            {
                a((ick)obj);
            }

            
            {
                b = ica.this;
                a = icd1;
                super();
            }
        });
    }

    public final ica a(icf icf1)
    {
        return (ica)icf1.a(this);
    }

    public final ica a(ici ici)
    {
        if (this instanceof igi)
        {
            return ((igi)this).c(ici);
        } else
        {
            return a(((icd) (new ifc(ici))));
        }
    }

    public final ica a(idd idd)
    {
        return a(((icd) (new ier(new icg(idd) {

            final idd a;
            final ica b;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
            }

            public final void a(Throwable throwable)
            {
            }

            
            {
                b = ica.this;
                a = idd1;
                super();
            }
        }))));
    }

    public final ica a(ide ide)
    {
        return a(((icd) (new ier(new icg(ide) {

            final ide a;
            final ica b;

            public final void a()
            {
            }

            public final void a(Object obj)
            {
            }

            public final void a(Throwable throwable)
            {
                a.call(throwable);
            }

            
            {
                b = ica.this;
                a = ide1;
                super();
            }
        }))));
    }

    public final ica a(idi idi)
    {
        return a(((icd) (new iet(idi))));
    }

    public final ica a(TimeUnit timeunit, ici ici)
    {
        return a(((icd) (new ieq(this, timeunit, ici))));
    }

    public final icl a(icg icg)
    {
        if (icg instanceof ick)
        {
            return b((ick)icg);
        } else
        {
            return b(new ick(icg) {

                final icg a;
                final ica b;

                public final void a()
                {
                    a.a();
                }

                public final void a(Object obj)
                {
                    a.a(obj);
                }

                public final void a(Throwable throwable)
                {
                    a.a(throwable);
                }

            
            {
                b = ica.this;
                a = icg1;
                super();
            }
            });
        }
    }

    public final icl a(ick ick1)
    {
        icl icl;
        try
        {
            ick1.d();
            ihy.b(a).call(ick1);
            icl = ihy.a(ick1);
        }
        catch (Throwable throwable)
        {
            icw.a(throwable);
            try
            {
                ick1.a(ihy.a(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (ick ick1)
            {
                throw ick1;
            }
            // Misplaced declaration of an exception variable
            catch (ick ick1)
            {
                throw new RuntimeException((new StringBuilder("Error occurred attempting to subscribe [")).append(throwable.getMessage()).append("] and then again while trying to pass to onError.").toString(), ick1);
            }
            return ijd.b();
        }
        return icl;
    }

    public final icl a(ide ide, ide ide1)
    {
        if (ide == null)
        {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (ide1 == null)
        {
            throw new IllegalArgumentException("onError can not be null");
        } else
        {
            return b(new ick(ide1, ide) {

                final ide a;
                final ide b;
                final ica c;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    b.call(obj);
                }

                public final void a(Throwable throwable)
                {
                    a.call(throwable);
                }

            
            {
                c = ica.this;
                a = ide1;
                b = ide2;
                super();
            }
            });
        }
    }

    public final ica b(ici ici)
    {
        if (this instanceof igi)
        {
            return ((igi)this).c(ici);
        } else
        {
            return m().a(new ifn(ici));
        }
    }

    public final ica b(idd idd)
    {
        return a(new ies(idd));
    }

    public final ica b(ide ide)
    {
        return a(new ier(new icg(ide) {

            final ide a;
            final ica b;

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                a.call(obj);
            }

            public final void a(Throwable throwable)
            {
            }

            
            {
                b = ica.this;
                a = ide1;
                super();
            }
        }));
    }

    public final ica b(idi idi)
    {
        if (getClass() == igi)
        {
            return ((igi)this).i(idi);
        } else
        {
            return b(d(idi));
        }
    }

    public final icl b(ick ick1)
    {
        return a(ick1, this);
    }

    public final ica c()
    {
        return a(iej.a());
    }

    public final ica c(idd idd)
    {
        return a(new ier(new icg(idd) {

            final idd a;
            final ica b;

            public final void a()
            {
                a.a();
            }

            public final void a(Object obj)
            {
            }

            public final void a(Throwable throwable)
            {
                a.a();
            }

            
            {
                b = ica.this;
                a = idd1;
                super();
            }
        }));
    }

    public final ica c(idi idi)
    {
        return b(d(iev.a(idi)));
    }

    public final ica c(Object obj)
    {
        return b(b(obj), this);
    }

    public final icl c(ide ide)
    {
        return b(new ick(ide) {

            final ide a;
            final ica b;

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                a.call(obj);
            }

            public final void a(Throwable throwable)
            {
                throw new icz(throwable);
            }

            
            {
                b = ica.this;
                a = ide1;
                super();
            }
        });
    }

    public final ica d()
    {
        return idr.a(this);
    }

    public final ica d(idi idi)
    {
        return a(new ieu(idi));
    }

    public final ica e()
    {
        return i().g();
    }

    public final ica e(idi idi)
    {
        return a(new iff(idi));
    }

    public final ica f(idi idi)
    {
        return a(new ifg(idi));
    }

    public final ihq f()
    {
        return ifh.a(this);
    }

    public final ica g()
    {
        return a(ifk.a());
    }

    public final ica g(idi idi)
    {
        return ief.b(this, new idi(idi) {

            final idi a;
            final ica b;

            private ica a(ica ica1)
            {
                return (ica)a.a(ica1.d(new idi(this) {

                    final _cls4 a;

                    public final volatile Object a(Object obj)
                    {
                        return null;
                    }

            
            {
                a = _pcls4;
                super();
            }
                }));
            }

            public final volatile Object a(Object obj)
            {
                return a((ica)obj);
            }

            
            {
                b = ica.this;
                a = idi1;
                super();
            }
        });
    }

    public final ica h(idi idi)
    {
        return ief.a(this, new idi(idi) {

            final idi a;
            final ica b;

            private ica a(ica ica1)
            {
                return (ica)a.a(ica1.d(new idi(this) {

                    final _cls6 a;

                    private static Throwable a(iby iby1)
                    {
                        return iby1.c();
                    }

                    public final volatile Object a(Object obj)
                    {
                        return a((iby)obj);
                    }

            
            {
                a = _pcls6;
                super();
            }
                }));
            }

            public final volatile Object a(Object obj)
            {
                return a((ica)obj);
            }

            
            {
                b = ica.this;
                a = idi1;
                super();
            }
        });
    }

    public final icl h()
    {
        return b(new ick() {

            final ica a;

            public final void a()
            {
            }

            public final void a(Object obj)
            {
            }

            public final void a(Throwable throwable)
            {
                throw new icz(throwable);
            }

            
            {
                a = ica.this;
                super();
            }
        });
    }

    public final ica i()
    {
        return a(new ifo());
    }

    public final ihp j()
    {
        return ihp.a(this);
    }

    public final ica k()
    {
        return a(ifp.a());
    }

}
