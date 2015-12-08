// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StablePriorityQueue extends AbstractCollection
    implements Queue
{
    public static interface PrioritizedElement
    {

        public abstract int getPriority();
    }

    private class StablePriorityQueueIterator
        implements Iterator
    {

        private Iterator currIterator;
        private int currPriority;
        final StablePriorityQueue this$0;

        public boolean hasNext()
        {
            if (currIterator == null)
            {
                return false;
            }
            if (currIterator.hasNext())
            {
                return true;
            }
            for (currPriority = currPriority + 1; currPriority < mNumberOfPriorities; currPriority = currPriority + 1)
            {
                if (mQueues[currPriority] == null)
                {
                    continue;
                }
                currIterator = mQueues[currPriority].iterator();
                if (currIterator.hasNext())
                {
                    return true;
                }
            }

            currIterator = null;
            return false;
        }

        public PrioritizedElement next()
        {
            if (hasNext())
            {
                return (PrioritizedElement)currIterator.next();
            } else
            {
                throw new NoSuchElementException();
            }
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            if (currIterator != null)
            {
                currIterator.remove();
                return;
            } else
            {
                throw new IllegalStateException();
            }
        }

        public StablePriorityQueueIterator()
        {
            this$0 = StablePriorityQueue.this;
            super();
            currPriority = 0;
            currIterator = null;
            do
            {
label0:
                {
                    if (currPriority < mNumberOfPriorities)
                    {
                        if (mQueues[currPriority] == null)
                        {
                            break label0;
                        }
                        currIterator = mQueues[currPriority].iterator();
                    }
                    return;
                }
                currPriority = currPriority + 1;
            } while (true);
        }
    }


    private final int mNumberOfPriorities;
    private final Queue mQueues[];

    public StablePriorityQueue(int i)
    {
        if (i < 2)
        {
            throw new IllegalArgumentException("Must have at least two priorities levels");
        } else
        {
            mNumberOfPriorities = i;
            mQueues = new Queue[mNumberOfPriorities];
            return;
        }
    }

    public boolean add(PrioritizedElement prioritizedelement)
    {
        if (prioritizedelement == null)
        {
            throw new NullPointerException("Cannot add null elements");
        }
        int i = prioritizedelement.getPriority();
        if (i < 0 || i >= mNumberOfPriorities)
        {
            throw new IllegalArgumentException("Element has invalid priority for the container");
        }
        if (mQueues[i] == null)
        {
            mQueues[i] = new LinkedList();
        }
        return mQueues[i].add(prioritizedelement);
    }

    public volatile boolean add(Object obj)
    {
        return add((PrioritizedElement)obj);
    }

    public PrioritizedElement element()
    {
        PrioritizedElement prioritizedelement = peek();
        if (prioritizedelement == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return prioritizedelement;
        }
    }

    public volatile Object element()
    {
        return element();
    }

    public Iterator iterator()
    {
        return new StablePriorityQueueIterator();
    }

    public boolean offer(PrioritizedElement prioritizedelement)
    {
        return add(prioritizedelement);
    }

    public volatile boolean offer(Object obj)
    {
        return offer((PrioritizedElement)obj);
    }

    public PrioritizedElement peek()
    {
        Queue aqueue[] = mQueues;
        int j = aqueue.length;
        for (int i = 0; i < j; i++)
        {
            Queue queue = aqueue[i];
            if (queue != null && !queue.isEmpty())
            {
                return (PrioritizedElement)queue.peek();
            }
        }

        return null;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public PrioritizedElement poll()
    {
        Queue aqueue[] = mQueues;
        int j = aqueue.length;
        for (int i = 0; i < j; i++)
        {
            Queue queue = aqueue[i];
            if (queue != null && !queue.isEmpty())
            {
                return (PrioritizedElement)queue.poll();
            }
        }

        return null;
    }

    public volatile Object poll()
    {
        return poll();
    }

    public PrioritizedElement remove()
    {
        PrioritizedElement prioritizedelement = poll();
        if (prioritizedelement == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return prioritizedelement;
        }
    }

    public volatile Object remove()
    {
        return remove();
    }

    public int size()
    {
        int j = 0;
        Queue aqueue[] = mQueues;
        int l = aqueue.length;
        for (int i = 0; i < l;)
        {
            Queue queue = aqueue[i];
            int k = j;
            if (queue != null)
            {
                k = j + queue.size();
            }
            i++;
            j = k;
        }

        return j;
    }


}
