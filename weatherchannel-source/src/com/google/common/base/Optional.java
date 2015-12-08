// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Absent, Present, Preconditions, Supplier, 
//            Function, AbstractIterator

public abstract class Optional
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    Optional()
    {
    }

    public static Optional absent()
    {
        return Absent.withType();
    }

    public static Optional fromNullable(Object obj)
    {
        if (obj == null)
        {
            return absent();
        } else
        {
            return new Present(obj);
        }
    }

    public static Optional of(Object obj)
    {
        return new Present(Preconditions.checkNotNull(obj));
    }

    public static Iterable presentInstances(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new Iterable(iterable) {

            final Iterable val$optionals;

            public Iterator iterator()
            {
                return new AbstractIterator() {

                    private final Iterator iterator;
                    final _cls1 this$0;

                    protected Object computeNext()
                    {
                        while (iterator.hasNext()) 
                        {
                            Optional optional = (Optional)iterator.next();
                            if (optional.isPresent())
                            {
                                return optional.get();
                            }
                        }
                        return endOfData();
                    }

            
            {
                this$0 = _cls1.this;
                super();
                iterator = (Iterator)Preconditions.checkNotNull(optionals.iterator());
            }
                };
            }

            
            {
                optionals = iterable;
                super();
            }
        };
    }

    public abstract Set asSet();

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional or(Optional optional);

    public abstract Object or(Supplier supplier);

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();

    public abstract Optional transform(Function function);
}
