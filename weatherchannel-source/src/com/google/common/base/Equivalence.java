// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            FunctionalEquivalence, PairwiseEquivalence, Predicate, Function, 
//            Preconditions, Objects

public abstract class Equivalence
{
    static final class Equals extends Equivalence
        implements Serializable
    {

        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected boolean doEquivalent(Object obj, Object obj1)
        {
            return obj.equals(obj1);
        }

        protected int doHash(Object obj)
        {
            return obj.hashCode();
        }


        Equals()
        {
        }
    }

    private static final class EquivalentToPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Equivalence equivalence;
        private final Object target;

        public boolean apply(Object obj)
        {
            return equivalence.equivalent(obj, target);
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof EquivalentToPredicate)
                {
                    if (!equivalence.equals(((EquivalentToPredicate) (obj = (EquivalentToPredicate)obj)).equivalence) || !Objects.equal(target, ((EquivalentToPredicate) (obj)).target))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                equivalence, target
            });
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(equivalence));
            String s1 = String.valueOf(String.valueOf(target));
            return (new StringBuilder(s.length() + 15 + s1.length())).append(s).append(".equivalentTo(").append(s1).append(")").toString();
        }

        EquivalentToPredicate(Equivalence equivalence1, Object obj)
        {
            equivalence = (Equivalence)Preconditions.checkNotNull(equivalence1);
            target = obj;
        }
    }

    static final class Identity extends Equivalence
        implements Serializable
    {

        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected boolean doEquivalent(Object obj, Object obj1)
        {
            return false;
        }

        protected int doHash(Object obj)
        {
            return System.identityHashCode(obj);
        }


        Identity()
        {
        }
    }

    public static final class Wrapper
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Equivalence equivalence;
        private final Object reference;

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof Wrapper)
            {
                obj = (Wrapper)obj;
                if (equivalence.equals(((Wrapper) (obj)).equivalence))
                {
                    return equivalence.equivalent(reference, ((Wrapper) (obj)).reference);
                }
            }
            return false;
        }

        public Object get()
        {
            return reference;
        }

        public int hashCode()
        {
            return equivalence.hash(reference);
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(equivalence));
            String s1 = String.valueOf(String.valueOf(reference));
            return (new StringBuilder(s.length() + 7 + s1.length())).append(s).append(".wrap(").append(s1).append(")").toString();
        }

        private Wrapper(Equivalence equivalence1, Object obj)
        {
            equivalence = (Equivalence)Preconditions.checkNotNull(equivalence1);
            reference = obj;
        }

    }


    protected Equivalence()
    {
    }

    public static Equivalence equals()
    {
        return Equals.INSTANCE;
    }

    public static Equivalence identity()
    {
        return Identity.INSTANCE;
    }

    protected abstract boolean doEquivalent(Object obj, Object obj1);

    protected abstract int doHash(Object obj);

    public final boolean equivalent(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return doEquivalent(obj, obj1);
        }
    }

    public final Predicate equivalentTo(Object obj)
    {
        return new EquivalentToPredicate(this, obj);
    }

    public final int hash(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return doHash(obj);
        }
    }

    public final Equivalence onResultOf(Function function)
    {
        return new FunctionalEquivalence(function, this);
    }

    public final Equivalence pairwise()
    {
        return new PairwiseEquivalence(this);
    }

    public final Wrapper wrap(Object obj)
    {
        return new Wrapper(this, obj);
    }
}
