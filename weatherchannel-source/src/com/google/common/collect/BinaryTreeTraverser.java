// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TreeTraverser, FluentIterable, UnmodifiableIterator, AbstractIterator, 
//            PeekingIterator

public abstract class BinaryTreeTraverser extends TreeTraverser
{
    private final class InOrderIterator extends AbstractIterator
    {

        private final BitSet hasExpandedLeft = new BitSet();
        private final Deque stack = new ArrayDeque();
        final BinaryTreeTraverser this$0;

        protected Object computeNext()
        {
            Object obj;
            for (; !stack.isEmpty(); BinaryTreeTraverser.pushIfPresent(stack, leftChild(obj)))
            {
                obj = stack.getLast();
                if (hasExpandedLeft.get(stack.size() - 1))
                {
                    stack.removeLast();
                    hasExpandedLeft.clear(stack.size());
                    BinaryTreeTraverser.pushIfPresent(stack, rightChild(obj));
                    return obj;
                }
                hasExpandedLeft.set(stack.size() - 1);
            }

            return endOfData();
        }

        InOrderIterator(Object obj)
        {
            this$0 = BinaryTreeTraverser.this;
            super();
            stack.addLast(obj);
        }
    }

    private final class PostOrderIterator extends UnmodifiableIterator
    {

        private final BitSet hasExpanded = new BitSet();
        private final Deque stack = new ArrayDeque();
        final BinaryTreeTraverser this$0;

        public boolean hasNext()
        {
            return !stack.isEmpty();
        }

        public Object next()
        {
            do
            {
                Object obj = stack.getLast();
                if (hasExpanded.get(stack.size() - 1))
                {
                    stack.removeLast();
                    hasExpanded.clear(stack.size());
                    return obj;
                }
                hasExpanded.set(stack.size() - 1);
                BinaryTreeTraverser.pushIfPresent(stack, rightChild(obj));
                BinaryTreeTraverser.pushIfPresent(stack, leftChild(obj));
            } while (true);
        }

        PostOrderIterator(Object obj)
        {
            this$0 = BinaryTreeTraverser.this;
            super();
            stack.addLast(obj);
        }
    }

    private final class PreOrderIterator extends UnmodifiableIterator
        implements PeekingIterator
    {

        private final Deque stack = new ArrayDeque();
        final BinaryTreeTraverser this$0;

        public boolean hasNext()
        {
            return !stack.isEmpty();
        }

        public Object next()
        {
            Object obj = stack.removeLast();
            BinaryTreeTraverser.pushIfPresent(stack, rightChild(obj));
            BinaryTreeTraverser.pushIfPresent(stack, leftChild(obj));
            return obj;
        }

        public Object peek()
        {
            return stack.getLast();
        }

        PreOrderIterator(Object obj)
        {
            this$0 = BinaryTreeTraverser.this;
            super();
            stack.addLast(obj);
        }
    }


    public BinaryTreeTraverser()
    {
    }

    private static void pushIfPresent(Deque deque, Optional optional)
    {
        if (optional.isPresent())
        {
            deque.addLast(optional.get());
        }
    }

    public final Iterable children(final Object root)
    {
        Preconditions.checkNotNull(root);
        return new FluentIterable() {

            final BinaryTreeTraverser this$0;
            final Object val$root;

            public Iterator iterator()
            {
                return new AbstractIterator() {

                    boolean doneLeft;
                    boolean doneRight;
                    final _cls1 this$1;

                    protected Object computeNext()
                    {
                        if (!doneLeft)
                        {
                            doneLeft = true;
                            Optional optional = leftChild(root);
                            if (optional.isPresent())
                            {
                                return optional.get();
                            }
                        }
                        if (!doneRight)
                        {
                            doneRight = true;
                            Optional optional1 = rightChild(root);
                            if (optional1.isPresent())
                            {
                                return optional1.get();
                            }
                        }
                        return endOfData();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
            }

            
            {
                this$0 = BinaryTreeTraverser.this;
                root = obj;
                super();
            }
        };
    }

    public final FluentIterable inOrderTraversal(final Object root)
    {
        Preconditions.checkNotNull(root);
        return new FluentIterable() {

            final BinaryTreeTraverser this$0;
            final Object val$root;

            public UnmodifiableIterator iterator()
            {
                return new InOrderIterator(root);
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            
            {
                this$0 = BinaryTreeTraverser.this;
                root = obj;
                super();
            }
        };
    }

    public abstract Optional leftChild(Object obj);

    UnmodifiableIterator postOrderIterator(Object obj)
    {
        return new PostOrderIterator(obj);
    }

    UnmodifiableIterator preOrderIterator(Object obj)
    {
        return new PreOrderIterator(obj);
    }

    public abstract Optional rightChild(Object obj);

}
