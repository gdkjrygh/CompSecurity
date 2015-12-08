// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, UnmodifiableIterator, PeekingIterator, Iterables, 
//            AbstractIterator, Iterators

public abstract class TreeTraverser
{
    private final class BreadthFirstIterator extends UnmodifiableIterator
        implements PeekingIterator
    {

        private final Queue queue = new ArrayDeque();
        final TreeTraverser this$0;

        public boolean hasNext()
        {
            return !queue.isEmpty();
        }

        public Object next()
        {
            Object obj = queue.remove();
            Iterables.addAll(queue, children(obj));
            return obj;
        }

        public Object peek()
        {
            return queue.element();
        }

        BreadthFirstIterator(Object obj)
        {
            this$0 = TreeTraverser.this;
            super();
            queue.add(obj);
        }
    }

    private final class PostOrderIterator extends AbstractIterator
    {

        private final ArrayDeque stack = new ArrayDeque();
        final TreeTraverser this$0;

        private PostOrderNode expand(Object obj)
        {
            return new PostOrderNode(obj, children(obj).iterator());
        }

        protected Object computeNext()
        {
            while (!stack.isEmpty()) 
            {
                Object obj = (PostOrderNode)stack.getLast();
                if (((PostOrderNode) (obj)).childIterator.hasNext())
                {
                    obj = ((PostOrderNode) (obj)).childIterator.next();
                    stack.addLast(expand(obj));
                } else
                {
                    stack.removeLast();
                    return ((PostOrderNode) (obj)).root;
                }
            }
            return endOfData();
        }

        PostOrderIterator(Object obj)
        {
            this$0 = TreeTraverser.this;
            super();
            stack.addLast(expand(obj));
        }
    }

    private static final class PostOrderNode
    {

        final Iterator childIterator;
        final Object root;

        PostOrderNode(Object obj, Iterator iterator)
        {
            root = Preconditions.checkNotNull(obj);
            childIterator = (Iterator)Preconditions.checkNotNull(iterator);
        }
    }

    private final class PreOrderIterator extends UnmodifiableIterator
    {

        private final Deque stack = new ArrayDeque();
        final TreeTraverser this$0;

        public boolean hasNext()
        {
            return !stack.isEmpty();
        }

        public Object next()
        {
            Iterator iterator = (Iterator)stack.getLast();
            Object obj = Preconditions.checkNotNull(iterator.next());
            if (!iterator.hasNext())
            {
                stack.removeLast();
            }
            iterator = children(obj).iterator();
            if (iterator.hasNext())
            {
                stack.addLast(iterator);
            }
            return obj;
        }

        PreOrderIterator(Object obj)
        {
            this$0 = TreeTraverser.this;
            super();
            stack.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(obj)));
        }
    }


    public TreeTraverser()
    {
    }

    public final FluentIterable breadthFirstTraversal(final Object root)
    {
        Preconditions.checkNotNull(root);
        return new FluentIterable() {

            final TreeTraverser this$0;
            final Object val$root;

            public UnmodifiableIterator iterator()
            {
                return new BreadthFirstIterator(root);
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            
            {
                this$0 = TreeTraverser.this;
                root = obj;
                super();
            }
        };
    }

    public abstract Iterable children(Object obj);

    UnmodifiableIterator postOrderIterator(Object obj)
    {
        return new PostOrderIterator(obj);
    }

    public final FluentIterable postOrderTraversal(final Object root)
    {
        Preconditions.checkNotNull(root);
        return new FluentIterable() {

            final TreeTraverser this$0;
            final Object val$root;

            public UnmodifiableIterator iterator()
            {
                return postOrderIterator(root);
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            
            {
                this$0 = TreeTraverser.this;
                root = obj;
                super();
            }
        };
    }

    UnmodifiableIterator preOrderIterator(Object obj)
    {
        return new PreOrderIterator(obj);
    }

    public final FluentIterable preOrderTraversal(final Object root)
    {
        Preconditions.checkNotNull(root);
        return new FluentIterable() {

            final TreeTraverser this$0;
            final Object val$root;

            public UnmodifiableIterator iterator()
            {
                return preOrderIterator(root);
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            
            {
                this$0 = TreeTraverser.this;
                root = obj;
                super();
            }
        };
    }
}
