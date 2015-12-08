// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, BinaryTreeTraverser, FluentIterable

class this._cls1 extends AbstractIterator
{

    boolean doneLeft;
    boolean doneRight;
    final endOfData this$1;

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

    l.root()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/BinaryTreeTraverser$1

/* anonymous class */
    class BinaryTreeTraverser._cls1 extends FluentIterable
    {

        final BinaryTreeTraverser this$0;
        final Object val$root;

        public Iterator iterator()
        {
            return new BinaryTreeTraverser._cls1._cls1();
        }

            
            {
                this$0 = final_binarytreetraverser;
                root = Object.this;
                super();
            }
    }

}
