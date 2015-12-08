// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

private class ancestorDelegate extends AbstractCollection
{
    class WrappedIterator
        implements Iterator
    {

        final Iterator delegateIterator;
        final Collection originalDelegate;
        final AbstractMapBasedMultimap.WrappedCollection this$1;

        Iterator getDelegateIterator()
        {
            validateIterator();
            return delegateIterator;
        }

        public boolean hasNext()
        {
            validateIterator();
            return delegateIterator.hasNext();
        }

        public Object next()
        {
            validateIterator();
            return delegateIterator.next();
        }

        public void remove()
        {
            delegateIterator.remove();
            int _tmp = AbstractMapBasedMultimap.access$210(this$0);
            removeIfEmpty();
        }

        void validateIterator()
        {
            refreshIfEmpty();
            if (_flddelegate != originalDelegate)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        WrappedIterator()
        {
            this$1 = AbstractMapBasedMultimap.WrappedCollection.this;
            super();
            originalDelegate = _flddelegate;
            delegateIterator = AbstractMapBasedMultimap.access$100(this$0, _flddelegate);
        }

        WrappedIterator(Iterator iterator1)
        {
            this$1 = AbstractMapBasedMultimap.WrappedCollection.this;
            super();
            originalDelegate = _flddelegate;
            delegateIterator = iterator1;
        }
    }


    final delegate ancestor;
    final Collection ancestorDelegate;
    Collection _flddelegate;
    final Object key;
    final AbstractMapBasedMultimap this$0;

    public boolean add(Object obj)
    {
        refreshIfEmpty();
        boolean flag = _flddelegate.isEmpty();
        boolean flag1 = _flddelegate.add(obj);
        if (flag1)
        {
            int _tmp = AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (flag)
            {
                addToMap();
            }
        }
        return flag1;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = _flddelegate.addAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = _flddelegate.size();
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, j - i);
                flag = flag1;
                if (i == 0)
                {
                    addToMap();
                    return flag1;
                }
            }
        }
        return flag;
    }

    void addToMap()
    {
        if (ancestor != null)
        {
            ancestor.addToMap();
            return;
        } else
        {
            AbstractMapBasedMultimap.access$000(AbstractMapBasedMultimap.this).put(key, _flddelegate);
            return;
        }
    }

    public void clear()
    {
        int i = size();
        if (i == 0)
        {
            return;
        } else
        {
            _flddelegate.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
            removeIfEmpty();
            return;
        }
    }

    public boolean contains(Object obj)
    {
        refreshIfEmpty();
        return _flddelegate.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        refreshIfEmpty();
        return _flddelegate.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        } else
        {
            refreshIfEmpty();
            return _flddelegate.equals(obj);
        }
    }

    delegate getAncestor()
    {
        return ancestor;
    }

    Collection getDelegate()
    {
        return _flddelegate;
    }

    Object getKey()
    {
        return key;
    }

    public int hashCode()
    {
        refreshIfEmpty();
        return _flddelegate.hashCode();
    }

    public Iterator iterator()
    {
        refreshIfEmpty();
        return new WrappedIterator();
    }

    void refreshIfEmpty()
    {
        if (ancestor != null)
        {
            ancestor.refreshIfEmpty();
            if (ancestor.getDelegate() != ancestorDelegate)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (_flddelegate.isEmpty())
        {
            Collection collection = (Collection)AbstractMapBasedMultimap.access$000(AbstractMapBasedMultimap.this).get(key);
            if (collection != null)
            {
                _flddelegate = collection;
            }
        }
    }

    public boolean remove(Object obj)
    {
        refreshIfEmpty();
        boolean flag = _flddelegate.remove(obj);
        if (flag)
        {
            int _tmp = AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            removeIfEmpty();
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = _flddelegate.removeAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = _flddelegate.size();
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, j - i);
                removeIfEmpty();
                return flag1;
            }
        }
        return flag;
    }

    void removeIfEmpty()
    {
        if (ancestor != null)
        {
            ancestor.removeIfEmpty();
        } else
        if (_flddelegate.isEmpty())
        {
            AbstractMapBasedMultimap.access$000(AbstractMapBasedMultimap.this).remove(key);
            return;
        }
    }

    public boolean retainAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        int i = size();
        boolean flag = _flddelegate.retainAll(collection);
        if (flag)
        {
            int j = _flddelegate.size();
            AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, j - i);
            removeIfEmpty();
        }
        return flag;
    }

    public int size()
    {
        refreshIfEmpty();
        return _flddelegate.size();
    }

    public String toString()
    {
        refreshIfEmpty();
        return _flddelegate.toString();
    }

    WrappedIterator.delegateIterator(Object obj, Collection collection, WrappedIterator.delegateIterator delegateiterator)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super();
        key = obj;
        _flddelegate = collection;
        ancestor = delegateiterator;
        if (delegateiterator == null)
        {
            abstractmapbasedmultimap = null;
        } else
        {
            abstractmapbasedmultimap = delegateiterator.getDelegate();
        }
        ancestorDelegate = AbstractMapBasedMultimap.this;
    }
}
