// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterators, ImmutableList, Lists, 
//            Multiset, ObjectArrays, ImmutableCollection, AbstractIterator, 
//            FluentIterable, CollectPreconditions, TransformedIterator

public final class Iterables
{
    private static class ConsumingQueueIterator extends AbstractIterator
    {

        private final Queue queue;

        public Object computeNext()
        {
            Object obj;
            try
            {
                obj = queue.remove();
            }
            catch (NoSuchElementException nosuchelementexception)
            {
                return endOfData();
            }
            return obj;
        }

        private ConsumingQueueIterator(Queue queue1)
        {
            queue = queue1;
        }

    }

    private static final class UnmodifiableIterable extends FluentIterable
    {

        private final Iterable iterable;

        public Iterator iterator()
        {
            return Iterators.unmodifiableIterator(iterable.iterator());
        }

        public String toString()
        {
            return iterable.toString();
        }

        private UnmodifiableIterable(Iterable iterable1)
        {
            iterable = iterable1;
        }

    }


    private Iterables()
    {
    }

    public static boolean addAll(Collection collection, Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return collection.addAll(Collections2.cast(iterable));
        } else
        {
            return Iterators.addAll(collection, ((Iterable)Preconditions.checkNotNull(iterable)).iterator());
        }
    }

    public static boolean all(Iterable iterable, Predicate predicate)
    {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static boolean any(Iterable iterable, Predicate predicate)
    {
        return Iterators.any(iterable.iterator(), predicate);
    }

    public static Iterable concat(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable(iterable) {

            final Iterable val$inputs;

            public Iterator iterator()
            {
                return Iterators.concat(Iterables.iterators(inputs));
            }

            
            {
                inputs = iterable;
                super();
            }
        };
    }

    public static Iterable concat(Iterable iterable, Iterable iterable1)
    {
        return concat(((Iterable) (ImmutableList.of(iterable, iterable1))));
    }

    public static Iterable concat(Iterable iterable, Iterable iterable1, Iterable iterable2)
    {
        return concat(((Iterable) (ImmutableList.of(iterable, iterable1, iterable2))));
    }

    public static Iterable concat(Iterable iterable, Iterable iterable1, Iterable iterable2, Iterable iterable3)
    {
        return concat(((Iterable) (ImmutableList.of(iterable, iterable1, iterable2, iterable3))));
    }

    public static transient Iterable concat(Iterable aiterable[])
    {
        return concat(((Iterable) (ImmutableList.copyOf(aiterable))));
    }

    public static Iterable consumingIterable(Iterable iterable)
    {
        if (iterable instanceof Queue)
        {
            return new FluentIterable(iterable) {

                final Iterable val$iterable;

                public Iterator iterator()
                {
                    return new ConsumingQueueIterator((Queue)iterable);
                }

                public String toString()
                {
                    return "Iterables.consumingIterable(...)";
                }

            
            {
                iterable = iterable1;
                super();
            }
            };
        } else
        {
            Preconditions.checkNotNull(iterable);
            return new FluentIterable(iterable) {

                final Iterable val$iterable;

                public Iterator iterator()
                {
                    return Iterators.consumingIterator(iterable.iterator());
                }

                public String toString()
                {
                    return "Iterables.consumingIterable(...)";
                }

            
            {
                iterable = iterable1;
                super();
            }
            };
        }
    }

    public static boolean contains(Iterable iterable, Object obj)
    {
        if (iterable instanceof Collection)
        {
            return Collections2.safeContains((Collection)iterable, obj);
        } else
        {
            return Iterators.contains(iterable.iterator(), obj);
        }
    }

    public static Iterable cycle(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable(iterable) {

            final Iterable val$iterable;

            public Iterator iterator()
            {
                return Iterators.cycle(iterable);
            }

            public String toString()
            {
                return String.valueOf(iterable.toString()).concat(" (cycled)");
            }

            
            {
                iterable = iterable1;
                super();
            }
        };
    }

    public static transient Iterable cycle(Object aobj[])
    {
        return cycle(((Iterable) (Lists.newArrayList(aobj))));
    }

    public static boolean elementsEqual(Iterable iterable, Iterable iterable1)
    {
        if ((iterable instanceof Collection) && (iterable1 instanceof Collection))
        {
            Collection collection = (Collection)iterable;
            Collection collection1 = (Collection)iterable1;
            if (collection.size() != collection1.size())
            {
                return false;
            }
        }
        return Iterators.elementsEqual(iterable.iterator(), iterable1.iterator());
    }

    public static Iterable filter(Iterable iterable, Predicate predicate)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new FluentIterable(iterable, predicate) {

            final Predicate val$predicate;
            final Iterable val$unfiltered;

            public Iterator iterator()
            {
                return Iterators.filter(unfiltered.iterator(), predicate);
            }

            
            {
                unfiltered = iterable;
                predicate = predicate1;
                super();
            }
        };
    }

    public static Iterable filter(Iterable iterable, Class class1)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(class1);
        return new FluentIterable(iterable, class1) {

            final Class val$type;
            final Iterable val$unfiltered;

            public Iterator iterator()
            {
                return Iterators.filter(unfiltered.iterator(), type);
            }

            
            {
                unfiltered = iterable;
                type = class1;
                super();
            }
        };
    }

    public static Object find(Iterable iterable, Predicate predicate)
    {
        return Iterators.find(iterable.iterator(), predicate);
    }

    public static Object find(Iterable iterable, Predicate predicate, Object obj)
    {
        return Iterators.find(iterable.iterator(), predicate, obj);
    }

    public static int frequency(Iterable iterable, Object obj)
    {
        if (iterable instanceof Multiset)
        {
            return ((Multiset)iterable).count(obj);
        }
        if (iterable instanceof Set)
        {
            return !((Set)iterable).contains(obj) ? 0 : 1;
        } else
        {
            return Iterators.frequency(iterable.iterator(), obj);
        }
    }

    public static Object get(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List)
        {
            return ((List)iterable).get(i);
        } else
        {
            return Iterators.get(iterable.iterator(), i);
        }
    }

    public static Object get(Iterable iterable, int i, Object obj)
    {
        Preconditions.checkNotNull(iterable);
        Iterators.checkNonnegative(i);
        if (iterable instanceof List)
        {
            iterable = Lists.cast(iterable);
            if (i < iterable.size())
            {
                obj = iterable.get(i);
            }
            return obj;
        } else
        {
            iterable = iterable.iterator();
            Iterators.advance(iterable, i);
            return Iterators.getNext(iterable, obj);
        }
    }

    public static Object getFirst(Iterable iterable, Object obj)
    {
        return Iterators.getNext(iterable.iterator(), obj);
    }

    public static Object getLast(Iterable iterable)
    {
        if (iterable instanceof List)
        {
            iterable = (List)iterable;
            if (iterable.isEmpty())
            {
                throw new NoSuchElementException();
            } else
            {
                return getLastInNonemptyList(iterable);
            }
        } else
        {
            return Iterators.getLast(iterable.iterator());
        }
    }

    public static Object getLast(Iterable iterable, Object obj)
    {
        if (iterable instanceof Collection)
        {
            if (Collections2.cast(iterable).isEmpty())
            {
                return obj;
            }
            if (iterable instanceof List)
            {
                return getLastInNonemptyList(Lists.cast(iterable));
            }
        }
        return Iterators.getLast(iterable.iterator(), obj);
    }

    private static Object getLastInNonemptyList(List list)
    {
        return list.get(list.size() - 1);
    }

    public static Object getOnlyElement(Iterable iterable)
    {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static Object getOnlyElement(Iterable iterable, Object obj)
    {
        return Iterators.getOnlyElement(iterable.iterator(), obj);
    }

    public static int indexOf(Iterable iterable, Predicate predicate)
    {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    private static Iterator iterators(Iterable iterable)
    {
        return new TransformedIterator(iterable.iterator()) {

            volatile Object transform(Object obj)
            {
                return transform((Iterable)obj);
            }

            Iterator transform(Iterable iterable1)
            {
                return iterable1.iterator();
            }

        };
    }

    public static Iterable limit(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "limit is negative");
        return new FluentIterable(iterable, i) {

            final Iterable val$iterable;
            final int val$limitSize;

            public Iterator iterator()
            {
                return Iterators.limit(iterable.iterator(), limitSize);
            }

            
            {
                iterable = iterable1;
                limitSize = i;
                super();
            }
        };
    }

    public static Iterable mergeSorted(Iterable iterable, Comparator comparator)
    {
        Preconditions.checkNotNull(iterable, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new UnmodifiableIterable(new FluentIterable(iterable, comparator) {

            final Comparator val$comparator;
            final Iterable val$iterables;

            public Iterator iterator()
            {
                return Iterators.mergeSorted(Iterables.transform(iterables, Iterables.toIterator()), comparator);
            }

            
            {
                iterables = iterable;
                comparator = comparator1;
                super();
            }
        });
    }

    public static Iterable paddedPartition(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new FluentIterable(iterable, i) {

            final Iterable val$iterable;
            final int val$size;

            public Iterator iterator()
            {
                return Iterators.paddedPartition(iterable.iterator(), size);
            }

            
            {
                iterable = iterable1;
                size = i;
                super();
            }
        };
    }

    public static Iterable partition(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new FluentIterable(iterable, i) {

            final Iterable val$iterable;
            final int val$size;

            public Iterator iterator()
            {
                return Iterators.partition(iterable.iterator(), size);
            }

            
            {
                iterable = iterable1;
                size = i;
                super();
            }
        };
    }

    public static boolean removeAll(Iterable iterable, Collection collection)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).removeAll((Collection)Preconditions.checkNotNull(collection));
        } else
        {
            return Iterators.removeAll(iterable.iterator(), collection);
        }
    }

    static Object removeFirstMatching(Iterable iterable, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            Object obj = iterable.next();
            if (predicate.apply(obj))
            {
                iterable.remove();
                return obj;
            }
        }

        return null;
    }

    public static boolean removeIf(Iterable iterable, Predicate predicate)
    {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List))
        {
            return removeIfFromRandomAccessList((List)iterable, (Predicate)Preconditions.checkNotNull(predicate));
        } else
        {
            return Iterators.removeIf(iterable.iterator(), predicate);
        }
    }

    private static boolean removeIfFromRandomAccessList(List list, Predicate predicate)
    {
        int i;
        int j;
        i = 0;
        j = 0;
_L2:
        Object obj;
        int k;
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = list.get(i);
        k = j;
        if (predicate.apply(obj))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (i <= j)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        list.set(j, obj);
        k = j + 1;
        i++;
        j = k;
        if (true) goto _L2; else goto _L1
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        slowRemoveIfForRemainingElements(list, predicate, j, i);
_L4:
        return true;
_L1:
        list.subList(j, list.size()).clear();
        if (i == j)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean retainAll(Iterable iterable, Collection collection)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).retainAll((Collection)Preconditions.checkNotNull(collection));
        } else
        {
            return Iterators.retainAll(iterable.iterator(), collection);
        }
    }

    public static int size(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).size();
        } else
        {
            return Iterators.size(iterable.iterator());
        }
    }

    public static Iterable skip(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "number to skip cannot be negative");
        if (iterable instanceof List)
        {
            return new FluentIterable((List)iterable, i) {

                final List val$list;
                final int val$numberToSkip;

                public Iterator iterator()
                {
                    int j = Math.min(list.size(), numberToSkip);
                    return list.subList(j, list.size()).iterator();
                }

            
            {
                list = list1;
                numberToSkip = i;
                super();
            }
            };
        } else
        {
            return new FluentIterable(iterable, i) {

                final Iterable val$iterable;
                final int val$numberToSkip;

                public Iterator iterator()
                {
                    Iterator iterator1 = iterable.iterator();
                    Iterators.advance(iterator1, numberToSkip);
                    return iterator1. new Iterator() {

                        boolean atStart;
                        final _cls10 this$0;
                        final Iterator val$iterator;

                        public boolean hasNext()
                        {
                            return iterator.hasNext();
                        }

                        public Object next()
                        {
                            Object obj = iterator.next();
                            atStart = false;
                            return obj;
                        }

                        public void remove()
                        {
                            boolean flag;
                            if (!atStart)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            CollectPreconditions.checkRemove(flag);
                            iterator.remove();
                        }

            
            {
                this$0 = final__pcls10;
                iterator = Iterator.this;
                super();
                atStart = true;
            }
                    };
                }

            
            {
                iterable = iterable1;
                numberToSkip = i;
                super();
            }
            };
        }
    }

    private static void slowRemoveIfForRemainingElements(List list, Predicate predicate, int i, int j)
    {
        for (int k = list.size() - 1; k > j; k--)
        {
            if (predicate.apply(list.get(k)))
            {
                list.remove(k);
            }
        }

        for (j--; j >= i; j--)
        {
            list.remove(j);
        }

    }

    static Object[] toArray(Iterable iterable)
    {
        return toCollection(iterable).toArray();
    }

    public static Object[] toArray(Iterable iterable, Class class1)
    {
        iterable = toCollection(iterable);
        return iterable.toArray(ObjectArrays.newArray(class1, iterable.size()));
    }

    private static Collection toCollection(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return (Collection)iterable;
        } else
        {
            return Lists.newArrayList(iterable.iterator());
        }
    }

    private static Function toIterator()
    {
        return new Function() {

            public volatile Object apply(Object obj)
            {
                return apply((Iterable)obj);
            }

            public Iterator apply(Iterable iterable)
            {
                return iterable.iterator();
            }

        };
    }

    public static String toString(Iterable iterable)
    {
        return Iterators.toString(iterable.iterator());
    }

    public static Iterable transform(Iterable iterable, Function function)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable(iterable, function) {

            final Iterable val$fromIterable;
            final Function val$function;

            public Iterator iterator()
            {
                return Iterators.transform(fromIterable.iterator(), function);
            }

            
            {
                fromIterable = iterable;
                function = function1;
                super();
            }
        };
    }

    public static Optional tryFind(Iterable iterable, Predicate predicate)
    {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    public static Iterable unmodifiableIterable(ImmutableCollection immutablecollection)
    {
        return (Iterable)Preconditions.checkNotNull(immutablecollection);
    }

    public static Iterable unmodifiableIterable(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if ((iterable instanceof UnmodifiableIterable) || (iterable instanceof ImmutableCollection))
        {
            return iterable;
        } else
        {
            return new UnmodifiableIterable(iterable);
        }
    }


}
