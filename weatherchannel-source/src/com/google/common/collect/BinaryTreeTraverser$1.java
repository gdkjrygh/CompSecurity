// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, BinaryTreeTraverser, AbstractIterator

class val.root extends FluentIterable
{

    final BinaryTreeTraverser this$0;
    final Object val$root;

    public Iterator iterator()
    {
        return new AbstractIterator() {

            boolean doneLeft;
            boolean doneRight;
            final BinaryTreeTraverser._cls1 this$1;

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
                this$1 = BinaryTreeTraverser._cls1.this;
                super();
            }
        };
    }

    >()
    {
        this$0 = final_binarytreetraverser;
        val$root = Object.this;
        super();
    }
}
