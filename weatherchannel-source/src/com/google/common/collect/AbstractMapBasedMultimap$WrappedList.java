// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

private class ction extends ction
    implements List
{
    private class WrappedListIterator extends AbstractMapBasedMultimap.WrappedCollection.WrappedIterator
        implements ListIterator
    {

        final AbstractMapBasedMultimap.WrappedList this$1;

        private ListIterator getDelegateListIterator()
        {
            return (ListIterator)getDelegateIterator();
        }

        public void add(Object obj)
        {
            boolean flag = isEmpty();
            getDelegateListIterator().add(obj);
            int _tmp = AbstractMapBasedMultimap.access$208(this$0);
            if (flag)
            {
                addToMap();
            }
        }

        public boolean hasPrevious()
        {
            return getDelegateListIterator().hasPrevious();
        }

        public int nextIndex()
        {
            return getDelegateListIterator().nextIndex();
        }

        public Object previous()
        {
            return getDelegateListIterator().previous();
        }

        public int previousIndex()
        {
            return getDelegateListIterator().previousIndex();
        }

        public void set(Object obj)
        {
            getDelegateListIterator().set(obj);
        }

        WrappedListIterator()
        {
            this$1 = AbstractMapBasedMultimap.WrappedList.this;
            super(AbstractMapBasedMultimap.WrappedList.this);
        }

        public WrappedListIterator(int i)
        {
            this$1 = AbstractMapBasedMultimap.WrappedList.this;
            super(AbstractMapBasedMultimap.WrappedList.this, getListDelegate().listIterator(i));
        }
    }


    final AbstractMapBasedMultimap this$0;

    public void add(int i, Object obj)
    {
        refreshIfEmpty();
        boolean flag = getDelegate().isEmpty();
        getListDelegate().add(i, obj);
        int _tmp = AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
        if (flag)
        {
            addToMap();
        }
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int j = size();
            boolean flag1 = getListDelegate().addAll(i, collection);
            flag = flag1;
            if (flag1)
            {
                i = getDelegate().size();
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, i - j);
                flag = flag1;
                if (j == 0)
                {
                    addToMap();
                    return flag1;
                }
            }
        }
        return flag;
    }

    public Object get(int i)
    {
        refreshIfEmpty();
        return getListDelegate().get(i);
    }

    List getListDelegate()
    {
        return (List)getDelegate();
    }

    public int indexOf(Object obj)
    {
        refreshIfEmpty();
        return getListDelegate().indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        refreshIfEmpty();
        return getListDelegate().lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        refreshIfEmpty();
        return new WrappedListIterator();
    }

    public ListIterator listIterator(int i)
    {
        refreshIfEmpty();
        return new WrappedListIterator(i);
    }

    public Object remove(int i)
    {
        refreshIfEmpty();
        Object obj = getListDelegate().remove(i);
        int _tmp = AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        removeIfEmpty();
        return obj;
    }

    public Object set(int i, Object obj)
    {
        refreshIfEmpty();
        return getListDelegate().set(i, obj);
    }

    public List subList(int i, int j)
    {
        refreshIfEmpty();
        AbstractMapBasedMultimap abstractmapbasedmultimap = AbstractMapBasedMultimap.this;
        Object obj1 = getKey();
        List list = getListDelegate().subList(i, j);
        Object obj;
        if (getAncestor() == null)
        {
            obj = this;
        } else
        {
            obj = getAncestor();
        }
        return AbstractMapBasedMultimap.access$300(abstractmapbasedmultimap, obj1, list, ((ction) (obj)));
    }

    ction(Object obj, List list, ction ction)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, obj, list, ction);
    }
}
