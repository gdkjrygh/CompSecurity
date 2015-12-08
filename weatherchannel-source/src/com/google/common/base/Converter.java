// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Function, Preconditions

public abstract class Converter
    implements Function
{
    private static final class ConverterComposition extends Converter
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Converter first;
        final Converter second;

        Object correctedDoBackward(Object obj)
        {
            return first.correctedDoBackward(second.correctedDoBackward(obj));
        }

        Object correctedDoForward(Object obj)
        {
            return second.correctedDoForward(first.correctedDoForward(obj));
        }

        protected Object doBackward(Object obj)
        {
            throw new AssertionError();
        }

        protected Object doForward(Object obj)
        {
            throw new AssertionError();
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ConverterComposition)
            {
                obj = (ConverterComposition)obj;
                flag = flag1;
                if (first.equals(((ConverterComposition) (obj)).first))
                {
                    flag = flag1;
                    if (second.equals(((ConverterComposition) (obj)).second))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return first.hashCode() * 31 + second.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(first));
            String s1 = String.valueOf(String.valueOf(second));
            return (new StringBuilder(s.length() + 10 + s1.length())).append(s).append(".andThen(").append(s1).append(")").toString();
        }

        ConverterComposition(Converter converter, Converter converter1)
        {
            first = converter;
            second = converter1;
        }
    }

    private static final class FunctionBasedConverter extends Converter
        implements Serializable
    {

        private final Function backwardFunction;
        private final Function forwardFunction;

        protected Object doBackward(Object obj)
        {
            return backwardFunction.apply(obj);
        }

        protected Object doForward(Object obj)
        {
            return forwardFunction.apply(obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof FunctionBasedConverter)
            {
                obj = (FunctionBasedConverter)obj;
                flag = flag1;
                if (forwardFunction.equals(((FunctionBasedConverter) (obj)).forwardFunction))
                {
                    flag = flag1;
                    if (backwardFunction.equals(((FunctionBasedConverter) (obj)).backwardFunction))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return forwardFunction.hashCode() * 31 + backwardFunction.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(forwardFunction));
            String s1 = String.valueOf(String.valueOf(backwardFunction));
            return (new StringBuilder(s.length() + 18 + s1.length())).append("Converter.from(").append(s).append(", ").append(s1).append(")").toString();
        }

        private FunctionBasedConverter(Function function, Function function1)
        {
            forwardFunction = (Function)Preconditions.checkNotNull(function);
            backwardFunction = (Function)Preconditions.checkNotNull(function1);
        }

    }

    private static final class IdentityConverter extends Converter
        implements Serializable
    {

        static final IdentityConverter INSTANCE = new IdentityConverter();
        private static final long serialVersionUID = 0L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        Converter doAndThen(Converter converter)
        {
            return (Converter)Preconditions.checkNotNull(converter, "otherConverter");
        }

        protected Object doBackward(Object obj)
        {
            return obj;
        }

        protected Object doForward(Object obj)
        {
            return obj;
        }

        public IdentityConverter reverse()
        {
            return this;
        }

        public volatile Converter reverse()
        {
            return reverse();
        }

        public String toString()
        {
            return "Converter.identity()";
        }


        private IdentityConverter()
        {
        }
    }

    private static final class ReverseConverter extends Converter
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Converter original;

        Object correctedDoBackward(Object obj)
        {
            return original.correctedDoForward(obj);
        }

        Object correctedDoForward(Object obj)
        {
            return original.correctedDoBackward(obj);
        }

        protected Object doBackward(Object obj)
        {
            throw new AssertionError();
        }

        protected Object doForward(Object obj)
        {
            throw new AssertionError();
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof ReverseConverter)
            {
                obj = (ReverseConverter)obj;
                return original.equals(((ReverseConverter) (obj)).original);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return ~original.hashCode();
        }

        public Converter reverse()
        {
            return original;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(original));
            return (new StringBuilder(s.length() + 10)).append(s).append(".reverse()").toString();
        }

        ReverseConverter(Converter converter)
        {
            original = converter;
        }
    }


    private final boolean handleNullAutomatically;
    private transient Converter reverse;

    protected Converter()
    {
        this(true);
    }

    Converter(boolean flag)
    {
        handleNullAutomatically = flag;
    }

    public static Converter from(Function function, Function function1)
    {
        return new FunctionBasedConverter(function, function1);
    }

    public static Converter identity()
    {
        return IdentityConverter.INSTANCE;
    }

    public final Converter andThen(Converter converter)
    {
        return doAndThen(converter);
    }

    public final Object apply(Object obj)
    {
        return convert(obj);
    }

    public final Object convert(Object obj)
    {
        return correctedDoForward(obj);
    }

    public Iterable convertAll(final Iterable fromIterable)
    {
        Preconditions.checkNotNull(fromIterable, "fromIterable");
        return new Iterable() {

            final Converter this$0;
            final Iterable val$fromIterable;

            public Iterator iterator()
            {
                return new Iterator() {

                    private final Iterator fromIterator;
                    final _cls1 this$1;

                    public boolean hasNext()
                    {
                        return fromIterator.hasNext();
                    }

                    public Object next()
                    {
                        return convert(fromIterator.next());
                    }

                    public void remove()
                    {
                        fromIterator.remove();
                    }

            
            {
                this$1 = _cls1.this;
                super();
                fromIterator = fromIterable.iterator();
            }
                };
            }

            
            {
                this$0 = Converter.this;
                fromIterable = iterable;
                super();
            }
        };
    }

    Object correctedDoBackward(Object obj)
    {
        if (handleNullAutomatically)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return Preconditions.checkNotNull(doBackward(obj));
            }
        } else
        {
            return doBackward(obj);
        }
    }

    Object correctedDoForward(Object obj)
    {
        if (handleNullAutomatically)
        {
            if (obj == null)
            {
                return null;
            } else
            {
                return Preconditions.checkNotNull(doForward(obj));
            }
        } else
        {
            return doForward(obj);
        }
    }

    Converter doAndThen(Converter converter)
    {
        return new ConverterComposition(this, (Converter)Preconditions.checkNotNull(converter));
    }

    protected abstract Object doBackward(Object obj);

    protected abstract Object doForward(Object obj);

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public Converter reverse()
    {
        Converter converter = reverse;
        Object obj = converter;
        if (converter == null)
        {
            obj = new ReverseConverter(this);
            reverse = ((Converter) (obj));
        }
        return ((Converter) (obj));
    }
}
