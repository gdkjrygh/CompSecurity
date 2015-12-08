// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedBlockingQueue extends AbstractQueue
    implements Serializable, BlockingQueue
{
    private abstract class AbstractItr
        implements Iterator
    {

        private Node lastRet;
        Node next;
        Object nextItem;
        final LinkedBlockingQueue this$0;

        abstract void advance();

        public boolean hasNext()
        {
            return next != null;
        }

        public Object next()
        {
            if (next == null)
            {
                throw new NoSuchElementException();
            } else
            {
                lastRet = next;
                Object obj = nextItem;
                advance();
                return obj;
            }
        }

        public void remove()
        {
            Node node = lastRet;
            if (node == null)
            {
                throw new IllegalStateException();
            } else
            {
                lastRet = null;
                removeNode(node);
                return;
            }
        }

        AbstractItr()
        {
            this$0 = LinkedBlockingQueue.this;
            super();
            advance();
        }
    }

    private class DescendingItr extends AbstractItr
    {

        final LinkedBlockingQueue this$0;

        void advance()
        {
            ReentrantLock reentrantlock;
            reentrantlock = lock;
            reentrantlock.lock();
            if (next != null) goto _L2; else goto _L1
_L1:
            Object obj = last;
_L5:
            next = ((Node) (obj));
            if (next != null) goto _L4; else goto _L3
_L3:
            obj = null;
_L6:
            nextItem = obj;
            reentrantlock.unlock();
            return;
_L2:
            obj = next.prev;
              goto _L5
_L4:
            obj = next.item;
              goto _L6
            Exception exception;
            exception;
            reentrantlock.unlock();
            throw exception;
              goto _L5
        }

        private DescendingItr()
        {
            this$0 = LinkedBlockingQueue.this;
            super();
        }

    }

    private class Itr extends AbstractItr
    {

        final LinkedBlockingQueue this$0;

        void advance()
        {
            ReentrantLock reentrantlock;
            reentrantlock = lock;
            reentrantlock.lock();
            if (next != null) goto _L2; else goto _L1
_L1:
            Object obj = first;
_L5:
            next = ((Node) (obj));
            if (next != null) goto _L4; else goto _L3
_L3:
            obj = null;
_L6:
            nextItem = obj;
            reentrantlock.unlock();
            return;
_L2:
            obj = next.next;
              goto _L5
_L4:
            obj = next.item;
              goto _L6
            Exception exception;
            exception;
            reentrantlock.unlock();
            throw exception;
              goto _L5
        }

        private Itr()
        {
            this$0 = LinkedBlockingQueue.this;
            super();
        }

    }

    static final class Node
    {

        Object item;
        Node next;
        Node prev;

        Node(Object obj, Node node, Node node1)
        {
            item = obj;
            prev = node;
            next = node1;
        }
    }


    private static final long serialVersionUID = 0xfa9ddc6ce257fe26L;
    private final int capacity;
    private transient int count;
    private transient Node first;
    private transient Node last;
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;

    public LinkedBlockingQueue()
    {
        this(0x7fffffff);
    }

    public LinkedBlockingQueue(int i)
    {
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
        if (i <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            capacity = i;
            return;
        }
    }

    public LinkedBlockingQueue(Collection collection)
    {
        this(0x7fffffff);
        for (collection = collection.iterator(); collection.hasNext(); add(collection.next())) { }
    }

    private boolean linkFirst(Object obj)
    {
        if (count >= capacity)
        {
            return false;
        }
        count = count + 1;
        Node node = first;
        obj = new Node(obj, null, node);
        first = ((Node) (obj));
        if (last == null)
        {
            last = ((Node) (obj));
        } else
        {
            node.prev = ((Node) (obj));
        }
        notEmpty.signal();
        return true;
    }

    private boolean linkLast(Object obj)
    {
        if (count >= capacity)
        {
            return false;
        }
        count = count + 1;
        Node node = last;
        obj = new Node(obj, node, null);
        last = ((Node) (obj));
        if (first == null)
        {
            first = ((Node) (obj));
        } else
        {
            node.next = ((Node) (obj));
        }
        notEmpty.signal();
        return true;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        count = 0;
        first = null;
        last = null;
        do
        {
            Object obj = objectinputstream.readObject();
            if (obj == null)
            {
                return;
            }
            add(obj);
        } while (true);
    }

    private void unlink(Node node)
    {
        Node node1 = node.prev;
        node = node.next;
        if (node1 == null)
        {
            if (node == null)
            {
                last = null;
                first = null;
            } else
            {
                node.prev = null;
                first = node;
            }
        } else
        if (node == null)
        {
            node1.next = null;
            last = node1;
        } else
        {
            node1.next = node;
            node.prev = node1;
        }
        count = count - 1;
        notFull.signalAll();
    }

    private Object unlinkFirst()
    {
        Node node = first;
        if (node == null)
        {
            return null;
        }
        Node node1 = node.next;
        first = node1;
        if (node1 == null)
        {
            last = null;
        } else
        {
            node1.prev = null;
        }
        count = count - 1;
        notFull.signal();
        return node.item;
    }

    private Object unlinkLast()
    {
        Node node = last;
        if (node == null)
        {
            return null;
        }
        Node node1 = node.prev;
        last = node1;
        if (node1 == null)
        {
            first = null;
        } else
        {
            node1.next = null;
        }
        count = count - 1;
        notFull.signal();
        return node.item;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        lock.lock();
        Node node;
        objectoutputstream.defaultWriteObject();
        node = first;
_L1:
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        objectoutputstream.writeObject(node.item);
        node = node.next;
          goto _L1
        objectoutputstream.writeObject(null);
        lock.unlock();
        return;
        objectoutputstream;
        lock.unlock();
        throw objectoutputstream;
    }

    public boolean add(Object obj)
    {
        addLast(obj);
        return true;
    }

    public void addFirst(Object obj)
    {
        if (!offerFirst(obj))
        {
            throw new IllegalStateException("Deque full");
        } else
        {
            return;
        }
    }

    public void addLast(Object obj)
    {
        if (!offerLast(obj))
        {
            throw new IllegalStateException("Deque full");
        } else
        {
            return;
        }
    }

    public void clear()
    {
        lock.lock();
        last = null;
        first = null;
        count = 0;
        notFull.signalAll();
        lock.unlock();
        return;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        lock.lock();
        Node node = first;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = obj.equals(node.item);
        if (flag)
        {
            lock.unlock();
            return true;
        }
        node = node.next;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return false;
        obj;
        lock.unlock();
        throw obj;
    }

    public Iterator descendingIterator()
    {
        return new DescendingItr();
    }

    public int drainTo(Collection collection)
    {
        if (collection == null)
        {
            throw new NullPointerException();
        }
        if (collection == this)
        {
            throw new IllegalArgumentException();
        }
        lock.lock();
        Node node = first;
_L1:
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        collection.add(node.item);
        node = node.next;
          goto _L1
        int i;
        i = count;
        count = 0;
        last = null;
        first = null;
        notFull.signalAll();
        lock.unlock();
        return i;
        collection;
        lock.unlock();
        throw collection;
    }

    public int drainTo(Collection collection, int i)
    {
        int j;
        if (collection == null)
        {
            throw new NullPointerException();
        }
        if (collection == this)
        {
            throw new IllegalArgumentException();
        }
        lock.lock();
        j = 0;
_L2:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (first == null)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(first.item);
        first.prev = null;
        first = first.next;
        count = count - 1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (first == null)
        {
            last = null;
        }
        notFull.signalAll();
        lock.unlock();
        return j;
        collection;
        lock.unlock();
        throw collection;
    }

    public Object element()
    {
        return getFirst();
    }

    public Object getFirst()
    {
        Object obj = peekFirst();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public Object getLast()
    {
        Object obj = peekLast();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public Iterator iterator()
    {
        return new Itr();
    }

    public boolean offer(Object obj)
    {
        return offerLast(obj);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return offerLast(obj, l, timeunit);
    }

    public boolean offerFirst(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        lock.lock();
        boolean flag = linkFirst(obj);
        lock.unlock();
        return flag;
        obj;
        lock.unlock();
        throw obj;
    }

    public boolean offerFirst(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        l = timeunit.toNanos(l);
        lock.lockInterruptibly();
_L1:
        boolean flag = linkFirst(obj);
        if (flag)
        {
            lock.unlock();
            return true;
        }
        if (l <= 0L)
        {
            lock.unlock();
            return false;
        }
        l = notFull.awaitNanos(l);
          goto _L1
        obj;
        lock.unlock();
        throw obj;
    }

    public boolean offerLast(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        lock.lock();
        boolean flag = linkLast(obj);
        lock.unlock();
        return flag;
        obj;
        lock.unlock();
        throw obj;
    }

    public boolean offerLast(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        l = timeunit.toNanos(l);
        lock.lockInterruptibly();
_L1:
        boolean flag = linkLast(obj);
        if (flag)
        {
            lock.unlock();
            return true;
        }
        if (l <= 0L)
        {
            lock.unlock();
            return false;
        }
        l = notFull.awaitNanos(l);
          goto _L1
        obj;
        lock.unlock();
        throw obj;
    }

    public Object peek()
    {
        return peekFirst();
    }

    public Object peekFirst()
    {
        lock.lock();
        Object obj = first;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        lock.unlock();
        return obj;
_L2:
        obj = first.item;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object peekLast()
    {
        lock.lock();
        Object obj = last;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        lock.unlock();
        return obj;
_L2:
        obj = last.item;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object poll()
    {
        return pollFirst();
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return pollFirst(l, timeunit);
    }

    public Object pollFirst()
    {
        lock.lock();
        Object obj = unlinkFirst();
        lock.unlock();
        return obj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object pollFirst(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        lock.lockInterruptibly();
_L1:
        timeunit = ((TimeUnit) (unlinkFirst()));
        if (timeunit != null)
        {
            lock.unlock();
            return timeunit;
        }
        if (l <= 0L)
        {
            lock.unlock();
            return null;
        }
        l = notEmpty.awaitNanos(l);
          goto _L1
        timeunit;
        lock.unlock();
        throw timeunit;
    }

    public Object pollLast()
    {
        lock.lock();
        Object obj = unlinkLast();
        lock.unlock();
        return obj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object pollLast(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        lock.lockInterruptibly();
_L1:
        timeunit = ((TimeUnit) (unlinkLast()));
        if (timeunit != null)
        {
            lock.unlock();
            return timeunit;
        }
        if (l <= 0L)
        {
            lock.unlock();
            return null;
        }
        l = notEmpty.awaitNanos(l);
          goto _L1
        timeunit;
        lock.unlock();
        throw timeunit;
    }

    public Object pop()
    {
        return removeFirst();
    }

    public void push(Object obj)
    {
        addFirst(obj);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        putLast(obj);
    }

    public void putFirst(Object obj)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        lock.lock();
        for (; !linkFirst(obj); notFull.await()) { }
        break MISSING_BLOCK_LABEL_49;
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return;
    }

    public void putLast(Object obj)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        lock.lock();
        for (; !linkLast(obj); notFull.await()) { }
        break MISSING_BLOCK_LABEL_49;
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return;
    }

    public int remainingCapacity()
    {
        lock.lock();
        int i;
        int j;
        i = capacity;
        j = count;
        lock.unlock();
        return i - j;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object remove()
    {
        return removeFirst();
    }

    public boolean remove(Object obj)
    {
        return removeFirstOccurrence(obj);
    }

    public Object removeFirst()
    {
        Object obj = pollFirst();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean removeFirstOccurrence(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        lock.lock();
        Node node = first;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(node.item))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        unlink(node);
        lock.unlock();
        return true;
        node = node.next;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return false;
        obj;
        lock.unlock();
        throw obj;
    }

    public Object removeLast()
    {
        Object obj = pollLast();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean removeLastOccurrence(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        lock.lock();
        Node node = last;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(node.item))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        unlink(node);
        lock.unlock();
        return true;
        node = node.prev;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return false;
        obj;
        lock.unlock();
        throw obj;
    }

    boolean removeNode(Node node)
    {
        lock.lock();
        Node node1 = first;
_L2:
        if (node1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (node1 != node)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        unlink(node1);
        lock.unlock();
        return true;
        node1 = node1.next;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return false;
        node;
        lock.unlock();
        throw node;
    }

    public int size()
    {
        lock.lock();
        int i = count;
        lock.unlock();
        return i;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object take()
        throws InterruptedException
    {
        return takeFirst();
    }

    public Object takeFirst()
        throws InterruptedException
    {
        lock.lock();
_L1:
        Object obj = unlinkFirst();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        notEmpty.await();
          goto _L1
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return obj;
    }

    public Object takeLast()
        throws InterruptedException
    {
        lock.lock();
_L1:
        Object obj = unlinkLast();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        notEmpty.await();
          goto _L1
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return obj;
    }

    public Object[] toArray()
    {
        lock.lock();
        Node node;
        Object aobj[];
        aobj = new Object[count];
        node = first;
        int i = 0;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[i] = node.item;
        node = node.next;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        lock.unlock();
        return aobj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        Object aobj1[];
        lock.lock();
        aobj1 = aobj;
        if (aobj.length < count)
        {
            aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), count);
        }
        aobj = first;
        int i = 0;
_L2:
        if (aobj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1[i] = ((Node) (aobj)).item;
        aobj = ((Node) (aobj)).next;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        lock.unlock();
        return aobj1;
        aobj;
        lock.unlock();
        throw aobj;
    }

    public String toString()
    {
        lock.lock();
        String s = super.toString();
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }



}
