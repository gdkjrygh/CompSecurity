// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, ListMultimap, Maps, Multimap, 
//            Lists, Iterators, Multiset, Sets, 
//            CollectPreconditions, AbstractMapEntry, TransformedListIterator

public class LinkedListMultimap extends AbstractMultimap
    implements ListMultimap, Serializable
{
    private class DistinctKeyIterator
        implements Iterator
    {

        Node current;
        int expectedModCount;
        Node next;
        final Set seenKeys;
        final LinkedListMultimap this$0;

        private void checkForConcurrentModification()
        {
            if (modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        public boolean hasNext()
        {
            checkForConcurrentModification();
            return next != null;
        }

        public Object next()
        {
            checkForConcurrentModification();
            LinkedListMultimap.checkElement(next);
            current = next;
            seenKeys.add(current.key);
            do
            {
                next = next.next;
            } while (next != null && !seenKeys.add(next.key));
            return current.key;
        }

        public void remove()
        {
            checkForConcurrentModification();
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            CollectPreconditions.checkRemove(flag);
            removeAllNodes(current.key);
            current = null;
            expectedModCount = modCount;
        }

        private DistinctKeyIterator()
        {
            this$0 = LinkedListMultimap.this;
            super();
            seenKeys = Sets.newHashSetWithExpectedSize(keySet().size());
            next = head;
            expectedModCount = modCount;
        }

    }

    private static class KeyList
    {

        int count;
        Node head;
        Node tail;

        KeyList(Node node)
        {
            head = node;
            tail = node;
            node.previousSibling = null;
            node.nextSibling = null;
            count = 1;
        }
    }

    private static final class Node extends AbstractMapEntry
    {

        final Object key;
        Node next;
        Node nextSibling;
        Node previous;
        Node previousSibling;
        Object value;

        public Object getKey()
        {
            return key;
        }

        public Object getValue()
        {
            return value;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = value;
            value = obj;
            return obj1;
        }

        Node(Object obj, Object obj1)
        {
            key = obj;
            value = obj1;
        }
    }

    private class NodeIterator
        implements ListIterator
    {

        Node current;
        int expectedModCount;
        Node next;
        int nextIndex;
        Node previous;
        final LinkedListMultimap this$0;

        private void checkForConcurrentModification()
        {
            if (modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        public volatile void add(Object obj)
        {
            add((java.util.Map.Entry)obj);
        }

        public void add(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            checkForConcurrentModification();
            return next != null;
        }

        public boolean hasPrevious()
        {
            checkForConcurrentModification();
            return previous != null;
        }

        public Node next()
        {
            checkForConcurrentModification();
            LinkedListMultimap.checkElement(next);
            Node node = next;
            current = node;
            previous = node;
            next = next.next;
            nextIndex = nextIndex + 1;
            return current;
        }

        public volatile Object next()
        {
            return next();
        }

        public int nextIndex()
        {
            return nextIndex;
        }

        public Node previous()
        {
            checkForConcurrentModification();
            LinkedListMultimap.checkElement(previous);
            Node node = previous;
            current = node;
            next = node;
            previous = previous.previous;
            nextIndex = nextIndex - 1;
            return current;
        }

        public volatile Object previous()
        {
            return previous();
        }

        public int previousIndex()
        {
            return nextIndex - 1;
        }

        public void remove()
        {
            checkForConcurrentModification();
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            CollectPreconditions.checkRemove(flag);
            if (current != next)
            {
                previous = current.previous;
                nextIndex = nextIndex - 1;
            } else
            {
                next = current.next;
            }
            removeNode(current);
            current = null;
            expectedModCount = modCount;
        }

        public volatile void set(Object obj)
        {
            set((java.util.Map.Entry)obj);
        }

        public void set(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        void setValue(Object obj)
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            current.value = obj;
        }

        NodeIterator(int i)
        {
            this$0 = LinkedListMultimap.this;
            super();
            expectedModCount = modCount;
            int j = size();
            Preconditions.checkPositionIndex(i, j);
            if (i >= j / 2)
            {
                previous = tail;
                nextIndex = j;
                for (; i < j; i++)
                {
                    previous();
                }

            } else
            {
                next = head;
                for (; i > 0; i--)
                {
                    next();
                }

            }
            current = null;
        }
    }

    private class ValueForKeyIterator
        implements ListIterator
    {

        Node current;
        final Object key;
        Node next;
        int nextIndex;
        Node previous;
        final LinkedListMultimap this$0;

        public void add(Object obj)
        {
            previous = addNode(key, obj, next);
            nextIndex = nextIndex + 1;
            current = null;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        public boolean hasPrevious()
        {
            return previous != null;
        }

        public Object next()
        {
            LinkedListMultimap.checkElement(next);
            Node node = next;
            current = node;
            previous = node;
            next = next.nextSibling;
            nextIndex = nextIndex + 1;
            return current.value;
        }

        public int nextIndex()
        {
            return nextIndex;
        }

        public Object previous()
        {
            LinkedListMultimap.checkElement(previous);
            Node node = previous;
            current = node;
            next = node;
            previous = previous.previousSibling;
            nextIndex = nextIndex - 1;
            return current.value;
        }

        public int previousIndex()
        {
            return nextIndex - 1;
        }

        public void remove()
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            CollectPreconditions.checkRemove(flag);
            if (current != next)
            {
                previous = current.previousSibling;
                nextIndex = nextIndex - 1;
            } else
            {
                next = current.nextSibling;
            }
            removeNode(current);
            current = null;
        }

        public void set(Object obj)
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            current.value = obj;
        }

        ValueForKeyIterator(Object obj)
        {
            this$0 = LinkedListMultimap.this;
            super();
            key = obj;
            linkedlistmultimap = (KeyList)keyToKeyList.get(obj);
            if (LinkedListMultimap.this == null)
            {
                linkedlistmultimap = null;
            } else
            {
                linkedlistmultimap = head;
            }
            next = LinkedListMultimap.this;
        }

        public ValueForKeyIterator(Object obj, int i)
        {
            this$0 = LinkedListMultimap.this;
            super();
            linkedlistmultimap = (KeyList)keyToKeyList.get(obj);
            int j;
            if (LinkedListMultimap.this == null)
            {
                j = 0;
            } else
            {
                j = count;
            }
            Preconditions.checkPositionIndex(i, j);
            if (i >= j / 2)
            {
                if (LinkedListMultimap.this == null)
                {
                    linkedlistmultimap = null;
                } else
                {
                    linkedlistmultimap = tail;
                }
                previous = LinkedListMultimap.this;
                nextIndex = j;
                for (; i < j; i++)
                {
                    previous();
                }

            } else
            {
                if (LinkedListMultimap.this == null)
                {
                    linkedlistmultimap = null;
                } else
                {
                    linkedlistmultimap = head;
                }
                next = LinkedListMultimap.this;
                for (; i > 0; i--)
                {
                    next();
                }

            }
            key = obj;
            current = null;
        }
    }


    private static final long serialVersionUID = 0L;
    private transient Node head;
    private transient Map keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient Node tail;

    LinkedListMultimap()
    {
        keyToKeyList = Maps.newHashMap();
    }

    private LinkedListMultimap(int i)
    {
        keyToKeyList = new HashMap(i);
    }

    private LinkedListMultimap(Multimap multimap)
    {
        this(multimap.keySet().size());
        putAll(multimap);
    }

    private Node addNode(Object obj, Object obj1, Node node)
    {
        obj1 = new Node(obj, obj1);
        if (head == null)
        {
            tail = ((Node) (obj1));
            head = ((Node) (obj1));
            keyToKeyList.put(obj, new KeyList(((Node) (obj1))));
            modCount = modCount + 1;
        } else
        if (node == null)
        {
            tail.next = ((Node) (obj1));
            obj1.previous = tail;
            tail = ((Node) (obj1));
            node = (KeyList)keyToKeyList.get(obj);
            if (node == null)
            {
                keyToKeyList.put(obj, new KeyList(((Node) (obj1))));
                modCount = modCount + 1;
            } else
            {
                node.count = ((KeyList) (node)).count + 1;
                obj = ((KeyList) (node)).tail;
                obj.nextSibling = ((Node) (obj1));
                obj1.previousSibling = ((Node) (obj));
                node.tail = ((Node) (obj1));
            }
        } else
        {
            KeyList keylist = (KeyList)keyToKeyList.get(obj);
            keylist.count = keylist.count + 1;
            obj1.previous = node.previous;
            obj1.previousSibling = node.previousSibling;
            obj1.next = node;
            obj1.nextSibling = node;
            if (node.previousSibling == null)
            {
                ((KeyList)keyToKeyList.get(obj)).head = ((Node) (obj1));
            } else
            {
                node.previousSibling.nextSibling = ((Node) (obj1));
            }
            if (node.previous == null)
            {
                head = ((Node) (obj1));
            } else
            {
                node.previous.next = ((Node) (obj1));
            }
            node.previous = ((Node) (obj1));
            node.previousSibling = ((Node) (obj1));
        }
        size = size + 1;
        return ((Node) (obj1));
    }

    private static void checkElement(Object obj)
    {
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return;
        }
    }

    public static LinkedListMultimap create()
    {
        return new LinkedListMultimap();
    }

    public static LinkedListMultimap create(int i)
    {
        return new LinkedListMultimap(i);
    }

    public static LinkedListMultimap create(Multimap multimap)
    {
        return new LinkedListMultimap(multimap);
    }

    private List getCopy(Object obj)
    {
        return Collections.unmodifiableList(Lists.newArrayList(new ValueForKeyIterator(obj)));
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        keyToKeyList = Maps.newLinkedHashMap();
        int j = objectinputstream.readInt();
        for (int i = 0; i < j; i++)
        {
            put(objectinputstream.readObject(), objectinputstream.readObject());
        }

    }

    private void removeAllNodes(Object obj)
    {
        Iterators.clear(new ValueForKeyIterator(obj));
    }

    private void removeNode(Node node)
    {
        if (node.previous != null)
        {
            node.previous.next = node.next;
        } else
        {
            head = node.next;
        }
        if (node.next != null)
        {
            node.next.previous = node.previous;
        } else
        {
            tail = node.previous;
        }
        if (node.previousSibling == null && node.nextSibling == null)
        {
            ((KeyList)keyToKeyList.remove(node.key)).count = 0;
            modCount = modCount + 1;
        } else
        {
            KeyList keylist = (KeyList)keyToKeyList.get(node.key);
            keylist.count = keylist.count - 1;
            if (node.previousSibling == null)
            {
                keylist.head = node.nextSibling;
            } else
            {
                node.previousSibling.nextSibling = node.nextSibling;
            }
            if (node.nextSibling == null)
            {
                keylist.tail = node.previousSibling;
            } else
            {
                node.nextSibling.previousSibling = node.previousSibling;
            }
        }
        size = size - 1;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(size());
        java.util.Map.Entry entry;
        for (Iterator iterator = entries().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            objectoutputstream.writeObject(entry.getKey());
        }

    }

    public volatile Map asMap()
    {
        return super.asMap();
    }

    public void clear()
    {
        head = null;
        tail = null;
        keyToKeyList.clear();
        size = 0;
        modCount = modCount + 1;
    }

    public volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public boolean containsKey(Object obj)
    {
        return keyToKeyList.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    Map createAsMap()
    {
        return new Multimaps.AsMap(this);
    }

    volatile Collection createEntries()
    {
        return createEntries();
    }

    List createEntries()
    {
        return new AbstractSequentialList() {

            final LinkedListMultimap this$0;

            public ListIterator listIterator(int i)
            {
                return new NodeIterator(i);
            }

            public int size()
            {
                return LinkedListMultimap.this.size;
            }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
        };
    }

    Set createKeySet()
    {
        return new Sets.ImprovedAbstractSet() {

            final LinkedListMultimap this$0;

            public boolean contains(Object obj)
            {
                return containsKey(obj);
            }

            public Iterator iterator()
            {
                return new DistinctKeyIterator();
            }

            public boolean remove(Object obj)
            {
                return !removeAll(obj).isEmpty();
            }

            public int size()
            {
                return keyToKeyList.size();
            }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
        };
    }

    volatile Collection createValues()
    {
        return createValues();
    }

    List createValues()
    {
        return new AbstractSequentialList() {

            final LinkedListMultimap this$0;

            public ListIterator listIterator(int i)
            {
                NodeIterator nodeiterator = new NodeIterator(i);
                return nodeiterator. new TransformedListIterator(nodeiterator) {

                    final _cls3 this$1;
                    final NodeIterator val$nodeItr;

                    public void set(Object obj)
                    {
                        nodeItr.setValue(obj);
                    }

                    volatile Object transform(Object obj)
                    {
                        return transform((java.util.Map.Entry)obj);
                    }

                    Object transform(java.util.Map.Entry entry)
                    {
                        return entry.getValue();
                    }

            
            {
                this$1 = final__pcls3;
                nodeItr = nodeiterator;
                super(ListIterator.this);
            }
                };
            }

            public int size()
            {
                return LinkedListMultimap.this.size;
            }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
        };
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public List entries()
    {
        return (List)super.entries();
    }

    Iterator entryIterator()
    {
        throw new AssertionError("should never be called");
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(final Object key)
    {
        return new AbstractSequentialList() {

            final LinkedListMultimap this$0;
            final Object val$key;

            public ListIterator listIterator(int i)
            {
                return new ValueForKeyIterator(key, i);
            }

            public int size()
            {
                KeyList keylist = (KeyList)keyToKeyList.get(key);
                if (keylist == null)
                {
                    return 0;
                } else
                {
                    return keylist.count;
                }
            }

            
            {
                this$0 = LinkedListMultimap.this;
                key = obj;
                super();
            }
        };
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public volatile Multiset keys()
    {
        return super.keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        addNode(obj, obj1, null);
        return true;
    }

    public volatile boolean putAll(Multimap multimap)
    {
        return super.putAll(multimap);
    }

    public volatile boolean putAll(Object obj, Iterable iterable)
    {
        return super.putAll(obj, iterable);
    }

    public volatile boolean remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        List list = getCopy(obj);
        removeAllNodes(obj);
        return list;
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        List list = getCopy(obj);
        obj = new ValueForKeyIterator(obj);
        for (iterable = iterable.iterator(); ((ListIterator) (obj)).hasNext() && iterable.hasNext(); ((ListIterator) (obj)).set(iterable.next()))
        {
            ((ListIterator) (obj)).next();
        }

        for (; ((ListIterator) (obj)).hasNext(); ((ListIterator) (obj)).remove())
        {
            ((ListIterator) (obj)).next();
        }

        for (; iterable.hasNext(); ((ListIterator) (obj)).add(iterable.next())) { }
        return list;
    }

    public int size()
    {
        return size;
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public volatile Collection values()
    {
        return values();
    }

    public List values()
    {
        return (List)super.values();
    }









}
