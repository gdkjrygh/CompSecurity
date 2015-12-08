// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.base:
//            Joiner, Preconditions, Predicate, Function, 
//            Objects

public final class Predicates
{
    private static class AndPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final List components;

        public boolean apply(Object obj)
        {
            for (int i = 0; i < components.size(); i++)
            {
                if (!((Predicate)components.get(i)).apply(obj))
                {
                    return false;
                }
            }

            return true;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof AndPredicate)
            {
                obj = (AndPredicate)obj;
                return components.equals(((AndPredicate) (obj)).components);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return components.hashCode() + 0x12472c2c;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Predicates.COMMA_JOINER.join(components)));
            return (new StringBuilder(s.length() + 16)).append("Predicates.and(").append(s).append(")").toString();
        }

        private AndPredicate(List list)
        {
            components = list;
        }

    }

    private static class AssignableFromPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Class clazz;

        public boolean apply(Class class1)
        {
            return clazz.isAssignableFrom(class1);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Class)obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof AssignableFromPredicate)
            {
                obj = (AssignableFromPredicate)obj;
                flag = flag1;
                if (clazz == ((AssignableFromPredicate) (obj)).clazz)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return clazz.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(clazz.getName()));
            return (new StringBuilder(s.length() + 27)).append("Predicates.assignableFrom(").append(s).append(")").toString();
        }

        private AssignableFromPredicate(Class class1)
        {
            clazz = (Class)Preconditions.checkNotNull(class1);
        }

    }

    private static class CompositionPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Function f;
        final Predicate p;

        public boolean apply(Object obj)
        {
            return p.apply(f.apply(obj));
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof CompositionPredicate)
            {
                obj = (CompositionPredicate)obj;
                flag = flag1;
                if (f.equals(((CompositionPredicate) (obj)).f))
                {
                    flag = flag1;
                    if (p.equals(((CompositionPredicate) (obj)).p))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return f.hashCode() ^ p.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(p.toString()));
            String s1 = String.valueOf(String.valueOf(f.toString()));
            return (new StringBuilder(s.length() + 2 + s1.length())).append(s).append("(").append(s1).append(")").toString();
        }

        private CompositionPredicate(Predicate predicate, Function function)
        {
            p = (Predicate)Preconditions.checkNotNull(predicate);
            f = (Function)Preconditions.checkNotNull(function);
        }

    }

    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate
    {

        private static final long serialVersionUID = 0L;

        public String toString()
        {
            String s = String.valueOf(String.valueOf(pattern.pattern()));
            return (new StringBuilder(s.length() + 28)).append("Predicates.containsPattern(").append(s).append(")").toString();
        }

        ContainsPatternFromStringPredicate(String s)
        {
            super(Pattern.compile(s));
        }
    }

    private static class ContainsPatternPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Pattern pattern;

        public boolean apply(CharSequence charsequence)
        {
            return pattern.matcher(charsequence).find();
        }

        public volatile boolean apply(Object obj)
        {
            return apply((CharSequence)obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ContainsPatternPredicate)
            {
                obj = (ContainsPatternPredicate)obj;
                flag = flag1;
                if (Objects.equal(pattern.pattern(), ((ContainsPatternPredicate) (obj)).pattern.pattern()))
                {
                    flag = flag1;
                    if (Objects.equal(Integer.valueOf(pattern.flags()), Integer.valueOf(((ContainsPatternPredicate) (obj)).pattern.flags())))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                pattern.pattern(), Integer.valueOf(pattern.flags())
            });
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Objects.toStringHelper(pattern).add("pattern", pattern.pattern()).add("pattern.flags", pattern.flags()).toString()));
            return (new StringBuilder(s.length() + 21)).append("Predicates.contains(").append(s).append(")").toString();
        }

        ContainsPatternPredicate(Pattern pattern1)
        {
            pattern = (Pattern)Preconditions.checkNotNull(pattern1);
        }
    }

    private static class InPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Collection target;

        public boolean apply(Object obj)
        {
            boolean flag;
            try
            {
                flag = target.contains(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof InPredicate)
            {
                obj = (InPredicate)obj;
                return target.equals(((InPredicate) (obj)).target);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return target.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(target));
            return (new StringBuilder(s.length() + 15)).append("Predicates.in(").append(s).append(")").toString();
        }

        private InPredicate(Collection collection)
        {
            target = (Collection)Preconditions.checkNotNull(collection);
        }

    }

    private static class InstanceOfPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Class clazz;

        public boolean apply(Object obj)
        {
            return clazz.isInstance(obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof InstanceOfPredicate)
            {
                obj = (InstanceOfPredicate)obj;
                flag = flag1;
                if (clazz == ((InstanceOfPredicate) (obj)).clazz)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return clazz.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(clazz.getName()));
            return (new StringBuilder(s.length() + 23)).append("Predicates.instanceOf(").append(s).append(")").toString();
        }

        private InstanceOfPredicate(Class class1)
        {
            clazz = (Class)Preconditions.checkNotNull(class1);
        }

    }

    private static class IsEqualToPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object target;

        public boolean apply(Object obj)
        {
            return target.equals(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof IsEqualToPredicate)
            {
                obj = (IsEqualToPredicate)obj;
                return target.equals(((IsEqualToPredicate) (obj)).target);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return target.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(target));
            return (new StringBuilder(s.length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
        }

        private IsEqualToPredicate(Object obj)
        {
            target = obj;
        }

    }

    private static class NotPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        final Predicate predicate;

        public boolean apply(Object obj)
        {
            return !predicate.apply(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof NotPredicate)
            {
                obj = (NotPredicate)obj;
                return predicate.equals(((NotPredicate) (obj)).predicate);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return ~predicate.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(predicate.toString()));
            return (new StringBuilder(s.length() + 16)).append("Predicates.not(").append(s).append(")").toString();
        }

        NotPredicate(Predicate predicate1)
        {
            predicate = (Predicate)Preconditions.checkNotNull(predicate1);
        }
    }

    static abstract class ObjectPredicate extends Enum
        implements Predicate
    {

        private static final ObjectPredicate $VALUES[];
        public static final ObjectPredicate ALWAYS_FALSE;
        public static final ObjectPredicate ALWAYS_TRUE;
        public static final ObjectPredicate IS_NULL;
        public static final ObjectPredicate NOT_NULL;

        public static ObjectPredicate valueOf(String s)
        {
            return (ObjectPredicate)Enum.valueOf(com/google/common/base/Predicates$ObjectPredicate, s);
        }

        public static ObjectPredicate[] values()
        {
            return (ObjectPredicate[])$VALUES.clone();
        }

        Predicate withNarrowedType()
        {
            return this;
        }

        static 
        {
            ALWAYS_TRUE = new ObjectPredicate("ALWAYS_TRUE", 0) {

                public boolean apply(Object obj)
                {
                    return true;
                }

                public String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

            };
            ALWAYS_FALSE = new ObjectPredicate("ALWAYS_FALSE", 1) {

                public boolean apply(Object obj)
                {
                    return false;
                }

                public String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

            };
            IS_NULL = new ObjectPredicate("IS_NULL", 2) {

                public boolean apply(Object obj)
                {
                    return obj == null;
                }

                public String toString()
                {
                    return "Predicates.isNull()";
                }

            };
            NOT_NULL = new ObjectPredicate("NOT_NULL", 3) {

                public boolean apply(Object obj)
                {
                    return obj != null;
                }

                public String toString()
                {
                    return "Predicates.notNull()";
                }

            };
            $VALUES = (new ObjectPredicate[] {
                ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL
            });
        }

        private ObjectPredicate(String s, int i)
        {
            super(s, i);
        }

    }

    private static class OrPredicate
        implements Predicate, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final List components;

        public boolean apply(Object obj)
        {
            for (int i = 0; i < components.size(); i++)
            {
                if (((Predicate)components.get(i)).apply(obj))
                {
                    return true;
                }
            }

            return false;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof OrPredicate)
            {
                obj = (OrPredicate)obj;
                return components.equals(((OrPredicate) (obj)).components);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return components.hashCode() + 0x53c91cf;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Predicates.COMMA_JOINER.join(components)));
            return (new StringBuilder(s.length() + 15)).append("Predicates.or(").append(s).append(")").toString();
        }

        private OrPredicate(List list)
        {
            components = list;
        }

    }


    private static final Joiner COMMA_JOINER = Joiner.on(',');

    private Predicates()
    {
    }

    public static Predicate alwaysFalse()
    {
        return ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    public static Predicate alwaysTrue()
    {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static Predicate and(Predicate predicate, Predicate predicate1)
    {
        return new AndPredicate(asList((Predicate)Preconditions.checkNotNull(predicate), (Predicate)Preconditions.checkNotNull(predicate1)));
    }

    public static Predicate and(Iterable iterable)
    {
        return new AndPredicate(defensiveCopy(iterable));
    }

    public static transient Predicate and(Predicate apredicate[])
    {
        return new AndPredicate(defensiveCopy(apredicate));
    }

    private static List asList(Predicate predicate, Predicate predicate1)
    {
        return Arrays.asList(new Predicate[] {
            predicate, predicate1
        });
    }

    public static Predicate assignableFrom(Class class1)
    {
        return new AssignableFromPredicate(class1);
    }

    public static Predicate compose(Predicate predicate, Function function)
    {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate contains(Pattern pattern)
    {
        return new ContainsPatternPredicate(pattern);
    }

    public static Predicate containsPattern(String s)
    {
        return new ContainsPatternFromStringPredicate(s);
    }

    static List defensiveCopy(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(Preconditions.checkNotNull(iterable.next()))) { }
        return arraylist;
    }

    private static transient List defensiveCopy(Object aobj[])
    {
        return defensiveCopy(((Iterable) (Arrays.asList(aobj))));
    }

    public static Predicate equalTo(Object obj)
    {
        if (obj == null)
        {
            return isNull();
        } else
        {
            return new IsEqualToPredicate(obj);
        }
    }

    public static Predicate in(Collection collection)
    {
        return new InPredicate(collection);
    }

    public static Predicate instanceOf(Class class1)
    {
        return new InstanceOfPredicate(class1);
    }

    public static Predicate isNull()
    {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static Predicate not(Predicate predicate)
    {
        return new NotPredicate(predicate);
    }

    public static Predicate notNull()
    {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static Predicate or(Predicate predicate, Predicate predicate1)
    {
        return new OrPredicate(asList((Predicate)Preconditions.checkNotNull(predicate), (Predicate)Preconditions.checkNotNull(predicate1)));
    }

    public static Predicate or(Iterable iterable)
    {
        return new OrPredicate(defensiveCopy(iterable));
    }

    public static transient Predicate or(Predicate apredicate[])
    {
        return new OrPredicate(defensiveCopy(apredicate));
    }


}
